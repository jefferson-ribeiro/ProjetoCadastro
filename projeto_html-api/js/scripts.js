/*!
* Start Bootstrap - Resume v7.0.5 (https://startbootstrap.com/theme/resume)
* Copyright 2013-2022 Start Bootstrap
* Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-resume/blob/master/LICENSE)
*/
//
// Scripts
// 

window.addEventListener('DOMContentLoaded', event => {

  // Activate Bootstrap scrollspy on the main nav element
  const sideNav = document.body.querySelector('#sideNav');
  if (sideNav) {
    new bootstrap.ScrollSpy(document.body, {
      target: '#sideNav',
      offset: 74,
    });
  };

  // Collapse responsive navbar when toggler is visible
  const navbarToggler = document.body.querySelector('.navbar-toggler');
  const responsiveNavItems = [].slice.call(
    document.querySelectorAll('#navbarResponsive .nav-link')
  );
  responsiveNavItems.map(function (responsiveNavItem) {
    responsiveNavItem.addEventListener('click', () => {
      if (window.getComputedStyle(navbarToggler).display !== 'none') {
        navbarToggler.click();
      }
    });
  });

});

 // Implementações projeto cadastro
 
async function BuscarClientes() {
  let url = 'http://localhost:8080/clientes'
  try {
    let res = await fetch(url)
    let clientes = await res.json()

    let html = ''
    for (var i = 0; i < clientes.length; i++) {
      let cliente = clientes[i]
      html += `
                  <tr>
                    <th scope="row">${cliente.codigoCliente}</th>
                    <td>${cliente.nomeCliente}</td>
                    <td>${cliente.telefoneCliente}</td>
                    <td>${cliente.cpfCliente}</td>
                    <td>${cliente.emailCliente}</td>
                  </tr>
                `
    }
    document.getElementById('listaCliente').innerHTML = html
  } catch (error) {
    console.log(error)
  }
}
BuscarClientes()

function fazPost(url, body) {
  console.log("Body=", body)
  let request = new XMLHttpRequest()
  request.open("POST", url, true)
  request.setRequestHeader("Content-type", "application/json")
  request.send(JSON.stringify(body))

  request.onload = function () {
    console.log(this.responseText)
  }

  return request.responseText
}


function cadastraCliente() {
  event.preventDefault()
  let url = 'http://localhost:8080/cliente'
  let nome = document.getElementById("clienteNome").value
  let telefone = document.getElementById("clienteTelefone").value
  let cpf = document.getElementById("clienteCpf").value
  let email = document.getElementById("clienteEmail").value
  console.log(nome)
  console.log(email)

  body = {
    "nomeCliente": nome,
    "telefoneCliente": telefone,
    "cpfCliente": cpf,
    "emailCliente": email
  }

  fazPost(url, body)
}

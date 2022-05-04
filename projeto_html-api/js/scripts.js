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

 //Captura os dados do body
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

 //Cliente
 // Listar Clientes
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

//função para limpar os campos após o cadastro
function limparCliente(){
  document.getElementById("clienteNome").value = " "
  document.getElementById("clienteTelefone").value = " "
  document.getElementById("clienteCpf").value = " "
  document.getElementById("clienteEmail").value = " "
}

//Cadastro Cliente
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
  limparCliente()
}

//Funcionários

//função para limpar os campos após o cadastro
function limparFuncionario(){
  document.getElementById("funcionarioNome").value  = " "
  document.getElementById("funcionarioNascimento").value  = " "
  document.getElementById("funcionarioEndereço").value = " "
}

//Cadastro Funcionário
function cadastraFuncionario() {
  event.preventDefault()
  let url = 'http://localhost:8080/funcionario'
  let nome = document.getElementById("funcionarioNome").value
  let nascimento = document.getElementById("funcionarioNascimento").value
  let end = document.getElementById("funcionarioEndereço").value
  

  body = {
    "nomeFuncionario": nome,
    "nascFuncionario": nascimento,
    "endFuncionario": end, 
  }

  fazPost(url, body)
  limparFuncionario()
}

//Listar Funcionários
async function BuscarFuncionarios() {
  let url = 'http://localhost:8080/funcionarios'
  try {
    let res = await fetch(url)
    let funcionarios = await res.json()

    let html = ''
    for (var i = 0; i < funcionarios.length; i++) {
      let funcionario = funcionarios[i]
      html += `
                  <tr>
                    <th scope="row">${funcionario.codigoFuncionario}</th>
                    <td>${funcionario.nomeFuncionario}</td>
                    <td>${funcionario.nascFuncionario}</td>
                    <td>${funcionario.endFuncionario}</td>
                  </tr>
                `
    }
    document.getElementById('listaFuncionario').innerHTML = html
  } catch (error) {
    console.log(error)
  }
}
BuscarFuncionarios()

//Produto

//função para limpar os campos após o cadastro
function limparProduto(){
  document.getElementById("produtoNome").value = ""
  document.getElementById("produtoDescricao").value = ""
  document.getElementById("produtoValor").value = ""
}

//Cadastro Produto
function cadastraProduto() {
  event.preventDefault()
  let url = 'http://localhost:8080/produto'
  let produto = document.getElementById("produtoNome").value
  let descricao = document.getElementById("produtoDescricao").value
  let valor = document.getElementById("produtoValor").value
  

  body = {
    "nomeProduto": produto,
    "descricaoProduto": descricao,
    "valorProduto": valor, 
  }

  fazPost(url, body)
  limparProduto()
}

//Listar Produtos
async function BuscarProdutos() {
  let url = 'http://localhost:8080/produtos'
  try {
    let res = await fetch(url)
    let produtos = await res.json()

    let html = ''
    for (var i = 0; i < produtos.length; i++) {
      let produto = produtos[i]
      html += `
                  <tr>
                    <th scope="row">${produto.codigoProduto}</th>
                    <td>${produto.nomeProduto}</td>
                    <td>${produto.descricaoProduto}</td>
                    <td>${produto.valorProduto}</td>
                  </tr>
                `
    }
    document.getElementById('listaProduto').innerHTML = html
  } catch (error) {
    console.log(error)
  }
}
BuscarProdutos()

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
                    <td><button type="button" class="btn btn-warning">Editar</button>
                    <button type="button" class="btn btn-danger">Excluir</button></td>
                  </tr>
                `
    }
    document.getElementById('listaClientes').innerHTML = html
  } catch (error) {
    console.log(error)
  }
}

//função para limpar os campos após o cadastro
function limparCliente() {
  document.getElementById("clienteNome").value = " "
  document.getElementById("clienteTelefone").value = " "
  document.getElementById("clienteCpf").value = " "
  document.getElementById("clienteEmail").value = " "
}

//Cadastro Cliente # NOVA
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

  fetch(url, {
    method: 'POST',
    body: JSON.stringify(body),
    headers: {
      "Content-Type": "application/json; charset=UTF-8"
    }
  })
    .then(function (response) {
      return response.json()
    })
    .then(function (data) {
      console.log(data)
    })
  limparCliente()
}

//Funcionários

//função para limpar os campos após o cadastro
function limparFuncionario() {
  document.getElementById("funcionarioNome").value = " "
  document.getElementById("funcionarioNascimento").value = " "
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

  fetch(url, {
    method: 'POST',
    body: JSON.stringify(body),
    headers: {
      "Content-Type": "application/json; charset=UTF-8"
    }
  })
    .then(function (response) {
      return response.json()
    })
    .then(function (data) {
      console.log(data)
    })
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
    document.getElementById('listaFuncionarios').innerHTML = html
  } catch (error) {
    console.log(error)
  }
}

//Produto

//função para limpar os campos após o cadastro
function limparProduto() {
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

  fetch(url, {
    method: 'POST',
    body: JSON.stringify(body),
    headers: {
      "Content-Type": "application/json; charset=UTF-8"
    }
  })
    .then(function (response) {
      return response.json()
    })
    .then(function (data) {
      console.log(data)
    })
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
    document.getElementById('listaProdutos').innerHTML = html
  } catch (error) {
    console.log(error)
  }
}

//Pedido

//função para limpar os campos após o cadastro
function limparPedido() {
  document.getElementById("pedidoCliente").value = ""
  document.getElementById("pedidoFuncionario").value = ""
  document.getElementById("pedidoProduto").value = ""
  document.getElementById("pedidoQtdProduto").value = ""
}

//Cadastro Pedido
function cadastraPedido() {
  event.preventDefault()
  let url = 'http://localhost:8080/pedido'
  let pedidoCliente = JSON.parse(document.getElementById("pedidoCliente").value)
  let pedidoFuncionario = JSON.parse(document.getElementById("pedidoFuncionario").value)
  let pedidoProduto = JSON.parse(document.getElementById("pedidoProduto").value)
  let pedidoQtdProduto = document.getElementById("pedidoQtdProduto").value
  let valorTotalProduto = pedidoProduto.valorProduto * pedidoQtdProduto


  body = {
    "cliente": pedidoCliente,
    "funcionario": pedidoFuncionario,
    "produto": pedidoProduto,
    "quantidade": pedidoQtdProduto,
    "valorTotal": valorTotalProduto
  }

  fetch(url, {
    method: 'POST',
    body: JSON.stringify(body),
    headers: {
      "Content-Type": "application/json; charset=UTF-8"
    }
  })
    .then(function (response) {
      return response.json()
    })
    .then(function (data) {
      console.log(data)
    })
  limparPedido()
}

//Select de clientes para cadastrar pedido
async function SelectClientes() {
  let url = 'http://localhost:8080/clientes'
  try {
    let res = await fetch(url)
    let clientes = await res.json()

    let html = '<option disabled selected value>Selecione o Cliente</option>'
    for (var i = 0; i < clientes.length; i++) {
      let cliente = clientes[i]
      html += `
                <option value='${JSON.stringify(cliente)}'>${cliente.nomeCliente}</option>
                `
    }
    document.getElementById('pedidoCliente').innerHTML = html
  } catch (error) {
    console.log(error)
  }
}
SelectClientes()

//Select de funcionários para cadastrar pedido
async function SelectFuncionarios() {
  let url = 'http://localhost:8080/funcionarios'
  try {
    let res = await fetch(url)
    let funcionarios = await res.json()

    let html = '<option disabled selected value>Selecione o Funcionário</option>'
    for (var i = 0; i < funcionarios.length; i++) {
      let funcionario = funcionarios[i]
      html += `
               <option value='${JSON.stringify(funcionario)}'>${funcionario.nomeFuncionario}</option>
                `
    }
    document.getElementById('pedidoFuncionario').innerHTML = html
  } catch (error) {
    console.log(error)
  }
}
SelectFuncionarios()

//Select de produtos para cadastrar pedido
async function SelectProdutos() {
  let url = 'http://localhost:8080/produtos'
  try {
    let res = await fetch(url)
    let produtos = await res.json()

    let html = '<option disabled selected value>Selecione o Produto</option>'
    for (var i = 0; i < produtos.length; i++) {
      let produto = produtos[i]
      html += `
            <option value='${JSON.stringify(produto)}'>${produto.nomeProduto}</option>
                `
    }
    document.getElementById('pedidoProduto').innerHTML = html
  } catch (error) {
    console.log(error)
  }
}
SelectProdutos()




//Listar Pedidos
async function BuscarPedidos() {
  let url = 'http://localhost:8080/pedidos'
  try {
    let res = await fetch(url)
    let pedidos = await res.json()

    let html = ''
    for (var i = 0; i < pedidos.length; i++) {
      let pedido = pedidos[i]
      html += `
                  <tr>
                    <th scope="row">${pedido.codigoPedido}</th>
                    <td>${pedido.cliente.nomeCliente}</td>
                    <td>${pedido.funcionario.nomeFuncionario}</td>
                    <td>${pedido.produto.nomeProduto}</td>
                    <td>${pedido.produto.valorProduto}</td>
                    <td>${pedido.quantidade}</td>
                    <td>${pedido.valorTotal}</td>
                  </tr>
                `
    }
    document.getElementById('listaPedidos').innerHTML = html
  } catch (error) {
    console.log(error)
  }
}


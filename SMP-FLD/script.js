function mostraAlert(){
    alert("Clicou na imagem");
}

function recuperarDados(){
    fetch("http://localhost:8055/hello")
        .then(res => res.json())
        .then(res => {
            document.getElementById("message").innerHTML = `
            Produto : ${res.id}<br>
            Descricao: ${res.descricao}<br>
            Preço: ${res.preco}
            <br>`
        })
        .catch(err => alert("Erro ao recuperar dados"))
}
const formulario = document.querySelector("form");

const iEmail = document.querySelector(".email");
const iAssunto = document.querySelector(".assunto");
const iCorpo = document.querySelector(".corpo");



 
function cadastrar(){
    fetch("http://localhost:8080/email",{ //URL da api
      headers:{
            "Accept": "application/json",
            "Content-Type": "application/json"
      },
      method: "POST",
      body: JSON.stringify({
        //name, description e status devem estar iguais aos campos do banco de dados
        to: iEmail.value,
        subject: iAssunto.value,
        body: iCorpo.value

        
        
      })
      


    })
    .then(function (res) {console.log(res)})
    .catch(function (res) {console.log(res)})
    
};

//criando função de limpar após cadastrar 
function limpar(){
    iEmail.value = "";
    iAssunto.value = "";
    iCorpo.value = "";
};

//cliando o evento de click do botao
formulario.addEventListener('submit', function(event) {
    
    

    event.preventDefault();

    cadastrar();
    limpar();
})
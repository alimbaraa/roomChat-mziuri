function openPopup(){
    let popup = document.getElementById("popup");
    popup.classList.add("open-popup");
}

function submitPopup(){
    let popup = document.getElementById("popup");
    popup.classList.remove("open-popup");
    var text = document.getElementById("chatName");
    text.value = "";
}
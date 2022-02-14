document.addEventListener("DOMContentLoaded", function () {
    document.forms["contact-form"].addEventListener("submit", postData);
});

function postData(formsubmission) {
    let bookId = encodeURIComponent(document.getElementById("bookId").value)
    let bookName = encodeURIComponent(document.getElementById("bookName").value)
    let author = encodeURIComponent(document.getElementById("author").value)

    if (bookId === "" || bookName === "" || author === "") {
        document.getElementById("response").innerHTML = "<div class='alert alert-danger' role='alert'>Please enter your details!</div>";
    }

    let params = "bookId = " + bookId + "&bookName = " + bookName + "&author = " + author;

    let http = new XMLHttpRequest();
    http.open("POST", "saveBook", true);

    http.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    http.setRequestHeader("Content-length", params.length);
    http.setRequestHeader("Connection", "close");

    http.onreadystatechange = function () {
        if (http.readyState === 4 && http.status === 200) {
            document.getElementById("response").innerHTML = http.responseText;
        }
    }

    http.send(params);
    formsubmission.preventDefault();
}
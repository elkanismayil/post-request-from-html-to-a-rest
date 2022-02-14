$(document).ready(
    function () {
        // submit form
        $("#bookForm").submit(function (event) {
            // Prevent the form from submitting via the browser
            event.preventDefault();
            ajaxPost();
        });

        function ajaxPost() {
            // Prepare form data
            let formData = {
                bookId: $("#bookId").val(),
                bookName: $("#bookName").val(),
                author: $("#author").val()
            }

            // do post
            $.ajax({
                type: "POST",
                contentType: "application/json",
                url: "saveBook",
                data: JSON.stringify(formData),
                dataType: 'json',
                success: function (result) {
                    if (result.status === "success") {
                        $("#postResultDiv").html(
                            "" + result.data.bookName
                            + " <div class='alert alert-success' role='alert'>Post successfully!!</div> <br>"
                            + " <div class='alert alert-secondary' role='alert'>---> Congrats!!!</div>"
                            + "</p>"
                        )
                    } else {
                        $("#postResultDiv").html("<strong>Error</strong>")
                    }
                    console.log(result)
                },
                error: function (e) {
                    alert("Error!")
                    console.log("ERROR : ", e)
                }
            });
        }
    })
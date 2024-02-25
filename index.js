var list = [];
$(document).ready(() => {
    jQuery.get('/data.json', function (data) {
        list = data;
        let str = '';
        data.forEach((d, index) => {
            str += `<tr>
            <td width="10" style="text-align:center">${index + 1}</td>
            <td>${d.title}</td>
                    <td width="350" style="text-align: center;">
                        <button type="button" class="btn btn-link" onclick="showModal('${d.id}')">Source</button>
                    </td>
            </tr>`;
        });

        $("#tableBody").html(str);
    });
});

function showModal(id) {

    const d = list.find((i) => i.id == id);

    $("#modalTitle").text(d.title);

    jQuery.get('/java/' + d.file, function (data) {
        // var lines = data.split("\n");

        $("#preParent").html('<pre id="preContent" class="prettyprint lang-java"></pre>');

        $("#preContent").text(data);
        prettyPrint();

        $("#output").text(d.output);
        $('#myModal').modal('show');
    });
}

// window.onload = function () {
//     prettyPrint();
// };
/**
 * Created by clin on 2017/9/3.
 */
$(function () {
    $.ajax({
        url:'getTest',
        dataType:'json',
        type:'get',
        success:function (res) {
            console.log(res);
            show(res);
        },
        error: function(err) {
            alert('获取数据出错，错误为：' + err);
        }
    })
})

function show(data) {
    var name = data['hi'];

    console.log(name);
    $('#test').html(name);
}

'use strict';

$(document).ready(function(){
    //�{�^�����������ꂽ�ꍇ�̃T�u�~�b�g�������`
    $('#btn1').on('click', function(){
        $('#form1').attr('action', '/method2');
        $('#form1').submit();
    });
    $('#btn2').on('click', function(){
        $('#form2').attr('action', '/method2');
        $('#form2').submit();
    });
        $('#btn3').on('click', function(){
            $('#form3').attr('action', '/method3');
            $('#form3').submit();
        });
});

//�{�^���������ꂽ�^�C�~���O�ŃT�u�~�b�g����
function testClick(btc){
    btn.form.submit();
}
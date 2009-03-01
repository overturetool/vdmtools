package jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI;


/**
* jp/co/csk/vdm/toolbox/api/corba/ToolboxAPI/Error.java .
* IDL-to-Java �R���p�C�� (�|�[�^�u��), �o�[�W���� "3.1" �Ő���
* ������: corba_api.idl
* 2008�N4��21�� 15��58��02�b JST
*/

public final class Error implements org.omg.CORBA.portable.IDLEntity
{
  public String fname = null;
  public short line = (short)0;
  public short col = (short)0;
  public String msg = null;

  public Error ()
  {
  } // ctor

  public Error (String _fname, short _line, short _col, String _msg)
  {
    fname = _fname;
    line = _line;
    col = _col;
    msg = _msg;
  } // ctor

} // class Error

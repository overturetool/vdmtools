package jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI;


/**
* jp/co/csk/vdm/toolbox/api/corba/ToolboxAPI/APIError.java .
* IDL-to-Java �R���p�C�� (�|�[�^�u��), �o�[�W���� "3.1" �Ő���
* ������: metaiv_idl.idl
* 2008�N4��21�� 15��58��00�b JST
*/

public final class APIError extends org.omg.CORBA.UserException
{
  public String msg = null;

  public APIError ()
  {
    super(APIErrorHelper.id());
  } // ctor

  public APIError (String _msg)
  {
    super(APIErrorHelper.id());
    msg = _msg;
  } // ctor


  public APIError (String $reason, String _msg)
  {
    super(APIErrorHelper.id() + "  " + $reason);
    msg = _msg;
  } // ctor

} // class APIError

package jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI;


/**
* jp/co/csk/vdm/toolbox/api/corba/ToolboxAPI/ToolType.java .
* IDL-to-Java �R���p�C�� (�|�[�^�u��), �o�[�W���� "3.1" �Ő���
* ������: corba_api.idl
* 2008�N4��21�� 15��58��02�b JST
*/

public class ToolType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.ToolType[] __array = new jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.ToolType [__size];

  public static final int _SL_TOOLBOX = 0;
  public static final jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.ToolType SL_TOOLBOX = new jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.ToolType(_SL_TOOLBOX);
  public static final int _PP_TOOLBOX = 1;
  public static final jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.ToolType PP_TOOLBOX = new jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.ToolType(_PP_TOOLBOX);

  public int value ()
  {
    return __value;
  }

  public static jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.ToolType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ToolType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ToolType

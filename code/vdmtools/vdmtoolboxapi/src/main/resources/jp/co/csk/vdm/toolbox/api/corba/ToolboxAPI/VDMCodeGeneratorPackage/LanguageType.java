package jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMCodeGeneratorPackage;


/**
* jp/co/csk/vdm/toolbox/api/corba/ToolboxAPI/VDMCodeGeneratorPackage/LanguageType.java .
* IDL-to-Java �R���p�C�� (�|�[�^�u��), �o�[�W���� "3.1" �Ő���
* ������: corba_api.idl
* 2008�N4��21�� 15��58��02�b JST
*/


// Default value = false;
public class LanguageType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMCodeGeneratorPackage.LanguageType[] __array = new jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMCodeGeneratorPackage.LanguageType [__size];

  public static final int _CPP = 0;
  public static final jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMCodeGeneratorPackage.LanguageType CPP = new jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMCodeGeneratorPackage.LanguageType(_CPP);
  public static final int _JAVA = 1;
  public static final jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMCodeGeneratorPackage.LanguageType JAVA = new jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMCodeGeneratorPackage.LanguageType(_JAVA);

  public int value ()
  {
    return __value;
  }

  public static jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMCodeGeneratorPackage.LanguageType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected LanguageType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class LanguageType

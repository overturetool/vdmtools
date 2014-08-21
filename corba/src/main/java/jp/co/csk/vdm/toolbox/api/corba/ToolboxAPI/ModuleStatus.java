package jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI;


/**
* jp/co/csk/vdm/toolbox/api/corba/ToolboxAPI/ModuleStatus.java .
* IDL-to-Java �R���p�C�� (�|�[�^�u��), �o�[�W���� "3.1" �Ő���
* ������: corba_api.idl
* 2009�N3��16�� 10��22��53�b JST
*/

public final class ModuleStatus implements org.omg.CORBA.portable.IDLEntity
{

  // The status of a module is represented by the following four fields:
  public boolean SyntaxChecked = false;
  public boolean TypeChecked = false;
  public boolean CodeGenerated = false;
  public boolean PrettyPrinted = false;

  public ModuleStatus ()
  {
  } // ctor

  public ModuleStatus (boolean _SyntaxChecked, boolean _TypeChecked, boolean _CodeGenerated, boolean _PrettyPrinted)
  {
    SyntaxChecked = _SyntaxChecked;
    TypeChecked = _TypeChecked;
    CodeGenerated = _CodeGenerated;
    PrettyPrinted = _PrettyPrinted;
  } // ctor

} // class ModuleStatus

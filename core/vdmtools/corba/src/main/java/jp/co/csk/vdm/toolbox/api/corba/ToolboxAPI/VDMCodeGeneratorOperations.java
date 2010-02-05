package jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI;


/**
* jp/co/csk/vdm/toolbox/api/corba/ToolboxAPI/VDMCodeGeneratorOperations.java .
* IDL-to-Java �R���p�C�� (�|�[�^�u��), �o�[�W���� "3.1" �Ő���
* ������: corba_api.idl
* 2009�N3��16�� 10��22��53�b JST
*/

public interface VDMCodeGeneratorOperations 
{
  boolean GeneratePosInfo ();
  void GeneratePosInfo (boolean newGeneratePosInfo);

  // VDM++ Toolbox
  boolean GenerateCode (String name, jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMCodeGeneratorPackage.LanguageType targetLang) throws jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.APIError;
  boolean GenerateCodeList (String[] names, jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.VDMCodeGeneratorPackage.LanguageType targetLang) throws jp.co.csk.vdm.toolbox.api.corba.ToolboxAPI.APIError;
} // interface VDMCodeGeneratorOperations

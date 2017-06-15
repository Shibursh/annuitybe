package com.axa.annuityinfo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "ANNUITY_INFO")
@JsonInclude(Include.NON_NULL)
public class AnnuityInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	public AnnuityInfo() {
		super();
	}

	public AnnuityInfo(String policyNo, String nenkinShoshoNo, String keiyakuStatus) {
		super();
		this.policyNo = policyNo;
		this.nenkinShoshoNo = nenkinShoshoNo;
		this.keiyakuStatus = keiyakuStatus;
	}

	public AnnuityInfo(String policyNo, String nenkinShoshoNo, String holderName, String holderKname,
			String annuitantName, String annuitantKname, String keiyakuStatus) {
		super();
		this.policyNo = policyNo;
		this.nenkinShoshoNo = nenkinShoshoNo;
		this.holderName = holderName;
		this.holderKname = holderKname;
		this.annuitantName = annuitantName;
		this.annuitantKname = annuitantKname;
		this.keiyakuStatus = keiyakuStatus;
	}

	// @Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	// @Column(name = "ID", nullable = false)
	// private Long Id;

	@Id
	@Column(name = "POLICY_NO")
	private String policyNo;

	@Column(name = "NENKIN_SHOSHO_NO")
	private String nenkinShoshoNo;

	@Column(name = "HOLDER_NAME")
	private String holderName;

	@Column(name = "HOLDER_KNAME")
	private String holderKname;

	@Column(name = "HOLDER_SEX")
	private String holderSex;

	@Column(name = "HOLDER_BIRTHDAY")
	private Date holderBirthday;

	@Column(name = "HOLDER_ZIP_CODE")
	private String holderZipCode;

	@Column(name = "HOLDER_ADDRESS1")
	private String holderAddress1;

	@Column(name = "HOLDER_ADDRESS2")
	private String holderAddress2;

	@Column(name = "HOLDER_ADDRESS3")
	private String holderAddress3;

	@Column(name = "HOLDER_ADDRESS4")
	private String holderAddress4;

	@Column(name = "HOLDER_TEL")
	private String holderTel;

	@Column(name = "HOLDER_OR_CORP_KBN")
	private String holderOrCorpKbn;

	@Column(name = "HOLDER_ANOTHER_ZIP_CODE")
	private String holderAnotherZipCode;

	@Column(name = "HOLDER_ANOTHER_TEL")
	private String holderAnotherTel;

	@Column(name = "HOLDER_ANOTHER_ADDRESS1")
	private String holderAnotherAddress1;

	@Column(name = "HOLDER_ANOTHER_ADDRESS2")
	private String holderAnotherAddress2;

	@Column(name = "HOLDER_ANOTHER_ADDRESS3")
	private String holderAnotherAddress3;

	@Column(name = "HOLDER_ANOTHER_ADDRESS4")
	private String holderAnotherAddress4;

	@Column(name = "INSURED_NAME")
	private String insuredName;

	@Column(name = "INSURED_KNAME")
	private String insuredKname;

	@Column(name = "INSURED_SEX")
	private String insuredSex;

	@Column(name = "INSURED_BIRTHDAY")
	private Date insuredBirthday;

	@Column(name = "INSURED_ZOKUGARA")
	private String insuredZokugara;

	@Column(name = "INSURED_OR_CORP_KBN")
	private String insuredOrCorpKbn;

	@Column(name = "INSUREDE_KEIYAKUZI_NENREI")
	private String insuredeKeiyakuziNenrei;

	@Column(name = "ANNUITANT_NAME")
	private String annuitantName;

	@Column(name = "ANNUITANT_KNAME")
	private String annuitantKname;

	@Column(name = "ANNUITANT_SEX")
	private String annuitantSex;

	@Column(name = "ANNUITANT_BIRTHDAY")
	private Date annuitantBirthday;

	@Column(name = "ANNUITANT_ZIP_CODE")
	private String annuitantZipCode;

	@Column(name = "ANNUITANT_ADDRESS1")
	private String annuitantAddress1;

	@Column(name = "ANNUITANT_ADDRESS2")
	private String annuitantAddress2;

	@Column(name = "ANNUITANT_ADDRESS3")
	private String annuitantAddress3;

	@Column(name = "ANNUITANT_ADDRESS4")
	private String annuitantAddress4;

	@Column(name = "ANNUITANT_TEL")
	private String annuitantTel;

	@Column(name = "ANNUITANT_ZOKUGARA")
	private String annuitantZokugara;

	@Column(name = "ANNUITANT_ANOTHER_ZIP_CODE")
	private String annuitantAnotherZipCode;

	@Column(name = "ANNUITANT_ANOTHER_ADDRESS1")
	private String annuitantAnotherAddress1;

	@Column(name = "ANNUITANT_ANOTHER_ADDRESS2")
	private String annuitantAnotherAddress2;

	@Column(name = "ANNUITANT_ANOTHER_ADDRESS3")
	private String annuitantAnotherAddress3;

	@Column(name = "ANNUITANT_ANOTHER_ADDRESS4")
	private String annuitantAnotherAddress4;

	@Column(name = "ANNUITANT_OR_CORP_KBN")
	private String annuitantOrCorpKbn;

	@Column(name = "KAZEI_KBN")
	private String kazeiKbn;

	@Column(name = "ANNUITANT_STAKEHOLDER_KBN")
	private String annuitantStakeholderKbn;

	@Column(name = "CONTINGENT_ANNUITANT_NAME")
	private String contingentAnnuitantName;

	@Column(name = "CONTINGENT_ANNUITANT_KNAME")
	private String contingentAnnuitantKname;

	@Column(name = "CONTINGENT_ANNUITANT_SEX")
	private String contingentAnnuitantSex;

	@Column(name = "CONTINGENT_ANNUITANT_BIRTHDAY")
	private Date contingentAnnuitantBirthday;

	@Column(name = "CON_ANNUITANT_ANOTHER_ZIP_CODE")
	private String conAnnuitantAnotherZipCode;

	@Column(name = "CON_ANNUITANT_ANOTHER_ADDRESS1")
	private String conAnnuitantAnotherAddress1;

	@Column(name = "CON_ANNUITANT_ANOTHER_ADDRESS2")
	private String conAnnuitantAnotherAddress2;

	@Column(name = "CON_ANNUITANT_ANOTHER_ADDRESS3")
	private String conAnnuitantAnotherAddress3;

	@Column(name = "CON_ANNUITANT_ANOTHER_ADDRESS4")
	private String conAnnuitantAnotherAddress4;

	@Column(name = "CON_ANNUITANT_TEL")
	private String conAnnuitantTel;

	@Column(name = "CON_ANNUITANT_ZOKUGARA")
	private String conAnnuitantZokugara;

	@Column(name = "CON_ANNUITANT_STAKEHOLDER_KBN")
	private String conAnnuitantStakeholderKbn;

	@Column(name = "HOSHO_CD")
	private String hoshoCd;

	@Column(name = "SHOHIN_CD")
	private String shohinCd;

	@Column(name = "KATA_CD")
	private String kataCd;

	@Column(name = "KEIYAKU_STATUS")
	private String keiyakuStatus;

	@Column(name = "TOSHO_KEIYAKU_DATE")
	private Date toshoKeiyakuDate;

	@Column(name = "KEIYAKU_DATE")
	private Date keiyakuDate;

	@Column(name = "SEKININKAISHI_DATE")
	private Date sekininkaishiDate;

	@Column(name = "SHODAKU_DATE")
	private Date shodakuDate;

	@Column(name = "NENKIN_SIHARAI_KAISI_DATE")
	private Date nenkinSiharaiKaisiDate;

	@Column(name = "NENKIN_SIHARAI_KAISI_NENREI")
	private String nenkinSiharaiKaisiNenrei;

	@Column(name = "HENKO_NO_NENKIN_SHURUI")
	private String henkoNoNenkinShurui;

	@Column(name = "HENKO_NO_NENKIN_HOSHO_KIKAN")
	private String henkoNoNenkinHoshoKikan;

	@Column(name = "HENKO_NENKIN_SHIHARAI_KIKAN")
	private String henkoNenkinShiharaiKikan;

	@Column(name = "EN_NYUKIN_TOKUYAKU_FUKA")
	private String enNyukinTokuyakuFuka;

	@Column(name = "NENKIN_BARAI_TOKUYAKU_FUKA")
	private String nenkinBaraiTokuyakuFuka;

	@Column(name = "NENKIN_BARAI_TOKUYAKU_UMU")
	private String nenkinBaraiTokuyakuUmu;

	@Column(name = "NENKIN_BARAI_TOKUYAKU_SHURUI")
	private String nenkinBaraiTokuyakuShurui;

	@Column(name = "NENKIN_BARAI_TOKUYAKU_KIKAN")
	private String nenkinBaraiTokuyakuKikan;

	@Column(name = "YAKKAN_CATEGORY_CD")
	private String yakkanCategoryCd;

	@Column(name = "YAKKAN_CD")
	private String yakkanCd;

	@Column(name = "YAKKAN_VER")
	private String yakkanVer;

	@Column(name = "TOKUYAKU_TYPE")
	private String tokuyakuType;

	@Column(name = "HITSUYOKEIHI")
	private String hitsuyokeihi;

	@Column(name = "RYOSHU_DATE")
	private Date ryoshuDate;

	@Column(name = "NYUKINJI_HOKENRYO")
	private String nyukinjiHokenryo;

	@Column(name = "HOKENRYO_RUIKEI_CHOSEIGAKU")
	private String hokenryoRuikeiChoseigaku;

	@Column(name = "HARAIKOMI_HOHO")
	private String haraikomiHoho;

	@Column(name = "KOKUCHI_DATE")
	private Date kokuchiDate;

	@Column(name = "S_KEN_P_KEN_KUBUN")
	private String sKenPKenKubun;

	@Column(name = "HOKEN_KIKAN_SHUBETSU")
	private String hokenKikanShubetsu;

	@Column(name = "HAMBAI_CHANERU_CD")
	private String hambaiChaneruCd;

	@Column(name = "DANTAI_KOKYAKU_NO")
	private String dantaiKokyakuNo;

	@Column(name = "SHOKAN_TEN_CD")
	private String shokanTenCd;

	@Column(name = "EIGYOTEN_DAIRITEN_CD")
	private String eigyotenDairitenCd;

	@Column(name = "TORIATSUKAISHA_NO_1")
	private String toriatsukaishaNo1;

	@Column(name = "WARIAI")
	private String wariai;

	@Column(name = "BOSHUNIN_NO_1")
	private String boshuninNo1;

	@Column(name = "SHOKAN_TEN_CD_2")
	private String shokanTenCd2;

	@Column(name = "EIGYOTEN_DAIRITEN_CD_2")
	private String eigyotenDairitenCd2;

	@Column(name = "TORIATSUKAISHA_NO_2")
	private String toriatsukaishaNo2;

	@Column(name = "WARIAI_2")
	private String wariai2;

	@Column(name = "BOSHUNIN_NO_2")
	private String boshuninNo2;

	@Column(name = "TORIATSUKAI_GINKO_SHITEN_CD")
	private String toriatsukaiGinkoShitenCd;

	@Column(name = "CIF_CD")
	private String cifCd;

	@Column(name = "DAIRITEN_NAYOSE_NO_1")
	private String dairitenNayoseNo1;

	@Column(name = "GINKOIN_NO_1")
	private String ginkoinNo1;

	@Column(name = "DAIRITEN_NAYOSE_NO_2")
	private String dairitenNayoseNo2;

	@Column(name = "GINKOIN_NO_2")
	private String ginkoinNo2;

	@Column(name = "KYU_GYO_SHIKIBETSUSHI")
	private String kyuGyoShikibetsushi;

	@Column(name = "JIKO_TOKUTEI_HOJIN__KUBUN")
	private String jikoTokuteiHojinKubun;

	@Column(name = "KOTEI_KANRI_JOKYO")
	private String koteiKanriJokyo;

	@Column(name = "SHOKAI_NENKIN_KINGAKU")
	private String shokaiNenkinKingaku;

	@Column(name = "NENKIN_SHIHARAI_KAISU")
	private String nenkinShiharaiKaisu;

	@Column(name = "KIBARAI_HOKENRYO")
	private String kibaraiHokenryo;

	@Column(name = "NENKIN_NENGAKU")
	private String nenkinNengaku;

	@Column(name = "KIBARAI_NENKIN_RUIKEIGAKU")
	private String kibaraiNenkinRuikeigaku;

	@Column(name = "NENKIN_SHIHARAI_HOHO")
	private String nenkinShiharaiHoho;

	@Column(name = "NENKIN_GENSHI")
	private String nenkinGenshi;

	@Column(name = "YOKIN_SHUMOKU")
	private String yokinShumoku;

	@Column(name = "GINKO_CD")

	private String ginkoCd;

	@Column(name = "SOUKINSAKI_KOUZA_SHITEN_CD")
	private String soukinsakiKouzaShitenCd;

	@Column(name = "KOZA_NO")
	private String kozaNo;

	@Column(name = "KOZA_MEIGININ_KANA")
	private String kozaMeigininKana;

	@Column(name = "KEIYAKU_MEMO_UMU")
	private String keiyakuMemoUmu;

	@Column(name = "IKOJI_NO_TSUMITATEKIN_GAKU")
	private String ikojiNoTsumitatekinGaku;

	@Column(name = "SEIKYU_UKETSUKE_DATE")
	private Date seikyuUketsukeDate;

	@Column(name = "SEIKYUSHO_FURAGU")
	private String seikyushoFuragu;

	@Column(name = "SAIKEN_HOSHO_HOHO")
	private String saikenHoshoHoho;

	@Column(name = "HOZEN_YOCHUI_KUBUN")
	private String hozenYochuiKubun;

	@Column(name = "SHIHARAI_YOCHUI_KUBUN")
	private String shiharaiYochuiKubun;

	@Column(name = "GYOMU_ITAKUSHA_CD")
	private String gyomuItakushaCd;

	@Column(name = "KASHITSUKEKIN_ZANDAKA")
	private String kashitsukekinZandaka;

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getNenkinShoshoNo() {
		return nenkinShoshoNo;
	}

	public void setNenkinShoshoNo(String nenkinShoshoNo) {
		this.nenkinShoshoNo = nenkinShoshoNo;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getHolderKname() {
		return holderKname;
	}

	public void setHolderKname(String holderKname) {
		this.holderKname = holderKname;
	}

	public String getHolderSex() {
		return holderSex;
	}

	public void setHolderSex(String holderSex) {
		this.holderSex = holderSex;
	}

	public Date getHolderBirthday() {
		return holderBirthday;
	}

	public void setHolderBirthday(Date holderBirthday) {
		this.holderBirthday = holderBirthday;
	}

	public String getHolderZipCode() {
		return holderZipCode;
	}

	public void setHolderZipCode(String holderZipCode) {
		this.holderZipCode = holderZipCode;
	}

	public String getHolderAddress1() {
		return holderAddress1;
	}

	public void setHolderAddress1(String holderAddress1) {
		this.holderAddress1 = holderAddress1;
	}

	public String getHolderAddress2() {
		return holderAddress2;
	}

	public void setHolderAddress2(String holderAddress2) {
		this.holderAddress2 = holderAddress2;
	}

	public String getHolderAddress3() {
		return holderAddress3;
	}

	public void setHolderAddress3(String holderAddress3) {
		this.holderAddress3 = holderAddress3;
	}

	public String getHolderAddress4() {
		return holderAddress4;
	}

	public void setHolderAddress4(String holderAddress4) {
		this.holderAddress4 = holderAddress4;
	}

	public String getHolderTel() {
		return holderTel;
	}

	public void setHolderTel(String holderTel) {
		this.holderTel = holderTel;
	}

	public String getHolderOrCorpKbn() {
		return holderOrCorpKbn;
	}

	public void setHolderOrCorpKbn(String holderOrCorpKbn) {
		this.holderOrCorpKbn = holderOrCorpKbn;
	}

	public String getHolderAnotherZipCode() {
		return holderAnotherZipCode;
	}

	public void setHolderAnotherZipCode(String holderAnotherZipCode) {
		this.holderAnotherZipCode = holderAnotherZipCode;
	}

	public String getHolderAnotherTel() {
		return holderAnotherTel;
	}

	public void setHolderAnotherTel(String holderAnotherTel) {
		this.holderAnotherTel = holderAnotherTel;
	}

	public String getHolderAnotherAddress1() {
		return holderAnotherAddress1;
	}

	public void setHolderAnotherAddress1(String holderAnotherAddress1) {
		this.holderAnotherAddress1 = holderAnotherAddress1;
	}

	public String getHolderAnotherAddress2() {
		return holderAnotherAddress2;
	}

	public void setHolderAnotherAddress2(String holderAnotherAddress2) {
		this.holderAnotherAddress2 = holderAnotherAddress2;
	}

	public String getHolderAnotherAddress3() {
		return holderAnotherAddress3;
	}

	public void setHolderAnotherAddress3(String holderAnotherAddress3) {
		this.holderAnotherAddress3 = holderAnotherAddress3;
	}

	public String getHolderAnotherAddress4() {
		return holderAnotherAddress4;
	}

	public void setHolderAnotherAddress4(String holderAnotherAddress4) {
		this.holderAnotherAddress4 = holderAnotherAddress4;
	}

	public String getInsuredName() {
		return insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	public String getInsuredKname() {
		return insuredKname;
	}

	public void setInsuredKname(String insuredKname) {
		this.insuredKname = insuredKname;
	}

	public String getInsuredSex() {
		return insuredSex;
	}

	public void setInsuredSex(String insuredSex) {
		this.insuredSex = insuredSex;
	}

	public Date getInsuredBirthday() {
		return insuredBirthday;
	}

	public void setInsuredBirthday(Date insuredBirthday) {
		this.insuredBirthday = insuredBirthday;
	}

	public String getInsuredZokugara() {
		return insuredZokugara;
	}

	public void setInsuredZokugara(String insuredZokugara) {
		this.insuredZokugara = insuredZokugara;
	}

	public String getInsuredOrCorpKbn() {
		return insuredOrCorpKbn;
	}

	public void setInsuredOrCorpKbn(String insuredOrCorpKbn) {
		this.insuredOrCorpKbn = insuredOrCorpKbn;
	}

	public String getInsuredeKeiyakuziNenrei() {
		return insuredeKeiyakuziNenrei;
	}

	public void setInsuredeKeiyakuziNenrei(String insuredeKeiyakuziNenrei) {
		this.insuredeKeiyakuziNenrei = insuredeKeiyakuziNenrei;
	}

	public String getAnnuitantName() {
		return annuitantName;
	}

	public void setAnnuitantName(String annuitantName) {
		this.annuitantName = annuitantName;
	}

	public String getAnnuitantKname() {
		return annuitantKname;
	}

	public void setAnnuitantKname(String annuitantKname) {
		this.annuitantKname = annuitantKname;
	}

	public String getAnnuitantSex() {
		return annuitantSex;
	}

	public void setAnnuitantSex(String annuitantSex) {
		this.annuitantSex = annuitantSex;
	}

	public Date getAnnuitantBirthday() {
		return annuitantBirthday;
	}

	public void setAnnuitantBirthday(Date annuitantBirthday) {
		this.annuitantBirthday = annuitantBirthday;
	}

	public String getAnnuitantZipCode() {
		return annuitantZipCode;
	}

	public void setAnnuitantZipCode(String annuitantZipCode) {
		this.annuitantZipCode = annuitantZipCode;
	}

	public String getAnnuitantAddress1() {
		return annuitantAddress1;
	}

	public void setAnnuitantAddress1(String annuitantAddress1) {
		this.annuitantAddress1 = annuitantAddress1;
	}

	public String getAnnuitantAddress2() {
		return annuitantAddress2;
	}

	public void setAnnuitantAddress2(String annuitantAddress2) {
		this.annuitantAddress2 = annuitantAddress2;
	}

	public String getAnnuitantAddress3() {
		return annuitantAddress3;
	}

	public void setAnnuitantAddress3(String annuitantAddress3) {
		this.annuitantAddress3 = annuitantAddress3;
	}

	public String getAnnuitantAddress4() {
		return annuitantAddress4;
	}

	public void setAnnuitantAddress4(String annuitantAddress4) {
		this.annuitantAddress4 = annuitantAddress4;
	}

	public String getAnnuitantTel() {
		return annuitantTel;
	}

	public void setAnnuitantTel(String annuitantTel) {
		this.annuitantTel = annuitantTel;
	}

	public String getAnnuitantZokugara() {
		return annuitantZokugara;
	}

	public void setAnnuitantZokugara(String annuitantZokugara) {
		this.annuitantZokugara = annuitantZokugara;
	}

	public String getAnnuitantAnotherZipCode() {
		return annuitantAnotherZipCode;
	}

	public void setAnnuitantAnotherZipCode(String annuitantAnotherZipCode) {
		this.annuitantAnotherZipCode = annuitantAnotherZipCode;
	}

	public String getAnnuitantAnotherAddress1() {
		return annuitantAnotherAddress1;
	}

	public void setAnnuitantAnotherAddress1(String annuitantAnotherAddress1) {
		this.annuitantAnotherAddress1 = annuitantAnotherAddress1;
	}

	public String getAnnuitantAnotherAddress2() {
		return annuitantAnotherAddress2;
	}

	public void setAnnuitantAnotherAddress2(String annuitantAnotherAddress2) {
		this.annuitantAnotherAddress2 = annuitantAnotherAddress2;
	}

	public String getAnnuitantAnotherAddress3() {
		return annuitantAnotherAddress3;
	}

	public void setAnnuitantAnotherAddress3(String annuitantAnotherAddress3) {
		this.annuitantAnotherAddress3 = annuitantAnotherAddress3;
	}

	public String getAnnuitantAnotherAddress4() {
		return annuitantAnotherAddress4;
	}

	public void setAnnuitantAnotherAddress4(String annuitantAnotherAddress4) {
		this.annuitantAnotherAddress4 = annuitantAnotherAddress4;
	}

	public String getAnnuitantOrCorpKbn() {
		return annuitantOrCorpKbn;
	}

	public void setAnnuitantOrCorpKbn(String annuitantOrCorpKbn) {
		this.annuitantOrCorpKbn = annuitantOrCorpKbn;
	}

	public String getKazeiKbn() {
		return kazeiKbn;
	}

	public void setKazeiKbn(String kazeiKbn) {
		this.kazeiKbn = kazeiKbn;
	}

	public String getAnnuitantStakeholderKbn() {
		return annuitantStakeholderKbn;
	}

	public void setAnnuitantStakeholderKbn(String annuitantStakeholderKbn) {
		this.annuitantStakeholderKbn = annuitantStakeholderKbn;
	}

	public String getContingentAnnuitantName() {
		return contingentAnnuitantName;
	}

	public void setContingentAnnuitantName(String contingentAnnuitantName) {
		this.contingentAnnuitantName = contingentAnnuitantName;
	}

	public String getContingentAnnuitantKname() {
		return contingentAnnuitantKname;
	}

	public void setContingentAnnuitantKname(String contingentAnnuitantKname) {
		this.contingentAnnuitantKname = contingentAnnuitantKname;
	}

	public String getContingentAnnuitantSex() {
		return contingentAnnuitantSex;
	}

	public void setContingentAnnuitantSex(String contingentAnnuitantSex) {
		this.contingentAnnuitantSex = contingentAnnuitantSex;
	}

	public Date getContingentAnnuitantBirthday() {
		return contingentAnnuitantBirthday;
	}

	public void setContingentAnnuitantBirthday(Date contingentAnnuitantBirthday) {
		this.contingentAnnuitantBirthday = contingentAnnuitantBirthday;
	}

	public String getConAnnuitantAnotherZipCode() {
		return conAnnuitantAnotherZipCode;
	}

	public void setConAnnuitantAnotherZipCode(String conAnnuitantAnotherZipCode) {
		this.conAnnuitantAnotherZipCode = conAnnuitantAnotherZipCode;
	}

	public String getConAnnuitantAnotherAddress1() {
		return conAnnuitantAnotherAddress1;
	}

	public void setConAnnuitantAnotherAddress1(String conAnnuitantAnotherAddress1) {
		this.conAnnuitantAnotherAddress1 = conAnnuitantAnotherAddress1;
	}

	public String getConAnnuitantAnotherAddress2() {
		return conAnnuitantAnotherAddress2;
	}

	public void setConAnnuitantAnotherAddress2(String conAnnuitantAnotherAddress2) {
		this.conAnnuitantAnotherAddress2 = conAnnuitantAnotherAddress2;
	}

	public String getConAnnuitantAnotherAddress3() {
		return conAnnuitantAnotherAddress3;
	}

	public void setConAnnuitantAnotherAddress3(String conAnnuitantAnotherAddress3) {
		this.conAnnuitantAnotherAddress3 = conAnnuitantAnotherAddress3;
	}

	public String getConAnnuitantAnotherAddress4() {
		return conAnnuitantAnotherAddress4;
	}

	public void setConAnnuitantAnotherAddress4(String conAnnuitantAnotherAddress4) {
		this.conAnnuitantAnotherAddress4 = conAnnuitantAnotherAddress4;
	}

	public String getConAnnuitantTel() {
		return conAnnuitantTel;
	}

	public void setConAnnuitantTel(String conAnnuitantTel) {
		this.conAnnuitantTel = conAnnuitantTel;
	}

	public String getConAnnuitantZokugara() {
		return conAnnuitantZokugara;
	}

	public void setConAnnuitantZokugara(String conAnnuitantZokugara) {
		this.conAnnuitantZokugara = conAnnuitantZokugara;
	}

	public String getConAnnuitantStakeholderKbn() {
		return conAnnuitantStakeholderKbn;
	}

	public void setConAnnuitantStakeholderKbn(String conAnnuitantStakeholderKbn) {
		this.conAnnuitantStakeholderKbn = conAnnuitantStakeholderKbn;
	}

	public String getHoshoCd() {
		return hoshoCd;
	}

	public void setHoshoCd(String hoshoCd) {
		this.hoshoCd = hoshoCd;
	}

	public String getShohinCd() {
		return shohinCd;
	}

	public void setShohinCd(String shohinCd) {
		this.shohinCd = shohinCd;
	}

	public String getKataCd() {
		return kataCd;
	}

	public void setKataCd(String kataCd) {
		this.kataCd = kataCd;
	}

	public String getKeiyakuStatus() {
		return keiyakuStatus;
	}

	public void setKeiyakuStatus(String keiyakuStatus) {
		this.keiyakuStatus = keiyakuStatus;
	}

	public Date getToshoKeiyakuDate() {
		return toshoKeiyakuDate;
	}

	public void setToshoKeiyakuDate(Date toshoKeiyakuDate) {
		this.toshoKeiyakuDate = toshoKeiyakuDate;
	}

	public Date getKeiyakuDate() {
		return keiyakuDate;
	}

	public void setKeiyakuDate(Date keiyakuDate) {
		this.keiyakuDate = keiyakuDate;
	}

	public Date getSekininkaishiDate() {
		return sekininkaishiDate;
	}

	public void setSekininkaishiDate(Date sekininkaishiDate) {
		this.sekininkaishiDate = sekininkaishiDate;
	}

	public Date getShodakuDate() {
		return shodakuDate;
	}

	public void setShodakuDate(Date shodakuDate) {
		this.shodakuDate = shodakuDate;
	}

	public Date getNenkinSiharaiKaisiDate() {
		return nenkinSiharaiKaisiDate;
	}

	public void setNenkinSiharaiKaisiDate(Date nenkinSiharaiKaisiDate) {
		this.nenkinSiharaiKaisiDate = nenkinSiharaiKaisiDate;
	}

	public String getNenkinSiharaiKaisiNenrei() {
		return nenkinSiharaiKaisiNenrei;
	}

	public void setNenkinSiharaiKaisiNenrei(String nenkinSiharaiKaisiNenrei) {
		this.nenkinSiharaiKaisiNenrei = nenkinSiharaiKaisiNenrei;
	}

	public String getHenkoNoNenkinShurui() {
		return henkoNoNenkinShurui;
	}

	public void setHenkoNoNenkinShurui(String henkoNoNenkinShurui) {
		this.henkoNoNenkinShurui = henkoNoNenkinShurui;
	}

	public String getHenkoNoNenkinHoshoKikan() {
		return henkoNoNenkinHoshoKikan;
	}

	public void setHenkoNoNenkinHoshoKikan(String henkoNoNenkinHoshoKikan) {
		this.henkoNoNenkinHoshoKikan = henkoNoNenkinHoshoKikan;
	}

	public String getHenkoNenkinShiharaiKikan() {
		return henkoNenkinShiharaiKikan;
	}

	public void setHenkoNenkinShiharaiKikan(String henkoNenkinShiharaiKikan) {
		this.henkoNenkinShiharaiKikan = henkoNenkinShiharaiKikan;
	}

	public String getEnNyukinTokuyakuFuka() {
		return enNyukinTokuyakuFuka;
	}

	public void setEnNyukinTokuyakuFuka(String enNyukinTokuyakuFuka) {
		this.enNyukinTokuyakuFuka = enNyukinTokuyakuFuka;
	}

	public String getNenkinBaraiTokuyakuFuka() {
		return nenkinBaraiTokuyakuFuka;
	}

	public void setNenkinBaraiTokuyakuFuka(String nenkinBaraiTokuyakuFuka) {
		this.nenkinBaraiTokuyakuFuka = nenkinBaraiTokuyakuFuka;
	}

	public String getNenkinBaraiTokuyakuUmu() {
		return nenkinBaraiTokuyakuUmu;
	}

	public void setNenkinBaraiTokuyakuUmu(String nenkinBaraiTokuyakuUmu) {
		this.nenkinBaraiTokuyakuUmu = nenkinBaraiTokuyakuUmu;
	}

	public String getNenkinBaraiTokuyakuShurui() {
		return nenkinBaraiTokuyakuShurui;
	}

	public void setNenkinBaraiTokuyakuShurui(String nenkinBaraiTokuyakuShurui) {
		this.nenkinBaraiTokuyakuShurui = nenkinBaraiTokuyakuShurui;
	}

	public String getNenkinBaraiTokuyakuKikan() {
		return nenkinBaraiTokuyakuKikan;
	}

	public void setNenkinBaraiTokuyakuKikan(String nenkinBaraiTokuyakuKikan) {
		this.nenkinBaraiTokuyakuKikan = nenkinBaraiTokuyakuKikan;
	}

	public String getYakkanCategoryCd() {
		return yakkanCategoryCd;
	}

	public void setYakkanCategoryCd(String yakkanCategoryCd) {
		this.yakkanCategoryCd = yakkanCategoryCd;
	}

	public String getYakkanCd() {
		return yakkanCd;
	}

	public void setYakkanCd(String yakkanCd) {
		this.yakkanCd = yakkanCd;
	}

	public String getYakkanVer() {
		return yakkanVer;
	}

	public void setYakkanVer(String yakkanVer) {
		this.yakkanVer = yakkanVer;
	}

	public String getTokuyakuType() {
		return tokuyakuType;
	}

	public void setTokuyakuType(String tokuyakuType) {
		this.tokuyakuType = tokuyakuType;
	}

	public String getHitsuyokeihi() {
		return hitsuyokeihi;
	}

	public void setHitsuyokeihi(String hitsuyokeihi) {
		this.hitsuyokeihi = hitsuyokeihi;
	}

	public Date getRyoshuDate() {
		return ryoshuDate;
	}

	public void setRyoshuDate(Date ryoshuDate) {
		this.ryoshuDate = ryoshuDate;
	}

	public String getNyukinjiHokenryo() {
		return nyukinjiHokenryo;
	}

	public void setNyukinjiHokenryo(String nyukinjiHokenryo) {
		this.nyukinjiHokenryo = nyukinjiHokenryo;
	}

	public String getHokenryoRuikeiChoseigaku() {
		return hokenryoRuikeiChoseigaku;
	}

	public void setHokenryoRuikeiChoseigaku(String hokenryoRuikeiChoseigaku) {
		this.hokenryoRuikeiChoseigaku = hokenryoRuikeiChoseigaku;
	}

	public String getHaraikomiHoho() {
		return haraikomiHoho;
	}

	public void setHaraikomiHoho(String haraikomiHoho) {
		this.haraikomiHoho = haraikomiHoho;
	}

	public Date getKokuchiDate() {
		return kokuchiDate;
	}

	public void setKokuchiDate(Date kokuchiDate) {
		this.kokuchiDate = kokuchiDate;
	}

	public String getsKenPKenKubun() {
		return sKenPKenKubun;
	}

	public void setsKenPKenKubun(String sKenPKenKubun) {
		this.sKenPKenKubun = sKenPKenKubun;
	}

	public String getHokenKikanShubetsu() {
		return hokenKikanShubetsu;
	}

	public void setHokenKikanShubetsu(String hokenKikanShubetsu) {
		this.hokenKikanShubetsu = hokenKikanShubetsu;
	}

	public String getHambaiChaneruCd() {
		return hambaiChaneruCd;
	}

	public void setHambaiChaneruCd(String hambaiChaneruCd) {
		this.hambaiChaneruCd = hambaiChaneruCd;
	}

	public String getDantaiKokyakuNo() {
		return dantaiKokyakuNo;
	}

	public void setDantaiKokyakuNo(String dantaiKokyakuNo) {
		this.dantaiKokyakuNo = dantaiKokyakuNo;
	}

	public String getShokanTenCd() {
		return shokanTenCd;
	}

	public void setShokanTenCd(String shokanTenCd) {
		this.shokanTenCd = shokanTenCd;
	}

	public String getEigyotenDairitenCd() {
		return eigyotenDairitenCd;
	}

	public void setEigyotenDairitenCd(String eigyotenDairitenCd) {
		this.eigyotenDairitenCd = eigyotenDairitenCd;
	}

	public String getToriatsukaishaNo1() {
		return toriatsukaishaNo1;
	}

	public void setToriatsukaishaNo1(String toriatsukaishaNo1) {
		this.toriatsukaishaNo1 = toriatsukaishaNo1;
	}

	public String getWariai() {
		return wariai;
	}

	public void setWariai(String wariai) {
		this.wariai = wariai;
	}

	public String getBoshuninNo1() {
		return boshuninNo1;
	}

	public void setBoshuninNo1(String boshuninNo1) {
		this.boshuninNo1 = boshuninNo1;
	}

	public String getShokanTenCd2() {
		return shokanTenCd2;
	}

	public void setShokanTenCd2(String shokanTenCd2) {
		this.shokanTenCd2 = shokanTenCd2;
	}

	public String getEigyotenDairitenCd2() {
		return eigyotenDairitenCd2;
	}

	public void setEigyotenDairitenCd2(String eigyotenDairitenCd2) {
		this.eigyotenDairitenCd2 = eigyotenDairitenCd2;
	}

	public String getToriatsukaishaNo2() {
		return toriatsukaishaNo2;
	}

	public void setToriatsukaishaNo2(String toriatsukaishaNo2) {
		this.toriatsukaishaNo2 = toriatsukaishaNo2;
	}

	public String getWariai2() {
		return wariai2;
	}

	public void setWariai2(String wariai2) {
		this.wariai2 = wariai2;
	}

	public String getBoshuninNo2() {
		return boshuninNo2;
	}

	public void setBoshuninNo2(String boshuninNo2) {
		this.boshuninNo2 = boshuninNo2;
	}

	public String getToriatsukaiGinkoShitenCd() {
		return toriatsukaiGinkoShitenCd;
	}

	public void setToriatsukaiGinkoShitenCd(String toriatsukaiGinkoShitenCd) {
		this.toriatsukaiGinkoShitenCd = toriatsukaiGinkoShitenCd;
	}

	public String getCifCd() {
		return cifCd;
	}

	public void setCifCd(String cifCd) {
		this.cifCd = cifCd;
	}

	public String getDairitenNayoseNo1() {
		return dairitenNayoseNo1;
	}

	public void setDairitenNayoseNo1(String dairitenNayoseNo1) {
		this.dairitenNayoseNo1 = dairitenNayoseNo1;
	}

	public String getGinkoinNo1() {
		return ginkoinNo1;
	}

	public void setGinkoinNo1(String ginkoinNo1) {
		this.ginkoinNo1 = ginkoinNo1;
	}

	public String getDairitenNayoseNo2() {
		return dairitenNayoseNo2;
	}

	public void setDairitenNayoseNo2(String dairitenNayoseNo2) {
		this.dairitenNayoseNo2 = dairitenNayoseNo2;
	}

	public String getGinkoinNo2() {
		return ginkoinNo2;
	}

	public void setGinkoinNo2(String ginkoinNo2) {
		this.ginkoinNo2 = ginkoinNo2;
	}

	public String getKyuGyoShikibetsushi() {
		return kyuGyoShikibetsushi;
	}

	public void setKyuGyoShikibetsushi(String kyuGyoShikibetsushi) {
		this.kyuGyoShikibetsushi = kyuGyoShikibetsushi;
	}

	public String getJikoTokuteiHojinKubun() {
		return jikoTokuteiHojinKubun;
	}

	public void setJikoTokuteiHojinKubun(String jikoTokuteiHojinKubun) {
		this.jikoTokuteiHojinKubun = jikoTokuteiHojinKubun;
	}

	public String getKoteiKanriJokyo() {
		return koteiKanriJokyo;
	}

	public void setKoteiKanriJokyo(String koteiKanriJokyo) {
		this.koteiKanriJokyo = koteiKanriJokyo;
	}

	public String getShokaiNenkinKingaku() {
		return shokaiNenkinKingaku;
	}

	public void setShokaiNenkinKingaku(String shokaiNenkinKingaku) {
		this.shokaiNenkinKingaku = shokaiNenkinKingaku;
	}

	public String getNenkinShiharaiKaisu() {
		return nenkinShiharaiKaisu;
	}

	public void setNenkinShiharaiKaisu(String nenkinShiharaiKaisu) {
		this.nenkinShiharaiKaisu = nenkinShiharaiKaisu;
	}

	public String getKibaraiHokenryo() {
		return kibaraiHokenryo;
	}

	public void setKibaraiHokenryo(String kibaraiHokenryo) {
		this.kibaraiHokenryo = kibaraiHokenryo;
	}

	public String getNenkinNengaku() {
		return nenkinNengaku;
	}

	public void setNenkinNengaku(String nenkinNengaku) {
		this.nenkinNengaku = nenkinNengaku;
	}

	public String getKibaraiNenkinRuikeigaku() {
		return kibaraiNenkinRuikeigaku;
	}

	public void setKibaraiNenkinRuikeigaku(String kibaraiNenkinRuikeigaku) {
		this.kibaraiNenkinRuikeigaku = kibaraiNenkinRuikeigaku;
	}

	public String getNenkinShiharaiHoho() {
		return nenkinShiharaiHoho;
	}

	public void setNenkinShiharaiHoho(String nenkinShiharaiHoho) {
		this.nenkinShiharaiHoho = nenkinShiharaiHoho;
	}

	public String getNenkinGenshi() {
		return nenkinGenshi;
	}

	public void setNenkinGenshi(String nenkinGenshi) {
		this.nenkinGenshi = nenkinGenshi;
	}

	public String getYokinShumoku() {
		return yokinShumoku;
	}

	public void setYokinShumoku(String yokinShumoku) {
		this.yokinShumoku = yokinShumoku;
	}

	public String getGinkoCd() {
		return ginkoCd;
	}

	public void setGinkoCd(String ginkoCd) {
		this.ginkoCd = ginkoCd;
	}

	public String getSoukinsakiKouzaShitenCd() {
		return soukinsakiKouzaShitenCd;
	}

	public void setSoukinsakiKouzaShitenCd(String soukinsakiKouzaShitenCd) {
		this.soukinsakiKouzaShitenCd = soukinsakiKouzaShitenCd;
	}

	public String getKozaNo() {
		return kozaNo;
	}

	public void setKozaNo(String kozaNo) {
		this.kozaNo = kozaNo;
	}

	public String getKozaMeigininKana() {
		return kozaMeigininKana;
	}

	public void setKozaMeigininKana(String kozaMeigininKana) {
		this.kozaMeigininKana = kozaMeigininKana;
	}

	public String getKeiyakuMemoUmu() {
		return keiyakuMemoUmu;
	}

	public void setKeiyakuMemoUmu(String keiyakuMemoUmu) {
		this.keiyakuMemoUmu = keiyakuMemoUmu;
	}

	public String getIkojiNoTsumitatekinGaku() {
		return ikojiNoTsumitatekinGaku;
	}

	public void setIkojiNoTsumitatekinGaku(String ikojiNoTsumitatekinGaku) {
		this.ikojiNoTsumitatekinGaku = ikojiNoTsumitatekinGaku;
	}

	public Date getSeikyuUketsukeDate() {
		return seikyuUketsukeDate;
	}

	public void setSeikyuUketsukeDate(Date seikyuUketsukeDate) {
		this.seikyuUketsukeDate = seikyuUketsukeDate;
	}

	public String getSeikyushoFuragu() {
		return seikyushoFuragu;
	}

	public void setSeikyushoFuragu(String seikyushoFuragu) {
		this.seikyushoFuragu = seikyushoFuragu;
	}

	public String getSaikenHoshoHoho() {
		return saikenHoshoHoho;
	}

	public void setSaikenHoshoHoho(String saikenHoshoHoho) {
		this.saikenHoshoHoho = saikenHoshoHoho;
	}

	public String getHozenYochuiKubun() {
		return hozenYochuiKubun;
	}

	public void setHozenYochuiKubun(String hozenYochuiKubun) {
		this.hozenYochuiKubun = hozenYochuiKubun;
	}

	public String getShiharaiYochuiKubun() {
		return shiharaiYochuiKubun;
	}

	public void setShiharaiYochuiKubun(String shiharaiYochuiKubun) {
		this.shiharaiYochuiKubun = shiharaiYochuiKubun;
	}

	public String getGyomuItakushaCd() {
		return gyomuItakushaCd;
	}

	public void setGyomuItakushaCd(String gyomuItakushaCd) {
		this.gyomuItakushaCd = gyomuItakushaCd;
	}

	public String getKashitsukekinZandaka() {
		return kashitsukekinZandaka;
	}

	public void setKashitsukekinZandaka(String kashitsukekinZandaka) {
		this.kashitsukekinZandaka = kashitsukekinZandaka;
	}
}

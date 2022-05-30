package project;


import java.util.ArrayList;
import java.util.Date;

public class Root {
    public Id _id;
    public int approvalfy;
    public String board_approval_month;
    public Date boardapprovaldate;
    public String borrower;
    public Date closingdate;
    public String country_namecode;
    public String countrycode;
    public String countryname;
    public String countryshortname;
    public String docty;
    public String envassesmentcategorycode;
    public int grantamt;
    public int ibrdcommamt;
    public String id;
    public int idacommamt;
    public String impagency;
    public String lendinginstr;
    public String lendinginstrtype;
    public long lendprojectcost;
    public ArrayList<MajorsectorPercent> majorsector_percent;
    public ArrayList<MjsectorNamecode> mjsector_namecode;
    public ArrayList<String> mjtheme;
    public ArrayList<MjthemeNamecode> mjtheme_namecode;
    public String mjthemecode;
    public String prodline;
    public String prodlinetext;
    public String productlinetype;
    public ProjectAbstract project_abstract;
    public String project_name;
    public ArrayList<Projectdoc> projectdocs;
    public String projectfinancialtype;
    public String projectstatusdisplay;
    public String regionname;
    public ArrayList<Sector> sector;
    public Sector1 sector1;
    public Sector2 sector2;
    public Sector3 sector3;
    public Sector4 sector4;
    public ArrayList<SectorNamecode> sector_namecode;
    public String sectorcode;
    public String source;
    public String status;
    public String supplementprojectflg;
    public Theme1 theme1;
    public ArrayList<ThemeNamecode> theme_namecode;
    public String themecode;
    public int totalamt;
    public int totalcommamt;
    public String url;

    @Override
    public String toString() {
        return "Root{" +
                "_id=" + _id +
                ", approvalfy=" + approvalfy +
                ", board_approval_month='" + board_approval_month + '\'' +
                ", boardapprovaldate=" + boardapprovaldate +
                ", borrower='" + borrower + '\'' +
                ", closingdate=" + closingdate +
                ", country_namecode='" + country_namecode + '\'' +
                ", countrycode='" + countrycode + '\'' +
                ", countryname='" + countryname + '\'' +
                ", countryshortname='" + countryshortname + '\'' +
                ", docty='" + docty + '\'' +
                ", envassesmentcategorycode='" + envassesmentcategorycode + '\'' +
                ", grantamt=" + grantamt +
                ", ibrdcommamt=" + ibrdcommamt +
                ", id='" + id + '\'' +
                ", idacommamt=" + idacommamt +
                ", impagency='" + impagency + '\'' +
                ", lendinginstr='" + lendinginstr + '\'' +
                ", lendinginstrtype='" + lendinginstrtype + '\'' +
                ", lendprojectcost=" + lendprojectcost +
                ", majorsector_percent=" + majorsector_percent +
                ", mjsector_namecode=" + mjsector_namecode +
                ", mjtheme=" + mjtheme +
                ", mjtheme_namecode=" + mjtheme_namecode +
                ", mjthemecode='" + mjthemecode + '\'' +
                ", prodline='" + prodline + '\'' +
                ", prodlinetext='" + prodlinetext + '\'' +
                ", productlinetype='" + productlinetype + '\'' +
                ", project_abstract=" + project_abstract +
                ", project_name='" + project_name + '\'' +
                ", projectdocs=" + projectdocs +
                ", projectfinancialtype='" + projectfinancialtype + '\'' +
                ", projectstatusdisplay='" + projectstatusdisplay + '\'' +
                ", regionname='" + regionname + '\'' +
                ", sector=" + sector +
                ", sector1=" + sector1 +
                ", sector2=" + sector2 +
                ", sector3=" + sector3 +
                ", sector4=" + sector4 +
                ", sector_namecode=" + sector_namecode +
                ", sectorcode='" + sectorcode + '\'' +
                ", source='" + source + '\'' +
                ", status='" + status + '\'' +
                ", supplementprojectflg='" + supplementprojectflg + '\'' +
                ", theme1=" + theme1 +
                ", theme_namecode=" + theme_namecode +
                ", themecode='" + themecode + '\'' +
                ", totalamt=" + totalamt +
                ", totalcommamt=" + totalcommamt +
                ", url='" + url + '\'' +
                '}';
    }
}

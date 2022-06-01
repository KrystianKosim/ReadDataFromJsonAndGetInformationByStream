package project;


import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;

@Getter
@ToString
public class Root {
    private Id _id;
    private int approvalfy;
    private String board_approval_month;
    private Date boardapprovaldate;
    private String borrower;
    private Date closingdate;
    private String country_namecode;
    private String countrycode;
    private String countryname;
    private String countryshortname;
    private String docty;
    private String envassesmentcategorycode;
    private int grantamt;
    private int ibrdcommamt;
    private String id;
    private int idacommamt;
    private String impagency;
    private String lendinginstr;
    private String lendinginstrtype;
    private long lendprojectcost;
    private ArrayList<MajorsectorPercent> majorsector_percent;
    private ArrayList<MjsectorNamecode> mjsector_namecode;
    private ArrayList<String> mjtheme;
    private ArrayList<MjthemeNamecode> mjtheme_namecode;
    private String mjthemecode;
    private String prodline;
    private String prodlinetext;
    private String productlinetype;
    private ProjectAbstract project_abstract;
    private String project_name;
    private ArrayList<Projectdoc> projectdocs;
    private String projectfinancialtype;
    private String projectstatusdisplay;
    private String regionname;
    private ArrayList<Sector> sector;
    private Sector1 sector1;
    private Sector2 sector2;
    private Sector3 sector3;
    private Sector4 sector4;
    private ArrayList<SectorNamecode> sector_namecode;
    private String sectorcode;
    private String source;
    private String status;
    private String supplementprojectflg;
    private Theme1 theme1;
    private ArrayList<ThemeNamecode> theme_namecode;
    private String themecode;
    private int totalamt;
    private int totalcommamt;
    private String url;

}

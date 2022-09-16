package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import com.google.protos.youtube.api.innertube.RegisterTasksCommandOuterClass$RegisterTasksCommand;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: dxs  reason: default package */
/* loaded from: classes3.dex */
public final class dxs {
    public final azqb A;
    public final azqb B;
    public final azqb C;
    public final azqb D;
    public final azqb E;
    public final azqb F;
    public final azqb G;
    public final azqb H;
    public final azqb I;

    /* renamed from: J  reason: collision with root package name */
    public final azqb f192J;
    public final azqb K;
    public final azqb L;
    public final azqb M;
    public final azqb N;
    public final azqb O;
    public final azqb P;
    public final azqb Q;
    public final azqb R;
    public final azqb S;
    public final azqb T;
    public final azqb U;
    public final azqb V;
    public final azqb W;
    public final azqb X;
    public final azqb Y;
    public final azqb Z;
    public final azqb a;
    public final azqb aA;
    public final azqb aB;
    public final azqb aC;
    public final azqb aD;
    public final azqb aE;
    public final azqb aF;
    public final azqb aG;
    public final azqb aH;
    public final azqb aI;
    public final azqb aJ;
    public final azqb aK;
    public final azqb aL;
    public final azqb aM;
    public final azqb aN;
    public final azqb aO;
    public final azqb aP;
    public final azqb aQ;
    public final azqb aR;
    public final azqb aS;
    public final azqb aT;
    public final azqb aU;
    public final azqb aV;
    public final azqb aW;
    public final azqb aX;
    public final azqb aY;
    public final azqb aZ;
    public final azqb aa;
    public final azqb ab;
    public final azqb ac;
    public final azqb ad;
    public final azqb ae;
    public final azqb af;
    public final azqb ag;
    public final azqb ah;
    public final azqb ai;
    public final azqb aj;
    public final azqb ak;
    public final azqb al;
    public final azqb am;
    public final azqb an;
    public final azqb ao;
    public final azqb ap;
    public final azqb aq;
    public final azqb ar;
    public final azqb as;
    public final azqb at;
    public final azqb au;
    public final azqb av;
    public final azqb aw;
    public final azqb ax;
    public final azqb ay;
    public final azqb az;
    public final azqb b;
    public final azqb bA;
    public final azqb bB;
    public final azqb bC;
    public final azqb bD;
    public final azqb bE;
    public final /* synthetic */ dyo bF;
    private final azqb bG;
    private final azqb bH;
    private final azqb bI;
    private final azqb bJ;
    private final azqb bK;
    private final azqb bL;
    private final azqb bM;
    private final azqb bN;
    private final azqb bO;
    private final azqb bP;
    private final azqb bQ;
    private final azqb bR;
    private final azqb bS;
    private final azqb bT;
    private final azqb bU;
    private final azqb bV;
    private final azqb bW;
    private final azqb bX;
    private final azqb bY;
    private final azqb bZ;
    public final azqb ba;
    public final azqb bb;
    public final azqb bc;
    public final azqb bd;
    public final azqb be;
    public final azqb bf;
    public final azqb bg;
    public final azqb bh;
    public final azqb bi;
    public final azqb bj;
    public final azqb bk;
    public final azqb bl;
    public final azqb bm;
    public final azqb bn;
    public final azqb bo;
    public final azqb bp;
    public final azqb bq;
    public final azqb br;
    public final azqb bs;
    public final azqb bt;
    public final azqb bu;
    public final azqb bv;
    public final azqb bw;
    public final azqb bx;
    public final azqb by;
    public final azqb bz;
    public final azqb c;
    private final azqb ca;
    private final azqb cb;
    private final azqb cc;
    private final azqb cd;
    private final azqb ce;
    private final azqb cf;
    private final azqb cg;
    private final azqb ch;
    private final azqb ci;
    private final azqb cj;
    private final azqb ck;
    private final azqb cl;
    private final azqb cm;
    private final azqb cn;
    public final azqb d;
    public final azqb e;
    public final azqb f;
    public final azqb g;
    public final azqb h;
    public final azqb i;
    public final azqb j;
    public final azqb k;
    public final azqb l;
    public final azqb m;
    public final azqb n;
    public final azqb o;
    public final azqb p;
    public final azqb q;
    public final azqb r;
    public final azqb s;
    public final azqb t;
    public final azqb u;
    public final azqb v;
    public final azqb w;
    public final azqb x;
    public final azqb y;
    public final azqb z;

    public dxs(dyo dyoVar) {
        this.bF = dyoVar;
        this.a = axot.b(new dxu(dyoVar.c, 1673));
        this.b = axot.b(new dxu(dyoVar.c, 1674));
        this.c = axot.b(new dxu(dyoVar.c, 1675));
        this.d = axot.b(new dxu(dyoVar.c, 1676));
        this.e = axot.b(new dxu(dyoVar.c, 1677));
        this.f = axot.b(new dxu(dyoVar.c, 1678));
        this.g = axot.b(new dxu(dyoVar.c, 1679));
        this.h = axot.b(new dxu(dyoVar.c, 1680));
        this.i = axot.b(new dxu(dyoVar.c, 1681));
        this.j = axot.b(new dxu(dyoVar.c, 1682));
        this.k = axot.b(new dxu(dyoVar.c, 1683));
        this.l = axot.b(new dxu(dyoVar.c, 1684));
        this.bG = axot.b(new dxu(dyoVar.c, 1687));
        this.m = axot.b(new dxu(dyoVar.c, 1686));
        this.n = axot.b(new dxu(dyoVar.c, 1688));
        this.o = axot.b(new dxu(dyoVar.c, 1692));
        this.bH = new dxu(dyoVar.c, 1691);
        this.bI = axot.b(new dxu(dyoVar.c, 1698));
        this.bJ = axot.b(new dxu(dyoVar.c, 1697));
        this.p = new dxu(dyoVar.c, 1696);
        this.q = axot.b(new dxu(dyoVar.c, 1695));
        this.r = axot.b(new dxu(dyoVar.c, 1694));
        this.bK = new dxu(dyoVar.c, 1693);
        this.s = axpb.a(new dxu(dyoVar.c, 1699));
        this.t = axpb.a(new dxu(dyoVar.c, 1700));
        this.u = axot.b(new dxu(dyoVar.c, 1701));
        this.v = axot.b(new dxu(dyoVar.c, 1703));
        this.w = axot.b(new dxu(dyoVar.c, 1704));
        this.x = axot.b(new dxu(dyoVar.c, 1705));
        this.y = axot.b(new dxu(dyoVar.c, 1706));
        this.z = new dxu(dyoVar.c, 1709);
        this.A = axot.b(new dxu(dyoVar.c, 1728));
        this.B = axot.b(new dxu(dyoVar.c, 1727));
        this.C = axot.b(new dxu(dyoVar.c, CardboardDevice$DeviceParams.INTERNAL_FIELD_NUMBER));
        this.D = axot.b(new dxu(dyoVar.c, 1748));
        this.E = axot.b(new dxu(dyoVar.c, 1750));
        this.F = axot.b(new dxu(dyoVar.c, 1749));
        this.G = axpb.a(new dxu(dyoVar.c, 1756));
        this.H = axot.b(new dxu(dyoVar.c, 1757));
        this.bL = new dxu(dyoVar.c, 1759);
        this.bM = new dxu(dyoVar.c, 1760);
        this.bN = new dxu(dyoVar.c, 1761);
        this.bO = new dxu(dyoVar.c, 1762);
        this.bP = new dxu(dyoVar.c, 1763);
        this.I = axpb.a(new dxu(dyoVar.c, 1758));
        this.f192J = new dxu(dyoVar.c, 1765);
        this.K = axpb.a(new dxu(dyoVar.c, 1764));
        this.L = axpb.a(new dxu(dyoVar.c, 1766));
        this.bQ = new dxu(dyoVar.c, 1755);
        this.M = axot.b(new dxu(dyoVar.c, 1754));
        this.N = axot.b(new dxu(dyoVar.c, 1753));
        this.O = axot.b(new dxu(dyoVar.c, 1752));
        this.P = axot.b(new dxu(dyoVar.c, 1751));
        this.Q = axot.b(new dxu(dyoVar.c, 1767));
        this.R = axot.b(new dxu(dyoVar.c, 1768));
        this.S = axot.b(new dxu(dyoVar.c, 1771));
        this.T = axot.b(new dxu(dyoVar.c, 1770));
        this.U = axot.b(new dxu(dyoVar.c, 1769));
        this.V = axot.b(new dxu(dyoVar.c, 1773));
        this.W = axot.b(new dxu(dyoVar.c, 1775));
        this.X = axot.b(new dxu(dyoVar.c, 1776));
        this.Y = axot.b(new dxu(dyoVar.c, 1774));
        this.Z = axot.b(new dxu(dyoVar.c, 1777));
        this.bR = axot.b(new dxu(dyoVar.c, 1779));
        this.aa = axot.b(new dxu(dyoVar.c, 1780));
        this.ab = axot.b(new dxu(dyoVar.c, 1778));
        this.ac = axot.b(new dxu(dyoVar.c, 1781));
        this.ad = axot.b(new dxu(dyoVar.c, 1782));
        this.ae = axot.b(new dxu(dyoVar.c, 1783));
        this.af = axpb.a(new dxu(dyoVar.c, 1784));
        this.ag = axot.b(new dxu(dyoVar.c, 1785));
        this.ah = axot.b(new dxu(dyoVar.c, 1786));
        this.ai = axot.b(new dxu(dyoVar.c, 1787));
        this.aj = axot.b(new dxu(dyoVar.c, 1788));
        this.ak = axot.b(new dxu(dyoVar.c, 1789));
        this.al = axot.b(new dxu(dyoVar.c, 1791));
        this.am = new dxu(dyoVar.c, 1792);
        this.an = new dxu(dyoVar.c, 1793);
        this.ao = new dxu(dyoVar.c, 1794);
        this.ap = axot.b(new dxu(dyoVar.c, 1795));
        this.aq = axot.b(new dxu(dyoVar.c, 1796));
        this.ar = axot.b(new dxu(dyoVar.c, 1798));
        this.as = axot.b(new dxu(dyoVar.c, 1799));
        this.bS = new dxu(dyoVar.c, 1801);
        this.at = axot.b(new dxu(dyoVar.c, 1800));
        this.au = axot.b(new dxu(dyoVar.c, 1803));
        this.av = axot.b(new dxu(dyoVar.c, 1804));
        this.aw = axot.b(new dxu(dyoVar.c, 1805));
        this.ax = axot.b(new dxu(dyoVar.c, 1807));
        this.ay = axot.b(new dxu(dyoVar.c, 1806));
        this.az = axpb.a(new dxu(dyoVar.c, 1809));
        this.aA = axot.b(new dxu(dyoVar.c, 1808));
        this.aB = axot.b(new dxu(dyoVar.c, 1833));
        this.aC = axot.b(new dxu(dyoVar.c, 1834));
        this.aD = new dxu(dyoVar.c, 1835);
        this.aE = axot.b(new dxu(dyoVar.c, 1836));
        this.aF = axot.b(new dxu(dyoVar.c, 1837));
        this.aG = axot.b(new dxu(dyoVar.c, 1838));
        this.aH = axot.b(new dxu(dyoVar.c, 1839));
        this.aI = axot.b(new dxu(dyoVar.c, 1840));
        this.aJ = axpb.a(new dxu(dyoVar.c, 1842));
        this.aK = axot.b(new dxu(dyoVar.c, 1841));
        this.aL = axot.b(new dxu(dyoVar.c, 1843));
        this.aM = axot.b(new dxu(dyoVar.c, 1846));
        this.aN = axot.b(new dxu(dyoVar.c, 1845));
        new dxu(dyoVar.c, 1848);
        this.aO = axot.b(new dxu(dyoVar.c, 1847));
        this.aP = axot.b(new dxu(dyoVar.c, 1844));
        this.aQ = axot.b(new dxu(dyoVar.c, 1849));
        this.aR = axot.b(new dxu(dyoVar.c, 1850));
        this.aS = axot.b(new dxu(dyoVar.c, 1851));
        this.bT = axot.b(new dxu(dyoVar.c, 1853));
        this.bU = new dxu(dyoVar.c, 1854);
        this.bV = new dxu(dyoVar.c, 1855);
        this.bW = new dxu(dyoVar.c, 1857);
        this.bX = new dxu(dyoVar.c, 1858);
        this.bY = new dxu(dyoVar.c, 1859);
        this.bZ = new dxu(dyoVar.c, 1860);
        this.ca = new dxu(dyoVar.c, 1856);
        this.cb = new dxu(dyoVar.c, 1861);
        this.cc = new dxu(dyoVar.c, 1862);
        this.cd = new dxu(dyoVar.c, 1863);
        this.ce = new dxu(dyoVar.c, 1864);
        this.cf = new dxu(dyoVar.c, 1865);
        this.aT = axot.b(new dxu(dyoVar.c, 1852));
        this.cg = new dxu(dyoVar.c, 1867);
        this.aU = axot.b(new dxu(dyoVar.c, 1866));
        this.aV = axot.b(new dxu(dyoVar.c, 1868));
        this.aW = axot.b(new dxu(dyoVar.c, 1869));
        this.aX = axot.b(new dxu(dyoVar.c, 1870));
        this.aY = axot.b(new dxu(dyoVar.c, 1871));
        this.aZ = axot.b(new dxu(dyoVar.c, 1873));
        this.ch = new dxu(dyoVar.c, 1875);
        this.ba = axot.b(new dxu(dyoVar.c, 1874));
        this.bb = axot.b(new dxu(dyoVar.c, 1876));
        this.bc = axot.b(new dxu(dyoVar.c, 1872));
        this.bd = axot.b(new dxu(dyoVar.c, 1877));
        this.be = axot.b(new dxu(dyoVar.c, 1879));
        this.bf = axot.b(new dxu(dyoVar.c, 1880));
        this.bg = axot.b(new dxu(dyoVar.c, 1881));
        this.bh = axot.b(new dxu(dyoVar.c, 1882));
        this.bi = axot.b(new dxu(dyoVar.c, 1883));
        this.bj = axot.b(new dxu(dyoVar.c, 1884));
        this.bk = axot.b(new dxu(dyoVar.c, 1885));
        this.bl = axot.b(new dxu(dyoVar.c, 1886));
        this.bm = axot.b(new dxu(dyoVar.c, 1887));
        this.bn = axot.b(new dxu(dyoVar.c, 1888));
        this.bo = axot.b(new dxu(dyoVar.c, 1889));
        dxu dxuVar = new dxu(dyoVar.c, 1890);
        this.ci = dxuVar;
        this.bp = axot.b(dxuVar);
        this.bq = axot.b(new dxu(dyoVar.c, 1892));
        this.br = axot.b(new dxu(dyoVar.c, 1893));
        this.bs = new dxu(dyoVar.c, 1894);
        this.bt = axot.b(new dxu(dyoVar.c, 1895));
        this.cj = axpb.a(new dxu(dyoVar.c, 1897));
        this.bu = axot.b(new dxu(dyoVar.c, 1896));
        this.bv = axot.b(new dxu(dyoVar.c, 1898));
        this.bw = axot.b(new dxu(dyoVar.c, 1899));
        this.bx = axot.b(new dxu(dyoVar.c, 1900));
        this.by = new dxu(dyoVar.c, 1901);
        this.ck = axot.b(new dxu(dyoVar.c, 1903));
        this.bz = axot.b(new dxu(dyoVar.c, 1902));
        this.cl = axot.b(new dxu(dyoVar.c, 1906));
        this.cm = axot.b(new dxu(dyoVar.c, 1905));
        this.cn = axot.b(new dxu(dyoVar.c, 1907));
        this.bA = axot.b(new dxu(dyoVar.c, 1904));
        this.bB = axot.b(new dxu(dyoVar.c, 1908));
        this.bC = axot.b(new dxu(dyoVar.c, 1909));
        this.bD = axot.b(new dxu(dyoVar.c, 1910));
        this.bE = axot.b(new dxu(dyoVar.c, 1912));
    }

    private final jul ap() {
        jtv jtvVar = jtv.VIDEO;
        jtr jtrVar = new jtr(this.bF.c.nR, 5, (int[]) null);
        jtv jtvVar2 = jtv.ZERO_STATE;
        dyo dyoVar = this.bF.c;
        juc jucVar = new juc(dyoVar.by, dyoVar.nR, 3, (char[]) null);
        jtv jtvVar3 = jtv.SECTION_HEADER;
        dyo dyoVar2 = this.bF.c;
        juc jucVar2 = new juc(dyoVar2.by, dyoVar2.nR, 2, (byte[]) null);
        jtv jtvVar4 = jtv.SMART_DOWNLOADS_OPT_IN_BANNER;
        dyo dyoVar3 = this.bF.c;
        jue jueVar = new jue(dyoVar3.by, dyoVar3.nR, dyoVar3.pj);
        jtv jtvVar5 = jtv.LOADING_SPINNER;
        dyo dyoVar4 = this.bF.c;
        return new jul(amup.o(jtvVar, jtrVar, jtvVar2, jucVar, jtvVar3, jucVar2, jtvVar4, jueVar, jtvVar5, new juc(dyoVar4.by, dyoVar4.nR)), (aahf) this.bF.c.dK.get(), this.bF.c.B(), (afvn) this.bF.c.au.get(), (fcu) this.bF.c.gY.get(), (jsf) this.bF.c.pj.get(), (Executor) this.bF.c.h.get());
    }

    private final tli aq() {
        ankw ankwVar = (ankw) this.bF.c.h.get();
        tlf tlfVar = new tlf(4, null);
        int i = tlfVar.b;
        boolean z = true;
        if (i != 4 && i != 3) {
            z = false;
        }
        aqxo.p(z);
        return new tlh(ankwVar, amvn.r(new tmo(tlfVar)));
    }

    private final Map ar() {
        jus jusVar;
        jus jusVar2;
        jtv jtvVar = jtv.VIDEO;
        azqb azqbVar = this.bW;
        azqb azqbVar2 = this.bX;
        if (((fbu) this.bF.c.Aa.get()).b()) {
            jusVar = (jus) azqbVar2.get();
        } else {
            jusVar = (jus) azqbVar.get();
        }
        axzl.o(jusVar);
        jtv jtvVar2 = jtv.PLAYLIST;
        azqb azqbVar3 = this.bY;
        azqb azqbVar4 = this.bZ;
        if (((fbu) this.bF.c.Aa.get()).b()) {
            jusVar2 = (jus) azqbVar4.get();
        } else {
            jusVar2 = (jus) azqbVar3.get();
        }
        axzl.o(jusVar2);
        jtv jtvVar3 = jtv.ZERO_STATE;
        dyo dyoVar = this.bF.c;
        juc jucVar = new juc(dyoVar.nz, dyoVar.kI, 5, (int[]) null);
        jtv jtvVar4 = jtv.SECTION_HEADER;
        dyo dyoVar2 = this.bF.c;
        return amup.o(jtvVar, jusVar, jtvVar2, jusVar2, jtvVar3, jucVar, jtvVar4, new jue(dyoVar2.nz, dyoVar2.kI, dyoVar2.Aa, 1), jtv.EXPAND_BUTTON, new jtr(this.bF.c.nS));
    }

    public final aafi A() {
        Map ad = ad();
        aafe g = aafi.g();
        g.b(ad);
        return g.a();
    }

    public final aaoy B() {
        return new aaoy((ExecutorService) this.bF.c.h.get(), (axxb) this.bF.c.ap.get(), (afvd) this.o.get(), A());
    }

    public final aasz C() {
        afvn afvnVar = (afvn) this.bF.c.au.get();
        return aasx.b((aaqj) this.bF.c.er.get(), (aaqf) this.bF.c.eV.get(), (yqw) this.bF.c.fD.get());
    }

    public final aauj D() {
        return new aauj((aaqj) this.bF.c.er.get(), (aaqf) this.bF.c.eV.get(), (afvn) this.bF.c.au.get(), (yqw) this.bF.c.fD.get());
    }

    public final aawp E() {
        return new aawp((aaqj) this.bF.c.er.get(), (aaqf) this.bF.c.eV.get(), (afvn) this.bF.c.au.get(), (yqw) this.bF.c.fB.get());
    }

    public final aaxy F() {
        return new aaxy((aaqj) this.bF.c.er.get(), (aaqf) this.bF.c.eV.get(), (afvn) this.bF.c.au.get(), (yqw) this.bF.c.fD.get());
    }

    public final aaya G() {
        return new aaya((aaqj) this.bF.c.er.get(), (aaqf) this.bF.c.eV.get(), (afvn) this.bF.c.au.get(), (yqw) this.bF.c.fD.get());
    }

    public final aayc H() {
        return new aayc((aaqj) this.bF.c.er.get(), (aaqf) this.bF.c.eV.get(), (afvn) this.bF.c.au.get(), (yqw) this.bF.c.fD.get());
    }

    public final aayf I() {
        return new aayf((aaqj) this.bF.c.er.get(), (aaqf) this.bF.c.eV.get(), (afvn) this.bF.c.au.get(), (yqw) this.bF.c.fD.get());
    }

    public final aayh J() {
        return new aayh((aaqj) this.bF.c.er.get(), (aaqf) this.bF.c.eV.get(), (afvn) this.bF.c.au.get(), (yqw) this.bF.c.fD.get());
    }

    public final aayj K() {
        return new aayj((aaqj) this.bF.c.er.get(), (aaqf) this.bF.c.eV.get(), (afvn) this.bF.c.au.get(), (yqw) this.bF.c.fD.get());
    }

    public final aazr L() {
        return new aazr((aaqj) this.bF.c.er.get(), (aaqf) this.bF.c.eV.get(), (afvn) this.bF.c.au.get(), (yqw) this.bF.c.fB.get(), (Executor) this.bF.c.h.get());
    }

    public final abfs M() {
        return new abfs((afvn) this.bF.c.au.get(), (afvd) this.bJ.get());
    }

    public final abyy N() {
        return new abyy((aaqj) this.bF.c.er.get(), (aaqf) this.bF.c.eV.get(), (afvn) this.bF.c.au.get(), (yqw) this.bF.c.fD.get(), (Executor) this.bF.c.h.get());
    }

    public final abzc O() {
        dyo dyoVar = this.bF.c;
        Context context = dyoVar.b.a;
        return new abzc((aadd) dyoVar.K.get());
    }

    public final adci P() {
        return new adci(this.bR, (adcs) this.aa.get(), (Executor) this.bF.c.h.get());
    }

    public final adhl Q() {
        return new adhl((ainz) this.bF.c.va.get(), this.bF.c.jq);
    }

    public final afvb R() {
        return new afvb((afvn) this.bF.c.au.get(), (yni) this.bF.c.y.get());
    }

    public final ainw S() {
        dyo dyoVar = this.bF.c;
        Context context = dyoVar.b.a;
        aizp aizpVar = (aizp) dyoVar.tk.get();
        aizn aiznVar = (aizn) this.bF.c.jA.get();
        List list = (List) this.cm.get();
        dyo dyoVar2 = this.bF.c;
        aioa aioaVar = new aioa(dyoVar2.b.a, dyoVar2.uU, (aizp) dyoVar2.tk.get(), ((aczr) this.bF.c.bg.get()).e, this.bF.c.jE, (xet) this.cn.get());
        return new ainw(context, aizpVar, aiznVar, ((airw) this.bF.c.fP.get()).aF(), (ainq) this.bF.c.uV.get(), aioaVar, (snc) this.bF.c.v.get(), list);
    }

    public final ainw T() {
        dyo dyoVar = this.bF.c;
        Context context = dyoVar.b.a;
        aizp aizpVar = (aizp) dyoVar.jI.get();
        aizn aiznVar = (aizn) this.bF.c.jA.get();
        dyo dyoVar2 = this.bF.c;
        aioa aioaVar = new aioa(dyoVar2.b.a, dyoVar2.uU, (aizp) dyoVar2.jI.get(), ((aczr) this.bF.c.bg.get()).e, this.bF.c.jE);
        List list = (List) this.ck.get();
        return new ainw(context, aizpVar, aiznVar, ((airw) this.bF.c.fP.get()).aF(), (ainq) this.bF.c.uV.get(), aioaVar, (snc) this.bF.c.v.get(), list);
    }

    public final akph U() {
        return new akph((akpi) this.cj.get());
    }

    public final axws V() {
        aadd aaddVar = (aadd) this.bF.c.K.get();
        return new axws((aacz) this.bF.c.D.get());
    }

    public final axxc W() {
        aacz aaczVar = (aacz) this.bF.c.D.get();
        return new axxc((aadd) this.bF.c.K.get());
    }

    public final Object X() {
        return new kjn(this.bF.c.xk);
    }

    public final Object Y() {
        return new jrq(this.bF.c.ef, this.cg);
    }

    public final Object Z() {
        dyo dyoVar = this.bF.c;
        return new agzq(dyoVar.b.a, (agyr) dyoVar.kS.get());
    }

    public final PackageManager a() {
        PackageManager c = egd.c(this.bF.c.b.a);
        axzl.o(c);
        return c;
    }

    public final String aa() {
        dyo dyoVar = this.bF.c;
        return egd.z(dyoVar.b.a, (SharedPreferences) dyoVar.t.get(), ((zen) this.bF.c.cA.get()).b("device_country", null));
    }

    public final List ab() {
        List asList = Arrays.asList((xev) this.cl.get(), (ainz) this.bF.c.va.get(), (ainp) this.bF.c.ve.get());
        axzl.o(asList);
        return asList;
    }

    public final List ac() {
        List asList = Arrays.asList((aiob) this.bF.c.uY.get(), (ainz) this.bF.c.va.get(), (aiob) this.bF.c.vc.get(), (ainp) this.bF.c.ve.get());
        axzl.o(asList);
        return asList;
    }

    public final Map ad() {
        return amup.l(augi.class, this.bH, RegisterTasksCommandOuterClass$RegisterTasksCommand.class, this.bK);
    }

    public final afvd ae() {
        afvb R = R();
        final aaoy aaoyVar = (aaoy) this.bI.get();
        aaoyVar.getClass();
        return R.a(new ampg() { // from class: aapc
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                aaoy aaoyVar2 = aaoy.this;
                ampq a = aaoyVar2.d.a((afvm) obj);
                if (!a.h()) {
                    throw new IllegalStateException("Missing PrefetchCoordinatorCallback");
                }
                aapb aapbVar = new aapb(aaoyVar2.a, aaoyVar2.c, aaoyVar2.b);
                ((aaox) a.c()).a = aapbVar;
                return aapbVar;
            }
        });
    }

    public final airy af() {
        airy aI = ((aidn) this.bF.c.eQ.get()).a.aI();
        axzl.o(aI);
        return aI;
    }

    public final tlu ag() {
        dyo dyoVar = this.bF.c;
        return new tlu(dyoVar.b.a, (ankw) dyoVar.h.get());
    }

    public final vne ah() {
        dyo dyoVar = this.bF.c;
        Context context = dyoVar.b.a;
        ankw ankwVar = (ankw) dyoVar.h.get();
        dyo dyoVar2 = this.bF.c;
        azqb azqbVar = dyoVar2.t;
        vjf a = vjg.a(context);
        a.e("videoeffects");
        a.f("videoeffects.pb");
        Uri a2 = a.a();
        vlo d = vlr.d(context, ankwVar);
        d.d("TEXT_COLOR", "BACKGROUND_COLOR", "ALIGNMENT", "FONT_FAMILY");
        d.b();
        String jp = dyo.jp();
        d.c = jp;
        d.e(fdg.e);
        vlr a3 = d.a();
        vlo d2 = vlr.d(context, ankwVar);
        d2.d("MOST_RECENT_PRESET_EFFECT_ID");
        d2.b();
        d2.c = jp;
        d2.e(fdg.f);
        vlr a4 = d2.a();
        vlo d3 = vlr.d(context, ankwVar);
        d3.d("recent_stickers");
        d3.b();
        d3.c = jp;
        d3.e(fdg.g);
        vlr a5 = d3.a();
        vlo d4 = vlr.d(context, ankwVar);
        d4.d("REEL_WELCOME_V2_ALREADY_SEEN");
        d4.b();
        d4.c = jp;
        d4.e(fdg.h);
        vlr a6 = d4.a();
        yvh d5 = yvi.d(azqbVar, ankwVar);
        d5.a = ejw.u;
        d5.b(gvq.l);
        d5.b = gvq.k;
        d5.c = fdj.k;
        yvi a7 = d5.a();
        vli a8 = vlj.a();
        a8.e(hwp.a);
        a8.b(a3);
        a8.b(a4);
        a8.b(a5);
        a8.b(a6);
        a8.b(a7);
        a8.f(a2);
        return ((vlk) dyoVar2.j.get()).a(a8.a());
    }

    public final qst ai() {
        return qki.a(this.bF.c.b.a);
    }

    public final jti aj() {
        return new jti(new jtc(this.bF.c.nS), (joc) this.bF.c.zJ.get(), 1);
    }

    public final jtr ak() {
        return new jtr(this.bF.c.nz, 1);
    }

    public final juc al() {
        dyo dyoVar = this.bF.c;
        return new juc(dyoVar.nz, dyoVar.kH, 1);
    }

    public final jtr am() {
        return new jtr(this.bF.c.nz, 6, (boolean[]) null);
    }

    public final adhl an() {
        return new adhl((ainz) this.bF.c.va.get(), this.bF.c.tn, 1);
    }

    public final txl ao() {
        return new txl((ScheduledExecutorService) this.bF.c.h.get());
    }

    public final ezq b() {
        return new ezq((acus) this.bF.c.zK.get());
    }

    public final fbs c() {
        return new fbs((aacz) this.bF.c.D.get());
    }

    public final jaw d() {
        jaw jawVar = (jaw) this.bS.get();
        axzl.o(jawVar);
        return jawVar;
    }

    public final jna e() {
        jut jutVar;
        jut jutVar2;
        Boolean bool;
        jut jutVar3;
        jus jusVar;
        aaqf aaqfVar = (aaqf) this.bF.c.eV.get();
        Executor executor = (Executor) this.bF.c.h.get();
        Executor executor2 = (Executor) this.bF.c.x.get();
        amuk v = amuk.v(jtv.BANNER_SECTION, jtv.DOWNLOADS_SECTION, jtv.SMART_DOWNLOADS_SECTION, jtv.RECOMMENDATIONS_SECTION, jtv.DISCLAIMER_SECTION);
        axzl.o(v);
        jtv jtvVar = jtv.BANNER_SECTION;
        azqb azqbVar = this.bU;
        azqb azqbVar2 = this.bV;
        asxj asxjVar = ((fbs) this.bT.get()).a.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        if (asxjVar.bI) {
            jutVar = (jut) azqbVar2.get();
        } else {
            jutVar = (jut) azqbVar.get();
        }
        axzl.o(jutVar);
        jtv jtvVar2 = jtv.DOWNLOADS_SECTION;
        azqb azqbVar3 = this.ca;
        azqb azqbVar4 = this.cb;
        if (((fbu) this.bF.c.Aa.get()).b()) {
            jutVar2 = (jut) azqbVar4.get();
        } else {
            jutVar2 = (jut) azqbVar3.get();
        }
        axzl.o(jutVar2);
        jtv jtvVar3 = jtv.DISCLAIMER_SECTION;
        azqb azqbVar5 = this.cc;
        azqb azqbVar6 = this.cd;
        aqxe aqxeVar = ((axxa) this.bF.c.nM.get()).a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45357352L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45357352L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45357352L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            jutVar3 = (jut) azqbVar6.get();
        } else {
            jutVar3 = (jut) azqbVar5.get();
        }
        axzl.o(jutVar3);
        jtv jtvVar4 = jtv.SMART_DOWNLOADS_SECTION;
        jul ap = ap();
        jtv jtvVar5 = jtv.RECOMMENDATIONS_SECTION;
        jtv jtvVar6 = jtv.HABANERO_ENTRY_POINT;
        azqb azqbVar7 = this.ce;
        azqb azqbVar8 = this.cf;
        asxj asxjVar2 = ((fbs) this.bT.get()).a.b().e;
        if (asxjVar2 == null) {
            asxjVar2 = asxj.a;
        }
        if (asxjVar2.bJ) {
            jusVar = (jus) azqbVar8.get();
        } else {
            jusVar = (jus) azqbVar7.get();
        }
        jus jusVar2 = jusVar;
        axzl.o(jusVar2);
        return new jna(aaqfVar, executor, executor2, new jup(new jtz(v, amup.o(jtvVar, jutVar, jtvVar2, jutVar2, jtvVar3, jutVar3, jtvVar4, ap, jtvVar5, new jty(amup.m(jtvVar6, jusVar2, jtv.VIDEO, new jtr(this.bF.c.nz, 3, (char[]) null), jtv.SECTION_HEADER, new jtr(this.bF.c.by, 4, (short[]) null)), (joc) this.bF.c.zJ.get(), (fcj) this.bF.c.mL.get(), (aagi) this.bF.c.dD.get())))));
    }

    public final jtd f() {
        jtv jtvVar = jtv.TRAVEL_BANNER;
        dyo dyoVar = this.bF.c;
        juc jucVar = new juc(dyoVar.nz, dyoVar.dD, 4, (short[]) null);
        jtv jtvVar2 = jtv.TEXIT_BANNER;
        dyo dyoVar2 = this.bF.c;
        return new jtd(amup.l(jtvVar, jucVar, jtvVar2, new jue(dyoVar2.nz, dyoVar2.v, dyoVar2.dD, 2, null)), (joc) this.bF.c.zJ.get());
    }

    public final jti g() {
        dyo dyoVar = this.bF.c;
        return new jti(new jtf(dyoVar.by, dyoVar.dD), (joc) this.bF.c.zJ.get());
    }

    public final jtp h() {
        return new jtp(ar(), (joc) this.bF.c.zJ.get(), (aagi) this.bF.c.dD.get(), this.bF.c.A(), this.bF.c.B(), ap(), (Executor) this.bF.c.h.get(), (fbu) this.bF.c.Aa.get());
    }

    public final juy i() {
        dyo dyoVar = this.bF.c;
        return new juy((aagi) this.bF.c.dD.get(), new jtg(dyoVar.by, dyoVar.nR), this.bF.c.A(), (afvn) this.bF.c.au.get());
    }

    public final juz j() {
        return new juz(ar(), (aagi) this.bF.c.dD.get(), this.bF.c.A(), (fcl) this.bF.c.kI.get(), (fcj) this.bF.c.mL.get(), (fbu) this.bF.c.Aa.get());
    }

    public final kug k() {
        azqb azqbVar = this.ch;
        dyo dyoVar = this.bF.c;
        return new kug(azqbVar, dyoVar.iA, (aadd) dyoVar.K.get());
    }

    public final kuh l() {
        return new kuh((SharedPreferences) this.bF.c.t.get(), this.bF.c.as);
    }

    public final lju m() {
        return new lju((acrr) this.bF.c.aw.get(), (aadd) this.bF.c.K.get(), (aacz) this.bF.c.D.get(), (ehh) this.bF.c.iu.get(), (yve) this.al.get(), azpj.b((Executor) this.bF.c.x.get()));
    }

    public final tdu n() {
        return aolu.w(((Boolean) this.bF.c.ed.get()).booleanValue(), axot.a(this.bF.c.xg), axot.a(this.bF.c.eh), axot.a(this.bF.c.aA), axot.a(this.bF.c.xh));
    }

    public final tln o() {
        return new tln((ankw) this.bF.c.h.get(), this.bQ, amvn.r(tol.a()), aq(), (snc) this.bF.c.v.get());
    }

    public final tme p() {
        return new tme((tln) this.M.get(), (snc) this.bF.c.v.get());
    }

    public final tmy q() {
        aq();
        tmy tmyVar = new tmy((tln) this.M.get(), (snc) this.bF.c.v.get());
        if (!"robolectric".equals(Build.FINGERPRINT) && !Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys")) {
            Integer num = 500;
            tmyVar.e = num.intValue();
        }
        return tmyVar;
    }

    public final tnq r() {
        return new tnq(amup.o(200000013, this.bL, 200000017, this.bM, 200000028, this.bN, 200000043, this.bO, 200000050, this.bP));
    }

    public final tom s() {
        return new tom(acsh.a, amup.k("onegoogle-android", new upn(this.bF.c.b.a)));
    }

    public final umq t() {
        View.OnClickListener onClickListener;
        uma umaVar = new uma(this.bF.c.b.a, (uqe) this.aM.get());
        ump umpVar = new ump();
        umpVar.c = new zgd();
        umpVar.a = umaVar;
        umpVar.b = ija.i;
        aqxo.z(umpVar.a != null, "Either setAvatarRetriever or setAvatarImageLoader have to be called.");
        zgd zgdVar = umpVar.c;
        if (zgdVar == null || (onClickListener = umpVar.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (umpVar.c == null) {
                sb.append(" accountConverter");
            }
            if (umpVar.b == null) {
                sb.append(" onAddAccount");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new umq(zgdVar, umpVar.a, onClickListener, null, null, null);
    }

    public final uoc u() {
        dyo dyoVar = this.bF.c;
        uob a = uoc.a(dyoVar.b.a, ulx.class);
        a.d((umq) this.aN.get());
        a.e((ExecutorService) dyoVar.h.get());
        a.f((toq) this.aO.get());
        return a.a();
    }

    public final vwq v() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.bF.c.t.get();
        wac wacVar = (wac) this.bF.c.au.get();
        wal walVar = (wal) this.bF.c.au.get();
        vzm vzmVar = (vzm) this.bF.c.dh.get();
        whp whpVar = (whp) this.bF.c.df.get();
        wea weaVar = (wea) this.bF.c.I.get();
        wge wgeVar = (wge) this.bF.c.mH.get();
        dyo dyoVar = this.bF.c;
        return new vwq(sharedPreferences, wacVar, walVar, vzmVar, whpVar, weaVar, wgeVar, dyoVar.mI, (yni) dyoVar.y.get());
    }

    public final wai w() {
        wac wacVar = (wac) this.bF.c.au.get();
        wal walVar = (wal) this.bF.c.au.get();
        aasc aascVar = (aasc) this.bF.c.mG.get();
        new vzk((aasc) this.bF.c.mG.get(), (whp) this.bF.c.df.get(), (afvy) this.bF.c.f14do.get(), (Executor) this.bF.c.h.get(), (Executor) this.bF.c.x.get(), (wea) this.bF.c.I.get());
        return new wai(wacVar, walVar, aascVar, (yni) this.bF.c.y.get(), (Executor) this.bF.c.h.get(), (whp) this.bF.c.df.get(), (wge) this.bF.c.mH.get());
    }

    public final xet x() {
        return new xet(this.bF.c.tn);
    }

    public final xev y() {
        xes xesVar = (xes) this.bF.c.tn.get();
        xev xevVar = new xev(xesVar);
        xesVar.b.add(xevVar);
        return xevVar;
    }

    public final aabt z() {
        return wjs.e((ScheduledExecutorService) this.bF.c.h.get(), (acrq) this.bF.c.ax.get(), (afvn) this.bF.c.au.get(), (afwe) this.bF.c.au.get(), (aasw) this.bF.c.pr.get(), (aasz) this.bG.get(), this.bF.c.as());
    }
}

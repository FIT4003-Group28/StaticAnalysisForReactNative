package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bowv  reason: default package */
/* loaded from: classes3.dex */
public class bowv implements Serializable {
    public final dcep<dqgh> A;
    private final Map<String, bokk> B;
    private final boxi C;
    private final bvrt<dnqe> D;
    public final ilo a;
    public final bokk b;
    public final bokk c;
    public final bokk d;
    public final bokg e;
    public final bokk f;
    public final bokk g;
    public final bowr h;
    public final bowr i;
    public final bowr j;
    public final bowr k;
    public final bowr l;
    public final bowr m;
    public final byee n;
    public final bowy o;
    public final bows p;
    public final bowt q;
    public final bokk r;
    public final boolean s;
    public final String t;
    public final bokf u;
    public final bokf v;
    public final bosj w;
    @dzsi
    public byee x;
    public boolean y;
    public boolean z;

    public bowv(ilo iloVar, dnqe dnqeVar) {
        byee al;
        bokg bokgVar;
        boolean z;
        Boolean valueOf;
        alp a = alp.a();
        dcmr<Object> dcmrVar = dcmr.a;
        this.a = iloVar;
        if (dcmrVar.contains(dqgh.BUSINESS_HOURS)) {
            al = new byee((dgfs) null, "GMT", false, false);
        } else {
            al = iloVar.al();
        }
        this.n = al;
        this.A = dcmrVar;
        dsqp dsqpVar = (dsqp) dnqeVar.cu(5);
        dsqpVar.bC(dnqeVar);
        dnps dnpsVar = (dnps) dsqpVar;
        dnqb b = dnqb.b(dnqeVar.b);
        b = b == null ? dnqb.UNKNOWN_ENTRY_POINT : b;
        dnpy bZ = dnpz.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnpz dnpzVar = (dnpz) bZ.b;
        boolean z2 = true;
        dnpzVar.a |= 1;
        dnpzVar.b = 10433;
        deaf deafVar = deaf.UNKNOWN_ACTION;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnpz dnpzVar2 = (dnpz) bZ.b;
        dnpzVar2.c = deafVar.Q;
        dnpzVar2.a |= 2;
        if (b.equals(dnqb.PLACE_CARD) && iloVar.i) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnpz dnpzVar3 = (dnpz) bZ.b;
            dnpzVar3.a |= 1;
            dnpzVar3.b = 5356;
            deaf deafVar2 = deaf.LONG_PRESS;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnpz dnpzVar4 = (dnpz) bZ.b;
            dnpzVar4.c = deafVar2.Q;
            dnpzVar4.a |= 2;
        }
        dnpz bK = bZ.bK();
        if (dnpsVar.c) {
            dnpsVar.bF();
            dnpsVar.c = false;
        }
        dnqe dnqeVar2 = (dnqe) dnpsVar.b;
        bK.getClass();
        dnqeVar2.f = bK;
        dnqeVar2.a |= 32;
        this.D = bvrt.b(dnpsVar.bK());
        boolean z3 = iloVar.ce() == doay.TYPE_GEOCODED_ADDRESS && akqi.a.equals(iloVar.ai());
        this.b = new bokk(u(iloVar), o(iloVar), false, iloVar.r());
        this.c = new bokk(u(iloVar), iloVar.s(), false, iloVar.t());
        this.d = new bokk(u(iloVar), "", false, bvom.a(Locale.getDefault()));
        this.B = dcmn.a;
        new boxj(dcdc.e(), null);
        this.C = new boxi(dcdc.e(), dbpy.a);
        if (z3) {
            bokgVar = new bokg(v(p(iloVar), dqgh.ADDRESS, dcmrVar));
        } else {
            doay ce = iloVar.ce();
            bokgVar = new bokg(Boolean.valueOf(ce == doay.TYPE_ESTABLISHMENT || ce == doay.TYPE_GEOCODED_ADDRESS).booleanValue(), v(p(iloVar), dqgh.ADDRESS, dcmrVar));
        }
        this.e = bokgVar;
        this.f = new bokk(t(iloVar), v(q(iloVar, a), dqgh.PHONE_NUMBER, dcmrVar), false);
        this.g = new bokk(Boolean.valueOf(iloVar.ce() == doay.TYPE_ESTABLISHMENT), v(r(iloVar), dqgh.WEBSITE, dcmrVar), false);
        this.p = new bows(iloVar.aj(), false);
        if (z3) {
            this.q = new bowt(t(iloVar), null, s(iloVar));
        } else {
            this.q = new bowt(t(iloVar), dcmrVar.contains(dqgh.CATEGORY) ? null : s(iloVar), null);
        }
        boolean z4 = iloVar.ce() == doay.TYPE_ROAD;
        this.s = z4;
        this.h = new bowr(Boolean.valueOf(z4), false);
        this.i = new bowr(Boolean.valueOf(z4), false);
        this.j = new bowr(Boolean.valueOf(z4), false);
        this.k = new bowr(Boolean.valueOf(z4), false);
        boolean booleanValue = t(iloVar).booleanValue();
        if (booleanValue) {
            if (iloVar.ce().ordinal() == 7) {
                dnjb dnjbVar = iloVar.cd().j;
                valueOf = Boolean.valueOf((dnjbVar == null ? dnjb.h : dnjbVar).f);
            } else {
                valueOf = Boolean.valueOf(iloVar.an());
            }
            if (valueOf.booleanValue()) {
                z = true;
                Boolean valueOf2 = Boolean.valueOf(booleanValue);
                this.l = new bowr(valueOf2, Boolean.valueOf(z));
                this.o = new bowy();
                this.m = new bowr(valueOf2, Boolean.valueOf((booleanValue || !iloVar.ao()) ? false : z2));
                this.t = m(iloVar, iloVar.cd());
                this.u = new bokf();
                bokf bokfVar = new bokf();
                this.v = bokfVar;
                bosi j = bosj.j();
                j.d(o(iloVar));
                bosg bosgVar = (bosg) j;
                bosgVar.a = al;
                bosgVar.b = al;
                j.b(bokfVar);
                j.f(iloVar.aT());
                this.w = j.a();
                this.y = false;
                this.z = false;
                this.r = new bokk("", false);
            }
        }
        z = false;
        Boolean valueOf22 = Boolean.valueOf(booleanValue);
        this.l = new bowr(valueOf22, Boolean.valueOf(z));
        this.o = new bowy();
        this.m = new bowr(valueOf22, Boolean.valueOf((booleanValue || !iloVar.ao()) ? false : z2));
        this.t = m(iloVar, iloVar.cd());
        this.u = new bokf();
        bokf bokfVar2 = new bokf();
        this.v = bokfVar2;
        bosi j2 = bosj.j();
        j2.d(o(iloVar));
        bosg bosgVar2 = (bosg) j2;
        bosgVar2.a = al;
        bosgVar2.b = al;
        j2.b(bokfVar2);
        j2.f(iloVar.aT());
        this.w = j2.a();
        this.y = false;
        this.z = false;
        this.r = new bokk("", false);
    }

    public static dbsg<dnpw> j(dnqe dnqeVar, dnpv dnpvVar) {
        for (dnpw dnpwVar : dnqeVar.h) {
            dnpv b = dnpv.b(dnpwVar.b);
            if (b == null) {
                b = dnpv.UNKNOWN_TAG;
                continue;
            }
            if (b == dnpvVar) {
                return dbsg.i(dnpwVar);
            }
        }
        return dbpy.a;
    }

    public static String m(ilo iloVar, doaz doazVar) {
        doay doayVar = doay.TYPE_ROAD;
        doay b = doay.b(doazVar.b);
        if (b == null) {
            b = doay.UNSUPPORTED;
        }
        int ordinal = b.ordinal();
        if (ordinal == 4) {
            dnnc dnncVar = doazVar.i;
            if (dnncVar == null) {
                dnncVar = dnnc.e;
            }
            return dnncVar.c;
        } else if (ordinal == 7) {
            dnjb dnjbVar = doazVar.j;
            if (dnjbVar == null) {
                dnjbVar = dnjb.h;
            }
            return dnjbVar.c;
        } else {
            return dbrz.f(' ').g(iloVar.A());
        }
    }

    public static String o(ilo iloVar) {
        doay doayVar = doay.TYPE_ROAD;
        int ordinal = iloVar.ce().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return iloVar.ch();
            }
            if (ordinal == 2) {
                return iloVar.ci();
            }
            if (ordinal == 7) {
                return iloVar.ck();
            }
            return iloVar.n();
        }
        return iloVar.cg();
    }

    public static String p(ilo iloVar) {
        doay doayVar = doay.TYPE_ROAD;
        int ordinal = iloVar.ce().ordinal();
        if (ordinal != 4) {
            if (ordinal == 7) {
                return iloVar.cl();
            }
            return dbrz.f('\n').g(iloVar.A());
        }
        return iloVar.cf();
    }

    public static String q(ilo iloVar, alp alpVar) {
        String cm;
        doay doayVar = doay.TYPE_ROAD;
        if (iloVar.ce().ordinal() == 7) {
            cm = iloVar.cm();
        } else {
            cm = iloVar.K();
        }
        String e = dbsj.e(cm);
        return !e.isEmpty() ? alpVar.b(e) : e;
    }

    public static String r(ilo iloVar) {
        doay doayVar = doay.TYPE_ROAD;
        if (iloVar.ce().ordinal() != 7) {
            return iloVar.ag() != null ? iloVar.ag().c : "";
        }
        return iloVar.cn();
    }

    @dzsi
    public static dnfw s(ilo iloVar) {
        doay doayVar = doay.TYPE_ROAD;
        int ordinal = iloVar.ce().ordinal();
        if (ordinal != 4) {
            if (ordinal != 7 || dbsj.d(iloVar.ar())) {
                return null;
            }
            String str = (iloVar.h() == null || iloVar.h().B.size() <= 0) ? "" : iloVar.h().B.get(0).b;
            dnfv bZ = dnfw.d.bZ();
            String ar = iloVar.ar();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnfw dnfwVar = (dnfw) bZ.b;
            ar.getClass();
            int i = dnfwVar.a | 2;
            dnfwVar.a = i;
            dnfwVar.c = ar;
            str.getClass();
            dnfwVar.a = i | 1;
            dnfwVar.b = str;
            return bZ.bK();
        } else if (akqi.a.equals(iloVar.ai())) {
            dnfv bZ2 = dnfw.d.bZ();
            String ar2 = iloVar.ar();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnfw dnfwVar2 = (dnfw) bZ2.b;
            ar2.getClass();
            int i2 = dnfwVar2.a | 2;
            dnfwVar2.a = i2;
            dnfwVar2.c = ar2;
            dnfwVar2.a = i2 | 1;
            dnfwVar2.b = "gcid:geocoded_address";
            return bZ2.bK();
        }
        return null;
    }

    private static Boolean t(ilo iloVar) {
        boolean z = false;
        if (iloVar.ce() == doay.TYPE_ESTABLISHMENT && !iloVar.ba()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private static Boolean u(ilo iloVar) {
        doay ce = iloVar.ce();
        boolean z = true;
        if (ce != doay.TYPE_ESTABLISHMENT && ce != doay.TYPE_POLITICAL && ce != doay.TYPE_ROAD && ce != doay.TYPE_NATURAL) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private static String v(String str, dqgh dqghVar, dcep<dqgh> dcepVar) {
        return dcepVar.contains(dqghVar) ? "" : str;
    }

    public dcdc<ilo> a() {
        return dcdc.f(this.a);
    }

    public boolean b() {
        return false;
    }

    @dzsi
    public dodb c() {
        return null;
    }

    public boxi d() {
        return this.C;
    }

    public Map<String, bokk> e() {
        return this.B;
    }

    public final boolean f() {
        return t(this.a).booleanValue();
    }

    public final boolean g() {
        return this.a.ce() == doay.TYPE_GEOCODED_ADDRESS;
    }

    public final boolean h() {
        return this.a.i && g();
    }

    public final dnqe i() {
        return this.D.e((dssr) dnqe.i.cu(7), dnqe.i);
    }

    public final boolean k() {
        dnqb b = dnqb.b(i().b);
        if (b == null) {
            b = dnqb.UNKNOWN_ENTRY_POINT;
        }
        return b == dnqb.UGC_TASK_SETS;
    }

    public final boolean l() {
        dnqb b = dnqb.b(i().b);
        if (b == null) {
            b = dnqb.UNKNOWN_ENTRY_POINT;
        }
        return b != dnqb.UGC_TASK_SETS;
    }

    public final boolean n() {
        boolean z;
        dnqe i = i();
        Iterator<dnpw> it = i.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            dnpw next = it.next();
            dnpv b = dnpv.b(next.b);
            if (b == null) {
                b = dnpv.UNKNOWN_TAG;
            }
            if (b == dnpv.REDIRECTED_TO_ADDRESS && next.c.equals("Accept")) {
                z = true;
                break;
            }
        }
        if (g()) {
            dnqb b2 = dnqb.b(i.b);
            if (b2 == null) {
                b2 = dnqb.UNKNOWN_ENTRY_POINT;
            }
            if (b2 != dnqb.PLACE_CARD_RAP_DISAMBIGUATION_MENU && !z) {
                return true;
            }
        }
        return false;
    }
}

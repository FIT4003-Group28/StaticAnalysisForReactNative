package defpackage;
/* compiled from: PG */
/* renamed from: anhy  reason: default package */
/* loaded from: classes2.dex */
public abstract class anhy {
    private static final anht a = new anht();
    public static final /* synthetic */ int k = 0;

    public static anhy l() {
        anhq p = p();
        p.g(anhw.DAY_VIEW);
        return p.k();
    }

    public static anhy m(eapg eapgVar) {
        anhq p = p();
        ((angm) p).b = eapgVar;
        p.g(anhw.DAY_VIEW);
        return p.k();
    }

    public static anhy n(long j, String str, dbsg<eapg> dbsgVar) {
        anhq j2 = l().j();
        j2.m(j);
        j2.l(str);
        if (dbsgVar.a()) {
            j2.b(dbsgVar.b());
        }
        return j2.k();
    }

    public static anhq p() {
        angm angmVar = new angm();
        angmVar.e(anhu.NO);
        angmVar.f(anhu.MAYBE);
        angmVar.d(anhu.MAYBE);
        angmVar.e = 1;
        return angmVar;
    }

    public static anhy q(aoum aoumVar) {
        return a.k().NV(aoumVar);
    }

    public abstract anhw a();

    public abstract anhu b();

    public abstract anhu c();

    public abstract anhu d();

    @dzsi
    public abstract eapd e();

    @dzsi
    public abstract eaou f();

    @dzsi
    public abstract eapg g();

    @dzsi
    public abstract String h();

    public abstract dbsg<String> i();

    public abstract anhq j();

    public abstract int k();

    public final aoum r() {
        return a.NV(this);
    }

    public static anhy o(String str, dosf dosfVar) {
        eapd eapdVar;
        dbsg dbsgVar = dbpy.a;
        if ((dosfVar.a & 2) == 0) {
            eapdVar = new eapd(dosfVar.b);
            dngq dngqVar = dosfVar.d;
            if (dngqVar == null) {
                dngqVar = dngq.d;
            }
            if ((dngqVar.a & 1) != 0) {
                dngq dngqVar2 = dosfVar.d;
                if (dngqVar2 == null) {
                    dngqVar2 = dngq.d;
                }
                dngs dngsVar = dngqVar2.b;
                if (dngsVar == null) {
                    dngsVar = dngs.h;
                }
                dbsgVar = dbsg.i(aogc.o(dngsVar));
            }
        } else {
            eapdVar = new eapd(dosfVar.c - 1);
            dngq dngqVar3 = dosfVar.d;
            if (dngqVar3 == null) {
                dngqVar3 = dngq.d;
            }
            if ((dngqVar3.a & 2) != 0) {
                dngq dngqVar4 = dosfVar.d;
                if (dngqVar4 == null) {
                    dngqVar4 = dngq.d;
                }
                dngs dngsVar2 = dngqVar4.c;
                if (dngsVar2 == null) {
                    dngsVar2 = dngs.h;
                }
                dbsgVar = dbsg.i(aogc.o(dngsVar2));
            }
        }
        return n(eapdVar.a, str, dbsgVar);
    }
}

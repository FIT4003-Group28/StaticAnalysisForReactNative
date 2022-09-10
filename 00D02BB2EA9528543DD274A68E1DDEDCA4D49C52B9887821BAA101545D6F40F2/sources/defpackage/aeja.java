package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: aeja  reason: default package */
/* loaded from: classes.dex */
public class aeja implements aeij {
    public static final iif a;
    private static final bskq f;
    private static final cqtv g;
    public final gga b;
    public final aeic c;
    @dzsi
    public final bskt d;
    public final cjtd e;
    private final btvo h;
    private final cqat i;
    private final aeiu j;
    private final boolean k;
    @dzsi
    private aehu l;
    private final aeiy n = new aeiy(this);
    private boolean m = true;

    static {
        bskp f2 = bskq.f();
        bsjo bsjoVar = (bsjo) f2;
        bsjoVar.a = dtxo.cn;
        bsjoVar.b = dtxo.co;
        bsjoVar.c = dtxo.cm;
        bsjoVar.e = dtxo.co;
        bsjoVar.d = dtxo.co;
        f = f2.a();
        cqsv c = cqsv.c(ibn.o(), ibn.o(), cqrp.d(48.0d), ibn.o());
        g = c;
        iie q = iif.r().q();
        q.f(cqrp.d(dcyn.a));
        q.e(c);
        q.d(c);
        q.c(cqrp.d(3.0d));
        q.i(cqrp.d(dcyn.a));
        q.o(cqrp.d(174.0d));
        q.h(ibm.Z());
        a = q.a();
    }

    public aeja(gga ggaVar, btvo btvoVar, cqat cqatVar, aeiv aeivVar, aeic aeicVar, dxio<bskt> dxioVar, @dzsi acwt acwtVar, aeit aeitVar, cjtd cjtdVar) {
        this.h = btvoVar;
        this.i = cqatVar;
        this.b = ggaVar;
        this.c = aeicVar;
        aeicVar.d(acwtVar);
        this.j = aeivVar.a(new aeim(this) { // from class: aeiw
            private final aeja a;

            {
                this.a = this;
            }

            @Override // defpackage.aeim
            public final void a(cjqm cjqmVar) {
                aeja aejaVar = this.a;
                aejaVar.c.f(cjqmVar, dbpy.a, aejaVar.j());
            }
        }, new aeir(this) { // from class: aeix
            private final aeja a;

            {
                this.a = this;
            }

            @Override // defpackage.aeir
            public final void a(ilo iloVar, cjqm cjqmVar) {
                aeja aejaVar = this.a;
                aejaVar.c.f(cjqmVar, dbsg.i(iloVar), aejaVar.j());
            }
        }, a, dbpy.a, new aeiz(this), 4, aeitVar, true);
        this.e = cjtdVar;
        this.k = true;
        bskt a2 = dxioVar.a();
        this.d = a2;
        if (a2 != null) {
            a2.c(aeicVar.j());
            a2.d(f, new bsjm());
        }
        k(null);
    }

    private final void k(@dzsi djrm djrmVar) {
        this.j.g();
        if (djrmVar == null) {
            return;
        }
        this.c.c(j() ? dbsg.i(this.n) : dbpy.a);
        ArrayList arrayList = new ArrayList(djrmVar.e.size());
        for (dvyw dvywVar : djrmVar.e) {
            ily ilyVar = new ily();
            ilyVar.E(dvywVar);
            arrayList.add(ilyVar.d());
        }
        this.j.f(arrayList);
        this.m = djrmVar.t;
        if (djrmVar.e.size() > 0 && (djrmVar.e.get(0).b & 1024) != 0) {
            dnng dnngVar = djrmVar.e.get(0).X;
            if (dnngVar == null) {
                dnngVar = dnng.r;
            }
            if (!aehr.b(dnngVar)) {
                this.l = null;
            } else {
                dnnn dnnnVar = dnngVar.b;
                if (dnnnVar == null) {
                    dnnnVar = dnnn.l;
                }
                this.l = aehr.d(dnnnVar);
            }
        }
        this.c.a(djrmVar);
    }

    @Override // defpackage.aeij
    public void a(@dzsi djrm djrmVar) {
        k(djrmVar);
        cqkx.p(this);
    }

    @Override // defpackage.aeij
    public boolean b() {
        return this.j.a().booleanValue();
    }

    @Override // defpackage.aeij
    public CharSequence c() {
        if (!dbsj.d(null)) {
            return null;
        }
        return this.b.getString(true != i() ? R.string.EXPLORE_NEARBY_HOTELS_TITLE : R.string.NEARBY_HOTELS_TITLE_FOR_REFINEMENTS);
    }

    @Override // defpackage.aeij
    @dzsi
    public CharSequence d() {
        if (this.l == null || i()) {
            return null;
        }
        aehu aehuVar = this.l;
        dbsk.s(aehuVar);
        eapg eapgVar = new eapg(this.i.b(), aehu.b);
        if (aehuVar.equals(new aehu(eapgVar, eapgVar.p(1)))) {
            return this.b.getString(R.string.EXPLORE_NEARBY_HOTELS_SUBTITLE_TONIGHT);
        }
        gga ggaVar = this.b;
        aehu aehuVar2 = this.l;
        dbsk.s(aehuVar2);
        return ggaVar.getString(R.string.EXPLORE_NEARBY_HOTELS_SUBTITLE, new Object[]{aehuVar2.b(this.b)});
    }

    @Override // defpackage.aeij
    public cqkl e() {
        gei.a(this.b, aehm.g(this.m));
        return cqkl.a;
    }

    @Override // defpackage.aeij
    public CharSequence f() {
        return this.b.getString(R.string.EXPLORE_NEARBY_HOTELS_ABOUT_PRICING_CONTENT_DESCRIPTION);
    }

    @Override // defpackage.aeij
    public aeii g() {
        return this.j;
    }

    @Override // defpackage.aeij
    @dzsi
    public bskr h() {
        if (i()) {
            return this.d;
        }
        return null;
    }

    public final boolean i() {
        bskt bsktVar;
        return j() && (bsktVar = this.d) != null && !bsktVar.a().isEmpty();
    }

    public final boolean j() {
        return this.k && this.h.getPassiveAssistParameters().o();
    }
}

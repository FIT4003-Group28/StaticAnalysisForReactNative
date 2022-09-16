package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: anzo  reason: default package */
/* loaded from: classes2.dex */
public class anzo extends anul implements aoaa, anzn {
    private static final dcqe a = dcqe.c("anzo");
    private final String b;
    private final String c;
    private final dcdc<cqkp> d;
    private final aoij e;
    private final anzb f;
    private final anhg g;
    private final aogb h;
    private final aohc i;
    private final dcdc<dvan> j;
    private final aoiw k;
    private final aogw l;
    private boolean m;
    @dzsi
    private aoiu n;

    public anzo(aohc aohcVar, aoge aogeVar, anzb anzbVar, String str, Application application, bvsl bvslVar, antx antxVar, anrz anrzVar, anhg anhgVar, apkr apkrVar, bbut bbutVar, aoiw aoiwVar, aogw aogwVar) {
        super(str);
        int i;
        int i2;
        dcdc<dvay> dcdcVar;
        dpop dpopVar;
        this.b = apka.c(application, aohcVar.b(), aohcVar.c()).toString();
        int i3 = aohcVar.d;
        int i4 = 1;
        this.c = i3 != 0 ? bvslVar.c(i3, null, true, true) : "";
        dccx F = dcdc.F();
        dpop d = aohcVar.d();
        dcdc<dvay> dcdcVar2 = aohcVar.a;
        int size = dcdcVar2.size();
        int i5 = 0;
        while (i5 < size) {
            dvay dvayVar = dcdcVar2.get(i5);
            int i6 = dvayVar.b;
            if (i6 == 9) {
                antx.a(dvayVar, i4);
                antx.a(d, 2);
                antx.a(aogeVar, 3);
                anri a2 = antxVar.a.a();
                antx.a(a2, 5);
                anpb a3 = antxVar.b.a();
                antx.a(a3, 6);
                anpc a4 = antxVar.c.a();
                antx.a(a4, 7);
                bvsl a5 = antxVar.d.a();
                antx.a(a5, 8);
                i = i5;
                i2 = size;
                dcdcVar = dcdcVar2;
                dpopVar = d;
                F.g(new antw(dvayVar, d, aogeVar, false, a2, a3, a4, a5));
            } else {
                i = i5;
                i2 = size;
                dcdcVar = dcdcVar2;
                dpopVar = d;
                if (i6 == 7) {
                    cqta b = aogeVar.d.b(aohcVar.e);
                    F.g(new anxy(aogeVar, dvayVar, anwo.e(b, b, b, irg.N()), str, anrzVar, apkrVar));
                }
            }
            i5 = i + 1;
            d = dpopVar;
            dcdcVar2 = dcdcVar;
            size = i2;
            i4 = 1;
        }
        dcdc<cqkp> f = F.f();
        this.d = f;
        this.e = aoim.b(bbutVar, aohcVar.b);
        this.j = aohcVar.c;
        this.f = anzbVar;
        this.m = false;
        int size2 = f.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                break;
            }
            cqkp cqkpVar = f.get(i7);
            if ((cqkpVar instanceof antv) && ((antv) cqkpVar).e().booleanValue()) {
                this.m = true;
                break;
            }
            i7++;
        }
        this.h = aogeVar.g();
        this.i = aohcVar;
        this.g = anhgVar;
        this.k = aoiwVar;
        this.l = aogwVar;
    }

    @Override // defpackage.anzn
    public anzb a() {
        return this.f;
    }

    @Override // defpackage.anzn
    public String c() {
        return this.b;
    }

    @Override // defpackage.anul
    public dcdc<dvan> d() {
        return this.j;
    }

    @Override // defpackage.anzn
    public String e() {
        return this.c;
    }

    @Override // defpackage.anul
    public final Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is-expanded", j().booleanValue());
        return bundle;
    }

    @Override // defpackage.anul
    public final void g(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("is-expanded")) {
            bvoo.h("Expected bundle with key is-expanded", new Object[0]);
        } else {
            p(bundle.getBoolean("is-expanded"));
        }
    }

    @Override // defpackage.anzn
    public dcdc<cqkp> h() {
        return this.d;
    }

    @Override // defpackage.anzn
    public aoij i() {
        return this.e;
    }

    @Override // defpackage.anzn
    public Boolean j() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.anzn
    public cqkl k() {
        p(!j().booleanValue());
        return cqkl.a;
    }

    @Override // defpackage.anzn
    public cjtd l() {
        return cjtd.a(dtyi.bT);
    }

    @Override // defpackage.anzn
    public cqkl m() {
        anhg anhgVar = this.g;
        dbpy<Object> dbpyVar = dbpy.a;
        aogb aogbVar = this.h;
        dpop d = this.i.d();
        aohc aohcVar = this.i;
        aogf d2 = aogf.d(aohcVar.b(), aohcVar.c());
        int i = 1;
        if (true == ((dvay) dcft.s(aohcVar.a)).r) {
            i = 2;
        }
        anhgVar.k(dbpyVar, aogbVar, dbsg.i(anho.c(d, aogy.c(d2, i))), dbpy.a, dbpy.a);
        return cqkl.a;
    }

    @Override // defpackage.anzn
    public Boolean n() {
        return Boolean.valueOf(this.l.b(this.j));
    }

    @Override // defpackage.anzn
    public aoiu o() {
        if (this.n == null) {
            this.n = this.k.a(this.j, dcdc.e(), dqgd.c);
        }
        return this.n;
    }

    public void p(boolean z) {
        if (this.m != z) {
            this.m = z;
            cqkx.p(this);
        }
    }

    @Override // defpackage.aoaa
    public eapd v() {
        return new eapd(TimeUnit.SECONDS.toMillis(this.i.b().b));
    }

    @Override // defpackage.aoaa
    public eapd w() {
        return new eapd(TimeUnit.SECONDS.toMillis(this.i.c().b));
    }
}

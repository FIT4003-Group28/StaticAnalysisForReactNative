package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: aeiu  reason: default package */
/* loaded from: classes2.dex */
public class aeiu implements aeii {
    public static final /* synthetic */ int b = 0;
    private static final cqtd c = iva.e(cqqg.a((int) R.drawable.illy_default_hotel), cqqg.a((int) R.drawable.illy_default_hotel_dark));
    public final aeir a;
    private final bnjv d;
    private final ahjq e;
    private final iif f;
    private final int g;
    private final aeit h;
    private final iic i;
    private iid j;
    private final boolean k;
    private boolean l;

    public aeiu(bvpe bvpeVar, huc hucVar, bnjv bnjvVar, aeio aeioVar, ahjq ahjqVar, aeim aeimVar, aeir aeirVar, iif iifVar, dbsg<igq> dbsgVar, ihz ihzVar, int i, aeit aeitVar, boolean z) {
        this.d = bnjvVar;
        this.a = aeirVar;
        this.f = iifVar;
        this.g = i;
        this.h = aeitVar;
        this.e = ahjqVar;
        this.k = z;
        final cjtd a = cjtd.a(aeitVar.a());
        iic j = iid.j();
        j.e(dcdc.e());
        abiz abizVar = new abiz();
        cjtd a2 = cjtd.a(aeitVar.c());
        Activity activity = (Activity) ((dxjd) aeioVar.a).a;
        aeio.a(activity, 1);
        aeio.a(aeimVar, 2);
        aeio.a(a2, 3);
        ifj ifjVar = (ifj) j;
        ifjVar.a = cqgr.fT(abizVar, new aein(activity, aeimVar, a2));
        ifjVar.d = ihzVar;
        ifjVar.b = iifVar;
        ifjVar.e = new bvob(bvpeVar.b, hucVar.a(new htz(a) { // from class: aeip
            private final cjtd a;

            {
                this.a = a;
            }

            @Override // defpackage.htz
            public final cjtd a() {
                cjtd cjtdVar = this.a;
                int i2 = aeiu.b;
                return cjtdVar;
            }

            @Override // defpackage.htz
            public final cjql b() {
                return null;
            }
        }));
        ifjVar.f = a;
        this.i = j;
        if (dbsgVar.a()) {
            ((ifj) j).c = dbsgVar.b();
        }
        this.j = j.f();
    }

    private final void h(dcdc<cqix<? extends igw>> dcdcVar) {
        iic iicVar = this.i;
        iicVar.e(dcdcVar);
        this.j = iicVar.f();
    }

    @Override // defpackage.iqe
    public Boolean a() {
        return Boolean.valueOf(!this.j.a().isEmpty());
    }

    @Override // defpackage.iqe
    public Boolean b() {
        return Boolean.valueOf(this.j.a().isEmpty());
    }

    @Override // defpackage.iqe
    public iib c() {
        return this.j;
    }

    @Override // defpackage.aeii
    public Boolean d() {
        boolean z = false;
        if (this.k && this.l) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aeii
    public Integer e() {
        return Integer.valueOf(this.g);
    }

    public void f(List<ilo> list) {
        g();
        this.l = true;
        dccx F = dcdc.F();
        int i = 0;
        for (final ilo iloVar : list) {
            bnjs a = this.d.a(iloVar);
            a.a = new bnjt(this, iloVar) { // from class: aeiq
                private final aeiu a;
                private final ilo b;

                {
                    this.a = this;
                    this.b = iloVar;
                }

                @Override // defpackage.bnjt
                public final void a(cjqm cjqmVar) {
                    aeiu aeiuVar = this.a;
                    aeiuVar.a.a(this.b, cjqmVar);
                }
            };
            a.c = this.e.a();
            cjta c2 = cjtd.c(cjtd.a(this.h.b()));
            c2.i(i);
            a.n = c2.a();
            a.q = c;
            bnju a2 = a.a();
            F.g(a2);
            this.l = this.l && !a2.t().isEmpty();
            i++;
        }
        dccx F2 = dcdc.F();
        dcdc f = F.f();
        int size = f.size();
        for (int i2 = 0; i2 < size; i2++) {
            F2.g(cqgr.fT(new aeie(this.f.f(), this.g, d().booleanValue()), (jba) f.get(i2)));
        }
        h(F2.f());
    }

    public void g() {
        h(dcdc.e());
        this.l = false;
    }
}

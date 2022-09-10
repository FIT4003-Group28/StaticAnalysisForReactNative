package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: asjp  reason: default package */
/* loaded from: classes2.dex */
public final class asjp implements qcy<dbsg<asjo>> {
    private final Context a;
    private final bvjj b;
    private final dxio<ahjq> c;
    private final dxio<axwq> d;
    private final vxa e;
    private final vwv f;
    private final qeg g;

    public asjp(Activity activity, bvjj bvjjVar, dxio<ahjq> dxioVar, dxio<axwq> dxioVar2, vxa vxaVar, vwv vwvVar, qeg qegVar) {
        this.a = activity;
        this.b = bvjjVar;
        this.c = dxioVar;
        this.d = dxioVar2;
        this.e = vxaVar;
        this.f = vwvVar;
        this.g = qegVar;
    }

    @Override // defpackage.qcy
    public final /* bridge */ /* synthetic */ dbsg<asjo> a(qct qctVar) {
        amte n;
        qbn n2 = qctVar.n();
        return (n2 == null || (n = n2.a().n()) == null || !zba.d(this.a, this.b, this.c.a(), n, 0, this.f)) ? dbpy.a : dbsg.i(asjo.b(this.e, n, 0, true, false, false, qctVar.j()));
    }

    @Override // defpackage.qcy
    public final /* bridge */ /* synthetic */ dbsg<asjo> b(qcx qcxVar) {
        amvh g = qcxVar.g();
        if (g != null && g.k()) {
            dqvj f = qcxVar.f();
            if (f == null) {
                f = vxx.a(this.b);
            }
            if (f == dqvj.TWO_WHEELER && !this.g.b()) {
                f = vxx.c;
            }
            dcdc<amvh> dcdcVar = null;
            if (true != vxx.f(f)) {
                f = null;
            }
            if (f != null) {
                dcdc<amvh> h = qcxVar.h();
                if (!h.isEmpty()) {
                    EnumMap<dpjs, azva> i = amvj.i(this.d.a().n());
                    dccx F = dcdc.F();
                    int size = h.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            dcdcVar = F.f();
                            break;
                        }
                        amvh amvhVar = h.get(i2).K(i).a;
                        if (!amvhVar.c()) {
                            break;
                        }
                        F.g(amvhVar);
                        i2++;
                    }
                }
                if (dcdcVar != null) {
                    qcw w = qcxVar.w();
                    w.s(f);
                    w.b(dcdcVar);
                    qcx a = w.a();
                    asjo asjoVar = new asjo();
                    asjoVar.j = true;
                    asjoVar.k = false;
                    asjoVar.p = a;
                    asjoVar.m = a.d();
                    asjoVar.o = a.p();
                    return dbsg.i(asjoVar);
                }
            }
        }
        return dbpy.a;
    }
}

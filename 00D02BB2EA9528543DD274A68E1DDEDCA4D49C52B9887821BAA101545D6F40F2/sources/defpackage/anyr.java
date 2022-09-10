package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: anyr  reason: default package */
/* loaded from: classes2.dex */
public class anyr implements anyq {
    private static final eapg a = new eapg(1970, 1, 1);
    private final dcdc<anyi> b;
    private final anuv c;
    private final aoge d;
    private final eapg e;

    public anyr(Application application, bvsl bvslVar, anuv anuvVar, eapg eapgVar, aoge aogeVar) {
        dqgd dqgdVar;
        dsrj<duzx> dsrjVar = aogeVar.a().h;
        dccx F = dcdc.F();
        for (duzx duzxVar : dsrjVar) {
            int i = duzxVar.a;
            if (i == 1) {
                F.g(anyk.f(application, ((dvad) duzxVar.b).a));
            } else if (i == 3) {
                F.g(anyk.h((duzq) duzxVar.b, application, bvslVar, aogeVar.d));
            } else if (i == 4) {
                int i2 = ((dqgd) duzxVar.b).a;
                if (duzxVar.a == 4) {
                    dqgdVar = (dqgd) duzxVar.b;
                } else {
                    dqgdVar = dqgd.c;
                }
                F.g(anyk.g(application, i2, dcdc.r(dqgdVar.b)));
            }
        }
        this.b = F.f();
        this.c = anuvVar;
        this.e = eapgVar;
        this.d = aogeVar;
    }

    @Override // defpackage.anyq
    public dcdc<anyi> a() {
        return this.b;
    }

    @Override // defpackage.anyq
    public cqkl b() {
        this.c.i();
        return cqkl.a;
    }

    @Override // defpackage.anyq
    public cqkl c() {
        this.c.g();
        return cqkl.a;
    }

    @Override // defpackage.anyq
    public Boolean d() {
        return Boolean.valueOf(this.d.g().m().B(a));
    }

    @Override // defpackage.anyq
    public Boolean e() {
        return Boolean.valueOf(this.d.g().m().C(this.e));
    }
}

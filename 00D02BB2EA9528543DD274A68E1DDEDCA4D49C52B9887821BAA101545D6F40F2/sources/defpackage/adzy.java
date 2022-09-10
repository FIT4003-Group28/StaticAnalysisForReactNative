package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adzy  reason: default package */
/* loaded from: classes.dex */
public final class adzy implements aeaw {
    public final dxio<awvy> a;
    public final dxio<akox> b;
    public final Executor c;
    private final dxio<ahjq> d;
    private final aeav e;
    private final String f;
    private final Set<awvv<?>> g;

    public adzy(dxio<awvy> dxioVar, dxio<akox> dxioVar2, dxio<ahjq> dxioVar3, Executor executor, aeav aeavVar, String str, Set<awvv<?>> set) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.d = dxioVar3;
        this.c = executor;
        this.e = aeavVar;
        this.f = str;
        this.g = set;
    }

    @Override // defpackage.aeaw
    public final aeav b() {
        return this.e;
    }

    @Override // defpackage.aeaw
    public final void c(deig<Boolean> deigVar, final deig<Void> deigVar2) {
        awws u = awwt.u();
        u.t(dcdc.f(this.f));
        u.d(this.g);
        u.r(dcdc.f(deigVar));
        awwt a = u.a();
        final awvw f = awvx.f();
        f.e(a);
        GmmLocation a2 = this.d.a().a();
        if (a2 != null) {
            f.d(a2);
        }
        this.b.a().k.Pk(new Runnable(this, f, deigVar2) { // from class: adzw
            private final adzy a;
            private final awvw b;
            private final deig c;

            {
                this.a = this;
                this.b = f;
                this.c = deigVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                adzy adzyVar = this.a;
                awvw awvwVar = this.b;
                final deig deigVar3 = this.c;
                awvwVar.b(adzyVar.b.a().aa());
                adzyVar.a.a().a(awvwVar.a()).Pk(new Runnable(deigVar3) { // from class: adzx
                    private final deig a;

                    {
                        this.a = deigVar3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.j(null);
                    }
                }, adzyVar.c);
            }
        }, this.c);
    }

    @Override // defpackage.aeaw
    public final int d() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.aeaw
    public final dbsg e() {
        return dbpy.a;
    }
}

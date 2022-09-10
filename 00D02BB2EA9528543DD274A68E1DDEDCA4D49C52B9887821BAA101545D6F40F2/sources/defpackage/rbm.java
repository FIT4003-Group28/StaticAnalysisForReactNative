package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: rbm  reason: default package */
/* loaded from: classes7.dex */
public class rbm implements rbc {
    private final Activity a;
    private final Executor b;
    private final acyp c;
    private final dxio<rbx> d;
    @dzsi
    private final dxio<rbu> e;
    private final rbf f;
    private int g;
    private int h;

    public rbm(Activity activity, Executor executor, acyp acypVar, final iwl iwlVar, final rby rbyVar, final rbv rbvVar, final qud qudVar, quq quqVar) {
        this.a = activity;
        this.b = executor;
        this.c = acypVar;
        this.d = btsp.b(new dbty(rbyVar, qudVar) { // from class: rbi
            private final rby a;
            private final qud b;

            {
                this.a = rbyVar;
                this.b = qudVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                rby rbyVar2 = this.a;
                qud qudVar2 = this.b;
                Activity activity2 = (Activity) ((dxjd) rbyVar2.a).a;
                rby.a(activity2, 1);
                rbw a = rbyVar2.b.a();
                rby.a(a, 2);
                rby.a(qudVar2, 3);
                return new rbx(activity2, a, qudVar2);
            }
        });
        if (quqVar == null) {
            this.e = null;
        } else {
            this.e = btsp.b(new dbty(rbvVar) { // from class: rbj
                private final rbv a;

                {
                    this.a = rbvVar;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    Activity activity2 = (Activity) ((dxjd) this.a.a).a;
                    rbv.a(activity2);
                    return new rbu(activity2);
                }
            });
        }
        this.f = new rbf(iwlVar) { // from class: rbk
            private final iwl a;

            {
                this.a = iwlVar;
            }

            @Override // defpackage.rbf
            public izi a() {
                return this.a;
            }
        };
    }

    private final void h() {
        if (this.h == 0 || this.g == 0) {
            return;
        }
        this.b.execute(new Runnable(this) { // from class: rbl
            private final rbm a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cqkx.p(this.a);
            }
        });
    }

    private final boolean i() {
        return this.e != null;
    }

    @Override // defpackage.rbc
    public Integer a() {
        return Integer.valueOf(this.c.d() ? this.h + cqrp.d(30.0d).e(this.a) : this.h);
    }

    @Override // defpackage.rbc
    public Integer b() {
        return Integer.valueOf(this.g);
    }

    @Override // defpackage.rbc
    @dzsi
    public rbh c() {
        if (i()) {
            return null;
        }
        return this.d.a();
    }

    @Override // defpackage.rbc
    @dzsi
    public rbg d() {
        if (i()) {
            return this.e.a();
        }
        return null;
    }

    public rbf e() {
        return this.f;
    }

    public void f(int i) {
        this.g = i;
        h();
    }

    public void g(int i) {
        this.h = i;
        h();
    }
}

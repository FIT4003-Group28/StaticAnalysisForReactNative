package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cazk  reason: default package */
/* loaded from: classes4.dex */
public class cazk implements cbqn {
    public final cbdh a;
    public final cbdh b;
    public final gdf c;
    public final Runnable d;
    public final Context e;
    public String f = "";
    private final cbau g;
    private final ff h;
    private final idl i;

    public cazk(Runnable runnable, gdf gdfVar, ges gesVar, final cbau cbauVar, cqkj cqkjVar, cayn caynVar, cbbc cbbcVar, cqhn cqhnVar, cbdi cbdiVar, cbqd cbqdVar) {
        this.d = runnable;
        this.h = gesVar.J();
        this.g = cbauVar;
        this.c = gdfVar;
        Context H = gesVar.H();
        this.e = H;
        dpvi b = cbauVar.b();
        cbauVar.getClass();
        cazb cazbVar = new cazb(H, b, new cbbs(cbauVar) { // from class: cazc
            private final cbau a;

            {
                this.a = cbauVar;
            }

            @Override // defpackage.cbbs
            public final dpvi a() {
                return this.a.b();
            }
        }, cqkjVar, true, null, gesVar);
        dpvi b2 = cbauVar.b();
        cbauVar.getClass();
        cbdw cbdwVar = new cbdw(H, b2, new cbbs(cbauVar) { // from class: cazd
            private final cbau a;

            {
                this.a = cbauVar;
            }

            @Override // defpackage.cbbs
            public final dpvi a() {
                return this.a.b();
            }
        }, cqkjVar, true, false, true);
        dpvi c = cbauVar.c();
        final dpvi c2 = c == null ? cbpy.c(cbauVar.b(), 1) : c;
        cazb cazbVar2 = new cazb(H, null, new cbbs(c2) { // from class: caze
            private final dpvi a;

            {
                this.a = c2;
            }

            @Override // defpackage.cbbs
            public final dpvi a() {
                return this.a;
            }
        }, cqkjVar, false, cazbVar.g(), gesVar);
        cbdw cbdwVar2 = new cbdw(H, null, new cbbs(c2) { // from class: cazf
            private final dpvi a;

            {
                this.a = c2;
            }

            @Override // defpackage.cbbs
            public final dpvi a() {
                return this.a;
            }
        }, cqkjVar, false, false, true);
        this.a = cbdi.a(null, cazbVar, cbdwVar, true, H, cbbcVar, new Runnable(this) { // from class: cazg
            private final cazk a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cazk cazkVar = this.a;
                final dpvi a = cazkVar.a.a();
                if (a != null) {
                    cazkVar.b.n(a);
                    cazkVar.b.o(new cbbs(a) { // from class: cazi
                        private final dpvi a;

                        {
                            this.a = a;
                        }

                        @Override // defpackage.cbbs
                        public final dpvi a() {
                            return cbpy.c(this.a, 1);
                        }
                    });
                    if (cazkVar.a()) {
                        cazkVar.b.m();
                    }
                }
                cazkVar.d.run();
                cqkx.p(cazkVar);
            }
        }, caynVar);
        this.b = cbdi.a(null, cazbVar2, cbdwVar2, false, H, cbbcVar, new Runnable(this) { // from class: cazh
            private final cazk a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cazk cazkVar = this.a;
                if (cazkVar.a()) {
                    cazkVar.b.q(true);
                    cazkVar.f = cazkVar.e.getString(R.string.UGC_EVENTS_ERROR_END_TIME_BEFORE_START_TIME);
                } else {
                    cazkVar.b.q(false);
                    cazkVar.f = "";
                }
                cazkVar.d.run();
                cqkx.p(cazkVar);
            }
        }, caynVar);
        this.i = cbqdVar.a(cbqv.CUSTOM);
    }

    private static boolean n(@dzsi dpvi dpviVar) {
        if (dpviVar != null) {
            int i = dpviVar.a;
            return ((i & 8) == 0 || (i & 16) == 0) ? false : true;
        }
        return false;
    }

    public final boolean a() {
        dpvi a = this.a.a();
        dpvi a2 = this.b.a();
        if (!n(a) || !n(a2)) {
            return false;
        }
        a.getClass();
        eaph a3 = cbpy.a(a);
        a2.getClass();
        return !a3.C(cbpy.a(a2));
    }

    @Override // defpackage.cbqn
    public cbqs b() {
        return this.a;
    }

    @Override // defpackage.cbqn
    public cbqs c() {
        return this.b;
    }

    @Override // defpackage.cbqn
    public jib d() {
        ff ffVar = this.h;
        jhz e = jib.g(ffVar, ffVar.getString(R.string.CUSTOM_INSTANCE_INPUT_TITLE)).e();
        e.f(new View.OnClickListener(this) { // from class: cazj
            private final cazk a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c.dismiss();
            }
        });
        e.i = cqrt.g(2131232205, ibm.t());
        e.x = true;
        return e.b();
    }

    @Override // defpackage.cbqn
    public String e() {
        return this.h.getString(R.string.CUSTOM_INSTANCE_ADD_REPETITION);
    }

    @Override // defpackage.cbqn
    public cqkl f() {
        dpsd a = this.g.a();
        if (a == null) {
            a = dpsd.f;
        }
        dqho bZ = dqhp.d.bZ();
        dpvi a2 = this.a.a();
        if (a2 != null) {
            dpnu i = cbpy.i(a2);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dqhp dqhpVar = (dqhp) bZ.b;
            i.getClass();
            dqhpVar.b = i;
            dqhpVar.a |= 1;
        }
        dpvi a3 = this.b.a();
        if (a3 != null) {
            dpnu i2 = cbpy.i(a3);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dqhp dqhpVar2 = (dqhp) bZ.b;
            i2.getClass();
            dqhpVar2.c = i2;
            dqhpVar2.a |= 2;
        }
        dsqp dsqpVar = (dsqp) a.cu(5);
        dsqpVar.bC(a);
        dpsc dpscVar = (dpsc) dsqpVar;
        dpscVar.c(bZ);
        this.g.d(dpscVar.bK());
        cqkx.p(this.g);
        this.d.run();
        this.c.dismiss();
        return cqkl.a;
    }

    @Override // defpackage.cbqn
    public Boolean g() {
        if (this.a.a() == null) {
            return false;
        }
        if (this.b.a() != null) {
            return Boolean.valueOf(!a());
        }
        return true;
    }

    @Override // defpackage.cbqn
    public String h() {
        return this.h.getString(R.string.UGC_EVENTS_CANCEL_BUTTON);
    }

    @Override // defpackage.cbqn
    public cqkl i() {
        this.c.dismiss();
        return cqkl.a;
    }

    @Override // defpackage.cbqn
    public String j() {
        return this.f;
    }

    @Override // defpackage.cbqn
    public String k() {
        return this.e.getString(R.string.STARTING_TITLE);
    }

    @Override // defpackage.cbqn
    public String l() {
        return this.e.getString(R.string.ENDING_OPTIONAL_TITLE);
    }

    @Override // defpackage.cbqn
    public idl m() {
        return this.i;
    }
}

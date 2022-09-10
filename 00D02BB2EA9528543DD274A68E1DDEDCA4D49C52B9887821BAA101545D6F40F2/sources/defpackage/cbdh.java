package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbdh  reason: default package */
/* loaded from: classes4.dex */
public class cbdh implements cbqs {
    private static final dcqe a = dcqe.c("cbdh");
    private final cayp b;
    private final cbdw c;
    private final boolean d;
    private final Context e;
    private final cbbc f;
    private final cayn g;
    @dzsi
    private final dpvi h;
    private final Runnable i;
    private boolean j = false;

    public cbdh(@dzsi dpvi dpviVar, cayp caypVar, final cbdw cbdwVar, boolean z, Context context, cbbc cbbcVar, final Runnable runnable, cayn caynVar) {
        this.h = dpviVar;
        this.b = caypVar;
        caypVar.d(new Runnable(this, cbdwVar, runnable) { // from class: cbdf
            private final cbdh a;
            private final cbdw b;
            private final Runnable c;

            {
                this.a = this;
                this.b = cbdwVar;
                this.c = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cbdh cbdhVar = this.a;
                cbdw cbdwVar2 = this.b;
                Runnable runnable2 = this.c;
                if (cbdwVar2.d == null) {
                    cbdwVar2.g();
                }
                runnable2.run();
                cqkx.p(cbdhVar);
            }
        });
        this.c = cbdwVar;
        cbdwVar.c = new Runnable(this, runnable) { // from class: cbdg
            private final cbdh a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cbdh cbdhVar = this.a;
                this.b.run();
                cqkx.p(cbdhVar);
            }
        };
        this.d = z;
        this.e = context;
        this.f = cbbcVar;
        this.i = runnable;
        this.g = caynVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dpvi s(int i, int i2, int i3, int i4, int i5) {
        if (i2 <= 0 || i2 > 12) {
            bvoo.h("Invalid month value: %d", Integer.valueOf(i2));
            i2 = 1;
        }
        if (i3 <= 0 || i3 > 31) {
            bvoo.h("Invalid day of month value: %d", Integer.valueOf(i3));
            i3 = 1;
        }
        if (i4 < 0 || i4 > 23) {
            bvoo.h("Invalid hour value: %d", Integer.valueOf(i4));
            i4 = 0;
        }
        if (i5 < 0 || i5 > 59) {
            bvoo.h("Invalid minute value: %d", Integer.valueOf(i5));
            i5 = 0;
        }
        dpvh bZ = dpvi.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpvi dpviVar = (dpvi) bZ.b;
        int i6 = 1 | dpviVar.a;
        dpviVar.a = i6;
        dpviVar.b = i;
        int i7 = i6 | 2;
        dpviVar.a = i7;
        dpviVar.c = i2;
        int i8 = i7 | 4;
        dpviVar.a = i8;
        dpviVar.d = i3;
        int i9 = i8 | 8;
        dpviVar.a = i9;
        dpviVar.e = i4;
        dpviVar.a = i9 | 16;
        dpviVar.f = i5;
        return bZ.bK();
    }

    private final void t() {
        this.g.a(cbjx.a);
    }

    @Override // defpackage.cbqs
    @dzsi
    public dpvi a() {
        dpvi g = this.b.g();
        dpvi dpviVar = this.c.d;
        if (g == null) {
            return null;
        }
        return dpviVar == null ? g : s(g.b, g.c, g.d, dpviVar.e, dpviVar.f);
    }

    @Override // defpackage.cbqs
    public String b() {
        dpvi g = this.b.g();
        return g != null ? this.f.i(g, false) : "";
    }

    @Override // defpackage.cbqs
    public String c() {
        dpvi dpviVar = this.c.d;
        return dpviVar != null ? this.f.a(dpviVar) : "";
    }

    @Override // defpackage.cbqs
    public cqkl d() {
        t();
        this.b.e();
        return cqkl.a;
    }

    @Override // defpackage.cbqs
    public cqkl e() {
        if (this.b.g() == null) {
            return d();
        }
        t();
        this.c.g();
        return cqkl.a;
    }

    @Override // defpackage.cbqs
    public String f() {
        return this.e.getResources().getString(true != this.d ? R.string.UGC_EVENTS_END_DATE_TIME_ENTRY_POINT_HINT : R.string.UGC_EVENTS_START_DATE_TIME_ENTRY_POINT_HINT);
    }

    @Override // defpackage.cbqs
    public String g() {
        return this.e.getResources().getString(true != this.d ? R.string.UGC_EVENTS_END_DATE_HINT : R.string.UGC_EVENTS_START_DATE_HINT);
    }

    @Override // defpackage.cbqs
    public String h() {
        return this.e.getResources().getString(true != this.d ? R.string.UGC_EVENTS_END_TIME_HINT : R.string.UGC_EVENTS_START_TIME_HINT);
    }

    @Override // defpackage.cbqs
    public cqkl i() {
        return d();
    }

    @Override // defpackage.cbrp
    public Boolean j() {
        dpvi a2 = a();
        dpvi dpviVar = this.h;
        boolean z = true;
        if (dpviVar == null) {
            if (a2 == null) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return Boolean.valueOf(!dpviVar.equals(a2));
    }

    @Override // defpackage.cbqs
    public Boolean k() {
        return Boolean.valueOf(this.b.g() != null);
    }

    @Override // defpackage.cbqs
    public Boolean l() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.cbqs
    public cqkl m() {
        t();
        this.b.f();
        this.c.d = null;
        this.i.run();
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.cbqs
    public void n(@dzsi dpvi dpviVar) {
        this.b.h(dpviVar);
    }

    public void o(cbbs cbbsVar) {
        this.b.i(cbbsVar);
    }

    @Override // defpackage.cbqs
    @dzsi
    public String p() {
        if (this.j) {
            return "";
        }
        return null;
    }

    @Override // defpackage.cbqs
    public void q(boolean z) {
        this.j = z;
        cqkx.p(this);
    }

    @Override // defpackage.cbqs
    public String r() {
        return this.e.getResources().getString(true != this.d ? R.string.UGC_EVENTS_END_TIME_CLEAR_DESCRIPTION : R.string.UGC_EVENTS_START_TIME_CLEAR_DESCRIPTION);
    }
}

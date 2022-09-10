package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahhv  reason: default package */
/* loaded from: classes2.dex */
public abstract class ahhv implements agxe {
    private static final ddho a = dtxu.cA;
    private final long b;
    private final afzs c;
    private final agbm d;
    private final acyp e;
    private final isd f;
    private final dxio<bwft> g;
    @dzsi
    private isc h;
    protected gga k;
    protected dlcv l;
    protected agxs m;
    @dzsi
    protected ahin n;
    public final cklf o;
    public final dxio<afzv> p;
    public final dxio<bsvm> q;
    public final agaw r;
    public final agbj s;
    public boolean t;

    /* JADX INFO: Access modifiers changed from: protected */
    public ahhv(ahht ahhtVar, dlcv dlcvVar, agyh agyhVar) {
        this.k = ahhtVar.b;
        this.e = ahhtVar.a;
        this.f = ahhtVar.d;
        this.o = ahhtVar.e;
        this.c = ahhtVar.i;
        this.q = ahhtVar.g;
        this.g = ahhtVar.h;
        this.r = ahhtVar.j;
        this.s = ahhtVar.k;
        this.p = ahhtVar.f;
        this.l = dlcvVar;
        dsqp dsqpVar = (dsqp) agyhVar.cu(5);
        dsqpVar.bC(agyhVar);
        this.m = (agxs) dsqpVar;
        this.b = TimeUnit.MICROSECONDS.toMillis(dlcvVar.e);
        this.d = new ahhu();
    }

    private final boolean A() {
        return (this.l.a & 67108864) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static cjta z(String str, int i, ddzg ddzgVar, @dzsi agyh agyhVar) {
        cjta b = cjtd.b();
        b.g(str);
        b.i(i);
        b.r(ddzgVar);
        if (agyhVar != null && !agyhVar.d.isEmpty()) {
            b.b = agyhVar.d;
            b.f = dvnp.LOCAL_STREAM;
        }
        return b;
    }

    public agbm Pg() {
        return this.d;
    }

    @Override // defpackage.agxe
    @dzsi
    public CharSequence d() {
        return null;
    }

    @Override // defpackage.agxe
    public Boolean e() {
        return Boolean.valueOf(((agyh) this.m.b).c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r2.i().booleanValue() != false) goto L10;
     */
    @Override // defpackage.agxe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cqkl f(android.view.View r6) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahhv.f(android.view.View):cqkl");
    }

    @Override // defpackage.agxe
    public int h(View view) {
        return 0;
    }

    @Override // defpackage.agxe
    public void i(View view, int i) {
    }

    @Override // defpackage.agxe
    public Boolean j() {
        return Boolean.valueOf(this.t);
    }

    @Override // defpackage.agxe
    public long k() {
        return this.b;
    }

    @Override // defpackage.agxe
    public List<agwt> l() {
        return dcdc.e();
    }

    @Override // defpackage.agxe
    public Integer m() {
        return -1;
    }

    public agyh n() {
        return this.m.bK();
    }

    @dzsi
    public agwu o() {
        return null;
    }

    public void p() {
    }

    public void q() {
        isc iscVar;
        if (Build.VERSION.SDK_INT >= 26 || (iscVar = this.h) == null) {
            return;
        }
        iscVar.dismiss();
    }

    protected List<jho> r() {
        return dcdc.e();
    }

    public dlcv t() {
        return this.l;
    }

    public Boolean u() {
        boolean z = false;
        if (A() && this.c.g() == 3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public View.OnClickListener v() {
        return new View.OnClickListener(this) { // from class: ahhk
            private final ahhv a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.y();
            }
        };
    }

    public View.OnClickListener w() {
        return new View.OnClickListener(this) { // from class: ahhm
            private final ahhv a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ahhv ahhvVar = this.a;
                ahhvVar.s.c(ahhvVar, agxk.j(view, agta.class));
            }
        };
    }

    public Boolean x() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y() {
        if ((this.l.a & 67108864) != 0) {
            bwft a2 = this.g.a();
            dqhj dqhjVar = this.l.h;
            if (dqhjVar == null) {
                dqhjVar = dqhj.h;
            }
            a2.g(dqhjVar, a);
        }
    }
}

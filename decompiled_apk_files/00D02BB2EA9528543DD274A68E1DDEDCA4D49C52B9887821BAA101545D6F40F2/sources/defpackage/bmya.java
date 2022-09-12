package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: bmya  reason: default package */
/* loaded from: classes3.dex */
public abstract class bmya implements bmxw, bega, jkk {
    private final dxio<begg> a;
    protected final Activity b;
    protected boolean c;
    @dzsi
    private izl j;
    private boolean k;
    public final bmxz h = new bmxz(this);
    private final cqqw i = new bmxy(this);
    protected boolean d = false;
    public boolean e = false;
    protected int f = 0;
    protected jjn g = jjn.HIDDEN;

    /* JADX INFO: Access modifiers changed from: protected */
    public bmya(Activity activity, dxio<begg> dxioVar) {
        this.b = activity;
        this.a = dxioVar;
    }

    protected abstract boolean a();

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r0.j() != defpackage.bege.OVERVIEW) goto L14;
     */
    @Override // defpackage.bmxw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean b() {
        /*
            r4 = this;
            boolean r0 = r4.c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2c
            izl r0 = r4.j
            if (r0 == 0) goto L15
            java.lang.Boolean r0 = r0.a()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            goto L2c
        L15:
            dxio<begg> r0 = r4.a
            java.lang.Object r0 = r0.a()
            begg r0 = (defpackage.begg) r0
            boolean r3 = r0.f()
            if (r3 == 0) goto L2d
            bege r0 = r0.j()
            bege r3 = defpackage.bege.OVERVIEW
            if (r0 != r3) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmya.b():java.lang.Boolean");
    }

    @Override // defpackage.jkk
    public void g(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        if (a() || !b().booleanValue() || this.d || this.e) {
            return;
        }
        cqkx.p(this);
    }

    @Override // defpackage.bmxw
    @dzsi
    public cqfc l(bmxv bmxvVar) {
        if (this.k) {
            this.k = false;
            final boolean z = !this.d;
            return new cqfc(this, z) { // from class: bmxx
                private final bmya a;
                private final boolean b;

                {
                    this.a = this;
                    this.b = z;
                }

                @Override // defpackage.cqfc
                public final void a(View view, boolean z2) {
                    bmya bmyaVar = this.a;
                    boolean z3 = this.b;
                    bmxz bmxzVar = bmyaVar.h;
                    int height = z3 ? 0 : view.getHeight();
                    view.setTranslationY(z3 ? view.getHeight() : 0.0f);
                    view.animate().setDuration(250L).translationY(height).setListener(new bmxs(bmxzVar, view)).start();
                }
            };
        }
        return null;
    }

    @Override // defpackage.bmxw
    public Integer m() {
        return Integer.valueOf(this.f);
    }

    @Override // defpackage.bmxw
    public String n() {
        bvsi bvsiVar = new bvsi(this.b);
        bvsiVar.c(c());
        String d = d();
        if (!dbsj.d(d)) {
            bvsiVar.c(d);
        }
        bvsiVar.e();
        return bvsiVar.toString();
    }

    public void o(jjn jjnVar) {
        this.g = jjnVar;
        a();
    }

    public void p(izl izlVar) {
        this.j = izlVar;
    }

    public cqqw q() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r() {
        this.k = true;
        this.e = true;
        cqkx.p(this);
    }

    @Override // defpackage.bega
    public Boolean w() {
        return true;
    }
}

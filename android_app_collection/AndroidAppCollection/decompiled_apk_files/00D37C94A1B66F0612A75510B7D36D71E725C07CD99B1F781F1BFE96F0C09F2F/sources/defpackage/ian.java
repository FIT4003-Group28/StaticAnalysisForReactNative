package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
/* compiled from: PG */
/* renamed from: ian  reason: default package */
/* loaded from: classes3.dex */
public final class ian implements View.OnClickListener {
    public int a;
    public final iee b;
    public final acth c;
    public View d;
    public iam e;
    public AccessibilityManager f;
    public Runnable g;
    public actj h;
    public int i = 0;
    public final vne j;
    private final iei k;

    public ian(iee ieeVar, vne vneVar, acth acthVar, iei ieiVar) {
        this.b = ieeVar;
        this.j = vneVar;
        this.c = acthVar;
        this.k = ieiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        View view = this.d;
        if (view != null) {
            hqs.c(view, false);
            this.b.c(this.i);
            this.i = 0;
            c(true);
        }
        this.d = null;
        Runnable runnable = this.g;
        if (runnable != null) {
            runnable.run();
            this.g = null;
        }
    }

    public final void b() {
        onClick(this.d);
    }

    public final void c(boolean z) {
        ien ienVar;
        iet aF = this.k.aF();
        if (aF == null || (ienVar = aF.d) == null) {
            return;
        }
        ienVar.a(z);
    }

    public final void d() {
        if (this.h == null || this.a != 3) {
            return;
        }
        this.c.oi().H(3, new acte(this.h), null);
        this.h = null;
    }

    public final void e() {
        this.j.b(gvq.m, anjk.a);
    }

    public final boolean f() {
        View view = this.d;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.d == null || !f()) {
            return;
        }
        e();
        a();
        this.a |= 2;
        d();
        iam iamVar = this.e;
        if (iamVar == null) {
            return;
        }
        ((ico) iamVar).am.c("r_eod");
    }
}

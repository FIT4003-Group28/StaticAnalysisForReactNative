package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: gyo  reason: default package */
/* loaded from: classes3.dex */
public final class gyo {
    final /* synthetic */ gyq b;
    private final acup c;
    public asjj a = null;
    private Boolean d = null;

    public gyo(gyq gyqVar, acup acupVar) {
        this.b = gyqVar;
        this.c = acupVar;
    }

    public final void a() {
        Boolean bool = this.d;
        if (bool == null || !bool.booleanValue()) {
            ((acsx) this.b.a).D(new acte(this.c));
            return;
        }
        this.b.a.n(new acte(this.c));
    }

    public final void b() {
        i(3);
    }

    public final void c() {
        i(2049);
    }

    public final void d() {
        this.b.a.q(new acte(this.c), this.a);
    }

    public final void e() {
        this.b.a.u(new acte(this.c), this.a);
    }

    public final void f() {
        i(65);
    }

    public final void h(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final void i(int i) {
        this.b.a.H(i, new acte(this.c), this.a);
    }

    public final void j(View view) {
        boolean z = false;
        if (view != null && view.getVisibility() == 0) {
            z = true;
        }
        h(z);
    }

    public final void g() {
        Boolean bool = this.d;
        if (bool == null) {
            throw new IllegalStateException("visibilityChanged() called without first calling withVisibility(...)");
        }
        if (bool.booleanValue()) {
            e();
        } else {
            d();
        }
    }
}

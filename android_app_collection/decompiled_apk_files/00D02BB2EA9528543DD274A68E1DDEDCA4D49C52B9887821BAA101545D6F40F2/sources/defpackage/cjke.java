package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
/* compiled from: PG */
/* renamed from: cjke  reason: default package */
/* loaded from: classes4.dex */
public final class cjke extends cjkp {
    public cqtv a;
    public cqtd b;
    public Float c;
    public cqtd d;
    public CharSequence e;
    public cqix<? extends cqkp> f;
    public DialogInterface.OnCancelListener g;
    private CharSequence i;
    private CharSequence j;
    private View.OnClickListener k;
    private cjtd l;
    private CharSequence m;
    private View.OnClickListener n;
    private cjtd o;
    private CharSequence p;
    private View.OnClickListener q;
    private cjtd r;
    private AlertDialog s;
    private Boolean t;
    private Boolean u;

    @Override // defpackage.cjkp
    public final View.OnClickListener a() {
        return this.k;
    }

    @Override // defpackage.cjkp
    public final View.OnClickListener b() {
        return this.n;
    }

    @Override // defpackage.cjkp
    public final DialogInterface.OnCancelListener d() {
        return this.g;
    }

    @Override // defpackage.cjkp
    public final void g(AlertDialog alertDialog) {
        if (alertDialog != null) {
            this.s = alertDialog;
            return;
        }
        throw new NullPointerException("Null alertDialog");
    }

    @Override // defpackage.cjkp
    public final void h(cqtd cqtdVar) {
        this.d = cqtdVar;
    }

    @Override // defpackage.cjkp
    public final void i(View.OnClickListener onClickListener) {
        this.q = onClickListener;
    }

    @Override // defpackage.cjkp
    public final void j(CharSequence charSequence) {
        this.p = charSequence;
    }

    @Override // defpackage.cjkp
    public final void k(cjtd cjtdVar) {
        this.r = cjtdVar;
    }

    @Override // defpackage.cjkp
    public final void l(View.OnClickListener onClickListener) {
        this.n = onClickListener;
    }

    @Override // defpackage.cjkp
    public final void m(CharSequence charSequence) {
        this.m = charSequence;
    }

    @Override // defpackage.cjkp
    public final void n(cjtd cjtdVar) {
        this.o = cjtdVar;
    }

    @Override // defpackage.cjkp
    public final void o(boolean z) {
        this.t = Boolean.valueOf(z);
    }

    @Override // defpackage.cjkp
    public final void p(View.OnClickListener onClickListener) {
        this.k = onClickListener;
    }

    @Override // defpackage.cjkp
    public final void q(CharSequence charSequence) {
        this.j = charSequence;
    }

    @Override // defpackage.cjkp
    public final void r(cjtd cjtdVar) {
        this.l = cjtdVar;
    }

    @Override // defpackage.cjkp
    public final void s(boolean z) {
        this.u = Boolean.valueOf(z);
    }

    @Override // defpackage.cjkp
    public final void t(CharSequence charSequence) {
        if (charSequence != null) {
            this.i = charSequence;
            return;
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.cjkp
    public final boolean c() {
        Boolean bool = this.t;
        if (bool == null) {
            throw new IllegalStateException("Property \"forceVerticallyStackedActions\" has not been set");
        }
        return bool.booleanValue();
    }

    @Override // defpackage.cjkp
    public final boolean e() {
        Boolean bool = this.u;
        if (bool == null) {
            throw new IllegalStateException("Property \"shouldDismissOnClick\" has not been set");
        }
        return bool.booleanValue();
    }

    @Override // defpackage.cjkp
    public final cjkr f() {
        String str = this.a == null ? " dialogWidth" : "";
        if (this.c == null) {
            str = str.concat(" heroIllustrationAspectRatio");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" title");
        }
        if (this.s == null) {
            str = String.valueOf(str).concat(" alertDialog");
        }
        if (this.t == null) {
            str = String.valueOf(str).concat(" forceVerticallyStackedActions");
        }
        if (this.u == null) {
            str = String.valueOf(str).concat(" shouldDismissOnClick");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cjkf(this.a, this.b, this.c, this.d, this.i, this.e, this.f, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t.booleanValue(), this.g, this.u.booleanValue());
    }
}

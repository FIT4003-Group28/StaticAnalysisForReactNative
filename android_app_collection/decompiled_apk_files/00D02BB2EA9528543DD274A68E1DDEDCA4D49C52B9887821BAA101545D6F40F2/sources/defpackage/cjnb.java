package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cjnb  reason: default package */
/* loaded from: classes4.dex */
public final class cjnb extends cjnd {
    public String a;
    public cjtd b;
    public Runnable c;
    public cjkd d;
    private Integer e;
    private View f;
    private Boolean g;

    @Override // defpackage.cjnd
    public final void b(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.cjnd
    public final void c(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.cjnd
    public final void d(View view) {
        if (view != null) {
            this.f = view;
            return;
        }
        throw new NullPointerException("Null view");
    }

    @Override // defpackage.cjnd
    public final cjne a() {
        String str = this.f == null ? " view" : "";
        if (this.g == null) {
            str = str.concat(" overlapTarget");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cjnc(this.a, this.e, this.b, this.f, this.c, this.g.booleanValue(), this.d);
    }
}

package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cjix  reason: default package */
/* loaded from: classes4.dex */
public final class cjix extends cjjd {
    public cjju a;
    public Integer b;
    public cjtd c;
    public Runnable d;
    public cjkd e;
    private cjjq f;
    private View g;
    private Boolean h;

    @Override // defpackage.cjjd
    public final void b(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.cjjd
    public final void c(cjjq cjjqVar) {
        if (cjjqVar != null) {
            this.f = cjjqVar;
            return;
        }
        throw new NullPointerException("Null theme");
    }

    @Override // defpackage.cjjd
    public final void d(View view) {
        if (view != null) {
            this.g = view;
            return;
        }
        throw new NullPointerException("Null view");
    }

    @Override // defpackage.cjjd
    public final cjjf a() {
        String str = this.f == null ? " theme" : "";
        if (this.a == null) {
            str = str.concat(" content");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" view");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" overlapTarget");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cjiy(this.f, this.a, this.g, this.b, this.c, this.d, this.h.booleanValue(), this.e);
    }
}

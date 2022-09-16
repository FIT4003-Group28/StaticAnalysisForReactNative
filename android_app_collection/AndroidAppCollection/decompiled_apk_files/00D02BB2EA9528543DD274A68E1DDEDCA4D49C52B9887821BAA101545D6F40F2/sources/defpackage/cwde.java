package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
/* compiled from: PG */
/* renamed from: cwde  reason: default package */
/* loaded from: classes.dex */
public final class cwde extends cwdb {
    public cwdd a;
    public cwdm b;
    private Integer c;
    private Drawable d;
    private String e;
    private Integer f;
    private View.OnClickListener g;
    private Boolean h;
    private cwda i;

    public cwde() {
    }

    public cwde(cwdc cwdcVar) {
        cwdf cwdfVar = (cwdf) cwdcVar;
        this.c = Integer.valueOf(cwdfVar.a);
        this.d = cwdfVar.b;
        this.e = cwdfVar.c;
        this.f = Integer.valueOf(cwdfVar.d);
        this.g = cwdfVar.e;
        this.a = cwdfVar.f;
        this.b = cwdfVar.g;
        this.h = Boolean.valueOf(cwdfVar.h);
        this.i = cwdfVar.i;
    }

    @Override // defpackage.cwdb
    public final void b(cwda cwdaVar) {
        if (cwdaVar != null) {
            this.i = cwdaVar;
            return;
        }
        throw new NullPointerException("Null actionType");
    }

    @Override // defpackage.cwdb
    public final void c(Drawable drawable) {
        if (drawable != null) {
            this.d = drawable;
            return;
        }
        throw new NullPointerException("Null icon");
    }

    @Override // defpackage.cwdb
    public final void d(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.cwdb
    public final void e(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null label");
    }

    @Override // defpackage.cwdb
    public final void f(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.g = onClickListener;
            return;
        }
        throw new NullPointerException("Null onClickListener");
    }

    @Override // defpackage.cwdb
    public final void g(int i) {
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.cwdb
    public final void h(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.cwdb
    public final cwdc a() {
        String str = this.c == null ? " id" : "";
        if (this.d == null) {
            str = str.concat(" icon");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" label");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" veId");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" onClickListener");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" visibleOnIncognito");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" actionType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cwdf(this.c.intValue(), this.d, this.e, this.f.intValue(), this.g, this.a, this.b, this.h.booleanValue(), this.i);
    }
}

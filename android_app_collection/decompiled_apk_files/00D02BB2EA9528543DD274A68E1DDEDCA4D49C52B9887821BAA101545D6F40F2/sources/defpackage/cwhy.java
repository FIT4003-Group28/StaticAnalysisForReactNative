package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
/* compiled from: PG */
/* renamed from: cwhy  reason: default package */
/* loaded from: classes5.dex */
final class cwhy extends cwib {
    private Integer a;
    private Drawable b;
    private String c;
    private Integer d;
    private View.OnClickListener e;

    public cwhy() {
    }

    public cwhy(cwic cwicVar) {
        cwhz cwhzVar = (cwhz) cwicVar;
        this.a = Integer.valueOf(cwhzVar.a);
        this.b = cwhzVar.b;
        this.c = cwhzVar.c;
        this.d = Integer.valueOf(cwhzVar.d);
        this.e = cwhzVar.e;
    }

    @Override // defpackage.cwib
    public final int a() {
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"id\" has not been set");
    }

    @Override // defpackage.cwib
    public final int b() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"veId\" has not been set");
    }

    @Override // defpackage.cwib
    public final void d(Drawable drawable) {
        if (drawable != null) {
            this.b = drawable;
            return;
        }
        throw new NullPointerException("Null icon");
    }

    @Override // defpackage.cwib
    public final void e(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.cwib
    public final void f(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null label");
    }

    @Override // defpackage.cwib
    public final void g(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.e = onClickListener;
            return;
        }
        throw new NullPointerException("Null onClickListener");
    }

    @Override // defpackage.cwib
    public final void h(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.cwib
    public final cwic c() {
        String str = this.a == null ? " id" : "";
        if (this.b == null) {
            str = str.concat(" icon");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" label");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" veId");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" onClickListener");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cwhz(this.a.intValue(), this.b, this.c, this.d.intValue(), this.e);
    }
}

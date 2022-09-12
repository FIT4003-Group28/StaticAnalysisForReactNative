package defpackage;

import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: jic  reason: default package */
/* loaded from: classes.dex */
public class jic {
    @dzsi
    public final String a;
    @dzsi
    public final ckqd b;
    @dzsi
    public final cqtd c;
    public final int d;
    public final boolean e;
    @dzsi
    public final ckqf f;
    @dzsi
    public final ckql g;
    private WeakReference<ckqg> h;

    public jic() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 0;
        this.e = false;
        this.f = null;
        this.g = null;
    }

    public jic(@dzsi String str, ckqd ckqdVar, int i) {
        this(str, ckqdVar, i, 0);
    }

    public jic(@dzsi String str, ckqd ckqdVar, @dzsi cqtd cqtdVar, int i, boolean z, @dzsi ckqf ckqfVar, @dzsi ckql ckqlVar) {
        this.a = str;
        this.b = ckqdVar;
        this.c = cqtdVar;
        this.d = i;
        this.e = z;
        this.f = ckqfVar;
        this.g = ckqlVar;
    }

    public final void a(ckqg ckqgVar) {
        String str;
        this.h = new WeakReference<>(ckqgVar);
        cqtd cqtdVar = this.c;
        Drawable a = cqtdVar == null ? null : cqtdVar.a(ckqgVar.getContext());
        ckqgVar.setBitmapLoadingOptions(this.g);
        cqjz<?> g = cqjz.g(ckqgVar);
        String str2 = "null";
        if (g != null) {
            V v = g.j;
            if (v != 0) {
                str2 = v.getClass().getName();
            }
            str = g.f.z();
        } else {
            str = str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 26 + String.valueOf(str).length());
        sb.append("ViewModel: {");
        sb.append(str2);
        sb.append("} / Layout: {");
        sb.append(str);
        sb.append("}");
        ckqgVar.s(this.a, this.b, a, this.f, this.d, this.e, sb.toString());
    }

    public final void b() {
        ckqg ckqgVar;
        WeakReference<ckqg> weakReference = this.h;
        if (weakReference == null || (ckqgVar = weakReference.get()) == null) {
            return;
        }
        ckqgVar.t();
    }

    public boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jic) {
            jic jicVar = (jic) obj;
            if (dbsd.a(this.a, jicVar.a) && dbsd.a(this.b, jicVar.b) && dbsd.a(this.c, jicVar.c) && this.d == jicVar.d && this.e == jicVar.e && dbsd.a(this.f, jicVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("imageUrl", this.a);
        b.b("urlQualifier", this.b);
        b.b("placeholder", this.c);
        b.f("fadeDurationMs", this.d);
        b.h("enableCrossFade", this.e);
        b.b("listener", this.f);
        return b.toString();
    }

    public jic(@dzsi String str, ckqd ckqdVar, int i, int i2) {
        this(str, ckqdVar, i == 0 ? null : cqrt.f(i), i2);
    }

    public jic(@dzsi String str, ckqd ckqdVar, int i, @dzsi ckqf ckqfVar) {
        this(str, ckqdVar, i == 0 ? null : cqrt.f(i), 0, ckqfVar);
    }

    public jic(@dzsi String str, ckqd ckqdVar, @dzsi cqtd cqtdVar, int i) {
        this(str, ckqdVar, cqtdVar, i, null);
    }

    public jic(@dzsi String str, ckqd ckqdVar, @dzsi cqtd cqtdVar, int i, @dzsi ckqf ckqfVar) {
        this(str, ckqdVar, cqtdVar, i, ckqfVar, null);
    }

    public jic(@dzsi String str, ckqd ckqdVar, @dzsi cqtd cqtdVar, int i, @dzsi ckqf ckqfVar, @dzsi ckql ckqlVar) {
        this(str, ckqdVar, cqtdVar, i, false, ckqfVar, ckqlVar);
    }
}

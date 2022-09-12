package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: lwz  reason: default package */
/* loaded from: classes7.dex */
final class lwz implements atlm {
    private final StringBuilder a;

    public lwz(StringBuilder sb) {
        this.a = sb;
    }

    @Override // defpackage.atlm
    public final void a(@dzsi String str, String str2, @dzsi String str3) {
        if (str != null) {
            this.a.append(str);
        }
        this.a.append(str2);
        if (str3 != null) {
            this.a.append(str3);
        }
    }

    @Override // defpackage.atlm
    public final void b(@dzsi String str, String str2, @dzsi String str3) {
        if (str != null) {
            this.a.append(str);
        }
        this.a.append(str2);
        if (str3 != null) {
            this.a.append(str3);
        }
    }

    @Override // defpackage.atlm
    public final void c(String str) {
        this.a.append(str);
    }

    @Override // defpackage.atlm
    public final void d(String str) {
        this.a.append(str);
    }

    @Override // defpackage.atlm
    public final void e(String str) {
    }

    @Override // defpackage.atlm
    public final void f(int i) {
    }

    @Override // defpackage.atlm
    public final void g(String str) {
        this.a.append(str);
    }

    @Override // defpackage.atlm
    public final void h(String str, String str2, Drawable drawable) {
    }

    @Override // defpackage.atlm
    public final void i(String str, String str2, Drawable drawable) {
    }
}

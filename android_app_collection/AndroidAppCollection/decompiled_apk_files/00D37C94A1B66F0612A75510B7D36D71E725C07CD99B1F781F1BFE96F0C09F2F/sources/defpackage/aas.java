package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aas  reason: default package */
/* loaded from: classes.dex */
public final class aas {
    final aar a;
    final aaq b = new aaq();

    public aas(aar aarVar) {
        this.a = aarVar;
    }

    public final View a(int i, int i2, int i3, int i4) {
        int d = this.a.d();
        int c = this.a.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View e = this.a.e(i);
            this.b.c(d, c, this.a.b(e), this.a.a(e));
            this.b.b();
            this.b.a(i3);
            if (this.b.d()) {
                return e;
            }
            if (i4 != 0) {
                this.b.b();
                this.b.a(i4);
                if (this.b.d()) {
                    view = e;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean b(View view) {
        this.b.c(this.a.d(), this.a.c(), this.a.b(view), this.a.a(view));
        this.b.b();
        this.b.a(24579);
        return this.b.d();
    }
}

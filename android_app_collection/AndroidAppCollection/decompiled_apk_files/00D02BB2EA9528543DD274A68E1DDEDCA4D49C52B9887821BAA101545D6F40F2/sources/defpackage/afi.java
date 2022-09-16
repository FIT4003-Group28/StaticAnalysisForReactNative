package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: afi  reason: default package */
/* loaded from: classes.dex */
final class afi {
    final afh a;
    final afg b = new afg();

    public afi(afh afhVar) {
        this.a = afhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View a(int i, int i2, int i3, int i4) {
        int b = this.a.b();
        int c = this.a.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a = this.a.a(i);
            this.b.a(b, c, this.a.d(a), this.a.e(a));
            this.b.c();
            this.b.b(i3);
            if (this.b.d()) {
                return a;
            }
            if (i4 != 0) {
                this.b.c();
                this.b.b(i4);
                if (this.b.d()) {
                    view = a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(View view) {
        this.b.a(this.a.b(), this.a.c(), this.a.d(view), this.a.e(view));
        this.b.c();
        this.b.b(24579);
        return this.b.d();
    }
}

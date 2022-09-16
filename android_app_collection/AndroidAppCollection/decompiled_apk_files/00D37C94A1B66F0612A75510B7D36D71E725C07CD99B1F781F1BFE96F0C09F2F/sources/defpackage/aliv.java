package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aliv  reason: default package */
/* loaded from: classes.dex */
public final class aliv {
    public int a;
    public int b;
    private final View c;
    private int d;

    public aliv(View view) {
        this.c = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        View view = this.c;
        lj.E(view, this.b - (view.getTop() - this.a));
        View view2 = this.c;
        lj.D(view2, -(view2.getLeft() - this.d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.a = this.c.getTop();
        this.d = this.c.getLeft();
    }

    public final boolean c(int i) {
        if (this.b != i) {
            this.b = i;
            a();
            return true;
        }
        return false;
    }
}

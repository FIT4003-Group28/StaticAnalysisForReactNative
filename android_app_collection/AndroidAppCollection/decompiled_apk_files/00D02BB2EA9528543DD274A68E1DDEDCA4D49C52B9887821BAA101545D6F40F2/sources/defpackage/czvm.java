package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: czvm  reason: default package */
/* loaded from: classes5.dex */
final class czvm {
    public int a;
    public int b;
    private final View c;
    private int d;

    public czvm(View view) {
        this.c = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a = this.c.getTop();
        this.d = this.c.getLeft();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        View view = this.c;
        od.ag(view, this.b - (view.getTop() - this.a));
        View view2 = this.c;
        od.ah(view2, -(view2.getLeft() - this.d));
    }

    public final boolean c(int i) {
        if (this.b != i) {
            this.b = i;
            b();
            return true;
        }
        return false;
    }
}

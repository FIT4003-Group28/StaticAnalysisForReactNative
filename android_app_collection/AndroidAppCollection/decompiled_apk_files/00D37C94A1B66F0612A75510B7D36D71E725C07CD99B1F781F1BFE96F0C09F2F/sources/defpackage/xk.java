package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: xk  reason: default package */
/* loaded from: classes4.dex */
public final class xk implements Runnable {
    final /* synthetic */ RecyclerView a;
    private final /* synthetic */ int b;

    public xk(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public xk(RecyclerView recyclerView, int i) {
        this.b = i;
        this.a = recyclerView;
    }

    public /* synthetic */ xk(RecyclerView recyclerView, int i, byte[] bArr) {
        this.b = i;
        this.a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            xs xsVar = this.a.E;
            if (xsVar != null) {
                xsVar.d();
            }
            this.a.P = false;
        } else if (i == 1) {
            RecyclerView recyclerView = this.a;
            if (!recyclerView.t || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = this.a;
            if (!recyclerView2.r) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.v) {
                recyclerView2.u = true;
            } else {
                recyclerView2.A();
            }
        } else {
            this.a.requestLayout();
        }
    }
}

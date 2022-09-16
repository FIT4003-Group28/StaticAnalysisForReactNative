package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
/* compiled from: PG */
/* renamed from: lxr  reason: default package */
/* loaded from: classes3.dex */
public final class lxr extends ne implements alik {
    private final lxs a;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;

    public lxr(lxs lxsVar) {
        this.a = lxsVar;
    }

    @Override // defpackage.alig
    public final void a(AppBarLayout appBarLayout, int i) {
        if (this.d) {
            return;
        }
        if (Math.abs(i) != appBarLayout.g() || !this.b) {
            if (i != 0 || !this.c) {
                return;
            }
            this.a.n();
            return;
        }
        this.c = true;
        this.a.m();
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        if (this.d || this.b || i != 1) {
            return;
        }
        this.b = true;
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        if (!this.d && i2 < 0) {
            this.a.n();
        }
    }

    public final void b(RecyclerView recyclerView, AppBarLayout appBarLayout) {
        if (recyclerView == null || appBarLayout == null) {
            zep.b("Could not attach PartialPullListener listener as one or more target views was null.");
            return;
        }
        recyclerView.aE(this);
        appBarLayout.i(this);
    }

    public final void c(final RecyclerView recyclerView, final AppBarLayout appBarLayout) {
        if (this.d) {
            return;
        }
        this.d = true;
        if (recyclerView == null || appBarLayout == null) {
            zep.l("Disabled PartialPullListener but did not remove it, as one or more of the target  views was null.");
            return;
        }
        recyclerView.post(new Runnable() { // from class: lxp
            @Override // java.lang.Runnable
            public final void run() {
                recyclerView.aG(lxr.this);
            }
        });
        appBarLayout.post(new Runnable() { // from class: lxq
            @Override // java.lang.Runnable
            public final void run() {
                appBarLayout.k(lxr.this);
            }
        });
    }
}

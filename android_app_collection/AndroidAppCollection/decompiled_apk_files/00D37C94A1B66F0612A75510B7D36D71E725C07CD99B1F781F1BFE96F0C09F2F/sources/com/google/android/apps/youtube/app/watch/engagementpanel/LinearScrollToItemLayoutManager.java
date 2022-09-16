package com.google.android.apps.youtube.app.watch.engagementpanel;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.common.ui.OverScrollLinearLayoutManager;
import com.google.android.apps.youtube.app.watch.engagementpanel.LinearScrollToItemLayoutManager;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LinearScrollToItemLayoutManager extends OverScrollLinearLayoutManager implements akak {
    public int b;
    private final not c;
    private Runnable d = bhj.h;

    private LinearScrollToItemLayoutManager(Context context) {
        this.c = new not(context, 0);
    }

    public static LinearScrollToItemLayoutManager q(Context context) {
        final LinearScrollToItemLayoutManager linearScrollToItemLayoutManager = new LinearScrollToItemLayoutManager(context);
        linearScrollToItemLayoutManager.d = new Runnable() { // from class: nos
            @Override // java.lang.Runnable
            public final void run() {
                LinearScrollToItemLayoutManager linearScrollToItemLayoutManager2 = LinearScrollToItemLayoutManager.this;
                linearScrollToItemLayoutManager2.bC(linearScrollToItemLayoutManager2.b);
            }
        };
        return linearScrollToItemLayoutManager;
    }

    public final void bA(RecyclerView recyclerView, int i) {
        recyclerView.removeCallbacks(this.d);
        if (Math.abs(i - J()) < 7) {
            bC(i);
            return;
        }
        Z(i);
        this.b = i;
        recyclerView.post(this.d);
    }

    public final void bB(boolean z) {
        this.c.a = z;
    }

    public final void bC(int i) {
        this.c.n();
        not notVar = this.c;
        notVar.b = i;
        bd(notVar);
    }

    @Override // defpackage.akak
    public final void c(RecyclerView recyclerView, int i, int i2) {
        not notVar = new not(recyclerView.getContext(), i2);
        notVar.b = i;
        bd(notVar);
    }
}

package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* loaded from: classes2.dex */
final class d extends ne {
    private final GridLayoutManager a;
    private final AtomicBoolean b;

    public d(GridLayoutManager gridLayoutManager, AtomicBoolean atomicBoolean) {
        this.a = gridLayoutManager;
        this.b = atomicBoolean;
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        if (i != 0) {
            this.b.set(true);
            return;
        }
        int J2 = this.a.J();
        int L = this.a.L();
        for (int max = Math.max(0, J2); max <= L; max++) {
            h hVar = (h) recyclerView.j(max, false);
            if (hVar != null) {
                hVar.F();
            }
        }
    }
}

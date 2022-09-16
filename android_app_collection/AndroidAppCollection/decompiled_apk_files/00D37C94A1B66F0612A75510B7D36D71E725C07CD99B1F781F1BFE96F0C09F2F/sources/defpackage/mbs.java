package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
/* compiled from: PG */
/* renamed from: mbs  reason: default package */
/* loaded from: classes3.dex */
public final class mbs extends ne implements ye {
    public final RecyclerView a;
    public final fgz b;
    public final ScrollSelectionController c;
    public boolean d;

    public mbs(RecyclerView recyclerView, fgz fgzVar, ScrollSelectionController scrollSelectionController) {
        this.a = recyclerView;
        this.b = fgzVar;
        this.c = scrollSelectionController;
    }

    @Override // defpackage.ye
    public final void a(yo yoVar) {
        RecyclerView recyclerView = this.a;
        recyclerView.removeCallbacks(new mbr(this));
        recyclerView.post(new mbr(this));
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        if (i == 0 || i == 1) {
            this.d = false;
        }
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        if (!this.d) {
            this.c.o();
        }
    }
}

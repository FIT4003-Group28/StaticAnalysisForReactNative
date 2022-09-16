package defpackage;

import android.support.v7.widget.LinearLayoutManager;
/* compiled from: PG */
/* renamed from: grp  reason: default package */
/* loaded from: classes3.dex */
public final class grp extends LinearLayoutManager {
    final /* synthetic */ grv a;

    public grp(grv grvVar) {
        this.a = grvVar;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.xw
    public final void o(yl ylVar) {
        grv grvVar = this.a;
        Runnable runnable = grvVar.ab;
        if (runnable != null) {
            grvVar.ab = null;
        } else {
            runnable = null;
        }
        super.o(ylVar);
        if (runnable != null) {
            runnable.run();
        }
    }
}

package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: acfo  reason: default package */
/* loaded from: classes.dex */
final class acfo extends LinearLayoutManager {
    final /* synthetic */ acfp a;

    public acfo(acfp acfpVar) {
        this.a = acfpVar;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.xw
    public final void ao(RecyclerView recyclerView, int i) {
        yk ykVar = this.a.l;
        ykVar.b = i;
        bd(ykVar);
    }
}

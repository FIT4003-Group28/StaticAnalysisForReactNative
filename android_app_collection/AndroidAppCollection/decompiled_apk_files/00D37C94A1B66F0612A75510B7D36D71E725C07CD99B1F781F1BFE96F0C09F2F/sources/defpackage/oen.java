package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oen  reason: default package */
/* loaded from: classes3.dex */
public final class oen extends LinearLayoutManager {
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.xw
    public final void ao(RecyclerView recyclerView, int i) {
        oem oemVar = new oem(recyclerView.getContext());
        oemVar.b = i;
        bd(oemVar);
    }
}

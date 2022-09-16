package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: uue  reason: default package */
/* loaded from: classes7.dex */
public final class uue implements dbty<vlm> {
    final /* synthetic */ uuf a;

    public uue(uuf uufVar) {
        this.a = uufVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ vlm a() {
        uuf uufVar = this.a;
        View view = uufVar.c;
        uug uugVar = uufVar.d;
        cqjg cqjgVar = uugVar.a;
        cqjg cqjgVar2 = uugVar.b;
        View d = cqkx.d(view, cqjgVar);
        dbsk.s(d);
        RecyclerView recyclerView = (RecyclerView) cqkx.e(view, cqjgVar2, RecyclerView.class);
        dbsk.s(recyclerView);
        return new vlm(d, recyclerView);
    }
}

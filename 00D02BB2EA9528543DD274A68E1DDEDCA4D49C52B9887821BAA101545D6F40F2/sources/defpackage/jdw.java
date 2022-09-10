package defpackage;

import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jdw  reason: default package */
/* loaded from: classes7.dex */
public final class jdw extends abx {
    final /* synthetic */ jdx a;

    public jdw(jdx jdxVar) {
        this.a = jdxVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        this.a.e(!recyclerView.canScrollVertically(-1));
    }
}

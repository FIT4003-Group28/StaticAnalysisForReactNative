package defpackage;

import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xqr  reason: default package */
/* loaded from: classes4.dex */
public final class xqr extends ne {
    final /* synthetic */ xqs a;

    public xqr(xqs xqsVar) {
        this.a = xqsVar;
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        ql qlVar = this.a.f;
        if (qlVar.c()) {
            return;
        }
        qlVar.b();
        qlVar.k = true;
    }
}

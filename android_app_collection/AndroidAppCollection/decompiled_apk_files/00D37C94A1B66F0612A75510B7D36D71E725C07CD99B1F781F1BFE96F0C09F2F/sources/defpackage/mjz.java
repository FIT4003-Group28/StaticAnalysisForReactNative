package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mjz  reason: default package */
/* loaded from: classes3.dex */
public final class mjz extends nd {
    final /* synthetic */ mka a;

    public mjz(mka mkaVar) {
        this.a = mkaVar;
    }

    @Override // defpackage.nd
    public final void b(Rect rect, View view, RecyclerView recyclerView, yl ylVar) {
        if (view == this.a.a) {
            rect.set(0, 0, 0, -1);
        }
    }
}

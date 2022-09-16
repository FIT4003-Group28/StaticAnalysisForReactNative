package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gfg  reason: default package */
/* loaded from: classes3.dex */
public final class gfg implements ya {
    final /* synthetic */ gfm a;

    public gfg(gfm gfmVar) {
        this.a = gfmVar;
    }

    @Override // defpackage.ya
    public final void g(boolean z) {
    }

    @Override // defpackage.ya
    public final boolean m(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.a.m = motionEvent.getY();
        return false;
    }

    @Override // defpackage.ya
    public final void n(MotionEvent motionEvent) {
    }
}

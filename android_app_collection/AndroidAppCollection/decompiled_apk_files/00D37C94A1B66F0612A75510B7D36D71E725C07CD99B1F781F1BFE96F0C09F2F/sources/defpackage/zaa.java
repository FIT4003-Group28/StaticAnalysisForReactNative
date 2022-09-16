package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: zaa  reason: default package */
/* loaded from: classes4.dex */
public final class zaa extends yh {
    private final yzq a;
    private final boolean b;

    public zaa(RecyclerView recyclerView) {
        this(recyclerView, false);
    }

    @Override // defpackage.yh, defpackage.ya
    public final boolean m(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!this.b || recyclerView.canScrollHorizontally(-1)) {
            this.a.a(motionEvent);
            return false;
        }
        return false;
    }

    public zaa(RecyclerView recyclerView, boolean z) {
        this.b = z;
        recyclerView.getClass();
        this.a = new yzq(recyclerView);
    }
}

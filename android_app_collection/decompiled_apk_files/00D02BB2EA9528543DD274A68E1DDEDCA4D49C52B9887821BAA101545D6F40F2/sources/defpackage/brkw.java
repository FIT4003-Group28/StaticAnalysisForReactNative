package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: brkw  reason: default package */
/* loaded from: classes4.dex */
final class brkw extends abp {
    final /* synthetic */ bssu a;
    final /* synthetic */ Rect b;
    final /* synthetic */ int c;
    final /* synthetic */ Drawable d;

    public brkw(bssu bssuVar, Rect rect, int i, Drawable drawable) {
        this.a = bssuVar;
        this.b = rect;
        this.c = i;
        this.d = drawable;
    }

    @Override // defpackage.abp
    public final void k(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView.canScrollVertically(-1) || this.a.r().booleanValue()) {
            this.b.set(0, 0, recyclerView.getWidth(), this.c);
            this.d.setBounds(this.b);
            this.d.draw(canvas);
        }
    }
}

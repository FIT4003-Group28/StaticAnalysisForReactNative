package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cqlq  reason: default package */
/* loaded from: classes5.dex */
final class cqlq implements Drawable.Callback {
    final /* synthetic */ cqlr a;

    public cqlq(cqlr cqlrVar) {
        this.a = cqlrVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.a.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.a.unscheduleSelf(runnable);
    }
}

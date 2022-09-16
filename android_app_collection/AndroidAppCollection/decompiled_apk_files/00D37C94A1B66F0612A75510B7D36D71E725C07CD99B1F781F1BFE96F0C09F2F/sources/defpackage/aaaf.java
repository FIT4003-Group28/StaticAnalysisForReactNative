package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: aaaf  reason: default package */
/* loaded from: classes.dex */
final class aaaf implements Runnable {
    final /* synthetic */ Drawable a;

    public aaaf(Drawable drawable) {
        this.a = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setState(aaag.a);
    }
}

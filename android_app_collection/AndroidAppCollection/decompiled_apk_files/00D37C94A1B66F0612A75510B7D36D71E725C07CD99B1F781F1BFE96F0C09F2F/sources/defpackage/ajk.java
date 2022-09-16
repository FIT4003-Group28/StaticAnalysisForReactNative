package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ajk  reason: default package */
/* loaded from: classes.dex */
public final class ajk implements Runnable {
    final /* synthetic */ Activity a;

    public ajk(Activity activity) {
        this.a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.isFinishing() || ajt.b(this.a)) {
            return;
        }
        this.a.recreate();
    }
}

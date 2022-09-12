package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ajs  reason: default package */
/* loaded from: classes.dex */
public final class ajs implements Runnable {
    final /* synthetic */ Activity a;

    public ajs(Activity activity) {
        this.a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.isFinishing() || ajz.a(this.a)) {
            return;
        }
        this.a.recreate();
    }
}

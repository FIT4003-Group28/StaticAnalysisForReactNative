package defpackage;

import com.google.android.material.progressindicator.ProgressIndicator;
/* compiled from: PG */
/* renamed from: dacp  reason: default package */
/* loaded from: classes5.dex */
public final class dacp implements Runnable {
    final /* synthetic */ ProgressIndicator a;

    public dacp(ProgressIndicator progressIndicator) {
        this.a = progressIndicator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a();
    }
}

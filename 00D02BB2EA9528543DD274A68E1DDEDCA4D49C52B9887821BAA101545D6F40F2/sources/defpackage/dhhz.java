package defpackage;

import android.app.KeyguardManager;
import com.google.lens.sdk.LensApi;
/* compiled from: PG */
/* renamed from: dhhz  reason: default package */
/* loaded from: classes6.dex */
public final class dhhz extends KeyguardManager.KeyguardDismissCallback {
    final /* synthetic */ Runnable a;
    final /* synthetic */ LensApi.LensLaunchStatusCallback b;

    public dhhz(Runnable runnable, LensApi.LensLaunchStatusCallback lensLaunchStatusCallback) {
        this.a = runnable;
        this.b = lensLaunchStatusCallback;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissCancelled() {
        LensApi.LensLaunchStatusCallback lensLaunchStatusCallback = this.b;
        if (lensLaunchStatusCallback != null) {
            lensLaunchStatusCallback.onLaunchStatusFetched(1);
        }
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissError() {
        LensApi.LensLaunchStatusCallback lensLaunchStatusCallback = this.b;
        if (lensLaunchStatusCallback != null) {
            lensLaunchStatusCallback.onLaunchStatusFetched(1);
        }
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        this.a.run();
        LensApi.LensLaunchStatusCallback lensLaunchStatusCallback = this.b;
        if (lensLaunchStatusCallback != null) {
            lensLaunchStatusCallback.onLaunchStatusFetched(0);
        }
    }
}

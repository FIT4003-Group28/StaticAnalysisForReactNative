package defpackage;

import android.app.KeyguardManager;
import android.util.Log;
import com.google.lens.sdk.LensApi;
/* compiled from: PG */
/* renamed from: aohd  reason: default package */
/* loaded from: classes.dex */
public final class aohd extends KeyguardManager.KeyguardDismissCallback {
    final /* synthetic */ Runnable a;
    final /* synthetic */ LensApi.LensLaunchStatusCallback b;

    public aohd(Runnable runnable, LensApi.LensLaunchStatusCallback lensLaunchStatusCallback) {
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
        Log.e("LensApi", "Error dismissing keyguard");
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

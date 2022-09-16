package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.FileDescriptor;
import java.io.PrintWriter;
@KeepForSdk
/* loaded from: classes.dex */
public class LifecycleCallback {
    @KeepForSdk
    protected final LifecycleFragment mLifecycleFragment;

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public LifecycleCallback(LifecycleFragment lifecycleFragment) {
        this.mLifecycleFragment = lifecycleFragment;
    }

    @Keep
    private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity lifecycleActivity) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @KeepForSdk
    public static LifecycleFragment getFragment(Activity activity) {
        return getFragment(new LifecycleActivity(activity));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public static LifecycleFragment getFragment(LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.zzbv()) {
            return zzcc.zza(lifecycleActivity.zzby());
        }
        if (!lifecycleActivity.zzbw()) {
            throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
        }
        return zzbr.zzc(lifecycleActivity.zzbx());
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final Activity getActivity() {
        return this.mLifecycleFragment.getLifecycleActivity();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    @KeepForSdk
    public void onStop() {
    }
}

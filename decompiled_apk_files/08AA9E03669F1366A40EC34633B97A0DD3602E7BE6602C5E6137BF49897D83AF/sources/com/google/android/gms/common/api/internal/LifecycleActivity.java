package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.support.v4.app.j;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
@KeepForSdk
/* loaded from: classes.dex */
public class LifecycleActivity {
    private final Object zzkz;

    public LifecycleActivity(Activity activity) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        this.zzkz = activity;
    }

    public final boolean zzbv() {
        return this.zzkz instanceof j;
    }

    public final boolean zzbw() {
        return this.zzkz instanceof Activity;
    }

    public final Activity zzbx() {
        return (Activity) this.zzkz;
    }

    public final j zzby() {
        return (j) this.zzkz;
    }
}

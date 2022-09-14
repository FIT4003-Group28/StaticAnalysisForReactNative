package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes.dex */
public final class zzav {
    private final Context zzwf;
    private final Context zzwg;

    public zzav(Context context) {
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext, "Application context can't be null");
        this.zzwf = applicationContext;
        this.zzwg = applicationContext;
    }

    public final Context getApplicationContext() {
        return this.zzwf;
    }

    public final Context zzci() {
        return this.zzwg;
    }
}

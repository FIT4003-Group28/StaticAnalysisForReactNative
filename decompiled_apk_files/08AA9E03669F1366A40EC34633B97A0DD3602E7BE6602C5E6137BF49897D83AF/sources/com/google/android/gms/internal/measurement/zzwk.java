package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final class zzwk {
    private static final Integer zzbmr = 0;
    private static final Integer zzbms = 1;
    private final ExecutorService zzalw;
    private final Context zzqx;

    public zzwk(Context context) {
        this(context, Executors.newSingleThreadExecutor());
    }

    @VisibleForTesting
    private zzwk(Context context, ExecutorService executorService) {
        this.zzqx = context;
        this.zzalw = executorService;
    }
}

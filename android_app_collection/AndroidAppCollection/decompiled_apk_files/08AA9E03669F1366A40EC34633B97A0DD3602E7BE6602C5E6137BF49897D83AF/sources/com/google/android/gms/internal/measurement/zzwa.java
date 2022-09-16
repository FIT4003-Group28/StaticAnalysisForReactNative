package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzwa {
    private String zzaxa;
    @VisibleForTesting
    private Map<String, Object> zzbka;
    private final Map<String, Object> zzbkb;
    private final zzwk zzbmk;
    private final Context zzqx;
    private final Clock zzro;

    public zzwa(Context context) {
        this(context, new HashMap(), new zzwk(context), DefaultClock.getInstance());
    }

    @VisibleForTesting
    private zzwa(Context context, Map<String, Object> map, zzwk zzwkVar, Clock clock) {
        this.zzaxa = null;
        this.zzbka = new HashMap();
        this.zzqx = context;
        this.zzro = clock;
        this.zzbmk = zzwkVar;
        this.zzbkb = map;
    }

    public final void zzer(String str) {
        this.zzaxa = str;
    }
}

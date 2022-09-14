package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
/* loaded from: classes.dex */
public final class zzgf {
    private Tracker zzqw;
    private Context zzqx;
    private GoogleAnalytics zzqz;

    public zzgf(Context context) {
        this.zzqx = context;
    }

    private final synchronized void zzdn(String str) {
        if (this.zzqz == null) {
            this.zzqz = GoogleAnalytics.getInstance(this.zzqx);
            this.zzqz.setLogger(new zzgg());
            this.zzqw = this.zzqz.newTracker(str);
        }
    }

    public final Tracker zzdm(String str) {
        zzdn(str);
        return this.zzqw;
    }
}

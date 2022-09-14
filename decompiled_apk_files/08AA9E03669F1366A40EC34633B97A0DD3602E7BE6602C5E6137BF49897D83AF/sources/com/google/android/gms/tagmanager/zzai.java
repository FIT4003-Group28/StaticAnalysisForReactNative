package com.google.android.gms.tagmanager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Random;
/* loaded from: classes.dex */
public final class zzai {
    private final String zzavt;
    private final Random zzawz;
    private final Context zzqx;

    public zzai(Context context, String str) {
        this(context, str, new Random());
    }

    private zzai(Context context, String str, Random random) {
        this.zzqx = (Context) Preconditions.checkNotNull(context);
        this.zzavt = (String) Preconditions.checkNotNull(str);
        this.zzawz = random;
    }

    private final long zzb(long j, long j2) {
        SharedPreferences zzmx = zzmx();
        long max = Math.max(0L, zzmx.getLong("FORBIDDEN_COUNT", 0L));
        return this.zzawz.nextFloat() * ((float) (j + ((((float) max) / ((float) ((max + Math.max(0L, zzmx.getLong("SUCCESSFUL_COUNT", 0L))) + 1))) * ((float) (j2 - j)))));
    }

    private final SharedPreferences zzmx() {
        Context context = this.zzqx;
        String valueOf = String.valueOf("_gtmContainerRefreshPolicy_");
        String valueOf2 = String.valueOf(this.zzavt);
        return context.getSharedPreferences(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), 0);
    }

    public final long zzmt() {
        return zzb(7200000L, 259200000L) + 43200000;
    }

    public final long zzmu() {
        return zzb(600000L, 86400000L) + 3600000;
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void zzmv() {
        SharedPreferences zzmx = zzmx();
        long j = zzmx.getLong("FORBIDDEN_COUNT", 0L);
        long j2 = zzmx.getLong("SUCCESSFUL_COUNT", 0L);
        SharedPreferences.Editor edit = zzmx.edit();
        long min = j == 0 ? 3L : Math.min(10L, j + 1);
        long max = Math.max(0L, Math.min(j2, 10 - min));
        edit.putLong("FORBIDDEN_COUNT", min);
        edit.putLong("SUCCESSFUL_COUNT", max);
        edit.apply();
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void zzmw() {
        SharedPreferences zzmx = zzmx();
        long j = zzmx.getLong("SUCCESSFUL_COUNT", 0L);
        long j2 = zzmx.getLong("FORBIDDEN_COUNT", 0L);
        long min = Math.min(10L, j + 1);
        long max = Math.max(0L, Math.min(j2, 10 - min));
        SharedPreferences.Editor edit = zzmx.edit();
        edit.putLong("SUCCESSFUL_COUNT", min);
        edit.putLong("FORBIDDEN_COUNT", max);
        edit.apply();
    }
}

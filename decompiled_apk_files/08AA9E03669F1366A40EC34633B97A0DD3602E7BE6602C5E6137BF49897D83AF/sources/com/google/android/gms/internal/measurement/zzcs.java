package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.UUID;
/* loaded from: classes.dex */
public final class zzcs {
    private final String name;
    private final long zzabj;
    private final /* synthetic */ zzcq zzabk;

    private zzcs(zzcq zzcqVar, String str, long j) {
        this.zzabk = zzcqVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j > 0);
        this.name = str;
        this.zzabj = j;
    }

    private final void zzfh() {
        SharedPreferences sharedPreferences;
        long currentTimeMillis = this.zzabk.zzbt().currentTimeMillis();
        sharedPreferences = this.zzabk.zzabf;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(zzfl());
        edit.remove(zzfm());
        edit.putLong(zzfk(), currentTimeMillis);
        edit.commit();
    }

    private final long zzfj() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zzabk.zzabf;
        return sharedPreferences.getLong(zzfk(), 0L);
    }

    private final String zzfk() {
        return String.valueOf(this.name).concat(":start");
    }

    private final String zzfl() {
        return String.valueOf(this.name).concat(":count");
    }

    @VisibleForTesting
    private final String zzfm() {
        return String.valueOf(this.name).concat(":value");
    }

    public final void zzac(String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        SharedPreferences sharedPreferences3;
        if (zzfj() == 0) {
            zzfh();
        }
        if (str == null) {
            str = "";
        }
        synchronized (this) {
            sharedPreferences = this.zzabk.zzabf;
            long j = sharedPreferences.getLong(zzfl(), 0L);
            if (j <= 0) {
                sharedPreferences3 = this.zzabk.zzabf;
                SharedPreferences.Editor edit = sharedPreferences3.edit();
                edit.putString(zzfm(), str);
                edit.putLong(zzfl(), 1L);
                edit.apply();
                return;
            }
            long j2 = j + 1;
            boolean z = (UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / j2;
            sharedPreferences2 = this.zzabk.zzabf;
            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
            if (z) {
                edit2.putString(zzfm(), str);
            }
            edit2.putLong(zzfl(), j2);
            edit2.apply();
        }
    }

    public final Pair<String, Long> zzfi() {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        long zzfj = zzfj();
        long abs = zzfj == 0 ? 0L : Math.abs(zzfj - this.zzabk.zzbt().currentTimeMillis());
        if (abs < this.zzabj) {
            return null;
        }
        if (abs > (this.zzabj << 1)) {
            zzfh();
            return null;
        }
        sharedPreferences = this.zzabk.zzabf;
        String string = sharedPreferences.getString(zzfm(), null);
        sharedPreferences2 = this.zzabk.zzabf;
        long j = sharedPreferences2.getLong(zzfl(), 0L);
        zzfh();
        if (string != null && j > 0) {
            return new Pair<>(string, Long.valueOf(j));
        }
        return null;
    }
}

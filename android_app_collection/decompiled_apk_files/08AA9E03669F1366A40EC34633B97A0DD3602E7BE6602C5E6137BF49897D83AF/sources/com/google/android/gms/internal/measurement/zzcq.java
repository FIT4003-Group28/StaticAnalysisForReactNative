package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class zzcq extends zzar {
    private SharedPreferences zzabf;
    private long zzabg;
    private long zzabh;
    private final zzcs zzabi;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcq(zzat zzatVar) {
        super(zzatVar);
        this.zzabh = -1L;
        this.zzabi = new zzcs(this, "monitoring", zzcc.zzzz.get().longValue());
    }

    public final void zzab(String str) {
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        SharedPreferences.Editor edit = this.zzabf.edit();
        if (TextUtils.isEmpty(str)) {
            edit.remove("installation_campaign");
        } else {
            edit.putString("installation_campaign", str);
        }
        if (!edit.commit()) {
            zzs("Failed to commit campaign data");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
        this.zzabf = getContext().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final long zzfb() {
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        if (this.zzabg == 0) {
            long j = this.zzabf.getLong("first_run", 0L);
            if (j == 0) {
                j = zzbt().currentTimeMillis();
                SharedPreferences.Editor edit = this.zzabf.edit();
                edit.putLong("first_run", j);
                if (!edit.commit()) {
                    zzs("Failed to commit first run time");
                }
            }
            this.zzabg = j;
        }
        return this.zzabg;
    }

    public final zzcz zzfc() {
        return new zzcz(zzbt(), zzfb());
    }

    public final long zzfd() {
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        if (this.zzabh == -1) {
            this.zzabh = this.zzabf.getLong("last_dispatch", 0L);
        }
        return this.zzabh;
    }

    public final void zzfe() {
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        long currentTimeMillis = zzbt().currentTimeMillis();
        SharedPreferences.Editor edit = this.zzabf.edit();
        edit.putLong("last_dispatch", currentTimeMillis);
        edit.apply();
        this.zzabh = currentTimeMillis;
    }

    public final String zzff() {
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        String string = this.zzabf.getString("installation_campaign", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    public final zzcs zzfg() {
        return this.zzabi;
    }
}

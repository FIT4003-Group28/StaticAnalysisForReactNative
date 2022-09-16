package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Locale;
/* loaded from: classes.dex */
public final class zzde extends zzar {
    private String zzaae;
    private String zzaaf;
    protected int zzaah;
    private int zzace;
    protected boolean zzacf;
    private boolean zzacg;
    private boolean zzach;

    public zzde(zzat zzatVar) {
        super(zzatVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
        ApplicationInfo applicationInfo;
        int i;
        zzcg zzo;
        Context context = getContext();
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            zzd("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            zzs("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) <= 0 || (zzo = new zzce(zzbs()).zzo(i)) == null) {
            return;
        }
        zzp("Loading global XML config values");
        boolean z = false;
        if (zzo.zzaae != null) {
            String str = zzo.zzaae;
            this.zzaae = str;
            zzb("XML config - app name", str);
        }
        if (zzo.zzaaf != null) {
            String str2 = zzo.zzaaf;
            this.zzaaf = str2;
            zzb("XML config - app version", str2);
        }
        if (zzo.zzaag != null) {
            String lowerCase = zzo.zzaag.toLowerCase(Locale.US);
            int i2 = "verbose".equals(lowerCase) ? 0 : "info".equals(lowerCase) ? 1 : "warning".equals(lowerCase) ? 2 : "error".equals(lowerCase) ? 3 : -1;
            if (i2 >= 0) {
                this.zzace = i2;
                zza("XML config - log level", Integer.valueOf(i2));
            }
        }
        if (zzo.zzaah >= 0) {
            int i3 = zzo.zzaah;
            this.zzaah = i3;
            this.zzacf = true;
            zzb("XML config - dispatch period (sec)", Integer.valueOf(i3));
        }
        if (zzo.zzaai == -1) {
            return;
        }
        if (zzo.zzaai == 1) {
            z = true;
        }
        this.zzach = z;
        this.zzacg = true;
        zzb("XML config - dry run", Boolean.valueOf(z));
    }

    public final String zzaf() {
        zzch();
        return this.zzaae;
    }

    public final String zzag() {
        zzch();
        return this.zzaaf;
    }

    public final boolean zzfn() {
        zzch();
        return false;
    }

    public final boolean zzfo() {
        zzch();
        return this.zzacg;
    }

    public final boolean zzfp() {
        zzch();
        return this.zzach;
    }
}

package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class zzad extends com.google.android.gms.analytics.zzi<zzad> {
    private String zzud;
    private String zzue;
    private String zzuf;
    private String zzug;
    private boolean zzuh;
    private String zzui;
    private boolean zzuj;
    private double zzuk;

    public final void setClientId(String str) {
        this.zzue = str;
    }

    public final void setUserId(String str) {
        this.zzuf = str;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("hitType", this.zzud);
        hashMap.put("clientId", this.zzue);
        hashMap.put("userId", this.zzuf);
        hashMap.put("androidAdId", this.zzug);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.zzuh));
        hashMap.put("sessionControl", this.zzui);
        hashMap.put("nonInteraction", Boolean.valueOf(this.zzuj));
        hashMap.put("sampleRate", Double.valueOf(this.zzuk));
        return zza((Object) hashMap);
    }

    public final void zza(boolean z) {
        this.zzuh = z;
    }

    public final String zzay() {
        return this.zzud;
    }

    public final String zzaz() {
        return this.zzue;
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzad zzadVar) {
        zzad zzadVar2 = zzadVar;
        if (!TextUtils.isEmpty(this.zzud)) {
            zzadVar2.zzud = this.zzud;
        }
        if (!TextUtils.isEmpty(this.zzue)) {
            zzadVar2.zzue = this.zzue;
        }
        if (!TextUtils.isEmpty(this.zzuf)) {
            zzadVar2.zzuf = this.zzuf;
        }
        if (!TextUtils.isEmpty(this.zzug)) {
            zzadVar2.zzug = this.zzug;
        }
        boolean z = true;
        if (this.zzuh) {
            zzadVar2.zzuh = true;
        }
        if (!TextUtils.isEmpty(this.zzui)) {
            zzadVar2.zzui = this.zzui;
        }
        if (this.zzuj) {
            zzadVar2.zzuj = this.zzuj;
        }
        if (this.zzuk != 0.0d) {
            double d2 = this.zzuk;
            if (d2 < 0.0d || d2 > 100.0d) {
                z = false;
            }
            Preconditions.checkArgument(z, "Sample rate must be between 0% and 100%");
            zzadVar2.zzuk = d2;
        }
    }

    public final void zzb(boolean z) {
        this.zzuj = true;
    }

    public final String zzba() {
        return this.zzuf;
    }

    public final String zzbb() {
        return this.zzug;
    }

    public final boolean zzbc() {
        return this.zzuh;
    }

    public final String zzbd() {
        return this.zzui;
    }

    public final boolean zzbe() {
        return this.zzuj;
    }

    public final double zzbf() {
        return this.zzuk;
    }

    public final void zzk(String str) {
        this.zzud = str;
    }

    public final void zzl(String str) {
        this.zzug = str;
    }
}

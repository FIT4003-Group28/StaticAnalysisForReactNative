package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class zzcf implements zzbt<zzcg> {
    private final zzcg zzaad = new zzcg();
    private final zzat zzvn;

    public zzcf(zzat zzatVar) {
        this.zzvn = zzatVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzbt
    public final void zza(String str, boolean z) {
        if (!"ga_dryRun".equals(str)) {
            this.zzvn.zzbu().zzd("Bool xml configuration name not recognized", str);
            return;
        }
        this.zzaad.zzaai = z ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzbt
    public final void zzb(String str, int i) {
        if ("ga_dispatchPeriod".equals(str)) {
            this.zzaad.zzaah = i;
        } else {
            this.zzvn.zzbu().zzd("Int xml configuration name not recognized", str);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzbt
    public final void zzb(String str, String str2) {
    }

    @Override // com.google.android.gms.internal.measurement.zzbt
    public final void zzc(String str, String str2) {
        if ("ga_appName".equals(str)) {
            this.zzaad.zzaae = str2;
        } else if ("ga_appVersion".equals(str)) {
            this.zzaad.zzaaf = str2;
        } else if ("ga_logLevel".equals(str)) {
            this.zzaad.zzaag = str2;
        } else {
            this.zzvn.zzbu().zzd("String xml configuration name not recognized", str);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzbt
    public final /* synthetic */ zzcg zzdr() {
        return this.zzaad;
    }
}

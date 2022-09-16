package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class zzdb extends zzaq implements zzbt<zzdc> {
    private final zzdc zzabv;

    public zzdb(zzat zzatVar) {
        super(zzatVar);
        this.zzabv = new zzdc();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzbt
    public final void zza(String str, boolean z) {
        if ("ga_autoActivityTracking".equals(str)) {
            this.zzabv.zzabz = z;
        } else if ("ga_anonymizeIp".equals(str)) {
            this.zzabv.zzaca = z;
        } else if (!"ga_reportUncaughtExceptions".equals(str)) {
            zzd("bool configuration name not recognized", str);
        } else {
            this.zzabv.zzacb = z ? 1 : 0;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzbt
    public final void zzb(String str, int i) {
        if ("ga_sessionTimeout".equals(str)) {
            this.zzabv.zzaby = i;
        } else {
            zzd("int configuration name not recognized", str);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzbt
    public final void zzb(String str, String str2) {
        this.zzabv.zzacc.put(str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzbt
    public final void zzc(String str, String str2) {
        if ("ga_trackingId".equals(str)) {
            this.zzabv.zzabw = str2;
        } else if (!"ga_sampleFrequency".equals(str)) {
            zzd("string configuration name not recognized", str);
        } else {
            try {
                this.zzabv.zzabx = Double.parseDouble(str2);
            } catch (NumberFormatException e) {
                zzc("Error parsing ga_sampleFrequency value", str2, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzbt
    public final /* synthetic */ zzdc zzdr() {
        return this.zzabv;
    }
}

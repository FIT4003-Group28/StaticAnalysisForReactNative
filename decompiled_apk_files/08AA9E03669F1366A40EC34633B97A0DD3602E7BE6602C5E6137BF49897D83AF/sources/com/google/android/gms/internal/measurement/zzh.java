package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class zzh extends zzaca<zzh> {
    private static volatile zzh[] zzog;
    public int key = 0;
    public int value = 0;

    public zzh() {
        this.zzbxg = null;
        this.zzbxr = -1;
    }

    public static zzh[] zzd() {
        if (zzog == null) {
            synchronized (zzace.zzbxq) {
                if (zzog == null) {
                    zzog = new zzh[0];
                }
            }
        }
        return zzog;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        if (this.key != zzhVar.key || this.value != zzhVar.value) {
            return false;
        }
        return (this.zzbxg == null || this.zzbxg.isEmpty()) ? zzhVar.zzbxg == null || zzhVar.zzbxg.isEmpty() : this.zzbxg.equals(zzhVar.zzbxg);
    }

    public final int hashCode() {
        return ((((((getClass().getName().hashCode() + 527) * 31) + this.key) * 31) + this.value) * 31) + ((this.zzbxg == null || this.zzbxg.isEmpty()) ? 0 : this.zzbxg.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final int zza() {
        return super.zza() + zzaby.zzf(1, this.key) + zzaby.zzf(2, this.value);
    }

    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final void zza(zzaby zzabyVar) {
        zzabyVar.zze(1, this.key);
        zzabyVar.zze(2, this.value);
        super.zza(zzabyVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzacg
    public final /* synthetic */ zzacg zzb(zzabx zzabxVar) {
        while (true) {
            int zzvf = zzabxVar.zzvf();
            if (zzvf != 0) {
                if (zzvf == 8) {
                    this.key = zzabxVar.zzvh();
                } else if (zzvf == 16) {
                    this.value = zzabxVar.zzvh();
                } else if (!super.zza(zzabxVar, zzvf)) {
                    return this;
                }
            } else {
                return this;
            }
        }
    }
}

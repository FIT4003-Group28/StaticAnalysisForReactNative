package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class zzd extends zzaca<zzd> {
    private int level = 1;
    private int zznq = 0;
    private int zznr = 0;

    public zzd() {
        this.zzbxg = null;
        this.zzbxr = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzacg
    /* renamed from: zza */
    public final zzd zzb(zzabx zzabxVar) {
        while (true) {
            int zzvf = zzabxVar.zzvf();
            if (zzvf != 0) {
                if (zzvf == 8) {
                    int position = zzabxVar.getPosition();
                    try {
                        int zzvh = zzabxVar.zzvh();
                        if (zzvh <= 0 || zzvh > 3) {
                            StringBuilder sb = new StringBuilder(42);
                            sb.append(zzvh);
                            sb.append(" is not a valid enum CacheLevel");
                            throw new IllegalArgumentException(sb.toString());
                            break;
                        }
                        this.level = zzvh;
                    } catch (IllegalArgumentException unused) {
                        zzabxVar.zzam(position);
                        zza(zzabxVar, zzvf);
                    }
                } else if (zzvf == 16) {
                    this.zznq = zzabxVar.zzvh();
                } else if (zzvf == 24) {
                    this.zznr = zzabxVar.zzvh();
                } else if (!super.zza(zzabxVar, zzvf)) {
                    return this;
                }
            } else {
                return this;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzd)) {
            return false;
        }
        zzd zzdVar = (zzd) obj;
        if (this.level != zzdVar.level || this.zznq != zzdVar.zznq || this.zznr != zzdVar.zznr) {
            return false;
        }
        return (this.zzbxg == null || this.zzbxg.isEmpty()) ? zzdVar.zzbxg == null || zzdVar.zzbxg.isEmpty() : this.zzbxg.equals(zzdVar.zzbxg);
    }

    public final int hashCode() {
        return ((((((((getClass().getName().hashCode() + 527) * 31) + this.level) * 31) + this.zznq) * 31) + this.zznr) * 31) + ((this.zzbxg == null || this.zzbxg.isEmpty()) ? 0 : this.zzbxg.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final int zza() {
        int zza = super.zza();
        if (this.level != 1) {
            zza += zzaby.zzf(1, this.level);
        }
        if (this.zznq != 0) {
            zza += zzaby.zzf(2, this.zznq);
        }
        return this.zznr != 0 ? zza + zzaby.zzf(3, this.zznr) : zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final void zza(zzaby zzabyVar) {
        if (this.level != 1) {
            zzabyVar.zze(1, this.level);
        }
        if (this.zznq != 0) {
            zzabyVar.zze(2, this.zznq);
        }
        if (this.zznr != 0) {
            zzabyVar.zze(3, this.zznr);
        }
        super.zza(zzabyVar);
    }
}

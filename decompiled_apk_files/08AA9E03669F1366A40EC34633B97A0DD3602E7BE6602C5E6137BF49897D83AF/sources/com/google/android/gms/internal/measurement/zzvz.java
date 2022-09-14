package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class zzvz extends zzaca<zzvz> {
    public long zzbmi = 0;
    public zzi zzpv = null;
    public zzl zzbmj = null;

    public zzvz() {
        this.zzbxg = null;
        this.zzbxr = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzvz)) {
            return false;
        }
        zzvz zzvzVar = (zzvz) obj;
        if (this.zzbmi != zzvzVar.zzbmi) {
            return false;
        }
        if (this.zzpv == null) {
            if (zzvzVar.zzpv != null) {
                return false;
            }
        } else if (!this.zzpv.equals(zzvzVar.zzpv)) {
            return false;
        }
        if (this.zzbmj == null) {
            if (zzvzVar.zzbmj != null) {
                return false;
            }
        } else if (!this.zzbmj.equals(zzvzVar.zzbmj)) {
            return false;
        }
        return (this.zzbxg == null || this.zzbxg.isEmpty()) ? zzvzVar.zzbxg == null || zzvzVar.zzbxg.isEmpty() : this.zzbxg.equals(zzvzVar.zzbxg);
    }

    public final int hashCode() {
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + ((int) (this.zzbmi ^ (this.zzbmi >>> 32)));
        zzi zziVar = this.zzpv;
        int i = 0;
        int hashCode2 = (hashCode * 31) + (zziVar == null ? 0 : zziVar.hashCode());
        zzl zzlVar = this.zzbmj;
        int hashCode3 = ((hashCode2 * 31) + (zzlVar == null ? 0 : zzlVar.hashCode())) * 31;
        if (this.zzbxg != null && !this.zzbxg.isEmpty()) {
            i = this.zzbxg.hashCode();
        }
        return hashCode3 + i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final int zza() {
        int zza = super.zza() + zzaby.zzc(1, this.zzbmi);
        if (this.zzpv != null) {
            zza += zzaby.zzb(2, this.zzpv);
        }
        return this.zzbmj != null ? zza + zzaby.zzb(3, this.zzbmj) : zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final void zza(zzaby zzabyVar) {
        zzabyVar.zzb(1, this.zzbmi);
        if (this.zzpv != null) {
            zzabyVar.zza(2, this.zzpv);
        }
        if (this.zzbmj != null) {
            zzabyVar.zza(3, this.zzbmj);
        }
        super.zza(zzabyVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzacg
    public final /* synthetic */ zzacg zzb(zzabx zzabxVar) {
        zzacg zzacgVar;
        while (true) {
            int zzvf = zzabxVar.zzvf();
            if (zzvf != 0) {
                if (zzvf != 8) {
                    if (zzvf == 18) {
                        if (this.zzpv == null) {
                            this.zzpv = new zzi();
                        }
                        zzacgVar = this.zzpv;
                    } else if (zzvf == 26) {
                        if (this.zzbmj == null) {
                            this.zzbmj = new zzl();
                        }
                        zzacgVar = this.zzbmj;
                    } else if (!super.zza(zzabxVar, zzvf)) {
                        return this;
                    }
                    zzabxVar.zza(zzacgVar);
                } else {
                    this.zzbmi = zzabxVar.zzvi();
                }
            } else {
                return this;
            }
        }
    }
}

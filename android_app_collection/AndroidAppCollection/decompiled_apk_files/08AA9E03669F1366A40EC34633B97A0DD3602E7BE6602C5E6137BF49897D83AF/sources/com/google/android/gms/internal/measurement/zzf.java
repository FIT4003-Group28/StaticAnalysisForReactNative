package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class zzf extends zzaca<zzf> {
    private static volatile zzf[] zznx;
    public String zzny = "";
    public long zznz = 0;
    public long zzoa = 2147483647L;
    public boolean zzob = false;
    public long zzoc = 0;

    public zzf() {
        this.zzbxg = null;
        this.zzbxr = -1;
    }

    public static zzf[] zzc() {
        if (zznx == null) {
            synchronized (zzace.zzbxq) {
                if (zznx == null) {
                    zznx = new zzf[0];
                }
            }
        }
        return zznx;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        if (this.zzny == null) {
            if (zzfVar.zzny != null) {
                return false;
            }
        } else if (!this.zzny.equals(zzfVar.zzny)) {
            return false;
        }
        if (this.zznz != zzfVar.zznz || this.zzoa != zzfVar.zzoa || this.zzob != zzfVar.zzob || this.zzoc != zzfVar.zzoc) {
            return false;
        }
        return (this.zzbxg == null || this.zzbxg.isEmpty()) ? zzfVar.zzbxg == null || zzfVar.zzbxg.isEmpty() : this.zzbxg.equals(zzfVar.zzbxg);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + (this.zzny == null ? 0 : this.zzny.hashCode())) * 31) + ((int) (this.zznz ^ (this.zznz >>> 32)))) * 31) + ((int) (this.zzoa ^ (this.zzoa >>> 32)))) * 31) + (this.zzob ? 1231 : 1237)) * 31) + ((int) (this.zzoc ^ (this.zzoc >>> 32)))) * 31;
        if (this.zzbxg != null && !this.zzbxg.isEmpty()) {
            i = this.zzbxg.hashCode();
        }
        return hashCode + i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final int zza() {
        int zza = super.zza();
        if (this.zzny != null && !this.zzny.equals("")) {
            zza += zzaby.zzc(1, this.zzny);
        }
        if (this.zznz != 0) {
            zza += zzaby.zzc(2, this.zznz);
        }
        if (this.zzoa != 2147483647L) {
            zza += zzaby.zzc(3, this.zzoa);
        }
        if (this.zzob) {
            zza += zzaby.zzaq(4) + 1;
        }
        return this.zzoc != 0 ? zza + zzaby.zzc(5, this.zzoc) : zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final void zza(zzaby zzabyVar) {
        if (this.zzny != null && !this.zzny.equals("")) {
            zzabyVar.zzb(1, this.zzny);
        }
        if (this.zznz != 0) {
            zzabyVar.zzb(2, this.zznz);
        }
        if (this.zzoa != 2147483647L) {
            zzabyVar.zzb(3, this.zzoa);
        }
        if (this.zzob) {
            zzabyVar.zza(4, this.zzob);
        }
        if (this.zzoc != 0) {
            zzabyVar.zzb(5, this.zzoc);
        }
        super.zza(zzabyVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzacg
    public final /* synthetic */ zzacg zzb(zzabx zzabxVar) {
        while (true) {
            int zzvf = zzabxVar.zzvf();
            if (zzvf != 0) {
                if (zzvf == 10) {
                    this.zzny = zzabxVar.readString();
                } else if (zzvf == 16) {
                    this.zznz = zzabxVar.zzvi();
                } else if (zzvf == 24) {
                    this.zzoa = zzabxVar.zzvi();
                } else if (zzvf == 32) {
                    this.zzob = zzabxVar.zzvg();
                } else if (zzvf == 40) {
                    this.zzoc = zzabxVar.zzvi();
                } else if (!super.zza(zzabxVar, zzvf)) {
                    return this;
                }
            } else {
                return this;
            }
        }
    }
}

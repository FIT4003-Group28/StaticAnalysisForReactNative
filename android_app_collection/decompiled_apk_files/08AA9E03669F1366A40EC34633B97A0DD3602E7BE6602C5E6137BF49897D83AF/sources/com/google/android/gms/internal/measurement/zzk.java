package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class zzk extends zzaca<zzk> {
    private static volatile zzk[] zzpr;
    public String name = "";
    private zzm zzps = null;
    public zzg zzpt = null;

    public zzk() {
        this.zzbxg = null;
        this.zzbxr = -1;
    }

    public static zzk[] zzf() {
        if (zzpr == null) {
            synchronized (zzace.zzbxq) {
                if (zzpr == null) {
                    zzpr = new zzk[0];
                }
            }
        }
        return zzpr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzk)) {
            return false;
        }
        zzk zzkVar = (zzk) obj;
        if (this.name == null) {
            if (zzkVar.name != null) {
                return false;
            }
        } else if (!this.name.equals(zzkVar.name)) {
            return false;
        }
        if (this.zzps == null) {
            if (zzkVar.zzps != null) {
                return false;
            }
        } else if (!this.zzps.equals(zzkVar.zzps)) {
            return false;
        }
        if (this.zzpt == null) {
            if (zzkVar.zzpt != null) {
                return false;
            }
        } else if (!this.zzpt.equals(zzkVar.zzpt)) {
            return false;
        }
        return (this.zzbxg == null || this.zzbxg.isEmpty()) ? zzkVar.zzbxg == null || zzkVar.zzbxg.isEmpty() : this.zzbxg.equals(zzkVar.zzbxg);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + (this.name == null ? 0 : this.name.hashCode());
        zzm zzmVar = this.zzps;
        int hashCode2 = (hashCode * 31) + (zzmVar == null ? 0 : zzmVar.hashCode());
        zzg zzgVar = this.zzpt;
        int hashCode3 = ((hashCode2 * 31) + (zzgVar == null ? 0 : zzgVar.hashCode())) * 31;
        if (this.zzbxg != null && !this.zzbxg.isEmpty()) {
            i = this.zzbxg.hashCode();
        }
        return hashCode3 + i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final int zza() {
        int zza = super.zza();
        if (this.name != null && !this.name.equals("")) {
            zza += zzaby.zzc(1, this.name);
        }
        if (this.zzps != null) {
            zza += zzaby.zzb(2, this.zzps);
        }
        return this.zzpt != null ? zza + zzaby.zzb(3, this.zzpt) : zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final void zza(zzaby zzabyVar) {
        if (this.name != null && !this.name.equals("")) {
            zzabyVar.zzb(1, this.name);
        }
        if (this.zzps != null) {
            zzabyVar.zza(2, this.zzps);
        }
        if (this.zzpt != null) {
            zzabyVar.zza(3, this.zzpt);
        }
        super.zza(zzabyVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzacg
    public final /* synthetic */ zzacg zzb(zzabx zzabxVar) {
        zzacg zzacgVar;
        while (true) {
            int zzvf = zzabxVar.zzvf();
            if (zzvf != 0) {
                if (zzvf != 10) {
                    if (zzvf == 18) {
                        if (this.zzps == null) {
                            this.zzps = new zzm();
                        }
                        zzacgVar = this.zzps;
                    } else if (zzvf == 26) {
                        if (this.zzpt == null) {
                            this.zzpt = new zzg();
                        }
                        zzacgVar = this.zzpt;
                    } else if (!super.zza(zzabxVar, zzvf)) {
                        return this;
                    }
                    zzabxVar.zza(zzacgVar);
                } else {
                    this.name = zzabxVar.readString();
                }
            } else {
                return this;
            }
        }
    }
}

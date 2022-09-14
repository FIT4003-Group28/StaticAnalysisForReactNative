package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class zzg extends zzaca<zzg> {
    public zzm[] zzod = zzm.zzg();
    public zzm[] zzoe = zzm.zzg();
    public zzf[] zzof = zzf.zzc();

    public zzg() {
        this.zzbxg = null;
        this.zzbxr = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzg)) {
            return false;
        }
        zzg zzgVar = (zzg) obj;
        if (!zzace.equals(this.zzod, zzgVar.zzod) || !zzace.equals(this.zzoe, zzgVar.zzoe) || !zzace.equals(this.zzof, zzgVar.zzof)) {
            return false;
        }
        return (this.zzbxg == null || this.zzbxg.isEmpty()) ? zzgVar.zzbxg == null || zzgVar.zzbxg.isEmpty() : this.zzbxg.equals(zzgVar.zzbxg);
    }

    public final int hashCode() {
        return ((((((((getClass().getName().hashCode() + 527) * 31) + zzace.hashCode(this.zzod)) * 31) + zzace.hashCode(this.zzoe)) * 31) + zzace.hashCode(this.zzof)) * 31) + ((this.zzbxg == null || this.zzbxg.isEmpty()) ? 0 : this.zzbxg.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final int zza() {
        int zza = super.zza();
        if (this.zzod != null && this.zzod.length > 0) {
            int i = zza;
            for (int i2 = 0; i2 < this.zzod.length; i2++) {
                zzm zzmVar = this.zzod[i2];
                if (zzmVar != null) {
                    i += zzaby.zzb(1, zzmVar);
                }
            }
            zza = i;
        }
        if (this.zzoe != null && this.zzoe.length > 0) {
            int i3 = zza;
            for (int i4 = 0; i4 < this.zzoe.length; i4++) {
                zzm zzmVar2 = this.zzoe[i4];
                if (zzmVar2 != null) {
                    i3 += zzaby.zzb(2, zzmVar2);
                }
            }
            zza = i3;
        }
        if (this.zzof != null && this.zzof.length > 0) {
            for (int i5 = 0; i5 < this.zzof.length; i5++) {
                zzf zzfVar = this.zzof[i5];
                if (zzfVar != null) {
                    zza += zzaby.zzb(3, zzfVar);
                }
            }
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final void zza(zzaby zzabyVar) {
        if (this.zzod != null && this.zzod.length > 0) {
            for (int i = 0; i < this.zzod.length; i++) {
                zzm zzmVar = this.zzod[i];
                if (zzmVar != null) {
                    zzabyVar.zza(1, zzmVar);
                }
            }
        }
        if (this.zzoe != null && this.zzoe.length > 0) {
            for (int i2 = 0; i2 < this.zzoe.length; i2++) {
                zzm zzmVar2 = this.zzoe[i2];
                if (zzmVar2 != null) {
                    zzabyVar.zza(2, zzmVar2);
                }
            }
        }
        if (this.zzof != null && this.zzof.length > 0) {
            for (int i3 = 0; i3 < this.zzof.length; i3++) {
                zzf zzfVar = this.zzof[i3];
                if (zzfVar != null) {
                    zzabyVar.zza(3, zzfVar);
                }
            }
        }
        super.zza(zzabyVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzacg
    public final /* synthetic */ zzacg zzb(zzabx zzabxVar) {
        while (true) {
            int zzvf = zzabxVar.zzvf();
            if (zzvf != 0) {
                if (zzvf == 10) {
                    int zzb = zzacj.zzb(zzabxVar, 10);
                    int length = this.zzod == null ? 0 : this.zzod.length;
                    zzm[] zzmVarArr = new zzm[zzb + length];
                    if (length != 0) {
                        System.arraycopy(this.zzod, 0, zzmVarArr, 0, length);
                    }
                    while (length < zzmVarArr.length - 1) {
                        zzmVarArr[length] = new zzm();
                        zzabxVar.zza(zzmVarArr[length]);
                        zzabxVar.zzvf();
                        length++;
                    }
                    zzmVarArr[length] = new zzm();
                    zzabxVar.zza(zzmVarArr[length]);
                    this.zzod = zzmVarArr;
                } else if (zzvf == 18) {
                    int zzb2 = zzacj.zzb(zzabxVar, 18);
                    int length2 = this.zzoe == null ? 0 : this.zzoe.length;
                    zzm[] zzmVarArr2 = new zzm[zzb2 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.zzoe, 0, zzmVarArr2, 0, length2);
                    }
                    while (length2 < zzmVarArr2.length - 1) {
                        zzmVarArr2[length2] = new zzm();
                        zzabxVar.zza(zzmVarArr2[length2]);
                        zzabxVar.zzvf();
                        length2++;
                    }
                    zzmVarArr2[length2] = new zzm();
                    zzabxVar.zza(zzmVarArr2[length2]);
                    this.zzoe = zzmVarArr2;
                } else if (zzvf == 26) {
                    int zzb3 = zzacj.zzb(zzabxVar, 26);
                    int length3 = this.zzof == null ? 0 : this.zzof.length;
                    zzf[] zzfVarArr = new zzf[zzb3 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.zzof, 0, zzfVarArr, 0, length3);
                    }
                    while (length3 < zzfVarArr.length - 1) {
                        zzfVarArr[length3] = new zzf();
                        zzabxVar.zza(zzfVarArr[length3]);
                        zzabxVar.zzvf();
                        length3++;
                    }
                    zzfVarArr[length3] = new zzf();
                    zzabxVar.zza(zzfVarArr[length3]);
                    this.zzof = zzfVarArr;
                } else if (!super.zza(zzabxVar, zzvf)) {
                    return this;
                }
            } else {
                return this;
            }
        }
    }
}

package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class zzl extends zzaca<zzl> {
    public zzk[] zzpu = zzk.zzf();
    public zzi zzpv = null;
    public String zzpw = "";

    public zzl() {
        this.zzbxg = null;
        this.zzbxr = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzl)) {
            return false;
        }
        zzl zzlVar = (zzl) obj;
        if (!zzace.equals(this.zzpu, zzlVar.zzpu)) {
            return false;
        }
        if (this.zzpv == null) {
            if (zzlVar.zzpv != null) {
                return false;
            }
        } else if (!this.zzpv.equals(zzlVar.zzpv)) {
            return false;
        }
        if (this.zzpw == null) {
            if (zzlVar.zzpw != null) {
                return false;
            }
        } else if (!this.zzpw.equals(zzlVar.zzpw)) {
            return false;
        }
        return (this.zzbxg == null || this.zzbxg.isEmpty()) ? zzlVar.zzbxg == null || zzlVar.zzbxg.isEmpty() : this.zzbxg.equals(zzlVar.zzbxg);
    }

    public final int hashCode() {
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + zzace.hashCode(this.zzpu);
        zzi zziVar = this.zzpv;
        int i = 0;
        int hashCode2 = ((((hashCode * 31) + (zziVar == null ? 0 : zziVar.hashCode())) * 31) + (this.zzpw == null ? 0 : this.zzpw.hashCode())) * 31;
        if (this.zzbxg != null && !this.zzbxg.isEmpty()) {
            i = this.zzbxg.hashCode();
        }
        return hashCode2 + i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final int zza() {
        int zza = super.zza();
        if (this.zzpu != null && this.zzpu.length > 0) {
            for (int i = 0; i < this.zzpu.length; i++) {
                zzk zzkVar = this.zzpu[i];
                if (zzkVar != null) {
                    zza += zzaby.zzb(1, zzkVar);
                }
            }
        }
        if (this.zzpv != null) {
            zza += zzaby.zzb(2, this.zzpv);
        }
        return (this.zzpw == null || this.zzpw.equals("")) ? zza : zza + zzaby.zzc(3, this.zzpw);
    }

    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final void zza(zzaby zzabyVar) {
        if (this.zzpu != null && this.zzpu.length > 0) {
            for (int i = 0; i < this.zzpu.length; i++) {
                zzk zzkVar = this.zzpu[i];
                if (zzkVar != null) {
                    zzabyVar.zza(1, zzkVar);
                }
            }
        }
        if (this.zzpv != null) {
            zzabyVar.zza(2, this.zzpv);
        }
        if (this.zzpw != null && !this.zzpw.equals("")) {
            zzabyVar.zzb(3, this.zzpw);
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
                    int length = this.zzpu == null ? 0 : this.zzpu.length;
                    zzk[] zzkVarArr = new zzk[zzb + length];
                    if (length != 0) {
                        System.arraycopy(this.zzpu, 0, zzkVarArr, 0, length);
                    }
                    while (length < zzkVarArr.length - 1) {
                        zzkVarArr[length] = new zzk();
                        zzabxVar.zza(zzkVarArr[length]);
                        zzabxVar.zzvf();
                        length++;
                    }
                    zzkVarArr[length] = new zzk();
                    zzabxVar.zza(zzkVarArr[length]);
                    this.zzpu = zzkVarArr;
                } else if (zzvf == 18) {
                    if (this.zzpv == null) {
                        this.zzpv = new zzi();
                    }
                    zzabxVar.zza(this.zzpv);
                } else if (zzvf == 26) {
                    this.zzpw = zzabxVar.readString();
                } else if (!super.zza(zzabxVar, zzvf)) {
                    return this;
                }
            } else {
                return this;
            }
        }
    }
}

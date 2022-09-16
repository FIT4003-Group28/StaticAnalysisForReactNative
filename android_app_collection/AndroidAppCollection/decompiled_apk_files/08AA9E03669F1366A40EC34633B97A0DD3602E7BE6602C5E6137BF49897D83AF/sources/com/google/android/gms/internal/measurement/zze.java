package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class zze extends zzaca<zze> {
    private static volatile zze[] zzns;
    public int[] zznt = zzacj.zzbts;
    private int zznu = 0;
    private int name = 0;
    private boolean zznv = false;
    private boolean zznw = false;

    public zze() {
        this.zzbxg = null;
        this.zzbxr = -1;
    }

    public static zze[] zzb() {
        if (zzns == null) {
            synchronized (zzace.zzbxq) {
                if (zzns == null) {
                    zzns = new zze[0];
                }
            }
        }
        return zzns;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zzeVar = (zze) obj;
        if (!zzace.equals(this.zznt, zzeVar.zznt) || this.zznu != zzeVar.zznu || this.name != zzeVar.name || this.zznv != zzeVar.zznv || this.zznw != zzeVar.zznw) {
            return false;
        }
        return (this.zzbxg == null || this.zzbxg.isEmpty()) ? zzeVar.zzbxg == null || zzeVar.zzbxg.isEmpty() : this.zzbxg.equals(zzeVar.zzbxg);
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + zzace.hashCode(this.zznt)) * 31) + this.zznu) * 31) + this.name) * 31) + (this.zznv ? 1231 : 1237)) * 31;
        if (this.zznw) {
            i = 1231;
        }
        return ((hashCode + i) * 31) + ((this.zzbxg == null || this.zzbxg.isEmpty()) ? 0 : this.zzbxg.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final int zza() {
        int zza = super.zza();
        if (this.zznw) {
            zza += zzaby.zzaq(1) + 1;
        }
        int zzf = zza + zzaby.zzf(2, this.zznu);
        if (this.zznt != null && this.zznt.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.zznt.length; i2++) {
                i += zzaby.zzao(this.zznt[i2]);
            }
            zzf = zzf + i + (this.zznt.length * 1);
        }
        if (this.name != 0) {
            zzf += zzaby.zzf(4, this.name);
        }
        return this.zznv ? zzf + zzaby.zzaq(6) + 1 : zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final void zza(zzaby zzabyVar) {
        if (this.zznw) {
            zzabyVar.zza(1, this.zznw);
        }
        zzabyVar.zze(2, this.zznu);
        if (this.zznt != null && this.zznt.length > 0) {
            for (int i = 0; i < this.zznt.length; i++) {
                zzabyVar.zze(3, this.zznt[i]);
            }
        }
        if (this.name != 0) {
            zzabyVar.zze(4, this.name);
        }
        if (this.zznv) {
            zzabyVar.zza(6, this.zznv);
        }
        super.zza(zzabyVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzacg
    public final /* synthetic */ zzacg zzb(zzabx zzabxVar) {
        while (true) {
            int zzvf = zzabxVar.zzvf();
            if (zzvf != 0) {
                if (zzvf == 8) {
                    this.zznw = zzabxVar.zzvg();
                } else if (zzvf == 16) {
                    this.zznu = zzabxVar.zzvh();
                } else if (zzvf == 24) {
                    int zzb = zzacj.zzb(zzabxVar, 24);
                    int length = this.zznt == null ? 0 : this.zznt.length;
                    int[] iArr = new int[zzb + length];
                    if (length != 0) {
                        System.arraycopy(this.zznt, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = zzabxVar.zzvh();
                        zzabxVar.zzvf();
                        length++;
                    }
                    iArr[length] = zzabxVar.zzvh();
                    this.zznt = iArr;
                } else if (zzvf == 26) {
                    int zzaf = zzabxVar.zzaf(zzabxVar.zzvh());
                    int position = zzabxVar.getPosition();
                    int i = 0;
                    while (zzabxVar.zzvl() > 0) {
                        zzabxVar.zzvh();
                        i++;
                    }
                    zzabxVar.zzam(position);
                    int length2 = this.zznt == null ? 0 : this.zznt.length;
                    int[] iArr2 = new int[i + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.zznt, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = zzabxVar.zzvh();
                        length2++;
                    }
                    this.zznt = iArr2;
                    zzabxVar.zzal(zzaf);
                } else if (zzvf == 32) {
                    this.name = zzabxVar.zzvh();
                } else if (zzvf == 48) {
                    this.zznv = zzabxVar.zzvg();
                } else if (!super.zza(zzabxVar, zzvf)) {
                    return this;
                }
            } else {
                return this;
            }
        }
    }
}

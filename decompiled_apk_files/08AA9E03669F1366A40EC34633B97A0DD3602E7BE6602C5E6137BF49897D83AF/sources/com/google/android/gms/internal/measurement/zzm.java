package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class zzm extends zzaca<zzm> {
    private static volatile zzm[] zzpx;
    public int type = 1;
    public String string = "";
    public zzm[] zzpy = zzg();
    public zzm[] zzpz = zzg();
    public zzm[] zzqa = zzg();
    public String zzqb = "";
    public String zzqc = "";
    public long zzqd = 0;
    public boolean zzqe = false;
    public zzm[] zzqf = zzg();
    public int[] zzqg = zzacj.zzbts;
    public boolean zzqh = false;

    public zzm() {
        this.zzbxg = null;
        this.zzbxr = -1;
    }

    private static int zza(int i) {
        if (i <= 0 || i > 17) {
            StringBuilder sb = new StringBuilder(40);
            sb.append(i);
            sb.append(" is not a valid enum Escaping");
            throw new IllegalArgumentException(sb.toString());
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzacg
    /* renamed from: zzc */
    public final zzm zzb(zzabx zzabxVar) {
        while (true) {
            int zzvf = zzabxVar.zzvf();
            switch (zzvf) {
                case 0:
                    return this;
                case 8:
                    int position = zzabxVar.getPosition();
                    try {
                        int zzvh = zzabxVar.zzvh();
                        if (zzvh <= 0 || zzvh > 8) {
                            StringBuilder sb = new StringBuilder(36);
                            sb.append(zzvh);
                            sb.append(" is not a valid enum Type");
                            throw new IllegalArgumentException(sb.toString());
                            break;
                        } else {
                            this.type = zzvh;
                            break;
                        }
                    } catch (IllegalArgumentException unused) {
                        zzabxVar.zzam(position);
                        zza(zzabxVar, zzvf);
                        break;
                    }
                case 18:
                    this.string = zzabxVar.readString();
                    break;
                case 26:
                    int zzb = zzacj.zzb(zzabxVar, 26);
                    int length = this.zzpy == null ? 0 : this.zzpy.length;
                    zzm[] zzmVarArr = new zzm[zzb + length];
                    if (length != 0) {
                        System.arraycopy(this.zzpy, 0, zzmVarArr, 0, length);
                    }
                    while (length < zzmVarArr.length - 1) {
                        zzmVarArr[length] = new zzm();
                        zzabxVar.zza(zzmVarArr[length]);
                        zzabxVar.zzvf();
                        length++;
                    }
                    zzmVarArr[length] = new zzm();
                    zzabxVar.zza(zzmVarArr[length]);
                    this.zzpy = zzmVarArr;
                    break;
                case 34:
                    int zzb2 = zzacj.zzb(zzabxVar, 34);
                    int length2 = this.zzpz == null ? 0 : this.zzpz.length;
                    zzm[] zzmVarArr2 = new zzm[zzb2 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.zzpz, 0, zzmVarArr2, 0, length2);
                    }
                    while (length2 < zzmVarArr2.length - 1) {
                        zzmVarArr2[length2] = new zzm();
                        zzabxVar.zza(zzmVarArr2[length2]);
                        zzabxVar.zzvf();
                        length2++;
                    }
                    zzmVarArr2[length2] = new zzm();
                    zzabxVar.zza(zzmVarArr2[length2]);
                    this.zzpz = zzmVarArr2;
                    break;
                case 42:
                    int zzb3 = zzacj.zzb(zzabxVar, 42);
                    int length3 = this.zzqa == null ? 0 : this.zzqa.length;
                    zzm[] zzmVarArr3 = new zzm[zzb3 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.zzqa, 0, zzmVarArr3, 0, length3);
                    }
                    while (length3 < zzmVarArr3.length - 1) {
                        zzmVarArr3[length3] = new zzm();
                        zzabxVar.zza(zzmVarArr3[length3]);
                        zzabxVar.zzvf();
                        length3++;
                    }
                    zzmVarArr3[length3] = new zzm();
                    zzabxVar.zza(zzmVarArr3[length3]);
                    this.zzqa = zzmVarArr3;
                    break;
                case 50:
                    this.zzqb = zzabxVar.readString();
                    break;
                case 58:
                    this.zzqc = zzabxVar.readString();
                    break;
                case 64:
                    this.zzqd = zzabxVar.zzvi();
                    break;
                case 72:
                    this.zzqh = zzabxVar.zzvg();
                    break;
                case 80:
                    int zzb4 = zzacj.zzb(zzabxVar, 80);
                    int[] iArr = new int[zzb4];
                    int i = 0;
                    for (int i2 = 0; i2 < zzb4; i2++) {
                        if (i2 != 0) {
                            zzabxVar.zzvf();
                        }
                        int position2 = zzabxVar.getPosition();
                        try {
                            iArr[i] = zza(zzabxVar.zzvh());
                            i++;
                        } catch (IllegalArgumentException unused2) {
                            zzabxVar.zzam(position2);
                            zza(zzabxVar, zzvf);
                        }
                    }
                    if (i == 0) {
                        break;
                    } else {
                        int length4 = this.zzqg == null ? 0 : this.zzqg.length;
                        if (length4 != 0 || i != iArr.length) {
                            int[] iArr2 = new int[length4 + i];
                            if (length4 != 0) {
                                System.arraycopy(this.zzqg, 0, iArr2, 0, length4);
                            }
                            System.arraycopy(iArr, 0, iArr2, length4, i);
                            this.zzqg = iArr2;
                            break;
                        } else {
                            this.zzqg = iArr;
                            break;
                        }
                    }
                case 82:
                    int zzaf = zzabxVar.zzaf(zzabxVar.zzvh());
                    int position3 = zzabxVar.getPosition();
                    int i3 = 0;
                    while (zzabxVar.zzvl() > 0) {
                        try {
                            zza(zzabxVar.zzvh());
                            i3++;
                        } catch (IllegalArgumentException unused3) {
                        }
                    }
                    if (i3 != 0) {
                        zzabxVar.zzam(position3);
                        int length5 = this.zzqg == null ? 0 : this.zzqg.length;
                        int[] iArr3 = new int[i3 + length5];
                        if (length5 != 0) {
                            System.arraycopy(this.zzqg, 0, iArr3, 0, length5);
                        }
                        while (zzabxVar.zzvl() > 0) {
                            int position4 = zzabxVar.getPosition();
                            try {
                                iArr3[length5] = zza(zzabxVar.zzvh());
                                length5++;
                            } catch (IllegalArgumentException unused4) {
                                zzabxVar.zzam(position4);
                                zza(zzabxVar, 80);
                            }
                        }
                        this.zzqg = iArr3;
                    }
                    zzabxVar.zzal(zzaf);
                    break;
                case 90:
                    int zzb5 = zzacj.zzb(zzabxVar, 90);
                    int length6 = this.zzqf == null ? 0 : this.zzqf.length;
                    zzm[] zzmVarArr4 = new zzm[zzb5 + length6];
                    if (length6 != 0) {
                        System.arraycopy(this.zzqf, 0, zzmVarArr4, 0, length6);
                    }
                    while (length6 < zzmVarArr4.length - 1) {
                        zzmVarArr4[length6] = new zzm();
                        zzabxVar.zza(zzmVarArr4[length6]);
                        zzabxVar.zzvf();
                        length6++;
                    }
                    zzmVarArr4[length6] = new zzm();
                    zzabxVar.zza(zzmVarArr4[length6]);
                    this.zzqf = zzmVarArr4;
                    break;
                case 96:
                    this.zzqe = zzabxVar.zzvg();
                    break;
                default:
                    if (!super.zza(zzabxVar, zzvf)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static zzm[] zzg() {
        if (zzpx == null) {
            synchronized (zzace.zzbxq) {
                if (zzpx == null) {
                    zzpx = new zzm[0];
                }
            }
        }
        return zzpx;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        if (this.type != zzmVar.type) {
            return false;
        }
        if (this.string == null) {
            if (zzmVar.string != null) {
                return false;
            }
        } else if (!this.string.equals(zzmVar.string)) {
            return false;
        }
        if (!zzace.equals(this.zzpy, zzmVar.zzpy) || !zzace.equals(this.zzpz, zzmVar.zzpz) || !zzace.equals(this.zzqa, zzmVar.zzqa)) {
            return false;
        }
        if (this.zzqb == null) {
            if (zzmVar.zzqb != null) {
                return false;
            }
        } else if (!this.zzqb.equals(zzmVar.zzqb)) {
            return false;
        }
        if (this.zzqc == null) {
            if (zzmVar.zzqc != null) {
                return false;
            }
        } else if (!this.zzqc.equals(zzmVar.zzqc)) {
            return false;
        }
        if (this.zzqd != zzmVar.zzqd || this.zzqe != zzmVar.zzqe || !zzace.equals(this.zzqf, zzmVar.zzqf) || !zzace.equals(this.zzqg, zzmVar.zzqg) || this.zzqh != zzmVar.zzqh) {
            return false;
        }
        return (this.zzbxg == null || this.zzbxg.isEmpty()) ? zzmVar.zzbxg == null || zzmVar.zzbxg.isEmpty() : this.zzbxg.equals(zzmVar.zzbxg);
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 1237;
        int hashCode = (((((((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.type) * 31) + (this.string == null ? 0 : this.string.hashCode())) * 31) + zzace.hashCode(this.zzpy)) * 31) + zzace.hashCode(this.zzpz)) * 31) + zzace.hashCode(this.zzqa)) * 31) + (this.zzqb == null ? 0 : this.zzqb.hashCode())) * 31) + (this.zzqc == null ? 0 : this.zzqc.hashCode())) * 31) + ((int) (this.zzqd ^ (this.zzqd >>> 32)))) * 31) + (this.zzqe ? 1231 : 1237)) * 31) + zzace.hashCode(this.zzqf)) * 31) + zzace.hashCode(this.zzqg)) * 31;
        if (this.zzqh) {
            i2 = 1231;
        }
        int i3 = (hashCode + i2) * 31;
        if (this.zzbxg != null && !this.zzbxg.isEmpty()) {
            i = this.zzbxg.hashCode();
        }
        return i3 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    protected final int zza() {
        int zza = super.zza() + zzaby.zzf(1, this.type);
        if (this.string != null && !this.string.equals("")) {
            zza += zzaby.zzc(2, this.string);
        }
        if (this.zzpy != null && this.zzpy.length > 0) {
            int i = zza;
            for (int i2 = 0; i2 < this.zzpy.length; i2++) {
                zzm zzmVar = this.zzpy[i2];
                if (zzmVar != null) {
                    i += zzaby.zzb(3, zzmVar);
                }
            }
            zza = i;
        }
        if (this.zzpz != null && this.zzpz.length > 0) {
            int i3 = zza;
            for (int i4 = 0; i4 < this.zzpz.length; i4++) {
                zzm zzmVar2 = this.zzpz[i4];
                if (zzmVar2 != null) {
                    i3 += zzaby.zzb(4, zzmVar2);
                }
            }
            zza = i3;
        }
        if (this.zzqa != null && this.zzqa.length > 0) {
            int i5 = zza;
            for (int i6 = 0; i6 < this.zzqa.length; i6++) {
                zzm zzmVar3 = this.zzqa[i6];
                if (zzmVar3 != null) {
                    i5 += zzaby.zzb(5, zzmVar3);
                }
            }
            zza = i5;
        }
        if (this.zzqb != null && !this.zzqb.equals("")) {
            zza += zzaby.zzc(6, this.zzqb);
        }
        if (this.zzqc != null && !this.zzqc.equals("")) {
            zza += zzaby.zzc(7, this.zzqc);
        }
        if (this.zzqd != 0) {
            zza += zzaby.zzc(8, this.zzqd);
        }
        if (this.zzqh) {
            zza += zzaby.zzaq(9) + 1;
        }
        if (this.zzqg != null && this.zzqg.length > 0) {
            int i7 = 0;
            for (int i8 = 0; i8 < this.zzqg.length; i8++) {
                i7 += zzaby.zzao(this.zzqg[i8]);
            }
            zza = zza + i7 + (this.zzqg.length * 1);
        }
        if (this.zzqf != null && this.zzqf.length > 0) {
            for (int i9 = 0; i9 < this.zzqf.length; i9++) {
                zzm zzmVar4 = this.zzqf[i9];
                if (zzmVar4 != null) {
                    zza += zzaby.zzb(11, zzmVar4);
                }
            }
        }
        return this.zzqe ? zza + zzaby.zzaq(12) + 1 : zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final void zza(zzaby zzabyVar) {
        zzabyVar.zze(1, this.type);
        if (this.string != null && !this.string.equals("")) {
            zzabyVar.zzb(2, this.string);
        }
        if (this.zzpy != null && this.zzpy.length > 0) {
            for (int i = 0; i < this.zzpy.length; i++) {
                zzm zzmVar = this.zzpy[i];
                if (zzmVar != null) {
                    zzabyVar.zza(3, zzmVar);
                }
            }
        }
        if (this.zzpz != null && this.zzpz.length > 0) {
            for (int i2 = 0; i2 < this.zzpz.length; i2++) {
                zzm zzmVar2 = this.zzpz[i2];
                if (zzmVar2 != null) {
                    zzabyVar.zza(4, zzmVar2);
                }
            }
        }
        if (this.zzqa != null && this.zzqa.length > 0) {
            for (int i3 = 0; i3 < this.zzqa.length; i3++) {
                zzm zzmVar3 = this.zzqa[i3];
                if (zzmVar3 != null) {
                    zzabyVar.zza(5, zzmVar3);
                }
            }
        }
        if (this.zzqb != null && !this.zzqb.equals("")) {
            zzabyVar.zzb(6, this.zzqb);
        }
        if (this.zzqc != null && !this.zzqc.equals("")) {
            zzabyVar.zzb(7, this.zzqc);
        }
        if (this.zzqd != 0) {
            zzabyVar.zzb(8, this.zzqd);
        }
        if (this.zzqh) {
            zzabyVar.zza(9, this.zzqh);
        }
        if (this.zzqg != null && this.zzqg.length > 0) {
            for (int i4 = 0; i4 < this.zzqg.length; i4++) {
                zzabyVar.zze(10, this.zzqg[i4]);
            }
        }
        if (this.zzqf != null && this.zzqf.length > 0) {
            for (int i5 = 0; i5 < this.zzqf.length; i5++) {
                zzm zzmVar4 = this.zzqf[i5];
                if (zzmVar4 != null) {
                    zzabyVar.zza(11, zzmVar4);
                }
            }
        }
        if (this.zzqe) {
            zzabyVar.zza(12, this.zzqe);
        }
        super.zza(zzabyVar);
    }
}

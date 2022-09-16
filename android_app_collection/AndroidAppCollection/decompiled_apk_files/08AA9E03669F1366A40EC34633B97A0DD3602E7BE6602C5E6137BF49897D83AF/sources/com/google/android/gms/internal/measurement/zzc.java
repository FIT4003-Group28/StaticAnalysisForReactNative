package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class zzc {

    /* loaded from: classes.dex */
    public static final class zza extends zzaca<zza> {
        public static final zzacb<zzm, zza> zzpi = zzacb.zza(11, zza.class, 810);
        private static final zza[] zzpj = new zza[0];
        public int[] zzpk = zzacj.zzbts;
        public int[] zzpl = zzacj.zzbts;
        public int[] zzpm = zzacj.zzbts;
        private int zzpn = 0;
        public int[] zzpo = zzacj.zzbts;
        public int zzpp = 0;
        private int zzpq = 0;

        public zza() {
            this.zzbxg = null;
            this.zzbxr = -1;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zzaVar = (zza) obj;
            if (!zzace.equals(this.zzpk, zzaVar.zzpk) || !zzace.equals(this.zzpl, zzaVar.zzpl) || !zzace.equals(this.zzpm, zzaVar.zzpm) || this.zzpn != zzaVar.zzpn || !zzace.equals(this.zzpo, zzaVar.zzpo) || this.zzpp != zzaVar.zzpp || this.zzpq != zzaVar.zzpq) {
                return false;
            }
            return (this.zzbxg == null || this.zzbxg.isEmpty()) ? zzaVar.zzbxg == null || zzaVar.zzbxg.isEmpty() : this.zzbxg.equals(zzaVar.zzbxg);
        }

        public final int hashCode() {
            return ((((((((((((((((getClass().getName().hashCode() + 527) * 31) + zzace.hashCode(this.zzpk)) * 31) + zzace.hashCode(this.zzpl)) * 31) + zzace.hashCode(this.zzpm)) * 31) + this.zzpn) * 31) + zzace.hashCode(this.zzpo)) * 31) + this.zzpp) * 31) + this.zzpq) * 31) + ((this.zzbxg == null || this.zzbxg.isEmpty()) ? 0 : this.zzbxg.hashCode());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
        public final int zza() {
            int zza = super.zza();
            if (this.zzpk != null && this.zzpk.length > 0) {
                int i = 0;
                for (int i2 = 0; i2 < this.zzpk.length; i2++) {
                    i += zzaby.zzao(this.zzpk[i2]);
                }
                zza = zza + i + (this.zzpk.length * 1);
            }
            if (this.zzpl != null && this.zzpl.length > 0) {
                int i3 = 0;
                for (int i4 = 0; i4 < this.zzpl.length; i4++) {
                    i3 += zzaby.zzao(this.zzpl[i4]);
                }
                zza = zza + i3 + (this.zzpl.length * 1);
            }
            if (this.zzpm != null && this.zzpm.length > 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < this.zzpm.length; i6++) {
                    i5 += zzaby.zzao(this.zzpm[i6]);
                }
                zza = zza + i5 + (this.zzpm.length * 1);
            }
            if (this.zzpn != 0) {
                zza += zzaby.zzf(4, this.zzpn);
            }
            if (this.zzpo != null && this.zzpo.length > 0) {
                int i7 = 0;
                for (int i8 = 0; i8 < this.zzpo.length; i8++) {
                    i7 += zzaby.zzao(this.zzpo[i8]);
                }
                zza = zza + i7 + (this.zzpo.length * 1);
            }
            if (this.zzpp != 0) {
                zza += zzaby.zzf(6, this.zzpp);
            }
            return this.zzpq != 0 ? zza + zzaby.zzf(7, this.zzpq) : zza;
        }

        @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
        public final void zza(zzaby zzabyVar) {
            if (this.zzpk != null && this.zzpk.length > 0) {
                for (int i = 0; i < this.zzpk.length; i++) {
                    zzabyVar.zze(1, this.zzpk[i]);
                }
            }
            if (this.zzpl != null && this.zzpl.length > 0) {
                for (int i2 = 0; i2 < this.zzpl.length; i2++) {
                    zzabyVar.zze(2, this.zzpl[i2]);
                }
            }
            if (this.zzpm != null && this.zzpm.length > 0) {
                for (int i3 = 0; i3 < this.zzpm.length; i3++) {
                    zzabyVar.zze(3, this.zzpm[i3]);
                }
            }
            if (this.zzpn != 0) {
                zzabyVar.zze(4, this.zzpn);
            }
            if (this.zzpo != null && this.zzpo.length > 0) {
                for (int i4 = 0; i4 < this.zzpo.length; i4++) {
                    zzabyVar.zze(5, this.zzpo[i4]);
                }
            }
            if (this.zzpp != 0) {
                zzabyVar.zze(6, this.zzpp);
            }
            if (this.zzpq != 0) {
                zzabyVar.zze(7, this.zzpq);
            }
            super.zza(zzabyVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzacg
        public final /* synthetic */ zzacg zzb(zzabx zzabxVar) {
            int zzaf;
            while (true) {
                int zzvf = zzabxVar.zzvf();
                switch (zzvf) {
                    case 0:
                        return this;
                    case 8:
                        int zzb = zzacj.zzb(zzabxVar, 8);
                        int length = this.zzpk == null ? 0 : this.zzpk.length;
                        int[] iArr = new int[zzb + length];
                        if (length != 0) {
                            System.arraycopy(this.zzpk, 0, iArr, 0, length);
                        }
                        while (length < iArr.length - 1) {
                            iArr[length] = zzabxVar.zzvh();
                            zzabxVar.zzvf();
                            length++;
                        }
                        iArr[length] = zzabxVar.zzvh();
                        this.zzpk = iArr;
                        continue;
                    case 10:
                        zzaf = zzabxVar.zzaf(zzabxVar.zzvh());
                        int position = zzabxVar.getPosition();
                        int i = 0;
                        while (zzabxVar.zzvl() > 0) {
                            zzabxVar.zzvh();
                            i++;
                        }
                        zzabxVar.zzam(position);
                        int length2 = this.zzpk == null ? 0 : this.zzpk.length;
                        int[] iArr2 = new int[i + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.zzpk, 0, iArr2, 0, length2);
                        }
                        while (length2 < iArr2.length) {
                            iArr2[length2] = zzabxVar.zzvh();
                            length2++;
                        }
                        this.zzpk = iArr2;
                        break;
                    case 16:
                        int zzb2 = zzacj.zzb(zzabxVar, 16);
                        int length3 = this.zzpl == null ? 0 : this.zzpl.length;
                        int[] iArr3 = new int[zzb2 + length3];
                        if (length3 != 0) {
                            System.arraycopy(this.zzpl, 0, iArr3, 0, length3);
                        }
                        while (length3 < iArr3.length - 1) {
                            iArr3[length3] = zzabxVar.zzvh();
                            zzabxVar.zzvf();
                            length3++;
                        }
                        iArr3[length3] = zzabxVar.zzvh();
                        this.zzpl = iArr3;
                        continue;
                    case 18:
                        zzaf = zzabxVar.zzaf(zzabxVar.zzvh());
                        int position2 = zzabxVar.getPosition();
                        int i2 = 0;
                        while (zzabxVar.zzvl() > 0) {
                            zzabxVar.zzvh();
                            i2++;
                        }
                        zzabxVar.zzam(position2);
                        int length4 = this.zzpl == null ? 0 : this.zzpl.length;
                        int[] iArr4 = new int[i2 + length4];
                        if (length4 != 0) {
                            System.arraycopy(this.zzpl, 0, iArr4, 0, length4);
                        }
                        while (length4 < iArr4.length) {
                            iArr4[length4] = zzabxVar.zzvh();
                            length4++;
                        }
                        this.zzpl = iArr4;
                        break;
                    case 24:
                        int zzb3 = zzacj.zzb(zzabxVar, 24);
                        int length5 = this.zzpm == null ? 0 : this.zzpm.length;
                        int[] iArr5 = new int[zzb3 + length5];
                        if (length5 != 0) {
                            System.arraycopy(this.zzpm, 0, iArr5, 0, length5);
                        }
                        while (length5 < iArr5.length - 1) {
                            iArr5[length5] = zzabxVar.zzvh();
                            zzabxVar.zzvf();
                            length5++;
                        }
                        iArr5[length5] = zzabxVar.zzvh();
                        this.zzpm = iArr5;
                        continue;
                    case 26:
                        zzaf = zzabxVar.zzaf(zzabxVar.zzvh());
                        int position3 = zzabxVar.getPosition();
                        int i3 = 0;
                        while (zzabxVar.zzvl() > 0) {
                            zzabxVar.zzvh();
                            i3++;
                        }
                        zzabxVar.zzam(position3);
                        int length6 = this.zzpm == null ? 0 : this.zzpm.length;
                        int[] iArr6 = new int[i3 + length6];
                        if (length6 != 0) {
                            System.arraycopy(this.zzpm, 0, iArr6, 0, length6);
                        }
                        while (length6 < iArr6.length) {
                            iArr6[length6] = zzabxVar.zzvh();
                            length6++;
                        }
                        this.zzpm = iArr6;
                        break;
                    case 32:
                        this.zzpn = zzabxVar.zzvh();
                        continue;
                    case 40:
                        int zzb4 = zzacj.zzb(zzabxVar, 40);
                        int length7 = this.zzpo == null ? 0 : this.zzpo.length;
                        int[] iArr7 = new int[zzb4 + length7];
                        if (length7 != 0) {
                            System.arraycopy(this.zzpo, 0, iArr7, 0, length7);
                        }
                        while (length7 < iArr7.length - 1) {
                            iArr7[length7] = zzabxVar.zzvh();
                            zzabxVar.zzvf();
                            length7++;
                        }
                        iArr7[length7] = zzabxVar.zzvh();
                        this.zzpo = iArr7;
                        continue;
                    case 42:
                        zzaf = zzabxVar.zzaf(zzabxVar.zzvh());
                        int position4 = zzabxVar.getPosition();
                        int i4 = 0;
                        while (zzabxVar.zzvl() > 0) {
                            zzabxVar.zzvh();
                            i4++;
                        }
                        zzabxVar.zzam(position4);
                        int length8 = this.zzpo == null ? 0 : this.zzpo.length;
                        int[] iArr8 = new int[i4 + length8];
                        if (length8 != 0) {
                            System.arraycopy(this.zzpo, 0, iArr8, 0, length8);
                        }
                        while (length8 < iArr8.length) {
                            iArr8[length8] = zzabxVar.zzvh();
                            length8++;
                        }
                        this.zzpo = iArr8;
                        break;
                    case 48:
                        this.zzpp = zzabxVar.zzvh();
                        continue;
                    case 56:
                        this.zzpq = zzabxVar.zzvh();
                        continue;
                    default:
                        if (!super.zza(zzabxVar, zzvf)) {
                            return this;
                        }
                        continue;
                }
                zzabxVar.zzal(zzaf);
            }
        }
    }
}

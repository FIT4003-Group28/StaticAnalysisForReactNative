package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class zzj extends zzaca<zzj> {
    private static volatile zzj[] zzox;
    public int[] zzoy = zzacj.zzbts;
    public int[] zzoz = zzacj.zzbts;
    public int[] zzpa = zzacj.zzbts;
    public int[] zzpb = zzacj.zzbts;
    public int[] zzpc = zzacj.zzbts;
    public int[] zzpd = zzacj.zzbts;
    public int[] zzpe = zzacj.zzbts;
    public int[] zzpf = zzacj.zzbts;
    public int[] zzpg = zzacj.zzbts;
    public int[] zzph = zzacj.zzbts;

    public zzj() {
        this.zzbxg = null;
        this.zzbxr = -1;
    }

    public static zzj[] zze() {
        if (zzox == null) {
            synchronized (zzace.zzbxq) {
                if (zzox == null) {
                    zzox = new zzj[0];
                }
            }
        }
        return zzox;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        if (!zzace.equals(this.zzoy, zzjVar.zzoy) || !zzace.equals(this.zzoz, zzjVar.zzoz) || !zzace.equals(this.zzpa, zzjVar.zzpa) || !zzace.equals(this.zzpb, zzjVar.zzpb) || !zzace.equals(this.zzpc, zzjVar.zzpc) || !zzace.equals(this.zzpd, zzjVar.zzpd) || !zzace.equals(this.zzpe, zzjVar.zzpe) || !zzace.equals(this.zzpf, zzjVar.zzpf) || !zzace.equals(this.zzpg, zzjVar.zzpg) || !zzace.equals(this.zzph, zzjVar.zzph)) {
            return false;
        }
        return (this.zzbxg == null || this.zzbxg.isEmpty()) ? zzjVar.zzbxg == null || zzjVar.zzbxg.isEmpty() : this.zzbxg.equals(zzjVar.zzbxg);
    }

    public final int hashCode() {
        return ((((((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + zzace.hashCode(this.zzoy)) * 31) + zzace.hashCode(this.zzoz)) * 31) + zzace.hashCode(this.zzpa)) * 31) + zzace.hashCode(this.zzpb)) * 31) + zzace.hashCode(this.zzpc)) * 31) + zzace.hashCode(this.zzpd)) * 31) + zzace.hashCode(this.zzpe)) * 31) + zzace.hashCode(this.zzpf)) * 31) + zzace.hashCode(this.zzpg)) * 31) + zzace.hashCode(this.zzph)) * 31) + ((this.zzbxg == null || this.zzbxg.isEmpty()) ? 0 : this.zzbxg.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final int zza() {
        int zza = super.zza();
        if (this.zzoy != null && this.zzoy.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.zzoy.length; i2++) {
                i += zzaby.zzao(this.zzoy[i2]);
            }
            zza = zza + i + (this.zzoy.length * 1);
        }
        if (this.zzoz != null && this.zzoz.length > 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.zzoz.length; i4++) {
                i3 += zzaby.zzao(this.zzoz[i4]);
            }
            zza = zza + i3 + (this.zzoz.length * 1);
        }
        if (this.zzpa != null && this.zzpa.length > 0) {
            int i5 = 0;
            for (int i6 = 0; i6 < this.zzpa.length; i6++) {
                i5 += zzaby.zzao(this.zzpa[i6]);
            }
            zza = zza + i5 + (this.zzpa.length * 1);
        }
        if (this.zzpb != null && this.zzpb.length > 0) {
            int i7 = 0;
            for (int i8 = 0; i8 < this.zzpb.length; i8++) {
                i7 += zzaby.zzao(this.zzpb[i8]);
            }
            zza = zza + i7 + (this.zzpb.length * 1);
        }
        if (this.zzpc != null && this.zzpc.length > 0) {
            int i9 = 0;
            for (int i10 = 0; i10 < this.zzpc.length; i10++) {
                i9 += zzaby.zzao(this.zzpc[i10]);
            }
            zza = zza + i9 + (this.zzpc.length * 1);
        }
        if (this.zzpd != null && this.zzpd.length > 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.zzpd.length; i12++) {
                i11 += zzaby.zzao(this.zzpd[i12]);
            }
            zza = zza + i11 + (this.zzpd.length * 1);
        }
        if (this.zzpe != null && this.zzpe.length > 0) {
            int i13 = 0;
            for (int i14 = 0; i14 < this.zzpe.length; i14++) {
                i13 += zzaby.zzao(this.zzpe[i14]);
            }
            zza = zza + i13 + (this.zzpe.length * 1);
        }
        if (this.zzpf != null && this.zzpf.length > 0) {
            int i15 = 0;
            for (int i16 = 0; i16 < this.zzpf.length; i16++) {
                i15 += zzaby.zzao(this.zzpf[i16]);
            }
            zza = zza + i15 + (this.zzpf.length * 1);
        }
        if (this.zzpg != null && this.zzpg.length > 0) {
            int i17 = 0;
            for (int i18 = 0; i18 < this.zzpg.length; i18++) {
                i17 += zzaby.zzao(this.zzpg[i18]);
            }
            zza = zza + i17 + (this.zzpg.length * 1);
        }
        if (this.zzph == null || this.zzph.length <= 0) {
            return zza;
        }
        int i19 = 0;
        for (int i20 = 0; i20 < this.zzph.length; i20++) {
            i19 += zzaby.zzao(this.zzph[i20]);
        }
        return zza + i19 + (this.zzph.length * 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final void zza(zzaby zzabyVar) {
        if (this.zzoy != null && this.zzoy.length > 0) {
            for (int i = 0; i < this.zzoy.length; i++) {
                zzabyVar.zze(1, this.zzoy[i]);
            }
        }
        if (this.zzoz != null && this.zzoz.length > 0) {
            for (int i2 = 0; i2 < this.zzoz.length; i2++) {
                zzabyVar.zze(2, this.zzoz[i2]);
            }
        }
        if (this.zzpa != null && this.zzpa.length > 0) {
            for (int i3 = 0; i3 < this.zzpa.length; i3++) {
                zzabyVar.zze(3, this.zzpa[i3]);
            }
        }
        if (this.zzpb != null && this.zzpb.length > 0) {
            for (int i4 = 0; i4 < this.zzpb.length; i4++) {
                zzabyVar.zze(4, this.zzpb[i4]);
            }
        }
        if (this.zzpc != null && this.zzpc.length > 0) {
            for (int i5 = 0; i5 < this.zzpc.length; i5++) {
                zzabyVar.zze(5, this.zzpc[i5]);
            }
        }
        if (this.zzpd != null && this.zzpd.length > 0) {
            for (int i6 = 0; i6 < this.zzpd.length; i6++) {
                zzabyVar.zze(6, this.zzpd[i6]);
            }
        }
        if (this.zzpe != null && this.zzpe.length > 0) {
            for (int i7 = 0; i7 < this.zzpe.length; i7++) {
                zzabyVar.zze(7, this.zzpe[i7]);
            }
        }
        if (this.zzpf != null && this.zzpf.length > 0) {
            for (int i8 = 0; i8 < this.zzpf.length; i8++) {
                zzabyVar.zze(8, this.zzpf[i8]);
            }
        }
        if (this.zzpg != null && this.zzpg.length > 0) {
            for (int i9 = 0; i9 < this.zzpg.length; i9++) {
                zzabyVar.zze(9, this.zzpg[i9]);
            }
        }
        if (this.zzph != null && this.zzph.length > 0) {
            for (int i10 = 0; i10 < this.zzph.length; i10++) {
                zzabyVar.zze(10, this.zzph[i10]);
            }
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
                    int length = this.zzoy == null ? 0 : this.zzoy.length;
                    int[] iArr = new int[zzb + length];
                    if (length != 0) {
                        System.arraycopy(this.zzoy, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = zzabxVar.zzvh();
                        zzabxVar.zzvf();
                        length++;
                    }
                    iArr[length] = zzabxVar.zzvh();
                    this.zzoy = iArr;
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
                    int length2 = this.zzoy == null ? 0 : this.zzoy.length;
                    int[] iArr2 = new int[i + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.zzoy, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = zzabxVar.zzvh();
                        length2++;
                    }
                    this.zzoy = iArr2;
                    break;
                case 16:
                    int zzb2 = zzacj.zzb(zzabxVar, 16);
                    int length3 = this.zzoz == null ? 0 : this.zzoz.length;
                    int[] iArr3 = new int[zzb2 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.zzoz, 0, iArr3, 0, length3);
                    }
                    while (length3 < iArr3.length - 1) {
                        iArr3[length3] = zzabxVar.zzvh();
                        zzabxVar.zzvf();
                        length3++;
                    }
                    iArr3[length3] = zzabxVar.zzvh();
                    this.zzoz = iArr3;
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
                    int length4 = this.zzoz == null ? 0 : this.zzoz.length;
                    int[] iArr4 = new int[i2 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.zzoz, 0, iArr4, 0, length4);
                    }
                    while (length4 < iArr4.length) {
                        iArr4[length4] = zzabxVar.zzvh();
                        length4++;
                    }
                    this.zzoz = iArr4;
                    break;
                case 24:
                    int zzb3 = zzacj.zzb(zzabxVar, 24);
                    int length5 = this.zzpa == null ? 0 : this.zzpa.length;
                    int[] iArr5 = new int[zzb3 + length5];
                    if (length5 != 0) {
                        System.arraycopy(this.zzpa, 0, iArr5, 0, length5);
                    }
                    while (length5 < iArr5.length - 1) {
                        iArr5[length5] = zzabxVar.zzvh();
                        zzabxVar.zzvf();
                        length5++;
                    }
                    iArr5[length5] = zzabxVar.zzvh();
                    this.zzpa = iArr5;
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
                    int length6 = this.zzpa == null ? 0 : this.zzpa.length;
                    int[] iArr6 = new int[i3 + length6];
                    if (length6 != 0) {
                        System.arraycopy(this.zzpa, 0, iArr6, 0, length6);
                    }
                    while (length6 < iArr6.length) {
                        iArr6[length6] = zzabxVar.zzvh();
                        length6++;
                    }
                    this.zzpa = iArr6;
                    break;
                case 32:
                    int zzb4 = zzacj.zzb(zzabxVar, 32);
                    int length7 = this.zzpb == null ? 0 : this.zzpb.length;
                    int[] iArr7 = new int[zzb4 + length7];
                    if (length7 != 0) {
                        System.arraycopy(this.zzpb, 0, iArr7, 0, length7);
                    }
                    while (length7 < iArr7.length - 1) {
                        iArr7[length7] = zzabxVar.zzvh();
                        zzabxVar.zzvf();
                        length7++;
                    }
                    iArr7[length7] = zzabxVar.zzvh();
                    this.zzpb = iArr7;
                    continue;
                case 34:
                    zzaf = zzabxVar.zzaf(zzabxVar.zzvh());
                    int position4 = zzabxVar.getPosition();
                    int i4 = 0;
                    while (zzabxVar.zzvl() > 0) {
                        zzabxVar.zzvh();
                        i4++;
                    }
                    zzabxVar.zzam(position4);
                    int length8 = this.zzpb == null ? 0 : this.zzpb.length;
                    int[] iArr8 = new int[i4 + length8];
                    if (length8 != 0) {
                        System.arraycopy(this.zzpb, 0, iArr8, 0, length8);
                    }
                    while (length8 < iArr8.length) {
                        iArr8[length8] = zzabxVar.zzvh();
                        length8++;
                    }
                    this.zzpb = iArr8;
                    break;
                case 40:
                    int zzb5 = zzacj.zzb(zzabxVar, 40);
                    int length9 = this.zzpc == null ? 0 : this.zzpc.length;
                    int[] iArr9 = new int[zzb5 + length9];
                    if (length9 != 0) {
                        System.arraycopy(this.zzpc, 0, iArr9, 0, length9);
                    }
                    while (length9 < iArr9.length - 1) {
                        iArr9[length9] = zzabxVar.zzvh();
                        zzabxVar.zzvf();
                        length9++;
                    }
                    iArr9[length9] = zzabxVar.zzvh();
                    this.zzpc = iArr9;
                    continue;
                case 42:
                    zzaf = zzabxVar.zzaf(zzabxVar.zzvh());
                    int position5 = zzabxVar.getPosition();
                    int i5 = 0;
                    while (zzabxVar.zzvl() > 0) {
                        zzabxVar.zzvh();
                        i5++;
                    }
                    zzabxVar.zzam(position5);
                    int length10 = this.zzpc == null ? 0 : this.zzpc.length;
                    int[] iArr10 = new int[i5 + length10];
                    if (length10 != 0) {
                        System.arraycopy(this.zzpc, 0, iArr10, 0, length10);
                    }
                    while (length10 < iArr10.length) {
                        iArr10[length10] = zzabxVar.zzvh();
                        length10++;
                    }
                    this.zzpc = iArr10;
                    break;
                case 48:
                    int zzb6 = zzacj.zzb(zzabxVar, 48);
                    int length11 = this.zzpd == null ? 0 : this.zzpd.length;
                    int[] iArr11 = new int[zzb6 + length11];
                    if (length11 != 0) {
                        System.arraycopy(this.zzpd, 0, iArr11, 0, length11);
                    }
                    while (length11 < iArr11.length - 1) {
                        iArr11[length11] = zzabxVar.zzvh();
                        zzabxVar.zzvf();
                        length11++;
                    }
                    iArr11[length11] = zzabxVar.zzvh();
                    this.zzpd = iArr11;
                    continue;
                case 50:
                    zzaf = zzabxVar.zzaf(zzabxVar.zzvh());
                    int position6 = zzabxVar.getPosition();
                    int i6 = 0;
                    while (zzabxVar.zzvl() > 0) {
                        zzabxVar.zzvh();
                        i6++;
                    }
                    zzabxVar.zzam(position6);
                    int length12 = this.zzpd == null ? 0 : this.zzpd.length;
                    int[] iArr12 = new int[i6 + length12];
                    if (length12 != 0) {
                        System.arraycopy(this.zzpd, 0, iArr12, 0, length12);
                    }
                    while (length12 < iArr12.length) {
                        iArr12[length12] = zzabxVar.zzvh();
                        length12++;
                    }
                    this.zzpd = iArr12;
                    break;
                case 56:
                    int zzb7 = zzacj.zzb(zzabxVar, 56);
                    int length13 = this.zzpe == null ? 0 : this.zzpe.length;
                    int[] iArr13 = new int[zzb7 + length13];
                    if (length13 != 0) {
                        System.arraycopy(this.zzpe, 0, iArr13, 0, length13);
                    }
                    while (length13 < iArr13.length - 1) {
                        iArr13[length13] = zzabxVar.zzvh();
                        zzabxVar.zzvf();
                        length13++;
                    }
                    iArr13[length13] = zzabxVar.zzvh();
                    this.zzpe = iArr13;
                    continue;
                case 58:
                    zzaf = zzabxVar.zzaf(zzabxVar.zzvh());
                    int position7 = zzabxVar.getPosition();
                    int i7 = 0;
                    while (zzabxVar.zzvl() > 0) {
                        zzabxVar.zzvh();
                        i7++;
                    }
                    zzabxVar.zzam(position7);
                    int length14 = this.zzpe == null ? 0 : this.zzpe.length;
                    int[] iArr14 = new int[i7 + length14];
                    if (length14 != 0) {
                        System.arraycopy(this.zzpe, 0, iArr14, 0, length14);
                    }
                    while (length14 < iArr14.length) {
                        iArr14[length14] = zzabxVar.zzvh();
                        length14++;
                    }
                    this.zzpe = iArr14;
                    break;
                case 64:
                    int zzb8 = zzacj.zzb(zzabxVar, 64);
                    int length15 = this.zzpf == null ? 0 : this.zzpf.length;
                    int[] iArr15 = new int[zzb8 + length15];
                    if (length15 != 0) {
                        System.arraycopy(this.zzpf, 0, iArr15, 0, length15);
                    }
                    while (length15 < iArr15.length - 1) {
                        iArr15[length15] = zzabxVar.zzvh();
                        zzabxVar.zzvf();
                        length15++;
                    }
                    iArr15[length15] = zzabxVar.zzvh();
                    this.zzpf = iArr15;
                    continue;
                case 66:
                    zzaf = zzabxVar.zzaf(zzabxVar.zzvh());
                    int position8 = zzabxVar.getPosition();
                    int i8 = 0;
                    while (zzabxVar.zzvl() > 0) {
                        zzabxVar.zzvh();
                        i8++;
                    }
                    zzabxVar.zzam(position8);
                    int length16 = this.zzpf == null ? 0 : this.zzpf.length;
                    int[] iArr16 = new int[i8 + length16];
                    if (length16 != 0) {
                        System.arraycopy(this.zzpf, 0, iArr16, 0, length16);
                    }
                    while (length16 < iArr16.length) {
                        iArr16[length16] = zzabxVar.zzvh();
                        length16++;
                    }
                    this.zzpf = iArr16;
                    break;
                case 72:
                    int zzb9 = zzacj.zzb(zzabxVar, 72);
                    int length17 = this.zzpg == null ? 0 : this.zzpg.length;
                    int[] iArr17 = new int[zzb9 + length17];
                    if (length17 != 0) {
                        System.arraycopy(this.zzpg, 0, iArr17, 0, length17);
                    }
                    while (length17 < iArr17.length - 1) {
                        iArr17[length17] = zzabxVar.zzvh();
                        zzabxVar.zzvf();
                        length17++;
                    }
                    iArr17[length17] = zzabxVar.zzvh();
                    this.zzpg = iArr17;
                    continue;
                case 74:
                    zzaf = zzabxVar.zzaf(zzabxVar.zzvh());
                    int position9 = zzabxVar.getPosition();
                    int i9 = 0;
                    while (zzabxVar.zzvl() > 0) {
                        zzabxVar.zzvh();
                        i9++;
                    }
                    zzabxVar.zzam(position9);
                    int length18 = this.zzpg == null ? 0 : this.zzpg.length;
                    int[] iArr18 = new int[i9 + length18];
                    if (length18 != 0) {
                        System.arraycopy(this.zzpg, 0, iArr18, 0, length18);
                    }
                    while (length18 < iArr18.length) {
                        iArr18[length18] = zzabxVar.zzvh();
                        length18++;
                    }
                    this.zzpg = iArr18;
                    break;
                case 80:
                    int zzb10 = zzacj.zzb(zzabxVar, 80);
                    int length19 = this.zzph == null ? 0 : this.zzph.length;
                    int[] iArr19 = new int[zzb10 + length19];
                    if (length19 != 0) {
                        System.arraycopy(this.zzph, 0, iArr19, 0, length19);
                    }
                    while (length19 < iArr19.length - 1) {
                        iArr19[length19] = zzabxVar.zzvh();
                        zzabxVar.zzvf();
                        length19++;
                    }
                    iArr19[length19] = zzabxVar.zzvh();
                    this.zzph = iArr19;
                    continue;
                case 82:
                    zzaf = zzabxVar.zzaf(zzabxVar.zzvh());
                    int position10 = zzabxVar.getPosition();
                    int i10 = 0;
                    while (zzabxVar.zzvl() > 0) {
                        zzabxVar.zzvh();
                        i10++;
                    }
                    zzabxVar.zzam(position10);
                    int length20 = this.zzph == null ? 0 : this.zzph.length;
                    int[] iArr20 = new int[i10 + length20];
                    if (length20 != 0) {
                        System.arraycopy(this.zzph, 0, iArr20, 0, length20);
                    }
                    while (length20 < iArr20.length) {
                        iArr20[length20] = zzabxVar.zzvh();
                        length20++;
                    }
                    this.zzph = iArr20;
                    break;
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

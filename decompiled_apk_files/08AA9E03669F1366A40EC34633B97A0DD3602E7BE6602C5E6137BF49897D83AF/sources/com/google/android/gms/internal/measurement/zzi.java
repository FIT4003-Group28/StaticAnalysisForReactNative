package com.google.android.gms.internal.measurement;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
/* loaded from: classes.dex */
public final class zzi extends zzaca<zzi> {
    private String[] zzoh = zzacj.zzbya;
    public String[] zzoi = zzacj.zzbya;
    public zzm[] zzoj = zzm.zzg();
    public zzh[] zzok = zzh.zzd();
    public zze[] zzol = zze.zzb();
    public zze[] zzom = zze.zzb();
    public zze[] zzon = zze.zzb();
    public zzj[] zzoo = zzj.zze();
    private String zzop = "";
    private String zzoq = "";
    private String zzor = "0";
    public String version = "";
    private zzd zzos = null;
    private float zzot = BitmapDescriptorFactory.HUE_RED;
    private boolean zzou = false;
    private String[] zzov = zzacj.zzbya;
    public int zzow = 0;

    public zzi() {
        this.zzbxg = null;
        this.zzbxr = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzi)) {
            return false;
        }
        zzi zziVar = (zzi) obj;
        if (!zzace.equals(this.zzoh, zziVar.zzoh) || !zzace.equals(this.zzoi, zziVar.zzoi) || !zzace.equals(this.zzoj, zziVar.zzoj) || !zzace.equals(this.zzok, zziVar.zzok) || !zzace.equals(this.zzol, zziVar.zzol) || !zzace.equals(this.zzom, zziVar.zzom) || !zzace.equals(this.zzon, zziVar.zzon) || !zzace.equals(this.zzoo, zziVar.zzoo)) {
            return false;
        }
        if (this.zzop == null) {
            if (zziVar.zzop != null) {
                return false;
            }
        } else if (!this.zzop.equals(zziVar.zzop)) {
            return false;
        }
        if (this.zzoq == null) {
            if (zziVar.zzoq != null) {
                return false;
            }
        } else if (!this.zzoq.equals(zziVar.zzoq)) {
            return false;
        }
        if (this.zzor == null) {
            if (zziVar.zzor != null) {
                return false;
            }
        } else if (!this.zzor.equals(zziVar.zzor)) {
            return false;
        }
        if (this.version == null) {
            if (zziVar.version != null) {
                return false;
            }
        } else if (!this.version.equals(zziVar.version)) {
            return false;
        }
        if (this.zzos == null) {
            if (zziVar.zzos != null) {
                return false;
            }
        } else if (!this.zzos.equals(zziVar.zzos)) {
            return false;
        }
        if (Float.floatToIntBits(this.zzot) != Float.floatToIntBits(zziVar.zzot) || this.zzou != zziVar.zzou || !zzace.equals(this.zzov, zziVar.zzov) || this.zzow != zziVar.zzow) {
            return false;
        }
        return (this.zzbxg == null || this.zzbxg.isEmpty()) ? zziVar.zzbxg == null || zziVar.zzbxg.isEmpty() : this.zzbxg.equals(zziVar.zzbxg);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + zzace.hashCode(this.zzoh)) * 31) + zzace.hashCode(this.zzoi)) * 31) + zzace.hashCode(this.zzoj)) * 31) + zzace.hashCode(this.zzok)) * 31) + zzace.hashCode(this.zzol)) * 31) + zzace.hashCode(this.zzom)) * 31) + zzace.hashCode(this.zzon)) * 31) + zzace.hashCode(this.zzoo)) * 31) + (this.zzop == null ? 0 : this.zzop.hashCode())) * 31) + (this.zzoq == null ? 0 : this.zzoq.hashCode())) * 31) + (this.zzor == null ? 0 : this.zzor.hashCode())) * 31) + (this.version == null ? 0 : this.version.hashCode());
        zzd zzdVar = this.zzos;
        int hashCode2 = ((((((((((hashCode * 31) + (zzdVar == null ? 0 : zzdVar.hashCode())) * 31) + Float.floatToIntBits(this.zzot)) * 31) + (this.zzou ? 1231 : 1237)) * 31) + zzace.hashCode(this.zzov)) * 31) + this.zzow) * 31;
        if (this.zzbxg != null && !this.zzbxg.isEmpty()) {
            i = this.zzbxg.hashCode();
        }
        return hashCode2 + i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final int zza() {
        int zza = super.zza();
        if (this.zzoi != null && this.zzoi.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.zzoi.length; i3++) {
                String str = this.zzoi[i3];
                if (str != null) {
                    i2++;
                    i += zzaby.zzfk(str);
                }
            }
            zza = zza + i + (i2 * 1);
        }
        if (this.zzoj != null && this.zzoj.length > 0) {
            int i4 = zza;
            for (int i5 = 0; i5 < this.zzoj.length; i5++) {
                zzm zzmVar = this.zzoj[i5];
                if (zzmVar != null) {
                    i4 += zzaby.zzb(2, zzmVar);
                }
            }
            zza = i4;
        }
        if (this.zzok != null && this.zzok.length > 0) {
            int i6 = zza;
            for (int i7 = 0; i7 < this.zzok.length; i7++) {
                zzh zzhVar = this.zzok[i7];
                if (zzhVar != null) {
                    i6 += zzaby.zzb(3, zzhVar);
                }
            }
            zza = i6;
        }
        if (this.zzol != null && this.zzol.length > 0) {
            int i8 = zza;
            for (int i9 = 0; i9 < this.zzol.length; i9++) {
                zze zzeVar = this.zzol[i9];
                if (zzeVar != null) {
                    i8 += zzaby.zzb(4, zzeVar);
                }
            }
            zza = i8;
        }
        if (this.zzom != null && this.zzom.length > 0) {
            int i10 = zza;
            for (int i11 = 0; i11 < this.zzom.length; i11++) {
                zze zzeVar2 = this.zzom[i11];
                if (zzeVar2 != null) {
                    i10 += zzaby.zzb(5, zzeVar2);
                }
            }
            zza = i10;
        }
        if (this.zzon != null && this.zzon.length > 0) {
            int i12 = zza;
            for (int i13 = 0; i13 < this.zzon.length; i13++) {
                zze zzeVar3 = this.zzon[i13];
                if (zzeVar3 != null) {
                    i12 += zzaby.zzb(6, zzeVar3);
                }
            }
            zza = i12;
        }
        if (this.zzoo != null && this.zzoo.length > 0) {
            int i14 = zza;
            for (int i15 = 0; i15 < this.zzoo.length; i15++) {
                zzj zzjVar = this.zzoo[i15];
                if (zzjVar != null) {
                    i14 += zzaby.zzb(7, zzjVar);
                }
            }
            zza = i14;
        }
        if (this.zzop != null && !this.zzop.equals("")) {
            zza += zzaby.zzc(9, this.zzop);
        }
        if (this.zzoq != null && !this.zzoq.equals("")) {
            zza += zzaby.zzc(10, this.zzoq);
        }
        if (this.zzor != null && !this.zzor.equals("0")) {
            zza += zzaby.zzc(12, this.zzor);
        }
        if (this.version != null && !this.version.equals("")) {
            zza += zzaby.zzc(13, this.version);
        }
        if (this.zzos != null) {
            zza += zzaby.zzb(14, this.zzos);
        }
        if (Float.floatToIntBits(this.zzot) != Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) {
            zza += zzaby.zzaq(15) + 4;
        }
        if (this.zzov != null && this.zzov.length > 0) {
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 0; i18 < this.zzov.length; i18++) {
                String str2 = this.zzov[i18];
                if (str2 != null) {
                    i17++;
                    i16 += zzaby.zzfk(str2);
                }
            }
            zza = zza + i16 + (i17 * 2);
        }
        if (this.zzow != 0) {
            zza += zzaby.zzf(17, this.zzow);
        }
        if (this.zzou) {
            zza += zzaby.zzaq(18) + 1;
        }
        if (this.zzoh == null || this.zzoh.length <= 0) {
            return zza;
        }
        int i19 = 0;
        int i20 = 0;
        for (int i21 = 0; i21 < this.zzoh.length; i21++) {
            String str3 = this.zzoh[i21];
            if (str3 != null) {
                i20++;
                i19 += zzaby.zzfk(str3);
            }
        }
        return zza + i19 + (i20 * 2);
    }

    @Override // com.google.android.gms.internal.measurement.zzaca, com.google.android.gms.internal.measurement.zzacg
    public final void zza(zzaby zzabyVar) {
        if (this.zzoi != null && this.zzoi.length > 0) {
            for (int i = 0; i < this.zzoi.length; i++) {
                String str = this.zzoi[i];
                if (str != null) {
                    zzabyVar.zzb(1, str);
                }
            }
        }
        if (this.zzoj != null && this.zzoj.length > 0) {
            for (int i2 = 0; i2 < this.zzoj.length; i2++) {
                zzm zzmVar = this.zzoj[i2];
                if (zzmVar != null) {
                    zzabyVar.zza(2, zzmVar);
                }
            }
        }
        if (this.zzok != null && this.zzok.length > 0) {
            for (int i3 = 0; i3 < this.zzok.length; i3++) {
                zzh zzhVar = this.zzok[i3];
                if (zzhVar != null) {
                    zzabyVar.zza(3, zzhVar);
                }
            }
        }
        if (this.zzol != null && this.zzol.length > 0) {
            for (int i4 = 0; i4 < this.zzol.length; i4++) {
                zze zzeVar = this.zzol[i4];
                if (zzeVar != null) {
                    zzabyVar.zza(4, zzeVar);
                }
            }
        }
        if (this.zzom != null && this.zzom.length > 0) {
            for (int i5 = 0; i5 < this.zzom.length; i5++) {
                zze zzeVar2 = this.zzom[i5];
                if (zzeVar2 != null) {
                    zzabyVar.zza(5, zzeVar2);
                }
            }
        }
        if (this.zzon != null && this.zzon.length > 0) {
            for (int i6 = 0; i6 < this.zzon.length; i6++) {
                zze zzeVar3 = this.zzon[i6];
                if (zzeVar3 != null) {
                    zzabyVar.zza(6, zzeVar3);
                }
            }
        }
        if (this.zzoo != null && this.zzoo.length > 0) {
            for (int i7 = 0; i7 < this.zzoo.length; i7++) {
                zzj zzjVar = this.zzoo[i7];
                if (zzjVar != null) {
                    zzabyVar.zza(7, zzjVar);
                }
            }
        }
        if (this.zzop != null && !this.zzop.equals("")) {
            zzabyVar.zzb(9, this.zzop);
        }
        if (this.zzoq != null && !this.zzoq.equals("")) {
            zzabyVar.zzb(10, this.zzoq);
        }
        if (this.zzor != null && !this.zzor.equals("0")) {
            zzabyVar.zzb(12, this.zzor);
        }
        if (this.version != null && !this.version.equals("")) {
            zzabyVar.zzb(13, this.version);
        }
        if (this.zzos != null) {
            zzabyVar.zza(14, this.zzos);
        }
        if (Float.floatToIntBits(this.zzot) != Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) {
            zzabyVar.zza(15, this.zzot);
        }
        if (this.zzov != null && this.zzov.length > 0) {
            for (int i8 = 0; i8 < this.zzov.length; i8++) {
                String str2 = this.zzov[i8];
                if (str2 != null) {
                    zzabyVar.zzb(16, str2);
                }
            }
        }
        if (this.zzow != 0) {
            zzabyVar.zze(17, this.zzow);
        }
        if (this.zzou) {
            zzabyVar.zza(18, this.zzou);
        }
        if (this.zzoh != null && this.zzoh.length > 0) {
            for (int i9 = 0; i9 < this.zzoh.length; i9++) {
                String str3 = this.zzoh[i9];
                if (str3 != null) {
                    zzabyVar.zzb(19, str3);
                }
            }
        }
        super.zza(zzabyVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzacg
    public final /* synthetic */ zzacg zzb(zzabx zzabxVar) {
        while (true) {
            int zzvf = zzabxVar.zzvf();
            switch (zzvf) {
                case 0:
                    return this;
                case 10:
                    int zzb = zzacj.zzb(zzabxVar, 10);
                    int length = this.zzoi == null ? 0 : this.zzoi.length;
                    String[] strArr = new String[zzb + length];
                    if (length != 0) {
                        System.arraycopy(this.zzoi, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = zzabxVar.readString();
                        zzabxVar.zzvf();
                        length++;
                    }
                    strArr[length] = zzabxVar.readString();
                    this.zzoi = strArr;
                    break;
                case 18:
                    int zzb2 = zzacj.zzb(zzabxVar, 18);
                    int length2 = this.zzoj == null ? 0 : this.zzoj.length;
                    zzm[] zzmVarArr = new zzm[zzb2 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.zzoj, 0, zzmVarArr, 0, length2);
                    }
                    while (length2 < zzmVarArr.length - 1) {
                        zzmVarArr[length2] = new zzm();
                        zzabxVar.zza(zzmVarArr[length2]);
                        zzabxVar.zzvf();
                        length2++;
                    }
                    zzmVarArr[length2] = new zzm();
                    zzabxVar.zza(zzmVarArr[length2]);
                    this.zzoj = zzmVarArr;
                    break;
                case 26:
                    int zzb3 = zzacj.zzb(zzabxVar, 26);
                    int length3 = this.zzok == null ? 0 : this.zzok.length;
                    zzh[] zzhVarArr = new zzh[zzb3 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.zzok, 0, zzhVarArr, 0, length3);
                    }
                    while (length3 < zzhVarArr.length - 1) {
                        zzhVarArr[length3] = new zzh();
                        zzabxVar.zza(zzhVarArr[length3]);
                        zzabxVar.zzvf();
                        length3++;
                    }
                    zzhVarArr[length3] = new zzh();
                    zzabxVar.zza(zzhVarArr[length3]);
                    this.zzok = zzhVarArr;
                    break;
                case 34:
                    int zzb4 = zzacj.zzb(zzabxVar, 34);
                    int length4 = this.zzol == null ? 0 : this.zzol.length;
                    zze[] zzeVarArr = new zze[zzb4 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.zzol, 0, zzeVarArr, 0, length4);
                    }
                    while (length4 < zzeVarArr.length - 1) {
                        zzeVarArr[length4] = new zze();
                        zzabxVar.zza(zzeVarArr[length4]);
                        zzabxVar.zzvf();
                        length4++;
                    }
                    zzeVarArr[length4] = new zze();
                    zzabxVar.zza(zzeVarArr[length4]);
                    this.zzol = zzeVarArr;
                    break;
                case 42:
                    int zzb5 = zzacj.zzb(zzabxVar, 42);
                    int length5 = this.zzom == null ? 0 : this.zzom.length;
                    zze[] zzeVarArr2 = new zze[zzb5 + length5];
                    if (length5 != 0) {
                        System.arraycopy(this.zzom, 0, zzeVarArr2, 0, length5);
                    }
                    while (length5 < zzeVarArr2.length - 1) {
                        zzeVarArr2[length5] = new zze();
                        zzabxVar.zza(zzeVarArr2[length5]);
                        zzabxVar.zzvf();
                        length5++;
                    }
                    zzeVarArr2[length5] = new zze();
                    zzabxVar.zza(zzeVarArr2[length5]);
                    this.zzom = zzeVarArr2;
                    break;
                case 50:
                    int zzb6 = zzacj.zzb(zzabxVar, 50);
                    int length6 = this.zzon == null ? 0 : this.zzon.length;
                    zze[] zzeVarArr3 = new zze[zzb6 + length6];
                    if (length6 != 0) {
                        System.arraycopy(this.zzon, 0, zzeVarArr3, 0, length6);
                    }
                    while (length6 < zzeVarArr3.length - 1) {
                        zzeVarArr3[length6] = new zze();
                        zzabxVar.zza(zzeVarArr3[length6]);
                        zzabxVar.zzvf();
                        length6++;
                    }
                    zzeVarArr3[length6] = new zze();
                    zzabxVar.zza(zzeVarArr3[length6]);
                    this.zzon = zzeVarArr3;
                    break;
                case 58:
                    int zzb7 = zzacj.zzb(zzabxVar, 58);
                    int length7 = this.zzoo == null ? 0 : this.zzoo.length;
                    zzj[] zzjVarArr = new zzj[zzb7 + length7];
                    if (length7 != 0) {
                        System.arraycopy(this.zzoo, 0, zzjVarArr, 0, length7);
                    }
                    while (length7 < zzjVarArr.length - 1) {
                        zzjVarArr[length7] = new zzj();
                        zzabxVar.zza(zzjVarArr[length7]);
                        zzabxVar.zzvf();
                        length7++;
                    }
                    zzjVarArr[length7] = new zzj();
                    zzabxVar.zza(zzjVarArr[length7]);
                    this.zzoo = zzjVarArr;
                    break;
                case 74:
                    this.zzop = zzabxVar.readString();
                    break;
                case 82:
                    this.zzoq = zzabxVar.readString();
                    break;
                case 98:
                    this.zzor = zzabxVar.readString();
                    break;
                case 106:
                    this.version = zzabxVar.readString();
                    break;
                case 114:
                    if (this.zzos == null) {
                        this.zzos = new zzd();
                    }
                    zzabxVar.zza(this.zzos);
                    break;
                case EACTags.SECURE_MESSAGING_TEMPLATE /* 125 */:
                    this.zzot = Float.intBitsToFloat(zzabxVar.zzvj());
                    break;
                case 130:
                    int zzb8 = zzacj.zzb(zzabxVar, 130);
                    int length8 = this.zzov == null ? 0 : this.zzov.length;
                    String[] strArr2 = new String[zzb8 + length8];
                    if (length8 != 0) {
                        System.arraycopy(this.zzov, 0, strArr2, 0, length8);
                    }
                    while (length8 < strArr2.length - 1) {
                        strArr2[length8] = zzabxVar.readString();
                        zzabxVar.zzvf();
                        length8++;
                    }
                    strArr2[length8] = zzabxVar.readString();
                    this.zzov = strArr2;
                    break;
                case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                    this.zzow = zzabxVar.zzvh();
                    break;
                case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA /* 144 */:
                    this.zzou = zzabxVar.zzvg();
                    break;
                case CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA /* 154 */:
                    int zzb9 = zzacj.zzb(zzabxVar, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA);
                    int length9 = this.zzoh == null ? 0 : this.zzoh.length;
                    String[] strArr3 = new String[zzb9 + length9];
                    if (length9 != 0) {
                        System.arraycopy(this.zzoh, 0, strArr3, 0, length9);
                    }
                    while (length9 < strArr3.length - 1) {
                        strArr3[length9] = zzabxVar.readString();
                        zzabxVar.zzvf();
                        length9++;
                    }
                    strArr3[length9] = zzabxVar.readString();
                    this.zzoh = strArr3;
                    break;
                default:
                    if (super.zza(zzabxVar, zzvf)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }
}

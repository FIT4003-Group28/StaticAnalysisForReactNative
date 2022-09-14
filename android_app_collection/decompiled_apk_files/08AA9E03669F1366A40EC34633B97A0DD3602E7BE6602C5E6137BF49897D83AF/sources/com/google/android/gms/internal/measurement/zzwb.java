package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.tagmanager.zzdi;
import com.google.android.gms.tagmanager.zzgj;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class zzwb {
    private static zzm zza(int i, zzi zziVar, zzm[] zzmVarArr, Set<Integer> set) {
        if (set.contains(Integer.valueOf(i))) {
            String valueOf = String.valueOf(set);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 90);
            sb.append("Value cycle detected.  Current value reference: ");
            sb.append(i);
            sb.append(".  Previous value references: ");
            sb.append(valueOf);
            sb.append(".");
            zzef(sb.toString());
        }
        zzm zzmVar = (zzm) zza(zziVar.zzoj, i, "values");
        if (zzmVarArr[i] != null) {
            return zzmVarArr[i];
        }
        zzm zzmVar2 = null;
        set.add(Integer.valueOf(i));
        int i2 = 0;
        switch (zzmVar.type) {
            case 1:
            case 5:
            case 6:
            case 8:
                zzmVar2 = zzmVar;
                break;
            case 2:
                zzc.zza zzl = zzl(zzmVar);
                zzm zzk = zzk(zzmVar);
                zzk.zzpy = new zzm[zzl.zzpk.length];
                int[] iArr = zzl.zzpk;
                int length = iArr.length;
                int i3 = 0;
                while (i2 < length) {
                    zzk.zzpy[i3] = zza(iArr[i2], zziVar, zzmVarArr, set);
                    i2++;
                    i3++;
                }
                zzmVar2 = zzk;
                break;
            case 3:
                zzmVar2 = zzk(zzmVar);
                zzc.zza zzl2 = zzl(zzmVar);
                if (zzl2.zzpl.length != zzl2.zzpm.length) {
                    int length2 = zzl2.zzpl.length;
                    int length3 = zzl2.zzpm.length;
                    StringBuilder sb2 = new StringBuilder(58);
                    sb2.append("Uneven map keys (");
                    sb2.append(length2);
                    sb2.append(") and map values (");
                    sb2.append(length3);
                    sb2.append(")");
                    zzef(sb2.toString());
                }
                zzmVar2.zzpz = new zzm[zzl2.zzpl.length];
                zzmVar2.zzqa = new zzm[zzl2.zzpl.length];
                int[] iArr2 = zzl2.zzpl;
                int length4 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length4) {
                    zzmVar2.zzpz[i5] = zza(iArr2[i4], zziVar, zzmVarArr, set);
                    i4++;
                    i5++;
                }
                int[] iArr3 = zzl2.zzpm;
                int length5 = iArr3.length;
                int i6 = 0;
                while (i2 < length5) {
                    zzmVar2.zzqa[i6] = zza(iArr3[i2], zziVar, zzmVarArr, set);
                    i2++;
                    i6++;
                }
                break;
            case 4:
                zzmVar2 = zzk(zzmVar);
                zzmVar2.zzqb = zzgj.zzc(zza(zzl(zzmVar).zzpp, zziVar, zzmVarArr, set));
                break;
            case 7:
                zzmVar2 = zzk(zzmVar);
                zzc.zza zzl3 = zzl(zzmVar);
                zzmVar2.zzqf = new zzm[zzl3.zzpo.length];
                int[] iArr4 = zzl3.zzpo;
                int length6 = iArr4.length;
                int i7 = 0;
                while (i2 < length6) {
                    zzmVar2.zzqf[i7] = zza(iArr4[i2], zziVar, zzmVarArr, set);
                    i2++;
                    i7++;
                }
                break;
        }
        if (zzmVar2 == null) {
            String valueOf2 = String.valueOf(zzmVar);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 15);
            sb3.append("Invalid value: ");
            sb3.append(valueOf2);
            zzef(sb3.toString());
        }
        zzmVarArr[i] = zzmVar2;
        set.remove(Integer.valueOf(i));
        return zzmVar2;
    }

    private static zzwd zza(zze zzeVar, zzi zziVar, zzm[] zzmVarArr, int i) {
        zzwe zzrs = zzwd.zzrs();
        for (int i2 : zzeVar.zznt) {
            zzh zzhVar = (zzh) zza(zziVar.zzok, Integer.valueOf(i2).intValue(), "properties");
            String str = (String) zza(zziVar.zzoi, zzhVar.key, "keys");
            zzm zzmVar = (zzm) zza(zzmVarArr, zzhVar.value, "values");
            if (zzb.PUSH_AFTER_EVALUATE.toString().equals(str)) {
                zzrs.zzm(zzmVar);
            } else {
                zzrs.zzb(str, zzmVar);
            }
        }
        return zzrs.zzrt();
    }

    public static zzwf zza(zzi zziVar) {
        zzj[] zzjVarArr;
        zzm[] zzmVarArr = new zzm[zziVar.zzoj.length];
        for (int i = 0; i < zziVar.zzoj.length; i++) {
            zza(i, zziVar, zzmVarArr, new HashSet(0));
        }
        zzwg zzru = zzwf.zzru();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < zziVar.zzom.length; i2++) {
            arrayList.add(zza(zziVar.zzom[i2], zziVar, zzmVarArr, i2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < zziVar.zzon.length; i3++) {
            arrayList2.add(zza(zziVar.zzon[i3], zziVar, zzmVarArr, i3));
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 0; i4 < zziVar.zzol.length; i4++) {
            zzwd zza = zza(zziVar.zzol[i4], zziVar, zzmVarArr, i4);
            zzru.zzc(zza);
            arrayList3.add(zza);
        }
        for (zzj zzjVar : zziVar.zzoo) {
            zzwi zzwiVar = new zzwi();
            for (int i5 : zzjVar.zzoy) {
                zzwiVar.zzd((zzwd) arrayList2.get(Integer.valueOf(i5).intValue()));
            }
            for (int i6 : zzjVar.zzoz) {
                zzwiVar.zze((zzwd) arrayList2.get(Integer.valueOf(i6).intValue()));
            }
            for (int i7 : zzjVar.zzpa) {
                zzwiVar.zzf((zzwd) arrayList.get(Integer.valueOf(i7).intValue()));
            }
            for (int i8 : zzjVar.zzpc) {
                zzwiVar.zzet(zziVar.zzoj[Integer.valueOf(i8).intValue()].string);
            }
            for (int i9 : zzjVar.zzpb) {
                zzwiVar.zzg((zzwd) arrayList.get(Integer.valueOf(i9).intValue()));
            }
            for (int i10 : zzjVar.zzpd) {
                zzwiVar.zzeu(zziVar.zzoj[Integer.valueOf(i10).intValue()].string);
            }
            for (int i11 : zzjVar.zzpe) {
                zzwiVar.zzh((zzwd) arrayList3.get(Integer.valueOf(i11).intValue()));
            }
            for (int i12 : zzjVar.zzpg) {
                zzwiVar.zzev(zziVar.zzoj[Integer.valueOf(i12).intValue()].string);
            }
            for (int i13 : zzjVar.zzpf) {
                zzwiVar.zzi((zzwd) arrayList3.get(Integer.valueOf(i13).intValue()));
            }
            for (int i14 : zzjVar.zzph) {
                zzwiVar.zzew(zziVar.zzoj[Integer.valueOf(i14).intValue()].string);
            }
            zzru.zzb(zzwiVar.zzrz());
        }
        zzru.zzes(zziVar.version);
        zzru.zzad(zziVar.zzow);
        return zzru.zzrw();
    }

    private static <T> T zza(T[] tArr, int i, String str) {
        if (i < 0 || i >= tArr.length) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45);
            sb.append("Index out of bounds detected: ");
            sb.append(i);
            sb.append(" in ");
            sb.append(str);
            zzef(sb.toString());
        }
        return tArr[i];
    }

    public static void zza(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    private static void zzef(String str) {
        zzdi.e(str);
        throw new zzwj(str);
    }

    public static zzm zzk(zzm zzmVar) {
        zzm zzmVar2 = new zzm();
        zzmVar2.type = zzmVar.type;
        zzmVar2.zzqg = (int[]) zzmVar.zzqg.clone();
        if (zzmVar.zzqh) {
            zzmVar2.zzqh = zzmVar.zzqh;
        }
        return zzmVar2;
    }

    private static zzc.zza zzl(zzm zzmVar) {
        if (((zzc.zza) zzmVar.zza(zzc.zza.zzpi)) == null) {
            String valueOf = String.valueOf(zzmVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
            sb.append("Expected a ServingValue and didn't get one. Value is: ");
            sb.append(valueOf);
            zzef(sb.toString());
        }
        return (zzc.zza) zzmVar.zza(zzc.zza.zzpi);
    }
}

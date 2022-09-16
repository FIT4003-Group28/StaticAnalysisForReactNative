package com.google.android.gms.tagmanager;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcx extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.JOINER.toString();
    private static final String zzayh = com.google.android.gms.internal.measurement.zzb.ARG0.toString();
    private static final String zzaza = com.google.android.gms.internal.measurement.zzb.ITEM_SEPARATOR.toString();
    private static final String zzazb = com.google.android.gms.internal.measurement.zzb.KEY_VALUE_SEPARATOR.toString();
    private static final String zzazc = com.google.android.gms.internal.measurement.zzb.ESCAPE.toString();

    public zzcx() {
        super(ID, zzayh);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Set<Ljava/lang/Character;>;)Ljava/lang/String; */
    private static String zza(String str, int i, Set set) {
        switch (zzcy.zzazd[i - 1]) {
            case 1:
                try {
                    return zzgn.zzds(str);
                } catch (UnsupportedEncodingException e) {
                    zzdi.zza("Joiner: unsupported encoding", e);
                    return str;
                }
            case 2:
                String replace = str.replace("\\", "\\\\");
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    String ch = ((Character) it.next()).toString();
                    String valueOf = String.valueOf(ch);
                    replace = replace.replace(ch, valueOf.length() != 0 ? "\\".concat(valueOf) : new String("\\"));
                }
                return replace;
            default:
                return str;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Set<Ljava/lang/Character;>;)V */
    private static void zza(StringBuilder sb, String str, int i, Set set) {
        sb.append(zza(str, i, set));
    }

    private static void zza(Set<Character> set, String str) {
        for (int i = 0; i < str.length(); i++) {
            set.add(Character.valueOf(str.charAt(i)));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        com.google.android.gms.internal.measurement.zzm zzmVar = map.get(zzayh);
        if (zzmVar == null) {
            return zzgj.zzpj();
        }
        com.google.android.gms.internal.measurement.zzm zzmVar2 = map.get(zzaza);
        String zzc = zzmVar2 != null ? zzgj.zzc(zzmVar2) : "";
        com.google.android.gms.internal.measurement.zzm zzmVar3 = map.get(zzazb);
        String zzc2 = zzmVar3 != null ? zzgj.zzc(zzmVar3) : "=";
        int i = zzcz.zzaze;
        com.google.android.gms.internal.measurement.zzm zzmVar4 = map.get(zzazc);
        HashSet hashSet = null;
        if (zzmVar4 != null) {
            String zzc3 = zzgj.zzc(zzmVar4);
            if (ImagesContract.URL.equals(zzc3)) {
                i = zzcz.zzazf;
            } else if (!"backslash".equals(zzc3)) {
                String valueOf = String.valueOf(zzc3);
                zzdi.e(valueOf.length() != 0 ? "Joiner: unsupported escape type: ".concat(valueOf) : new String("Joiner: unsupported escape type: "));
                return zzgj.zzpj();
            } else {
                i = zzcz.zzazg;
                hashSet = new HashSet();
                zza(hashSet, zzc);
                zza(hashSet, zzc2);
                hashSet.remove('\\');
            }
        }
        StringBuilder sb = new StringBuilder();
        switch (zzmVar.type) {
            case 2:
                com.google.android.gms.internal.measurement.zzm[] zzmVarArr = zzmVar.zzpy;
                int length = zzmVarArr.length;
                int i2 = 0;
                boolean z = true;
                while (i2 < length) {
                    com.google.android.gms.internal.measurement.zzm zzmVar5 = zzmVarArr[i2];
                    if (!z) {
                        sb.append(zzc);
                    }
                    zza(sb, zzgj.zzc(zzmVar5), i, hashSet);
                    i2++;
                    z = false;
                }
                break;
            case 3:
                for (int i3 = 0; i3 < zzmVar.zzpz.length; i3++) {
                    if (i3 > 0) {
                        sb.append(zzc);
                    }
                    String zzc4 = zzgj.zzc(zzmVar.zzpz[i3]);
                    String zzc5 = zzgj.zzc(zzmVar.zzqa[i3]);
                    zza(sb, zzc4, i, hashSet);
                    sb.append(zzc2);
                    zza(sb, zzc5, i, hashSet);
                }
                break;
            default:
                zza(sb, zzgj.zzc(zzmVar), i, hashSet);
                break;
        }
        return zzgj.zzj(sb.toString());
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return true;
    }
}

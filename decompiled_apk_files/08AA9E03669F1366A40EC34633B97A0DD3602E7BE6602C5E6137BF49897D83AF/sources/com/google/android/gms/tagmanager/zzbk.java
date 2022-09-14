package com.google.android.gms.tagmanager;

import android.util.Base64;
import java.util.Map;
import org.spongycastle.i18n.TextBundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbk extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.ENCODE.toString();
    private static final String zzayh = com.google.android.gms.internal.measurement.zzb.ARG0.toString();
    private static final String zzayi = com.google.android.gms.internal.measurement.zzb.NO_PADDING.toString();
    private static final String zzayj = com.google.android.gms.internal.measurement.zzb.INPUT_FORMAT.toString();
    private static final String zzayk = com.google.android.gms.internal.measurement.zzb.OUTPUT_FORMAT.toString();

    public zzbk() {
        super(ID, zzayh);
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        String str;
        byte[] decode;
        String encodeToString;
        com.google.android.gms.internal.measurement.zzm zzmVar = map.get(zzayh);
        if (zzmVar == null || zzmVar == zzgj.zzpj()) {
            return zzgj.zzpj();
        }
        String zzc = zzgj.zzc(zzmVar);
        com.google.android.gms.internal.measurement.zzm zzmVar2 = map.get(zzayj);
        String zzc2 = zzmVar2 == null ? TextBundle.TEXT_ENTRY : zzgj.zzc(zzmVar2);
        com.google.android.gms.internal.measurement.zzm zzmVar3 = map.get(zzayk);
        String zzc3 = zzmVar3 == null ? "base16" : zzgj.zzc(zzmVar3);
        int i = 2;
        com.google.android.gms.internal.measurement.zzm zzmVar4 = map.get(zzayi);
        if (zzmVar4 != null && zzgj.zzg(zzmVar4).booleanValue()) {
            i = 3;
        }
        try {
            if (TextBundle.TEXT_ENTRY.equals(zzc2)) {
                decode = zzc.getBytes();
            } else if ("base16".equals(zzc2)) {
                decode = zzo.decode(zzc);
            } else if ("base64".equals(zzc2)) {
                decode = Base64.decode(zzc, i);
            } else if (!"base64url".equals(zzc2)) {
                String valueOf = String.valueOf(zzc2);
                zzdi.e(valueOf.length() != 0 ? "Encode: unknown input format: ".concat(valueOf) : new String("Encode: unknown input format: "));
                return zzgj.zzpj();
            } else {
                decode = Base64.decode(zzc, i | 8);
            }
        } catch (IllegalArgumentException unused) {
            str = "Encode: invalid input:";
        }
        if ("base16".equals(zzc3)) {
            encodeToString = zzo.encode(decode);
        } else if ("base64".equals(zzc3)) {
            encodeToString = Base64.encodeToString(decode, i);
        } else if (!"base64url".equals(zzc3)) {
            String valueOf2 = String.valueOf(zzc3);
            str = valueOf2.length() != 0 ? "Encode: unknown output format: ".concat(valueOf2) : new String("Encode: unknown output format: ");
            zzdi.e(str);
            return zzgj.zzpj();
        } else {
            encodeToString = Base64.encodeToString(decode, i | 8);
        }
        return zzgj.zzj(encodeToString);
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return true;
    }
}

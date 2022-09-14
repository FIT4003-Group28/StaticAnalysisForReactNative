package com.google.android.gms.tagmanager;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import org.spongycastle.i18n.TextBundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbv extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.HASH.toString();
    private static final String zzayh = com.google.android.gms.internal.measurement.zzb.ARG0.toString();
    private static final String zzaym = com.google.android.gms.internal.measurement.zzb.ALGORITHM.toString();
    private static final String zzayj = com.google.android.gms.internal.measurement.zzb.INPUT_FORMAT.toString();

    public zzbv() {
        super(ID, zzayh);
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        String concat;
        byte[] decode;
        com.google.android.gms.internal.measurement.zzm zzmVar = map.get(zzayh);
        if (zzmVar == null || zzmVar == zzgj.zzpj()) {
            return zzgj.zzpj();
        }
        String zzc = zzgj.zzc(zzmVar);
        com.google.android.gms.internal.measurement.zzm zzmVar2 = map.get(zzaym);
        String zzc2 = zzmVar2 == null ? "MD5" : zzgj.zzc(zzmVar2);
        com.google.android.gms.internal.measurement.zzm zzmVar3 = map.get(zzayj);
        String zzc3 = zzmVar3 == null ? TextBundle.TEXT_ENTRY : zzgj.zzc(zzmVar3);
        if (TextBundle.TEXT_ENTRY.equals(zzc3)) {
            decode = zzc.getBytes();
        } else if (!"base16".equals(zzc3)) {
            String valueOf = String.valueOf(zzc3);
            concat = valueOf.length() != 0 ? "Hash: unknown input format: ".concat(valueOf) : new String("Hash: unknown input format: ");
            zzdi.e(concat);
            return zzgj.zzpj();
        } else {
            decode = zzo.decode(zzc);
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(zzc2);
            messageDigest.update(decode);
            return zzgj.zzj(zzo.encode(messageDigest.digest()));
        } catch (NoSuchAlgorithmException unused) {
            String valueOf2 = String.valueOf(zzc2);
            concat = valueOf2.length() != 0 ? "Hash: unknown algorithm: ".concat(valueOf2) : new String("Hash: unknown algorithm: ");
        }
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return true;
    }
}

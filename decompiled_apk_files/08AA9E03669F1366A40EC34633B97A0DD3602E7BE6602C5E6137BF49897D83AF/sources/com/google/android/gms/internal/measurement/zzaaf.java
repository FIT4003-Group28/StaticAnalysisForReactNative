package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzzs;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaaf implements zzaay {
    private static final zzaam zzbto = new zzaag();
    private final zzaam zzbtn;

    public zzaaf() {
        this(new zzaah(zzzr.zztu(), zzub()));
    }

    private zzaaf(zzaam zzaamVar) {
        this.zzbtn = (zzaam) zzzt.zza(zzaamVar, "messageInfoFactory");
    }

    private static boolean zza(zzaal zzaalVar) {
        return zzaalVar.zzuf() == zzzs.zzb.zzbsu;
    }

    private static zzaam zzub() {
        try {
            return (zzaam) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return zzbto;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaay
    public final <T> zzaax<T> zzg(Class<T> cls) {
        zzaaz.zzh(cls);
        zzaal zze = this.zzbtn.zze(cls);
        return zze.zzug() ? zzzs.class.isAssignableFrom(cls) ? zzaar.zza(zzaaz.zzup(), zzzn.zztp(), zze.zzuh()) : zzaar.zza(zzaaz.zzun(), zzzn.zztq(), zze.zzuh()) : zzzs.class.isAssignableFrom(cls) ? zza(zze) ? zzaaq.zza(cls, zze, zzaau.zzuk(), zzaab.zzua(), zzaaz.zzup(), zzzn.zztp(), zzaak.zzud()) : zzaaq.zza(cls, zze, zzaau.zzuk(), zzaab.zzua(), zzaaz.zzup(), null, zzaak.zzud()) : zza(zze) ? zzaaq.zza(cls, zze, zzaau.zzuj(), zzaab.zztz(), zzaaz.zzun(), zzzn.zztq(), zzaak.zzuc()) : zzaaq.zza(cls, zze, zzaau.zzuj(), zzaab.zztz(), zzaaz.zzuo(), null, zzaak.zzuc());
    }
}

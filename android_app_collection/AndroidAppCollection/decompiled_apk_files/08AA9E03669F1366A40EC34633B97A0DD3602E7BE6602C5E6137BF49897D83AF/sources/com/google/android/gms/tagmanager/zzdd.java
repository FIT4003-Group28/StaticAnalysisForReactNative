package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzdd extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.LANGUAGE.toString();

    public zzdd() {
        super(ID, new String[0]);
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        String language;
        Locale locale = Locale.getDefault();
        if (locale != null && (language = locale.getLanguage()) != null) {
            return zzgj.zzj(language.toLowerCase());
        }
        return zzgj.zzpj();
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return false;
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final /* bridge */ /* synthetic */ String zznn() {
        return super.zznn();
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final /* bridge */ /* synthetic */ Set zzno() {
        return super.zzno();
    }
}

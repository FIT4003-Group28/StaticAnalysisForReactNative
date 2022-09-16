package com.google.android.gms.tagmanager;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzeu implements zzev {
    private final /* synthetic */ zzes zzbba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeu(zzes zzesVar) {
        this.zzbba = zzesVar;
    }

    @Override // com.google.android.gms.tagmanager.zzev
    public final zzer zza(zzal zzalVar) {
        Context context;
        String str;
        context = this.zzbba.zzqx;
        str = this.zzbba.zzavt;
        return new zzer(context, str, zzalVar);
    }
}

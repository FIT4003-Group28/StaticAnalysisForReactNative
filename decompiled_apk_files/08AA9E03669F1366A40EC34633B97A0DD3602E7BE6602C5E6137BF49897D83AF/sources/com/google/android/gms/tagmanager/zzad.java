package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzvz;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzad implements zzdh<zzvz> {
    private final /* synthetic */ zzy zzaww;

    private zzad(zzy zzyVar) {
        this.zzaww = zzyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzad(zzy zzyVar, zzz zzzVar) {
        this(zzyVar);
    }

    @Override // com.google.android.gms.tagmanager.zzdh
    public final /* synthetic */ void onSuccess(zzvz zzvzVar) {
        com.google.android.gms.internal.measurement.zzl zzlVar;
        zzvz zzvzVar2 = zzvzVar;
        if (zzvzVar2.zzbmj != null) {
            zzlVar = zzvzVar2.zzbmj;
        } else {
            com.google.android.gms.internal.measurement.zzi zziVar = zzvzVar2.zzpv;
            com.google.android.gms.internal.measurement.zzl zzlVar2 = new com.google.android.gms.internal.measurement.zzl();
            zzlVar2.zzpv = zziVar;
            zzlVar2.zzpu = null;
            zzlVar2.zzpw = zziVar.version;
            zzlVar = zzlVar2;
        }
        this.zzaww.zza(zzlVar, zzvzVar2.zzbmi, true);
    }

    @Override // com.google.android.gms.tagmanager.zzdh
    public final void zzmr() {
    }

    @Override // com.google.android.gms.tagmanager.zzdh
    public final void zzq(int i) {
        boolean z;
        z = this.zzaww.zzawr;
        if (!z) {
            this.zzaww.zzah(0L);
        }
    }
}

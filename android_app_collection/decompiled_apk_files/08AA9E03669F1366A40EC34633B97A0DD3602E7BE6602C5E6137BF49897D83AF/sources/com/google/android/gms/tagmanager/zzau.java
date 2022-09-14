package com.google.android.gms.tagmanager;

import java.util.List;
/* loaded from: classes.dex */
final class zzau implements Runnable {
    private final /* synthetic */ List zzaxr;
    private final /* synthetic */ long zzaxs;
    private final /* synthetic */ zzat zzaxt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzau(zzat zzatVar, List list, long j) {
        this.zzaxt = zzatVar;
        this.zzaxr = list;
        this.zzaxs = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzaxt.zzb(this.zzaxr, this.zzaxs);
    }
}

package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.DataLayer;
import java.util.List;
import java.util.concurrent.CountDownLatch;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzap implements zzaq {
    private final /* synthetic */ DataLayer zzaxl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzap(DataLayer dataLayer) {
        this.zzaxl = dataLayer;
    }

    @Override // com.google.android.gms.tagmanager.zzaq
    public final void zzd(List<DataLayer.zza> list) {
        CountDownLatch countDownLatch;
        for (DataLayer.zza zzaVar : list) {
            this.zzaxl.zzg(DataLayer.zzk(zzaVar.mKey, zzaVar.mValue));
        }
        countDownLatch = this.zzaxl.zzaxk;
        countDownLatch.countDown();
    }
}

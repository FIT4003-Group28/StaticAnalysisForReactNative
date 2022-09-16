package com.google.android.gms.tagmanager;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
final class zzet implements zzew {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzet(zzes zzesVar) {
    }

    @Override // com.google.android.gms.tagmanager.zzew
    public final ScheduledExecutorService zzoj() {
        return Executors.newSingleThreadScheduledExecutor();
    }
}

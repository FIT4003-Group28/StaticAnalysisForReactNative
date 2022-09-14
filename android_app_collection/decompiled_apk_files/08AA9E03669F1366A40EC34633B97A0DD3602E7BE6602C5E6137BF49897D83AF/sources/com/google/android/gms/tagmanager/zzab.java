package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzab implements zzac {
    private final /* synthetic */ zzy zzaww;
    private Long zzawx;
    private final /* synthetic */ boolean zzawy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzab(zzy zzyVar, boolean z) {
        this.zzaww = zzyVar;
        this.zzawy = z;
    }

    @Override // com.google.android.gms.tagmanager.zzac
    public final boolean zzb(Container container) {
        Clock clock;
        zzai zzaiVar;
        if (!this.zzawy) {
            return !container.isDefault();
        }
        long lastRefreshTime = container.getLastRefreshTime();
        if (this.zzawx == null) {
            zzaiVar = this.zzaww.zzawn;
            this.zzawx = Long.valueOf(zzaiVar.zzmt());
        }
        clock = this.zzaww.zzro;
        return lastRefreshTime + this.zzawx.longValue() >= clock.currentTimeMillis();
    }
}

package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
/* loaded from: classes.dex */
final class zzc implements Runnable {
    private final /* synthetic */ BroadcastReceiver.PendingResult zzqu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(CampaignTrackingReceiver campaignTrackingReceiver, BroadcastReceiver.PendingResult pendingResult) {
        this.zzqu = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzqu != null) {
            this.zzqu.finish();
        }
    }
}

package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class OfflinePingSender extends Worker {
    private final qfm g;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        qar.a();
        this.g = qap.b(context, new qem());
    }

    @Override // androidx.work.Worker
    public final adz i() {
        try {
            qfm qfmVar = this.g;
            qfmVar.px(3, qfmVar.pv());
            return adz.i();
        } catch (RemoteException unused) {
            return adz.g();
        }
    }
}

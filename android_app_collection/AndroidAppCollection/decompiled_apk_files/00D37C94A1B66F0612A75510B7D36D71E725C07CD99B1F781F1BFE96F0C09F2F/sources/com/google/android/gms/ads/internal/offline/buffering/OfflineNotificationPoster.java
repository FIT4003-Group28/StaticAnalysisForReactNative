package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class OfflineNotificationPoster extends Worker {
    private final qfm g;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        qar.a();
        this.g = qap.b(context, new qem());
    }

    @Override // androidx.work.Worker
    public final adz i() {
        String b = a().b("uri");
        String b2 = a().b("gws_query_id");
        try {
            qfm qfmVar = this.g;
            rad a = rac.a(this.a);
            Parcel pv = qfmVar.pv();
            dve.i(pv, a);
            pv.writeString(b);
            pv.writeString(b2);
            qfmVar.px(2, pv);
            return adz.i();
        } catch (RemoteException unused) {
            return adz.g();
        }
    }
}

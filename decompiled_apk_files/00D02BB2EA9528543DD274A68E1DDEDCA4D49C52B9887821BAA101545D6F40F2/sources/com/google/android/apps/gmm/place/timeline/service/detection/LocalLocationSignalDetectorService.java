package com.google.android.apps.gmm.place.timeline.service.detection;

import android.content.Intent;
import android.os.IBinder;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LocalLocationSignalDetectorService extends affo {
    public gdo a;
    public bvrv b;
    public ckcw c;
    public bmsy d;

    @Override // android.app.Service
    public final /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return this.d;
    }

    @Override // android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
        this.a.b();
        this.c.f(ckhc.COLLECT_VISIT_BADGE_LOCATION_SURVEY_SERVICE);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.a.e();
        this.c.g(ckhc.COLLECT_VISIT_BADGE_LOCATION_SURVEY_SERVICE);
        this.b.a();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        bvrj.UI_THREAD.c();
        for (dmjz dmjzVar : this.d.a().b().a()) {
            ((ckco) this.c.a(ckgo.H)).a(dmjzVar.e);
        }
        stopSelf();
    }
}

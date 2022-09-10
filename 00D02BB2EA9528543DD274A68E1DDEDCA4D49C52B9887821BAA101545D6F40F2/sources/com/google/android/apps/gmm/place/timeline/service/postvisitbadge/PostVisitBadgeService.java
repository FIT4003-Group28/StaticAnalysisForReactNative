package com.google.android.apps.gmm.place.timeline.service.postvisitbadge;

import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PostVisitBadgeService extends affo {
    public bmni a;
    public ckcw b;
    public Executor c;
    private final aclc d = new bmtb(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.d;
    }

    @Override // android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
        this.b.f(ckhc.POST_VISIT_BADGE_SERVICE);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b.g(ckhc.POST_VISIT_BADGE_SERVICE);
    }
}

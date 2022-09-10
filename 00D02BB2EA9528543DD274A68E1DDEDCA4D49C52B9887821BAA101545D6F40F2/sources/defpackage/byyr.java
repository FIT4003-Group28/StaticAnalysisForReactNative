package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gmm.transit.go.activity.TransitGuidanceActivityRecognitionEvent;
import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: byyr  reason: default package */
/* loaded from: classes4.dex */
public final class byyr extends BroadcastReceiver {
    static final long a = TimeUnit.SECONDS.toMillis(10);
    public byyp b;
    public dehq c;
    private byys d = byys.UNKNOWN;
    @dzsi
    private bvpk e;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null && ActivityRecognitionResult.a(intent)) {
            ActivityRecognitionResult b = ActivityRecognitionResult.b(intent);
            dxiq.c(this, context);
            final byys activity = TransitGuidanceActivityRecognitionEvent.getActivity(b.d());
            if (activity != this.d) {
                this.d = activity;
                bvpk bvpkVar = this.e;
                if (activity == byys.TILTING || activity == byys.UNKNOWN) {
                    if (bvpkVar != null) {
                        bvpkVar.b();
                        this.e = null;
                    }
                    bvpk a2 = bvpk.a(new Runnable(this, activity) { // from class: byyq
                        private final byyr a;
                        private final byys b;

                        {
                            this.a = this;
                            this.b = activity;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byyr byyrVar = this.a;
                            byyrVar.b.g(this.b);
                        }
                    });
                    this.e = a2;
                    bvqd.a(this.c.d(a2, a, TimeUnit.MILLISECONDS), this.c);
                } else {
                    if (bvpkVar != null) {
                        bvpkVar.b();
                        this.e = null;
                    }
                    this.b.g(activity);
                }
            }
            b.d();
        }
    }
}

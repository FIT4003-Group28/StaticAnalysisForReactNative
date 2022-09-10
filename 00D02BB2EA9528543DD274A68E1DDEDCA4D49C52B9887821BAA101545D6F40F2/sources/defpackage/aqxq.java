package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gmm.mylocation.events.ActivityRecognitionEvent;
import com.google.android.gms.location.ActivityRecognitionResult;
/* compiled from: PG */
/* renamed from: aqxq  reason: default package */
/* loaded from: classes.dex */
public final class aqxq extends BroadcastReceiver {
    public btrm a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        btrm btrmVar;
        ActivityRecognitionResult b;
        dxiq.c(this, context);
        if (intent == null) {
            return;
        }
        ardj ardjVar = null;
        if (ActivityRecognitionResult.a(intent) && (b = ActivityRecognitionResult.b(intent)) != null) {
            int a = b.d().a();
            if (a == 0) {
                ardjVar = ardj.IN_VEHICLE;
            } else if (a == 1) {
                ardjVar = ardj.ON_BICYCLE;
            } else if (a == 2) {
                ardjVar = ardj.ON_FOOT;
            } else if (a == 3) {
                ardjVar = ardj.STILL;
            } else if (a == 5) {
                ardjVar = ardj.TILTING;
            } else if (a == 7) {
                ardjVar = ardj.WALKING;
            } else if (a != 8) {
                switch (a) {
                    case 12:
                        ardjVar = ardj.ON_STAIRS;
                        break;
                    case 13:
                        ardjVar = ardj.ON_ESCALATOR;
                        break;
                    case 14:
                        ardjVar = ardj.IN_ELEVATOR;
                        break;
                    default:
                        ardjVar = ardj.UNKNOWN;
                        break;
                }
            } else {
                ardjVar = ardj.RUNNING;
            }
        }
        if (ardjVar == null || (btrmVar = this.a) == null) {
            return;
        }
        btrmVar.b(new ActivityRecognitionEvent(ardjVar));
    }
}

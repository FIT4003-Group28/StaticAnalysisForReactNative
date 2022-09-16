package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.app.vr.LaunchYouTubeVrActivity;
import com.google.vr.ndk.base.DaydreamApi;
/* compiled from: PG */
/* renamed from: nio  reason: default package */
/* loaded from: classes3.dex */
public final class nio {
    public final BroadcastReceiver a = new nin(this);
    public final Context b;
    protected DaydreamApi c;
    public boolean d;
    private final Intent e;

    public nio(Context context) {
        context.getClass();
        this.b = context;
        this.e = new Intent(context, LaunchYouTubeVrActivity.class);
    }

    public final void a() {
        DaydreamApi daydreamApi = this.c;
        if (daydreamApi != null) {
            daydreamApi.unregisterDaydreamIntent();
            this.c.close();
            this.c = null;
        }
    }

    public final void b() {
        if (!this.d || !c()) {
            return;
        }
        if (!ahss.e(this.b, 2)) {
            a();
            return;
        }
        if (this.c == null) {
            this.c = DaydreamApi.create(this.b);
        }
        if (this.c == null) {
            return;
        }
        this.c.registerDaydreamIntent(PendingIntent.getActivity(this.b, 0, this.e, zgd.M() | 134217728));
    }

    public final boolean c() {
        return DaydreamApi.isDaydreamReadyPlatform(this.b);
    }
}

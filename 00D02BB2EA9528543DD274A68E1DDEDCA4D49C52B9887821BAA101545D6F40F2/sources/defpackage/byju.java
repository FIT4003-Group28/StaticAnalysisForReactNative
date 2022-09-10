package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.BitmapFactory;
import com.google.android.apps.maps.R;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: byju  reason: default package */
/* loaded from: classes4.dex */
public class byju implements byik {
    public final Activity a;
    private final bvjj b;
    private final dxio<afha> c;
    private final cqat d;
    @dzsi
    private final bykh e;

    public byju(Activity activity, bvjj bvjjVar, dxio dxioVar, cqat cqatVar, bykh bykhVar) {
        this.e = bykhVar;
        this.a = activity;
        this.b = bvjjVar;
        this.c = dxioVar;
        this.d = cqatVar;
    }

    @Override // defpackage.byik
    public Boolean a() {
        long w = this.b.w(bvjk.dc, -1L);
        boolean z = false;
        if (jk.a(this.a) && w == -1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.byik
    public cqkl b() {
        this.a.registerReceiver(new byjt(this), new IntentFilter("TrafficHubActivity.SHORTCUT_WAS_CREATED"));
        Activity activity = this.a;
        jg h = yzi.h(activity, String.format("TrafficHubShortcutId_%s", UUID.randomUUID().toString()), activity.getString(R.string.TRAFFIC_HUB_SHORTCUT_NAME), BitmapFactory.decodeResource(activity.getResources(), R.drawable.traffic_hub_shortcut_icon), bynu.e(activity));
        Activity activity2 = this.a;
        this.c.a().t(activity2, h, PendingIntent.getBroadcast(activity2, 1, new Intent("TrafficHubActivity.SHORTCUT_WAS_CREATED"), 268435456).getIntentSender());
        return cqkl.a;
    }

    @Override // defpackage.byik
    public cqkl c() {
        d();
        return cqkl.a;
    }

    public final void d() {
        this.b.Z(bvjk.dc, this.d.b());
        cqkx.p(this);
        cqkx.p(this.e.a);
    }
}

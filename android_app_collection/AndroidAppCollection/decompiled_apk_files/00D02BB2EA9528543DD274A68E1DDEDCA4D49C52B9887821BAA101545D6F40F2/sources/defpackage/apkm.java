package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.apps.maps.R;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: apkm  reason: default package */
/* loaded from: classes2.dex */
public final class apkm {
    private static final String c = String.valueOf(apkm.class.getName()).concat(".SHORTCUT_WAS_CREATED");
    private static final Uri d = Uri.parse("https://www.google.com/maps/timeline");
    public final Activity a;
    public final dxio<afha> b;

    public apkm(Activity activity, dxio<afha> dxioVar) {
        this.a = activity;
        this.b = dxioVar;
    }

    public final void a() {
        Activity activity = this.a;
        apkl apklVar = new apkl(this);
        String str = c;
        activity.registerReceiver(apklVar, new IntentFilter(str));
        Activity activity2 = this.a;
        String valueOf = String.valueOf(UUID.randomUUID());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("timeline_shortcut_");
        sb.append(valueOf);
        this.b.a().t(activity2, b(sb.toString()), PendingIntent.getBroadcast(this.a, 1, new Intent(str), 268435456).getIntentSender());
    }

    public final jg b(String str) {
        Activity activity = this.a;
        return yzi.i(activity, str, activity.getString(R.string.TIMELINE), R.drawable.timeline_shortcut, afft.a(this.a).setAction("android.intent.action.VIEW").setData(d).putExtra("homescreen_shortcut", true));
    }
}

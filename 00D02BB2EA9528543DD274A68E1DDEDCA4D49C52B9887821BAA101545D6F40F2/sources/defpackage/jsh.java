package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.net.Uri;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: jsh  reason: default package */
/* loaded from: classes7.dex */
public final class jsh {
    public final Activity a;
    public final bvjj b;
    public final cqat c;
    private final btvo d;
    private final dxio<afha> e;

    public jsh(Activity activity, bvjj bvjjVar, btvo btvoVar, dxio<afha> dxioVar, cqat cqatVar) {
        this.a = activity;
        this.b = bvjjVar;
        this.d = btvoVar;
        this.e = dxioVar;
        this.c = cqatVar;
    }

    public final boolean a() {
        return this.d.getEnableFeatureParameters().ak && jk.a(this.a);
    }

    public final boolean b() {
        for (ShortcutInfo shortcutInfo : ((ShortcutManager) this.a.getSystemService(ShortcutManager.class)).getPinnedShortcuts()) {
            if (shortcutInfo.getId().equals("MaddenLandingPageShortcut")) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        Intent putExtra = afft.a(this.a).setAction("android.intent.action.VIEW").setData(Uri.parse("https://www.google.com/maps/reserve")).putExtra("homescreen_shortcut", true);
        if (!ako.a() || !b()) {
            Activity activity = this.a;
            jg i = yzi.i(activity, "MaddenLandingPageShortcut", activity.getString(R.string.HOMESCREEN_LAUNCHER_ICON_NAME), R.mipmap.madden_launcher_icon, putExtra);
            this.a.registerReceiver(new jsg(this), new IntentFilter("com.google.android.apps.gmm.booking.SHORTCUT_CREATED"));
            Activity activity2 = this.a;
            this.e.a().t(activity2, i, PendingIntent.getBroadcast(activity2, 0, new Intent("com.google.android.apps.gmm.booking.SHORTCUT_CREATED"), 268435456).getIntentSender());
            Activity activity3 = this.a;
            Toast.makeText(activity3, activity3.getString(R.string.HOMESCREEN_SHORTCUT_CREATED_TOAST), 0).show();
            return;
        }
        Toast.makeText(this.a, (int) R.string.HOMESCREEN_SHORTCUT_ALREADY_EXISTS_TOAST, 0).show();
    }
}

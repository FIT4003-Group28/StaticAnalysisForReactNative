package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.net.Uri;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cabg  reason: default package */
/* loaded from: classes4.dex */
public class cabg {
    private static final Uri d = Uri.parse("https://www.google.com/maps/contrib");
    public final gga a;
    public final bvjj b;
    public final dxio<afha> c;

    public cabg(gga ggaVar, bvjj bvjjVar, dxio<afha> dxioVar) {
        this.a = ggaVar;
        this.b = bvjjVar;
        this.c = dxioVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        gga ggaVar = this.a;
        if (!ggaVar.ba) {
            return;
        }
        Intent putExtra = afft.a(ggaVar).setAction("android.intent.action.VIEW").setData(d).putExtra("homescreen_shortcut", true);
        String string = this.a.getString(R.string.CONTRIBUTIONS_SHORTCUT_NAME);
        if (!ako.a() || !c()) {
            jg i = yzi.i(this.a, "contributionsShortcut", string, R.mipmap.ic_contributions_shortcut, putExtra);
            this.a.registerReceiver(new cabf(this), new IntentFilter("com.google.android.apps.gmm.ugc.contributions.SHORTCUT_CREATED"));
            gga ggaVar2 = this.a;
            this.c.a().t(ggaVar2, i, PendingIntent.getBroadcast(ggaVar2, 0, new Intent("com.google.android.apps.gmm.ugc.contributions.SHORTCUT_CREATED"), 268435456).getIntentSender());
            return;
        }
        gga ggaVar3 = this.a;
        Toast.makeText(ggaVar3, ggaVar3.getString(R.string.CONTRIBUTIONS_SHORTCUT_ALREADY_EXIST), 0).show();
    }

    public final boolean b() {
        return jk.a(this.a);
    }

    public final boolean c() {
        if (!ako.a()) {
            return this.b.m(bvjk.gP, false);
        }
        for (ShortcutInfo shortcutInfo : ((ShortcutManager) this.a.getSystemService(ShortcutManager.class)).getPinnedShortcuts()) {
            if (shortcutInfo.getId().equals("contributionsShortcut")) {
                return true;
            }
        }
        return false;
    }
}

package defpackage;

import android.net.Uri;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cmpm  reason: default package */
/* loaded from: classes5.dex */
final class cmpm extends Thread {
    final /* synthetic */ Map a;

    public cmpm(Map map) {
        this.a = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        cmpp.a(buildUpon.build().toString());
    }
}

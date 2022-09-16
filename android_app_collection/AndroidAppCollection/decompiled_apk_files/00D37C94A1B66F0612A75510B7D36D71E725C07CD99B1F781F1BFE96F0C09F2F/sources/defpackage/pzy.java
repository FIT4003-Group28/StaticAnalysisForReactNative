package defpackage;

import android.net.Uri;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pzy  reason: default package */
/* loaded from: classes4.dex */
public final class pzy extends Thread {
    final /* synthetic */ Map a;

    public pzy(Map map) {
        this.a = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        qge.d(buildUpon.build().toString());
    }
}

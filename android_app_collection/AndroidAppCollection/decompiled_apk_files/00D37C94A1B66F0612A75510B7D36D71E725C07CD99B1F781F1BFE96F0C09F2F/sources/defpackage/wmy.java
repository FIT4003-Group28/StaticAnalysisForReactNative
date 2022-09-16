package defpackage;

import android.net.Uri;
import java.util.Map;
/* compiled from: PG */
/* renamed from: wmy  reason: default package */
/* loaded from: classes4.dex */
final class wmy implements afzn {
    final /* synthetic */ Map a;

    public wmy(Map map) {
        this.a = map;
    }

    @Override // defpackage.afzn
    public final String a(Uri uri, String str) {
        return (String) this.a.get(str);
    }

    @Override // defpackage.afzn
    public final String b() {
        return "";
    }
}

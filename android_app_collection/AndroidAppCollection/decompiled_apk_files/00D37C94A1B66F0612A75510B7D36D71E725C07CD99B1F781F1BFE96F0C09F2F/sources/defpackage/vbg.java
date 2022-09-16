package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vbg  reason: default package */
/* loaded from: classes4.dex */
public final class vbg {
    public final Map a;

    public vbg() {
        this.a = new HashMap();
    }

    public vbg(Map map) {
        this.a = map;
    }

    public final String a(Uri uri, String str, String str2) {
        if (uri != null) {
            Map map = (Map) this.a.get(uri.toString());
            if (map == null) {
                return null;
            }
            if (str != null) {
                String valueOf = String.valueOf(str2);
                str2 = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
            }
            return (String) map.get(str2);
        }
        return null;
    }

    public final void b() {
        this.a.clear();
    }
}

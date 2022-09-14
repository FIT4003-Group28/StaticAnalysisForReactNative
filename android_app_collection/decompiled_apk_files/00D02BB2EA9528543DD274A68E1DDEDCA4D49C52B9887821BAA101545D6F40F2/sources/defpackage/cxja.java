package defpackage;

import android.net.Uri;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cxja  reason: default package */
/* loaded from: classes5.dex */
public final class cxja {
    private final Map<String, Map<String, String>> a;

    public cxja(Map<String, Map<String, String>> map) {
        this.a = map;
    }

    @dzsi
    public final String a(@dzsi Uri uri, @dzsi String str, @dzsi String str2, String str3) {
        if (uri != null) {
            str = uri.toString();
        } else if (str == null) {
            return null;
        }
        Map<String, String> map = this.a.get(str);
        if (map == null) {
            return null;
        }
        if (str2 != null) {
            String valueOf = String.valueOf(str3);
            str3 = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
        }
        return map.get(str3);
    }
}

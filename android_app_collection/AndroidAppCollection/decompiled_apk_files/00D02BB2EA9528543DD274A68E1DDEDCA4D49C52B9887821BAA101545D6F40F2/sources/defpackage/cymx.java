package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cymx  reason: default package */
/* loaded from: classes5.dex */
final class cymx {
    public final Map<String, String> a = new HashMap();
    public final Map<String, String> b = new HashMap();
    public final cyuj c;

    public cymx(cyuj cyujVar) {
        this.c = cyujVar;
    }

    public final String a(String str) {
        String str2 = this.b.get(str);
        if (str2 == null) {
            String b = this.c.b(str);
            this.b.put(str, b);
            return b;
        }
        return str2;
    }
}

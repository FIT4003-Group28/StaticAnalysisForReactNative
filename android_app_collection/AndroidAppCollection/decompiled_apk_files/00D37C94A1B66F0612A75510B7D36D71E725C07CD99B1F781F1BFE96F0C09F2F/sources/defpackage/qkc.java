package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: qkc  reason: default package */
/* loaded from: classes4.dex */
public final class qkc {
    private final Map b = new HashMap();
    public final Map a = new HashMap();
    private final Map c = new HashMap();

    public final int a(String str) {
        Integer num = (Integer) this.c.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void b(String str, String str2, int i) {
        this.b.put(str, str2);
        this.a.put(str2, str);
        this.c.put(str, Integer.valueOf(i));
    }
}

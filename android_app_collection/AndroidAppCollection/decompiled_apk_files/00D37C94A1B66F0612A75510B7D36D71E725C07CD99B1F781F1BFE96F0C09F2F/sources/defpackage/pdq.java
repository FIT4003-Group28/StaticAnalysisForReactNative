package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: pdq  reason: default package */
/* loaded from: classes4.dex */
public final class pdq {
    public final Map a = new HashMap();
    public final List b = new ArrayList();

    public static void b(pdq pdqVar, long j) {
        pdqVar.a("exo_len", Long.valueOf(j));
    }

    public final void a(String str, Object obj) {
        Map map = this.a;
        ptx.a(obj);
        map.put(str, obj);
        this.b.remove(str);
    }
}

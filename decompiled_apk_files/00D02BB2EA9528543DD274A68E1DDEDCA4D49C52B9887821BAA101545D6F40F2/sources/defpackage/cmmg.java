package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cmmg  reason: default package */
/* loaded from: classes5.dex */
public final class cmmg {
    public final Map<String, Object> a = new HashMap();
    public final List<String> b = new ArrayList();

    public static void b(cmmg cmmgVar, long j) {
        cmmgVar.a("exo_len", Long.valueOf(j));
    }

    public final void a(String str, Object obj) {
        Map<String, Object> map = this.a;
        cmmn.f(obj);
        map.put(str, obj);
        this.b.remove(str);
    }
}

package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: buic  reason: default package */
/* loaded from: classes4.dex */
public final class buic {
    @dzsi
    public buab<List<ahnc>> a;
    private final Map<String, buab<String>> b = new HashMap();

    public final void a(buab<String> buabVar) {
        this.b.put(buabVar.a(), buabVar);
    }

    @dzsi
    public final buab<String> b(String str) {
        return this.b.get(str);
    }
}

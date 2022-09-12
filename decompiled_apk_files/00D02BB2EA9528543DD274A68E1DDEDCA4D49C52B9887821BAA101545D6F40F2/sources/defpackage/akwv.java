package defpackage;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akwv  reason: default package */
/* loaded from: classes2.dex */
public final class akwv {
    final Map<String, Map<dmxl, String>> a = new HashMap();
    public final Map<String, dmxj> b = new HashMap();

    public final Map<dmxl, String> a(String str) {
        Map<dmxl, String> map = this.a.get(str);
        return map == null ? new EnumMap(dmxl.class) : map;
    }

    @dzsi
    public final String b(String str, @dzsi dmxl dmxlVar) {
        return a(str).get(dmxlVar);
    }
}

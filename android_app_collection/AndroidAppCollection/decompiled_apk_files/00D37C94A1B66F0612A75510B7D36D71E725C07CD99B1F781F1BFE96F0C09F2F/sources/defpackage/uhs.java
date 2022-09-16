package defpackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: uhs  reason: default package */
/* loaded from: classes4.dex */
public final class uhs {
    public URL a;
    public String b;
    public Map c;
    public byte[] d;

    public final Map a() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"headers\" has not been set");
    }

    public final void b(uhr uhrVar, String str) {
        List arrayList = a().containsKey(uhrVar) ? (List) a().get(uhrVar) : new ArrayList(1);
        arrayList.add(str);
        a().put(uhrVar, arrayList);
    }
}

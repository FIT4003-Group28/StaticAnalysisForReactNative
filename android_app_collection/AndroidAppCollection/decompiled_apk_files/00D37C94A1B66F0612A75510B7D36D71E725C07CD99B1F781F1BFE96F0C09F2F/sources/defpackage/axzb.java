package defpackage;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: axzb  reason: default package */
/* loaded from: classes2.dex */
public final class axzb {
    static final ampm a = new ampm(",");
    public static final axzb b = a().b(new axyp(1), true).b(axyp.a, false);
    public final Map c;
    public final byte[] d;

    private axzb() {
        this.c = new LinkedHashMap(0);
        this.d = new byte[0];
    }

    public static axzb a() {
        return new axzb();
    }

    public final axzb b(axyz axyzVar, boolean z) {
        return new axzb(axyzVar, z, this);
    }

    private axzb(axyz axyzVar, boolean z, axzb axzbVar) {
        String b2 = axyzVar.b();
        aqxo.q(!b2.contains(","), "Comma is currently not allowed in message encoding");
        int size = axzbVar.c.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(!axzbVar.c.containsKey(axyzVar.b()) ? size + 1 : size);
        for (axza axzaVar : axzbVar.c.values()) {
            String b3 = axzaVar.a.b();
            if (!b3.equals(b2)) {
                linkedHashMap.put(b3, new axza(axzaVar.a, axzaVar.b));
            }
        }
        linkedHashMap.put(b2, new axza(axyzVar, z));
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.c = unmodifiableMap;
        ampm ampmVar = a;
        HashSet hashSet = new HashSet(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            if (((axza) entry.getValue()).b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.d = ampmVar.d(Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }
}

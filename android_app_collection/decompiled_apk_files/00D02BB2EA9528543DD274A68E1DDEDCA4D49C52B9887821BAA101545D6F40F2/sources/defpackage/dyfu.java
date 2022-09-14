package defpackage;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dyfu  reason: default package */
/* loaded from: classes6.dex */
public final class dyfu {
    static final dbrz a = dbrz.f(',');
    public static final dyfu b = a().b(new dyff(), true).b(dyfg.a, false);
    public final Map<String, dyft> c;
    public final byte[] d;

    private dyfu() {
        this.c = new LinkedHashMap(0);
        this.d = new byte[0];
    }

    public static dyfu a() {
        return new dyfu();
    }

    public final dyfu b(dyfs dyfsVar, boolean z) {
        return new dyfu(dyfsVar, z, this);
    }

    private dyfu(dyfs dyfsVar, boolean z, dyfu dyfuVar) {
        String a2 = dyfsVar.a();
        dbsk.b(!a2.contains(","), "Comma is currently not allowed in message encoding");
        int size = dyfuVar.c.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(!dyfuVar.c.containsKey(dyfsVar.a()) ? size + 1 : size);
        for (dyft dyftVar : dyfuVar.c.values()) {
            String a3 = dyftVar.a.a();
            if (!a3.equals(a2)) {
                linkedHashMap.put(a3, new dyft(dyftVar.a, dyftVar.b));
            }
        }
        linkedHashMap.put(a2, new dyft(dyfsVar, z));
        Map<String, dyft> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.c = unmodifiableMap;
        dbrz dbrzVar = a;
        HashSet hashSet = new HashSet(unmodifiableMap.size());
        for (Map.Entry<String, dyft> entry : unmodifiableMap.entrySet()) {
            if (entry.getValue().b) {
                hashSet.add(entry.getKey());
            }
        }
        this.d = dbrzVar.g(Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }
}

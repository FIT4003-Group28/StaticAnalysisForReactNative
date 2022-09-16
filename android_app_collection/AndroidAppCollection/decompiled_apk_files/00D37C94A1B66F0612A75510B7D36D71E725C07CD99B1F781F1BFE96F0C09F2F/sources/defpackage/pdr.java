package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: pdr  reason: default package */
/* loaded from: classes4.dex */
public final class pdr implements pdp {
    public static final pdr a = new pdr(Collections.emptyMap());
    public final Map b;
    private int c;

    public pdr() {
        this(Collections.emptyMap());
    }

    private static boolean b(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final pdr a(pdq pdqVar) {
        byte[] bArr;
        HashMap hashMap = new HashMap(this.b);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(pdqVar.b));
        for (int i = 0; i < unmodifiableList.size(); i++) {
            hashMap.remove(unmodifiableList.get(i));
        }
        HashMap hashMap2 = new HashMap(pdqVar.a);
        for (Map.Entry entry : hashMap2.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr2, bArr2.length));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap2);
        for (String str : unmodifiableMap.keySet()) {
            Object obj = unmodifiableMap.get(str);
            if (obj instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
            } else if (obj instanceof String) {
                bArr = ((String) obj).getBytes(Charset.forName("UTF-8"));
            } else if (obj instanceof byte[]) {
                bArr = (byte[]) obj;
            } else {
                throw new IllegalArgumentException();
            }
            hashMap.put(str, bArr);
        }
        return b(this.b, hashMap) ? this : new pdr(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return b(this.b, ((pdr) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int i2 = 0;
            for (Map.Entry entry : this.b.entrySet()) {
                i2 += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.c = i2;
            return i2;
        }
        return i;
    }

    public pdr(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }
}

package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cmmh  reason: default package */
/* loaded from: classes5.dex */
public final class cmmh implements cmmf {
    public static final cmmh a = new cmmh(Collections.emptyMap());
    public final Map<String, byte[]> b;
    private int c;

    public cmmh() {
        this(Collections.emptyMap());
    }

    private static boolean d(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.cmmf
    public final long a() {
        byte[] bArr = this.b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    @Override // defpackage.cmmf
    public final String b() {
        byte[] bArr = this.b.get("exo_redir");
        if (bArr != null) {
            return new String(bArr, dbrc.c);
        }
        return null;
    }

    public final cmmh c(cmmg cmmgVar) {
        byte[] bArr;
        HashMap hashMap = new HashMap(this.b);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(cmmgVar.b));
        for (int i = 0; i < unmodifiableList.size(); i++) {
            hashMap.remove(unmodifiableList.get(i));
        }
        HashMap hashMap2 = new HashMap(cmmgVar.a);
        for (Map.Entry entry : hashMap2.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr2, bArr2.length));
            }
        }
        for (Map.Entry entry2 : Collections.unmodifiableMap(hashMap2).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bArr = ((String) value2).getBytes(dbrc.c);
            } else if (value2 instanceof byte[]) {
                bArr = (byte[]) value2;
            } else {
                throw new IllegalArgumentException();
            }
            hashMap.put(str, bArr);
        }
        return d(this.b, hashMap) ? this : new cmmh(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return d(this.b, ((cmmh) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int i2 = 0;
            for (Map.Entry<String, byte[]> entry : this.b.entrySet()) {
                i2 += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.c = i2;
            return i2;
        }
        return i;
    }

    public cmmh(Map<String, byte[]> map) {
        this.b = Collections.unmodifiableMap(map);
    }
}

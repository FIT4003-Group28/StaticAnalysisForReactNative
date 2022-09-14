package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bbp  reason: default package */
/* loaded from: classes.dex */
public final class bbp {
    public static final bbp a;
    public Map<String, Object> b;

    static {
        bbz.f("Data");
        a = new bbo().a();
    }

    bbp() {
    }

    public static byte[] f(bbp bbpVar) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            objectOutputStream.writeInt(bbpVar.b.size());
            for (Map.Entry<String, Object> entry : bbpVar.b.entrySet()) {
                objectOutputStream.writeUTF(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException unused2) {
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused3) {
            }
            if (byteArrayOutputStream.size() > 10240) {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused4) {
            objectOutputStream2 = objectOutputStream;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException unused5) {
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused6) {
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException unused7) {
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused8) {
            }
            throw th;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x002c -> B:33:0x002c). Please submit an issue!!! */
    public static bbp g(byte[] bArr) {
        ObjectInputStream objectInputStream;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap hashMap = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException unused) {
            }
            try {
                for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                    hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                }
                objectInputStream.close();
            } catch (IOException | ClassNotFoundException unused2) {
                objectInputStream2 = objectInputStream;
                if (objectInputStream2 != null) {
                    objectInputStream2.close();
                }
                byteArrayInputStream.close();
            } catch (Throwable th) {
                th = th;
                objectInputStream2 = objectInputStream;
                if (objectInputStream2 != null) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                try {
                    byteArrayInputStream.close();
                } catch (IOException unused4) {
                }
                throw th;
            }
        } catch (IOException | ClassNotFoundException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException unused6) {
            return new bbp(hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean[] h(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Byte[] i(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Integer[] j(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Long[] k(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Float[] l(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Double[] m(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    public final byte[] a(String str) {
        Object obj = this.b.get(str);
        if (obj instanceof Byte[]) {
            Byte[] bArr = (Byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                bArr2[i] = bArr[i].byteValue();
            }
            return bArr2;
        }
        return null;
    }

    public final int b(String str, int i) {
        Object obj = this.b.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i;
    }

    public final String c(String str) {
        Object obj = this.b.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final Map<String, Object> d() {
        return Collections.unmodifiableMap(this.b);
    }

    public final <T> boolean e(String str, Class<T> cls) {
        Object obj = this.b.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bbp bbpVar = (bbp) obj;
        Set<String> keySet = this.b.keySet();
        if (!keySet.equals(bbpVar.b.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.b.get(str);
            Object obj3 = bbpVar.b.get(str);
            if (obj2 == null || obj3 == null) {
                if (obj2 == obj3) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } else if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                z = obj2.equals(obj3);
                continue;
            } else {
                z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }

    public final boolean n(String str) {
        Object obj = this.b.get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public final long o(String str) {
        Object obj = this.b.get(str);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        return 0L;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.b.isEmpty()) {
            for (String str : this.b.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.b.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public bbp(bbp bbpVar) {
        this.b = new HashMap(bbpVar.b);
    }

    public bbp(Map<String, ?> map) {
        this.b = new HashMap(map);
    }
}

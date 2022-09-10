package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: eavj  reason: default package */
/* loaded from: classes6.dex */
public final class eavj implements eavh {
    private final String a;
    private final ClassLoader b;
    private final Map<String, Object> c;

    public eavj() {
        StringBuilder sb = new StringBuilder(22);
        sb.append("org/joda/time/tz/data");
        sb.append('/');
        this.a = sb.toString();
        this.b = getClass().getClassLoader();
        InputStream c = c("ZoneInfoMap");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(c);
        try {
            e(dataInputStream, concurrentHashMap);
            concurrentHashMap.put("UTC", new SoftReference(eaou.b));
            this.c = concurrentHashMap;
        } finally {
            try {
                dataInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private final InputStream c(String str) {
        InputStream systemResourceAsStream;
        String concat = this.a.concat(str);
        ClassLoader classLoader = this.b;
        if (classLoader != null) {
            systemResourceAsStream = classLoader.getResourceAsStream(concat);
        } else {
            systemResourceAsStream = ClassLoader.getSystemResourceAsStream(concat);
        }
        if (systemResourceAsStream == null) {
            StringBuilder sb = new StringBuilder(40);
            sb.append("Resource not found: \"");
            sb.append(concat);
            sb.append("\" ClassLoader: ");
            ClassLoader classLoader2 = this.b;
            sb.append(classLoader2 != null ? classLoader2.toString() : "system");
            throw new IOException(sb.toString());
        }
        return systemResourceAsStream;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0029: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:12:0x0029 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.eaou d(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.io.InputStream r1 = r5.c(r6)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            boolean r2 = r1 instanceof java.io.DataInput     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            if (r2 == 0) goto L11
            r2 = r1
            java.io.DataInput r2 = (java.io.DataInput) r2     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            eaou r2 = defpackage.eave.a(r2, r6)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            goto L1a
        L11:
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            eaou r2 = defpackage.eave.a(r2, r6)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
        L1a:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.c     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            java.lang.ref.SoftReference r4 = new java.lang.ref.SoftReference     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            r3.put(r6, r4)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2b
            r1.close()     // Catch: java.io.IOException -> L27
        L27:
            return r2
        L28:
            r6 = move-exception
            r0 = r1
            goto L47
        L2b:
            r2 = move-exception
            goto L31
        L2d:
            r6 = move-exception
            goto L47
        L2f:
            r2 = move-exception
            r1 = r0
        L31:
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L28
            java.lang.ThreadGroup r4 = r3.getThreadGroup()     // Catch: java.lang.Throwable -> L28
            r4.uncaughtException(r3, r2)     // Catch: java.lang.Throwable -> L28
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.c     // Catch: java.lang.Throwable -> L28
            r2.remove(r6)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L46
            r1.close()     // Catch: java.io.IOException -> L46
        L46:
            return r0
        L47:
            if (r0 == 0) goto L4c
            r0.close()     // Catch: java.io.IOException -> L4c
        L4c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eavj.d(java.lang.String):eaou");
    }

    private static void e(DataInputStream dataInputStream, Map<String, Object> map) {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        for (int i = 0; i < readUnsignedShort; i++) {
            strArr[i] = dataInputStream.readUTF().intern();
        }
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        for (int i2 = 0; i2 < readUnsignedShort2; i2++) {
            try {
                map.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Corrupt zone info map");
            }
        }
    }

    @Override // defpackage.eavh
    public final eaou a(String str) {
        Object obj;
        if (str == null || (obj = this.c.get(str)) == null) {
            return null;
        }
        if (str.equals(obj)) {
            return d(str);
        }
        if (obj instanceof SoftReference) {
            eaou eaouVar = (eaou) ((SoftReference) obj).get();
            return eaouVar != null ? eaouVar : d(str);
        }
        return a((String) obj);
    }

    @Override // defpackage.eavh
    public final Set<String> b() {
        return new TreeSet(this.c.keySet());
    }
}

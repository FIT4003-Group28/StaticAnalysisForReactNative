package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: br  reason: default package */
/* loaded from: classes4.dex */
public final class br implements awb, awa {
    static final TreeMap<Integer, br> g = new TreeMap<>();
    final long[] a;
    final double[] b;
    final String[] c;
    final byte[][] d;
    final int e;
    int f;
    private volatile String h;
    private final int[] i;

    private br(int i) {
        this.e = i;
        int i2 = i + 1;
        this.i = new int[i2];
        this.a = new long[i2];
        this.b = new double[i2];
        this.c = new String[i2];
        this.d = new byte[i2];
    }

    public static br a(String str, int i) {
        TreeMap<Integer, br> treeMap = g;
        synchronized (treeMap) {
            Map.Entry<Integer, br> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                br value = ceilingEntry.getValue();
                value.b(str, i);
                return value;
            }
            br brVar = new br(i);
            brVar.b(str, i);
            return brVar;
        }
    }

    final void b(String str, int i) {
        this.h = str;
        this.f = i;
    }

    public final void c() {
        TreeMap<Integer, br> treeMap = g;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.e), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.awb
    public final String d() {
        return this.h;
    }

    @Override // defpackage.awb
    public final void e(awa awaVar) {
        for (int i = 1; i <= this.f; i++) {
            int i2 = this.i[i];
            if (i2 == 1) {
                awaVar.f(i);
            } else if (i2 == 2) {
                awaVar.g(i, this.a[i]);
            } else if (i2 == 3) {
                awaVar.h(i, this.b[i]);
            } else if (i2 == 4) {
                awaVar.i(i, this.c[i]);
            } else if (i2 == 5) {
                awaVar.j(i, this.d[i]);
            }
        }
    }

    @Override // defpackage.awa
    public final void f(int i) {
        this.i[i] = 1;
    }

    @Override // defpackage.awa
    public final void g(int i, long j) {
        this.i[i] = 2;
        this.a[i] = j;
    }

    @Override // defpackage.awa
    public final void h(int i, double d) {
        throw null;
    }

    @Override // defpackage.awa
    public final void i(int i, String str) {
        this.i[i] = 4;
        this.c[i] = str;
    }

    @Override // defpackage.awa
    public final void j(int i, byte[] bArr) {
        throw null;
    }
}

package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: bku  reason: default package */
/* loaded from: classes2.dex */
public final class bku implements blt, bls {
    static final TreeMap a = new TreeMap();
    final long[] b;
    final double[] c;
    final String[] d;
    final byte[][] e;
    final int f;
    int g;
    private volatile String h;
    private final int[] i;

    private bku(int i) {
        this.f = i;
        int i2 = i + 1;
        this.i = new int[i2];
        this.b = new long[i2];
        this.c = new double[i2];
        this.d = new String[i2];
        this.e = new byte[i2];
    }

    public static bku a(String str, int i) {
        TreeMap treeMap = a;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                bku bkuVar = (bku) ceilingEntry.getValue();
                bkuVar.h(str, i);
                return bkuVar;
            }
            bku bkuVar2 = new bku(i);
            bkuVar2.h(str, i);
            return bkuVar2;
        }
    }

    @Override // defpackage.blt
    public final String b() {
        return this.h;
    }

    @Override // defpackage.bls
    public final void c(int i, byte[] bArr) {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.bls
    public final void d(int i, long j) {
        this.i[1] = 2;
        this.b[1] = j;
    }

    @Override // defpackage.bls
    public final void e(int i) {
        this.i[i] = 1;
    }

    @Override // defpackage.bls
    public final void f(int i, String str) {
        this.i[i] = 4;
        this.d[i] = str;
    }

    @Override // defpackage.blt
    public final void g(bls blsVar) {
        for (int i = 1; i <= this.g; i++) {
            int i2 = this.i[i];
            if (i2 == 1) {
                blsVar.e(i);
            } else if (i2 == 2) {
                blsVar.d(i, this.b[i]);
            } else if (i2 == 3) {
                ((bma) blsVar).a.bindDouble(i, this.c[i]);
            } else if (i2 == 4) {
                blsVar.f(i, this.d[i]);
            } else if (i2 == 5) {
                blsVar.c(i, this.e[i]);
            }
        }
    }

    final void h(String str, int i) {
        this.h = str;
        this.g = i;
    }

    public final void i() {
        TreeMap treeMap = a;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
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
}

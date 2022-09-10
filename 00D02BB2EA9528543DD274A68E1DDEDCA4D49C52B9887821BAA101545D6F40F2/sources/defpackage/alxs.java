package defpackage;

import android.util.SparseIntArray;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: alxs  reason: default package */
/* loaded from: classes.dex */
public class alxs {
    public static final alxp a = new alxp(-1, new alxo[]{alxo.c}, new byte[]{0}, null);
    public static final byte[] b = new byte[0];
    private final dzmd<alxp> c = new dzmd<>();

    public alxs() {
        new dzjg();
        new dzjg();
    }

    public static alxp e(dmqx dmqxVar, AtomicLong atomicLong) {
        return g(dmqxVar, atomicLong, false, new alxr());
    }

    public static alxs f(Iterable<dmqx> iterable) {
        dbsk.b(true, "isGlobalTable cannot be true in on test builds");
        alxs alxsVar = new alxs();
        alxr alxrVar = new alxr();
        AtomicLong atomicLong = new AtomicLong(0L);
        int i = 0;
        for (dmqx dmqxVar : iterable) {
            try {
                alxp g = g(dmqxVar, atomicLong, true, alxrVar);
                long j = i;
                synchronized (alxsVar.c) {
                    alxsVar.c.a(j, g);
                }
                i++;
            } catch (IndexOutOfBoundsException e) {
                throw new IOException("unpackProtoFull: Error in parsing multiZoomStyle", e);
            }
        }
        return alxsVar;
    }

    private static alxp g(dmqx dmqxVar, AtomicLong atomicLong, boolean z, alxr alxrVar) {
        dmsp dmspVar = dmqxVar.d;
        if (dmspVar == null) {
            dmspVar = dmsp.c;
        }
        SparseIntArray sparseIntArray = null;
        if (dmspVar.a.size() > 0 && dmspVar.b.size() > 0) {
            int min = Math.min(dmspVar.a.size(), dmspVar.b.size());
            sparseIntArray = new SparseIntArray(min);
            while (true) {
                min--;
                if (min < 0) {
                    break;
                }
                sparseIntArray.put(dmspVar.a.f(min), dmspVar.b.f(min));
            }
        }
        SparseIntArray sparseIntArray2 = sparseIntArray;
        int size = dmqxVar.b.size();
        if (size <= 0) {
            return new alxp(dmqxVar.a, null, null, sparseIntArray2);
        }
        alxrVar.a(size);
        for (int i = 0; i < size; i++) {
            dmop dmopVar = dmqxVar.b.get(i);
            h(dmopVar, atomicLong, z, alxrVar);
            alxrVar.b(dmopVar.b);
        }
        alxp c = alxrVar.c(dmqxVar.a, sparseIntArray2);
        if (dmqxVar.c.size() == 0) {
            return c;
        }
        HashMap d = dcjz.d();
        for (int i2 = 0; i2 < dmqxVar.c.size(); i2++) {
            dmqw dmqwVar = dmqxVar.c.get(i2);
            if (dmqwVar.c.size() != 0) {
                alxrVar.a(dmqwVar.c.size());
                for (int i3 = 0; i3 < dmqwVar.c.size(); i3++) {
                    dmop dmopVar2 = dmqwVar.c.get(i3);
                    h(dmopVar2, atomicLong, z, alxrVar);
                    alxrVar.b(dmopVar2.b);
                }
                alxp c2 = alxrVar.c(dmqxVar.a, sparseIntArray2);
                for (int i4 = 0; i4 < dmqwVar.a.size(); i4++) {
                    d.put(Integer.valueOf(dmqw.b.a(Integer.valueOf(dmqwVar.a.f(i4))).L), c2);
                }
            }
        }
        c.d = d;
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(defpackage.dmop r11, java.util.concurrent.atomic.AtomicLong r12, boolean r13, defpackage.alxr r14) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alxs.h(dmop, java.util.concurrent.atomic.AtomicLong, boolean, alxr):void");
    }

    private final synchronized alxp i() {
        return a;
    }

    public alxp a(long j) {
        alxp i;
        synchronized (this.c) {
            i = this.c.i(j);
        }
        return i == null ? i() : i;
    }

    public alxp b(int i) {
        return a;
    }

    public int c() {
        return this.c.j;
    }

    public byte[] d() {
        return b;
    }
}

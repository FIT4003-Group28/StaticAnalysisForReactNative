package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: iqw  reason: default package */
/* loaded from: classes6.dex */
public class iqw implements Serializable {
    private static final dcqe a = dcqe.c("iqw");
    private String b = "";
    private final List<bwrs<ilo>> c = dchl.a();
    private final List<bwrs<ilo>> d = dchl.a();
    private bvrt<dhjx> e = bvrt.b(dhjx.f);
    private int f = -1;

    private final synchronized void D(int i, ilo iloVar) {
        E(e(i), iloVar);
    }

    private static synchronized void E(bwrs<ilo> bwrsVar, ilo iloVar) {
        synchronized (iqw.class) {
            bwrsVar.d(iloVar.f(bwrsVar.c()).d());
        }
    }

    private static synchronized int F(ilo iloVar, List<bwrs<ilo>> list) {
        synchronized (iqw.class) {
            int size = list.size();
            if (iloVar.ai() != null) {
                for (int i = 0; i < size; i++) {
                    if (iloVar.cr(list.get(i).c())) {
                        return i;
                    }
                }
                return -1;
            }
            return -1;
        }
    }

    private final synchronized boolean G(int i) {
        boolean z;
        if (i >= 0) {
            if (i < this.c.size()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    private final synchronized boolean H(int i) {
        boolean z;
        if (i >= 0) {
            if (i < this.d.size()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
    }

    public final synchronized ilo A() {
        return e(0).c();
    }

    public final synchronized void B(ilo iloVar) {
        int n = n(iloVar);
        if (n == -1) {
            bwrs<ilo> a2 = bwrs.a(iloVar);
            n = this.f + 1;
            this.d.add(n, a2);
        } else {
            bwrs<ilo> bwrsVar = this.d.get(n);
            int i = this.f;
            if (i == n) {
                n = i;
            } else if (i != n + 1) {
                if (i < n) {
                    this.d.remove(n);
                    n = this.f + 1;
                    this.d.add(n, bwrsVar);
                } else if (i > n) {
                    this.d.remove(n);
                    n = this.f;
                    this.d.add(n, bwrsVar);
                } else {
                    throw new RuntimeException();
                }
            }
        }
        this.f = n;
    }

    public final synchronized void C(ilo iloVar) {
        for (Integer num : f(iloVar.ai())) {
            D(num.intValue(), iloVar);
        }
    }

    public final synchronized void a(List<ilo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ilo iloVar : list) {
            arrayList.add(bwrs.a(iloVar));
        }
        b(arrayList);
    }

    public final synchronized void b(List<bwrs<ilo>> list) {
        HashSet hashSet = new HashSet();
        for (bwrs<ilo> bwrsVar : this.d) {
            akqi ai = bwrsVar.c().ai();
            if (ai != null) {
                hashSet.add(Long.valueOf(ai.c));
            }
        }
        for (bwrs<ilo> bwrsVar2 : list) {
            akqi ai2 = bwrsVar2.c().ai();
            this.c.add(bwrsVar2);
            if (ai2 != null && !hashSet.contains(Long.valueOf(ai2.c))) {
                this.d.add(bwrsVar2);
            }
        }
    }

    public synchronized List<ilo> c() {
        throw null;
    }

    public final synchronized int d() {
        return this.c.size();
    }

    public final synchronized bwrs<ilo> e(int i) {
        return this.c.get(i);
    }

    public final synchronized List<Integer> f(akqi akqiVar) {
        ArrayList a2;
        dbsk.s(akqiVar);
        List<bwrs<ilo>> list = this.c;
        a2 = dchl.a();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ilo c = list.get(i).c();
            if (!dbsd.a(c.ai(), akqi.a) && akqiVar.c == c.ai().c) {
                a2.add(Integer.valueOf(i));
            }
        }
        return a2;
    }

    public final synchronized int g() {
        return this.d.size();
    }

    public final synchronized ilo h(int i) {
        return i(i).c();
    }

    public final synchronized bwrs<ilo> i(int i) {
        return this.d.get(i);
    }

    public final synchronized void j(int i, ilo iloVar) {
        E(i(i), iloVar);
    }

    public final synchronized void k(int i, int i2) {
        if (G(i) && G(i2)) {
            this.c.add(i2, this.c.remove(i));
        }
    }

    public final synchronized void l(ilo iloVar) {
        int n = n(iloVar);
        if (!H(n)) {
            return;
        }
        this.d.remove(n);
    }

    public final synchronized void m(ilo iloVar) {
        for (Integer num : dcfc.R(iqv.a, dcbg.b(f(iloVar.ai())).a())) {
            this.c.remove(e(num.intValue()));
        }
    }

    public final synchronized int n(ilo iloVar) {
        return F(iloVar, this.d);
    }

    public final synchronized int o(ilo iloVar) {
        return F(iloVar, this.c);
    }

    public final synchronized boolean p() {
        boolean z;
        int i = this.f;
        if (i >= 0) {
            if (i < this.d.size()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final synchronized ilo q() {
        if (p()) {
            return h(this.f);
        }
        return null;
    }

    public final synchronized bwrs<ilo> r() {
        if (p()) {
            return i(this.f);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r4 < r3.d.size()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void s(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = -1
            r1 = 0
            r2 = 1
            if (r4 == r0) goto L10
            if (r4 < 0) goto L11
            java.util.List<bwrs<ilo>> r0 = r3.d     // Catch: java.lang.Throwable -> L18
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L18
            if (r4 >= r0) goto L11
        L10:
            r1 = 1
        L11:
            defpackage.dbsk.a(r1)     // Catch: java.lang.Throwable -> L18
            r3.f = r4     // Catch: java.lang.Throwable -> L18
            monitor-exit(r3)
            return
        L18:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqw.s(int):void");
    }

    public final synchronized void t(ilo iloVar) {
        int n = n(iloVar);
        this.f = n;
        if (n < 0) {
            bvoo.h("Placemark %s should exist in mapPlacemarkRefs", iloVar.ai());
        }
    }

    public final synchronized void u(String str) {
        this.b = str;
    }

    public final synchronized String v() {
        return this.b;
    }

    public final synchronized void w(dhjx dhjxVar) {
        this.e = bvrt.b(dhjxVar);
    }

    public final synchronized dhjx x() {
        return this.e.e((dssr) dhjx.f.cu(7), dhjx.f);
    }

    public final synchronized bwrs<ilo> y(ilo iloVar) {
        bwrs<ilo> r;
        B(iloVar);
        r = r();
        dbsk.s(r);
        return r;
    }

    public synchronized void z() {
        this.c.clear();
        this.d.clear();
        this.f = -1;
    }
}

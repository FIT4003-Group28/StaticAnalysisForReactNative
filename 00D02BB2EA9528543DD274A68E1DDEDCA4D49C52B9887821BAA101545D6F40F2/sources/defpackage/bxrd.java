package defpackage;

import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bxrd  reason: default package */
/* loaded from: classes4.dex */
final class bxrd implements btph {
    public final dxio<bvrb> a;
    public String b;
    private final int f;
    private final bwrg<bxxn> g;
    private final ArrayDeque<dpte> d = new ArrayDeque<>();
    private final aif<String, dpte> e = new aif<>();
    public boolean c = false;
    @dzsi
    private deig<dcdc<dpte>> h = null;

    private bxrd(int i, bwrg<bxxn> bwrgVar, @dzsi btlu btluVar, dxio<bvrb> dxioVar, boolean z) {
        this.f = i;
        this.g = bwrgVar;
        this.a = dxioVar;
        this.b = s(btluVar, z);
    }

    public static bxrd a(int i, bwrg<bxxn> bwrgVar, @dzsi btlu btluVar, dxio<bvrb> dxioVar, boolean z) {
        bxrd bxrdVar = new bxrd(i, bwrgVar, btluVar, dxioVar, z);
        bxrdVar.n();
        return bxrdVar;
    }

    private final synchronized void m() {
        bxxm bZ = bxxn.d.bZ();
        ArrayDeque<dpte> arrayDeque = this.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bxxn bxxnVar = (bxxn) bZ.b;
        dsrj<dpte> dsrjVar = bxxnVar.b;
        if (!dsrjVar.a()) {
            bxxnVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(arrayDeque, bxxnVar.b);
        String str = this.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bxxn bxxnVar2 = (bxxn) bZ.b;
        str.getClass();
        bxxnVar2.a |= 1;
        bxxnVar2.c = str;
        this.g.e(bZ.bK());
    }

    private final synchronized void n() {
        this.g.h(new dbsz(this) { // from class: bxrb
            private final bxrd a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                final bxrd bxrdVar = this.a;
                bxxn bxxnVar = (bxxn) obj;
                if (bxxnVar != null && bxxnVar.c.equals(bxrdVar.b)) {
                    final List l = dchl.l(bxxnVar.b);
                    bxrdVar.a.a().b(new Runnable(bxrdVar, l) { // from class: bxrc
                        private final bxrd a;
                        private final List b;

                        {
                            this.a = bxrdVar;
                            this.b = l;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            bxrd bxrdVar2 = this.a;
                            for (dpte dpteVar : this.b) {
                                bxrdVar2.e(dpteVar);
                            }
                            if (!bxrdVar2.c) {
                                bxrdVar2.k();
                            }
                            bxrdVar2.c = true;
                        }
                    }, bvrj.UI_THREAD);
                    return;
                }
                if (!bxrdVar.c) {
                    bxrdVar.k();
                }
                bxrdVar.c = true;
            }
        });
    }

    private final synchronized void o(String str, dpte dpteVar) {
        if (this.e.containsKey(str)) {
            dpte dpteVar2 = this.e.get(str);
            q(dpteVar2);
            this.d.remove(dpteVar2);
        }
        this.e.put(str, dpteVar);
    }

    private final synchronized void p() {
        while (this.d.size() > this.f) {
            q(this.d.removeLast());
        }
    }

    private final synchronized void q(dpte dpteVar) {
        String r = r(dpteVar);
        if (r != null) {
            this.e.remove(r);
        }
    }

    @dzsi
    private static String r(dpte dpteVar) {
        dptg dptgVar;
        dptg dptgVar2;
        dptg dptgVar3;
        dpti dptiVar;
        dptb dptbVar;
        dptb dptbVar2;
        int a = dptd.a(dpteVar.b);
        String str = a != 1 ? a != 2 ? a != 3 ? a != 4 ? "null" : "ENTRY_NOT_SET" : "EXPERIENCE_ENTRY" : "SEARCH_ENTRY" : "PLACE_ENTRY";
        StringBuilder sb = new StringBuilder(str.length() + 3);
        sb.append("i:");
        sb.append(str);
        sb.append(":");
        String sb2 = sb.toString();
        btlt btltVar = btlt.UNKNOWN;
        int a2 = dptd.a(dpteVar.b);
        int i = a2 - 1;
        if (a2 != 0) {
            if (i == 0) {
                if (dpteVar.b == 4) {
                    dptgVar = (dptg) dpteVar.c;
                } else {
                    dptgVar = dptg.q;
                }
                if ((dptgVar.a & 8) == 0) {
                    String valueOf = String.valueOf(sb2);
                    if (dpteVar.b == 4) {
                        dptgVar2 = (dptg) dpteVar.c;
                    } else {
                        dptgVar2 = dptg.q;
                    }
                    String valueOf2 = String.valueOf(dbqa.a(dptgVar2.c));
                    return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                }
                String valueOf3 = String.valueOf(sb2);
                if (dpteVar.b == 4) {
                    dptgVar3 = (dptg) dpteVar.c;
                } else {
                    dptgVar3 = dptg.q;
                }
                String valueOf4 = String.valueOf(dptgVar3.e);
                return valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
            } else if (i == 1) {
                String valueOf5 = String.valueOf(sb2);
                if (dpteVar.b == 5) {
                    dptiVar = (dpti) dpteVar.c;
                } else {
                    dptiVar = dpti.e;
                }
                String valueOf6 = String.valueOf(dbqa.a(dptiVar.c));
                return valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new String(valueOf5);
            } else if (i != 2) {
                return null;
            } else {
                if (dpteVar.b == 6) {
                    dptbVar = (dptb) dpteVar.c;
                } else {
                    dptbVar = dptb.e;
                }
                dpuk b = dpuk.b(dptbVar.b);
                if (b == null) {
                    b = dpuk.UNKNOWN_KNOWLEDGE_ENTITY;
                }
                String name = b.name();
                if (dpteVar.b == 6) {
                    dptbVar2 = (dptb) dpteVar.c;
                } else {
                    dptbVar2 = dptb.e;
                }
                String str2 = dptbVar2.a;
                StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 1 + String.valueOf(name).length() + String.valueOf(str2).length());
                sb3.append(sb2);
                sb3.append(name);
                sb3.append(":");
                sb3.append(str2);
                return sb3.toString();
            }
        }
        throw null;
    }

    private static String s(@dzsi btlu btluVar, boolean z) {
        if (btluVar == null) {
            return "NO_ACCOUNT";
        }
        btlt btltVar = btlt.UNKNOWN;
        int ordinal = btlu.i(btluVar).ordinal();
        if (ordinal == 0) {
            return "UNKNOWN_ACCOUNT";
        }
        if (ordinal == 1 || ordinal == 2) {
            String valueOf = String.valueOf(btluVar.d);
            String str = true != z ? "_NON_WAA" : "_WAA";
            return str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
        } else if (ordinal == 3) {
            return "NO_ACCOUNT";
        } else {
            String valueOf2 = String.valueOf(btlu.i(btluVar));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 22);
            sb.append("Invalid account type: ");
            sb.append(valueOf2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    public final synchronized dcdc<dpte> b() {
        return dcdc.r(this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(dpte dpteVar) {
        e(dpteVar);
        m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r0 == defpackage.dpuk.MAJOR_EVENT) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(defpackage.dpte r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            btlt r0 = defpackage.btlt.UNKNOWN     // Catch: java.lang.Throwable -> L48
            int r0 = r3.b     // Catch: java.lang.Throwable -> L48
            int r0 = defpackage.dptd.a(r0)     // Catch: java.lang.Throwable -> L48
            int r1 = r0 + (-1)
            if (r0 == 0) goto L46
            if (r1 == 0) goto L33
            r0 = 1
            if (r1 == r0) goto L33
            r0 = 2
            if (r1 == r0) goto L16
            goto L31
        L16:
            int r0 = r3.b     // Catch: java.lang.Throwable -> L48
            r1 = 6
            if (r0 != r1) goto L20
            java.lang.Object r0 = r3.c     // Catch: java.lang.Throwable -> L48
            dptb r0 = (defpackage.dptb) r0     // Catch: java.lang.Throwable -> L48
            goto L22
        L20:
            dptb r0 = defpackage.dptb.e     // Catch: java.lang.Throwable -> L48
        L22:
            int r0 = r0.b     // Catch: java.lang.Throwable -> L48
            dpuk r0 = defpackage.dpuk.b(r0)     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L2c
            dpuk r0 = defpackage.dpuk.UNKNOWN_KNOWLEDGE_ENTITY     // Catch: java.lang.Throwable -> L48
        L2c:
            dpuk r1 = defpackage.dpuk.MAJOR_EVENT     // Catch: java.lang.Throwable -> L48
            if (r0 != r1) goto L31
            goto L33
        L31:
            monitor-exit(r2)
            return
        L33:
            java.lang.String r0 = r(r3)     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L3c
            r2.o(r0, r3)     // Catch: java.lang.Throwable -> L48
        L3c:
            java.util.ArrayDeque<dpte> r0 = r2.d     // Catch: java.lang.Throwable -> L48
            r0.addFirst(r3)     // Catch: java.lang.Throwable -> L48
            r2.p()     // Catch: java.lang.Throwable -> L48
            monitor-exit(r2)
            return
        L46:
            r3 = 0
            throw r3     // Catch: java.lang.Throwable -> L48
        L48:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxrd.e(dpte):void");
    }

    public final synchronized void f(dpte dpteVar) {
        this.d.remove(dpteVar);
        q(dpteVar);
        m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g(dcdc<dpte> dcdcVar) {
        if (dcdcVar.isEmpty()) {
            return;
        }
        long j = dcdcVar.get(0).e;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            j = Math.max(dcdcVar.get(i).e, j);
        }
        dcdc<dpte> j2 = j(j);
        l();
        dcdc<dpte> SL = dcdcVar.SL();
        int size2 = SL.size();
        for (int i2 = 0; i2 < size2; i2++) {
            e(SL.get(i2));
        }
        dcdc<dpte> SL2 = j2.SL();
        int size3 = SL2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            e(SL2.get(i3));
        }
        m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized dehn<dcdc<dpte>> h() {
        deig<dcdc<dpte>> deigVar;
        if (this.h == null) {
            this.h = deig.d();
        }
        deigVar = this.h;
        if (this.c) {
            k();
        }
        return deigVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void i(@dzsi btlu btluVar, boolean z) {
        this.b = s(btluVar, z);
        l();
    }

    final synchronized dcdc<dpte> j(long j) {
        dccx F;
        F = dcdc.F();
        Iterator<dpte> it = this.d.iterator();
        while (it.hasNext()) {
            dpte next = it.next();
            if (next.e > j) {
                F.g(next);
            }
        }
        return F.f();
    }

    public final synchronized void k() {
        deig<dcdc<dpte>> deigVar = this.h;
        if (deigVar == null) {
            return;
        }
        deigVar.j(b());
        this.h = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void l() {
        this.d.clear();
        this.e.clear();
        this.g.g();
    }
}

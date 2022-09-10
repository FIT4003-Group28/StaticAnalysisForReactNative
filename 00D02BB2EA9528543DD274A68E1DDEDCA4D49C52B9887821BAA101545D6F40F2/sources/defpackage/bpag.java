package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bpag  reason: default package */
/* loaded from: classes3.dex */
public class bpag {
    public static final dcqe a = dcqe.c("bpag");
    public final bozs b;
    final bpaf d;
    private final boyt i;
    private final cfll j;
    private final cflq k;
    final List<bozq> c = new ArrayList();
    Set<bozq> e = new HashSet();
    Set<bozq> f = new HashSet();
    public final List<bpae> g = new ArrayList();
    public int h = 1;

    public bpag(boyt boytVar, cfll cfllVar, bozs bozsVar) {
        this.i = boytVar;
        this.b = bozsVar;
        this.k = cfllVar.e();
        this.j = cfllVar;
        bpaf bpafVar = new bpaf(this);
        this.d = bpafVar;
        cfllVar.c(bpafVar);
    }

    public static void c(akqr akqrVar, Iterable<bozq> iterable) {
        for (bozq bozqVar : iterable) {
            akqs b = bozqVar.d().b();
            akqrVar.d(b.k());
            akqrVar.d(b.j());
        }
    }

    private final boolean m() {
        HashSet hashSet = new HashSet();
        for (bozq bozqVar : this.c) {
            hashSet.addAll(bozqVar.c());
        }
        for (bozq bozqVar2 : this.f) {
            hashSet.addAll(bozqVar2.c());
        }
        for (bozq bozqVar3 : this.e) {
            hashSet.addAll(bozqVar3.c());
        }
        cfll cfllVar = this.j;
        cflq e = cfllVar.e();
        int a2 = boyu.a(cfllVar, boyu.c(e, hashSet), boyu.b(e, hashSet));
        if (a2 == 3) {
            l(6);
        }
        return a2 == 1;
    }

    private final void n() {
        HashSet<cflw> hashSet = new HashSet();
        dcdc<Long> b = this.i.b();
        int size = b.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            dbsg<cflx> b2 = this.k.b(b.get(i).longValue());
            if (b2.a()) {
                if (z) {
                    hashSet.addAll(b2.b().d());
                    z = false;
                } else if (hashSet.isEmpty()) {
                    break;
                } else {
                    hashSet.retainAll(b2.b().d());
                }
            }
        }
        dcen N = dcep.N();
        for (cflw cflwVar : hashSet) {
            N.b(Long.valueOf(cflwVar.a()));
        }
        this.i.e = N.f();
        boyt boytVar = this.i;
        akqr a2 = akqs.a();
        c(a2, this.c);
        boytVar.f = a2.b();
    }

    private final void o(bozq bozqVar) {
        for (bozq bozqVar2 : q(bozqVar, bozqVar.a())) {
            if (bozqVar2.a() == bozqVar.a()) {
                bozqVar2 = bozqVar2.e();
            }
            this.f.add(bozqVar2);
        }
    }

    private final void p(bozq bozqVar) {
        for (bozq bozqVar2 : q(bozqVar, bozqVar.b())) {
            if (bozqVar2.b() == bozqVar.b()) {
                bozqVar2 = bozqVar2.e();
            }
            this.e.add(bozqVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<defpackage.bozq> q(defpackage.bozq r10, long r11) {
        /*
            r9 = this;
            cflq r0 = r9.k
            dcdc r0 = r0.a(r11)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.size()
            r3 = 0
        L10:
            if (r3 >= r2) goto Lbe
            java.lang.Object r4 = r0.get(r3)
            cflx r4 = (defpackage.cflx) r4
            dcdc r5 = r10.c()
            long r6 = r4.a()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto Lba
            boyt r5 = r9.i
            dcep<java.lang.Long> r5 = r5.e
            dcep r6 = r4.d()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L3f
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L3f
            goto L61
        L3f:
            dcep r6 = r4.d()
            dcpd r6 = r6.iterator()
        L47:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lba
            java.lang.Object r7 = r6.next()
            cflw r7 = (defpackage.cflw) r7
            long r7 = r7.a()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            boolean r7 = r5.contains(r7)
            if (r7 == 0) goto L47
        L61:
            long r5 = r4.f()
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 != 0) goto L6b
            r5 = 3
            goto L6c
        L6b:
            r5 = 2
        L6c:
            cflq r6 = r9.k
            bozq r4 = defpackage.bozq.g(r4, r5, r6)
            bozq r5 = r4.e()
            java.util.List<bozq> r6 = r9.c
            boolean r6 = r6.contains(r4)
            if (r6 != 0) goto Lba
            java.util.List<bozq> r6 = r9.c
            boolean r6 = r6.contains(r5)
            if (r6 != 0) goto Lba
            java.util.Set<bozq> r6 = r9.e
            boolean r6 = r6.contains(r4)
            if (r6 != 0) goto Lba
            java.util.Set<bozq> r6 = r9.e
            boolean r6 = r6.contains(r5)
            if (r6 != 0) goto Lba
            java.util.Set<bozq> r6 = r9.f
            boolean r6 = r6.contains(r4)
            if (r6 != 0) goto Lba
            java.util.Set<bozq> r6 = r9.f
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto La7
            goto Lba
        La7:
            boolean r5 = r1.contains(r4)
            if (r5 != 0) goto Lba
            bozq r5 = r4.e()
            boolean r5 = r1.contains(r5)
            if (r5 != 0) goto Lba
            r1.add(r4)
        Lba:
            int r3 = r3 + 1
            goto L10
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpag.q(bozq, long):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01a8, code lost:
        r11 = r11.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpag.a():void");
    }

    public final void b() {
        l(1);
        this.b.e();
        this.e.clear();
        this.f.clear();
    }

    public final void d() {
        for (final bozq bozqVar : this.f) {
            this.b.d(bozqVar, new bozr(this, bozqVar) { // from class: bozz
                private final bpag a;
                private final bozq b;

                {
                    this.a = this;
                    this.b = bozqVar;
                }

                @Override // defpackage.bozr
                public final void a() {
                    bpag bpagVar = this.a;
                    bozq bozqVar2 = this.b;
                    int i = bpagVar.h;
                    if (i != 0) {
                        if (i != 5) {
                            return;
                        }
                        for (bozq bozqVar3 : bpagVar.f) {
                            bpagVar.b.f(bozqVar3);
                        }
                        bpagVar.f.clear();
                        bpagVar.j();
                        bpagVar.h(bozqVar2, true);
                        bpagVar.i();
                        bpagVar.f();
                        return;
                    }
                    throw null;
                }
            });
        }
    }

    public final void e() {
        for (final bozq bozqVar : this.e) {
            this.b.d(bozqVar, new bozr(this, bozqVar) { // from class: bpaa
                private final bpag a;
                private final bozq b;

                {
                    this.a = this;
                    this.b = bozqVar;
                }

                @Override // defpackage.bozr
                public final void a() {
                    bpag bpagVar = this.a;
                    bozq bozqVar2 = this.b;
                    int i = bpagVar.h;
                    if (i != 0) {
                        if (i != 5) {
                            return;
                        }
                        for (bozq bozqVar3 : bpagVar.e) {
                            bpagVar.b.f(bozqVar3);
                        }
                        bpagVar.e.clear();
                        bpagVar.j();
                        bpagVar.h(bozqVar2, false);
                        bpagVar.i();
                        bpagVar.g();
                        return;
                    }
                    throw null;
                }
            });
        }
    }

    public final void f() {
        o(this.c.get(0));
        if (m()) {
            d();
            l(5);
            return;
        }
        this.f.clear();
        l(3);
    }

    public final void g() {
        p((bozq) dcft.s(this.c));
        if (m()) {
            e();
            l(5);
            return;
        }
        this.e.clear();
        l(4);
    }

    public final void h(final bozq bozqVar, boolean z) {
        if (z) {
            this.c.add(0, bozqVar);
            boyt boytVar = this.i;
            boytVar.d.addAll(0, bozqVar.c());
        } else {
            this.c.add(bozqVar);
            this.i.c(bozqVar.c());
        }
        n();
        this.b.a(bozqVar, new bozr(this, bozqVar) { // from class: bpab
            private final bpag a;
            private final bozq b;

            {
                this.a = this;
                this.b = bozqVar;
            }

            @Override // defpackage.bozr
            public final void a() {
                this.a.k(this.b);
            }
        });
    }

    public final void i() {
        if (this.c.size() > 1) {
            final bozq bozqVar = this.c.get(0);
            this.b.b(bozqVar, new bozr(this, bozqVar) { // from class: bpac
                private final bpag a;
                private final bozq b;

                {
                    this.a = this;
                    this.b = bozqVar;
                }

                @Override // defpackage.bozr
                public final void a() {
                    this.a.k(this.b);
                }
            });
            final bozq bozqVar2 = (bozq) dcft.s(this.c);
            this.b.b(bozqVar2, new bozr(this, bozqVar2) { // from class: bpad
                private final bpag a;
                private final bozq b;

                {
                    this.a = this;
                    this.b = bozqVar2;
                }

                @Override // defpackage.bozr
                public final void a() {
                    this.a.k(this.b);
                }
            });
        }
    }

    public final void j() {
        if (this.c.size() > 1) {
            this.b.c(this.c.get(0), (bozq) dcft.s(this.c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(bozq bozqVar) {
        int i = this.h;
        if (i != 0) {
            if (i != 5 || this.c.size() == 1) {
                return;
            }
            j();
            if (bozqVar.equals(this.c.get(0))) {
                for (bozq bozqVar2 : this.f) {
                    this.b.f(bozqVar2);
                }
                this.f.clear();
                this.c.remove(0);
                boyt boytVar = this.i;
                dcdc<Long> c = bozqVar.c();
                if (boytVar.d.size() >= c.size()) {
                    List<Long> subList = boytVar.d.subList(0, c.size());
                    if (subList.equals(c)) {
                        subList.clear();
                    }
                }
                n();
                this.b.f(bozqVar);
                o(this.c.get(0));
                d();
            }
            if (bozqVar.equals(dcft.s(this.c))) {
                for (bozq bozqVar3 : this.e) {
                    this.b.f(bozqVar3);
                }
                this.e.clear();
                List<bozq> list = this.c;
                list.remove(list.size() - 1);
                boyt boytVar2 = this.i;
                dcdc<Long> c2 = bozqVar.c();
                int size = boytVar2.d.size();
                int size2 = c2.size();
                if (size >= size2) {
                    List<Long> subList2 = boytVar2.d.subList(size - size2, size);
                    if (subList2.equals(c2)) {
                        subList2.clear();
                    }
                }
                n();
                this.b.f(bozqVar);
                p((bozq) dcft.s(this.c));
                e();
            }
            i();
            return;
        }
        throw null;
    }

    public final void l(int i) {
        int i2 = this.h;
        if (i2 != 0) {
            if (i2 == i) {
                return;
            }
            this.h = i;
            dcdc r = dcdc.r(this.g);
            int size = r.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((bpae) r.get(i3)).b(i2, i);
            }
            return;
        }
        throw null;
    }
}

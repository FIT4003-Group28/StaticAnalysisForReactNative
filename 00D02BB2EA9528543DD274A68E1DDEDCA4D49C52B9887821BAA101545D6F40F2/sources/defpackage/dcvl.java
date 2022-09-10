package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
/* compiled from: PG */
/* renamed from: dcvl  reason: default package */
/* loaded from: classes5.dex */
public final class dcvl<T> {
    public dcuy a;
    private final dcwg<T> b;
    private int c;
    private boolean d;
    private List<dcvf> e = dchl.a();
    private final PriorityQueue<dcvj> f = new PriorityQueue<>();
    private dcvr<dcwf<T>> g;
    private final ArrayList<dcvf> h;
    private final List<dcvf> i;
    private final dcwf<T>[] j;
    private final PriorityQueue<dcvk<T>> k;
    private dcuz l;

    public dcvl(dcwg<T> dcwgVar) {
        dchl.a();
        this.h = dchl.a();
        dchl.a();
        this.i = dchl.a();
        this.j = new dcwf[12];
        this.k = new PriorityQueue<>();
        this.b = dcwgVar;
        this.c = Integer.MAX_VALUE;
        this.a = dcuy.a;
        this.g = dcwgVar.a();
        boolean z = dcwgVar.a.size() <= 150;
        this.d = z;
        if (!z) {
            this.e.clear();
            this.g.c();
            if (this.g.k()) {
                return;
            }
            dcvr<dcwf<T>> b = this.g.b();
            dcvf f = b.f();
            dcvr<dcwf<T>> b2 = this.g.b();
            b2.b = b2.a.size();
            b2.j();
            dcvf f2 = b2.f();
            if (!b.e(b2)) {
                int s = f.s(f2) + 1;
                dcvf p = f2.p(s);
                for (dcvf p2 = f.p(s); !p2.equals(p) && !b.k(); p2 = p2.r()) {
                    dcvf m = p2.m();
                    if (b.d(m) <= 0) {
                        b.m(m.r());
                        dcvf f3 = b.f();
                        dcvr<dcwf<T>> b3 = b.b();
                        b3.j();
                        c(f, b3.f());
                        f = f3;
                    }
                }
            }
            c(f, f2);
        }
    }

    private final void c(dcvf dcvfVar, dcvf dcvfVar2) {
        this.e.add(dcvfVar.p(dcvfVar.s(dcvfVar2)));
    }

    private final void d(dcwf<T> dcwfVar, dcvi dcviVar) {
        dcwa dcwaVar = dcwfVar.a;
        dcuz dcuzVar = this.l;
        dcuz dcuzVar2 = new dcuz(dcwaVar, dcviVar.a);
        if (dcuzVar2.compareTo(dcuzVar) <= 0) {
            dcuzVar = dcuzVar2;
        }
        if (dcuzVar == this.l) {
            return;
        }
        if (this.k.size() >= this.c) {
            this.k.poll();
        }
        this.k.add(new dcvk<>(dcuzVar, dcwfVar));
        if (this.k.size() < this.c) {
            return;
        }
        this.l = this.k.peek().a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
        if (r7 != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean e(defpackage.dcvf r19, defpackage.dcvr<defpackage.dcwf<T>> r20, boolean r21, defpackage.dcvi r22) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcvl.e(dcvf, dcvr, boolean, dcvi):boolean");
    }

    public final List<dcvk<T>> a(dcwa dcwaVar) {
        ArrayList<dcvf> arrayList;
        dcvi dcviVar = new dcvi(dcwaVar);
        this.l = dcuz.a(this.a);
        if (this.d) {
            this.g.c();
            while (!this.g.k()) {
                d(this.g.g(), dcviVar);
                this.g.i();
            }
        } else {
            if (this.c == 1) {
                this.g.m(dcvf.b(dcviVar.a));
                if (!this.g.k()) {
                    d(this.g.g(), dcviVar);
                }
                if (!this.g.l()) {
                    this.g.j();
                    d(this.g.g(), dcviVar);
                }
            }
            List<dcvf> list = this.e;
            dcxc a = dcxg.a();
            a.d = 4;
            dcxg a2 = a.a();
            if (!this.l.d()) {
                dcvd b = dcvd.b(dcviVar.a, dcuy.d(this.l.f().b + dcyn.a));
                ArrayList<dcvf> arrayList2 = this.h;
                arrayList2.clear();
                dcvb dcvbVar = dcwz.f.d;
                double d = b.d().b;
                int min = Math.min(dcvbVar.a(d + d), 29);
                if (min != 0) {
                    dcvf.b(b.a).u(min, arrayList2);
                } else {
                    Collections.addAll(arrayList2, dcvf.a);
                }
                if (a2.c < 30) {
                    for (int i = 0; i < arrayList2.size(); i++) {
                        dcvf dcvfVar = arrayList2.get(i);
                        int h = dcvfVar.h();
                        int min2 = Math.min(h, a2.c);
                        if (min2 != h) {
                            arrayList2.set(i, dcvfVar.p(min2));
                        }
                    }
                }
                dcvg.f(arrayList2);
                while (arrayList2.size() > a2.e) {
                    int i2 = 0;
                    int i3 = -1;
                    int i4 = -1;
                    while (true) {
                        int i5 = i2 + 1;
                        if (i5 >= arrayList2.size()) {
                            break;
                        }
                        int s = arrayList2.get(i2).s(arrayList2.get(i5));
                        int i6 = s > i3 ? s : i3;
                        if (s > i3) {
                            i4 = i2;
                        }
                        i2 = i5;
                        i3 = i6;
                    }
                    if (i3 < a2.b) {
                        break;
                    }
                    arrayList2.set(i4, arrayList2.get(i4).p(i3));
                    dcvg.f(arrayList2);
                }
                if (a2.b > 0) {
                    dcvg dcvgVar = new dcvg();
                    dcvgVar.a(arrayList2);
                    dcvgVar.e(a2.b, arrayList2);
                }
                ArrayList<dcvf> arrayList3 = this.h;
                List<dcvf> list2 = this.i;
                list2.clear();
                int i7 = 0;
                int i8 = 0;
                while (i7 < list.size() && i8 < arrayList3.size()) {
                    dcvf dcvfVar2 = list.get(i7);
                    dcvf l = dcvfVar2.l();
                    dcvf dcvfVar3 = arrayList3.get(i8);
                    dcvf l2 = dcvfVar3.l();
                    if (!l.I(l2)) {
                        if (!l2.I(l)) {
                            arrayList = arrayList3;
                            if (dcvf.E(dcvfVar2.b, dcvfVar3.b)) {
                                list2.add(dcvfVar2);
                                i7++;
                            } else {
                                list2.add(dcvfVar3);
                                i8++;
                            }
                        } else if (dcvfVar3.J(dcvfVar2.m())) {
                            list2.add(dcvfVar3);
                            i8++;
                        } else {
                            i7 = dcvg.c(list, l2, i7 + 1);
                            int i9 = i7 - 1;
                            if (dcvfVar3.J(list.get(i9).m())) {
                                arrayList = arrayList3;
                                i7 = i9;
                            }
                        }
                        arrayList3 = arrayList;
                    } else if (dcvfVar2.J(dcvfVar3.m())) {
                        list2.add(dcvfVar2);
                        i7++;
                    } else {
                        i8 = dcvg.c(arrayList3, l, i8 + 1);
                        int i10 = i8 - 1;
                        if (dcvfVar2.J(arrayList3.get(i10).m())) {
                            i8 = i10;
                        }
                    }
                    arrayList = arrayList3;
                    arrayList3 = arrayList;
                }
                list = this.i;
            }
            this.g.c();
            for (int i11 = 0; i11 < list.size() && !this.g.k(); i11++) {
                dcvf dcvfVar4 = list.get(i11);
                e(dcvfVar4, this.g, this.g.d(dcvfVar4.l()) <= 0, dcviVar);
            }
            while (true) {
                if (this.f.isEmpty()) {
                    break;
                }
                dcvj poll = this.f.poll();
                if (poll.a.compareTo(this.l) < 0) {
                    dcvf q = poll.b.q();
                    int i12 = 0;
                    boolean z = true;
                    while (i12 < 4) {
                        z = e(q, this.g, z, dcviVar);
                        i12++;
                        q = q.r();
                    }
                } else {
                    this.f.clear();
                    break;
                }
            }
        }
        int size = this.k.size();
        ArrayList f = dchl.f(size);
        f.addAll(Collections.nCopies(size, null));
        int i13 = size;
        while (true) {
            int i14 = size - 1;
            if (size > 0) {
                i13--;
                f.set(i13, this.k.poll());
                size = i14;
            } else {
                return f;
            }
        }
    }

    public final dcvk<T> b(dcwa dcwaVar) {
        dbsk.b(true, "Must be at least 1.");
        this.c = 1;
        return (dcvk) dcft.d(a(dcwaVar), null);
    }
}

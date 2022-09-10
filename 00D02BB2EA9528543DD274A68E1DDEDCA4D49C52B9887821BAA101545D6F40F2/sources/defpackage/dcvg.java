package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: dcvg  reason: default package */
/* loaded from: classes5.dex */
public final class dcvg implements Iterable<dcvf>, Serializable, dcxa {
    private static final long serialVersionUID = 1;
    public ArrayList<dcvf> a = new ArrayList<>();

    public static int c(List<dcvf> list, dcvf dcvfVar, int i) {
        int size = list.size() - 1;
        while (i <= size) {
            int i2 = (i + size) >> 1;
            int compareTo = list.get(i2).compareTo(dcvfVar);
            if (compareTo < 0) {
                i = i2 + 1;
            } else if (compareTo <= 0) {
                return i2;
            } else {
                size = i2 - 1;
            }
        }
        return i;
    }

    public static void f(List<dcvf> list) {
        Collections.sort(list);
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            dcvf dcvfVar = list.get(i2);
            if (i <= 0 || !list.get(i - 1).n(dcvfVar)) {
                while (i > 0) {
                    int i3 = i - 1;
                    if (!dcvfVar.n(list.get(i3))) {
                        break;
                    }
                    i = i3;
                }
                while (i >= 3) {
                    int i4 = i - 3;
                    int i5 = i - 2;
                    int i6 = i - 1;
                    if (((list.get(i4).b ^ list.get(i5).b) ^ list.get(i6).b) != dcvfVar.b) {
                        break;
                    }
                    long A = dcvfVar.A();
                    long j = A + A;
                    long j2 = (j + (j + j)) ^ (-1);
                    long j3 = dcvfVar.b & j2;
                    if ((list.get(i4).b & j2) != j3 || (list.get(i5).b & j2) != j3 || (list.get(i6).b & j2) != j3 || dcvfVar.k()) {
                        break;
                    }
                    dcvfVar = dcvfVar.o();
                    i = i4;
                }
                list.set(i, dcvfVar);
                i++;
            }
        }
        int size = list.size();
        while (i < size) {
            size--;
            list.remove(size);
        }
    }

    public final void a(List<dcvf> list) {
        this.a = new ArrayList<>(list);
        list.clear();
    }

    public final int b() {
        return this.a.size();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        dcvg dcvgVar = new dcvg();
        dcvgVar.a = dchl.c(this.a);
        return dcvgVar;
    }

    public final void d() {
        f(this.a);
    }

    public final void e(int i, ArrayList<dcvf> arrayList) {
        arrayList.clear();
        arrayList.ensureCapacity(b());
        Iterator<dcvf> it = iterator();
        while (it.hasNext()) {
            dcvf next = it.next();
            int h = next.h();
            int max = Math.max(i, h);
            if (max != h) {
                long j = next.b;
                dcvf dcvfVar = new dcvf(j + Long.lowestOneBit(j) + dcvf.B(max));
                for (dcvf dcvfVar2 = new dcvf(dcvf.N(next.b, max)); !dcvfVar2.equals(dcvfVar); dcvfVar2 = dcvfVar2.r()) {
                    arrayList.add(dcvfVar2);
                }
            } else {
                arrayList.add(next);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dcvg)) {
            return false;
        }
        return this.a.equals(((dcvg) obj).a);
    }

    @Override // defpackage.dcxa
    public final boolean h(dcwa dcwaVar) {
        dcvf b = dcvf.b(dcwaVar);
        int binarySearch = Collections.binarySearch(this.a, b);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        if (binarySearch >= this.a.size() || !this.a.get(binarySearch).l().J(b)) {
            return binarySearch != 0 && this.a.get(binarySearch + (-1)).m().K(b);
        }
        return true;
    }

    public final int hashCode() {
        Iterator<dcvf> it = iterator();
        int i = 17;
        while (it.hasNext()) {
            i = (i * 37) + it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator<dcvf> iterator() {
        return this.a.iterator();
    }
}

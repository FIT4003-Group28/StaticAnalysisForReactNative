package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: bkt  reason: default package */
/* loaded from: classes3.dex */
public final class bkt implements bku, bkr {
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List<bku> d = new ArrayList();
    private final bmx e;

    public bkt(bmx bmxVar) {
        this.e = bmxVar;
    }

    private final void a(Path.Op op) {
        this.b.reset();
        this.a.reset();
        int size = this.d.size();
        while (true) {
            size--;
            if (size <= 0) {
                break;
            }
            bku bkuVar = this.d.get(size);
            if (bkuVar instanceof bkl) {
                bkl bklVar = (bkl) bkuVar;
                List<bku> h = bklVar.h();
                int size2 = h.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        Path j = h.get(size2).j();
                        j.transform(bklVar.i());
                        this.b.addPath(j);
                    }
                }
            } else {
                this.b.addPath(bkuVar.j());
            }
        }
        bku bkuVar2 = this.d.get(0);
        if (bkuVar2 instanceof bkl) {
            bkl bklVar2 = (bkl) bkuVar2;
            List<bku> h2 = bklVar2.h();
            for (int i = 0; i < h2.size(); i++) {
                Path j2 = h2.get(i).j();
                j2.transform(bklVar2.i());
                this.a.addPath(j2);
            }
        } else {
            this.a.set(bkuVar2.j());
        }
        this.c.op(this.a, this.b, op);
    }

    @Override // defpackage.bkk
    public final void b(List<bkk> list, List<bkk> list2) {
        for (int i = 0; i < this.d.size(); i++) {
            this.d.get(i).b(list, list2);
        }
    }

    @Override // defpackage.bkk
    public final String g() {
        throw null;
    }

    @Override // defpackage.bkr
    public final void h(ListIterator<bkk> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            bkk previous = listIterator.previous();
            if (previous instanceof bku) {
                this.d.add((bku) previous);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.bku
    public final Path j() {
        this.c.reset();
        bmx bmxVar = this.e;
        if (bmxVar.a) {
            return this.c;
        }
        int i = bmxVar.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                this.c.addPath(this.d.get(i3).j());
            }
        } else if (i2 == 1) {
            a(Path.Op.UNION);
        } else if (i2 == 2) {
            a(Path.Op.REVERSE_DIFFERENCE);
        } else if (i2 == 3) {
            a(Path.Op.INTERSECT);
        } else if (i2 == 4) {
            a(Path.Op.XOR);
        }
        return this.c;
    }
}

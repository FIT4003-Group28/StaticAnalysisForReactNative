package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: byl  reason: default package */
/* loaded from: classes2.dex */
public final class byl implements bym, byj {
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List d = new ArrayList();
    private final cas e;

    public byl(cas casVar) {
        this.e = casVar;
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
            bym bymVar = (bym) this.d.get(size);
            if (bymVar instanceof byd) {
                byd bydVar = (byd) bymVar;
                List j = bydVar.j();
                int size2 = j.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        Path i = ((bym) j.get(size2)).i();
                        i.transform(bydVar.h());
                        this.b.addPath(i);
                    }
                }
            } else {
                this.b.addPath(bymVar.i());
            }
        }
        bym bymVar2 = (bym) this.d.get(0);
        if (bymVar2 instanceof byd) {
            byd bydVar2 = (byd) bymVar2;
            List j2 = bydVar2.j();
            for (int i2 = 0; i2 < j2.size(); i2++) {
                Path i3 = ((bym) j2.get(i2)).i();
                i3.transform(bydVar2.h());
                this.a.addPath(i3);
            }
        } else {
            this.a.set(bymVar2.i());
        }
        this.c.op(this.a, this.b, op);
    }

    @Override // defpackage.byc
    public final void f(List list, List list2) {
        for (int i = 0; i < this.d.size(); i++) {
            ((bym) this.d.get(i)).f(list, list2);
        }
    }

    @Override // defpackage.byc
    public final String g() {
        throw null;
    }

    @Override // defpackage.byj
    public final void h(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            byc bycVar = (byc) listIterator.previous();
            if (bycVar instanceof bym) {
                this.d.add((bym) bycVar);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.bym
    public final Path i() {
        this.c.reset();
        cas casVar = this.e;
        if (casVar.a) {
            return this.c;
        }
        int i = casVar.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                this.c.addPath(((bym) this.d.get(i3)).i());
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

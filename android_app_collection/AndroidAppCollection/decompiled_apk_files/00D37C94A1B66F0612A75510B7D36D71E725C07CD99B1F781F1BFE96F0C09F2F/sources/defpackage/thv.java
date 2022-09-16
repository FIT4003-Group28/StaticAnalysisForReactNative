package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: thv  reason: default package */
/* loaded from: classes4.dex */
public final class thv extends lg {
    final /* synthetic */ thz a;

    public thv(thz thzVar) {
        this.a = thzVar;
    }

    private final void r(int i) {
        int size = this.a.j.size();
        int i2 = -1;
        if (size > 0) {
            i2 = ((thx) this.a.j.get(size - 1)).a;
        }
        Object item = ((ajsf) this.a.p.a).getItem(i);
        ajhi ajhiVar = item != null ? (ajhi) this.a.a.get(item.getClass()) : null;
        if (i <= i2) {
            int b = this.a.b(i);
            for (int i3 = b; i3 < this.a.j.size(); i3++) {
                ((thx) this.a.j.get(i3)).a++;
            }
            if (ajhiVar != null) {
                this.a.j.add(b, new thx(i, ajhiVar, item));
            }
        } else if (ajhiVar != null) {
            this.a.j.add(new thx(i, ajhiVar, item));
        }
        this.a.s = true;
        thz thzVar = this.a;
        int i4 = thzVar.n;
        if (i <= i4) {
            thzVar.n = i4 + 1;
        }
        int i5 = thzVar.o;
        if (i <= i5) {
            thzVar.o = i5 + 1;
        }
    }

    private final void s(int i) {
        this.a.s = true;
        thz thzVar = this.a;
        int i2 = thzVar.n;
        if (i < i2) {
            thzVar.n = i2 - 1;
        }
        int i3 = thzVar.o;
        if (i < i3) {
            thzVar.o = i3 - 1;
        }
        int size = thzVar.j.size();
        if (i > (size > 0 ? ((thx) this.a.j.get(size - 1)).a : -1)) {
            return;
        }
        int b = this.a.b(i);
        thx thxVar = (thx) this.a.j.get(b);
        if (thxVar.a == i) {
            this.a.j.remove(b);
            if (thxVar.b) {
                thxVar.c.b();
            }
        }
        while (b < this.a.j.size()) {
            thx thxVar2 = (thx) this.a.j.get(b);
            thxVar2.a--;
            b++;
        }
    }

    @Override // defpackage.lg
    public final void c() {
        ArrayList arrayList = this.a.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            thx thxVar = (thx) arrayList.get(i);
            if (thxVar.b) {
                thxVar.c.b();
                thxVar.b = false;
            }
        }
        this.a.j.clear();
        f(0, this.a.b.b());
        thz thzVar = this.a;
        thzVar.n = -1;
        thzVar.o = -1;
        thzVar.c();
    }

    @Override // defpackage.lg
    public final void d(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            s(i4);
            r(i4);
        }
        this.a.c();
    }

    @Override // defpackage.lg
    public final void e(int i, int i2, Object obj) {
        d(i, i2);
    }

    @Override // defpackage.lg
    public final void f(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            r(i + i3);
        }
        this.a.c();
    }

    @Override // defpackage.lg
    public final void g(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            s(i);
        }
        this.a.c();
    }

    @Override // defpackage.lg
    public final void h(int i, int i2) {
        for (int i3 = 0; i3 <= 0; i3++) {
            s(i);
        }
        for (int i4 = 0; i4 <= 0; i4++) {
            r(i2 + i4);
        }
        this.a.c();
    }
}

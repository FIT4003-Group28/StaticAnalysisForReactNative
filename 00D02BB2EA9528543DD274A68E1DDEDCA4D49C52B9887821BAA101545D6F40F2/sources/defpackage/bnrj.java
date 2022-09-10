package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bnrj  reason: default package */
/* loaded from: classes3.dex */
public final class bnrj implements bnsa {
    private static final bnvo p = new bnvo(0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final bnro h;
    public final boolean i;
    @dzsi
    public ArrayList<bvok> k;
    @dzsi
    public ArrayList<bvpa> l;
    @dzsi
    bntb a = null;
    public boolean j = false;
    public ArrayList<bntc> m = new ArrayList<>();
    public ArrayList<bntc> n = new ArrayList<>();
    public ArrayList<Integer> o = new ArrayList<>();

    public bnrj(int i, int i2, int i3, ArrayList<bvok> arrayList, ArrayList<bvpa> arrayList2, bnro bnroVar, boolean z, bnum bnumVar) {
        int i4;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = 1073741824 >> i3;
        this.f = (i * i4) - 536870912;
        this.g = -((i4 * (i2 + 1)) - 536870912);
        this.h = bnroVar;
        this.i = z;
        this.k = arrayList;
        this.l = arrayList2;
        int size = arrayList.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += arrayList.get(i6).b / 4;
        }
        int size2 = arrayList2.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size2; i8++) {
            i7 += arrayList2.get(i8).b;
        }
        bnumVar.c++;
        bnumVar.a += (i5 * 16) + i7 + i7;
    }

    @Override // defpackage.bnsa
    public final bnuo B() {
        return bnuo.BUILDING_PASS;
    }

    @Override // defpackage.bnsa
    public final boolean C() {
        return true;
    }

    @Override // defpackage.bnsa
    @dzsi
    public final bnvl D(int i) {
        throw null;
    }

    @Override // defpackage.bnsa
    public final void E(boolean z) {
        if (!F()) {
            return;
        }
        bntb bntbVar = this.a;
        dbsk.s(bntbVar);
        if (!z) {
            ArrayList<bntc> arrayList = this.m;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bntbVar.u(arrayList.get(i));
            }
            ArrayList<bntc> arrayList2 = this.n;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bntbVar.u(arrayList2.get(i2));
            }
        }
        this.m.clear();
        this.n.clear();
    }

    @Override // defpackage.bnsa
    public final boolean F() {
        return this.a != null;
    }

    @Override // defpackage.bnsa
    public final bnvo G() {
        return p;
    }

    @Override // defpackage.bnsa
    public final void a(long j) {
        bnro bnroVar = this.h;
        if (!bnroVar.f) {
            bnroVar.h = 1.0f;
            return;
        }
        float f = (((float) j) - bnroVar.g) / 500.0f;
        bnroVar.h = f;
        if (f <= 1.0f) {
            return;
        }
        bnroVar.h = 1.0f;
    }

    @Override // defpackage.bnsa
    public final void b(@dzsi bnsa bnsaVar, @dzsi bnsa bnsaVar2, bnrr bnrrVar) {
    }

    @Override // defpackage.bnsa
    public final int h() {
        return this.d;
    }

    @Override // defpackage.bnsa
    public final bnrz i() {
        return bnti.a;
    }

    @Override // defpackage.bnsa
    public final void n(boolean z) {
        this.j = z;
    }

    @Override // defpackage.bnsa
    public final bnrw o() {
        return bnrw.e;
    }

    @Override // defpackage.bnsa
    public final void p() {
    }

    @Override // defpackage.bnsa
    public final String q() {
        return "building";
    }

    @Override // defpackage.bnsa
    @dzsi
    public final bnuk x() {
        return null;
    }

    @Override // defpackage.bnsa
    public final boolean y() {
        return true;
    }

    @Override // defpackage.bnsa
    public final void z(bntb bntbVar) {
        if (F()) {
            return;
        }
        ArrayList<bvok> arrayList = this.k;
        ArrayList<bvpa> arrayList2 = this.l;
        if (arrayList == null || arrayList2 == null) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            bvok bvokVar = arrayList.get(i);
            bvpa bvpaVar = arrayList2.get(i);
            if (bvokVar.b != 0) {
                this.a = bntbVar;
                bntc s = bntbVar.s("building");
                this.a.v(s);
                this.a.P(bvokVar.a, bvokVar.b);
                bntc t = this.a.t("building");
                this.a.x(t);
                this.a.K(bvpaVar.a, bvpaVar.b, 35044);
                this.m.add(s);
                this.n.add(t);
                this.o.add(Integer.valueOf(bvpaVar.b));
            }
        }
        this.k = null;
        this.l = null;
    }
}

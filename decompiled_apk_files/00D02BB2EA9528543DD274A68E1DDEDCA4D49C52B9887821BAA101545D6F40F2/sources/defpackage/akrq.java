package defpackage;
/* compiled from: PG */
/* renamed from: akrq  reason: default package */
/* loaded from: classes.dex */
public abstract class akrq implements akqd {
    private static final dcqe a = dcqe.c("akrq");

    @Override // defpackage.akqd
    public akrp i() {
        int i = x(0).a;
        int i2 = x(0).b;
        int i3 = i;
        int i4 = i3;
        int i5 = i2;
        for (int i6 = 1; i6 < w(); i6++) {
            i3 = Math.min(i3, x(i6).a);
            i4 = Math.max(i4, x(i6).a);
            i2 = Math.min(i2, x(i6).b);
            i5 = Math.max(i5, x(i6).b);
        }
        return new akrp(new akra(i3, i2), new akra(i4, i5));
    }

    @Override // defpackage.akqd
    public abstract boolean j(akra akraVar);

    @Override // defpackage.akqd
    public boolean k(akrq akrqVar) {
        if (akrqVar == null || akrqVar.x(0) == null) {
            bvoo.h("Tried to intersect null region, or region with null vertex.", new Object[0]);
            return false;
        } else if (!u(akrqVar)) {
            return false;
        } else {
            return j(akrqVar.x(0)) || akrqVar.j(x(0)) || v(akrqVar);
        }
    }

    public boolean l(akrq akrqVar) {
        if (u(akrqVar)) {
            for (int i = 0; i < 4; i++) {
                if (!j(akrqVar.x(i))) {
                    return false;
                }
            }
            if (!v(akrqVar)) {
                return true;
            }
        }
        return false;
    }

    final boolean u(akrq akrqVar) {
        int i = x(0).a;
        int i2 = x(0).b;
        int i3 = i2;
        int i4 = i;
        for (int i5 = 1; i5 < w(); i5++) {
            i = Math.min(i, x(i5).a);
            i4 = Math.max(i4, x(i5).a);
            i2 = Math.min(i2, x(i5).b);
            i3 = Math.max(i3, x(i5).b);
        }
        int i6 = akrqVar.x(0).a;
        int i7 = akrqVar.x(0).b;
        int i8 = i7;
        int i9 = i6;
        for (int i10 = 1; i10 < akrqVar.w(); i10++) {
            i9 = Math.min(i9, akrqVar.x(i10).a);
            i6 = Math.max(i6, akrqVar.x(i10).a);
            i7 = Math.min(i7, akrqVar.x(i10).b);
            i8 = Math.max(i8, akrqVar.x(i10).b);
        }
        return i <= i6 && i2 <= i8 && i4 >= i9 && i3 >= i7;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean v(akrq akrqVar) {
        int w = w();
        int w2 = akrqVar.w();
        if (w != 0 && w2 != 0) {
            akra y = y();
            akra y2 = akrqVar.y();
            int i = 0;
            while (i < w) {
                akra x = x(i);
                akra akraVar = y2;
                int i2 = 0;
                while (i2 < w2) {
                    akra x2 = akrqVar.x(i2);
                    if (akrb.c(y, x, akraVar, x2)) {
                        return true;
                    }
                    i2++;
                    akraVar = x2;
                }
                i++;
                y = x;
            }
        }
        return false;
    }

    public abstract int w();

    public abstract akra x(int i);

    public akra y() {
        return x(w() - 1);
    }
}

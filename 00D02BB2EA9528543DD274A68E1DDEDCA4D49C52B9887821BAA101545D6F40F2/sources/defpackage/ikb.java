package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ikb  reason: default package */
/* loaded from: classes6.dex */
public final class ikb {
    private final iki a;

    public ikb(iki ikiVar) {
        this.a = ikiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean d(int i, int i2) {
        return i < i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i, int i2, ikc ikcVar) {
        dbsk.s(ikcVar);
        iki ikiVar = this.a;
        float f = (i2 - i) / (ikiVar.f - ikiVar.e);
        if (c(i, i2) && f >= 0.05f) {
            if (ikc.MIN.equals(ikcVar)) {
                return i;
            }
            if (ikc.MAX.equals(ikcVar)) {
                return i2;
            }
        }
        if (ikc.MIN.equals(ikcVar)) {
            return decl.h(i, this.a.e, i2 - b());
        }
        if (!ikc.MAX.equals(ikcVar)) {
            return -1;
        }
        return decl.h(i2, i + b(), this.a.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        iki ikiVar = this.a;
        return (int) (((ikiVar.f - ikiVar.e) * 5) / 100.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(int i, int i2) {
        if (i < i2) {
            iki ikiVar = this.a;
            return i >= ikiVar.e && i2 <= ikiVar.f;
        }
        return false;
    }
}

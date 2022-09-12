package defpackage;
/* compiled from: PG */
/* renamed from: dabr  reason: default package */
/* loaded from: classes5.dex */
public final class dabr implements dabg {
    public final dabi a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public dabr(dact dactVar) {
        if (dactVar.a == 1) {
            this.a = dactVar.g;
            this.b = dactVar.e;
            this.c = dactVar.d;
            this.d = c(dactVar.b);
            this.e = d(dactVar.c);
            this.f = e(dactVar.c);
            return;
        }
        throw new IllegalArgumentException("Only CIRCULAR type ProgressIndicatorSpec can be converted into CircularProgressIndicatorSpec.");
    }

    public static int c(boolean z) {
        return z ? 1 : 0;
    }

    public static int d(int i) {
        if (i != 1) {
            return i != 2 ? 0 : 1;
        }
        return 2;
    }

    public static int e(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    @Override // defpackage.dabg
    public final boolean a() {
        return this.e != 0;
    }

    @Override // defpackage.dabg
    public final boolean b() {
        return this.f != 0;
    }
}

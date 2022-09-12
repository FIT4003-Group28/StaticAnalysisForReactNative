package defpackage;
/* compiled from: PG */
/* renamed from: daco  reason: default package */
/* loaded from: classes5.dex */
public final class daco implements dabg {
    public final dabi a;
    public int b;
    public int c;
    public int d;
    public boolean e;

    public daco(dact dactVar) {
        if (dactVar.a == 0) {
            this.a = dactVar.g;
            boolean z = dactVar.f;
            this.b = c(dactVar.b);
            this.c = d(dactVar.c);
            this.d = e(dactVar.c);
            this.e = 1 != this.b ? false : true;
            return;
        }
        throw new IllegalArgumentException("Only LINEAR type ProgressIndicatorSpec can be converted into LinearProgressIndicatorSpec");
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
        return this.c != 0;
    }

    @Override // defpackage.dabg
    public final boolean b() {
        return this.d != 0;
    }
}

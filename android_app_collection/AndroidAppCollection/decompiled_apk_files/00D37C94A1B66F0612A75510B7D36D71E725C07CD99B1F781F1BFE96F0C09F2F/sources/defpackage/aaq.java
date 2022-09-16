package defpackage;
/* compiled from: PG */
/* renamed from: aaq  reason: default package */
/* loaded from: classes.dex */
final class aaq {
    int a = 0;
    int b;
    int c;
    int d;
    int e;

    static final int e(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 2 : 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        this.a = i | this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        int i = this.a;
        if ((i & 7) == 0 || (i & e(this.d, this.b)) != 0) {
            int i2 = this.a;
            if ((i2 & 112) != 0 && (i2 & (e(this.d, this.c) << 4)) == 0) {
                return false;
            }
            int i3 = this.a;
            if ((i3 & 1792) != 0 && (i3 & (e(this.e, this.b) << 8)) == 0) {
                return false;
            }
            int i4 = this.a;
            return (i4 & 28672) == 0 || (i4 & (e(this.e, this.c) << 12)) != 0;
        }
        return false;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: pwk  reason: default package */
/* loaded from: classes4.dex */
final class pwk {
    public final int a;
    public final int b;

    public pwk(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        int i = this.b;
        if (i != 2) {
            if (i == 5) {
                return 11;
            }
            if (i == 29) {
                return 12;
            }
            if (i == 42) {
                return 16;
            }
            if (i == 22) {
                return 1073741824;
            }
            return i != 23 ? 0 : 15;
        }
        return 10;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: mrw  reason: default package */
/* loaded from: classes3.dex */
final class mrw extends wj {
    private final int c;

    public mrw(int i) {
        this.c = i;
    }

    @Override // defpackage.wj
    public final int a(int i, int i2) {
        if (i == 0) {
            return 0;
        }
        return (i - 1) % i2;
    }

    @Override // defpackage.wj
    public final int b(int i) {
        if (i == 0) {
            return this.c;
        }
        return 1;
    }

    @Override // defpackage.wj
    public final int c(int i, int i2) {
        if (i == 0) {
            return 0;
        }
        return ((i - 1) / i2) + 1;
    }
}

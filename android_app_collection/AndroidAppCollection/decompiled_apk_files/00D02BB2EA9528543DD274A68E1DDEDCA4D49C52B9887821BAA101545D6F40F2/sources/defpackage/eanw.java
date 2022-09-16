package defpackage;
/* compiled from: PG */
/* renamed from: eanw  reason: default package */
/* loaded from: classes6.dex */
public final class eanw extends eanz {
    public static final eanw a = new eanw("", 0, 0);
    final int b;

    public eanw(String str, int i, int i2) {
        super(str, i);
        this.b = i2;
    }

    @Override // defpackage.eanz
    public final boolean a(int i) {
        return i == this.b;
    }

    @Override // defpackage.eanz
    public final boolean b(int i, int i2) {
        return i == this.b && i2 == 0;
    }

    @Override // defpackage.eanz
    public final boolean c(int[] iArr, int i) {
        return i == 1 && iArr[0] == this.b;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: eanx  reason: default package */
/* loaded from: classes6.dex */
public final class eanx extends eanz {
    final int a;
    final int b;

    public eanx(String str, int i, int i2, int i3) {
        super(str, i);
        this.a = i2;
        this.b = i3;
    }

    @Override // defpackage.eanz
    public final boolean a(int i) {
        return false;
    }

    @Override // defpackage.eanz
    public final boolean b(int i, int i2) {
        return i == this.a && i2 == this.b;
    }

    @Override // defpackage.eanz
    public final boolean c(int[] iArr, int i) {
        return i == 2 && iArr[0] == this.a && iArr[1] == this.b;
    }
}

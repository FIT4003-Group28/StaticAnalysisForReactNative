package defpackage;
/* compiled from: PG */
/* renamed from: eany  reason: default package */
/* loaded from: classes6.dex */
public final class eany extends eanz {
    final int a;
    final int b;
    final int c;

    public eany(String str, int i, int i2, int i3, int i4) {
        super(str, i);
        this.a = i2;
        this.b = i3;
        this.c = i4;
    }

    @Override // defpackage.eanz
    public final boolean a(int i) {
        return false;
    }

    @Override // defpackage.eanz
    public final boolean b(int i, int i2) {
        return false;
    }

    @Override // defpackage.eanz
    public final boolean c(int[] iArr, int i) {
        return i == 3 && iArr[0] == this.a && iArr[1] == this.b && iArr[2] == this.c;
    }
}

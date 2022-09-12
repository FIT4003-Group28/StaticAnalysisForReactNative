package defpackage;
/* compiled from: PG */
/* renamed from: dyyl  reason: default package */
/* loaded from: classes6.dex */
public final class dyyl {
    public int a;
    public final int[] b = new int[10];

    public final boolean a(int i) {
        return ((1 << i) & this.a) != 0;
    }

    public final int b(int i) {
        return this.b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c() {
        if ((this.a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    public final void d(int i, int i2) {
        if (i >= 10) {
            return;
        }
        this.a |= 1 << i;
        this.b[i] = i2;
    }
}

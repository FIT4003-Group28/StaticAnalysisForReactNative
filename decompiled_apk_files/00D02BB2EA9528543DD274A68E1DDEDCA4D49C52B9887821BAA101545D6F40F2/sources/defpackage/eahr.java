package defpackage;
/* compiled from: PG */
/* renamed from: eahr  reason: default package */
/* loaded from: classes6.dex */
public final class eahr {
    public int a;
    public final int[] b = new int[10];

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(int i) {
        return ((1 << i) & this.a) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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

    public final int d() {
        if ((this.a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, int i2) {
        if (i < 0 || i >= 10) {
            return;
        }
        this.a |= 1 << i;
        this.b[i] = i2;
    }
}

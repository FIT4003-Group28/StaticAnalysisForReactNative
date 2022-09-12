package defpackage;
/* compiled from: PG */
/* renamed from: eahn  reason: default package */
/* loaded from: classes6.dex */
final class eahn {
    final eahn[] a;
    final int b;
    final int c;

    public eahn() {
        this.a = new eahn[256];
        this.b = 0;
        this.c = 0;
    }

    public eahn(int i, int i2) {
        this.a = null;
        this.b = i;
        int i3 = i2 & 7;
        this.c = i3 == 0 ? 8 : i3;
    }
}

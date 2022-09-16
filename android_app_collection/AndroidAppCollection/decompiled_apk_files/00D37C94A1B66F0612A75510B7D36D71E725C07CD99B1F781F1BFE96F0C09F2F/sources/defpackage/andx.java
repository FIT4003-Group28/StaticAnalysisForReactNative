package defpackage;
/* compiled from: PG */
/* renamed from: andx  reason: default package */
/* loaded from: classes.dex */
public final class andx extends anhe {
    public int a;
    public long b;
    public int c = 0;
    public boolean d = false;
    private int e;

    public andx(int i) {
        this.a = i;
    }

    public final void a(int i, long j) {
        long j2;
        long j3 = this.b;
        int i2 = this.e;
        this.b = ((j & 4294967295L) << i2) | j3;
        int i3 = i2 + (i * 8);
        this.e = i3;
        this.c += i;
        if (i3 >= 32) {
            this.a = (Integer.rotateLeft(andy.a((int) j2) ^ this.a, 13) * 5) - 430675100;
            this.b >>>= 32;
            this.e -= 32;
        }
    }

    @Override // defpackage.anhe
    public final void b(int i) {
        a(4, i);
    }
}

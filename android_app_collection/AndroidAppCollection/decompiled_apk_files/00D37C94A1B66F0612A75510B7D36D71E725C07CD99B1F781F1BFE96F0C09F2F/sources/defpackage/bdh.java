package defpackage;
/* compiled from: PG */
/* renamed from: bdh  reason: default package */
/* loaded from: classes2.dex */
final class bdh {
    public final bab a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public bdh(bab babVar) {
        this.a = babVar;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.c) {
            int i3 = this.f;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f = i3 + (i2 - i);
                return;
            }
            this.d = ((bArr[i4] & 192) >> 6) == 0;
            this.c = false;
        }
    }
}

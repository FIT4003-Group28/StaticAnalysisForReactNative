package defpackage;
/* compiled from: PG */
/* renamed from: anad  reason: default package */
/* loaded from: classes.dex */
public final class anad {
    private byte[] a;
    private int b;
    private boolean c = true;

    public anad() {
        dbsk.b(true, "Invalid length");
        byte[] bArr = new byte[0];
        this.a = bArr;
        c(bArr.length);
    }

    public final synchronized byte[] a() {
        dbsk.m(!this.c, "GrowableByteArray has been released");
        return this.a;
    }

    public final synchronized int b() {
        return this.b;
    }

    public final synchronized void c(int i) {
        dbsk.b(true, "Invalid length");
        dbsk.m(this.c, "GrowableByteArray has not been released");
        this.c = false;
        this.b = i;
        if (i > this.a.length) {
            this.a = new byte[i];
        }
    }

    public final synchronized void d() {
        this.c = true;
    }

    public final synchronized void e(int i) {
        dbsk.b(i >= 0, "Invalid length");
        byte[] bArr = this.a;
        if (bArr.length >= i) {
            this.b = i;
            return;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(this.b, i));
        this.b = i;
        this.a = bArr2;
    }
}

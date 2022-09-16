package defpackage;
/* compiled from: PG */
/* renamed from: axgz  reason: default package */
/* loaded from: classes2.dex */
public class axgz {
    public int a;
    public int b;

    public axgz() {
        this.a = 0;
        this.b = 0;
    }

    public synchronized int a() {
        return this.a;
    }

    public final synchronized int b() {
        return this.b;
    }

    public void c(int i) {
    }

    public synchronized void d(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public axgz(byte[] bArr) {
        byte b = bArr[0];
        byte b2 = bArr[1];
        if (b == 3) {
            this.a = 3;
        } else if (b == 4) {
            this.a = 4;
        } else {
            StringBuilder sb = new StringBuilder(46);
            sb.append("The address type is illegal. Value:");
            sb.append((int) b);
            throw new IllegalArgumentException(sb.toString());
        }
        if (b2 == 2) {
            this.b = 2;
        } else if (b2 == 3) {
            this.b = 3;
        } else if (b2 == 4) {
            this.b = 4;
        } else {
            StringBuilder sb2 = new StringBuilder(44);
            sb2.append("The score type is illegal. Value:");
            sb2.append((int) b2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}

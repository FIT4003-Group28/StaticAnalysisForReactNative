package defpackage;
/* compiled from: PG */
/* renamed from: dmvn  reason: default package */
/* loaded from: classes.dex */
public final class dmvn {
    private byte[] a;
    private int b;
    private int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.a = dmvw.o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = this.b; i < this.b + this.c; i++) {
            int i2 = this.a[i] & 255;
            if (i2 < 8) {
                String valueOf = String.valueOf(Integer.toOctalString(i2));
                sb.append(valueOf.length() != 0 ? "\\00".concat(valueOf) : new String("\\00"));
            } else if (i2 == 9) {
                sb.append("\\t");
            } else if (i2 == 10) {
                sb.append("\\n");
            } else if (i2 == 13) {
                sb.append("\\r");
            } else if (i2 < 32) {
                String valueOf2 = String.valueOf(Integer.toOctalString(i2));
                sb.append(valueOf2.length() != 0 ? "\\0".concat(valueOf2) : new String("\\0"));
            } else if (i2 > 126) {
                String valueOf3 = String.valueOf(Integer.toOctalString(i2));
                sb.append(valueOf3.length() != 0 ? "\\".concat(valueOf3) : new String("\\"));
            } else if (i2 == 34) {
                sb.append("\\\"");
            } else if (i2 == 39) {
                sb.append("\\'");
            } else if (i2 == 92) {
                sb.append("\\\\");
            } else {
                sb.append((char) i2);
            }
        }
        return sb.toString();
    }
}

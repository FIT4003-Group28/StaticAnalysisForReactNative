package defpackage;
/* compiled from: PG */
/* renamed from: datn  reason: default package */
/* loaded from: classes5.dex */
public abstract class datn {
    protected final int b = 0;
    public final int c;

    /* JADX INFO: Access modifiers changed from: protected */
    public datn(int i) {
        this.c = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final byte[] e(int i, datm datmVar) {
        byte[] bArr = datmVar.b;
        if (bArr == null || bArr.length < datmVar.c + i) {
            if (bArr == null) {
                datmVar.b = new byte[8192];
                datmVar.c = 0;
                datmVar.d = 0;
            } else {
                int length = bArr.length;
                byte[] bArr2 = new byte[length + length];
                System.arraycopy(bArr, 0, bArr2, 0, length);
                datmVar.b = bArr2;
            }
            return datmVar.b;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void f(byte[] bArr, int i, datm datmVar) {
        if (datmVar.b == null) {
            boolean z = datmVar.e;
            return;
        }
        int min = Math.min(datmVar.c - datmVar.d, i);
        System.arraycopy(datmVar.b, datmVar.d, bArr, 0, min);
        int i2 = datmVar.d + min;
        datmVar.d = i2;
        if (i2 < datmVar.c) {
            return;
        }
        datmVar.b = null;
    }

    public abstract void c(byte[] bArr, int i, datm datmVar);

    public abstract void d(byte[] bArr, int i, datm datmVar);
}

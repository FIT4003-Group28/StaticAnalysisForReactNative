package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: aftl  reason: default package */
/* loaded from: classes.dex */
public final class aftl extends aftk {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aftk
    public final /* bridge */ /* synthetic */ Object f(yqz yqzVar) {
        if (yqzVar == null) {
            return null;
        }
        InputStream b = yqzVar.b();
        int a = (int) yqzVar.a();
        byte[] bArr = new byte[a < 0 ? 16384 : a];
        int i = 0;
        while (true) {
            try {
                int length = bArr.length;
                int read = b.read(bArr, i, length - i);
                if (read == -1) {
                    b.close();
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    return bArr2;
                }
                i += read;
                if (i == length) {
                    if (i != a) {
                        byte[] bArr3 = new byte[length + length];
                        System.arraycopy(bArr, 0, bArr3, 0, length);
                        bArr = bArr3;
                    } else {
                        b.close();
                        return bArr;
                    }
                }
            } catch (Throwable th) {
                b.close();
                throw th;
            }
        }
    }
}

package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: ajnn  reason: default package */
/* loaded from: classes.dex */
public final class ajnn implements cie {
    private final clb a;

    public ajnn(clb clbVar) {
        this.a = clbVar;
    }

    @Override // defpackage.cie
    public final /* bridge */ /* synthetic */ cku a(Object obj, int i, int i2, cic cicVar) {
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = (byte[]) this.a.a(65536, byte[].class);
        while (true) {
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                ((clk) this.a).c(bArr);
                return new cqo(byteArrayOutputStream.toByteArray());
            }
        }
    }

    @Override // defpackage.cie
    public final /* bridge */ /* synthetic */ boolean b(Object obj, cic cicVar) {
        InputStream inputStream = (InputStream) obj;
        return true;
    }
}

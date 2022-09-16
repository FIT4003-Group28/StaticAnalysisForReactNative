package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: dxei  reason: default package */
/* loaded from: classes6.dex */
public final class dxei {
    private InputStream a;
    private ByteArrayOutputStream b;

    public dxei(InputStream inputStream) {
        this.a = inputStream;
        try {
            this.b = new ByteArrayOutputStream();
            byte[] bArr = new byte[256];
            while (true) {
                int read = this.a.read(bArr);
                if (read != -1) {
                    this.b.write(bArr, 0, read);
                } else {
                    this.b.flush();
                    return;
                }
            }
        } catch (IOException e) {
            System.out.println("IOException in CopyInputStream");
            System.out.println(e.toString());
        }
    }

    public final ByteArrayInputStream a() {
        return new ByteArrayInputStream(this.b.toByteArray());
    }
}

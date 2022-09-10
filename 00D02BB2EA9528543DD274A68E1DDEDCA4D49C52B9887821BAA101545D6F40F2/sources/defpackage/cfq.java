package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: PG */
/* renamed from: cfq  reason: default package */
/* loaded from: classes.dex */
public final class cfq implements buc<InputStream, cfg> {
    private final List<btn> a;
    private final buc<ByteBuffer, cfg> b;
    private final bxl c;

    public cfq(List<btn> list, buc<ByteBuffer, cfg> bucVar, bxl bxlVar) {
        this.a = list;
        this.b = bucVar;
        this.c = bxlVar;
    }

    @Override // defpackage.buc
    public final /* bridge */ /* synthetic */ boolean a(InputStream inputStream, bua buaVar) {
        return !((Boolean) buaVar.c(cfp.b)).booleanValue() && btv.a(this.a, inputStream, this.c) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // defpackage.buc
    public final /* bridge */ /* synthetic */ bxd<cfg> b(InputStream inputStream, int i, int i2, bua buaVar) {
        byte[] bArr;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream2.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.b(ByteBuffer.wrap(bArr), i, i2, buaVar);
    }
}

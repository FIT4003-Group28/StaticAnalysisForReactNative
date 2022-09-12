package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cdp  reason: default package */
/* loaded from: classes4.dex */
public final class cdp implements btn {
    @Override // defpackage.btn
    public final ImageHeaderParser$ImageType a(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.btn
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.btn
    public final int c(InputStream inputStream, bxl bxlVar) {
        int c = new aok(inputStream).c(1);
        if (c == 0) {
            return -1;
        }
        return c;
    }
}

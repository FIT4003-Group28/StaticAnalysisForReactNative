package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cpp  reason: default package */
/* loaded from: classes3.dex */
public final class cpp implements chp {
    @Override // defpackage.chp
    public final int a(InputStream inputStream, clb clbVar) {
        int b = new aow(inputStream).b();
        if (b == 0) {
            return -1;
        }
        return b;
    }

    @Override // defpackage.chp
    public final int b(ByteBuffer byteBuffer, clb clbVar) {
        return a(cus.a(byteBuffer), clbVar);
    }

    @Override // defpackage.chp
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.chp
    public final ImageHeaderParser$ImageType d(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}

package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: chr  reason: default package */
/* loaded from: classes2.dex */
public final class chr implements chx {
    final /* synthetic */ ByteBuffer a;

    public chr(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.chx
    public final ImageHeaderParser$ImageType a(chp chpVar) {
        return chpVar.d(this.a);
    }
}

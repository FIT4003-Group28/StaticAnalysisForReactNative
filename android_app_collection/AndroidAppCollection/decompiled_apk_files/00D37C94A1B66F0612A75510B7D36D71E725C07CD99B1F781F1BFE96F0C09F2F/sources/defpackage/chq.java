package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: chq  reason: default package */
/* loaded from: classes2.dex */
public final class chq implements chx {
    final /* synthetic */ InputStream a;

    public chq(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.chx
    public final ImageHeaderParser$ImageType a(chp chpVar) {
        try {
            return chpVar.c(this.a);
        } finally {
            this.a.reset();
        }
    }
}

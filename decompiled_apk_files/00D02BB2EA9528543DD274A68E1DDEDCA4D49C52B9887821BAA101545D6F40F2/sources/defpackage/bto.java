package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: bto  reason: default package */
/* loaded from: classes.dex */
final class bto implements btu {
    final /* synthetic */ InputStream a;

    public bto(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.btu
    public final ImageHeaderParser$ImageType a(btn btnVar) {
        try {
            return btnVar.a(this.a);
        } finally {
            this.a.reset();
        }
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpr  reason: default package */
/* loaded from: classes3.dex */
public final class cpr implements cpu {
    private final ByteBuffer a;
    private final List b;
    private final clb c;

    public cpr(ByteBuffer byteBuffer, List list, clb clbVar) {
        this.a = byteBuffer;
        this.b = list;
        this.c = clbVar;
    }

    @Override // defpackage.cpu
    public final int a() {
        List list = this.b;
        ByteBuffer d = cus.d(this.a);
        clb clbVar = this.c;
        if (d == null) {
            return -1;
        }
        return acz.i(list, new cht(d, clbVar));
    }

    @Override // defpackage.cpu
    public final Bitmap b(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(cus.a(cus.d(this.a)), null, options);
    }

    @Override // defpackage.cpu
    public final ImageHeaderParser$ImageType c() {
        return acz.j(this.b, cus.d(this.a));
    }

    @Override // defpackage.cpu
    public final void d() {
    }
}

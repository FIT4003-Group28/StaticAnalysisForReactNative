package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.List;
/* compiled from: PG */
/* renamed from: cps  reason: default package */
/* loaded from: classes3.dex */
public final class cps implements cpu {
    private final ciw a;
    private final clb b;
    private final List c;

    public cps(InputStream inputStream, List list, clb clbVar) {
        hy.N(clbVar);
        this.b = clbVar;
        hy.N(list);
        this.c = list;
        this.a = new ciw(inputStream, clbVar);
    }

    @Override // defpackage.cpu
    public final int a() {
        return acz.h(this.c, this.a.a(), this.b);
    }

    @Override // defpackage.cpu
    public final Bitmap b(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(this.a.a(), null, options);
    }

    @Override // defpackage.cpu
    public final ImageHeaderParser$ImageType c() {
        return acz.k(this.c, this.a.a(), this.b);
    }

    @Override // defpackage.cpu
    public final void d() {
        this.a.a.a();
    }
}

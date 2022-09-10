package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.List;
/* compiled from: PG */
/* renamed from: cds  reason: default package */
/* loaded from: classes.dex */
public final class cds implements cdu {
    private final buv a;
    private final bxl b;
    private final List<btn> c;

    public cds(InputStream inputStream, List<btn> list, bxl bxlVar) {
        cjn.b(bxlVar);
        this.b = bxlVar;
        cjn.b(list);
        this.c = list;
        this.a = new buv(inputStream, bxlVar);
    }

    @Override // defpackage.cdu
    public final Bitmap a(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(this.a.a(), null, options);
    }

    @Override // defpackage.cdu
    public final ImageHeaderParser$ImageType b() {
        return btv.a(this.c, this.a.a(), this.b);
    }

    @Override // defpackage.cdu
    public final int c() {
        return btv.c(this.c, this.a.a(), this.b);
    }

    @Override // defpackage.cdu
    public final void d() {
        this.a.a.a();
    }
}

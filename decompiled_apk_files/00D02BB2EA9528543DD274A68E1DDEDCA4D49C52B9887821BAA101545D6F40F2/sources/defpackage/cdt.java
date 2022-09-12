package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.List;
/* compiled from: PG */
/* renamed from: cdt  reason: default package */
/* loaded from: classes4.dex */
public final class cdt implements cdu {
    private final bxl a;
    private final List<btn> b;
    private final buy c;

    public cdt(ParcelFileDescriptor parcelFileDescriptor, List<btn> list, bxl bxlVar) {
        cjn.b(bxlVar);
        this.a = bxlVar;
        cjn.b(list);
        this.b = list;
        this.c = new buy(parcelFileDescriptor);
    }

    @Override // defpackage.cdu
    public final Bitmap a(BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(this.c.a().getFileDescriptor(), null, options);
    }

    @Override // defpackage.cdu
    public final ImageHeaderParser$ImageType b() {
        return btv.b(this.b, new btq(this.c, this.a));
    }

    @Override // defpackage.cdu
    public final int c() {
        return btv.d(this.b, new bts(this.c, this.a));
    }

    @Override // defpackage.cdu
    public final void d() {
    }
}

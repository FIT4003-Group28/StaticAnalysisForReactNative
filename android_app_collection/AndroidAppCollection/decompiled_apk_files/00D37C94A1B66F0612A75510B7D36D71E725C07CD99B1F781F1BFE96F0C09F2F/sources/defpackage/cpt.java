package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpt  reason: default package */
/* loaded from: classes3.dex */
public final class cpt implements cpu {
    private final clb a;
    private final List b;
    private final ciz c;

    public cpt(ParcelFileDescriptor parcelFileDescriptor, List list, clb clbVar) {
        hy.N(clbVar);
        this.a = clbVar;
        hy.N(list);
        this.b = list;
        this.c = new ciz(parcelFileDescriptor);
    }

    @Override // defpackage.cpu
    public final int a() {
        return acz.i(this.b, new chv(this.c, this.a));
    }

    @Override // defpackage.cpu
    public final Bitmap b(BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(this.c.a().getFileDescriptor(), null, options);
    }

    @Override // defpackage.cpu
    public final ImageHeaderParser$ImageType c() {
        return acz.l(this.b, new chs(this.c, this.a));
    }

    @Override // defpackage.cpu
    public final void d() {
    }
}

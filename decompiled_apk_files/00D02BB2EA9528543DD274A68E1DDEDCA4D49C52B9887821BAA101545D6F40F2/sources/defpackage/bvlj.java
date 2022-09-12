package defpackage;

import android.graphics.Bitmap;
import android.graphics.Picture;
/* compiled from: PG */
/* renamed from: bvlj  reason: default package */
/* loaded from: classes.dex */
final class bvlj implements dbty<Bitmap> {
    final /* synthetic */ Picture a;
    final /* synthetic */ ggt b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ Bitmap.Config e;

    public bvlj(Picture picture, ggt ggtVar, int i, int i2, Bitmap.Config config) {
        this.a = picture;
        this.b = ggtVar;
        this.c = i;
        this.d = i2;
        this.e = config;
    }

    @Override // defpackage.dbty
    /* renamed from: b */
    public final Bitmap a() {
        Picture picture = this.a;
        ggs ggsVar = (ggs) this.b;
        return bvlf.b(picture, ggsVar.a, ggsVar.b, ggsVar.c, ggsVar.d, this.c, this.d, this.e);
    }
}

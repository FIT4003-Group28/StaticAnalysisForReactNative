package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
/* compiled from: PG */
/* renamed from: cdw  reason: default package */
/* loaded from: classes.dex */
public final class cdw implements bxd, bwy {
    private final Resources a;
    private final bxd<Bitmap> b;

    private cdw(Resources resources, bxd<Bitmap> bxdVar) {
        cjn.b(resources);
        this.a = resources;
        cjn.b(bxdVar);
        this.b = bxdVar;
    }

    public static bxd<BitmapDrawable> f(Resources resources, bxd<Bitmap> bxdVar) {
        if (bxdVar == null) {
            return null;
        }
        return new cdw(resources, bxdVar);
    }

    @Override // defpackage.bxd
    public final Class<BitmapDrawable> a() {
        return BitmapDrawable.class;
    }

    @Override // defpackage.bxd
    public final /* bridge */ /* synthetic */ Object b() {
        return new BitmapDrawable(this.a, this.b.b());
    }

    @Override // defpackage.bxd
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.bxd
    public final void d() {
        this.b.d();
    }

    @Override // defpackage.bwy
    public final void e() {
        bxd<Bitmap> bxdVar = this.b;
        if (bxdVar instanceof bwy) {
            ((bwy) bxdVar).e();
        }
    }
}

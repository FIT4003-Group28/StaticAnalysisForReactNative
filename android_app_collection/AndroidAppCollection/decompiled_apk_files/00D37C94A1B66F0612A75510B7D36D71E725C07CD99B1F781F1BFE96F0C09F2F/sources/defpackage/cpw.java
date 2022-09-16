package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
/* compiled from: PG */
/* renamed from: cpw  reason: default package */
/* loaded from: classes3.dex */
public final class cpw implements cku, ckr {
    private final Resources a;
    private final cku b;

    private cpw(Resources resources, cku ckuVar) {
        hy.N(resources);
        this.a = resources;
        hy.N(ckuVar);
        this.b = ckuVar;
    }

    public static cku f(Resources resources, cku ckuVar) {
        if (ckuVar == null) {
            return null;
        }
        return new cpw(resources, ckuVar);
    }

    @Override // defpackage.cku
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.cku
    public final Class b() {
        return BitmapDrawable.class;
    }

    @Override // defpackage.cku
    public final /* bridge */ /* synthetic */ Object c() {
        return new BitmapDrawable(this.a, (Bitmap) this.b.c());
    }

    @Override // defpackage.ckr
    public final void d() {
        cku ckuVar = this.b;
        if (ckuVar instanceof ckr) {
            ((ckr) ckuVar).d();
        }
    }

    @Override // defpackage.cku
    public final void e() {
        this.b.e();
    }
}

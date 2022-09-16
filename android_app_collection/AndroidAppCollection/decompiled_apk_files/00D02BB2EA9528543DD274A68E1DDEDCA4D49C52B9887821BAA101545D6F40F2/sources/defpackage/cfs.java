package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
/* compiled from: PG */
/* renamed from: cfs  reason: default package */
/* loaded from: classes.dex */
public final class cfs implements cfv<Bitmap, BitmapDrawable> {
    private final Resources a;

    public cfs(Resources resources) {
        cjn.b(resources);
        this.a = resources;
    }

    @Override // defpackage.cfv
    public final bxd<BitmapDrawable> a(bxd<Bitmap> bxdVar, bua buaVar) {
        return cdw.f(this.a, bxdVar);
    }
}

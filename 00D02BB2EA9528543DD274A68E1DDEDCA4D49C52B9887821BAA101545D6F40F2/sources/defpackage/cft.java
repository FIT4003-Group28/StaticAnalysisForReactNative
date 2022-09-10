package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cft  reason: default package */
/* loaded from: classes.dex */
public final class cft implements cfv<Drawable, byte[]> {
    private final bxn a;
    private final cfv<Bitmap, byte[]> b;
    private final cfv<cfg, byte[]> c;

    public cft(bxn bxnVar, cfv<Bitmap, byte[]> cfvVar, cfv<cfg, byte[]> cfvVar2) {
        this.a = bxnVar;
        this.b = cfvVar;
        this.c = cfvVar2;
    }

    @Override // defpackage.cfv
    public final bxd<byte[]> a(bxd<Drawable> bxdVar, bua buaVar) {
        Drawable b = bxdVar.b();
        if (b instanceof BitmapDrawable) {
            return this.b.a(ccq.f(((BitmapDrawable) b).getBitmap(), this.a), buaVar);
        }
        if (!(b instanceof cfg)) {
            return null;
        }
        return this.c.a(bxdVar, buaVar);
    }
}

package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: xpn  reason: default package */
/* loaded from: classes4.dex */
final class xpn implements Runnable {
    final /* synthetic */ Bitmap a;
    final /* synthetic */ xpo b;

    public xpn(xpo xpoVar, Bitmap bitmap) {
        this.b = xpoVar;
        this.a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xpr xprVar = this.b.a;
        Bitmap bitmap = this.a;
        xprVar.a.setImageBitmap(bitmap);
        if (xprVar.d.b == xprVar.b) {
            xprVar.c.setImageBitmap(bitmap);
        }
    }
}

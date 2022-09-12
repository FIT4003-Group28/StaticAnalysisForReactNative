package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: bxo  reason: default package */
/* loaded from: classes4.dex */
public class bxo implements bxn {
    @Override // defpackage.bxn
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.bxn
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.bxn
    public final Bitmap c(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.bxn
    public final void d() {
    }

    @Override // defpackage.bxn
    public final void e(int i) {
    }
}

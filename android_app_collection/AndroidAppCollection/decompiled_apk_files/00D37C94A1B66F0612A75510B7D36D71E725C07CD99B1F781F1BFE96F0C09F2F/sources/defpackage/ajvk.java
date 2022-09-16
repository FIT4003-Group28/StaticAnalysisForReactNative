package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: ajvk  reason: default package */
/* loaded from: classes.dex */
final class ajvk implements Runnable {
    final /* synthetic */ Bitmap a;
    final /* synthetic */ ajvl b;

    public ajvk(ajvl ajvlVar, Bitmap bitmap) {
        this.b = ajvlVar;
        this.a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ajvl ajvlVar = this.b;
        ajvlVar.c.d(ajvlVar.a, this.a);
    }
}

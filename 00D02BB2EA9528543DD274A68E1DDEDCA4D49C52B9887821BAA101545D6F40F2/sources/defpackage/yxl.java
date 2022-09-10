package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: yxl  reason: default package */
/* loaded from: classes7.dex */
final class yxl implements Runnable {
    final /* synthetic */ clbs a;
    final /* synthetic */ Bitmap b;
    final /* synthetic */ yxm c;

    public yxl(yxm yxmVar, clbs clbsVar, Bitmap bitmap) {
        this.c = yxmVar;
        this.a = clbsVar;
        this.b = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.c) {
            clbu.b.b(this.b);
        } else {
            this.c.e.c.setTileBitmap(this.a, this.b);
        }
    }
}

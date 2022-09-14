package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.viewer.client.Dimensions;
/* compiled from: PG */
/* renamed from: yxj  reason: default package */
/* loaded from: classes7.dex */
final class yxj implements Runnable {
    final /* synthetic */ Dimensions a;
    final /* synthetic */ Bitmap b;
    final /* synthetic */ yxm c;

    public yxj(yxm yxmVar, Dimensions dimensions, Bitmap bitmap) {
        this.c = yxmVar;
        this.a = dimensions;
        this.b = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.c || !dbsd.a(this.a, this.c.d)) {
            boolean z = this.c.c;
            Dimensions dimensions = this.c.d;
            this.b.recycle();
            return;
        }
        this.c.e.c.setPageBitmap(this.b);
    }
}

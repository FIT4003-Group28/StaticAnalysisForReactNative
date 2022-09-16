package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: hru  reason: default package */
/* loaded from: classes3.dex */
final class hru implements yiw {
    final /* synthetic */ ImageView a;
    final /* synthetic */ zov b;
    final /* synthetic */ hrw c;

    public hru(hrw hrwVar, ImageView imageView, zov zovVar) {
        this.c = hrwVar;
        this.a = imageView;
        this.b = zovVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        hrw hrwVar = this.c;
        Bitmap c = aakr.c(hrwVar.d, hrwVar.h);
        aakr.e(this.c.d, c, this.b);
        c.recycle();
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        this.a.setImageBitmap((Bitmap) obj2);
        hrw hrwVar = this.c;
        Bitmap c = aakr.c(hrwVar.d, hrwVar.h);
        aakr.e(this.c.d, c, this.b);
        c.recycle();
    }
}

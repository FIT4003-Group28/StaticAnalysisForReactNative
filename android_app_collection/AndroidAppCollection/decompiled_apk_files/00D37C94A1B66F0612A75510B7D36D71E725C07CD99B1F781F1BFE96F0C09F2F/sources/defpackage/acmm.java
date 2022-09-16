package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: acmm  reason: default package */
/* loaded from: classes.dex */
final class acmm implements yiw {
    final /* synthetic */ ImageView a;
    final /* synthetic */ acmo b;

    public acmm(acmo acmoVar, ImageView imageView) {
        this.b = acmoVar;
        this.a = imageView;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String valueOf = String.valueOf(((Uri) obj).toString());
        zep.l(valueOf.length() != 0 ? "Error loading thumbnail from Uri: ".concat(valueOf) : new String("Error loading thumbnail from Uri: "));
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        final Bitmap bitmap = (Bitmap) obj2;
        Handler handler = this.b.c;
        final ImageView imageView = this.a;
        handler.post(new Runnable() { // from class: acml
            @Override // java.lang.Runnable
            public final void run() {
                imageView.setImageBitmap(bitmap);
            }
        });
    }
}

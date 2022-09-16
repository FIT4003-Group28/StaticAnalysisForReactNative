package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: acga  reason: default package */
/* loaded from: classes.dex */
public final class acga implements yiw {
    final /* synthetic */ Resources a;
    final /* synthetic */ ImageView b;
    private final /* synthetic */ int c;

    public acga(Resources resources, ImageView imageView) {
        this.a = resources;
        this.b = imageView;
    }

    public acga(Resources resources, ImageView imageView, int i) {
        this.c = i;
        this.a = resources;
        this.b = imageView;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        if (this.c == 0) {
            Uri uri = (Uri) obj;
        } else {
            Uri uri2 = (Uri) obj;
        }
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        if (this.c == 0) {
            Uri uri = (Uri) obj;
            hm j = iy.j(this.a, (Bitmap) obj2);
            j.c();
            ImageView imageView = this.b;
            imageView.post(new acfz(imageView, j));
            return;
        }
        Uri uri2 = (Uri) obj;
        hm j2 = iy.j(this.a, (Bitmap) obj2);
        j2.c();
        new Handler(Looper.getMainLooper()).post(new acfz(this.b, j2, 1));
    }
}

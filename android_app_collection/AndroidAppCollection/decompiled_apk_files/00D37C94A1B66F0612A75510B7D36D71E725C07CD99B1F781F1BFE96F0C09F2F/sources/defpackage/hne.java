package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hne  reason: default package */
/* loaded from: classes3.dex */
final class hne implements yiw {
    final /* synthetic */ FrameLayout a;
    final /* synthetic */ hni b;

    public hne(hni hniVar, FrameLayout frameLayout) {
        this.b = hniVar;
        this.a = frameLayout;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        this.b.d.post(new mmd(this.a, 1));
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        final Bitmap bitmap = (Bitmap) obj2;
        Handler handler = this.b.d;
        final FrameLayout frameLayout = this.a;
        handler.post(new Runnable() { // from class: hnd
            @Override // java.lang.Runnable
            public final void run() {
                FrameLayout frameLayout2 = frameLayout;
                hm j = iy.j(frameLayout2.getResources(), bitmap);
                j.c();
                ((ImageView) frameLayout2.findViewById(R.id.reel_post_confirmation_avatar)).setImageDrawable(j);
            }
        });
    }
}

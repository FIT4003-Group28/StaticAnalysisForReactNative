package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ioq  reason: default package */
/* loaded from: classes3.dex */
public final class ioq implements yiw {
    final /* synthetic */ iou a;
    private AsyncTask b;

    public ioq(iou iouVar) {
        this.a = iouVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        if (this.a.ap()) {
            this.a.bo(iou.by());
        }
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        final Bitmap bitmap = (Bitmap) obj2;
        c();
        if (bitmap != null) {
            this.b = new bin(bitmap).a(new bio() { // from class: iop
                @Override // defpackage.bio
                public final void a(biq biqVar) {
                    ioq ioqVar = ioq.this;
                    Bitmap bitmap2 = bitmap;
                    if (!ioqVar.a.ap() || biqVar == null) {
                        return;
                    }
                    iou iouVar = ioqVar.a;
                    ghg p = etk.p(biqVar, iouVar.b.getColor(R.color.yt_grey3), iouVar.b.getColor(R.color.theme_tab_fallback_text_color_activated_dark), iouVar.b.getColor(R.color.theme_tab_fallback_text_color_normal_dark), iouVar.b.getColor(R.color.yt_white1), bitmap2.getWidth(), bitmap2.getHeight());
                    ngp a = ngq.a();
                    a.d(hve.h(p.d));
                    a.e(hve.h(p.c));
                    a.b(hve.h(p.a));
                    a.f(hve.h(p.b));
                    a.c(hve.h(p.d));
                    iouVar.bo(a.a());
                }
            });
        }
    }

    public final void c() {
        AsyncTask asyncTask = this.b;
        if (asyncTask == null || asyncTask.isCancelled()) {
            return;
        }
        this.b.cancel(false);
        this.b = null;
    }
}

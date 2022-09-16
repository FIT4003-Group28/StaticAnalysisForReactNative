package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aizq  reason: default package */
/* loaded from: classes.dex */
public final class aizq implements yiw {
    final /* synthetic */ aizr a;
    private final /* synthetic */ int b;

    public aizq(aizr aizrVar) {
        this.a = aizrVar;
    }

    public aizq(aizr aizrVar, int i) {
        this.b = i;
        this.a = aizrVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        if (this.b == 0) {
            if (!((Uri) obj).equals(this.a.b)) {
                return;
            }
            this.a.c(null, null);
            this.a.b = null;
            return;
        }
        this.a.a().a((Uri) obj, exc);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        if (this.b == 0) {
            jj jjVar = (jj) obj2;
            if (!((Uri) obj).equals(this.a.b)) {
                return;
            }
            this.a.c((Bitmap) jjVar.a, (Bitmap) jjVar.b);
            this.a.b = null;
            return;
        }
        Uri uri = (Uri) obj;
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmap == null) {
            return;
        }
        float f = this.a.a.getResources().getDisplayMetrics().density;
        yiw a = this.a.a();
        float f2 = (int) (f * 64.0f);
        float min = Math.min(f2 / bitmap.getWidth(), f2 / bitmap.getHeight());
        a.b(uri, new jj(bitmap, zag.d(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min))));
    }
}

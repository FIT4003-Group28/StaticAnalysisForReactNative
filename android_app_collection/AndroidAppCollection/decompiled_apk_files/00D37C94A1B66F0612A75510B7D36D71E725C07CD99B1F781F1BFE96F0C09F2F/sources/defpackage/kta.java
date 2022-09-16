package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kta  reason: default package */
/* loaded from: classes3.dex */
public final class kta implements yiw {
    public final List a = new ArrayList();
    private AsyncTask b;

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        for (yzo yzoVar : this.a) {
            yzoVar.a(ktb.d);
        }
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        final Bitmap bitmap = (Bitmap) obj2;
        c();
        if (bitmap == null || this.a.isEmpty()) {
            return;
        }
        this.b = biq.b(bitmap).a(new bio() { // from class: ksz
            @Override // defpackage.bio
            public final void a(biq biqVar) {
                kta ktaVar = kta.this;
                Bitmap bitmap2 = bitmap;
                int[] iArr = {etk.p(biqVar, ktb.d[0], ktb.d[0], ktb.d[0], ktb.d[0], bitmap2.getWidth(), bitmap2.getHeight()).a};
                for (yzo yzoVar : ktaVar.a) {
                    yzoVar.a(iArr);
                }
            }
        });
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

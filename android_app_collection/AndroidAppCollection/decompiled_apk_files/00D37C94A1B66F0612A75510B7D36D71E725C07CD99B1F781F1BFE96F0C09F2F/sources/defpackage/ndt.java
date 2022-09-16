package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ndt  reason: default package */
/* loaded from: classes3.dex */
public final class ndt implements yiw {
    final /* synthetic */ ndv a;

    public ndt(ndv ndvVar) {
        this.a = ndvVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        final hm j = iy.j(this.a.b.getResources(), (Bitmap) obj2);
        j.c();
        this.a.b.runOnUiThread(new Runnable() { // from class: nds
            @Override // java.lang.Runnable
            public final void run() {
                ndt ndtVar = ndt.this;
                ndtVar.a.a.setImageDrawable(j);
            }
        });
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: xfo  reason: default package */
/* loaded from: classes4.dex */
final class xfo implements yiw {
    final /* synthetic */ xfp a;

    public xfo(xfp xfpVar) {
        this.a = xfpVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        zep.n("Failed to load playerview thumbnail", exc);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        xfp xfpVar = this.a;
        xfpVar.b = (Bitmap) obj2;
        xfpVar.a.b(xfpVar.b);
    }
}

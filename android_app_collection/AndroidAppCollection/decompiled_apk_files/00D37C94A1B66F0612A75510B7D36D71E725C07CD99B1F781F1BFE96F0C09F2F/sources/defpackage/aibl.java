package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: aibl  reason: default package */
/* loaded from: classes.dex */
final class aibl implements yiw {
    final /* synthetic */ aibm a;

    public aibl(aibm aibmVar) {
        this.a = aibmVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        zep.n("Failed to load playerview thumbnail", exc);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        aibm aibmVar = this.a;
        aibmVar.b = (Bitmap) obj2;
        aibmVar.a.b(aibmVar.b);
    }
}

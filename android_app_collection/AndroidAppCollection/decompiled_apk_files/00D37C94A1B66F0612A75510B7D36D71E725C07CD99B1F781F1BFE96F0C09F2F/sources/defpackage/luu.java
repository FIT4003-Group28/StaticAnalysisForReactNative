package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: luu  reason: default package */
/* loaded from: classes3.dex */
final class luu implements yiw {
    final /* synthetic */ luv a;

    public luu(luv luvVar) {
        this.a = luvVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        luv luvVar = this.a;
        luvVar.d = (Bitmap) obj2;
        luvVar.a();
    }
}

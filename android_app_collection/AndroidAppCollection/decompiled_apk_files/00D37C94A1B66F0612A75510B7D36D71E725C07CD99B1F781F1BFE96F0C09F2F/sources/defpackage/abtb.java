package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: abtb  reason: default package */
/* loaded from: classes.dex */
final class abtb implements yiw {
    final /* synthetic */ String a;
    final /* synthetic */ yiw b;
    final /* synthetic */ abtc c;

    public abtb(abtc abtcVar, String str, yiw yiwVar) {
        this.c = abtcVar;
        this.a = str;
        this.b = yiwVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.b.a((Uri) obj, exc);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        this.c.e(bitmap, this.a);
        this.b.b((Uri) obj, bitmap);
    }
}

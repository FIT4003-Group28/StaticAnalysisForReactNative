package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: dfi  reason: default package */
/* loaded from: classes6.dex */
final class dfi implements degu<Bitmap> {
    final /* synthetic */ czh a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ Runnable d;
    final /* synthetic */ dfk e;

    public dfi(dfk dfkVar, czh czhVar, boolean z, String str, Runnable runnable) {
        this.e = dfkVar;
        this.a = czhVar;
        this.b = z;
        this.c = str;
        this.d = runnable;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi Bitmap bitmap) {
        this.e.a(this.a, new dfh(bitmap), this.b, this.c, dbsg.i(Long.valueOf(this.e.d.f())), this.d);
    }
}

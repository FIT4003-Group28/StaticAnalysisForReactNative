package defpackage;

import android.graphics.Bitmap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctcl  reason: default package */
/* loaded from: classes5.dex */
public final class ctcl implements degu<Bitmap> {
    final /* synthetic */ ctyy a;
    final /* synthetic */ cufp b;
    final /* synthetic */ ctct c;

    public ctcl(ctct ctctVar, ctyy ctyyVar, cufp cufpVar) {
        this.c = ctctVar;
        this.a = ctyyVar;
        this.b = cufpVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        ctog ctogVar = this.c.f;
        ctxm r = ctxn.r();
        r.g(39);
        r.n(this.a.b().e());
        r.o(this.a.c().J());
        r.d(this.b.a());
        ctogVar.b(r.a());
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Bitmap bitmap) {
    }
}

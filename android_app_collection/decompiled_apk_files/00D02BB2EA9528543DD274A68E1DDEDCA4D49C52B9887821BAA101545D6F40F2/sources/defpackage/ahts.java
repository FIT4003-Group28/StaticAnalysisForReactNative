package defpackage;
/* compiled from: PG */
/* renamed from: ahts  reason: default package */
/* loaded from: classes2.dex */
final class ahts implements akey {
    final /* synthetic */ String a;
    final /* synthetic */ dbsg b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ahtt d;

    public ahts(ahtt ahttVar, String str, dbsg dbsgVar, boolean z) {
        this.d = ahttVar;
        this.a = str;
        this.b = dbsgVar;
        this.c = z;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        bvrj.UI_THREAD.c();
        btlu b = this.d.b.b();
        this.d.c.p(true);
        this.d.b(b, this.a, this.b, this.c);
    }

    @Override // defpackage.akey
    public final void b() {
        bvrj.UI_THREAD.c();
        cjqy cjqyVar = this.d.f;
        cjsx i = cjsy.i();
        i.b(ddda.cZ);
        cjqyVar.k(i.a());
    }
}

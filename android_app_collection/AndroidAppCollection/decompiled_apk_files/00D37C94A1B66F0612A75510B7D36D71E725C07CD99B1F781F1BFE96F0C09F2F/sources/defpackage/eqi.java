package defpackage;
/* compiled from: PG */
/* renamed from: eqi  reason: default package */
/* loaded from: classes3.dex */
final class eqi implements afwa {
    final /* synthetic */ apzg a;
    final /* synthetic */ Object b;
    final /* synthetic */ eqj c;

    public eqi(eqj eqjVar, apzg apzgVar, Object obj) {
        this.c = eqjVar;
        this.a = apzgVar;
        this.b = obj;
    }

    @Override // defpackage.afwa
    public final void a() {
    }

    @Override // defpackage.afwa
    public final void b() {
        this.c.d(this.a, this.b, true);
    }

    @Override // defpackage.afwa
    public final void c(Exception exc) {
        this.c.a.e(exc);
    }
}

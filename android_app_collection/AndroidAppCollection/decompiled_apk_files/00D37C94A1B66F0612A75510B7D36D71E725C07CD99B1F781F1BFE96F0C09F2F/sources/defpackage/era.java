package defpackage;
/* compiled from: PG */
/* renamed from: era  reason: default package */
/* loaded from: classes3.dex */
final class era implements afwa {
    final /* synthetic */ apzg a;
    final /* synthetic */ Object b;
    final /* synthetic */ erc c;

    public era(erc ercVar, apzg apzgVar, Object obj) {
        this.c = ercVar;
        this.a = apzgVar;
        this.b = obj;
    }

    @Override // defpackage.afwa
    public final void a() {
    }

    @Override // defpackage.afwa
    public final void b() {
        try {
            this.c.b(this.a, this.b);
        } catch (aafy e) {
            this.c.b.e(e);
        }
    }

    @Override // defpackage.afwa
    public final void c(Exception exc) {
        this.c.b.e(exc);
    }
}

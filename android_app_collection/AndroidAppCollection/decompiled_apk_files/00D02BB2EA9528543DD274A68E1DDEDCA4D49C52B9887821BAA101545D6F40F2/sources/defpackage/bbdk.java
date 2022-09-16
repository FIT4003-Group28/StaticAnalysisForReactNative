package defpackage;
/* compiled from: PG */
/* renamed from: bbdk  reason: default package */
/* loaded from: classes3.dex */
final class bbdk implements degu<bbmn> {
    final /* synthetic */ bbdu a;
    final /* synthetic */ bbdo b;

    public bbdk(bbdo bbdoVar, bbdu bbduVar) {
        this.b = bbdoVar;
        this.a = bbduVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        bbdu bbduVar = this.a;
        if (bbduVar != null) {
            bbduVar.a(this.b.a.a(), 2);
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(bbmn bbmnVar) {
        bbdo bbdoVar = this.b;
        bbdoVar.c.i(Long.toString(bbdoVar.e.b()));
        bbdu bbduVar = this.a;
        if (bbduVar != null) {
            bbduVar.a(this.b.a.a(), 1);
        }
    }
}

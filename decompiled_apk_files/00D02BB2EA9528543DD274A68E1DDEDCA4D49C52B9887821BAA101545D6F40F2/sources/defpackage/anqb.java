package defpackage;
/* renamed from: anqb  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class anqb implements cqlc {
    static final cqlc a = new anqb();

    private anqb() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        anqm anqmVar = (anqm) cqkpVar;
        int i = anql.d;
        if (anqmVar.a().booleanValue() || anqmVar.b().booleanValue()) {
            return anqmVar.i();
        }
        return anqmVar.j();
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

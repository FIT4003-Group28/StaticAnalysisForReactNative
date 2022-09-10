package defpackage;
/* compiled from: PG */
/* renamed from: brse  reason: default package */
/* loaded from: classes4.dex */
final class brse extends cqiw<brvb> {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ brsf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brse(brsf brsfVar, Object[] objArr, boolean z, int i) {
        super(objArr);
        this.c = brsfVar;
        this.a = z;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<brvb> a() {
        if (this.a) {
            return cqgr.gs(cqgr.ce(cqrp.c(1.0d)), cqgr.bq(cqrp.c(1.0d)), iue.b(B().l()), cqgr.fI(8));
        }
        cqmj<brvb> fY = cqgr.fY(cqgr.fO(new brsz(this.b), B(), new cqmp[0]));
        return !this.c.a ? jfy.a(jga.b(true), fY) : fY;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: aetk  reason: default package */
/* loaded from: classes2.dex */
public final class aetk extends iox {
    private final aeso a;
    private final ckgj b;

    public aetk(aeso aesoVar, cqrp cqrpVar, cqrp cqrpVar2, ckgj ckgjVar, ddho ddhoVar) {
        super(cqrpVar, cqrp.d(gqq.a.c), cqrpVar2, cqrp.d(dcyn.a), ddhoVar, false, ckgjVar);
        this.a = aesoVar;
        this.b = ckgjVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.iox, defpackage.cqiw
    public final cqmj<jbf> a() {
        cqmj<jbf> a = super.a();
        a.f(this.a.a(this.b));
        return a;
    }
}

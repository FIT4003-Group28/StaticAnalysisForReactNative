package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dazi  reason: default package */
/* loaded from: classes.dex */
public final class dazi extends dazc<dazn> implements dazb {
    private final Exception a;

    public dazi(String str, dazb dazbVar, dazm dazmVar) {
        super(str, dazbVar, dazmVar);
        this.a = dazbVar.d();
    }

    @Override // defpackage.dazb
    public final Exception d() {
        return this.a;
    }

    @Override // defpackage.dazn
    public final dazn e(String str, dazm dazmVar) {
        return new dazi(str, this, dazmVar);
    }

    @Override // defpackage.dazn
    public final boolean f() {
        return false;
    }

    @Override // defpackage.dazn
    public final void g() {
    }

    public dazi(String str, dazm dazmVar) {
        super(str, dazd.a.b(), dazmVar);
        this.a = dazh.a;
    }
}

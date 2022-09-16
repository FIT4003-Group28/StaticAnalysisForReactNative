package defpackage;
/* compiled from: PG */
/* renamed from: dfb  reason: default package */
/* loaded from: classes3.dex */
public final class dfb extends cyr {
    cyr a;

    private dfb() {
        super("Wrapper");
    }

    public static dfa a(cyv cyvVar) {
        dfa dfaVar = new dfa();
        dfa.d(dfaVar, cyvVar, new dfb());
        return dfaVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final cyr b(cyv cyvVar) {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final cyz c(cyv cyvVar) {
        cyr cyrVar = this.a;
        return cyrVar == null ? cyv.a : dbm.b(cyvVar, cyrVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final boolean d() {
        return true;
    }

    @Override // defpackage.cyr
    public final boolean e(cyr cyrVar) {
        if (this == cyrVar) {
            return true;
        }
        if (cyrVar == null || getClass() != cyrVar.getClass()) {
            return false;
        }
        dfb dfbVar = (dfb) cyrVar;
        if (this.k == dfbVar.k) {
            return true;
        }
        cyr cyrVar2 = this.a;
        return cyrVar2 == null ? dfbVar.a == null : cyrVar2.equals(dfbVar.a);
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }

    @Override // defpackage.cyr
    protected final cyr i() {
        return this.a;
    }
}

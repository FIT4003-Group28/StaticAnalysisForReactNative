package defpackage;
/* compiled from: PG */
/* renamed from: bzlr  reason: default package */
/* loaded from: classes4.dex */
public final class bzlr {
    private final btvo a;
    private final dxio<qbt> b;

    public bzlr(btvo btvoVar, dxio<qbt> dxioVar) {
        this.a = btvoVar;
        this.b = dxioVar;
    }

    public final boolean a(@dzsi ilo iloVar, @dzsi dnqh dnqhVar, boolean z) {
        if (iloVar == null || !this.a.getEnableFeatureParameters().aA || !iloVar.ba() || !akqi.d(iloVar.ai())) {
            return false;
        }
        qdf o = qdg.o();
        qaw qawVar = (qaw) o;
        qawVar.b = iloVar.ai().o();
        qawVar.a = iloVar.n();
        qawVar.h = dnqhVar;
        o.e(z);
        this.b.a().t(o.h());
        return true;
    }
}

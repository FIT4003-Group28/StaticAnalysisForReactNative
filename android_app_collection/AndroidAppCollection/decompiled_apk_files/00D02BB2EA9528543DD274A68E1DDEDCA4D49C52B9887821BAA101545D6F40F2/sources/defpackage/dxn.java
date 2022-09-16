package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxn  reason: default package */
/* loaded from: classes6.dex */
public final class dxn {
    public static final dxn d = new dxn(null, null, null);
    @dzsi
    final dxo a;
    @dzsi
    final dxm b;
    @dzsi
    final dfmh c;

    public dxn(@dzsi dxo dxoVar, @dzsi dxm dxmVar, @dzsi dfmh dfmhVar) {
        boolean z = false;
        dbsk.a(dfmhVar == null || dxmVar != null);
        dbsk.a((dxmVar == null || dxoVar != null) ? true : z);
        this.a = dxoVar;
        this.b = dxmVar;
        this.c = dfmhVar;
    }

    public final dxr a() {
        dxq m = dxr.m();
        dxo dxoVar = this.a;
        if (dxoVar != null) {
            dyg dygVar = (dyg) m;
            dygVar.a = dxoVar.a;
            m.f(dxoVar.c.size());
            dxm dxmVar = this.b;
            if (dxmVar != null) {
                dygVar.c = dxmVar.a;
                dfmh dfmhVar = this.c;
                if (dfmhVar != null) {
                    dgrh dgrhVar = dfmhVar.b;
                    if (dgrhVar == null) {
                        dgrhVar = dgrh.d;
                    }
                    akqi k = akqi.k(dgrhVar);
                    dfmh dfmhVar2 = this.c;
                    float f = (dfmhVar2.a & 2) != 0 ? dfmhVar2.c : 0.0f;
                    dygVar.e = k;
                    m.e(f);
                    if (this.c.g.size() > 0) {
                        m.b(dcdc.r(this.c.g));
                    }
                }
            }
        }
        return m.a();
    }
}

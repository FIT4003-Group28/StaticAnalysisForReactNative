package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: xmn  reason: default package */
/* loaded from: classes4.dex */
public final class xmn implements afzf {
    public Map a;
    private final aafo b;
    private final xko c;
    private final yzj d;

    public xmn(aafo aafoVar, xko xkoVar, yzj yzjVar) {
        this.b = aafoVar;
        xkoVar.getClass();
        this.c = xkoVar;
        yzjVar.getClass();
        this.d = yzjVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.d.e(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        arnr arnrVar = (arnr) obj;
        for (arnh arnhVar : arnrVar.c) {
            this.c.a(arnhVar, null);
        }
        this.b.d(arnrVar.d, this.a);
    }
}

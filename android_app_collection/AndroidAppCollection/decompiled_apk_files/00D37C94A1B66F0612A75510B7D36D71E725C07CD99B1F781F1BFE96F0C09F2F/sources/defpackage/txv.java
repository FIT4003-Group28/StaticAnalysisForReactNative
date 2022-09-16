package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: txv  reason: default package */
/* loaded from: classes4.dex */
public final class txv implements axou {
    private final txt a;
    private final azqb b;
    private final azqb c;

    public txv(txt txtVar, azqb azqbVar, azqb azqbVar2) {
        this.a = txtVar;
        this.b = azqbVar;
        this.c = azqbVar2;
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        txt txtVar = this.a;
        vjf a = vjg.a(((txh) this.b).get());
        a.e("mdd_pds_config");
        a.f(tzc.p("LoggingState", (ampq) this.c.get()));
        Uri a2 = a.a();
        vli a3 = vlj.a();
        a3.f(a2);
        a3.e(tqx.a);
        a3.g(false);
        return txtVar.b.a(a3.a());
    }
}

package defpackage;

import android.content.Context;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: txu  reason: default package */
/* loaded from: classes4.dex */
public final class txu implements axou {
    private final txt a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final /* synthetic */ int g;

    public txu(txt txtVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        this.a = txtVar;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.e = azqbVar4;
        this.f = azqbVar5;
    }

    public txu(txt txtVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i) {
        this.g = i;
        this.a = txtVar;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.e = azqbVar4;
        this.f = azqbVar5;
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        int i = this.g;
        if (i == 0) {
            txt txtVar = this.a;
            Context context = ((txh) this.b).get();
            vjb vjbVar = (vjb) this.d.get();
            akem akemVar = ((twa) this.f).get();
            vli a = vlj.a();
            a.f((Uri) this.c.get());
            a.e(trb.a);
            a.g(false);
            a.b(tzh.m(context, txtVar.a, (tyk) this.e.get(), akemVar));
            return txtVar.b.a(a.a());
        } else if (i == 1) {
            txt txtVar2 = this.a;
            Context context2 = ((txh) this.b).get();
            vjb vjbVar2 = (vjb) this.d.get();
            akem akemVar2 = ((twa) this.f).get();
            vli a2 = vlj.a();
            a2.f((Uri) this.c.get());
            a2.e(tqt.a);
            a2.g(false);
            a2.b(tzh.l(context2, txtVar2.a, (tyk) this.e.get(), akemVar2));
            return txtVar2.b.a(a2.a());
        } else if (i == 2) {
            txt txtVar3 = this.a;
            Context context3 = ((txh) this.b).get();
            vjb vjbVar3 = (vjb) this.d.get();
            akem akemVar3 = ((twa) this.f).get();
            vli a3 = vlj.a();
            a3.f((Uri) this.c.get());
            a3.e(tqt.a);
            a3.g(false);
            a3.b(tzh.l(context3, txtVar3.a, (tyk) this.e.get(), akemVar3));
            return txtVar3.b.a(a3.a());
        } else {
            txt txtVar4 = this.a;
            Context context4 = ((txh) this.b).get();
            vjb vjbVar4 = (vjb) this.d.get();
            akem akemVar4 = ((twa) this.f).get();
            vli a4 = vlj.a();
            a4.f((Uri) this.c.get());
            a4.e(trb.a);
            a4.g(false);
            a4.b(tzh.m(context4, txtVar4.a, (tyk) this.e.get(), akemVar4));
            return txtVar4.b.a(a4.a());
        }
    }
}

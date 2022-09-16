package defpackage;

import android.content.Context;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: aefu  reason: default package */
/* loaded from: classes.dex */
public final class aefu implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;

    public aefu(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    public static yvc b(Context context, azqb azqbVar, ankw ankwVar, azqb azqbVar2) {
        vjf a = vjg.a(context);
        a.e("media");
        a.f("media.pb");
        Uri a2 = a.a();
        vli a3 = vlj.a();
        a3.e(awuj.a);
        a3.f(a2);
        yvh d = yvi.d(azqbVar, ankwVar);
        d.a = zto.g;
        d.c = aber.r;
        d.b(adrz.e);
        d.b = adrz.d;
        a3.b(d.a());
        vlo d2 = vlr.d(context, ankwVar);
        d2.d("last_manual_quality_selection_cpn");
        d2.e(adiz.e);
        a3.b(d2.a());
        return new yvc(vmu.b(((vlk) azqbVar2.get()).a(a3.a())), awuj.a);
    }

    public static aefu c(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aefu(azqbVar, azqbVar2, azqbVar3, azqbVar4);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final yvc get() {
        return b((Context) ((axov) this.a).a, this.b, (ankw) this.c.get(), this.d);
    }
}

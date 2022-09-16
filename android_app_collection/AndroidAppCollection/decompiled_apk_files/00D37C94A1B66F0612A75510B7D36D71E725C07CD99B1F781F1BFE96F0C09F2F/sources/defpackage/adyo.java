package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adyo  reason: default package */
/* loaded from: classes.dex */
public final class adyo implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;
    private final azqb h;
    private final azqb i;
    private final azqb j;
    private final azqb k;

    public adyo(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
        this.f = azqbVar6;
        this.g = azqbVar7;
        this.h = azqbVar8;
        this.i = azqbVar9;
        this.j = azqbVar10;
        this.k = azqbVar11;
    }

    public static adyo a(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11) {
        return new adyo(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11);
    }

    public static ampg c(final Context context, final String str, Object obj, final Executor executor, final aepf aepfVar, atts attsVar, final aadd aaddVar, final aeju aejuVar, Object obj2, final aehz aehzVar, final axxm axxmVar) {
        final adxw adxwVar = (adxw) obj;
        final adzo adzoVar = (adzo) obj2;
        final atts attsVar2 = attsVar != null ? attsVar : atts.b;
        return new ampg() { // from class: adxz
            @Override // defpackage.ampg
            public final Object apply(Object obj3) {
                return new atb(str, adxwVar, executor, aepfVar, attsVar2, axxmVar, aaddVar, (String) obj3, aejuVar, adzoVar, aehzVar);
            }
        };
    }

    @Override // defpackage.azqb
    /* renamed from: b */
    public final ampg get() {
        return c((Context) ((axov) this.a).a, (String) this.b.get(), this.c.get(), (Executor) this.d.get(), (aepf) this.e.get(), ((adym) this.f).get(), (aadd) this.g.get(), (aeju) this.h.get(), this.i.get(), (aehz) this.j.get(), (axxm) this.k.get());
    }
}

package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: adyi  reason: default package */
/* loaded from: classes.dex */
public final class adyi implements axou {
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
    private final azqb l;
    private final azqb m;
    private final azqb n;
    private final azqb o;

    public adyi(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13, azqb azqbVar14, azqb azqbVar15) {
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
        this.l = azqbVar12;
        this.m = azqbVar13;
        this.n = azqbVar14;
        this.o = azqbVar15;
    }

    public static adyi a(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13, azqb azqbVar14, azqb azqbVar15) {
        return new adyi(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar13, azqbVar14, azqbVar15);
    }

    public static aekg b(Context context, final Executor executor, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2, snc sncVar, yrj yrjVar, final String str, Object obj, aant aantVar, final aepf aepfVar, final atts attsVar, attu attuVar, azqb azqbVar, yrd yrdVar, final axxm axxmVar) {
        List list;
        final adxw adxwVar = (adxw) obj;
        if (attsVar == null || attsVar.g.isEmpty()) {
            return null;
        }
        final int max = Math.max(attsVar.m, 0);
        final long j = attsVar.h * 1000;
        HashSet hashSet = new HashSet();
        for (apwf apwfVar : new aops(attsVar.q, atts.a)) {
            hashSet.add(Integer.valueOf(apwfVar.o));
        }
        amqo amqoVar = new amqo() { // from class: adya
            @Override // defpackage.amqo
            public final Object get() {
                String str2 = str;
                adxw adxwVar2 = adxwVar;
                Executor executor2 = executor;
                aepf aepfVar2 = aepfVar;
                atts attsVar2 = attsVar;
                axxm axxmVar2 = axxmVar;
                return new poh(adyf.c(str2, adxwVar2, executor2, aepfVar2, attsVar2, axxmVar2), max, j);
            }
        };
        String str2 = attsVar.g;
        if (attuVar == null) {
            list = new ArrayList();
        } else {
            list = attuVar.b;
        }
        return new aekg(amqoVar, str2, list, attsVar.i * 1000, attsVar.n, attsVar.o, sncVar, true != attsVar.r ? scheduledExecutorService : scheduledExecutorService2, yrjVar, (aeki) azqbVar.get(), aantVar, yrdVar, hashSet);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        return b((Context) ((axov) this.a).a, (Executor) this.b.get(), (ScheduledExecutorService) this.c.get(), (ScheduledExecutorService) this.d.get(), (snc) this.e.get(), (yrj) this.f.get(), (String) this.g.get(), this.h.get(), (aant) this.i.get(), (aepf) this.j.get(), ((adym) this.k).get(), ((adyn) this.l).get(), this.m, (yrd) this.n.get(), (axxm) this.o.get());
    }
}

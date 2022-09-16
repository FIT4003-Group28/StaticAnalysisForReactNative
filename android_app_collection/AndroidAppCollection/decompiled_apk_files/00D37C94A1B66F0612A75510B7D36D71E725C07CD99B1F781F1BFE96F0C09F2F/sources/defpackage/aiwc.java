package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: aiwc  reason: default package */
/* loaded from: classes.dex */
public final class aiwc implements axou {
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
    private final /* synthetic */ int o;

    public aiwc(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13, azqb azqbVar14) {
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
    }

    public aiwc(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13, azqb azqbVar14, int i) {
        this.o = i;
        this.b = azqbVar;
        this.l = azqbVar2;
        this.d = azqbVar3;
        this.m = azqbVar4;
        this.e = azqbVar5;
        this.c = azqbVar6;
        this.i = azqbVar7;
        this.a = azqbVar8;
        this.j = azqbVar9;
        this.n = azqbVar10;
        this.h = azqbVar11;
        this.k = azqbVar12;
        this.f = azqbVar13;
        this.g = azqbVar14;
    }

    public static aiwb a(yni yniVar, Context context, aitm aitmVar, aiwy aiwyVar, ahfm ahfmVar, ScheduledExecutorService scheduledExecutorService, String str, ankt anktVar, axnm axnmVar, aiix aiixVar) {
        return new aiwb(yniVar, context, aitmVar, aiwyVar, ahfmVar, scheduledExecutorService, str, anktVar, axnmVar, aiixVar);
    }

    public static aiwc b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13, azqb azqbVar14) {
        return new aiwc(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar13, azqbVar14);
    }

    public static aiwc c(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13, azqb azqbVar14) {
        return new aiwc(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar13, azqbVar14, 1);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        if (this.o == 0) {
            aiwb a = a((yni) this.a.get(), (Context) ((axov) this.b).a, (aitm) this.c.get(), (aiwy) this.d.get(), (ahfm) ((axov) this.e).a, (ScheduledExecutorService) this.f.get(), (String) this.g.get(), (ankt) this.h.get(), axot.a(this.i), (aiix) this.j.get());
            a.b((aynx) this.k.get(), (aynx) this.l.get(), (aynx) this.m.get(), (aiix) this.n.get());
            return a;
        }
        azqb azqbVar = this.b;
        azqb azqbVar2 = this.l;
        azqb azqbVar3 = this.d;
        azqb azqbVar4 = this.m;
        azqb azqbVar5 = this.e;
        azqb azqbVar6 = this.c;
        azqb azqbVar7 = this.i;
        azqb azqbVar8 = this.a;
        azqb azqbVar9 = this.j;
        azqb azqbVar10 = this.n;
        azqb azqbVar11 = this.h;
        azqb azqbVar12 = this.k;
        azqb azqbVar13 = this.f;
        azqb azqbVar14 = this.g;
        HashMap hashMap = new HashMap();
        vzx.d(hashMap, azqbVar2, azqbVar, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar13, azqbVar14);
        return hashMap;
    }
}

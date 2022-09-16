package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: afey  reason: default package */
/* loaded from: classes.dex */
public final class afey implements axou {
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
    private final /* synthetic */ int l;

    public afey(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11) {
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

    public afey(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, int i) {
        this.l = i;
        this.h = azqbVar;
        this.e = azqbVar2;
        this.g = azqbVar3;
        this.f = azqbVar4;
        this.c = azqbVar5;
        this.b = azqbVar6;
        this.j = azqbVar7;
        this.a = azqbVar8;
        this.i = azqbVar9;
        this.d = azqbVar10;
        this.k = azqbVar11;
    }

    public afey(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, int i, byte[] bArr) {
        this.l = i;
        this.g = azqbVar;
        this.f = azqbVar2;
        this.h = azqbVar3;
        this.c = azqbVar4;
        this.e = azqbVar5;
        this.k = azqbVar6;
        this.a = azqbVar7;
        this.b = azqbVar8;
        this.j = azqbVar9;
        this.d = azqbVar10;
        this.i = azqbVar11;
    }

    public afey(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, int i, char[] cArr) {
        this.l = i;
        this.g = azqbVar;
        this.k = azqbVar2;
        this.e = azqbVar3;
        this.b = azqbVar4;
        this.c = azqbVar5;
        this.h = azqbVar6;
        this.a = azqbVar7;
        this.f = azqbVar8;
        this.j = azqbVar9;
        this.i = azqbVar10;
        this.d = azqbVar11;
    }

    public afey(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, int i, short[] sArr) {
        this.l = i;
        this.c = azqbVar;
        this.e = azqbVar2;
        this.d = azqbVar3;
        this.g = azqbVar4;
        this.f = azqbVar5;
        this.j = azqbVar6;
        this.i = azqbVar7;
        this.a = azqbVar8;
        this.h = azqbVar9;
        this.b = azqbVar10;
        this.k = azqbVar11;
    }

    public static afey a(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11) {
        return new afey(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11);
    }

    public static afey b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11) {
        return new afey(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, 2, (byte[]) null);
    }

    public static afey c(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11) {
        return new afey(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, 3, (char[]) null);
    }

    public static afey d(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11) {
        return new afey(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, 4, (short[]) null);
    }

    public static afex e(yrj yrjVar, snc sncVar, afmw afmwVar, afjz afjzVar, afmq afmqVar, adzt adztVar, aepf aepfVar, agpr agprVar, Context context, afhf afhfVar, zah zahVar) {
        return new afex(yrjVar, sncVar, afmwVar, afjzVar, afmqVar, adztVar, aepfVar, agprVar, context, afhfVar, zahVar, null, null);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        int i = this.l;
        if (i != 0) {
            if (i == 1) {
                amhv.c();
                return new wfv(axot.a(this.h), axot.a(this.e), axot.a(this.g), axot.a(this.f), (Executor) this.c.get(), (Executor) this.b.get(), (aacz) this.j.get(), (acrq) this.a.get(), (snc) this.i.get(), (yni) this.d.get(), (abfh) this.k.get());
            } else if (i == 2) {
                return new ahez((Context) ((axov) this.g).a, this.f, (aijf) this.h.get(), this.c, this.e, (aipq) this.k.get(), (ainx) this.a.get(), (aisx) this.b.get(), (aadd) this.j.get(), axot.a(this.d), (aiix) this.i.get());
            } else {
                if (i == 3) {
                    return new ailf((yni) this.g.get(), (ailv) this.k.get(), (aimy) this.e.get(), (Executor) this.b.get(), (Executor) this.c.get(), ((axpa) this.h).get(), ((ahec) this.a).get(), (snc) this.f.get(), (aadd) this.j.get(), (aiix) this.i.get(), ((zez) this.d).get());
                }
                return new aith(((adys) this.c).get(), (aiqp) this.e.get(), (aios) this.d.get(), (aisx) this.g.get(), (Executor) this.f.get(), (Executor) this.j.get(), (aadd) this.i.get(), ((aisc) this.a).get(), (ailu) this.h.get(), (aiix) this.b.get(), ((aisd) this.k).get());
            }
        }
        return e((yrj) this.a.get(), (snc) this.b.get(), ((ahdy) this.c).get(), (afjz) this.d.get(), (afmq) this.e.get(), (adzt) this.f.get(), (aepf) this.g.get(), (agpr) this.h.get(), (Context) ((axov) this.i).a, (afhf) this.j.get(), (zah) this.k.get());
    }
}

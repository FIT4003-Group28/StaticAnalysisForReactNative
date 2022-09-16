package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: acrd  reason: default package */
/* loaded from: classes.dex */
public final class acrd implements axou {
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
    private final /* synthetic */ int k;

    public acrd(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10) {
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
    }

    public acrd(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, int i) {
        this.k = i;
        this.h = azqbVar;
        this.f = azqbVar2;
        this.a = azqbVar3;
        this.i = azqbVar4;
        this.e = azqbVar5;
        this.j = azqbVar6;
        this.c = azqbVar7;
        this.b = azqbVar8;
        this.g = azqbVar9;
        this.d = azqbVar10;
    }

    public acrd(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, int i, byte[] bArr) {
        this.k = i;
        this.c = azqbVar;
        this.h = azqbVar2;
        this.d = azqbVar3;
        this.i = azqbVar4;
        this.f = azqbVar5;
        this.e = azqbVar6;
        this.g = azqbVar7;
        this.b = azqbVar8;
        this.j = azqbVar9;
        this.a = azqbVar10;
    }

    public acrd(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, int i, char[] cArr) {
        this.k = i;
        this.g = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.b = azqbVar4;
        this.i = azqbVar5;
        this.f = azqbVar6;
        this.a = azqbVar7;
        this.e = azqbVar8;
        this.j = azqbVar9;
        this.h = azqbVar10;
    }

    public acrd(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, int i, int[] iArr) {
        this.k = i;
        this.j = azqbVar;
        this.c = azqbVar2;
        this.i = azqbVar3;
        this.g = azqbVar4;
        this.e = azqbVar5;
        this.a = azqbVar6;
        this.d = azqbVar7;
        this.h = azqbVar8;
        this.b = azqbVar9;
        this.f = azqbVar10;
    }

    public acrd(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, int i, short[] sArr) {
        this.k = i;
        this.c = azqbVar;
        this.h = azqbVar2;
        this.f = azqbVar3;
        this.i = azqbVar4;
        this.b = azqbVar5;
        this.e = azqbVar6;
        this.d = azqbVar7;
        this.g = azqbVar8;
        this.j = azqbVar9;
        this.a = azqbVar10;
    }

    public acrd(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, int i, boolean[] zArr) {
        this.k = i;
        this.c = azqbVar;
        this.h = azqbVar2;
        this.d = azqbVar3;
        this.f = azqbVar4;
        this.e = azqbVar5;
        this.i = azqbVar6;
        this.j = azqbVar7;
        this.a = azqbVar8;
        this.g = azqbVar9;
        this.b = azqbVar10;
    }

    public static acrd a(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10) {
        return new acrd(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10);
    }

    public static acud b(zfq zfqVar, yni yniVar, actm actmVar, actr actrVar, acuf acufVar, Context context, aadd aaddVar, aacz aaczVar, azqb azqbVar, azqb azqbVar2) {
        return new acta(acuc.DEFAULT, zfqVar, yniVar, actmVar, actrVar, acufVar, context, aaddVar, aaczVar, azqbVar, azqbVar2);
    }

    public static wkv c(xir xirVar, wwf wwfVar, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, Set set7, Set set8) {
        return new wkv(xirVar, wwfVar, set, set2, set3, set4, set5, set6, set7, set8);
    }

    public static actm d(Context context, yni yniVar, acrr acrrVar, aacz aaczVar, Map map, acst acstVar, actp actpVar, acss acssVar, aadd aaddVar, axxb axxbVar) {
        return new actm(context, yniVar, acrrVar, aaczVar, map, acstVar, actpVar, acssVar, aaddVar, axxbVar);
    }

    public static adxc e(yrr yrrVar, Context context, Executor executor, String str, aacz aaczVar, azqb azqbVar, aflx aflxVar, yme ymeVar, Executor executor2, yqm yqmVar) {
        return new adxc(yrrVar, context, executor, str, aaczVar, azqbVar, aflxVar, ymeVar, executor2, yqmVar);
    }

    public static aiqf f(aiqp aiqpVar, ahfm ahfmVar, Handler handler, axnm axnmVar, aynx aynxVar, aynx aynxVar2, aynx aynxVar3, aisp aispVar, azqb azqbVar, azqb azqbVar2) {
        return new aiqf(aiqpVar, ahfmVar, handler, axnmVar, aynxVar, aynxVar2, aynxVar3, aispVar, azqbVar, azqbVar2);
    }

    public static aiqp g(azpb azpbVar, azpb azpbVar2, azpb azpbVar3, azpb azpbVar4, azpb azpbVar5, azpb azpbVar6, azpb azpbVar7, azpb azpbVar8, azpb azpbVar9, azpb azpbVar10) {
        return new aiqp(azpbVar, azpbVar2, azpbVar3, azpbVar4, azpbVar5, azpbVar6, azpbVar7, azpbVar8, azpbVar9, azpbVar10);
    }

    public static acrd h(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10) {
        return new acrd(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, 1);
    }

    public static acrd i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10) {
        return new acrd(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, 2, (byte[]) null);
    }

    public static acrd j(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10) {
        return new acrd(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, 3, (char[]) null);
    }

    public static acrd k(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10) {
        return new acrd(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, 4, (short[]) null);
    }

    public static acrd l(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10) {
        return new acrd(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, 5, (int[]) null);
    }

    public static acrd m(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10) {
        return new acrd(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, 6, (boolean[]) null);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        int i = this.k;
        if (i != 0) {
            if (i == 1) {
                return c((xir) this.h.get(), (wwf) this.f.get(), ((axpa) this.a).get(), ((axpa) this.i).get(), ((axpa) this.e).get(), ((axpa) this.j).get(), ((axpa) this.c).get(), (Set) this.b.get(), (Set) this.g.get(), ((axpa) this.d).get());
            }
            if (i == 2) {
                return new acss((acrr) this.c.get(), ((yim) this.h).get(), (ScheduledExecutorService) this.d.get(), (zah) this.i.get(), (snc) this.f.get(), (aadd) this.e.get(), (yni) this.g.get(), (ykw) this.b.get(), (afvn) this.j.get(), (yve) this.a.get());
            }
            if (i == 3) {
                return d((Context) ((axov) this.g).a, (yni) this.c.get(), (acrr) this.d.get(), (aacz) this.b.get(), ((axow) this.i).get(), (acst) this.f.get(), (actp) this.a.get(), (acss) this.e.get(), (aadd) this.j.get(), (axxb) this.h.get());
            }
            if (i == 4) {
                return e((yrr) this.c.get(), (Context) ((axov) this.h).a, (Executor) this.f.get(), (String) this.i.get(), (aacz) this.b.get(), this.e, (aflx) this.d.get(), (yme) this.g.get(), (Executor) this.j.get(), (yqm) this.a.get());
            }
            if (i == 5) {
                aiqf f = f((aiqp) this.j.get(), (ahfm) ((axov) this.c).a, (Handler) this.i.get(), axot.a(this.g), (aynx) this.e.get(), (aynx) this.a.get(), (aynx) this.d.get(), (aisp) this.h.get(), this.b, this.f);
                f.b();
                return f;
            }
            return g((azpb) this.c.get(), (azpb) this.h.get(), (azpb) this.d.get(), (azpb) this.f.get(), (azpb) this.e.get(), (azpb) this.i.get(), (azpb) this.j.get(), (azpb) this.a.get(), (azpb) this.g.get(), (azpb) this.b.get());
        }
        return b((zfq) this.a.get(), (yni) this.b.get(), (actm) this.c.get(), (actr) this.d.get(), (acuf) this.e.get(), (Context) ((axov) this.f).a, (aadd) this.g.get(), (aacz) this.h.get(), this.i, this.j);
    }
}

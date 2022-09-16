package defpackage;

import android.content.Context;
import android.os.Handler;
import android.telephony.TelephonyManager;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: aaib  reason: default package */
/* loaded from: classes.dex */
public final class aaib implements axou {
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
    private final /* synthetic */ int n;

    public aaib(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13) {
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
    }

    public aaib(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13, int i) {
        this.n = i;
        this.b = azqbVar;
        this.h = azqbVar2;
        this.a = azqbVar3;
        this.k = azqbVar4;
        this.f = azqbVar5;
        this.e = azqbVar6;
        this.g = azqbVar7;
        this.d = azqbVar8;
        this.l = azqbVar9;
        this.m = azqbVar10;
        this.j = azqbVar11;
        this.i = azqbVar12;
        this.c = azqbVar13;
    }

    public aaib(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13, int i, byte[] bArr) {
        this.n = i;
        this.j = azqbVar;
        this.b = azqbVar2;
        this.i = azqbVar3;
        this.a = azqbVar4;
        this.d = azqbVar5;
        this.m = azqbVar6;
        this.f = azqbVar7;
        this.k = azqbVar8;
        this.l = azqbVar9;
        this.g = azqbVar10;
        this.c = azqbVar11;
        this.h = azqbVar12;
        this.e = azqbVar13;
    }

    public aaib(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13, int i, char[] cArr) {
        this.n = i;
        this.d = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.a = azqbVar4;
        this.m = azqbVar5;
        this.g = azqbVar6;
        this.l = azqbVar7;
        this.j = azqbVar8;
        this.f = azqbVar9;
        this.i = azqbVar10;
        this.k = azqbVar11;
        this.h = azqbVar12;
        this.e = azqbVar13;
    }

    public static aaib a(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13) {
        return new aaib(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar13);
    }

    public static aaia b(Context context, snc sncVar, yni yniVar, afvn afvnVar, Map map, azqb azqbVar, Executor executor, Executor executor2, Object obj, azqb azqbVar2, aaki aakiVar, aahc aahcVar, azqb azqbVar3) {
        return new aaia(context, sncVar, yniVar, afvnVar, map, azqbVar, executor, executor2, (aakl) obj, azqbVar2, aakiVar, aahcVar, azqbVar3, null);
    }

    public static aapk c(Context context, arov arovVar, TelephonyManager telephonyManager, snc sncVar, azqb azqbVar, azqb azqbVar2, aadd aaddVar, aacz aaczVar, aapm aapmVar, yrj yrjVar, aakl aaklVar, axwp axwpVar, ankw ankwVar) {
        return new aapk(context, arovVar, telephonyManager, sncVar, azqbVar, azqbVar2, aaddVar, aaczVar, aapmVar, yrjVar, aaklVar, axwpVar, ankwVar);
    }

    public static ajdz d(azqb azqbVar, ScheduledExecutorService scheduledExecutorService, azqb azqbVar2, aisq aisqVar, Handler handler, Executor executor, aadd aaddVar, aiix aiixVar, SecureRandom secureRandom, aanz aanzVar, acrr acrrVar) {
        return new ajdz(azqbVar, scheduledExecutorService, azqbVar2, aisqVar, handler, executor, aaddVar, aiixVar, secureRandom, aanzVar, acrrVar);
    }

    public static aaib e(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13) {
        return new aaib(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar13, 1);
    }

    public static aaib f(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13) {
        return new aaib(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar13, 2, (byte[]) null);
    }

    public static aaib g(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13) {
        return new aaib(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar13, 3, (char[]) null);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        int i = this.n;
        if (i != 0) {
            if (i == 1) {
                return new wpq(this.b, this.h, this.a, this.k, this.f, this.e, this.g, this.d, this.l, this.m, this.j, (Executor) this.i.get(), (Executor) this.c.get());
            }
            if (i == 2) {
                return c((Context) ((axov) this.j).a, ((aaaz) this.b).get(), ((amge) this.i).get(), (snc) this.a.get(), this.d, this.m, (aadd) this.f.get(), (aacz) this.k.get(), ((aaba) this.l).get(), (yrj) this.g.get(), (aakl) this.c.get(), (axwp) this.h.get(), (ankw) this.e.get());
            }
            ajdz d = d(this.d, (ScheduledExecutorService) this.b.get(), this.c, (aisq) this.a.get(), (Handler) this.m.get(), (Executor) this.g.get(), (aadd) this.l.get(), (aiix) this.j.get(), (SecureRandom) this.f.get(), ((adys) this.i).get(), (acrr) this.k.get());
            d.z((aynx) this.h.get(), (aynx) this.e.get());
            return d;
        }
        return b((Context) ((axov) this.a).a, (snc) this.b.get(), (yni) this.c.get(), (afvn) this.d.get(), (Map) ((axov) this.e).a, this.f, (Executor) this.g.get(), (Executor) this.h.get(), this.i.get(), this.j, (aaki) this.k.get(), (aahc) this.l.get(), this.m);
    }
}

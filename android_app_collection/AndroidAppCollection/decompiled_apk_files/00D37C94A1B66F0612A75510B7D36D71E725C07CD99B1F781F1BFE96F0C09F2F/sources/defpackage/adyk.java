package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: adyk  reason: default package */
/* loaded from: classes.dex */
public final class adyk implements axou {
    private final azqb A;
    private final azqb B;
    private final azqb C;
    private final azqb D;
    private final azqb E;
    private final azqb F;
    private final azqb G;
    private final azqb H;
    private final azqb I;

    /* renamed from: J  reason: collision with root package name */
    private final azqb f35J;
    private final azqb K;
    private final azqb L;
    private final azqb M;
    private final azqb N;
    private final azqb O;
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
    private final azqb p;
    private final azqb q;
    private final azqb r;
    private final azqb s;
    private final azqb t;
    private final azqb u;
    private final azqb v;
    private final azqb w;
    private final azqb x;
    private final azqb y;
    private final azqb z;

    public adyk(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13, azqb azqbVar14, azqb azqbVar15, azqb azqbVar16, azqb azqbVar17, azqb azqbVar18, azqb azqbVar19, azqb azqbVar20, azqb azqbVar21, azqb azqbVar22, azqb azqbVar23, azqb azqbVar24, azqb azqbVar25, azqb azqbVar26, azqb azqbVar27, azqb azqbVar28, azqb azqbVar29, azqb azqbVar30, azqb azqbVar31, azqb azqbVar32, azqb azqbVar33, azqb azqbVar34, azqb azqbVar35, azqb azqbVar36, azqb azqbVar37, azqb azqbVar38, azqb azqbVar39, azqb azqbVar40, azqb azqbVar41) {
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
        this.p = azqbVar16;
        this.q = azqbVar17;
        this.r = azqbVar18;
        this.s = azqbVar19;
        this.t = azqbVar20;
        this.u = azqbVar21;
        this.v = azqbVar22;
        this.w = azqbVar23;
        this.x = azqbVar24;
        this.y = azqbVar25;
        this.z = azqbVar26;
        this.A = azqbVar27;
        this.B = azqbVar28;
        this.C = azqbVar29;
        this.D = azqbVar30;
        this.E = azqbVar31;
        this.F = azqbVar32;
        this.G = azqbVar33;
        this.H = azqbVar34;
        this.I = azqbVar35;
        this.f35J = azqbVar36;
        this.K = azqbVar37;
        this.L = azqbVar38;
        this.M = azqbVar39;
        this.N = azqbVar40;
        this.O = azqbVar41;
    }

    public static adyk a(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13, azqb azqbVar14, azqb azqbVar15, azqb azqbVar16, azqb azqbVar17, azqb azqbVar18, azqb azqbVar19, azqb azqbVar20, azqb azqbVar21, azqb azqbVar22, azqb azqbVar23, azqb azqbVar24, azqb azqbVar25, azqb azqbVar26, azqb azqbVar27, azqb azqbVar28, azqb azqbVar29, azqb azqbVar30, azqb azqbVar31, azqb azqbVar32, azqb azqbVar33, azqb azqbVar34, azqb azqbVar35, azqb azqbVar36, azqb azqbVar37, azqb azqbVar38, azqb azqbVar39, azqb azqbVar40, azqb azqbVar41) {
        return new adyk(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar13, azqbVar14, azqbVar15, azqbVar16, azqbVar17, azqbVar18, azqbVar19, azqbVar20, azqbVar21, azqbVar22, azqbVar23, azqbVar24, azqbVar25, azqbVar26, azqbVar27, azqbVar28, azqbVar29, azqbVar30, azqbVar31, azqbVar32, azqbVar33, azqbVar34, azqbVar35, azqbVar36, azqbVar37, azqbVar38, azqbVar39, azqbVar40, azqbVar41);
    }

    public static aeov b(Context context, afjz afjzVar, aeoc aeocVar, yrj yrjVar, afle afleVar, azqb azqbVar, afmw afmwVar, String str, ScheduledExecutorService scheduledExecutorService, axnm axnmVar, aepf aepfVar, afjm afjmVar, aant aantVar, aeai aeaiVar, aeha aehaVar, pwx pwxVar, axdi axdiVar, aesh aeshVar, snc sncVar, snc sncVar2, aeju aejuVar, afhj afhjVar, afkd afkdVar, aeln aelnVar, afex afexVar, aegt aegtVar, azqb azqbVar2, afaa afaaVar, affu affuVar, afgz afgzVar, afbq afbqVar, yrd yrdVar, afig afigVar, aeaf aeafVar, afja afjaVar) {
        afki afkiVar = afki.ABR;
        affj affjVar = new affj(sncVar, afjzVar);
        aepc aepcVar = new aepc(context, yrjVar, aehaVar, str, afjzVar, afmwVar, aeocVar, affjVar, aeaiVar, afkdVar);
        aepe aepeVar = new aepe(context, yrjVar, aehaVar, aeocVar, afjzVar);
        afdv afdvVar = new afdv(context, yrjVar, aeaiVar, scheduledExecutorService, afleVar, aepfVar, aejuVar, aehaVar, aeshVar, afjzVar, afmwVar, axdiVar, sncVar2, azqbVar, afjmVar, pwxVar, affjVar, afkdVar, aelnVar, affuVar);
        aewx aewxVar = new aewx(aepfVar, sncVar2, pvq.a, afleVar, new aexi(scheduledExecutorService, aepfVar, aeaiVar, context, afbqVar, aeafVar, afhjVar), axnmVar, afjzVar, yrjVar, context, pwxVar, aehaVar, aejuVar, afmwVar, aeshVar, affjVar, afll.b, afll.d, aeaiVar, azqbVar, axdiVar, afkdVar, aelnVar, afexVar, azqbVar2, afaaVar, afgzVar, yrdVar, afigVar, afjaVar);
        afleVar.a(afld.a(aantVar.get()).a(), 1);
        return new aeov(new afeh(new afep(new afdy(aewxVar, afjzVar, aewxVar, afdvVar, aepcVar, aepeVar), aeaiVar, yrjVar, afjzVar, new Handler(Looper.getMainLooper()), sncVar), afjzVar), new afez(context, afjzVar), afjzVar, aeaiVar, aegtVar, afjaVar);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        Context context = (Context) ((axov) this.a).a;
        afjz afjzVar = (afjz) this.b.get();
        aeoc aeocVar = (aeoc) this.c.get();
        yrj yrjVar = (yrj) this.d.get();
        afle afleVar = (afle) this.e.get();
        afbz afbzVar = (afbz) this.f.get();
        azqb azqbVar = this.g;
        afmw afmwVar = ((ahdy) this.h).get();
        String str = (String) this.i.get();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.j.get();
        axnm a = axot.a(this.k);
        aepf aepfVar = (aepf) this.l.get();
        afjm afjmVar = (afjm) this.m.get();
        aant aantVar = (aant) this.n.get();
        aadd aaddVar = (aadd) this.o.get();
        aeai aeaiVar = (aeai) this.p.get();
        aeha aehaVar = ((aehb) this.q).get();
        pwx pwxVar = (pwx) this.r.get();
        axdi axdiVar = (axdi) this.s.get();
        aesh aeshVar = (aesh) this.t.get();
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.u.get();
        snc sncVar = (snc) this.v.get();
        snc sncVar2 = (snc) this.w.get();
        aeju aejuVar = (aeju) this.x.get();
        afhj afhjVar = (afhj) this.z.get();
        adzt adztVar = (adzt) this.A.get();
        afkd afkdVar = (afkd) this.B.get();
        aeln aelnVar = (aeln) this.C.get();
        afex afexVar = (afex) this.D.get();
        aegt aegtVar = (aegt) this.E.get();
        azqb azqbVar2 = this.F;
        afaa afaaVar = (afaa) this.G.get();
        affu affuVar = (affu) this.H.get();
        afgz afgzVar = ((afha) this.I).get();
        afbq afbqVar = ((afby) this.f35J).get();
        agpr agprVar = (agpr) this.K.get();
        return b(context, afjzVar, aeocVar, yrjVar, afleVar, azqbVar, afmwVar, str, scheduledExecutorService, a, aepfVar, afjmVar, aantVar, aeaiVar, aehaVar, pwxVar, axdiVar, aeshVar, sncVar, sncVar2, aejuVar, afhjVar, afkdVar, aelnVar, afexVar, aegtVar, azqbVar2, afaaVar, affuVar, afgzVar, afbqVar, (yrd) this.L.get(), (afig) this.M.get(), (aeaf) this.N.get(), (afja) this.O.get());
    }
}

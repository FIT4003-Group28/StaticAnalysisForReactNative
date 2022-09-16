package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: aivu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aivu implements ayqb {
    public final /* synthetic */ aivw a;
    private final /* synthetic */ int b;

    public /* synthetic */ aivu(aivw aivwVar) {
        this.a = aivwVar;
    }

    public /* synthetic */ aivu(aivw aivwVar, int i) {
        this.b = i;
        this.a = aivwVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        boolean z = true;
        switch (this.b) {
            case 0:
                ahia ahiaVar = (ahia) obj;
                afiz afizVar = this.a.s;
                if (afizVar == null) {
                    return;
                }
                int a = ahiaVar.a();
                if (a == 2) {
                    afizVar.A();
                    return;
                } else if (a == 3) {
                    afizVar.w();
                    return;
                } else if (a == 5) {
                    afizVar.o();
                    return;
                } else if (a == 6) {
                    afizVar.x();
                    return;
                } else if (a == 7) {
                    afizVar.q();
                    return;
                } else if (a != 9 && a != 10) {
                    return;
                } else {
                    afizVar.B();
                    return;
                }
            case 1:
                ahhx ahhxVar = (ahhx) obj;
                afiz afizVar2 = this.a.s;
                if (afizVar2 == null) {
                    return;
                }
                afizVar2.F(ahhxVar.j(), ahhxVar.g(), ahhxVar.a());
                return;
            case 2:
                aivw aivwVar = this.a;
                aikd aikdVar = (aikd) obj;
                aujv b = aivw.b(aivwVar.e);
                afiz afizVar3 = aivwVar.s;
                if (aikdVar.i != 4 || aivwVar.a == null || afizVar3 == null || !b.e) {
                    return;
                }
                afizVar3.z(aikdVar.g, aikdVar.f);
                return;
            case 3:
                aivw aivwVar2 = this.a;
                aikd aikdVar2 = (aikd) obj;
                aujv b2 = aivw.b(aivwVar2.e);
                afiz afizVar4 = aivwVar2.s;
                if (aikdVar2.i != 4 || aivwVar2.a == null || afizVar4 == null || !b2.e) {
                    return;
                }
                afizVar4.z(aikdVar2.g, aikdVar2.f);
                return;
            case 4:
                atyc atycVar = (atyc) obj;
                afiz afizVar5 = this.a.s;
                if (afizVar5 == null) {
                    return;
                }
                afizVar5.H(atycVar.n);
                return;
            case 5:
                Integer num = (Integer) obj;
                afiz afizVar6 = this.a.s;
                if (afizVar6 == null) {
                    return;
                }
                afizVar6.i(num.intValue());
                return;
            case 6:
                Throwable th = (Throwable) obj;
                afiz afizVar7 = this.a.s;
                if (afizVar7 != null) {
                    afizVar7.v(new afkn(afkl.DEFAULT, "rx", 0L, th));
                    return;
                } else {
                    afus.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                    return;
                }
            case 7:
                aesr aesrVar = (aesr) obj;
                afiz afizVar8 = this.a.s;
                if (afizVar8 == null) {
                    return;
                }
                afizVar8.r(aesrVar);
                return;
            case 8:
                afkn afknVar = (afkn) obj;
                afiz afizVar9 = this.a.s;
                if (afizVar9 == null) {
                    return;
                }
                afizVar9.v(afknVar);
                return;
            case 9:
                ahge ahgeVar = (ahge) obj;
                afiz afizVar10 = this.a.s;
                if (ahgeVar.c() && afizVar10 != null) {
                    afizVar10.E(ahgeVar.b());
                    return;
                } else if (afizVar10 == null) {
                    return;
                } else {
                    afizVar10.t(ahgeVar.b());
                    return;
                }
            case 10:
                ahgh ahghVar = (ahgh) obj;
                afiz afizVar11 = this.a.s;
                if (afizVar11 == null) {
                    return;
                }
                afizVar11.j(ahghVar.a());
                return;
            case 11:
                aivw aivwVar3 = this.a;
                ahgl ahglVar = (ahgl) obj;
                afiz afizVar12 = aivwVar3.s;
                if (afizVar12 == null) {
                    return;
                }
                if (aivwVar3.d()) {
                    afizVar12.s("dedi", new aivv(aivwVar3, 1));
                }
                afizVar12.y();
                return;
            case 12:
                ahgn ahgnVar = (ahgn) obj;
                afiz afizVar13 = this.a.s;
                if (afizVar13 == null) {
                    return;
                }
                int i = ahgnVar.d() == null ? -1 : ahgnVar.d().i;
                if (ahgnVar.d() == null || !ahgnVar.d().b()) {
                    z = false;
                }
                afizVar13.k(i, z, ahgnVar.b(), ahgnVar.a());
                return;
            case 13:
                ahho ahhoVar = (ahho) obj;
                afiz afizVar14 = this.a.s;
                if (afizVar14 == null) {
                    return;
                }
                afizVar14.p(ahhoVar.b(), ahhoVar.i(), ahhoVar.j(), ahhoVar.e(), ahhoVar.f(), ahhoVar.g(), ahhoVar.h());
                return;
            default:
                aivw aivwVar4 = this.a;
                ahhw ahhwVar = (ahhw) obj;
                PlayerResponseModel b3 = ahhwVar.b();
                String e = ahhwVar.e();
                PlayerResponseModel a2 = ahhwVar.a();
                String k = ahhwVar.k();
                aika aikaVar = aika.NEW;
                int ordinal = ahhwVar.c().ordinal();
                if (ordinal == 3) {
                    afiz afizVar15 = aivwVar4.s;
                    if (afizVar15 == null) {
                        return;
                    }
                    if (aivwVar4.d()) {
                        afizVar15.s("dedi", new aivv(aivwVar4));
                    }
                    afizVar15.y();
                    return;
                } else if (ordinal == 4 || ordinal == 5) {
                    if (a2 == null || b3 == null || k == null) {
                        return;
                    }
                    aivwVar4.c(a2.B(), k, aivwVar4.b, b3.c, a2.f().e, a2.c());
                    return;
                } else if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                    return;
                } else {
                    aivwVar4.c(b3.B(), e, aivwVar4.b, b3.c, b3.f().e, b3.c());
                    return;
                }
        }
    }
}

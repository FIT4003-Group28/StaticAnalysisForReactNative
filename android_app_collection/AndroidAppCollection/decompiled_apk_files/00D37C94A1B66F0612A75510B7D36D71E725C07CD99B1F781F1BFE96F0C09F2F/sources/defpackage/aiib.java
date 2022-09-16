package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aiib  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aiib implements ayqb {
    public final /* synthetic */ aiii a;
    private final /* synthetic */ int b;

    public /* synthetic */ aiib(aiii aiiiVar) {
        this.a = aiiiVar;
    }

    public /* synthetic */ aiib(aiii aiiiVar, int i) {
        this.b = i;
        this.a = aiiiVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        asaf[] L;
        awgx awgxVar;
        awgw awgwVar;
        arag aragVar;
        arag aragVar2;
        int i = this.b;
        boolean z = false;
        if (i == 0) {
            aiii aiiiVar = this.a;
            ahhw ahhwVar = (ahhw) obj;
            aika c = ahhwVar.c();
            if (c.a(aika.PLAYBACK_LOADED)) {
                aiiiVar.f = null;
                for (asaf asafVar : ahhwVar.b().L()) {
                    if (asafVar != null && (asafVar.b & 2) != 0) {
                        awgx awgxVar2 = asafVar.d;
                        if (awgxVar2 == null) {
                            awgxVar2 = awgx.a;
                        }
                        aiiiVar.f = awgxVar2;
                        aiiiVar.j = ahhwVar.e();
                    }
                }
            } else if (c.a(aika.NEW, aika.ENDED)) {
                aiiiVar.a();
                aiiiVar.j = "";
                aiiiVar.k = -1;
            }
            aiiiVar.i = c.a(aika.VIDEO_PLAYING);
        } else if (i != 1) {
            aiii aiiiVar2 = this.a;
            ahhx ahhxVar = (ahhx) obj;
            if (!aiiiVar2.i || (awgxVar = aiiiVar2.f) == null) {
                return;
            }
            awgy awgyVar = awgxVar.b;
            if (awgyVar == null) {
                awgyVar = awgy.a;
            }
            if (awgyVar.b != 126827209 || aiiiVar2.h) {
                return;
            }
            awgy awgyVar2 = aiiiVar2.f.b;
            if (awgyVar2 == null) {
                awgyVar2 = awgy.a;
            }
            if (awgyVar2.b == 126827209) {
                awgwVar = (awgw) awgyVar2.c;
            } else {
                awgwVar = awgw.a;
            }
            if (ahhxVar.e() <= TimeUnit.SECONDS.toMillis(awgwVar.d)) {
                return;
            }
            aiiiVar2.k = (int) TimeUnit.MILLISECONDS.toSeconds(ahhxVar.e());
            if (aiiiVar2.d.a() <= awgwVar.c) {
                aiiiVar2.b(awgu.YOU_THERE_EVENT_TYPE_BELOW_LACT_THRESHOLD, awgwVar);
            } else if (awgwVar.f == 0) {
                aiiiVar2.i(awgwVar);
                aiiiVar2.h(awgwVar);
            } else if ((awgwVar.b & 128) == 0 || !awgwVar.i) {
                aiiiVar2.c(awgwVar, false);
            } else {
                ofv ofvVar = aiiiVar2.l;
                aiif aiifVar = new aiif(aiiiVar2, awgwVar);
                aiia aiiaVar = new aiia(aiiiVar2, awgwVar, 1);
                fvg d = fvl.d();
                d.e(true);
                d.i(awgwVar.f);
                if ((awgwVar.b & 1024) != 0) {
                    aragVar = awgwVar.j;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                d.k(ajgl.b(aragVar));
                apok apokVar = awgwVar.k;
                if (apokVar == null) {
                    apokVar = apok.a;
                }
                apoj apojVar = apokVar.c;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
                if ((apojVar.b & 256) != 0) {
                    apok apokVar2 = awgwVar.k;
                    if (apokVar2 == null) {
                        apokVar2 = apok.a;
                    }
                    apoj apojVar2 = apokVar2.c;
                    if (apojVar2 == null) {
                        apojVar2 = apoj.a;
                    }
                    aragVar2 = apojVar2.i;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                } else {
                    aragVar2 = null;
                }
                d.m(ajgl.b(aragVar2), aiiaVar);
                d.b = aiifVar;
                ofvVar.b = d.b();
                ofvVar.a.n(ofvVar.b);
            }
            aiiiVar2.f = null;
        } else {
            aiii aiiiVar3 = this.a;
            if (((ahgn) obj).d() == aijs.REMOTE) {
                z = true;
            }
            aiiiVar3.h = z;
        }
    }
}

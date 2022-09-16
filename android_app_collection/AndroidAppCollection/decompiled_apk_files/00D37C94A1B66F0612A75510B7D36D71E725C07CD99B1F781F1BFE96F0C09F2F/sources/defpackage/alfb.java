package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
@Deprecated
/* renamed from: alfb  reason: default package */
/* loaded from: classes.dex */
public final class alfb {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final Map b;
    private final albo c;
    private final alak d;
    private final alfz e;

    public alfb(Map map, albo alboVar, alak alakVar, alfz alfzVar) {
        this.b = map;
        this.c = alboVar;
        this.d = alakVar;
        this.e = alfzVar;
    }

    public final void a(albg albgVar) {
        alcw alcwVar = albgVar.a;
        alcw alcwVar2 = albgVar.b;
        if (alcwVar == null && alcwVar2 == null) {
            return;
        }
        if (alcwVar != null && alcwVar.equals(alcwVar2)) {
            return;
        }
        if (alcwVar == null) {
            alcwVar2.getClass();
            boolean i = this.c.i();
            boolean h = this.c.h();
            if (i || h) {
                aopa mo52toBuilder = alcwVar2.mo52toBuilder();
                if ((((alcw) mo52toBuilder.instance).c & 8) == 0) {
                    alct alctVar = alct.a;
                    mo52toBuilder.copyOnWrite();
                    alcw alcwVar3 = (alcw) mo52toBuilder.instance;
                    alctVar.getClass();
                    alcwVar3.H = alctVar;
                    alcwVar3.c |= 8;
                }
                alct alctVar2 = ((alcw) mo52toBuilder.instance).H;
                if (alctVar2 == null) {
                    alctVar2 = alct.a;
                }
                avun b = avun.b(alctVar2.d);
                if (b == null) {
                    b = avun.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
                }
                if (b == avun.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN) {
                    aopa createBuilder = alct.a.createBuilder();
                    if (i) {
                        avun avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_WIFI;
                        createBuilder.copyOnWrite();
                        alct alctVar3 = (alct) createBuilder.instance;
                        alctVar3.d = avunVar.aB;
                        alctVar3.b |= 2;
                    } else {
                        avun avunVar2 = avun.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_NETWORK;
                        createBuilder.copyOnWrite();
                        alct alctVar4 = (alct) createBuilder.instance;
                        alctVar4.d = avunVar2.aB;
                        alctVar4.b |= 2;
                    }
                    mo52toBuilder.copyOnWrite();
                    alcw alcwVar4 = (alcw) mo52toBuilder.instance;
                    alct alctVar5 = (alct) createBuilder.mo39build();
                    alctVar5.getClass();
                    alcwVar4.H = alctVar5;
                    alcwVar4.c |= 8;
                }
                alcwVar2 = (alcw) mo52toBuilder.mo39build();
            }
            this.d.h(alcwVar2);
            return;
        }
        String str = alcwVar.e;
        String str2 = alcwVar.k;
        if (alcwVar2 == null) {
            this.d.k(str2, alcwVar.ac);
            this.e.c(str2);
        } else if (TextUtils.equals(alcwVar2.e, str)) {
            if (!TextUtils.equals(alcwVar2.k, str2)) {
                throw new AssertionError("Frontend upload id of an upload job must not change");
            }
            if (!b(alcwVar2)) {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((alfa) it.next()).y(alcwVar2.k);
                }
            }
            alct alctVar6 = alcwVar.H;
            if (alctVar6 == null) {
                alctVar6 = alct.a;
            }
            long j = alctVar6.g;
            alct alctVar7 = alcwVar2.H;
            if (alctVar7 == null) {
                alctVar7 = alct.a;
            }
            if (j != alctVar7.g) {
                alak alakVar = this.d;
                alct alctVar8 = alcwVar2.H;
                if (alctVar8 == null) {
                    alctVar8 = alct.a;
                }
                alakVar.g(str2, alctVar8);
            }
            if (!TextUtils.equals(alcwVar.W, alcwVar2.W)) {
                this.d.m(str2, alcwVar2.W);
            }
            avvd avvdVar = alcwVar.Z;
            if (avvdVar == null) {
                avvdVar = avvd.a;
            }
            avvd avvdVar2 = alcwVar2.Z;
            if (avvdVar2 == null) {
                avvdVar2 = avvd.a;
            }
            if (!avvdVar.equals(avvdVar2)) {
                alak alakVar2 = this.d;
                avvd avvdVar3 = alcwVar2.Z;
                if (avvdVar3 == null) {
                    avvdVar3 = avvd.a;
                }
                alakVar2.l(str2, avvdVar3);
            }
            alcv a = alcv.a(alcwVar.X);
            if (a == null) {
                a = alcv.UNKNOWN;
            }
            alcv a2 = alcv.a(alcwVar2.X);
            if (a2 == null) {
                a2 = alcv.UNKNOWN;
            }
            if (a != a2) {
                alak alakVar3 = this.d;
                alcv a3 = alcv.a(alcwVar2.X);
                if (a3 == null) {
                    a3 = alcv.UNKNOWN;
                }
                alakVar3.n(str2, a3);
            }
            if (alht.a(alcwVar) != alht.a(alcwVar2)) {
                this.d.o(str2, alht.m(alcwVar2));
            }
            boolean z = alcwVar.ac;
            boolean z2 = alcwVar2.ac;
            if (z != z2) {
                this.d.a(str2, z2, false);
            } else if (z && !alcwVar.ad && alcwVar2.ad) {
                this.d.a(str2, true, true);
            }
            boolean z3 = alcwVar.ad;
            boolean z4 = alcwVar2.ad;
            if (z3 != z4 && z4) {
                this.d.j(str2);
            }
            alda aldaVar = alcwVar.i;
            if (aldaVar == null) {
                aldaVar = alda.a;
            }
            alda aldaVar2 = alcwVar2.i;
            if (aldaVar2 == null) {
                aldaVar2 = alda.a;
            }
            if (akzj.f(aldaVar, aldaVar2)) {
                return;
            }
            this.d.c(str2, aldaVar2);
        } else {
            throw new AssertionError("Identity associated with an upload job must not change");
        }
    }

    public final boolean b(alcw alcwVar) {
        alcu a = alcu.a(alcwVar.l);
        if (a == null) {
            a = alcu.UNKNOWN_UPLOAD;
        }
        algh alghVar = (algh) this.b.get(Integer.valueOf(a.g));
        return alghVar != null && alghVar.a(alcwVar);
    }
}

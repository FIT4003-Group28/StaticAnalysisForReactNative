package defpackage;

import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: awhp  reason: default package */
/* loaded from: classes3.dex */
public final class awhp implements avlm {
    private static final EnumSet<dltl> a = EnumSet.of(dltl.EXPLICIT_HOME_WORK, dltl.INFERRED_HOME_WORK, dltl.CURRENT_LOCATION);
    private final bvjj b;
    private final avzh c;
    private final avzj d;

    public awhp(bvjj bvjjVar, avzh avzhVar, avzj avzjVar) {
        this.b = bvjjVar;
        this.c = avzhVar;
        this.d = avzjVar;
    }

    @Override // defpackage.avlm
    public final void a(dlpt dlptVar) {
        int a2;
        int a3;
        dltm dltmVar;
        int a4;
        try {
            avzj avzjVar = this.d;
            dlsw dlswVar = dlptVar.k;
            if (dlswVar == null) {
                dlswVar = dlsw.d;
            }
            btlu c = avzjVar.c(dlswVar);
            dlrj dlrjVar = dlptVar.d;
            if (dlrjVar == null) {
                dlrjVar = dlrj.e;
            }
            dcdg p = dcdn.p();
            for (dltm dltmVar2 : dlrjVar.b) {
                p.f(dltmVar2.b, dltmVar2);
            }
            dcdn b = p.b();
            dlrj dlrjVar2 = dlptVar.e;
            if (dlrjVar2 == null) {
                dlrjVar2 = dlrj.e;
            }
            dltm dltmVar3 = null;
            dltm dltmVar4 = null;
            boolean z = false;
            boolean z2 = false;
            for (dltm dltmVar5 : dlrjVar2.b) {
                int a5 = dltj.a(dltmVar5.d);
                if ((a5 != 0 && a5 == 2) || ((a2 = dltj.a(dltmVar5.d)) != 0 && a2 == 4)) {
                    z2 = true;
                }
                int a6 = dltj.a(dltmVar5.d);
                if (a6 != 0 && a6 == 2 && dltmVar5.p && ((dltmVar = (dltm) b.get(dltmVar5.b)) == null || (a4 = dltj.a(dltmVar.d)) == 0 || a4 == 1)) {
                    dltmVar3 = dltmVar5;
                }
                dltl b2 = dltl.b(dltmVar5.k);
                if (b2 == null) {
                    b2 = dltl.USER_DEFINED;
                }
                if (b2 == dltl.USER_DEFINED) {
                    z = true;
                } else {
                    EnumSet<dltl> enumSet = a;
                    dltl b3 = dltl.b(dltmVar5.k);
                    if (b3 == null) {
                        b3 = dltl.USER_DEFINED;
                    }
                    if (enumSet.contains(b3) && ((a3 = dltj.a(dltmVar5.d)) == 0 || a3 == 1)) {
                        if (!dltmVar5.n) {
                            dltmVar4 = dltmVar5;
                        }
                    }
                }
            }
            this.c.b();
            if (dltmVar3 != null) {
                this.b.ad(bvjk.bC, c, dltmVar3.a);
                this.b.aa(bvjk.bD, c, bvop.i(dltmVar3.j));
            } else if (!z && !z2 && dltmVar4 != null) {
                this.c.d(dltmVar4);
            }
        } catch (avzi e) {
            bvoo.j(e);
        }
    }
}

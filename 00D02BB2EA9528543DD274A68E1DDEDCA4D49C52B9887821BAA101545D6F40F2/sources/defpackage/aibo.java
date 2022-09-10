package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aibo  reason: default package */
/* loaded from: classes2.dex */
public final class aibo implements ahvo {
    public static final dcqe a = dcqe.c("aibo");
    public final Executor b;
    public final cjqy c;
    public final ajmq e;
    @dzsi
    public aibu f;
    @dzsi
    public aibb g;
    public final aihe<ailz, aihs> h;
    public final cqat i;
    private final aibv k;
    private final btvo l;
    private final aicf m;
    private final aici n;
    private final aibg o;
    private final Executor p;
    public final Set<ahvl> d = new HashSet();
    private final aibk q = new aibk(this);
    public final ahvl j = new aibl(this);

    public aibo(Executor executor, Executor executor2, aibv aibvVar, cjqy cjqyVar, btvo btvoVar, aicf aicfVar, aici aiciVar, ajmq ajmqVar, aibg aibgVar, aihe<ailz, aihs> aiheVar, cqat cqatVar) {
        this.b = executor;
        this.k = aibvVar;
        this.c = cjqyVar;
        this.l = btvoVar;
        this.m = aicfVar;
        this.n = aiciVar;
        this.e = ajmqVar;
        this.o = aibgVar;
        this.h = aiheVar;
        this.p = executor2;
        this.i = cqatVar;
    }

    @Override // defpackage.ahvo
    public final void a(ahvl ahvlVar) {
        bvrj.UI_THREAD.c();
        this.d.add(ahvlVar);
    }

    @Override // defpackage.ahvo
    public final void b(ahvl ahvlVar) {
        bvrj.UI_THREAD.c();
        this.d.remove(ahvlVar);
    }

    @Override // defpackage.ahvo
    public final void d() {
        bvrj.UI_THREAD.c();
        aibu aibuVar = this.f;
        if (aibuVar != null) {
            aibuVar.c();
        }
    }

    @Override // defpackage.ahvo
    public final boolean e() {
        bvrj.UI_THREAD.c();
        aibu aibuVar = this.f;
        return aibuVar != null && aibuVar.b();
    }

    @Override // defpackage.ahvo
    public final boolean f() {
        bvrj.UI_THREAD.c();
        aibu aibuVar = this.f;
        return aibuVar != null && !aibuVar.b();
    }

    @Override // defpackage.ahvo
    public final List<String> g() {
        bvrj.UI_THREAD.c();
        aibu aibuVar = this.f;
        if (aibuVar == null) {
            bvoo.h("not sharing currently", new Object[0]);
            return dcdc.e();
        }
        List<String> list = aibuVar.f.d;
        if (list != null) {
            return list;
        }
        bvoo.h("not sharing currently", new Object[0]);
        return dcdc.e();
    }

    @Override // defpackage.ahvo
    /* renamed from: h */
    public final aibb c(long j, btlu btluVar, ahvk ahvkVar) {
        aibx aibxVar;
        boolean z;
        dkof dkofVar = this.l.getLocationSharingParameters().q;
        if (dkofVar == null) {
            dkofVar = dkof.s;
        }
        boolean z2 = !dkofVar.f;
        if (!z2) {
            bvoo.h("don't create share when journey sharing is disabled", new Object[0]);
        }
        aibb aibbVar = this.g;
        if (aibbVar != null) {
            aibbVar.a();
            this.g = null;
        }
        aibu aibuVar = this.f;
        if (aibuVar != null) {
            dbsk.s(aibuVar);
            aibuVar.c();
            this.f = null;
        }
        aibn aibnVar = new aibn(this);
        aibv aibvVar = this.k;
        ahvn ahvnVar = ahvn.ARRIVED;
        ahvk ahvkVar2 = ahvk.STANDARD_NAVIGATION;
        int ordinal = ahvkVar.ordinal();
        if (ordinal == 0) {
            aibxVar = this.m;
        } else if (ordinal == 1) {
            aibxVar = this.n;
        } else {
            throw new IllegalStateException("Impossible");
        }
        aibk aibkVar = this.q;
        cqat a2 = aibvVar.a.a();
        aibv.a(a2, 1);
        bvrb a3 = aibvVar.b.a();
        aibv.a(a3, 2);
        aibg a4 = aibvVar.c.a();
        aibv.a(a4, 3);
        btpc a5 = aibvVar.d.a();
        aibv.a(a5, 4);
        aihe<ailz, aihs> a6 = aibvVar.e.a();
        aibv.a(a6, 5);
        aihe<aimj, aiig> a7 = aibvVar.f.a();
        aibv.a(a7, 6);
        aiki a8 = aibvVar.g.a();
        aibv.a(a8, 7);
        btvo a9 = aibvVar.h.a();
        aibv.a(a9, 8);
        aibv.a(aibxVar, 9);
        aibv.a(btluVar, 10);
        aibv.a(aibnVar, 11);
        aibv.a(aibkVar, 12);
        aibu aibuVar2 = new aibu(a2, a3, a4, a5, a6, a7, a8, a9, aibxVar, btluVar, aibnVar, aibkVar);
        aibnVar.a = aibuVar2;
        if (z2) {
            this.f = aibuVar2;
            aica aicaVar = aibuVar2.g;
            synchronized (aicaVar) {
                if (!aicaVar.a) {
                    z = true;
                    aicaVar.a = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                aicaVar.d();
                aicaVar.j();
            }
            aibuVar2.e.d();
        }
        aibb aibbVar2 = new aibb(j, aibuVar2, new aibj(this), z2);
        this.g = aibbVar2;
        return aibbVar2;
    }

    public final void i(btlu btluVar, dcdc<dqzv> dcdcVar) {
        if (dcdcVar.isEmpty() || (dcdcVar.get(0).a & 8) == 0) {
            bvoo.h("Could not get journey id from first ShareAcl.", new Object[0]);
            return;
        }
        dqzn dqznVar = dcdcVar.get(0).e;
        if (dqznVar == null) {
            dqznVar = dqzn.c;
        }
        String str = dqznVar.a;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            dqzv dqzvVar = dcdcVar.get(i);
            if ((dqzvVar.a & 8) != 0) {
                dqzn dqznVar2 = dqzvVar.e;
                if (dqznVar2 == null) {
                    dqznVar2 = dqzn.c;
                }
                i++;
                if (!str.equals(dqznVar2.a)) {
                }
            }
            bvoo.h("Abandoning cancelShare(%s): not all shares belong to the same journey", str);
            return;
        }
        dhnq bZ = dhnr.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhnr dhnrVar = (dhnr) bZ.b;
        str.getClass();
        dhnrVar.a |= 1;
        dhnrVar.b = str;
        aibg aibgVar = this.o;
        deha.q(aibg.a(aibgVar.a.h(), aibgVar.c, btluVar, null).a(bZ.bK()), new aibm(this, dcdcVar, btluVar), this.p);
    }
}

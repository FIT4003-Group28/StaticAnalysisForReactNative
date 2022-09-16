package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axhq  reason: default package */
/* loaded from: classes3.dex */
public class axhq {
    public btlu a;
    public final z<Boolean> b = new z<>(false);
    public final bvjj c;
    private final akfa d;
    private final Executor e;
    private final btvo f;

    public axhq(bvjj bvjjVar, akfa akfaVar, Executor executor, btvo btvoVar) {
        this.c = bvjjVar;
        this.d = akfaVar;
        this.e = executor;
        this.f = btvoVar;
        akfaVar.C().d(new axho(this), executor);
    }

    public final v<Boolean> a(axhp axhpVar) {
        dzvx.c(axhpVar, "badgeType");
        axhp axhpVar2 = axhp.a;
        if (axhpVar.ordinal() == 0) {
            return this.b;
        }
        throw new dzsw();
    }

    public final void b(btlu btluVar, dqal dqalVar) {
        dzvx.c(dqalVar, "selfFollowInfo");
        if (d()) {
            int i = dqalVar.a;
            if ((i & 1) == 0 && (i & 2) == 0) {
                return;
            }
            boolean z = true;
            if (!dqalVar.b && !dqalVar.c) {
                z = false;
            }
            e(z, btluVar);
        }
    }

    public final void c(btlu btluVar) {
        if (!d()) {
            return;
        }
        e(true, btluVar);
    }

    public final boolean d() {
        return this.f.getPeopleFollowParameters().f;
    }

    public final void e(boolean z, btlu btluVar) {
        btlu btluVar2 = this.a;
        if (dzvx.d(btluVar2 != null ? btluVar2.j() : null, btluVar.j())) {
            this.b.f(Boolean.valueOf(z));
        }
        bvjk bvjkVar = bvjk.gV;
        dbsk.l(d());
        this.c.T(bvjkVar, btluVar, z);
    }
}

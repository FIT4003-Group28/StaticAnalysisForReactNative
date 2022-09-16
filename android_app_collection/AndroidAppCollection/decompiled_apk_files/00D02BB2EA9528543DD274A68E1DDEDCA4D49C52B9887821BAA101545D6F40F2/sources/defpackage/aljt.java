package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aljt  reason: default package */
/* loaded from: classes.dex */
public final class aljt implements aksp, amyb {
    private final Set<alsl> a;
    private final alrv b;
    private final Map<dmti, akqn> c;
    private final bnsn d;
    private final btrm e;
    private final akpq f;
    private final akzh g;
    private final alyj h;
    private final alkp i;

    public aljt(alrv alrvVar, alot alotVar, Map<dmti, akqn> map, bnsn bnsnVar, akpq akpqVar, akzh akzhVar, btrm btrmVar, Context context) {
        alyj alyjVar = new alyj(new alyh(0, 0, 0), new alxs(), -1, 1, 1);
        aljs aljsVar = new aljs(alotVar, bnsnVar, akpqVar, btrmVar, akzhVar, context);
        this.a = new HashSet();
        this.b = alrvVar;
        this.c = map;
        this.d = bnsnVar;
        this.f = akpqVar;
        this.g = akzhVar;
        this.e = btrmVar;
        this.h = alyjVar;
        this.i = aljsVar;
    }

    private static alsl f(aksx aksxVar) {
        dbsk.l(aksxVar instanceof alsl);
        return (alsl) aksxVar;
    }

    @Override // defpackage.amyb
    public final void Pw() {
        synchronized (this.a) {
            for (alsl alslVar : this.a) {
                alslVar.v();
            }
        }
    }

    @Override // defpackage.aksp
    public final void a(aksx aksxVar) {
        alsl f = f(aksxVar);
        synchronized (this.a) {
            this.a.remove(f);
        }
        f.z();
    }

    @Override // defpackage.aksp
    public final akta b(dmmu dmmuVar, akuh akuhVar) {
        also alsoVar;
        if (akuhVar.b() != null) {
            alsoVar = this.b.k;
        } else {
            alsoVar = akuhVar instanceof alow ? ((alow) akuhVar).d : this.b.i;
        }
        also alsoVar2 = alsoVar;
        akqn akqnVar = this.c.get(dmti.SCREEN_SPACE_FLOAT);
        dbsk.s(akqnVar);
        return new alkr(dmmuVar, (akqj) akqnVar, alsoVar2, this.h, akuhVar, this.b, this.i, this.d, this.g, this.f, this.e, this);
    }

    @Override // defpackage.aksp
    public final void c(aksx aksxVar) {
        boolean add;
        alsl f = f(aksxVar);
        synchronized (this.a) {
            add = this.a.add(f);
        }
        if (add) {
            f.x();
        }
    }

    @Override // defpackage.aksp
    public final void d(aksx aksxVar) {
        boolean remove;
        alsl f = f(aksxVar);
        synchronized (this.a) {
            remove = this.a.remove(f);
        }
        if (remove) {
            f.y();
        }
    }
}

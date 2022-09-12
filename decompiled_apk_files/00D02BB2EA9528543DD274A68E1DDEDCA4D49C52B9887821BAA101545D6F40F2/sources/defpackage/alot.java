package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alot  reason: default package */
/* loaded from: classes.dex */
public final class alot implements aktz, amyb {
    public final alrv b;
    private final Map<dmti, akqn> d;
    private final bnsn e;
    private final akpq f;
    private final akzh g;
    private final btrm h;
    private final Context i;
    private final bvnx j;
    private final Set<alsl> k = new HashSet();
    private final Set<alsl> l = new HashSet();
    private static final dcqe c = dcqe.c("alot");
    static final alsk a = new alos();

    public alot(bnsn bnsnVar, alrv alrvVar, Map<dmti, akqn> map, akpq akpqVar, akzh akzhVar, btrm btrmVar, Context context, bvnx bvnxVar) {
        this.b = alrvVar;
        this.d = map;
        this.e = bnsnVar;
        this.f = akpqVar;
        this.g = akzhVar;
        this.h = btrmVar;
        this.i = context;
        this.j = bvnxVar;
    }

    private static alsj j(akte akteVar) {
        dbsk.l(akteVar instanceof alsj);
        return (alsj) akteVar;
    }

    private static alsk k(aktf aktfVar) {
        dbsk.l(aktfVar instanceof alsk);
        return (alsk) aktfVar;
    }

    @Override // defpackage.amyb
    public final void Pw() {
        synchronized (this.k) {
            for (alsl alslVar : this.k) {
                alslVar.v();
            }
        }
        synchronized (this.l) {
            for (alsl alslVar2 : this.l) {
                alslVar2.v();
            }
        }
    }

    @Override // defpackage.aktz
    public final void a(akte akteVar) {
        alsj j = j(akteVar);
        synchronized (this.k) {
            this.k.remove(j);
        }
        j.z();
    }

    @Override // defpackage.aktz
    public final void b(aktf aktfVar) {
        alsk k = k(aktfVar);
        synchronized (this.l) {
            this.l.remove(k);
        }
        k.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0162  */
    @Override // defpackage.aktz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.akte c(final defpackage.dmqg r17, final defpackage.dmti r18) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alot.c(dmqg, dmti):akte");
    }

    @Override // defpackage.aktz
    public final aktf d(dmqi dmqiVar, akvx akvxVar, dmti dmtiVar) {
        akqn akqnVar = this.d.get(dmtiVar);
        alrk alrkVar = (alrk) akvxVar;
        return (akqnVar == null || alrkVar == null) ? a : new allr(this, this.b, this.e, this.f, this.h, this.g, this.i.getResources().getDisplayMetrics().density, dmqiVar, null, alrkVar, akqnVar);
    }

    @Override // defpackage.aktz
    public final aktf e(dmqi dmqiVar, dmti dmtiVar) {
        akqn akqnVar = this.d.get(dmtiVar);
        return akqnVar == null ? a : new allr(this, this.b, this.e, this.f, this.h, this.g, this.i.getResources().getDisplayMetrics().density, dmqiVar, null, this.b.k, akqnVar);
    }

    @Override // defpackage.aktz
    public final void f(akte akteVar) {
        alsj j = j(akteVar);
        synchronized (this.k) {
            this.k.add(j);
        }
        j.x();
    }

    @Override // defpackage.aktz
    public final void g(aktf aktfVar) {
        alsk k = k(aktfVar);
        synchronized (this.l) {
            this.l.add(k);
        }
        k.x();
    }

    @Override // defpackage.aktz
    public final void h(akte akteVar) {
        alsj j = j(akteVar);
        synchronized (this.k) {
            this.k.remove(j);
        }
        j.y();
    }

    @Override // defpackage.aktz
    public final void i(aktf aktfVar) {
        alsk k = k(aktfVar);
        synchronized (this.l) {
            this.l.remove(k);
        }
        k.y();
    }
}

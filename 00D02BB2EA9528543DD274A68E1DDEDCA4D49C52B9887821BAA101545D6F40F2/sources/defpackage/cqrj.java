package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: cqrj  reason: default package */
/* loaded from: classes.dex */
public class cqrj extends abg<cqri> {
    public final cqlk a;
    public cqrh e;
    public cqrf f;
    private final Handler g = new Handler(Looper.getMainLooper());

    public cqrj(cqkj cqkjVar) {
        this.a = new cqlk(cqkjVar);
        j(true);
    }

    public final void b(cqix<?> cqixVar) {
        this.a.b(cqixVar);
    }

    @Override // defpackage.abg
    public final int c() {
        return this.a.d();
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ cqri d(ViewGroup viewGroup, int i) {
        return new cqri(this.a.i(viewGroup, i), this.a.h(i));
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void e(cqri cqriVar, int i) {
        this.a.j(cqriVar.a, i);
    }

    @Override // defpackage.abg
    public final int i(int i) {
        return this.a.f(i);
    }

    @Override // defpackage.abg
    public final long k(int i) {
        return this.a.b.get(i).b().hashCode();
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void l(cqri cqriVar) {
        cqlk.k(cqriVar.a);
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void m(cqri cqriVar) {
        cqri cqriVar2 = cqriVar;
        this.g.post(new cqrg(cqriVar2));
        cqrh cqrhVar = this.e;
        if (cqrhVar == null) {
            return;
        }
        cqrhVar.Rz(cqriVar2.s, cqjz.g(cqriVar2.a).j);
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void n(cqri cqriVar) {
        cqri cqriVar2 = cqriVar;
        if (this.f == null) {
            return;
        }
        V v = cqjz.g(cqriVar2.a).j;
    }

    public final <T extends cqkp> void y() {
        this.a.c();
    }

    public final Object z(int i) {
        return this.a.e(i);
    }
}

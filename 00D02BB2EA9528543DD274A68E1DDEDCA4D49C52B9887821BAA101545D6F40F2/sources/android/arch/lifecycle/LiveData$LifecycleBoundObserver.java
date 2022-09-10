package android.arch.lifecycle;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class LiveData$LifecycleBoundObserver extends u implements l {
    final m a;
    final /* synthetic */ v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(v vVar, m mVar, aa<? super T> aaVar) {
        super(vVar, aaVar);
        this.b = vVar;
        this.a = mVar;
    }

    @Override // defpackage.l
    public final void MV(m mVar, i iVar) {
        j c = this.a.Nh().c();
        if (c == j.DESTROYED) {
            this.b.d(this.c);
            return;
        }
        j jVar = null;
        while (jVar != c) {
            d(a());
            jVar = c;
            c = this.a.Nh().c();
        }
    }

    @Override // defpackage.u
    public final boolean a() {
        return this.a.Nh().c().a(j.STARTED);
    }

    @Override // defpackage.u
    public final boolean b(m mVar) {
        return this.a == mVar;
    }

    @Override // defpackage.u
    public final void c() {
        this.a.Nh().b(this);
    }
}

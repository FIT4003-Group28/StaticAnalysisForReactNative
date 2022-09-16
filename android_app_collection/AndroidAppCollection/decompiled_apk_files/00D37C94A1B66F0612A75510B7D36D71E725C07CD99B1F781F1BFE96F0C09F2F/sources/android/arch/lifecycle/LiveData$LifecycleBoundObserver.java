package android.arch.lifecycle;
/* compiled from: PG */
/* loaded from: classes.dex */
public class LiveData$LifecycleBoundObserver extends r implements j {
    final apy a;
    final /* synthetic */ s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(s sVar, apy apyVar, u uVar) {
        super(sVar, uVar);
        this.b = sVar;
        this.a = apyVar;
    }

    @Override // defpackage.j
    public final void a(apy apyVar, aps apsVar) {
        apt a = this.a.getLifecycle().a();
        if (a == apt.DESTROYED) {
            this.b.j(this.c);
            return;
        }
        apt aptVar = null;
        while (aptVar != a) {
            d(jz());
            aptVar = a;
            a = this.a.getLifecycle().a();
        }
    }

    @Override // defpackage.r
    public final void b() {
        this.a.getLifecycle().e(this);
    }

    @Override // defpackage.r
    public final boolean c(apy apyVar) {
        return this.a == apyVar;
    }

    @Override // defpackage.r
    public final boolean jz() {
        return this.a.getLifecycle().a().a(apt.STARTED);
    }
}

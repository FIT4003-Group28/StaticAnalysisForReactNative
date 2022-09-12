package android.arch.lifecycle;
/* compiled from: PG */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements l {
    private final f a;
    private final l b;

    public FullLifecycleObserverAdapter(f fVar, l lVar) {
        this.a = fVar;
        this.b = lVar;
    }

    @Override // defpackage.l
    public final void MV(m mVar, i iVar) {
        switch (iVar.ordinal()) {
            case 0:
                this.a.a(mVar);
                break;
            case 1:
                this.a.b(mVar);
                break;
            case 2:
                this.a.c(mVar);
                break;
            case 3:
                this.a.d(mVar);
                break;
            case 4:
                this.a.e(mVar);
                break;
            case 5:
                this.a.f(mVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        l lVar = this.b;
        if (lVar != null) {
            lVar.MV(mVar, iVar);
        }
    }
}

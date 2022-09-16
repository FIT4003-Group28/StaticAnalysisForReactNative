package android.arch.lifecycle;
/* compiled from: PG */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements j {
    private final g a;
    private final j b;

    public FullLifecycleObserverAdapter(g gVar, j jVar) {
        this.a = gVar;
        this.b = jVar;
    }

    @Override // defpackage.j
    public final void a(apy apyVar, aps apsVar) {
        switch (apsVar.ordinal()) {
            case 0:
                this.a.lc(apyVar);
                break;
            case 1:
                this.a.nz(apyVar);
                break;
            case 2:
                this.a.kG(apyVar);
                break;
            case 3:
                this.a.nv(apyVar);
                break;
            case 4:
                this.a.nA(apyVar);
                break;
            case 5:
                this.a.ld(apyVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        j jVar = this.b;
        if (jVar != null) {
            jVar.a(apyVar, apsVar);
        }
    }
}

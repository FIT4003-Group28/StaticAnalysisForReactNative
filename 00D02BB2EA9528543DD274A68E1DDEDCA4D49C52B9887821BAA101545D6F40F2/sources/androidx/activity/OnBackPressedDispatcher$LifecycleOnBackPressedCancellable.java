package androidx.activity;
/* compiled from: PG */
/* loaded from: classes.dex */
public class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements l, agc {
    final /* synthetic */ agl a;
    private final k b;
    private final agj c;
    private agc d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(agl aglVar, k kVar, agj agjVar) {
        this.a = aglVar;
        this.b = kVar;
        this.c = agjVar;
        kVar.a(this);
    }

    @Override // defpackage.l
    public final void MV(m mVar, i iVar) {
        if (iVar == i.ON_START) {
            agl aglVar = this.a;
            agj agjVar = this.c;
            aglVar.a.add(agjVar);
            agk agkVar = new agk(aglVar, agjVar);
            agjVar.b(agkVar);
            this.d = agkVar;
        } else if (iVar != i.ON_STOP) {
            if (iVar != i.ON_DESTROY) {
                return;
            }
            b();
        } else {
            agc agcVar = this.d;
            if (agcVar == null) {
                return;
            }
            agcVar.b();
        }
    }

    @Override // defpackage.agc
    public final void b() {
        this.b.b(this);
        this.c.c(this);
        agc agcVar = this.d;
        if (agcVar != null) {
            agcVar.b();
            this.d = null;
        }
    }
}

package androidx.activity;
/* compiled from: PG */
/* loaded from: classes.dex */
public class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements j, abi {
    final /* synthetic */ abs a;
    private final apu b;
    private final abq c;
    private abi d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(abs absVar, apu apuVar, abq abqVar) {
        this.a = absVar;
        this.b = apuVar;
        this.c = abqVar;
        apuVar.c(this);
    }

    @Override // defpackage.j
    public final void a(apy apyVar, aps apsVar) {
        if (apsVar == aps.ON_START) {
            this.d = this.a.a(this.c);
        } else if (apsVar != aps.ON_STOP) {
            if (apsVar != aps.ON_DESTROY) {
                return;
            }
            b();
        } else {
            abi abiVar = this.d;
            if (abiVar == null) {
                return;
            }
            abiVar.b();
        }
    }

    @Override // defpackage.abi
    public final void b() {
        this.b.e(this);
        this.c.d(this);
        abi abiVar = this.d;
        if (abiVar != null) {
            abiVar.b();
            this.d = null;
        }
    }
}

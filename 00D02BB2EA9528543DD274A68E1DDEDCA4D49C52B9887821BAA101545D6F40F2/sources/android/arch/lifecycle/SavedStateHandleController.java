package android.arch.lifecycle;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SavedStateHandleController implements l {
    public final ad a;
    private final String b;
    private boolean c = false;

    public SavedStateHandleController(String str, ad adVar) {
        this.b = str;
        this.a = adVar;
    }

    public static void c(an anVar, avp avpVar, k kVar) {
        Object obj;
        synchronized (anVar.b) {
            obj = anVar.b.get("android.arch.lifecycle.savedstate.vm.tag");
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.c) {
            return;
        }
        savedStateHandleController.b(avpVar, kVar);
        d(avpVar, kVar);
    }

    public static void d(final avp avpVar, final k kVar) {
        j c = kVar.c();
        if (c == j.INITIALIZED || c.a(j.STARTED)) {
            avpVar.c(ae.class);
        } else {
            kVar.a(new l() { // from class: android.arch.lifecycle.SavedStateHandleController.1
                @Override // defpackage.l
                public final void MV(m mVar, i iVar) {
                    if (iVar == i.ON_START) {
                        k.this.b(this);
                        avpVar.c(ae.class);
                    }
                }
            });
        }
    }

    @Override // defpackage.l
    public final void MV(m mVar, i iVar) {
        if (iVar == i.ON_DESTROY) {
            this.c = false;
            mVar.Nh().b(this);
        }
    }

    public final void b(avp avpVar, k kVar) {
        if (!this.c) {
            this.c = true;
            kVar.a(this);
            avpVar.b(this.b, this.a.d);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }
}

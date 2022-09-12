package defpackage;

import android.arch.lifecycle.SavedStateHandleController;
/* compiled from: PG */
/* renamed from: ae  reason: default package */
/* loaded from: classes2.dex */
public final class ae implements avn {
    ae() {
    }

    @Override // defpackage.avn
    public final void a(avr avrVar) {
        if (!(avrVar instanceof ax)) {
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
        aw NA = ((ax) avrVar).NA();
        avp Qg = avrVar.Qg();
        for (String str : NA.b()) {
            SavedStateHandleController.c(NA.a(str), Qg, avrVar.Nh());
        }
        if (NA.b().isEmpty()) {
            return;
        }
        Qg.c(ae.class);
    }
}

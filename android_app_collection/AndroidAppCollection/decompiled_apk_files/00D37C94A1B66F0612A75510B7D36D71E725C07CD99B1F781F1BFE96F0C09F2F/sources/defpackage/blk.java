package defpackage;

import android.os.Bundle;
import androidx.savedstate.Recreator;
/* compiled from: PG */
/* renamed from: blk  reason: default package */
/* loaded from: classes2.dex */
public final class blk {
    public final blj a = new blj();
    private final bll b;

    private blk(bll bllVar) {
        this.b = bllVar;
    }

    public static blk a(bll bllVar) {
        return new blk(bllVar);
    }

    public final void b(Bundle bundle) {
        apu lifecycle = this.b.getLifecycle();
        if (lifecycle.a() != apt.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.c(new Recreator(this.b));
        final blj bljVar = this.a;
        if (bljVar.c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            bljVar.b = bundle.getBundle("android.arch.lifecycle.BundlableSavedStateRegistry.key");
        }
        lifecycle.c(new j() { // from class: androidx.savedstate.SavedStateRegistry$1
            @Override // defpackage.j
            public final void a(apy apyVar, aps apsVar) {
                blj bljVar2;
                boolean z;
                if (apsVar == aps.ON_START) {
                    bljVar2 = blj.this;
                    z = true;
                } else if (apsVar != aps.ON_STOP) {
                    return;
                } else {
                    bljVar2 = blj.this;
                    z = false;
                }
                bljVar2.d = z;
            }
        });
        bljVar.c = true;
    }

    public final void c(Bundle bundle) {
        blj bljVar = this.a;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = bljVar.b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        acr f = bljVar.a.f();
        while (f.hasNext()) {
            acq acqVar = (acq) f.next();
            bundle2.putBundle((String) acqVar.a, ((bli) acqVar.b).a());
        }
        bundle.putBundle("android.arch.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}

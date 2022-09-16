package defpackage;

import android.os.Bundle;
import androidx.savedstate.Recreator;
/* compiled from: PG */
/* renamed from: avq  reason: default package */
/* loaded from: classes.dex */
public final class avq {
    public final avp a = new avp();
    private final avr b;

    private avq(avr avrVar) {
        this.b = avrVar;
    }

    public static avq c(avr avrVar) {
        return new avq(avrVar);
    }

    public final void a(Bundle bundle) {
        k Nh = this.b.Nh();
        if (Nh.c() != j.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        Nh.a(new Recreator(this.b));
        final avp avpVar = this.a;
        if (avpVar.c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            avpVar.b = bundle.getBundle("android.arch.lifecycle.BundlableSavedStateRegistry.key");
        }
        Nh.a(new l() { // from class: androidx.savedstate.SavedStateRegistry$1
            @Override // defpackage.l
            public final void MV(m mVar, i iVar) {
                avp avpVar2;
                boolean z;
                if (iVar == i.ON_START) {
                    avpVar2 = avp.this;
                    z = true;
                } else if (iVar != i.ON_STOP) {
                    return;
                } else {
                    avpVar2 = avp.this;
                    z = false;
                }
                avpVar2.d = z;
            }
        });
        avpVar.c = true;
    }

    public final void b(Bundle bundle) {
        avp avpVar = this.a;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = avpVar.b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        ahl f = avpVar.a.f();
        while (f.hasNext()) {
            ahk ahkVar = (ahk) f.next();
            bundle2.putBundle((String) ahkVar.a, ((avo) ahkVar.b).a());
        }
        bundle.putBundle("android.arch.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}

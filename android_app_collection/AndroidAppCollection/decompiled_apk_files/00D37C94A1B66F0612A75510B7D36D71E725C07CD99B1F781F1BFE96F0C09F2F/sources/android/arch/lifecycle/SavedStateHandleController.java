package android.arch.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements j {
    public final x a;
    private final String b;
    private boolean c = false;

    public SavedStateHandleController(String str, x xVar) {
        this.b = str;
        this.a = xVar;
    }

    public static SavedStateHandleController b(blj bljVar, apu apuVar, String str, Bundle bundle) {
        x xVar;
        Bundle a = bljVar.a(str);
        if (a != null || bundle != null) {
            HashMap hashMap = new HashMap();
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    hashMap.put(str2, bundle.get(str2));
                }
            }
            if (a == null) {
                xVar = new x(hashMap);
            } else {
                ArrayList parcelableArrayList = a.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = a.getParcelableArrayList("values");
                if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                    for (int i = 0; i < parcelableArrayList.size(); i++) {
                        hashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
                    }
                    xVar = new x(hashMap);
                } else {
                    throw new IllegalStateException("Invalid bundle passed as restored state");
                }
            }
        } else {
            xVar = new x();
        }
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, xVar);
        savedStateHandleController.d(bljVar, apuVar);
        e(bljVar, apuVar);
        return savedStateHandleController;
    }

    public static void c(ac acVar, blj bljVar, apu apuVar) {
        Object obj;
        synchronized (acVar.b) {
            obj = acVar.b.get("android.arch.lifecycle.savedstate.vm.tag");
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.c) {
            return;
        }
        savedStateHandleController.d(bljVar, apuVar);
        e(bljVar, apuVar);
    }

    private static void e(final blj bljVar, final apu apuVar) {
        apt a = apuVar.a();
        if (a == apt.INITIALIZED || a.a(apt.STARTED)) {
            bljVar.c(y.class);
        } else {
            apuVar.c(new j() { // from class: android.arch.lifecycle.SavedStateHandleController.1
                @Override // defpackage.j
                public final void a(apy apyVar, aps apsVar) {
                    if (apsVar == aps.ON_START) {
                        apu.this.e(this);
                        bljVar.c(y.class);
                    }
                }
            });
        }
    }

    @Override // defpackage.j
    public final void a(apy apyVar, aps apsVar) {
        if (apsVar == aps.ON_DESTROY) {
            this.c = false;
            apyVar.getLifecycle().e(this);
        }
    }

    final void d(blj bljVar, apu apuVar) {
        if (!this.c) {
            this.c = true;
            apuVar.c(this);
            bljVar.b(this.b, this.a.e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }
}

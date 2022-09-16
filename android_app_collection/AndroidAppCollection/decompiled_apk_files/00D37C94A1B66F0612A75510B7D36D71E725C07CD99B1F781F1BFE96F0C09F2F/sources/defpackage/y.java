package defpackage;

import android.arch.lifecycle.SavedStateHandleController;
/* compiled from: PG */
/* renamed from: y  reason: default package */
/* loaded from: classes4.dex */
public final class y implements blh {
    y() {
    }

    @Override // defpackage.blh
    public final void a(bll bllVar) {
        if (!(bllVar instanceof ak)) {
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
        aj viewModelStore = ((ak) bllVar).getViewModelStore();
        blj savedStateRegistry = bllVar.getSavedStateRegistry();
        for (String str : viewModelStore.b()) {
            SavedStateHandleController.c(viewModelStore.a(str), savedStateRegistry, bllVar.getLifecycle());
        }
        if (viewModelStore.b().isEmpty()) {
            return;
        }
        savedStateRegistry.c(y.class);
    }
}

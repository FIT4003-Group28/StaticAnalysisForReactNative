package androidx.lifecycle;

import androidx.lifecycle.f;
import androidx.savedstate.SavedStateRegistry;
/* loaded from: classes.dex */
final class SavedStateHandleController implements g {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1844a;

    /* renamed from: b  reason: collision with root package name */
    private final r f1845b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements SavedStateRegistry.a {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.a
        public void a(androidx.savedstate.b bVar) {
            if (bVar instanceof v) {
                u d2 = ((v) bVar).d();
                SavedStateRegistry c2 = bVar.c();
                for (String str : d2.b()) {
                    SavedStateHandleController.a(d2.a(str), c2, bVar.a());
                }
                if (d2.b().isEmpty()) {
                    return;
                }
                c2.a(a.class);
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    static void a(s sVar, SavedStateRegistry savedStateRegistry, f fVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) sVar.a("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.a()) {
            return;
        }
        savedStateHandleController.a(savedStateRegistry, fVar);
        b(savedStateRegistry, fVar);
    }

    private static void b(final SavedStateRegistry savedStateRegistry, final f fVar) {
        f.b a2 = fVar.a();
        if (a2 == f.b.INITIALIZED || a2.a(f.b.STARTED)) {
            savedStateRegistry.a(a.class);
        } else {
            fVar.a(new g() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.g
                public void a(i iVar, f.a aVar) {
                    if (aVar == f.a.ON_START) {
                        f.this.b(this);
                        savedStateRegistry.a(a.class);
                    }
                }
            });
        }
    }

    @Override // androidx.lifecycle.g
    public void a(i iVar, f.a aVar) {
        if (aVar == f.a.ON_DESTROY) {
            this.f1844a = false;
            iVar.a().b(this);
        }
    }

    void a(SavedStateRegistry savedStateRegistry, f fVar) {
        if (this.f1844a) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f1844a = true;
        fVar.a(this);
        this.f1845b.a();
        throw null;
    }

    boolean a() {
        return this.f1844a;
    }
}

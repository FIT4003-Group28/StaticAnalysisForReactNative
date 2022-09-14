package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.savedstate.Recreator;
import java.util.Map;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: b  reason: collision with root package name */
    private Bundle f2148b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2149c;

    /* renamed from: d  reason: collision with root package name */
    private Recreator.a f2150d;

    /* renamed from: a  reason: collision with root package name */
    private a.b.a.b.b<String, b> f2147a = new a.b.a.b.b<>();

    /* renamed from: e  reason: collision with root package name */
    boolean f2151e = true;

    /* loaded from: classes.dex */
    public interface a {
        void a(androidx.savedstate.b bVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (this.f2149c) {
            Bundle bundle = this.f2148b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f2148b.remove(str);
            if (this.f2148b.isEmpty()) {
                this.f2148b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f2148b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        a.b.a.b.b<String, b>.d c2 = this.f2147a.c();
        while (c2.hasNext()) {
            Map.Entry next = c2.next();
            bundle2.putBundle((String) next.getKey(), ((b) next.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(f fVar, Bundle bundle) {
        if (!this.f2149c) {
            if (bundle != null) {
                this.f2148b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            fVar.a(new d() { // from class: androidx.savedstate.SavedStateRegistry.1
                @Override // androidx.lifecycle.g
                public void a(i iVar, f.a aVar) {
                    SavedStateRegistry savedStateRegistry;
                    boolean z;
                    if (aVar == f.a.ON_START) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = true;
                    } else if (aVar != f.a.ON_STOP) {
                        return;
                    } else {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = false;
                    }
                    savedStateRegistry.f2151e = z;
                }
            });
            this.f2149c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    public void a(Class<? extends a> cls) {
        if (this.f2151e) {
            if (this.f2150d == null) {
                this.f2150d = new Recreator.a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f2150d.a(cls.getName());
                return;
            } catch (NoSuchMethodException e2) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public void a(String str, b bVar) {
        if (this.f2147a.b(str, bVar) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }
}

package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.f;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f2153a;

    /* renamed from: b  reason: collision with root package name */
    private final SavedStateRegistry f2154b = new SavedStateRegistry();

    private a(b bVar) {
        this.f2153a = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public SavedStateRegistry a() {
        return this.f2154b;
    }

    public void a(Bundle bundle) {
        f a2 = this.f2153a.a();
        if (a2.a() == f.b.INITIALIZED) {
            a2.a(new Recreator(this.f2153a));
            this.f2154b.a(a2, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void b(Bundle bundle) {
        this.f2154b.a(bundle);
    }
}

package android.arch.lifecycle;

import android.arch.lifecycle.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    private final FullLifecycleObserver f66a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver) {
        this.f66a = fullLifecycleObserver;
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public void a(e eVar, c.a aVar) {
        switch (aVar) {
            case ON_CREATE:
                this.f66a.a(eVar);
                return;
            case ON_START:
                this.f66a.b(eVar);
                return;
            case ON_RESUME:
                this.f66a.c(eVar);
                return;
            case ON_PAUSE:
                this.f66a.d(eVar);
                return;
            case ON_STOP:
                this.f66a.e(eVar);
                return;
            case ON_DESTROY:
                this.f66a.f(eVar);
                return;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}

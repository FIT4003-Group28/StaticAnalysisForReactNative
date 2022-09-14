package android.arch.lifecycle;

import android.arch.lifecycle.c;
/* loaded from: classes.dex */
public class SingleGeneratedAdapterObserver implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    private final b f78a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SingleGeneratedAdapterObserver(b bVar) {
        this.f78a = bVar;
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public void a(e eVar, c.a aVar) {
        this.f78a.a(eVar, aVar, false, null);
        this.f78a.a(eVar, aVar, true, null);
    }
}

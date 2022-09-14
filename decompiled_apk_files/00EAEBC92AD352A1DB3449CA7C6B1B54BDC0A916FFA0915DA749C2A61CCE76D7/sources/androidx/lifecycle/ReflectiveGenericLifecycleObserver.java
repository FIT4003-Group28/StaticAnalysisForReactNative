package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1842a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0051a f1843b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1842a = obj;
        this.f1843b = a.f1849c.a(this.f1842a.getClass());
    }

    @Override // androidx.lifecycle.g
    public void a(i iVar, f.a aVar) {
        this.f1843b.a(iVar, aVar, this.f1842a);
    }
}

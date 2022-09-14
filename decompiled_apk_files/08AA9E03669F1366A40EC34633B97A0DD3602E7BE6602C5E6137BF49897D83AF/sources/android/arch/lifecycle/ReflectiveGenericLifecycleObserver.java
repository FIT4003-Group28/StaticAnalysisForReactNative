package android.arch.lifecycle;

import android.arch.lifecycle.a;
import android.arch.lifecycle.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Object f76a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0002a f77b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f76a = obj;
        this.f77b = a.f79a.b(this.f76a.getClass());
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public void a(e eVar, c.a aVar) {
        this.f77b.a(eVar, aVar, this.f76a);
    }
}

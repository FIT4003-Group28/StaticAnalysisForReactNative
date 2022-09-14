package androidx.fragment.app;

import androidx.lifecycle.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class w implements androidx.lifecycle.i {

    /* renamed from: b  reason: collision with root package name */
    private androidx.lifecycle.j f1821b = null;

    @Override // androidx.lifecycle.i
    public androidx.lifecycle.f a() {
        d();
        return this.f1821b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(f.a aVar) {
        this.f1821b.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        if (this.f1821b == null) {
            this.f1821b = new androidx.lifecycle.j(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f1821b != null;
    }
}

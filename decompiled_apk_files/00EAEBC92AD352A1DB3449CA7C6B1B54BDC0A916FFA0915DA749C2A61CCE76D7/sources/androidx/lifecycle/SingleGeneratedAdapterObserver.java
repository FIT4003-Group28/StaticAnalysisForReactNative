package androidx.lifecycle;

import androidx.lifecycle.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SingleGeneratedAdapterObserver implements g {

    /* renamed from: a  reason: collision with root package name */
    private final c f1848a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SingleGeneratedAdapterObserver(c cVar) {
        this.f1848a = cVar;
    }

    @Override // androidx.lifecycle.g
    public void a(i iVar, f.a aVar) {
        this.f1848a.a(iVar, aVar, false, null);
        this.f1848a.a(iVar, aVar, true, null);
    }
}

package androidx.lifecycle;

import androidx.lifecycle.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements g {

    /* renamed from: a  reason: collision with root package name */
    private final c[] f1822a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompositeGeneratedAdaptersObserver(c[] cVarArr) {
        this.f1822a = cVarArr;
    }

    @Override // androidx.lifecycle.g
    public void a(i iVar, f.a aVar) {
        m mVar = new m();
        for (c cVar : this.f1822a) {
            cVar.a(iVar, aVar, false, mVar);
        }
        for (c cVar2 : this.f1822a) {
            cVar2.a(iVar, aVar, true, mVar);
        }
    }
}

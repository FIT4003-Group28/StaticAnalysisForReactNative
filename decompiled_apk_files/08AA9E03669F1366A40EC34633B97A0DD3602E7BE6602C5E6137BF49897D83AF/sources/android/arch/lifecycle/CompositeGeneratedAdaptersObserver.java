package android.arch.lifecycle;

import android.arch.lifecycle.c;
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    private final b[] f65a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompositeGeneratedAdaptersObserver(b[] bVarArr) {
        this.f65a = bVarArr;
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public void a(e eVar, c.a aVar) {
        i iVar = new i();
        for (b bVar : this.f65a) {
            bVar.a(eVar, aVar, false, iVar);
        }
        for (b bVar2 : this.f65a) {
            bVar2.a(eVar, aVar, true, iVar);
        }
    }
}

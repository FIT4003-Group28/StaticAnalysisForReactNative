package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: rzu  reason: default package */
/* loaded from: classes4.dex */
public final class rzu extends b {
    private static final anay e = sbs.e();
    public final rzs d;

    public rzu(Application application, ryl rylVar) {
        super(application);
        rzs rzsVar = null;
        if (!rylVar.d) {
            try {
                rzsVar = rwd.f(application, rylVar.g, rylVar.h);
            } catch (IllegalStateException unused) {
            }
        } else {
            ((anav) ((anav) e.g()).i("com/google/android/libraries/accountlinking/supplier/ManagedDependencySupplierViewModel", "createManagedDependencySupplier", 63, "ManagedDependencySupplierViewModel.java")).q("Custom DependencySupplier is missing");
        }
        this.d = rzsVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ac
    public final void b() {
        rzs rzsVar = this.d;
        if (rzsVar != null) {
            rzsVar.a();
        }
    }
}

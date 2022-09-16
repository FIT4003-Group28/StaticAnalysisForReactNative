package defpackage;

import android.content.Context;
import java.util.concurrent.Executors;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
/* compiled from: PG */
/* renamed from: rzr  reason: default package */
/* loaded from: classes4.dex */
public final class rzr implements rzs {
    private static final anay c = sbs.e();
    public final ayal a;
    public final ankw b;
    private final CronetEngine d;

    public rzr(Context context, String str, int i) {
        CronetEngine mo554build;
        context.getClass();
        str.getClass();
        aqxo.p(i > 0);
        try {
            mo554build = new CronetEngine.Builder(context).mo554build();
        } catch (Throwable th) {
            ((anav) c.k().i("com/google/android/libraries/accountlinking/supplier/DefaultManagedDependencySupplier", "createCronetEngine", 64, "DefaultManagedDependencySupplier.java")).q("Default CronetEngine creation failed. Trying fallback.");
            for (CronetProvider cronetProvider : CronetProvider.getAllProviders(context)) {
                if (cronetProvider.getName().equals(CronetProvider.PROVIDER_NAME_FALLBACK) && cronetProvider.isEnabled()) {
                    ((anav) c.k().i("com/google/android/libraries/accountlinking/supplier/DefaultManagedDependencySupplier", "createCronetEngine", 68, "DefaultManagedDependencySupplier.java")).q("Using fallback CronetEngine");
                    mo554build = cronetProvider.createBuilder().mo554build();
                }
            }
            ((anav) ((anav) c.g()).i("com/google/android/libraries/accountlinking/supplier/DefaultManagedDependencySupplier", "createCronetEngine", 72, "DefaultManagedDependencySupplier.java")).q("Unable to create CronetEngine. No implementation is available.");
            throw new IllegalStateException("There is no implementation of CronetEngine on this device", th);
        }
        this.d = mo554build;
        this.a = aydq.a(str, i, mo554build).c();
        this.b = anlz.e(Executors.newFixedThreadPool(4));
    }

    @Override // defpackage.rzs
    public final void a() {
        this.d.shutdown();
        ayal ayalVar = this.a;
        ayjn ayjnVar = ((ayjo) ayalVar).c;
        int i = ayjn.a;
        ayjnVar.a();
        ((ayji) ((aygz) ayalVar).a).n();
        this.b.shutdown();
    }
}

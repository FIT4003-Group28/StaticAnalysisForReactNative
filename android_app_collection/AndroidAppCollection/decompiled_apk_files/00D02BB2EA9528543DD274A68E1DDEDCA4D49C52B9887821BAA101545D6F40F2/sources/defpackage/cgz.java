package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: cgz  reason: default package */
/* loaded from: classes.dex */
public final class cgz implements cgp {
    public final Set<cij<?>> a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.cgp
    public final void d() {
        for (cij cijVar : cjp.i(this.a)) {
            cijVar.d();
        }
    }

    @Override // defpackage.cgp
    public final void e() {
        for (cij cijVar : cjp.i(this.a)) {
            cijVar.e();
        }
    }

    @Override // defpackage.cgp
    public final void f() {
        for (cij cijVar : cjp.i(this.a)) {
            cijVar.f();
        }
    }
}

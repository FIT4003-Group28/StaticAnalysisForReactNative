package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: cfz  reason: default package */
/* loaded from: classes4.dex */
final class cfz implements cgo {
    private final Set<cgp> a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    @Override // defpackage.cgo
    public final void a(cgp cgpVar) {
        this.a.add(cgpVar);
        if (this.c) {
            cgpVar.f();
        } else if (this.b) {
            cgpVar.d();
        } else {
            cgpVar.e();
        }
    }

    @Override // defpackage.cgo
    public final void b(cgp cgpVar) {
        this.a.remove(cgpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.b = true;
        for (cgp cgpVar : cjp.i(this.a)) {
            cgpVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.b = false;
        for (cgp cgpVar : cjp.i(this.a)) {
            cgpVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        this.c = true;
        for (cgp cgpVar : cjp.i(this.a)) {
            cgpVar.f();
        }
    }
}

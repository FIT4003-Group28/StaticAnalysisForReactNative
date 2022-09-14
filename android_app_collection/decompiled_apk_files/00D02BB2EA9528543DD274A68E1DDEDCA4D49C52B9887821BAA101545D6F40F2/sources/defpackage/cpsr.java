package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cpsr  reason: default package */
/* loaded from: classes5.dex */
public abstract class cpsr<T, D> implements cptb<T, D> {
    private final Set<cpoe> a = new HashSet();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        for (cpoe cpoeVar : this.a) {
            for (cpta<T, D> cptaVar : cpoeVar.a.l) {
                cptaVar.c(cpoeVar.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        for (cpoe cpoeVar : this.a) {
            for (cpta<T, D> cptaVar : cpoeVar.a.l) {
                cptaVar.d();
            }
        }
    }

    @Override // defpackage.cptb
    public final void d(cpoe cpoeVar) {
        this.a.add(cpoeVar);
    }

    @Override // defpackage.cptb
    public final void e(cpoe cpoeVar) {
        this.a.remove(cpoeVar);
    }
}

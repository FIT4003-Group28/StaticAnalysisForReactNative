package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqhq  reason: default package */
/* loaded from: classes.dex */
public final class cqhq {
    final List<cqnf<?>> a = new ArrayList();
    final aim<cqku, Integer> b = new aim<>();
    final List<cqnf<?>> c = new ArrayList();
    int d;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d = 0;
        this.e = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            cqnf<?> cqnfVar = this.a.get(i);
            cqku b = cqnfVar == null ? null : cqnfVar.b();
            if ((b instanceof cqks) && ((cqks) b).a()) {
                this.c.add(cqnfVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(cqku cqkuVar) {
        Integer remove = this.b.remove(cqkuVar);
        if (remove != null) {
            cqnf<?> cqnfVar = this.a.get(remove.intValue());
            if (cqnfVar == null) {
                throw new IllegalStateException("Index exists with null property.");
            }
            if (cqnfVar.c()) {
                this.d--;
            } else {
                this.e--;
            }
            this.a.set(remove.intValue(), null);
            return true;
        }
        return false;
    }
}

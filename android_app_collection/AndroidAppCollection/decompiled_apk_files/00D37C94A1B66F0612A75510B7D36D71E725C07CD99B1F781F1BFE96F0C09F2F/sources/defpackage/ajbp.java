package defpackage;

import java.util.Iterator;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: ajbp  reason: default package */
/* loaded from: classes.dex */
public final class ajbp implements Iterable {
    public final TreeSet a;
    public final TreeSet b;

    public ajbp() {
        ajbo ajboVar = new ajbo();
        this.b = new TreeSet(ajboVar.a);
        this.a = new TreeSet(ajboVar);
    }

    public final Iterator a(long j) {
        return this.b.tailSet(ajbm.r(j)).iterator();
    }

    public final void b(ajbm... ajbmVarArr) {
        for (int i = 0; i <= 0; i++) {
            ajbm ajbmVar = ajbmVarArr[i];
            this.a.add(ajbmVar);
            this.b.add(ajbmVar.n);
            this.b.add(ajbmVar.o);
        }
    }

    public final boolean c(ajbm ajbmVar) {
        return this.a.contains(ajbmVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}

package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: cvzn  reason: default package */
/* loaded from: classes5.dex */
public final class cvzn {
    public boolean a;
    private final CopyOnWriteArrayList<cvzm> b = new CopyOnWriteArrayList<>();

    public final void a(boolean z) {
        if (this.a == z) {
            return;
        }
        this.a = z;
        Iterator<cvzm> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(this.a);
        }
    }

    public final void b(cvzm cvzmVar) {
        this.b.add(cvzmVar);
    }

    public final void c(cvzm cvzmVar) {
        this.b.remove(cvzmVar);
    }
}

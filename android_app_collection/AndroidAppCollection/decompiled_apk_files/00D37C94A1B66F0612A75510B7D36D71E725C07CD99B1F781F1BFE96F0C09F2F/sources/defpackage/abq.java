package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: abq  reason: default package */
/* loaded from: classes.dex */
public abstract class abq {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public boolean b;

    public abq(boolean z) {
        this.b = z;
    }

    public abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(abi abiVar) {
        this.a.add(abiVar);
    }

    public final void c() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((abi) it.next()).b();
        }
    }

    public final void d(abi abiVar) {
        this.a.remove(abiVar);
    }
}

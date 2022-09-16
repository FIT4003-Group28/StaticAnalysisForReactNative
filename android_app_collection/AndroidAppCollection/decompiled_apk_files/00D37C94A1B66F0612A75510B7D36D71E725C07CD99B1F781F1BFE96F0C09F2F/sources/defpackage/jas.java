package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: jas  reason: default package */
/* loaded from: classes3.dex */
public abstract class jas implements jaw {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // defpackage.jaw
    public final void a(jav javVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        javVar.getClass();
        copyOnWriteArrayList.add(javVar);
    }

    public final void b(jbg jbgVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            jbgVar.a((jav) it.next());
        }
    }

    @Override // defpackage.jaw
    public final void c(jav javVar) {
        this.a.remove(javVar);
    }
}

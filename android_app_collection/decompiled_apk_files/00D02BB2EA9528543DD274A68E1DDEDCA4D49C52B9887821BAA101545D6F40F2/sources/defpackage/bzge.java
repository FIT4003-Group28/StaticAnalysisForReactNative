package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bzge  reason: default package */
/* loaded from: classes4.dex */
public final class bzge {
    public final List<bzgd> a = new CopyOnWriteArrayList();

    public final void a() {
        synchronized (this.a) {
        }
        for (bzgd bzgdVar : this.a) {
            if (bzgdVar.b == null) {
                bzgdVar.b();
            } else {
                synchronized (bzgdVar) {
                    if (bzgdVar.a != null) {
                        bzgdVar.b.execute(bzgdVar);
                    }
                }
            }
        }
    }

    public final void b(bzgf bzgfVar, bzgj bzgjVar, @dzsi Executor executor) {
        dbsk.s(bzgfVar);
        dbsk.s(bzgjVar);
        bzgd bzgdVar = new bzgd(this, bzgfVar, executor);
        bzgjVar.a(bzgdVar);
        synchronized (bzgdVar) {
            if (bzgdVar.a != null) {
                this.a.add(bzgdVar);
            }
        }
    }
}

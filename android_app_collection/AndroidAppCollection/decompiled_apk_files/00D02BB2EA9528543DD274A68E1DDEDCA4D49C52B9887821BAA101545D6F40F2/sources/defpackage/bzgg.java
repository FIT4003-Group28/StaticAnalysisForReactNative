package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bzgg  reason: default package */
/* loaded from: classes4.dex */
public final class bzgg implements bzgf, bzgi {
    private final transient WeakReference<bzgf> a;
    private final bzgj b = new bzgj();

    private bzgg(bzgf bzgfVar) {
        dbsk.s(bzgfVar);
        this.a = new WeakReference<>(bzgfVar);
    }

    public static void b(bzgf bzgfVar, bzgh bzghVar, bzgj bzgjVar, @dzsi Executor executor) {
        bzgg bzggVar = new bzgg(bzgfVar);
        synchronized (bzggVar.b) {
            bzgjVar.a(bzggVar);
            bzghVar.d(bzggVar, bzggVar.b, executor);
        }
    }

    @Override // defpackage.bzgi
    public final void Rr() {
        synchronized (this.b) {
            this.b.b();
            this.a.clear();
        }
    }

    @Override // defpackage.bzgf
    public final void a() {
        bzgf bzgfVar = this.a.get();
        if (bzgfVar == null) {
            synchronized (this.b) {
                this.b.b();
            }
            return;
        }
        bzgfVar.a();
    }
}

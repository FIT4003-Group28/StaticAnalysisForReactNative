package defpackage;

import androidx.work.impl.WorkDatabase;
/* compiled from: PG */
/* renamed from: btl  reason: default package */
/* loaded from: classes2.dex */
public final class btl implements Runnable {
    final /* synthetic */ WorkDatabase a;
    final /* synthetic */ String b;
    final /* synthetic */ btn c;

    public btl(btn btnVar, WorkDatabase workDatabase, String str) {
        this.c = btnVar;
        this.a = workDatabase;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bum a = this.a.n().a(this.b);
        if (a == null || !a.c()) {
            return;
        }
        synchronized (this.c.c) {
            this.c.f.put(this.b, a);
            this.c.g.add(a);
            btn btnVar = this.c;
            btnVar.h.a(btnVar.g);
        }
    }
}

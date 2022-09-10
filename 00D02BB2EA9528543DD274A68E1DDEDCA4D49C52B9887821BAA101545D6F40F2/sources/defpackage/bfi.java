package defpackage;

import androidx.work.impl.WorkDatabase;
/* compiled from: PG */
/* renamed from: bfi  reason: default package */
/* loaded from: classes3.dex */
public final class bfi implements Runnable {
    final /* synthetic */ WorkDatabase a;
    final /* synthetic */ String b;
    final /* synthetic */ bfk c;

    public bfi(bfk bfkVar, WorkDatabase workDatabase, String str) {
        this.c = bfkVar;
        this.a = workDatabase;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bgh c = this.a.t().c(this.b);
        if (c == null || !c.e()) {
            return;
        }
        synchronized (this.c.b) {
            this.c.e.put(this.b, c);
            this.c.f.add(c);
            bfk bfkVar = this.c;
            bfkVar.g.a(bfkVar.f);
        }
    }
}

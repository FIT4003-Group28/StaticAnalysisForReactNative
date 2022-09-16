package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: ahfs  reason: default package */
/* loaded from: classes.dex */
public final class ahfs implements afkg {
    private final AtomicLong c = new AtomicLong();
    public final AtomicLong a = new AtomicLong();
    public final AtomicInteger b = new AtomicInteger();

    @Override // defpackage.afkg
    public final void a(afkv afkvVar) {
        if (afkvVar.a == 1) {
            this.a.addAndGet(afkvVar.c);
            this.b.addAndGet(afkvVar.b);
        }
    }

    @Override // defpackage.afkg
    public final /* synthetic */ void b(Exception exc) {
    }

    @Override // defpackage.afkg
    public final /* synthetic */ void c(int i) {
    }

    public final long e() {
        return this.c.get();
    }

    public final void f() {
        this.c.set(0L);
        this.a.set(0L);
        this.b.set(0);
    }

    @Override // defpackage.afkg
    public final void rX(long j) {
        this.c.addAndGet(j);
    }
}

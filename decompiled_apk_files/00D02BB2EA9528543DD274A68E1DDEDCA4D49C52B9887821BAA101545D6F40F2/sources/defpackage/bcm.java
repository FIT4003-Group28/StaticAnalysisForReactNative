package defpackage;

import androidx.work.ListenableWorker;
import defpackage.bcm;
import defpackage.bcn;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bcm  reason: default package */
/* loaded from: classes.dex */
public abstract class bcm<B extends bcm<?, ?>, W extends bcn> {
    bgh b;
    final Set<String> c = new HashSet();
    UUID a = UUID.randomUUID();

    public bcm(Class<? extends ListenableWorker> cls) {
        this.b = new bgh(this.a.toString(), cls.getName());
        d(cls.getName());
    }

    public abstract W a();

    /* JADX WARN: Multi-variable type inference failed */
    public final B b(bbl bblVar) {
        this.b.i = bblVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final B c(bbp bbpVar) {
        this.b.d = bbpVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final B d(String str) {
        this.c.add(str);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final B e(long j, TimeUnit timeUnit) {
        this.b.f = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.b.f) {
            return this;
        }
        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }

    public final W f() {
        W a = a();
        this.a = UUID.randomUUID();
        bgh bghVar = new bgh(this.b);
        this.b = bghVar;
        bghVar.a = this.a.toString();
        return a;
    }
}

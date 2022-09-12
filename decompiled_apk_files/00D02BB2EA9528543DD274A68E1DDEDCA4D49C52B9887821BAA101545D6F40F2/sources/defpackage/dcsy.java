package defpackage;

import android.os.Build;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: dcsy  reason: default package */
/* loaded from: classes.dex */
public final class dcsy extends dcsn {
    public static final AtomicReference<dcsp> a = new AtomicReference<>();
    private static final AtomicLong c = new AtomicLong();
    private static final ConcurrentLinkedQueue<dcsx> d = new ConcurrentLinkedQueue<>();
    private volatile dcrl b;

    public dcsy(String str) {
        super(str);
        boolean z = true;
        boolean z2 = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        boolean z3 = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        if (!"eng".equals(Build.TYPE) && !"userdebug".equals(Build.TYPE)) {
            z = false;
        }
        if (z2 || z3) {
            this.b = new dcso().a(a());
        } else if (!z) {
            this.b = null;
        } else {
            dcsz dcszVar = new dcsz();
            this.b = new dcsz(dcszVar.a, dcszVar.b, false).a(a());
        }
    }

    public static void e() {
        while (true) {
            dcsy poll = dcsw.a.poll();
            if (poll != null) {
                poll.b = a.get().a(poll.a());
            } else {
                f();
                return;
            }
        }
    }

    private static void f() {
        while (true) {
            dcsx poll = d.poll();
            if (poll != null) {
                c.getAndDecrement();
                dcrl dcrlVar = poll.a;
                dcrj dcrjVar = poll.b;
                if (dcrjVar.k() || dcrlVar.b(dcrjVar.d())) {
                    dcrlVar.c(dcrjVar);
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.dcrl
    public final boolean b(Level level) {
        if (this.b != null) {
            return this.b.b(level);
        }
        return true;
    }

    @Override // defpackage.dcrl
    public final void c(dcrj dcrjVar) {
        if (this.b != null) {
            this.b.c(dcrjVar);
            return;
        }
        if (c.incrementAndGet() > 20) {
            d.poll();
        }
        d.offer(new dcsx(this, dcrjVar));
        if (this.b == null) {
            return;
        }
        f();
    }
}

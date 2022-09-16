package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: amq  reason: default package */
/* loaded from: classes.dex */
public final class amq {
    public static final ThreadLocal a = new ThreadLocal();
    public final agd b = new agd();
    final ArrayList c = new ArrayList();
    public final amm d = new amm(this);
    public final Runnable e = new Runnable() { // from class: aml
        @Override // java.lang.Runnable
        public final void run() {
            amm ammVar = amq.this.d;
            ammVar.a.f = SystemClock.uptimeMillis();
            amq amqVar = ammVar.a;
            long j = amqVar.f;
            long uptimeMillis = SystemClock.uptimeMillis();
            for (int i = 0; i < amqVar.c.size(); i++) {
                amn amnVar = (amn) amqVar.c.get(i);
                if (amnVar != null) {
                    Long l = (Long) amqVar.b.get(amnVar);
                    if (l != null) {
                        if (l.longValue() < uptimeMillis) {
                            amqVar.b.remove(amnVar);
                        }
                    }
                    amnVar.a(j);
                }
            }
            if (amqVar.g) {
                int size = amqVar.c.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (amqVar.c.get(size) == null) {
                        amqVar.c.remove(size);
                    }
                }
                amqVar.g = false;
            }
            if (ammVar.a.c.size() > 0) {
                amq amqVar2 = ammVar.a;
                amqVar2.h.a(amqVar2.e);
            }
        }
    };
    long f = 0;
    public boolean g = false;
    public final amp h;

    public amq(amp ampVar) {
        this.h = ampVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return Thread.currentThread() == this.h.a.getThread();
    }
}

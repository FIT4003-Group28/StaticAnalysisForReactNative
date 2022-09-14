package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amqw  reason: default package */
/* loaded from: classes.dex */
public final class amqw {
    private final Map<deaf, Long> a = new HashMap();
    private final cqat b;
    private final btrm c;

    public amqw(cqat cqatVar, btrm btrmVar) {
        this.b = cqatVar;
        this.c = btrmVar;
    }

    public final void a(deaf deafVar, @dzsi dead deadVar) {
        synchronized (this.a) {
            long e = this.b.e();
            boolean z = true;
            if (this.a.get(deafVar) != null && e - this.a.get(deafVar).longValue() < 500) {
                z = false;
            }
            this.a.put(deafVar, Long.valueOf(e));
            if (!z) {
                return;
            }
            this.c.b(new alhf(new alhe(deafVar, deadVar), dtyi.O));
        }
    }

    public final void b(deaf deafVar) {
        a(deafVar, null);
    }
}

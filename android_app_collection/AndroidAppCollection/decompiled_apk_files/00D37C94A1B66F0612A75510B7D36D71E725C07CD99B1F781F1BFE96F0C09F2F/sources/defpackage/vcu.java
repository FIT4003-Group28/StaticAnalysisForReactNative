package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: vcu  reason: default package */
/* loaded from: classes4.dex */
public final class vcu implements vdd {
    private static boolean a;
    private final amqo b;
    private final int c = Math.max(10, 10);

    public vcu(amqo amqoVar) {
        this.b = amqoVar;
    }

    @Override // defpackage.vdd
    public final void a() {
        synchronized (vcu.class) {
            if (!a) {
                long j = this.c;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                ankx ankxVar = (ankx) this.b.get();
                vsr.c(ankxVar.b(new vct(ankxVar, j, timeUnit), j, timeUnit));
                a = true;
            }
        }
    }
}

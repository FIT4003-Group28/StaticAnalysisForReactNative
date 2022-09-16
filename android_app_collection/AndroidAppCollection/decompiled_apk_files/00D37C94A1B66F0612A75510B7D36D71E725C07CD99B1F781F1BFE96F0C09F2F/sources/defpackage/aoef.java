package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: aoef  reason: default package */
/* loaded from: classes.dex */
public final class aoef implements vek {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private final aoee b;

    public aoef(aoee aoeeVar) {
        this.b = aoeeVar;
    }

    @Override // defpackage.vek
    public final void a() {
        if (veg.b() && !a.getAndSet(true)) {
            amlp l = amna.l("AndroidLoggerConfig");
            try {
                ancj ancjVar = new ancj();
                ancjVar.a = this.b;
                if (anck.a.compareAndSet(false, true)) {
                    Object obj = ancjVar.a;
                    if (obj == null) {
                        obj = new ancs();
                    }
                    if (!ancq.a.compareAndSet(null, obj)) {
                        throw new IllegalStateException("Logger backends can only be configured once.");
                    }
                    ancq.e();
                    ancr.a.b.set(ancx.a);
                    l.close();
                    return;
                }
                throw new IllegalStateException("Logger backend configuration may only occur once.");
            } catch (Throwable th) {
                try {
                    l.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
    }
}

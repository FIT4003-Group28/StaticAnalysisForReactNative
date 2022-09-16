package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dav  reason: default package */
/* loaded from: classes3.dex */
public final class dav implements dby {
    public final Map a = new HashMap();
    private final Executor b;

    public dav(Executor executor) {
        this.b = executor;
    }

    @Override // defpackage.dby
    public final void a(Runnable runnable) {
        synchronized (this.a) {
            this.a.remove(runnable);
        }
    }

    @Override // defpackage.dby
    public final void b() {
    }

    @Override // defpackage.dby
    public final void c(Runnable runnable) {
        synchronized (this.a) {
            Integer num = (Integer) this.a.get(runnable);
            Map map = this.a;
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            map.put(runnable, Integer.valueOf(i));
        }
        this.b.execute(new dau(this, runnable));
    }
}

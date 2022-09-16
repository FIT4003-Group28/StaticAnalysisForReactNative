package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bybo  reason: default package */
/* loaded from: classes4.dex */
public final class bybo {
    private final bvrb a;
    private final Map<Runnable, bvpk> b = new aif(2);

    public bybo(bvrb bvrbVar) {
        this.a = bvrbVar;
    }

    public final void a(Runnable runnable, long j) {
        b(runnable);
        bvpk a = bvpk.a(runnable);
        this.b.put(runnable, a);
        this.a.a(a, bvrj.UI_THREAD, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Runnable runnable) {
        if (this.b.containsKey(runnable)) {
            this.b.get(runnable).b();
            this.b.remove(runnable);
        }
    }
}

package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: aeus  reason: default package */
/* loaded from: classes.dex */
public final class aeus implements aevk {
    Runnable a;
    private final Handler c;
    private final aetv d;
    private final amqo e;
    private long f = -1;

    public aeus(Handler handler, aetv aetvVar, amqo amqoVar) {
        this.c = handler;
        this.d = aetvVar;
        this.e = amqoVar;
    }

    @Override // defpackage.aevk
    public final void a() {
        Runnable runnable = this.a;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
        this.f = -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        long longValue = ((Long) this.e.get()).longValue();
        long j = this.f;
        if (j != -1 && longValue - j < 10) {
            this.d.w("mtnp", String.valueOf(longValue));
        }
        this.f = longValue;
        aeur aeurVar = new aeur(this, 1);
        this.a = aeurVar;
        this.c.postDelayed(aeurVar, 5000L);
    }

    @Override // defpackage.aevk
    public final void c() {
        this.a = new aeur(this);
        this.f = ((Long) this.e.get()).longValue();
        this.c.postDelayed(this.a, 5000L);
    }

    @Override // defpackage.aevk
    public final void d() {
        this.c.removeCallbacks(this.a);
        this.f = -1L;
    }
}

package defpackage;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aevv  reason: default package */
/* loaded from: classes.dex */
public final class aevv {
    public final amqo a;
    public final amqo b;
    public final aevy c;
    public final Handler d;
    public boolean e;
    public Runnable f;

    public aevv(Handler handler, aevy aevyVar, amqo amqoVar, amqo amqoVar2) {
        this.d = handler;
        this.c = aevyVar;
        this.a = amqoVar;
        this.b = amqoVar2;
    }

    public final void a() {
        Runnable runnable = this.f;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.f = null;
        }
        if (this.e) {
            return;
        }
        this.e = true;
        this.d.postDelayed(new aevu(this, 1), 1000L);
    }
}

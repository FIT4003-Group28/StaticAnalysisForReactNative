package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: brly  reason: default package */
/* loaded from: classes.dex */
public final class brly extends BroadcastReceiver {
    public final /* synthetic */ brlz a;

    public brly(brlz brlzVar) {
        this.a = brlzVar;
    }

    public final void a(final int i) {
        if (!this.a.c()) {
            if (!this.a.c.e || i >= 5) {
                this.a.a();
            } else {
                this.a.e.a(new Runnable(this, i) { // from class: brlx
                    private final brly a;
                    private final int b;

                    {
                        this.a = this;
                        this.b = i;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a(this.b + 1);
                    }
                }, bvrj.UI_THREAD, (i + 1) * 1000);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a(0);
    }
}

package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cwzj  reason: default package */
/* loaded from: classes5.dex */
final class cwzj implements cwqx {
    final /* synthetic */ dehq a;
    final /* synthetic */ cwzn b;

    public cwzj(cwzn cwznVar, dehq dehqVar) {
        this.b = cwznVar;
        this.a = dehqVar;
    }

    @Override // defpackage.cwqx
    public final void b(Activity activity) {
        final String simpleName = activity.getClass().getSimpleName();
        this.b.b.a(3, simpleName);
        this.b.a();
        this.b.d = this.a.d(new Runnable(this, simpleName) { // from class: cwzi
            private final cwzj a;
            private final String b;

            {
                this.a = this;
                this.b = simpleName;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cwzj cwzjVar = this.a;
                cwzjVar.b.b.a(5, this.b);
            }
        }, 10L, TimeUnit.SECONDS);
    }
}

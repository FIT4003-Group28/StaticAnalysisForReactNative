package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cwzl  reason: default package */
/* loaded from: classes5.dex */
final class cwzl implements cwqy {
    final /* synthetic */ dehq a;
    final /* synthetic */ cwzn b;

    public cwzl(cwzn cwznVar, dehq dehqVar) {
        this.b = cwznVar;
        this.a = dehqVar;
    }

    @Override // defpackage.cwqy
    public final void a(Activity activity) {
        final String simpleName = activity.getClass().getSimpleName();
        this.b.b.a(4, simpleName);
        this.b.a();
        this.b.c = this.a.d(new Runnable(this, simpleName) { // from class: cwzk
            private final cwzl a;
            private final String b;

            {
                this.a = this;
                this.b = simpleName;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cwzl cwzlVar = this.a;
                cwzlVar.b.b.a(6, this.b);
            }
        }, 10L, TimeUnit.SECONDS);
    }
}

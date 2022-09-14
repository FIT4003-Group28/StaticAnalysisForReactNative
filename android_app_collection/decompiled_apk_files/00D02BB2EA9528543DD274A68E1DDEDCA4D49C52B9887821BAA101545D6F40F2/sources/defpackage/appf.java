package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: appf  reason: default package */
/* loaded from: classes2.dex */
final class appf extends azu {
    final /* synthetic */ Handler b;
    final /* synthetic */ azz c;

    public appf(Handler handler, azz azzVar) {
        this.b = handler;
        this.c = azzVar;
    }

    @Override // defpackage.azu
    public final void b() {
        Handler handler = this.b;
        final azz azzVar = this.c;
        handler.post(new Runnable(azzVar) { // from class: appe
            private final azz a;

            {
                this.a = azzVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.start();
            }
        });
    }
}

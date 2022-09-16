package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cwiu  reason: default package */
/* loaded from: classes5.dex */
final class cwiu implements View.OnClickListener {
    public boolean a;
    final /* synthetic */ cwiw b;

    public cwiu(cwiw cwiwVar) {
        this.b = cwiwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a) {
            return;
        }
        this.a = true;
        Runnable runnable = this.b.c;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.b.b;
        if (runnable2 != null) {
            runnable2.run();
        }
        this.b.a.onClick(view);
        Runnable runnable3 = this.b.d;
        if (runnable3 != null) {
            runnable3.run();
        }
        czhz.e(new Runnable(this) { // from class: cwit
            private final cwiu a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a = false;
            }
        });
    }
}

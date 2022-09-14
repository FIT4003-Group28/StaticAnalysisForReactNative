package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cwiw  reason: default package */
/* loaded from: classes5.dex */
public final class cwiw<T> {
    public final View.OnClickListener a;
    public Runnable b;
    public Runnable c;
    public Runnable d;

    public cwiw(View.OnClickListener onClickListener) {
        this.a = onClickListener;
    }

    public final View.OnClickListener a() {
        return new cwiu(this);
    }

    public final void b(final cwiv<T> cwivVar, final int i) {
        this.b = new Runnable(cwivVar, i) { // from class: cwis
            private final cwiv a;
            private final int b;

            {
                this.a = cwivVar;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(this.b);
            }
        };
    }
}

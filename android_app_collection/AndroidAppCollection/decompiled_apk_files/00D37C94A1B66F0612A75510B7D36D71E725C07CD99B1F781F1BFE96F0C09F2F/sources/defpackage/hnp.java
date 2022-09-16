package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
/* compiled from: PG */
/* renamed from: hnp  reason: default package */
/* loaded from: classes3.dex */
public final class hnp {
    public final Context a;
    public final Handler b;
    public View c;
    public View d;
    public int e;
    public View f;
    final Runnable g = new Runnable() { // from class: hnn
        @Override // java.lang.Runnable
        public final void run() {
            hnp.this.a();
        }
    };

    public hnp(Context context, Handler handler) {
        this.a = context;
        this.b = handler;
    }

    public final void a() {
        this.b.removeCallbacks(this.g);
        zag.o(this.c, false);
    }
}

package defpackage;

import android.widget.Toast;
/* compiled from: PG */
/* renamed from: wck  reason: default package */
/* loaded from: classes4.dex */
public final class wck implements Runnable {
    final /* synthetic */ wcl a;
    private int b = 0;

    public wck(wcl wclVar) {
        this.a = wclVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b + 1;
        if (i >= 3) {
            Toast.makeText(this.a.a, "Authentication Failed", 0).show();
            return;
        }
        this.b = i;
        if (!this.a.d.as()) {
            this.a.b.j(1);
        } else {
            this.a.c.postDelayed(this, 300L);
        }
    }
}

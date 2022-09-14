package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cjxo  reason: default package */
/* loaded from: classes4.dex */
public final class cjxo {
    private int a;
    private boolean b = false;
    private final Activity c;

    public cjxo(Activity activity) {
        this.c = activity;
    }

    public final void a(int i) {
        if (!this.b) {
            this.a = this.c.getRequestedOrientation();
            this.b = true;
        }
        this.c.setRequestedOrientation(i);
    }

    public final void b() {
        if (this.b) {
            this.b = false;
            this.c.setRequestedOrientation(this.a);
        }
    }
}

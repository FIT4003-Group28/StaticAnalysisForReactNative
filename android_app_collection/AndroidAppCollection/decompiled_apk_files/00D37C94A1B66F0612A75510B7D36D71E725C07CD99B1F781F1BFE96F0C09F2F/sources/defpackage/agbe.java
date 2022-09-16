package defpackage;

import android.content.Context;
import android.os.PowerManager;
/* compiled from: PG */
/* renamed from: agbe  reason: default package */
/* loaded from: classes.dex */
public final class agbe implements agbh {
    public final zdp a;
    public PowerManager b;
    private final Context c;

    public agbe(Context context, zdp zdpVar) {
        this.c = context;
        this.a = zdpVar;
    }

    public final void a() {
        if (this.b == null) {
            this.b = (PowerManager) this.c.getSystemService("power");
        }
    }
}

package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: yyo  reason: default package */
/* loaded from: classes7.dex */
public final class yyo {
    private final Runnable a;
    private final dehq b;
    @dzsi
    private dehu c;

    public yyo(Runnable runnable, dehq dehqVar) {
        this.a = runnable;
        this.b = dehqVar;
    }

    public final void a() {
        dehu dehuVar = this.c;
        if (dehuVar != null) {
            dehuVar.cancel(false);
            this.c = null;
        }
    }

    public final void b() {
        a();
        dehu d = this.b.d(this.a, 500L, TimeUnit.MILLISECONDS);
        this.c = d;
        bvqd.a(d, this.b);
    }
}

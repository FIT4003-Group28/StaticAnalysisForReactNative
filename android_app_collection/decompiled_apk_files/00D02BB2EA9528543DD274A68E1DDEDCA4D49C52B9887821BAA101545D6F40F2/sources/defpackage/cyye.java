package defpackage;

import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: cyye  reason: default package */
/* loaded from: classes5.dex */
final class cyye implements degu<Boolean> {
    final /* synthetic */ cyyf a;

    public cyye(cyyf cyyfVar) {
        this.a = cyyfVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        int i;
        if (th instanceof InterruptedException) {
            i = 4;
        } else {
            i = th instanceof TimeoutException ? 5 : 2;
        }
        this.a.b.c.f(4, i, cyor.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        if (bool.booleanValue()) {
            this.a.c.b();
        }
    }
}

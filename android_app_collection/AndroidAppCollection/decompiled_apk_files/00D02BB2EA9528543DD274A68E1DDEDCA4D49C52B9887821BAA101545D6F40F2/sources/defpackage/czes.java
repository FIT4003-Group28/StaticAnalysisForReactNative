package defpackage;

import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: czes  reason: default package */
/* loaded from: classes5.dex */
final class czes implements degu<Object> {
    final /* synthetic */ dbtp a;
    final /* synthetic */ czev b;

    public czes(czev czevVar, dbtp dbtpVar) {
        this.b = czevVar;
        this.a = dbtpVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (th instanceof TimeoutException) {
            cypg.c(this.b.d.i, 12, 5, cyor.a);
        } else if (th instanceof InterruptedException) {
            cypg.c(this.b.d.i, 12, 4, cyor.a);
        } else {
            cypg.c(this.b.d.i, 12, 2, cyor.a);
        }
    }

    @Override // defpackage.degu
    public final void b(Object obj) {
        cypg.a(this.b.d.i, 16, this.a, cyor.a);
    }
}

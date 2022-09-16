package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: azug  reason: default package */
/* loaded from: classes2.dex */
public final class azug extends azvq implements azuf {
    public final azuh a;

    public azug(azuh azuhVar) {
        this.a = azuhVar;
    }

    @Override // defpackage.azsc
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        b((Throwable) obj);
        return azqm.a;
    }

    @Override // defpackage.azum
    public final void b(Throwable th) {
        this.a.f(e());
    }

    @Override // defpackage.azuf
    public final boolean c(Throwable th) {
        azvw e = e();
        if (th instanceof CancellationException) {
            return true;
        }
        return e.w(th) && e.ss();
    }
}

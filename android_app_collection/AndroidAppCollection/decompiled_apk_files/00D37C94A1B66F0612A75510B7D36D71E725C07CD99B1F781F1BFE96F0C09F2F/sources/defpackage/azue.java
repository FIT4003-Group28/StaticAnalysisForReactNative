package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: azue  reason: default package */
/* loaded from: classes2.dex */
public final class azue extends azvq {
    public final azub a;

    public azue(azub azubVar) {
        this.a = azubVar;
    }

    @Override // defpackage.azsc
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        b((Throwable) obj);
        return azqm.a;
    }

    @Override // defpackage.azum
    public final void b(Throwable th) {
        azub azubVar = this.a;
        CancellationException h = e().h();
        if (azubVar.k()) {
            azxp azxpVar = (azxp) azubVar.a;
            aztu aztuVar = azxpVar.e;
            while (true) {
                Object obj = aztuVar.a;
                if (azst.c(obj, azxq.b)) {
                    if (azxpVar.e.c(azxq.b, h)) {
                        return;
                    }
                } else if (obj instanceof Throwable) {
                    return;
                } else {
                    if (azxpVar.e.c(obj, null)) {
                        break;
                    }
                }
            }
        }
        azubVar.l(h);
        azubVar.i();
    }
}

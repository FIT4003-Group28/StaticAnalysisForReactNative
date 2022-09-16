package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ogw  reason: default package */
/* loaded from: classes3.dex */
public final class ogw implements ynl {
    final azpo a = azpo.W();
    public final aynr b;
    public final yni c;

    public ogw(final yni yniVar, efc efcVar, ohb ohbVar) {
        this.c = yniVar;
        azdl azdlVar = new azdl(efcVar.a.R().ag(1L), new ayqe() { // from class: ogv
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                ogw ogwVar = ogw.this;
                if (((efb) obj).b != 2) {
                    return aynr.f();
                }
                return ogwVar.a.x();
            }
        });
        azqc.g();
        this.b = azdlVar.F(300L, TimeUnit.SECONDS).g(ohbVar.a(auzb.STARTUP_SIGNAL_BROWSE_FEED_LOADED)).C().n(new aypv() { // from class: ogu
            @Override // defpackage.aypv
            public final void a() {
                yniVar.m(ogw.this);
            }
        });
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ewb ewbVar = (ewb) obj;
                this.a.sm();
                return null;
            } else if (i == 1) {
                ewc ewcVar = (ewc) obj;
                this.a.sm();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ewb.class, ewc.class};
    }
}

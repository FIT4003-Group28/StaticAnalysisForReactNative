package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: lmo  reason: default package */
/* loaded from: classes3.dex */
public final class lmo implements yzv, ynl {
    public acth a;
    public jvc b;

    public lmo(aadd aaddVar, azqb azqbVar, ayor ayorVar) {
        asxp asxpVar = aaddVar.a().e;
        if ((asxpVar == null ? asxp.a : asxpVar).t) {
            ((akpu) azqbVar.get()).c().l(30L, TimeUnit.SECONDS).G(ayorVar).Z(new ayqb() { // from class: lmn
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    actj actjVar;
                    lmo lmoVar = lmo.this;
                    akpw akpwVar = (akpw) obj;
                    if (lmoVar.a == null) {
                        return;
                    }
                    if (akpwVar.a != atnw.EFFECTIVE_CONNECTION_TYPE_SLOW_2G && akpwVar.a != atnw.EFFECTIVE_CONNECTION_TYPE_2G && akpwVar.a != atnw.EFFECTIVE_CONNECTION_TYPE_3G) {
                        return;
                    }
                    if (akpwVar.b == 3) {
                        actjVar = actj.NETWORK_SIGNAL_SLOW_WIFI;
                    } else {
                        actjVar = actj.NETWORK_SIGNAL_SLOW_CELLULAR;
                    }
                    lmoVar.a.oi().D(new acte(actjVar));
                }
            });
        }
    }

    private final void c(boolean z) {
        jvc jvcVar = this.b;
        if (jvcVar != null) {
            jvcVar.m(z);
        }
    }

    @Override // defpackage.yzv
    public final void a() {
        c(false);
    }

    @Override // defpackage.yzv
    public final void b() {
        c(true);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                c(!((ypy) obj).a());
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ypy.class};
    }
}

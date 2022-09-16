package defpackage;

import com.google.android.libraries.youtube.mdx.model.AppStatus;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adpq  reason: default package */
/* loaded from: classes.dex */
final class adpq implements adbb {
    final /* synthetic */ adpt a;
    private final Set b;

    public adpq(adpt adptVar, Set set) {
        this.a = adptVar;
        this.b = set;
    }

    @Override // defpackage.adbb
    public final void a(adid adidVar) {
        adnt e = ((adoa) this.a.c.get()).e();
        if (e == null || e.a() == 0 || !adidVar.equals(e.k()) || adidVar.a.a() != 2) {
            this.a.e.put(adidVar.n, 0);
            adid u = this.a.u(adidVar.n);
            if (u == null) {
                this.a.o(adidVar);
            } else {
                AppStatus appStatus = adidVar.a;
                AppStatus appStatus2 = u.a;
                if (appStatus != appStatus2 && ((appStatus2 == null || !akzj.f(appStatus.e(), appStatus2.e()) || appStatus.j() != appStatus2.j() || !appStatus.h().equals(appStatus2.h())) && ((e == null || !(e.k() instanceof adid) || !adidVar.n.equals(((adid) e.k()).n)) && !adidVar.n() && u.n()))) {
                    this.a.o(adidVar);
                }
            }
            this.b.remove(adidVar);
            return;
        }
        String.valueOf(String.valueOf(adidVar)).length();
        e.D(atcv.MDX_SESSION_DISCONNECT_REASON_SCREEN_APP_STOPPED);
        this.a.q(adidVar);
        this.b.remove(adidVar);
    }

    @Override // defpackage.adbb
    public final /* synthetic */ void b() {
    }
}

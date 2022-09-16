package defpackage;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.ReelWatchSurveyRendererOuterClass;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ics  reason: default package */
/* loaded from: classes3.dex */
public final class ics implements icr {
    private final Set a = Collections.synchronizedSet(new HashSet());
    private final axnm b;
    private final acth c;
    private icq d;

    public ics(axnm axnmVar, acth acthVar) {
        this.b = axnmVar;
        this.c = acthVar;
    }

    private static aumh i(iaj iajVar) {
        aunb aunbVar = iajVar.a().p;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        aumh aumhVar = (aumh) aunbVar.qm(ReelWatchSurveyRendererOuterClass.reelWatchSurveyRenderer);
        aumhVar.getClass();
        return aumhVar;
    }

    private final void j(aumh aumhVar) {
        k(aumhVar.d);
    }

    private final void k(String str) {
        this.a.add(str);
    }

    @Override // defpackage.icr
    public final void a(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        int A;
        acti oi;
        if (reelWatchEndpointOuterClass$ReelWatchEndpoint == null || (reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 32768) == 0) {
            return;
        }
        aunb aunbVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.p;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        aumh aumhVar = (aumh) aunbVar.qm(ReelWatchSurveyRendererOuterClass.reelWatchSurveyRenderer);
        if (this.a.contains(aumhVar.d)) {
            return;
        }
        iai iaiVar = (iai) this.b.get();
        iaj E = iaiVar.m.E(reelWatchEndpointOuterClass$ReelWatchEndpoint, iaiVar.x);
        if (E == null) {
            return;
        }
        long f = iaiVar.f();
        hzs hzsVar = iaiVar.m;
        long j = E.g;
        boolean z = true;
        boolean z2 = false;
        if (j != Long.MIN_VALUE && hzsVar.B(j) == -1) {
            iaj iajVar = new iaj(j, E.d, null, true, true);
            int B = hzsVar.B(E.a);
            aqxo.p(B != -1);
            synchronized (hzsVar.d) {
                int w = hzsVar.w(B);
                if (w >= 0 && w < hzsVar.d.size()) {
                    z2 = true;
                }
                aqxo.p(z2);
                int i = w + 1;
                hzsVar.d.add(i, iajVar);
                A = hzsVar.A(i);
            }
            hzsVar.ol(A);
        } else {
            z = false;
        }
        int B2 = iaiVar.m.B(f);
        if (B2 != -1) {
            iaiVar.x = B2;
        }
        if (!z || (aumhVar.b & 4) == 0 || (oi = this.c.oi()) == null) {
            return;
        }
        oi.D(new acte(aumhVar.e));
    }

    @Override // defpackage.icr
    public final void b() {
        ((ico) this.d).aP();
    }

    @Override // defpackage.icr
    public final void c(String str) {
        k(str);
        ico icoVar = (ico) this.d;
        icoVar.mJ().runOnUiThread(new ibv(icoVar, str));
    }

    @Override // defpackage.icr
    public final void d(iaj iajVar) {
        acti oi;
        aumh i = i(iajVar);
        j(i);
        if ((i.b & 4) != 0 && (oi = this.c.oi()) != null) {
            oi.q(new acte(i.e), null);
        }
        ((iai) this.b.get()).n(iajVar);
    }

    @Override // defpackage.icr
    public final void e(iaj iajVar) {
        acti oi;
        aumh i = i(iajVar);
        j(i);
        if ((i.b & 4) == 0 || (oi = this.c.oi()) == null) {
            return;
        }
        oi.u(new acte(i.e), null);
    }

    @Override // defpackage.icr
    public final void f(String str) {
        k(str);
        ico icoVar = (ico) this.d;
        icoVar.mJ().runOnUiThread(new ibv(icoVar, str, 2));
    }

    @Override // defpackage.icr
    public final void g(iaj iajVar, boolean z) {
        aumh i = i(iajVar);
        ((iai) this.b.get()).n(iajVar);
        if (z) {
            j(i);
        }
    }

    @Override // defpackage.icr
    public final void h(icq icqVar) {
        this.d = icqVar;
    }
}

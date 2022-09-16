package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelSnackbarController;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelRecyclerView;
import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelPlayerView;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: iai  reason: default package */
/* loaded from: classes3.dex */
public final class iai implements gtc {
    public float A;
    public ReelPlayerView B;
    public ibu C;
    public ibp D;
    private final icr G;
    private final iee H;
    private final icw I;

    /* renamed from: J  reason: collision with root package name */
    private final iel f211J;
    private final aadd K;
    private final snc L;
    private final airr M;
    private final boolean N;
    private final aire O;
    private final acth P;
    public final hyu a;
    public final ibd b;
    public final hzt c;
    public final amqo d;
    public final iap e;
    public final iak f;
    public final ReelSnackbarController g;
    public final Executor h;
    public iag l;
    public hzs m;
    public ReelRecyclerView n;
    public iac o;
    public SubtitlesOverlayPresenter p;
    public boolean q;
    public boolean u;
    public final AtomicInteger i = new AtomicInteger(-1);
    public final AtomicInteger j = new AtomicInteger(-1);
    public final List k = new ArrayList();
    public iab r = null;
    public iab s = null;
    public int t = 0;
    public long v = Long.MIN_VALUE;
    public boolean w = true;
    public int x = -1;
    public int y = -1;
    private int Q = 0;
    public iah z = iah.a(0);
    public final ne F = new hzy(this);
    public final hzz E = new hzz(this);

    public iai(aadd aaddVar, amqo amqoVar, airr airrVar, aire aireVar, iee ieeVar, icw icwVar, iap iapVar, iak iakVar, iel ielVar, hzt hztVar, ibe ibeVar, icr icrVar, hyu hyuVar, acth acthVar, Executor executor, snc sncVar, ReelSnackbarController reelSnackbarController) {
        boolean z = false;
        this.K = aaddVar;
        this.d = amqoVar;
        this.M = airrVar;
        this.O = aireVar;
        this.H = ieeVar;
        this.I = icwVar;
        this.f = iakVar;
        this.f211J = ielVar;
        this.e = iapVar;
        this.c = hztVar;
        this.G = icrVar;
        this.a = hyuVar;
        ihp ihpVar = (ihp) ibeVar.a.get();
        ihpVar.getClass();
        azqb azqbVar = ibeVar.b;
        hyu hyuVar2 = (hyu) ibeVar.c.get();
        hyuVar2.getClass();
        snc sncVar2 = (snc) ibeVar.d.get();
        sncVar2.getClass();
        Executor executor2 = (Executor) ibeVar.e.get();
        executor2.getClass();
        this.b = new ibd(ihpVar, azqbVar, hyuVar2, sncVar2, executor2, this);
        this.h = executor;
        Object obj = amqoVar.get();
        if (obj != null) {
            aull aullVar = (aull) obj;
            if ((aullVar.b & 2097152) != 0 && aullVar.q) {
                z = true;
            }
        }
        this.N = z;
        this.P = acthVar;
        this.L = sncVar;
        this.g = reelSnackbarController;
    }

    public static boolean s(aull aullVar) {
        return (aullVar == null || (aullVar.b & 268435456) == 0 || !aullVar.v) ? false : true;
    }

    private final void u() {
        int i = this.Q;
        if (i != 0) {
            this.H.c(i);
            this.Q = 0;
        }
    }

    private final boolean v() {
        Object obj = this.d.get();
        return obj != null && ((aull) obj).w;
    }

    @Override // defpackage.gtc
    public final long a(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        iaj E = this.m.E(reelWatchEndpointOuterClass$ReelWatchEndpoint, this.x);
        if (E == null) {
            return Long.MIN_VALUE;
        }
        return E.a;
    }

    @Override // defpackage.gtc
    public final apzg b(long j) {
        return this.m.H(j);
    }

    @Override // defpackage.gtc
    public final apzg c(long j) {
        return this.m.I(j);
    }

    @Override // defpackage.gtc
    public final void d(long j, ankb ankbVar) {
        apzg H = this.m.H(j);
        if (H != null || !this.b.c(new iaa(this, ankbVar, j, 1))) {
            ankbVar.b(Optional.ofNullable(H));
        }
    }

    @Override // defpackage.gtc
    public final void e(long j, ankb ankbVar) {
        apzg I = this.m.I(j);
        if (I != null || !this.b.c(new iaa(this, ankbVar, j))) {
            ankbVar.b(Optional.ofNullable(I));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long f() {
        int i = this.x;
        if (i == -1) {
            return Long.MIN_VALUE;
        }
        return this.m.D(i);
    }

    public final Optional g() {
        hzs hzsVar = this.m;
        if (hzsVar == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(this.m.G(hzsVar.B(this.v)));
    }

    public final Optional h(long j) {
        return Optional.ofNullable(this.m.F(j));
    }

    public final List i() {
        ArrayList arrayList = new ArrayList();
        this.m.J(new hzu(arrayList, 1));
        return arrayList;
    }

    public final List j() {
        ArrayList arrayList = new ArrayList();
        this.m.J(new hzu(arrayList));
        return arrayList;
    }

    public final void k(List list, List list2) {
        int size;
        List list3 = list2;
        hzs hzsVar = this.m;
        int i = 0;
        if (list3 != null) {
            aqxo.y(list.size() == list2.size());
        }
        if (!list.isEmpty()) {
            synchronized (hzsVar.d) {
                size = hzsVar.d.size();
                long j = size == 0 ? -1L : ((iaj) hzsVar.d.get(size - 1)).a;
                while (i < list.size()) {
                    apzg apzgVar = (apzg) list.get(i);
                    aqxo.y(apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
                    j++;
                    aoob aoobVar = null;
                    if (list3 != null) {
                        aoobVar = (aoob) ((Optional) list3.get(i)).orElse(null);
                    }
                    iaj iajVar = new iaj(j, apzgVar, aoobVar, false, hzsVar.g);
                    if ((((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).b & 32768) != 0) {
                        j++;
                        iajVar.g = j;
                    }
                    hzsVar.d.add(iajVar);
                    i++;
                    list3 = list2;
                }
            }
            hzsVar.l(hzsVar.A(size), list.size());
        }
        iag iagVar = this.l;
        if (iagVar == null || iagVar.b.j.get() < 0) {
            return;
        }
        iagVar.b.h.execute(new iaf(iagVar, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:227:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(boolean r33) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iai.l(boolean):void");
    }

    public final void m(int i) {
        ido idoVar;
        if (i != -1) {
            iaj G = this.m.G(i);
            ibk ibkVar = G == null ? null : G.f;
            if (!(ibkVar instanceof ibi) || (idoVar = ((ibi) ibkVar).v.b) == null) {
                return;
            }
            idoVar.a(i == this.x);
        }
    }

    public final void n(iaj iajVar) {
        int A;
        long f = f();
        hzs hzsVar = this.m;
        int B = hzsVar.B(iajVar.a);
        if (B != -1) {
            synchronized (hzsVar.d) {
                int w = hzsVar.w(B);
                boolean z = false;
                if (w >= 0 && w < hzsVar.d.size()) {
                    z = true;
                }
                aqxo.p(z);
                hzsVar.e = (iaj) hzsVar.d.remove(w);
                A = hzsVar.A(w);
            }
            hzsVar.n(A);
        }
        int B2 = this.m.B(f);
        if (B2 != -1) {
            this.x = B2;
        }
    }

    public final void o(long j, apzg apzgVar) {
        if (apzgVar == null) {
            return;
        }
        Optional h = h(j);
        if (!h.isPresent()) {
            return;
        }
        aqxo.y(apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
        ((iaj) h.get()).d = apzgVar;
    }

    public final boolean p() {
        hzs hzsVar = this.m;
        return hzsVar == null || this.x == hzsVar.z();
    }

    public final boolean q() {
        return this.t == 1;
    }

    public final boolean r() {
        return this.m.f;
    }

    public final int t(iah iahVar) {
        int i = this.x + 1;
        if (i <= this.m.z()) {
            this.g.g();
            this.z = iahVar;
            this.n.a(true);
            this.y = i;
            this.n.al(i);
            return 3;
        } else if (!r() || this.b.k) {
            return 1;
        } else {
            this.g.g();
            if (i <= this.m.x()) {
                this.z = iahVar;
                this.n.al(i);
            }
            return 3;
        }
    }
}

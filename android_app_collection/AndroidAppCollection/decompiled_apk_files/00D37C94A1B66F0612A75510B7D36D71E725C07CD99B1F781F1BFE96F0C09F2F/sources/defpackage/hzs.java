package defpackage;

import android.animation.ObjectAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.ReelWatchSurveyRendererOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: hzs  reason: default package */
/* loaded from: classes3.dex */
public final class hzs extends xo {
    public final List d = new ArrayList();
    public iaj e = null;
    public final boolean f;
    public final boolean g;
    public boolean h;
    private final ibh i;
    private final ibj j;
    private final ies k;
    private final iai l;
    private final boolean m;
    private boolean n;

    public hzs(ibh ibhVar, ibj ibjVar, ies iesVar, iai iaiVar, boolean z, boolean z2, boolean z3) {
        this.i = ibhVar;
        this.j = ibjVar;
        this.k = iesVar;
        this.l = iaiVar;
        this.f = z;
        this.m = z2;
        this.g = z3;
        this.h = z;
        this.n = z;
        q(true);
    }

    private final int L() {
        return this.m ? 1 : 0;
    }

    private static boolean M(iaj iajVar, ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        if (iajVar != null && !iajVar.b && iajVar.d.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) iajVar.d.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            if (reelWatchEndpointOuterClass$ReelWatchEndpoint.d.equals(reelWatchEndpointOuterClass$ReelWatchEndpoint2.d) && reelWatchEndpointOuterClass$ReelWatchEndpoint.e.equals(reelWatchEndpointOuterClass$ReelWatchEndpoint2.e)) {
                return true;
            }
        }
        return false;
    }

    public final int A(int i) {
        return i + L();
    }

    public final int B(long j) {
        synchronized (this.d) {
            for (int i = 0; i < this.d.size(); i++) {
                if (((iaj) this.d.get(i)).a == j) {
                    return A(i);
                }
            }
            return -1;
        }
    }

    public final int C() {
        return (!this.m || !this.f) ? -1 : 0;
    }

    public final long D(int i) {
        iaj G = G(i);
        if (G == null) {
            return Long.MIN_VALUE;
        }
        return G.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        r4 = (defpackage.iaj) r7.d.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (M(r4, r8) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
        r9 = r9 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.iaj E(com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint r8, int r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.util.List r1 = r7.d
            monitor-enter(r1)
            java.util.List r2 = r7.d     // Catch: java.lang.Throwable -> L60
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L60
            int r9 = r7.w(r9)     // Catch: java.lang.Throwable -> L60
            int r3 = r2 + (-1)
            if (r9 < 0) goto L2f
            if (r9 >= r2) goto L2f
            java.util.List r3 = r7.d     // Catch: java.lang.Throwable -> L60
            java.lang.Object r3 = r3.get(r9)     // Catch: java.lang.Throwable -> L60
            iaj r3 = (defpackage.iaj) r3     // Catch: java.lang.Throwable -> L60
            boolean r4 = M(r3, r8)     // Catch: java.lang.Throwable -> L60
            if (r4 == 0) goto L27
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L60
            return r3
        L27:
            int r3 = r9 + 1
            int r9 = r9 + (-1)
            r6 = r3
            r3 = r9
            r9 = r6
            goto L30
        L2f:
            r9 = r2
        L30:
            if (r3 >= 0) goto L37
            if (r9 >= r2) goto L35
            goto L37
        L35:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L60
            return r0
        L37:
            if (r9 >= r2) goto L4b
            java.util.List r4 = r7.d     // Catch: java.lang.Throwable -> L60
            java.lang.Object r4 = r4.get(r9)     // Catch: java.lang.Throwable -> L60
            iaj r4 = (defpackage.iaj) r4     // Catch: java.lang.Throwable -> L60
            boolean r5 = M(r4, r8)     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L49
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L60
            return r4
        L49:
            int r9 = r9 + 1
        L4b:
            if (r3 < 0) goto L30
            java.util.List r4 = r7.d     // Catch: java.lang.Throwable -> L60
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L60
            iaj r4 = (defpackage.iaj) r4     // Catch: java.lang.Throwable -> L60
            boolean r5 = M(r4, r8)     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L5d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L60
            return r4
        L5d:
            int r3 = r3 + (-1)
            goto L30
        L60:
            r8 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L60
            goto L64
        L63:
            throw r8
        L64:
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzs.E(com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint, int):iaj");
    }

    public final iaj F(long j) {
        return G(B(j));
    }

    public final iaj G(int i) {
        iaj iajVar;
        synchronized (this.d) {
            int w = w(i);
            iajVar = null;
            if (w >= 0 && w < this.d.size()) {
                iajVar = (iaj) this.d.get(w);
            }
        }
        return iajVar;
    }

    public final apzg H(long j) {
        iaj F = F(j + 1);
        if (F != null) {
            return F.d;
        }
        return null;
    }

    public final apzg I(long j) {
        iaj F = F(j - 1);
        if (F != null) {
            return F.d;
        }
        return null;
    }

    public final void J(zdt zdtVar) {
        synchronized (this.d) {
            for (iaj iajVar : this.d) {
                zdtVar.a(iajVar);
            }
        }
    }

    public final void K(boolean z) {
        int L;
        if (!this.f || this.n == z) {
            return;
        }
        this.n = z;
        synchronized (this.d) {
            L = L() + this.d.size();
        }
        if (z) {
            ol(L);
        } else {
            n(L);
        }
    }

    @Override // defpackage.xo
    public final int b() {
        int size;
        synchronized (this.d) {
            size = this.d.size() + L() + (this.n ? 1 : 0);
        }
        return size;
    }

    @Override // defpackage.xo
    public final int c(int i) {
        if (w(i) < 0) {
            return 0;
        }
        iaj G = G(i);
        if (G == null) {
            return 1;
        }
        if (G.b) {
            return 4;
        }
        if (hqp.g(G.a())) {
            return 5;
        }
        return hqp.l(G.d) ? 3 : 2;
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        if (i == 4) {
            ibh ibhVar = this.i;
            boolean z = this.g;
            ajhl ajhlVar = (ajhl) ibhVar.a.get();
            ajhlVar.getClass();
            ajin ajinVar = (ajin) ibhVar.b.get();
            ajinVar.getClass();
            acth acthVar = (acth) ibhVar.c.get();
            acthVar.getClass();
            icr icrVar = (icr) ibhVar.d.get();
            icrVar.getClass();
            viewGroup.getClass();
            return new ibg(ajhlVar, ajinVar, acthVar, icrVar, viewGroup, z);
        }
        boolean z2 = false;
        if (i == 0 || i == 1) {
            boolean z3 = this.l.q;
            if (1 == (i ^ 1)) {
                z2 = true;
            }
            return new hzi(viewGroup, z3, z2);
        }
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.reel_player_page, viewGroup, false);
        ibj ibjVar = this.j;
        ies iesVar = this.k;
        aadd aaddVar = (aadd) ibjVar.a.get();
        aaddVar.getClass();
        hyu hyuVar = (hyu) ibjVar.b.get();
        hyuVar.getClass();
        viewGroup2.getClass();
        return new ibi(aaddVar, hyuVar, iesVar, viewGroup2);
    }

    @Override // defpackage.xo
    public final long mp(int i) {
        if (w(i) < 0) {
            return Long.MIN_VALUE;
        }
        iaj G = G(i);
        if (G == null) {
            return Long.MAX_VALUE;
        }
        return G.a;
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, final int i) {
        boolean z;
        int i2;
        int i3;
        ibk ibkVar = (ibk) yoVar;
        iaj G = G(i);
        boolean z2 = false;
        if (!(ibkVar instanceof ibi) || G == null) {
            if (!(ibkVar instanceof ibg) || G == null) {
                if (ibkVar instanceof hzi) {
                    hzi hziVar = (hzi) ibkVar;
                    if (!hziVar.u) {
                        z2 = this.f;
                    } else if (this.f && this.h) {
                        z2 = true;
                    }
                    hqs.c(hziVar.t, z2);
                    hqs.c(hziVar.v, !z2);
                }
            } else {
                ibg ibgVar = (ibg) ibkVar;
                aunb aunbVar = G.a().p;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                aumh aumhVar = (aumh) aunbVar.qm(ReelWatchSurveyRendererOuterClass.reelWatchSurveyRenderer);
                aumhVar.getClass();
                String str = ibgVar.y;
                if (str == null || !str.equals(aumhVar.d)) {
                    ibgVar.F();
                    ibgVar.z = G;
                    G.f = ibgVar;
                    ibgVar.y = aumhVar.d;
                    aunb aunbVar2 = aumhVar.c;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    aqtb aqtbVar = (aqtb) aunbVar2.qm(ElementRendererOuterClass.elementRenderer);
                    aqtbVar.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", ibgVar.w);
                    ajin ajinVar = ibgVar.x;
                    ajhh a = ajhh.a(aqtbVar);
                    ajrs ajrsVar = new ajrs();
                    ajrsVar.g(hashMap);
                    acti oi = ibgVar.v.oi();
                    oi.getClass();
                    ajrsVar.a(oi);
                    ibgVar.u.oK(ajrsVar, a);
                    ibgVar.t.addView(ibgVar.u.a());
                }
            }
        } else {
            ibi ibiVar = (ibi) ibkVar;
            if (ibiVar.w != G) {
                ibiVar.w = G;
                G.f = ibiVar;
                ReelWatchEndpointOuterClass$ReelWatchEndpoint a2 = G.a();
                if ((a2.b & 64) == 0) {
                    ibiVar.v.f.c();
                } else {
                    ibiVar.v.f.d(a2);
                }
                ibiVar.u.c(a2, (ViewGroup) ibiVar.v.findViewById(R.id.reel_player_delegated_overlay));
                iet ietVar = ibiVar.v;
                boolean z3 = hqp.n(a2) || hqp.g(a2);
                boolean z4 = G.c;
                ietVar.x = z4;
                idj.a(ietVar, z3, z4);
                String str2 = a2.d;
                artv artvVar = G.e;
                boolean g = hqp.g(a2);
                if (artvVar != null) {
                    z = g;
                } else if (g) {
                    z = true;
                } else if ((a2.b & 256) != 0) {
                    aulr d = hqp.d(a2);
                    int bH = awwc.bH(a2.c);
                    if (bH != 0 && bH == 3) {
                        auld auldVar = ibiVar.t.a().u;
                        if (auldVar == null) {
                            auldVar = auld.a;
                        }
                        if (hqp.j(hqp.d(a2)) ? auldVar.g : auldVar.f) {
                            iet ietVar2 = ibiVar.v;
                            hqs.c(ietVar2.l, G.c);
                            hqs.c(ietVar2.m, false);
                            idj idjVar = ietVar2.a;
                            idjVar.w = d;
                            if (d != null) {
                                idjVar.y.clear();
                                idjVar.z.clear();
                                int i4 = idj.i(d);
                                if (hqp.r(i4)) {
                                    idjVar.b();
                                } else {
                                    idjVar.l = LayoutInflater.from(idjVar.f.getContext()).inflate(R.layout.reel_player_dyn_footer_vert, idjVar.f, false);
                                    idjVar.f.addView(idjVar.l);
                                }
                                idjVar.o = idjVar.l.findViewById(R.id.reel_byline_separator);
                                idjVar.m = (LottieAnimationView) idjVar.l.findViewById(R.id.reel_lazy_loader_anim);
                                idjVar.n = (ViewGroup) idjVar.l.findViewById(R.id.reel_dyn_lazy_loader_bar);
                                if (idjVar.f.getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
                                    idjVar.m.setScaleX(-1.0f);
                                }
                                hqs.c(idjVar.f, true);
                                hqs.c(idjVar.o, false);
                                idjVar.y.add(ObjectAnimator.ofFloat(idjVar.m, View.ALPHA, 0.0f, 1.0f));
                                idjVar.y.add(ObjectAnimator.ofFloat(idjVar.n, View.ALPHA, 0.0f, 1.0f));
                                idjVar.z.add(ObjectAnimator.ofFloat(idjVar.m, View.ALPHA, 1.0f, 0.0f));
                                idjVar.z.add(ObjectAnimator.ofFloat(idjVar.n, View.ALPHA, 1.0f, 0.0f));
                                if (idjVar.w != null && idjVar.n != null) {
                                    boolean r = hqp.r(i4);
                                    int i5 = 0;
                                    while (i5 < 5) {
                                        int i6 = 4;
                                        if (!r) {
                                            i2 = R.layout.reel_player_dyn_footer_vert_cell;
                                            i6 = i5;
                                            i3 = R.drawable.lazy_loader_icon;
                                        } else if (i5 == 4) {
                                            i3 = R.drawable.lazy_loader_right_icon_pivot;
                                            i2 = R.layout.reel_player_right_lazy_loader_pivot_cell;
                                        } else {
                                            i2 = R.layout.reel_player_right_lazy_loader_cell;
                                            i6 = i5;
                                            i3 = R.drawable.lazy_loader_right_icon_text;
                                        }
                                        View h = idj.h(idjVar.n, i4, i2, i3);
                                        if (!r) {
                                            h.setPaddingRelative(h.getPaddingStart(), 0, h.getPaddingEnd(), h.getPaddingBottom());
                                        }
                                        i5 = i6 + 1;
                                    }
                                }
                                if (idjVar.m != null) {
                                    idjVar.A.setDuration(100L);
                                    idjVar.A.playTogether(idjVar.y);
                                    idjVar.A.start();
                                    idjVar.m.k(0.0f);
                                    idjVar.m.e();
                                    hqs.c(idjVar.m, true);
                                    hqs.c(idjVar.n, true);
                                }
                            }
                        }
                    }
                    ibiVar.v.n(str2, d, G.a, false, false, false, G.c, a2);
                }
                ibiVar.v.l(str2, artvVar, G.a, z, G.c, a2);
            }
        }
        final iai iaiVar = this.l;
        iaiVar.h.execute(new Runnable() { // from class: hzw
            @Override // java.lang.Runnable
            public final void run() {
                iai iaiVar2 = iai.this;
                int i7 = i;
                if (i7 != iaiVar2.x || i7 == iaiVar2.m.B(iaiVar2.v)) {
                    return;
                }
                iaiVar2.l(false);
            }
        });
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void p(yo yoVar) {
        ((ibk) yoVar).F();
    }

    public final int w(int i) {
        return i - L();
    }

    public final int x() {
        int i;
        synchronized (this.d) {
            i = -1;
            if (this.n && this.f) {
                i = this.d.size() + L();
            }
        }
        return i;
    }

    public final int y() {
        synchronized (this.d) {
            if (this.d.isEmpty()) {
                return -1;
            }
            return C() == -1 ? 0 : 1;
        }
    }

    public final int z() {
        synchronized (this.d) {
            if (this.d.isEmpty()) {
                return -1;
            }
            return A(this.d.size() - 1);
        }
    }
}

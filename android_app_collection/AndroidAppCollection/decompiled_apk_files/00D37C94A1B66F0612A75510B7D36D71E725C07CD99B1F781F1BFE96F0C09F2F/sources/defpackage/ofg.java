package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.app.watch.engagementpanel.WatchEngagementPanelViewContainerController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.FlexyBehavior;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.FullscreenExitController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchContainerLayout;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ofg  reason: default package */
/* loaded from: classes3.dex */
public final class ofg implements ofu, nxg, ezg, ynl {
    private final olv A;
    public final nxh b;
    public final ezh c;
    public NextGenWatchContainerLayout d;
    public boolean e;
    public boolean f;
    private final Activity g;
    private final fqj h;
    private final azqb i;
    private final ofo j;
    private final ofj k;
    private final ofh l;
    private final ntt m;
    private final FullscreenExitController n;
    private final ypf o;
    private final ayor p;
    private final WatchEngagementPanelViewContainerController q;
    private final aadd r;
    private gck s;
    private NextGenWatchLayout t;
    private oaa u;
    private boolean v;
    private int w;
    private int x;
    private final aacz y;
    private ols z;

    public ofg(Activity activity, azqb azqbVar, ofo ofoVar, nxh nxhVar, aacz aaczVar, fqj fqjVar, ofj ofjVar, ofh ofhVar, ezh ezhVar, ntt nttVar, FullscreenExitController fullscreenExitController, WatchEngagementPanelViewContainerController watchEngagementPanelViewContainerController, ypf ypfVar, ayor ayorVar, olv olvVar, aadd aaddVar, byte[] bArr) {
        this.g = activity;
        this.i = azqbVar;
        this.j = ofoVar;
        this.b = nxhVar;
        this.y = aaczVar;
        this.h = fqjVar;
        this.k = ofjVar;
        this.l = ofhVar;
        this.c = ezhVar;
        this.m = nttVar;
        this.n = fullscreenExitController;
        this.o = ypfVar;
        this.p = ayorVar;
        this.r = aaddVar;
        this.A = olvVar;
        this.q = watchEngagementPanelViewContainerController;
    }

    private final void u(boolean z) {
        ols olsVar = this.z;
        if (olsVar != null) {
            olsVar.a.b(true);
        }
        q(3, z);
    }

    private final void v() {
        zgd.t(this.d, zgd.e(this.x + (this.c.g() == ezx.WATCH_WHILE_MAXIMIZED ? this.w : 0)), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.ezs
    public final ezr a(int i) {
        return this.k.a(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
        if (r6.s.h() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
        r3 = false;
     */
    @Override // defpackage.ofu, defpackage.gch
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r6 = this;
            ezh r0 = r6.c
            ezx r0 = r0.g()
            boolean r0 = r0.b()
            if (r0 != 0) goto L77
            ezh r0 = r6.c
            ezx r0 = r0.g()
            ezx r1 = defpackage.ezx.NONE
            if (r0 == r1) goto L2a
            boolean r1 = r0.b()
            if (r1 != 0) goto L23
            boolean r0 = r0.h()
            if (r0 == 0) goto L23
            goto L2a
        L23:
            ezh r0 = r6.c
            ezx r0 = r0.g()
            goto L2c
        L2a:
            ezx r0 = defpackage.ezx.WATCH_WHILE_FULLSCREEN
        L2c:
            gck r1 = r6.s
            boolean r2 = defpackage.elk.l(r0)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L37
            goto L60
        L37:
            gcc r2 = r1.b
            gcj r5 = r1.c
            int r5 = r5.a()
            zbb r1 = r1.a
            int r0 = r2.b(r0, r5, r1)
            r1 = 2
            if (r0 == r1) goto L59
            r1 = 3
            if (r0 == r1) goto L59
            r1 = 4
            if (r0 == r1) goto L52
            r1 = 5
            if (r0 == r1) goto L52
            goto L60
        L52:
            boolean r0 = defpackage.elk.j(r5)
            if (r0 != 0) goto L60
            goto L73
        L59:
            boolean r0 = defpackage.elk.k(r5)
            if (r0 != 0) goto L60
            goto L73
        L60:
            ezh r0 = r6.c
            ezx r0 = r0.g()
            ezx r1 = defpackage.ezx.WATCH_WHILE_MAXIMIZED
            if (r0 != r1) goto L74
            gck r0 = r6.s
            boolean r0 = r0.h()
            if (r0 == 0) goto L73
            goto L74
        L73:
            r3 = 0
        L74:
            r6.u(r3)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofg.b():void");
    }

    @Override // defpackage.ofu, defpackage.gch
    public final void c() {
        j(false);
    }

    @Override // defpackage.nja
    public final void d(boolean z, int i) {
        atcj atcjVar = this.y.b().n;
        if (atcjVar == null) {
            atcjVar = atcj.a;
        }
        boolean z2 = atcjVar.k;
        boolean z3 = true;
        if (true != z) {
            i = 0;
        }
        this.x = i;
        v();
        if (z2 || !z) {
            z3 = false;
        }
        this.v = z3;
        s(2, i);
        if (z) {
            if (z2 || !this.v || !this.b.f()) {
                return;
            }
            h(false);
        } else if (z2 || ((airr) this.i.get()).o() == null || !this.b.c()) {
        } else {
            m(false);
        }
    }

    @Override // defpackage.fqf
    public final void e(int i) {
        NextGenWatchContainerLayout nextGenWatchContainerLayout = this.d;
        ofe ofeVar = new ofe(this, i);
        nextGenWatchContainerLayout.getClass();
        nextGenWatchContainerLayout.setTag(R.id.view_position_clip_supplier_tag, ofeVar);
        this.w = i;
        v();
    }

    @Override // defpackage.ofu
    public final fel g() {
        return this.u;
    }

    @Override // defpackage.ofu
    public final void h(boolean z) {
        q(0, z && this.c.g().h());
    }

    @Override // defpackage.ofu
    public final void i() {
        u(false);
    }

    @Override // defpackage.ofu
    public final void j(boolean z) {
        if (this.c.g().b()) {
            FullscreenExitController fullscreenExitController = this.n;
            int i = 1;
            if (fullscreenExitController.b) {
                i = 0;
            } else if (z && !fullscreenExitController.a) {
                i = 2;
            }
            q(i, false);
        }
    }

    @Override // defpackage.ofu
    public final void k(View view, gck gckVar) {
        gckVar.getClass();
        this.s = gckVar;
        NextGenWatchContainerLayout nextGenWatchContainerLayout = (NextGenWatchContainerLayout) view.findViewById(R.id.next_gen_watch_container_layout);
        this.d = nextGenWatchContainerLayout;
        final NextGenWatchLayout nextGenWatchLayout = (NextGenWatchLayout) this.d.findViewById(R.id.next_gen_watch_layout);
        this.u = new oaa((ViewGroup) nextGenWatchContainerLayout.findViewById(R.id.watch_player), nextGenWatchLayout);
        final WatchEngagementPanelViewContainerController watchEngagementPanelViewContainerController = this.q;
        if (eog.aE(watchEngagementPanelViewContainerController.k)) {
            final RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(watchEngagementPanelViewContainerController.b).inflate(R.layout.engagement_panel_root_view, (ViewGroup) null);
            ((nml) watchEngagementPanelViewContainerController.c.get()).j(relativeLayout, null);
            watchEngagementPanelViewContainerController.i.d(watchEngagementPanelViewContainerController.g.ao().I().G(aypa.a()).aa(new nqt(watchEngagementPanelViewContainerController, 1), npy.d));
            watchEngagementPanelViewContainerController.i.d(watchEngagementPanelViewContainerController.g.G().h.aa(new nqt(watchEngagementPanelViewContainerController), npy.d));
            watchEngagementPanelViewContainerController.i.d(watchEngagementPanelViewContainerController.a.as(new ayqb() { // from class: nqu
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    WatchEngagementPanelViewContainerController watchEngagementPanelViewContainerController2 = WatchEngagementPanelViewContainerController.this;
                    RelativeLayout relativeLayout2 = relativeLayout;
                    nqw nqwVar = (nqw) obj;
                    nqw nqwVar2 = watchEngagementPanelViewContainerController2.j;
                    if (nqwVar2 != null) {
                        String valueOf = String.valueOf(nqwVar2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                        sb.append("Detach from container: ");
                        sb.append(valueOf);
                        watchEngagementPanelViewContainerController2.g(sb.toString());
                        watchEngagementPanelViewContainerController2.j.v(relativeLayout2);
                    }
                    String valueOf2 = String.valueOf(nqwVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
                    sb2.append("Attach to container: ");
                    sb2.append(valueOf2);
                    watchEngagementPanelViewContainerController2.g(sb2.toString());
                    nqwVar.u(relativeLayout2);
                    watchEngagementPanelViewContainerController2.j = nqwVar;
                }
            }));
            nqz nqzVar = watchEngagementPanelViewContainerController.e;
            nqzVar.d.d(nqzVar.b.S(new nqx(nqzVar, 1)));
            nqzVar.d.d(nqzVar.c.S(new nqx(nqzVar)));
            ((nml) nqzVar.a.get()).g().a(nqzVar);
        }
        final ViewGroup viewGroup = (ViewGroup) nextGenWatchLayout.findViewById(R.id.video_metadata_layout);
        final ofo ofoVar = this.j;
        final fqo fqoVar = nextGenWatchLayout.a;
        final FlexyBehavior l = nextGenWatchLayout.l();
        final nuw m = nextGenWatchLayout.m();
        ofoVar.d = new azqb() { // from class: ofn
            @Override // defpackage.azqb
            public final Object get() {
                ofo ofoVar2 = ofo.this;
                NextGenWatchLayout nextGenWatchLayout2 = nextGenWatchLayout;
                return ((oeu) ofoVar2.b.get()).m(nextGenWatchLayout2, viewGroup, fqoVar, l, m, nextGenWatchLayout2);
            }
        };
        ofoVar.c = viewGroup;
        ofoVar.e.sh(nextGenWatchLayout);
        if (ofo.c(ofoVar.a.g())) {
            ofoVar.b();
        } else {
            ofoVar.a.i(ofoVar);
        }
        viewGroup.setTag(viewGroup.getId(), this.j);
        ezx g = this.c.g();
        if (g.h() && !g.j()) {
            zag.h(this.g);
        }
        this.t = nextGenWatchLayout;
        if (!nextGenWatchLayout.F) {
            nextGenWatchLayout.F = true;
            nextGenWatchLayout.invalidate();
        }
        this.t.d(this.l);
        nzy nzyVar = nextGenWatchLayout.c;
        NextGenWatchContainerLayout nextGenWatchContainerLayout2 = this.d;
        nextGenWatchContainerLayout2.f.a = nzyVar;
        nextGenWatchContainerLayout2.requestLayout();
        ofj ofjVar = this.k;
        for (int i = 0; i < ofjVar.b.size(); i++) {
            ofi ofiVar = (ofi) ofjVar.b.valueAt(i);
            nxe d = nzyVar != null ? nzyVar.d(ofiVar.a) : null;
            nxe nxeVar = ofiVar.c;
            if (nxeVar != d) {
                if (nxeVar != null) {
                    nxeVar.L(ofiVar);
                }
                ofiVar.c = d;
                nxe nxeVar2 = ofiVar.c;
                if (nxeVar2 != null) {
                    nxeVar2.K(ofiVar);
                    ofiVar.b(ofiVar.c);
                }
            }
        }
        this.b.a(this);
        this.c.i(this);
        aynx aynxVar = this.m.a;
        if (eog.aj(this.y)) {
            aynxVar = aynxVar.h(zhn.b(this.o.a()));
        }
        aynxVar.n().Z(new off(this));
        this.A.a.X(this.p).as(new off(this, 1));
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                if (((aikd) obj).i != 6 || this.c.g().d()) {
                    return null;
                }
                h(false);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{aikd.class};
    }

    @Override // defpackage.ofu
    public final void l(boolean z) {
        if (!this.s.k(false)) {
            u(false);
        } else {
            r(z);
        }
    }

    @Override // defpackage.ofu
    public final void m(boolean z) {
        boolean z2 = false;
        if (z && !this.c.g().b()) {
            z2 = true;
        }
        q(2, z2);
    }

    @Override // defpackage.nxg
    public final void n(int i) {
        if (i != 2 || !this.v) {
            return;
        }
        h(false);
    }

    @Override // defpackage.ofu
    public final void p() {
        if (this.c.g().g() || this.c.g().e()) {
            if (this.s.k(true)) {
                r(false);
            } else {
                u(false);
            }
        }
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        v();
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }

    public final void q(int i, boolean z) {
        int i2;
        boolean z2;
        float f = 0.0f;
        if (this.t != null) {
            if (eog.w(this.r) || !z) {
                this.t.p(i);
                return;
            }
            NextGenWatchLayout nextGenWatchLayout = this.t;
            int k = nextGenWatchLayout.k(i);
            if (nextGenWatchLayout.c.a.g() || !nys.b(32, k)) {
                i2 = nextGenWatchLayout.i(i, k);
            } else {
                nextGenWatchLayout.e.b(nextGenWatchLayout.k(2), k, 0.0f);
                nextGenWatchLayout.p(2);
                i2 = nextGenWatchLayout.j(2, 32, i, k);
            }
            if (i2 == 2) {
                nextGenWatchLayout.p(i);
                return;
            }
            nxk nxkVar = nextGenWatchLayout.C;
            nxkVar.getClass();
            if (i2 == 1) {
                f = nxkVar.d.c;
            }
            nxkVar.f(f, new nzw(nextGenWatchLayout));
            return;
        }
        NextGenWatchContainerLayout nextGenWatchContainerLayout = this.d;
        if (z && nextGenWatchContainerLayout.d.b == 0 && i == 1) {
            i = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        nextGenWatchContainerLayout.d.h(i);
        if (z2) {
            nze nzeVar = nextGenWatchContainerLayout.e;
            if (!nzeVar.b()) {
                float height = (int) (nzeVar.c.getHeight() * 0.66f);
                Animator[] animatorArr = {ObjectAnimator.ofFloat(nzeVar.c.b, "translationY", height, 0.0f), ObjectAnimator.ofFloat(nzeVar.c.c, "translationY", height, 0.0f), ObjectAnimator.ofFloat(nzeVar.c.a, "alpha", 0.0f, 1.0f)};
                for (int i3 = 0; i3 < 3; i3++) {
                    animatorArr[i3].setDuration(nzeVar.a).setInterpolator(new AccelerateDecelerateInterpolator());
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(animatorArr);
                animatorSet.addListener(nzeVar);
                nzeVar.b = animatorSet;
                nzeVar.b.start();
            }
        }
        nextGenWatchContainerLayout.c();
    }

    final void r(boolean z) {
        q(1, z);
    }

    @Override // defpackage.ofu
    public final void s(int i, int i2) {
        this.h.c(i, i2);
    }

    @Override // defpackage.ofu
    public final void t(ols olsVar) {
        this.z = olsVar;
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.protos.youtube.api.innertube.ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: nlc  reason: default package */
/* loaded from: classes3.dex */
public final class nlc extends nkg implements akai, xlz {
    private final azqb A;
    private final aadd B;
    private final aynx C;
    private final eml D;
    private fhg E;
    private nnu F;
    private View G;
    private boolean H;
    private boolean I;

    /* renamed from: J  reason: collision with root package name */
    private Set f231J;
    private final aacz K;
    public final yzj d;
    public final nle e;
    public final aafo f;
    public final yzv g;
    public final xmb h;
    public final xyb i;
    public final nlv j;
    public LoadingFrameLayout k;
    public SwipeRefreshLayout l;
    ajzq m;
    public nlw n;
    public apzg o;
    public nly p;
    public xmd q;
    public final xyd r;
    private final Context s;
    private final aath u;
    private final yni v;
    private final ajsg w;
    private final ajyi x;
    private final Executor y;
    private final fhh z;

    public nlc(Context context, aath aathVar, yzj yzjVar, yni yniVar, ajsg ajsgVar, ajyi ajyiVar, nle nleVar, Executor executor, acti actiVar, aafo aafoVar, fhh fhhVar, yzv yzvVar, xmb xmbVar, azqb azqbVar, xyb xybVar, xyd xydVar, aadd aaddVar, aynx aynxVar, nlv nlvVar, eml emlVar, aacz aaczVar) {
        super(actiVar, aaddVar);
        this.s = context;
        this.u = aathVar;
        this.d = yzjVar;
        this.v = yniVar;
        this.w = ajsgVar;
        this.x = ajyiVar;
        this.e = nleVar;
        this.y = executor;
        this.f = aafoVar;
        this.z = fhhVar;
        this.g = yzvVar;
        this.h = xmbVar;
        this.A = azqbVar;
        this.i = xybVar;
        this.r = xydVar;
        this.B = aaddVar;
        this.C = aynxVar;
        this.j = nlvVar;
        this.D = emlVar;
        this.K = aaczVar;
    }

    public static final boolean E(apzg apzgVar) {
        if (apzgVar == null) {
            return false;
        }
        return H(apzgVar).h() || G(apzgVar).h();
    }

    public static final apzg F(apzg apzgVar, boolean z) {
        ampq ampqVar;
        if (!E(apzgVar)) {
            return null;
        }
        ampq H = H(apzgVar);
        if (!H.h()) {
            if (apzgVar.qn(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) {
                ampqVar = ampq.i((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apzgVar.qm(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint));
            } else {
                ampqVar = amon.a;
            }
            ampq G = G(apzgVar);
            if (!ampqVar.h() || !G.h()) {
                return null;
            }
            auvd auvdVar = ((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) ampqVar.c()).l;
            if (auvdVar == null) {
                auvdVar = auvd.a;
            }
            aopa mo52toBuilder = auvdVar.mo52toBuilder();
            aopa mo52toBuilder2 = ((aqaz) G.c()).mo52toBuilder();
            mo52toBuilder2.copyOnWrite();
            aqaz aqazVar = (aqaz) mo52toBuilder2.instance;
            aqazVar.b |= 8;
            aqazVar.f = z;
            aqaz aqazVar2 = (aqaz) mo52toBuilder2.mo39build();
            mo52toBuilder.copyOnWrite();
            auvd auvdVar2 = (auvd) mo52toBuilder.instance;
            aqazVar2.getClass();
            auvdVar2.c = aqazVar2;
            auvdVar2.b = 2;
            auvd auvdVar3 = (auvd) mo52toBuilder.mo39build();
            aopa mo52toBuilder3 = ((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) ampqVar.c()).mo52toBuilder();
            mo52toBuilder3.copyOnWrite();
            ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) mo52toBuilder3.instance;
            auvdVar3.getClass();
            showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.l = auvdVar3;
            showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.b |= 1024;
            aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
            aopcVar.e(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint, (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) mo52toBuilder3.mo39build());
            return (apzg) aopcVar.mo39build();
        }
        aopa mo52toBuilder4 = ((ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) H.c()).mo52toBuilder();
        mo52toBuilder4.copyOnWrite();
        ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand = (ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) mo52toBuilder4.instance;
        showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.b |= 8;
        showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.f = z;
        aopc aopcVar2 = (aopc) apzgVar.mo52toBuilder();
        aopcVar2.e(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand, (ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) mo52toBuilder4.mo39build());
        return (apzg) aopcVar2.mo39build();
    }

    private static ampq G(apzg apzgVar) {
        aqaz aqazVar;
        if (apzgVar.qn(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) {
            ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apzgVar.qm(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
            auvd auvdVar = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.l;
            if (auvdVar == null) {
                auvdVar = auvd.a;
            }
            if (auvdVar.b == 2) {
                auvd auvdVar2 = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.l;
                if (auvdVar2 == null) {
                    auvdVar2 = auvd.a;
                }
                if (auvdVar2.b == 2) {
                    aqazVar = (aqaz) auvdVar2.c;
                } else {
                    aqazVar = aqaz.a;
                }
                return ampq.j(aqazVar);
            }
        }
        return amon.a;
    }

    private static ampq H(apzg apzgVar) {
        return apzgVar.qn(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand) ? ampq.i((ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) apzgVar.qm(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand)) : amon.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
        if (r5 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(boolean r5) {
        /*
            r4 = this;
            r4.B()
            r0 = 1
            r4.H = r0
            apzg r0 = r4.o
            byte[] r0 = defpackage.eog.bl(r0)
            aath r1 = r4.u
            aatf r1 = r1.f()
            r1.k(r0)
            apzg r0 = r4.o
            boolean r0 = E(r0)
            if (r0 == 0) goto L8c
            apzg r0 = r4.o
            java.lang.String r0 = d(r0)
            r1.t(r0)
            apzg r0 = r4.o
            ampq r2 = H(r0)
            boolean r3 = r2.h()
            if (r3 == 0) goto L3b
            java.lang.Object r0 = r2.c()
            com.google.protos.youtube.api.innertube.ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand r0 = (com.google.protos.youtube.api.innertube.ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) r0
            java.lang.String r0 = r0.e
            goto L50
        L3b:
            ampq r0 = G(r0)
            boolean r2 = r0.h()
            if (r2 == 0) goto L4e
            java.lang.Object r0 = r0.c()
            aqaz r0 = (defpackage.aqaz) r0
            java.lang.String r0 = r0.e
            goto L50
        L4e:
            java.lang.String r0 = ""
        L50:
            r1.v(r0)
            if (r5 != 0) goto L7e
            apzg r5 = r4.o
            ampq r0 = H(r5)
            boolean r2 = r0.h()
            if (r2 == 0) goto L6a
            java.lang.Object r5 = r0.c()
            com.google.protos.youtube.api.innertube.ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand r5 = (com.google.protos.youtube.api.innertube.ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) r5
            boolean r5 = r5.f
            goto L7c
        L6a:
            ampq r5 = G(r5)
            boolean r0 = r5.h()
            if (r0 == 0) goto L91
            java.lang.Object r5 = r5.c()
            aqaz r5 = (defpackage.aqaz) r5
            boolean r5 = r5.f
        L7c:
            if (r5 == 0) goto L91
        L7e:
            r5 = 2
            r1.q(r5)
            apzg r5 = r4.o
            r0 = 0
            apzg r5 = F(r5, r0)
            r4.o = r5
            goto L91
        L8c:
            java.lang.String r5 = "CommentRepliesEngagementPanel: cannot load navigation endpoint."
            defpackage.zep.b(r5)
        L91:
            aath r5 = r4.u
            java.util.concurrent.Executor r0 = r4.y
            ankt r5 = r5.h(r1, r0)
            anjk r0 = defpackage.anjk.a
            nkv r1 = new nkv
            r1.<init>()
            nkw r2 = new nkw
            r2.<init>()
            defpackage.ylx.k(r5, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlc.I(boolean):void");
    }

    public static String d(apzg apzgVar) {
        ampq H = H(apzgVar);
        if (!H.h() || (((ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) H.c()).b & 1) == 0) {
            ampq G = G(apzgVar);
            return (!G.h() || (((aqaz) G.c()).b & 1) == 0) ? "" : ((aqaz) G.c()).c;
        }
        return ((ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) H.c()).c;
    }

    public static void h(acti actiVar, String str) {
        InteractionLoggingScreen c = actiVar.c();
        if (c == null) {
            return;
        }
        int i = c.f;
        aopa createBuilder = asjj.a.createBuilder();
        aopa createBuilder2 = asjc.a.createBuilder();
        createBuilder2.copyOnWrite();
        asjc asjcVar = (asjc) createBuilder2.instance;
        str.getClass();
        asjcVar.b |= 1;
        asjcVar.c = str;
        createBuilder2.copyOnWrite();
        asjc asjcVar2 = (asjc) createBuilder2.instance;
        asjcVar2.b |= 2;
        asjcVar2.d = i;
        createBuilder.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder.instance;
        asjc asjcVar3 = (asjc) createBuilder2.mo39build();
        asjcVar3.getClass();
        asjjVar.l = asjcVar3;
        asjjVar.b |= 16384;
        awbs g = actiVar.g(new Object(), actj.GENERIC_ERROR);
        actiVar.D(acun.a(g));
        actiVar.u(acun.a(g), (asjj) createBuilder.mo39build());
    }

    @Override // defpackage.nmc
    public final void A(apzg apzgVar) {
        i();
        this.I = false;
        if (!this.H) {
            I(false);
        }
        nlw nlwVar = this.n;
        if (nlwVar != null) {
            nlwVar.h();
        }
    }

    public final void B() {
        this.H = false;
        this.k.c();
        fhg fhgVar = this.E;
        if (fhgVar != null) {
            fhgVar.b();
        }
    }

    @Override // defpackage.nmc
    public final void C(nlz nlzVar) {
    }

    @Override // defpackage.nmc
    /* renamed from: c */
    public final nnu b() {
        nnu nnuVar = this.F;
        if (nnuVar == null) {
            nnu nnuVar2 = (nnu) this.A.get();
            this.F = nnuVar2;
            nnuVar2.h = this.a;
            return nnuVar2;
        }
        return nnuVar;
    }

    public final void i() {
        int i;
        if (!this.I) {
            this.I = true;
            return;
        }
        acti actiVar = this.a;
        apzg apzgVar = this.o;
        int i2 = 32276;
        if (apzgVar != null) {
            ampq H = H(apzgVar);
            if (H.h()) {
                i = ((ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) H.c()).h;
            } else {
                ampq G = G(apzgVar);
                i = G.h() ? ((aqaz) G.c()).h : 0;
            }
            if (i != 0) {
                i2 = i;
            }
        }
        actiVar.F(acuo.a(i2), acuc.OVERLAY, this.o);
    }

    @Override // defpackage.akai
    public final void ll() {
        ajzq ajzqVar = this.m;
        if (ajzqVar != null) {
            ajzqVar.h();
        }
        this.E.c(1);
        if (this.k != null) {
            this.y.execute(new nkx(this));
        }
    }

    @Override // defpackage.akai
    public final boolean lm() {
        return true;
    }

    @Override // defpackage.nkg, defpackage.nmc
    public final void m() {
        View view = this.G;
        if (view == null || !zdg.e(view.getContext())) {
            return;
        }
        this.G.sendAccessibilityEvent(8);
    }

    @Override // defpackage.nmc
    public final void n() {
        ampq ampqVar;
        this.a.t();
        nlw nlwVar = this.n;
        if (nlwVar != null) {
            ((nlu) nlwVar).d();
        }
        apzg apzgVar = this.o;
        ampq H = H(apzgVar);
        if (!H.h() || (((ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) H.c()).b & 128) == 0) {
            ampq G = G(apzgVar);
            if (!G.h() || (((aqaz) G.c()).b & 64) == 0) {
                ampqVar = amon.a;
            } else {
                apzg apzgVar2 = ((aqaz) G.c()).i;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                ampqVar = ampq.j(apzgVar2);
            }
        } else {
            apzg apzgVar3 = ((ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) H.c()).j;
            if (apzgVar3 == null) {
                apzgVar3 = apzg.a;
            }
            ampqVar = ampq.j(apzgVar3);
        }
        if (ampqVar.h()) {
            this.f.a((apzg) ampqVar.c());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, ajsa] */
    @Override // defpackage.nmc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(defpackage.apzg r18) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlc.o(apzg):void");
    }

    @Override // defpackage.nmc
    public final View oX() {
        return this.k;
    }

    @Override // defpackage.nmc
    public final void oY(ajrt ajrtVar) {
        ajzq ajzqVar = this.m;
        if (ajzqVar != null) {
            ajzqVar.u(ajrtVar);
            return;
        }
        if (this.f231J == null) {
            this.f231J = new HashSet();
        }
        this.f231J.add(ajrtVar);
    }

    @Override // defpackage.nmc
    public final void y() {
        B();
        nlw nlwVar = this.n;
        if (nlwVar != null) {
            nlwVar.pd();
        }
        apzt apztVar = this.K.b().z;
        if (apztVar == null) {
            apztVar = apzt.a;
        }
        if (apztVar.h) {
            this.D.a();
        }
    }

    @Override // defpackage.nmc
    public final void z() {
        this.a.t();
        nlw nlwVar = this.n;
        if (nlwVar != null) {
            nlwVar.d();
        }
    }
}

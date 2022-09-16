package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity;
import com.google.protos.youtube.api.innertube.ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint;
import com.google.protos.youtube.api.innertube.FlagVideoEndpointOuterClass$FlagVideoEndpoint;
import com.google.protos.youtube.api.innertube.MenuEndpointOuterClass$MenuEndpoint;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand;
import com.google.protos.youtube.api.innertube.ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand;
import com.google.protos.youtube.api.innertube.ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dwm  reason: default package */
/* loaded from: classes3.dex */
public final class dwm implements azqb {
    private final int a;
    private final eaj b;

    public dwm(eaj eajVar, int i) {
        this.b = eajVar;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4, types: [ampq] */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    @Override // defpackage.azqb
    public final Object get() {
        String str = "Expected activity to be a FragmentActivity: ";
        switch (this.a) {
            case 0:
                eaj eajVar = this.b;
                Activity activity = eajVar.a;
                try {
                    str = activity == null ? amon.a : ampq.j((dt) activity);
                    return amhv.a(str, eajVar.s);
                } catch (ClassCastException e) {
                    String valueOf = String.valueOf(activity);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                    sb.append(str);
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString(), e);
                }
            case 1:
                eaj eajVar2 = this.b;
                azqb azqbVar = eajVar2.d;
                ampq b = ampq.i((azqb) amup.k(ReelWatchActivity.class, eajVar2.r).get(eajVar2.a().getClass())).b(ydy.q);
                azqbVar.getClass();
                return (aafo) b.d(new uvy(azqbVar, 3));
            case 2:
                return this.b.e();
            case 3:
                eaj eajVar3 = this.b;
                amum i = amup.i(9);
                i.f(FlagVideoEndpointOuterClass$FlagVideoEndpoint.class, eajVar3.e);
                i.f(atns.class, eajVar3.f);
                i.f(ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.class, eajVar3.g);
                i.f(ReelWatchEndpointOuterClass$ReelWatchEndpoint.class, eajVar3.h);
                i.f(apnv.class, eajVar3.j);
                i.f(MenuEndpointOuterClass$MenuEndpoint.class, eajVar3.n);
                i.f(ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.class, eajVar3.o);
                i.f(ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.class, eajVar3.p);
                i.f(ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.class, eajVar3.q);
                amup b2 = i.b();
                aafo e2 = eajVar3.e();
                acth f = eajVar3.f();
                LoggingUrlsPingController ac = ((exz) ((axon) ((amhu) eajVar3.c.get()).a()).lI()).ac();
                axzl.o(ac);
                aafe g = aafi.g();
                g.b(b2);
                g.d(e2);
                return new actk(new hwt(g.a(), ac), f);
            case 4:
                return gad.r(this.b.c());
            case 5:
                return gad.f(this.b.c());
            case 6:
                eaj eajVar4 = this.b;
                xli fJ = ((xne) ((axon) ((amhu) eajVar4.c.get()).a()).lI()).fJ();
                axzl.o(fJ);
                iee ct = ((icu) ((axon) ((amhu) eajVar4.c.get()).a()).lI()).ct();
                axzl.o(ct);
                return new hyd(fJ, (feu) eajVar4.b.wt.get(), ct);
            case 7:
                eaj eajVar5 = this.b;
                return gad.g((igh) eajVar5.b.vY.get(), eajVar5.b.bT(), eajVar5.b.gs(), eajVar5.b());
            case 8:
                eaj eajVar6 = this.b;
                dt dtVar = (dt) eajVar6.i.get();
                SfvAudioItemPlaybackController bZ = ((gty) ((axon) ((amhu) eajVar6.c.get()).a()).lI()).bZ();
                axzl.o(bZ);
                aafo aafoVar = (aafo) eajVar6.b.jd.get();
                gtm b3 = eajVar6.b();
                igr cu = ((hww) ((axon) ((amhu) eajVar6.c.get()).a()).lI()).cu();
                axzl.o(cu);
                zrg lg = ((guk) ((axon) ((amhu) eajVar6.c.get()).a()).lI()).lg();
                axzl.o(lg);
                return gad.t(dtVar, bZ, aafoVar, b3, cu, lg, amyc.b, eajVar6.f());
            case 9:
                Activity a = this.b.a();
                try {
                    return (dt) a;
                } catch (ClassCastException e3) {
                    String valueOf2 = String.valueOf(a);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 44);
                    sb2.append((String) str);
                    sb2.append(valueOf2);
                    throw new IllegalStateException(sb2.toString(), e3);
                }
            case 10:
                eaj eajVar7 = this.b;
                return gad.e(eajVar7.c(), (gkj) eajVar7.m.get());
            case 11:
                eaj eajVar8 = this.b;
                dt dtVar2 = (dt) eajVar8.i.get();
                aafo aafoVar2 = (aafo) eajVar8.k.get();
                ajxz ajxzVar = (ajxz) eajVar8.b.lV.get();
                ajrh ajrhVar = new ajrh(eajVar8.l);
                ltu dZ = ((ndl) ((axon) ((amhu) eajVar8.c.get()).a()).lI()).dZ();
                axzl.o(dZ);
                ajgz iv = ((ajhc) ((axon) ((amhu) eajVar8.c.get()).a()).lI()).iv();
                axzl.o(iv);
                return gad.c(dtVar2, aafoVar2, ajxzVar, ajrhVar, dZ, eajVar8.f(), (aakn) eajVar8.b.wx.get(), (lmm) eajVar8.b.wy.get(), iv);
            case 12:
                ajsk iM = ((ajsb) ((axon) ((amhu) this.b.c.get()).a()).lI()).iM();
                axzl.o(iM);
                return iM;
            case 13:
                eaj eajVar9 = this.b;
                Context e4 = ((hwv) ((axon) ((amhu) eajVar9.c.get()).a()).lI()).e();
                axzl.o(e4);
                return gad.d(e4, (aafo) eajVar9.k.get(), eajVar9.b.cI(), (ajxz) eajVar9.b.lV.get());
            case 14:
                hyx cq = ((hyp) ((axon) ((amhu) this.b.c.get()).a()).lI()).cq();
                axzl.o(cq);
                return gad.h(cq);
            default:
                return gad.s();
        }
    }
}

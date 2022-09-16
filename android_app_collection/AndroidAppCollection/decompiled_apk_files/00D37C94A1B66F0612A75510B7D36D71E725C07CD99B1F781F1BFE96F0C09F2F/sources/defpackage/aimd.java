package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aimd  reason: default package */
/* loaded from: classes.dex */
public final class aimd {
    public final Executor a;
    private final snc b;
    private final aine c;
    private final aink d;

    public aimd(snc sncVar, aine aineVar, aink ainkVar, Executor executor) {
        sncVar.getClass();
        this.b = sncVar;
        this.c = aineVar;
        this.d = ainkVar;
        executor.getClass();
        this.a = executor;
    }

    public static aimc a(final PlaybackStartDescriptor playbackStartDescriptor, final aijp aijpVar, final aadd aaddVar, final String str, final ampg ampgVar, ampg ampgVar2, boolean z, Executor executor) {
        if (TextUtils.isEmpty(playbackStartDescriptor.l())) {
            ankt anktVar = (ankt) ampgVar2.apply(playbackStartDescriptor);
            return new aimc(anii.i(anktVar, new anir() { // from class: aily
                @Override // defpackage.anir
                public final ankt a(Object obj) {
                    PlaybackStartDescriptor a;
                    auaf e;
                    PlaybackStartDescriptor playbackStartDescriptor2 = PlaybackStartDescriptor.this;
                    aijp aijpVar2 = aijpVar;
                    String str2 = str;
                    ampg ampgVar3 = ampgVar;
                    aadd aaddVar2 = aaddVar;
                    WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) obj;
                    String str3 = watchNextResponseModel.b;
                    if (watchNextResponseModel.c == null || (e = aiix.e(aaddVar2)) == null || !e.D) {
                        aijl e2 = playbackStartDescriptor2.e();
                        e2.n = str3;
                        a = e2.a();
                    } else {
                        aijl d = PlaybackStartDescriptor.d();
                        d.p = playbackStartDescriptor2.e;
                        d.a = watchNextResponseModel.c;
                        a = d.a();
                        if (TextUtils.isEmpty(a.l())) {
                            aijl e3 = a.e();
                            e3.n = str3;
                            a = e3.a();
                        }
                    }
                    return (ankt) ampgVar3.apply(aimb.a(a, aijpVar2, str2, true));
                }
            }, executor), ampq.j(anktVar));
        }
        return new aimc((ankt) ampgVar.apply(aimb.a(playbackStartDescriptor, aijpVar, str, z)), amon.a);
    }

    private final ankt c(final ayos ayosVar, final ayqe ayqeVar, final ampg ampgVar, final Object obj) {
        return aed.c(new agr() { // from class: ailx
            @Override // defpackage.agr
            public final Object a(agp agpVar) {
                aimd aimdVar = aimd.this;
                ayos ayosVar2 = ayosVar;
                ayqe ayqeVar2 = ayqeVar;
                final ampg ampgVar2 = ampgVar;
                final Object obj2 = obj;
                return ayosVar2.E(ayqeVar2).G(azpj.b(aimdVar.a)).H(new ayqe() { // from class: aima
                    @Override // defpackage.ayqe
                    public final Object a(Object obj3) {
                        ampg ampgVar3 = ampg.this;
                        Object obj4 = obj2;
                        Throwable th = (Throwable) obj3;
                        if (!(th instanceof UnsupportedOperationException)) {
                            afus.c(2, 10, "Error performing streaming watch.", th);
                        }
                        return zna.s((ankt) ampgVar3.apply(obj4));
                    }
                }).T(new ailz(agpVar), new ailz(agpVar, 2));
            }
        });
    }

    public final aimc b(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar, String str, aynx aynxVar, ampg ampgVar, ampg ampgVar2, boolean z) {
        ayos X = aynxVar.u(zwb.l).X();
        aine aineVar = this.c;
        long d = this.b.d();
        aapv aapvVar = (aapv) aineVar.a.get();
        aapvVar.getClass();
        afvn afvnVar = (afvn) aineVar.b.get();
        afvnVar.getClass();
        aanz aanzVar = (aanz) aineVar.c.get();
        aanzVar.getClass();
        Set set = (Set) aineVar.d.get();
        set.getClass();
        ankt c = c(X, new aind(aapvVar, afvnVar, aanzVar, set, str, d), ampgVar, aimb.a(playbackStartDescriptor, aijpVar, str, z));
        ayos X2 = aynxVar.u(zwb.m).X();
        aink ainkVar = this.d;
        aapv aapvVar2 = (aapv) ainkVar.a.get();
        aapvVar2.getClass();
        afvn afvnVar2 = (afvn) ainkVar.b.get();
        afvnVar2.getClass();
        aaoq aaoqVar = (aaoq) ainkVar.c.get();
        aaoqVar.getClass();
        return new aimc(c, ampq.j(c(X2, new ainj(aapvVar2, afvnVar2, aaoqVar), ampgVar2, playbackStartDescriptor)));
    }
}

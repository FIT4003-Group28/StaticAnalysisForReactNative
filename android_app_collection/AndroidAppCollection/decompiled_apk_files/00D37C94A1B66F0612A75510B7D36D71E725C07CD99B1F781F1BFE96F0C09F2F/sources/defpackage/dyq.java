package defpackage;

import com.google.android.apps.youtube.app.YouTubeTikTokRoot_Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dyq  reason: default package */
/* loaded from: classes3.dex */
public class dyq extends dyw implements axoo {
    private final axoc p = new axoc(new dyp(this));

    @Override // defpackage.dyw
    protected final void f() {
        YouTubeTikTokRoot_Application youTubeTikTokRoot_Application = (YouTubeTikTokRoot_Application) this;
        dyo dyoVar = (dyo) lI();
        youTubeTikTokRoot_Application.n = (amly) dyoVar.bm.get();
        youTubeTikTokRoot_Application.o = dyoVar.cy;
        youTubeTikTokRoot_Application.b = (dzb) dyoVar.dn.get();
        youTubeTikTokRoot_Application.c = dyoVar.cQ;
        youTubeTikTokRoot_Application.d = dyoVar.nj;
        youTubeTikTokRoot_Application.e = dyoVar.nk;
        youTubeTikTokRoot_Application.f = axot.a(dyoVar.rM);
        youTubeTikTokRoot_Application.g = axot.a(dyoVar.us);
        youTubeTikTokRoot_Application.h = dyoVar.C;
        youTubeTikTokRoot_Application.i = (Executor) dyoVar.h.get();
        youTubeTikTokRoot_Application.j = dyoVar.aA;
        youTubeTikTokRoot_Application.k = dyoVar.ay;
        youTubeTikTokRoot_Application.l = dyoVar.Q;
        youTubeTikTokRoot_Application.m = (ywk) dyoVar.B.get();
    }

    @Override // defpackage.axoo
    public final /* bridge */ /* synthetic */ axon lH() {
        return this.p;
    }

    @Override // defpackage.axon
    public final Object lI() {
        return this.p.lI();
    }
}

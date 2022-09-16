package defpackage;

import android.net.Uri;
import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
/* compiled from: PG */
/* renamed from: aezm  reason: default package */
/* loaded from: classes.dex */
public final class aezm extends ppa implements aeys {
    public volatile aezp d;
    private final afjm e;
    private final pnp f;
    private final aezk g;
    private final afhh h;
    private final PlayerConfigModel i;
    private final VideoStreamingData j;
    private final aeun k;
    private final String l;
    private final pjc m;
    private final afbq n;
    private atk o;
    private final yrj p;
    private final aexg[] q;
    private final afjz r;

    public aezm(afjm afjmVar, pnp pnpVar, Handler handler, Handler handler2, PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData, aeun aeunVar, afhh afhhVar, aeyq aeyqVar, String str, Object obj, afbq afbqVar, aexg[] aexgVarArr, yrj yrjVar, afjz afjzVar) {
        afms.b(!videoStreamingData.p.isEmpty());
        this.e = afjmVar;
        this.f = pnpVar;
        this.g = new aezk(this, handler, aeyqVar, handler2);
        this.i = playerConfigModel;
        this.j = videoStreamingData;
        this.k = aeunVar;
        this.h = afhhVar;
        this.l = str;
        this.n = afbqVar;
        pix pixVar = new pix();
        pixVar.b("ManifestlessLiveMediaSource");
        pixVar.a = Uri.EMPTY;
        pixVar.b = obj;
        this.m = pixVar.a();
        this.q = aexgVarArr;
        this.p = yrjVar;
        this.r = afjzVar;
    }

    @Override // defpackage.aeys
    public final long A(long j) {
        if (this.d != null) {
            return this.d.A(j);
        }
        return -1L;
    }

    @Override // defpackage.pqb
    public final pjc r() {
        return this.m;
    }

    @Override // defpackage.ppa
    protected final void rA() {
    }

    @Override // defpackage.ppa
    protected final void rz(atk atkVar) {
        this.o = atkVar;
        rF(new aezl(this.j.G(), this.m));
    }

    @Override // defpackage.pqb
    public final synchronized void s() {
    }

    @Override // defpackage.pqb
    public final void u(ppy ppyVar) {
        if (ppyVar instanceof aezi) {
            ((aezi) ppyVar).n();
        }
    }

    @Override // defpackage.pqb
    public final ppy v(ppz ppzVar, axf axfVar, long j) {
        pqh i = this.b.i(0, ppzVar);
        return new aezi(this.e, this.f, n(ppzVar), this.o, i, axfVar, this.i, this.j, this.k, this.h, this.g, this.l, this.m, this.n, this.q, this.p, this.r);
    }
}

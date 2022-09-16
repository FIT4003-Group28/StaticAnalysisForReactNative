package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.video.state.DirectorSavedState;
import java.util.HashSet;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adlc  reason: default package */
/* loaded from: classes.dex */
public final class adlc implements ajag {
    private final Context a;
    private final snc b;
    private final Executor c;
    private final yni d;
    private final azqb e;
    private final azqb f;
    private final azqb g;
    private final aynx h;
    private final azqb i;
    private final azqb j;
    private final aizu k;
    private final ajai l;
    private final zey m;
    private final ajfe n;
    private final airw o;
    private final aikh p;
    private final wnb q;
    private final aacz r;
    private final wmt s;

    public adlc(Context context, snc sncVar, Executor executor, yni yniVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, aynx aynxVar, azqb azqbVar4, aikh aikhVar, azqb azqbVar5, bame bameVar, bame bameVar2, bame bameVar3, bame bameVar4, aizu aizuVar, wnb wnbVar, zey zeyVar, ajfe ajfeVar, aacz aaczVar, wmt wmtVar, airw airwVar) {
        this.a = context;
        this.b = sncVar;
        this.c = executor;
        this.d = yniVar;
        this.e = azqbVar;
        this.f = azqbVar2;
        this.g = azqbVar3;
        this.h = aynxVar;
        this.i = azqbVar4;
        this.p = aikhVar;
        this.j = azqbVar5;
        this.r = aaczVar;
        this.s = wmtVar;
        this.o = airwVar;
        this.l = new ajai(yniVar, new HashSet(), bameVar, bameVar2, bameVar3, bameVar4);
        this.k = aizuVar;
        this.q = wnbVar;
        this.m = zeyVar;
        this.n = ajfeVar;
    }

    @Override // defpackage.ajag
    public final ajah a(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar) {
        wwd wwdVar = (wwd) this.f.get();
        adlb adlbVar = new adlb(this.a, this.b, this.c, this.d, (wkt) this.e.get(), (wvx) this.g.get(), this.h, ((adoa) this.i.get()).e(), this.p, (aanz) this.j.get(), this.l, this.k, this.q, this.m, this.n, this.r, this.s, this.o);
        aypf aypfVar = adlbVar.e;
        adla adlaVar = adlbVar.c;
        aynx j = aiwv.j(adlbVar.b, adch.m);
        adla adlaVar2 = adlaVar.a.c;
        adlaVar2.getClass();
        ayoi X = adlaVar.a.g.n().b().X(aypa.a());
        adla adlaVar3 = adlaVar.a.c;
        adlaVar3.getClass();
        ayoi X2 = adlaVar.a.g.n().a().X(aypa.a());
        adla adlaVar4 = adlaVar.a.c;
        adlaVar4.getClass();
        aypfVar.g(j.Z(new adkx(adlaVar2, 1)), X.as(new adkx(adlaVar3, 3)), X2.as(new adkx(adlaVar4, 2)), adlaVar.a.q.G().d.aa(new adkx(adlaVar), aaga.d));
        adlbVar.a.g(adlbVar);
        return adlbVar;
    }

    @Override // defpackage.ajag
    public final ajah b(DirectorSavedState directorSavedState, aijp aijpVar) {
        return a(null, null);
    }
}

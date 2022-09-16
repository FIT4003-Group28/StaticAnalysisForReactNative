package defpackage;

import android.util.LruCache;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
/* compiled from: PG */
/* renamed from: aevy  reason: default package */
/* loaded from: classes.dex */
public final class aevy {
    public final aexi a;
    public volatile aeyi b;
    public final affx c;
    public final yrj d;
    public final aeha e;
    public final afmw f;
    public final aeju g;
    public final amqo h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public volatile afnh m;
    public volatile afbi n;
    public final LruCache o = new LruCache(7);
    public aequ p;
    public boolean q;
    public boolean r;
    public final afjz s;
    private final aepf t;
    private final amqo u;
    private final afex v;

    public aevy(aexi aexiVar, aeyi aeyiVar, affx affxVar, afjz afjzVar, yrj yrjVar, aeha aehaVar, afmw afmwVar, aeju aejuVar, aepf aepfVar, amqo amqoVar, amqo amqoVar2, afex afexVar) {
        this.a = aexiVar;
        this.b = aeyiVar;
        this.c = affxVar;
        this.s = afjzVar;
        this.d = yrjVar;
        this.e = aehaVar;
        this.f = afmwVar;
        this.g = aejuVar;
        this.t = aepfVar;
        this.h = amqoVar;
        this.u = amqoVar2;
        this.v = afexVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final PlayerConfigModel a() {
        afbi afbiVar = this.n;
        return afbiVar != null ? afbiVar.a() : PlayerConfigModel.b;
    }

    public final aetv b() {
        afbi afbiVar = this.n;
        return afbiVar != null ? afbiVar.b : aetv.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aeub c() {
        afbi afbiVar = this.n;
        return afbiVar != null ? afbiVar.K : aeub.a;
    }

    public final amqo d(PlayerConfigModel playerConfigModel) {
        return playerConfigModel.aJ() ? this.u : adyd.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(String str, aeub aeubVar, PlayerConfigModel playerConfigModel, aflm aflmVar) {
        this.o.put(str, aeje.a(aeubVar, playerConfigModel, aflmVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(afbi afbiVar) {
        if (this.n != null) {
            this.n.H = true;
        }
        this.n = afbiVar;
        if (afbiVar != null) {
            this.v.g(afbiVar.a());
            e(afbiVar.a, afbiVar.K, afbiVar.a(), afbiVar.b.a());
            this.t.l(b(), this.s.af(), afbiVar.a());
        }
        this.p = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        return this.m != null;
    }
}

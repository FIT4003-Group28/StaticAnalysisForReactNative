package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aeww  reason: default package */
/* loaded from: classes.dex */
public final class aeww extends aggw {
    afbi b;
    final /* synthetic */ aewx c;
    private final aanr e;
    private final aetv f;
    private volatile afcd g;
    private final aetg h;
    private volatile boolean i;
    private boolean j;
    private final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean a = new AtomicBoolean();

    public aeww(aewx aewxVar, aanr aanrVar, boolean z, aetv aetvVar, aeub aeubVar) {
        this.c = aewxVar;
        this.b = null;
        this.e = aanrVar;
        this.f = aetvVar;
        aetg aetgVar = new aetg(aetvVar);
        this.h = aetgVar;
        aopu aopuVar = aewxVar.i.s.p().g;
        boolean z2 = aewxVar.i.s.n().f90J;
        VideoStreamingData b = (!aanrVar.g() || !z2) ? aanz.b(aanrVar.g, aopuVar) : aanrVar.h;
        if (!z || aopuVar.isEmpty() || b == null) {
            return;
        }
        PlayerConfigModel playerConfigModel = aanrVar.f;
        aevy aevyVar = aewxVar.i;
        aflk c = afll.c(b, playerConfigModel, aevyVar.s, aevyVar.h);
        PlayerConfigModel playerConfigModel2 = aanrVar.f;
        aevy aevyVar2 = aewxVar.i;
        aflj b2 = afll.b(b, playerConfigModel2, aevyVar2.s, aevyVar2.d(playerConfigModel2));
        String str = aanrVar.b;
        PlayerConfigModel playerConfigModel3 = aanrVar.f;
        aflk aflkVar = aewxVar.i.m != null ? c : afll.e;
        aflj b3 = afll.b(b, playerConfigModel3, aewxVar.i.s, afll.d);
        aeha aehaVar = aewxVar.i.e;
        List list = b.p;
        Set set = aflkVar.a;
        Set set2 = b3.a;
        VideoStreamingData videoStreamingData = b;
        List d = aeha.d(list, set, "video/webm");
        List d2 = aeha.d(list, set2, "audio/webm");
        aegs c2 = aehaVar.c.c(true, playerConfigModel3, str, null);
        afbi afbiVar = new afbi(aewxVar, aanrVar.b, aanrVar.f, aetgVar, z2 ? videoStreamingData : aanz.b(aanrVar.g, aopuVar), aeun.b, afhh.a, c, b2, new aegu((FormatStreamModel[]) d.toArray(new FormatStreamModel[0]), (FormatStreamModel[]) d2.toArray(new FormatStreamModel[0]), null, aehaVar.i(d, str), aeha.h(d2), c2.d, c2, aehaVar.d.aq(), false), new aenf(aanrVar.b, amps.d(aanrVar.g), ((aeot) aetvVar).a, aewxVar.i.e), aewxVar.i.s, aeubVar, null);
        this.b = afbiVar;
        afbiVar.f = aanrVar.i;
        boolean z3 = afbiVar.F;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8 A[RETURN] */
    @Override // defpackage.aggw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.afbi a(java.lang.String r17, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r18, defpackage.aetv r19, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r20, int r21) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeww.a(java.lang.String, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, aetv, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, int):afbi");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        aeyc aeycVar;
        if (this.c.i.s.o().az || this.c.N != 3) {
            aewx aewxVar = this.c;
            aewxVar.w.o(aewxVar.i.m, this.b, false);
            afbi afbiVar = this.b;
            if (afbiVar != null && !afbiVar.q) {
                if (!afbiVar.p) {
                    this.c.d.k();
                }
                this.b.q = true;
            }
            if (this.a.compareAndSet(false, true)) {
                e();
            }
            afbi afbiVar2 = this.b;
            if (afbiVar2 != null && !afbiVar2.F) {
                if (afbiVar2.k() != null) {
                    int intValue = this.b.k().intValue();
                    this.b.q(null);
                    VideoStreamingData c = aanz.c(intValue);
                    PlayerConfigModel playerConfigModel = this.e.f;
                    aevy aevyVar = this.c.i;
                    aflk c2 = afll.c(c, playerConfigModel, aevyVar.s, aevyVar.h);
                    if (this.b.h().c != c2.c) {
                        this.b.s(c2);
                        this.b.o(true);
                    }
                }
                if (this.b.j() != null) {
                    int intValue2 = this.b.j().intValue();
                    if (!this.b.o.a.contains(Integer.valueOf(intValue2))) {
                        VideoStreamingData c3 = aanz.c(intValue2);
                        PlayerConfigModel playerConfigModel2 = this.e.f;
                        aevy aevyVar2 = this.c.i;
                        this.b.r(afll.b(c3, playerConfigModel2, aevyVar2.s, aevyVar2.d(playerConfigModel2)));
                        this.b.o(true);
                    }
                }
                if (this.b.v()) {
                    this.c.Q(this.b);
                    this.c.s.c(this.b);
                    this.b.o(false);
                }
            }
            if (!this.d.compareAndSet(false, true) || this.b == null || !this.i) {
                return;
            }
            if (this.c.g.m() != 1) {
                aeny.g("Warming started too late: playbackState != STATE_IDLE.");
                return;
            }
            aanr aanrVar = this.e;
            VideoStreamingData videoStreamingData = aanrVar.h;
            if (aanrVar.g() && videoStreamingData != null && !this.c.i.s.n().f90J) {
                afbi afbiVar3 = this.b;
                afbiVar3.u(afbiVar3.a(), videoStreamingData, aeun.b, afhh.a, this.b.c());
            }
            this.c.i.f(this.b);
            aexp aexpVar = this.c.w;
            afbi afbiVar4 = this.b;
            afnh afnhVar = aexpVar.b.m;
            if (afnhVar != null) {
                afnhVar.t(aexpVar.f(afnhVar, afbiVar4));
                aexpVar.j();
            }
            ((aeot) this.f).a.w();
            this.c.al(false, false);
            afbi afbiVar5 = this.b;
            if (afbiVar5.F) {
                aeycVar = this.c.C.a(afbiVar5);
                afms.a(aeycVar);
                this.c.W();
            } else {
                aeycVar = this.g;
                afms.a(aeycVar);
                this.c.V();
            }
            if (this.c.i.s.o().f97J) {
                aetv aetvVar = this.f;
                aewx aewxVar2 = this.c;
                aeycVar = new aeyc(aeycVar, aetvVar, aewxVar2.k, aewxVar2.i.s);
            }
            if (this.c.i.s.Z(aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_SNAPPED_START)) {
                this.c.g.i(pkh.b);
            }
            aewx aewxVar3 = this.c;
            long j = this.e.i;
            aflm aflmVar = ((aeot) this.f).a;
            afms.a(aflmVar);
            aewxVar3.ae(aeycVar, j, aflmVar);
            this.j = true;
            aexl aexlVar = this.c.h;
            PlayerConfigModel a = this.b.a();
            afbi afbiVar6 = this.b;
            aexlVar.k(a, afbiVar6.K, afbiVar6.a);
            aewx aewxVar4 = this.c;
            aewxVar4.d.l(this.f, aewxVar4.i.s.af(), this.b.a());
            if (this.b.F) {
                this.c.C.o(this.e.i);
            }
            if (!this.c.i.s.w()) {
                return;
            }
            this.b.K.e("seek", afjt.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        afbi afbiVar = this.b;
        if (afbiVar == null) {
            return;
        }
        aflc a = afld.a(this.e.f);
        aanr aanrVar = this.e;
        a.a = aanrVar.b;
        a.g = ampq.i(aanrVar.g);
        a.d = ((aeot) this.f).a;
        a.h = afbiVar.K;
        boolean z = true;
        a.b = new aexa(afbiVar, 1);
        afjz afjzVar = this.c.i.s;
        if (!afjzVar.V(afjzVar.b.a.a.V(axxd.q).B())) {
            aewx aewxVar = this.c;
            aewxVar.D = new aflf[]{aewxVar.f.a(a.a(), 5), this.c.f.a(a.a(), 5)};
        }
        String str = this.e.g;
        aelc b = str != null ? this.c.p.b(str) : null;
        if (b == null) {
            this.i = false;
            return;
        }
        try {
            if (afbiVar.F) {
                if (this.c.C.a(afbiVar) == null) {
                    z = false;
                }
                this.i = z;
                return;
            }
            aewx aewxVar2 = this.c;
            aexi aexiVar = aewxVar2.i.a;
            aetg aetgVar = this.h;
            PlayerConfigModel a2 = afbiVar.a();
            afcd afcdVar = new afcd(aexiVar.b, aewxVar2.i.b.k(), new afcb(aexi.h(aewxVar2, afbiVar.d, afbiVar), aewxVar2.i.s, a2.A(), a2.z(), afbiVar.d, afbiVar.b.a(), a2.t(), new aexg[]{aexiVar.f(aewxVar2.h)}, aewxVar2.i.d), aewxVar2.l, afbiVar, aetgVar, afbiVar.b.a(), aexiVar.g);
            afcdVar.pY(aewxVar2.k, aewxVar2.i.b);
            this.g = afcdVar;
            aemh aexkVar = new aexk(this.g, afbiVar, this.c);
            this.i = true;
            aqwu aqwuVar = this.e.f.c.e;
            if (aqwuVar == null) {
                aqwuVar = aqwu.b;
            }
            if (!aqwuVar.aZ) {
                aexkVar = this.g;
            }
            b.h(aexkVar);
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(afjt.a(e));
            this.f.g(new afkn("player.exception", 0L, valueOf.length() != 0 ? "swa;info.".concat(valueOf) : new String("swa;info.")));
        }
    }
}

package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aivt  reason: default package */
/* loaded from: classes.dex */
public final class aivt extends ajfb implements aiua {
    public final snc a;
    public final Map b;
    public ahgn c;
    private final afja d;
    private final aadd e;
    private final ajft f;
    private final aynx g;
    private boolean h;

    public aivt(afja afjaVar, aynx aynxVar, aijh aijhVar, aynx aynxVar2, snc sncVar, ajft ajftVar, aadd aaddVar) {
        super(1);
        afjaVar.getClass();
        this.d = afjaVar;
        this.a = sncVar;
        this.f = ajftVar;
        this.g = aynxVar2;
        this.e = aaddVar;
        this.b = new HashMap();
        aypf aypfVar = new aypf();
        aypfVar.d(aiwv.j(aynxVar, aihl.t).Z(new aivs(this, 1)));
        aypfVar.d(aijhVar.b.Z(new aivs(this)));
        apgr apgrVar = y().C;
        if ((apgrVar == null ? apgr.a : apgrVar).b) {
            aypfVar.d(aijhVar.a().Z(new aivs(this, 3)));
        }
        apgr apgrVar2 = y().C;
        if ((apgrVar2 == null ? apgr.a : apgrVar2).h) {
            aypfVar.d(aynxVar2.Z(new aivs(this, 4)));
        }
        aypfVar.d(aiwv.j(aynxVar, aihl.u).Z(new aivs(this, 2)));
    }

    private final void A(String str, String str2, VideoStreamingData videoStreamingData, TrackingUrlModel trackingUrlModel, PlayerConfigModel playerConfigModel) {
        afiz afizVar = (afiz) this.b.get(str2);
        if (afizVar != null) {
            if (afizVar.m) {
                return;
            }
            afizVar.h(trackingUrlModel, str2, null, null, str, videoStreamingData, playerConfigModel);
            return;
        }
        afiz b = this.d.b(trackingUrlModel, str2, null, null, null, str, videoStreamingData, this.h, playerConfigModel);
        if (b == null) {
            return;
        }
        this.b.put(str2, b);
        this.f.addObserver(b);
        if (!x()) {
            return;
        }
        w(b, this.c);
    }

    private final aujv y() {
        aadd aaddVar = this.e;
        if (aaddVar == null || aaddVar.a() == null) {
            return aujv.b;
        }
        atdy atdyVar = this.e.a().i;
        if (atdyVar == null) {
            atdyVar = atdy.a;
        }
        aujv aujvVar = atdyVar.f;
        return aujvVar == null ? aujv.b : aujvVar;
    }

    private final boolean z() {
        arhd a;
        aadd aaddVar = this.e;
        if (aaddVar != null && (a = aaddVar.a()) != null) {
            atdy atdyVar = a.i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            apfk apfkVar = atdyVar.i;
            if (apfkVar == null) {
                apfkVar = apfk.a;
            }
            if (apfkVar.i) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajfb
    public final void R(ahhw ahhwVar) {
        aika c = ahhwVar.c();
        PlayerResponseModel b = ahhwVar.b();
        String e = ahhwVar.e();
        PlayerResponseModel a = ahhwVar.a();
        String k = ahhwVar.k();
        aika aikaVar = aika.NEW;
        int ordinal = c.ordinal();
        if (ordinal == 4 || ordinal == 5) {
            if (a == null || b == null || k == null) {
                return;
            }
            this.h = false;
            A(a.B(), k, b.c, a.f().e, a.c());
        } else if ((ordinal != 7 && ordinal != 8) || b == null || e == null) {
        } else {
            A(b.B(), e, b.c, b.f().e, b.c());
            this.h = false;
        }
    }

    @Override // defpackage.aiua
    public final void a(long j) {
        for (afiz afizVar : this.b.values()) {
            afizVar.J(j);
        }
    }

    @Override // defpackage.ajfb
    public final void c(String str) {
        afiz afizVar = str != null ? (afiz) this.b.get(str) : null;
        if (afizVar != null) {
            if (z()) {
                afizVar.s("dedi", new aivr(this));
            }
            afizVar.y();
        }
    }

    @Override // defpackage.ajfb
    public final void e(ahhx ahhxVar) {
        afiz afizVar = ahhxVar.i() != null ? (afiz) this.b.get(ahhxVar.i()) : null;
        if (afizVar != null) {
            afizVar.F(ahhxVar.j(), ahhxVar.g(), ahhxVar.a());
        }
    }

    @Override // defpackage.ajfb
    public final void g(awan awanVar, String str) {
        if (str == null || !this.b.containsKey(str)) {
            return;
        }
        ((afiz) this.b.get(str)).E(awanVar);
    }

    @Override // defpackage.ajfb
    public final void h(aesr aesrVar, String str) {
        afiz afizVar = str != null ? (afiz) this.b.get(str) : null;
        if (afizVar != null) {
            afizVar.r(aesrVar);
        }
    }

    @Override // defpackage.ajfb
    public final void i(aesr aesrVar, String str) {
        h(aesrVar, str);
    }

    @Override // defpackage.ajfb
    public final void j(String str, afip afipVar, String str2) {
        afiz afizVar = str2 != null ? (afiz) this.b.get(str2) : null;
        if (afizVar != null) {
            afizVar.s(str, afipVar);
        }
    }

    @Override // defpackage.ajfb
    public final void k(awan awanVar, String str) {
        if (str == null || !this.b.containsKey(str)) {
            return;
        }
        ((afiz) this.b.get(str)).t(awanVar);
    }

    @Override // defpackage.ajfb
    public final void l(String str, String str2) {
        if (str == null || !this.b.containsKey(str)) {
            return;
        }
        ((afiz) this.b.get(str)).m(str2);
    }

    @Override // defpackage.ajfb
    public final void m(String str) {
        if (this.b.containsKey(str)) {
            ((afiz) this.b.get(str)).u();
        }
    }

    @Override // defpackage.ajfb
    public final void n(afkn afknVar, String str) {
        afiz afizVar = str != null ? (afiz) this.b.get(str) : null;
        if (afizVar != null) {
            afizVar.v(afknVar);
        }
    }

    @Override // defpackage.ajfb
    public final void o(String str, PlaybackStartDescriptor playbackStartDescriptor) {
        awef awefVar;
        if (!this.b.containsKey(str) && y().d) {
            afja afjaVar = this.d;
            if (playbackStartDescriptor != null) {
                aweh awehVar = playbackStartDescriptor.a.A;
                if (awehVar == null) {
                    awehVar = aweh.a;
                }
                awefVar = awehVar.c;
                if (awefVar == null) {
                    awefVar = awef.a;
                }
            } else {
                awefVar = null;
            }
            afiz a = afjaVar.a(str, awefVar);
            if (a == null) {
                return;
            }
            this.b.put(str, a);
            this.f.addObserver(a);
            if (!x()) {
                return;
            }
            w(a, this.c);
        }
    }

    @Override // defpackage.ajfb
    public final void p(String str) {
        afiz afizVar = (afiz) this.b.get(str);
        if (afizVar != null) {
            this.f.deleteObserver(afizVar);
            afizVar.g();
            this.b.remove(str);
        }
    }

    @Override // defpackage.ajfb
    public final void q(String str) {
        afiz afizVar = str != null ? (afiz) this.b.get(str) : null;
        if (afizVar != null) {
            if (z()) {
                afizVar.s("dedi", new aivr(this, 1));
            }
            afizVar.y();
        }
    }

    @Override // defpackage.ajfb
    public final void r(aikd aikdVar) {
        String str = aikdVar.b;
        afiz afizVar = str != null ? (afiz) this.b.get(str) : null;
        aujv y = y();
        if (aikdVar.i != 4 || afizVar == null || !y.e) {
            return;
        }
        afizVar.z(aikdVar.g, aikdVar.f);
    }

    @Override // defpackage.ajfb
    public final void s(String str, String str2, String str3) {
        afiz afizVar = str3 != null ? (afiz) this.b.get(str3) : null;
        if (afizVar != null) {
            afizVar.C(str, str2);
        }
    }

    @Override // defpackage.ajfb
    public final void t() {
        this.h = true;
    }

    @Override // defpackage.ajfb
    public final void u(aiip aiipVar) {
        afiz afizVar = aiipVar.c() != null ? (afiz) this.b.get(aiipVar.c()) : null;
        if (afizVar == null || aiipVar.b() != 15) {
            return;
        }
        afizVar.D(aiipVar.a());
    }

    @Override // defpackage.ajfb
    public final void v(ahia ahiaVar) {
        afiz afizVar = ahiaVar.b() != null ? (afiz) this.b.get(ahiaVar.b()) : null;
        if (afizVar != null) {
            int a = ahiaVar.a();
            if (a == 2) {
                afizVar.A();
            } else if (a == 3) {
                afizVar.w();
            } else if (a == 5) {
                afizVar.o();
            } else if (a == 6) {
                afizVar.x();
            } else if (a == 7) {
                afizVar.q();
            } else if (a != 9 && a != 10) {
            } else {
                afizVar.B();
            }
        }
    }

    public final boolean x() {
        atdy atdyVar = this.e.a().i;
        if (atdyVar == null) {
            atdyVar = atdy.a;
        }
        aujv aujvVar = atdyVar.f;
        if (aujvVar == null) {
            aujvVar = aujv.b;
        }
        apgr apgrVar = aujvVar.C;
        if (apgrVar == null) {
            apgrVar = apgr.a;
        }
        return apgrVar.g;
    }

    public static void w(afiz afizVar, ahgn ahgnVar) {
        if (ahgnVar != null) {
            int i = ahgnVar.d() == null ? -1 : ahgnVar.d().i;
            boolean z = false;
            if (ahgnVar.d() != null && ahgnVar.d().b()) {
                z = true;
            }
            afizVar.k(i, z, ahgnVar.b(), ahgnVar.a());
        }
    }
}

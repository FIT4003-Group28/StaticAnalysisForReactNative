package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.Set;
/* compiled from: PG */
/* renamed from: afep  reason: default package */
/* loaded from: classes.dex */
public final class afep extends afcs {
    public aesr A;
    public boolean B;
    afgf C;
    public final afjz D;
    private int E;
    public final aeai b;
    public final yrj c;
    public final Handler d;
    public final snc e;
    public aetv f;
    public aetv g;
    aetw h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public afkn y;
    public afkn z;

    public afep(afgg afggVar, aeai aeaiVar, yrj yrjVar, afjz afjzVar, Handler handler, snc sncVar) {
        super(afggVar);
        this.f = aetv.c;
        this.g = aetv.c;
        afms.a(aeaiVar);
        this.b = aeaiVar;
        afms.a(yrjVar);
        this.c = yrjVar;
        afms.a(afjzVar);
        this.D = afjzVar;
        afms.a(handler);
        this.d = handler;
        afms.a(sncVar);
        this.e = sncVar;
    }

    public static final afkn T(afkn afknVar, String str) {
        if ("qoe.livewindow".equals(afknVar.i())) {
            return new afkn("qoe.restart.livewindow", afknVar.a());
        }
        String i = afknVar.i();
        String k = afknVar.k();
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 11 + str.length() + String.valueOf(k).length());
        sb.append("w.");
        sb.append(i);
        sb.append(";action.");
        sb.append(str);
        sb.append(";");
        sb.append(k);
        return new afkn("qoe.restart", afknVar.a(), sb.toString());
    }

    public static final boolean U(afkn afknVar) {
        if (!afknVar.i().equals("net.badstatus") || !afknVar.n()) {
            return afknVar.i().equals("net.retryexhausted") && afknVar.k().contains("net.badstatus");
        }
        return true;
    }

    public final void A() {
        if (this.D.R() && !this.D.aE() && this.i > 0 && this.E > 0 && this.u && !this.v) {
            this.D.aw();
        }
        this.h = null;
        this.C = null;
        this.g = aetv.c;
        this.i = 0;
        this.E = 0;
        this.k = false;
        this.j = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.q = false;
        this.p = false;
        this.r = false;
        this.s = false;
        this.t = 0;
        this.w = false;
        this.x = false;
        this.y = null;
        this.A = null;
        this.z = null;
        this.u = false;
        this.v = false;
        this.B = false;
    }

    @Override // defpackage.afcs, defpackage.affb
    public final void C(float f) {
        aetw aetwVar = this.h;
        if (aetwVar != null) {
            aetwVar.t(Float.valueOf(f));
        }
        super.C(f);
    }

    @Override // defpackage.afcs, defpackage.affb
    public final void D(float f) {
        aetw aetwVar = this.h;
        if (aetwVar != null) {
            aetwVar.u(Float.valueOf(f));
        }
        super.D(f);
    }

    public final void E(final Runnable runnable, final aetv aetvVar, final afkn afknVar) {
        this.d.post(new Runnable() { // from class: afel
            @Override // java.lang.Runnable
            public final void run() {
                afep afepVar = afep.this;
                aetv aetvVar2 = aetvVar;
                afkn afknVar2 = afknVar;
                Runnable runnable2 = runnable;
                if (afepVar.h == null || aetvVar2 != afepVar.f) {
                    aetvVar2.g(afknVar2.d());
                } else {
                    runnable2.run();
                }
            }
        });
    }

    @Override // defpackage.afcs, defpackage.afgg
    public final void F(boolean z) {
        A();
        super.F(z);
    }

    public final void H(final afkn afknVar, final PlayerConfigModel playerConfigModel, final VideoStreamingData videoStreamingData, final String str) {
        if (this.h == null) {
            return;
        }
        E(new Runnable() { // from class: afek
            @Override // java.lang.Runnable
            public final void run() {
                afep afepVar = afep.this;
                PlayerConfigModel playerConfigModel2 = playerConfigModel;
                afkn afknVar2 = afknVar;
                String str2 = str;
                VideoStreamingData videoStreamingData2 = videoStreamingData;
                afepVar.u(playerConfigModel2, afknVar2, str2);
                aetw aetwVar = afepVar.h;
                aetwVar.e = playerConfigModel2;
                aetwVar.b = videoStreamingData2;
                aetwVar.c = new aess(afknVar2.a());
                aetwVar.r(2);
                afepVar.a.K(afepVar.h);
            }
        }, this.f, afknVar);
    }

    @Override // defpackage.afcs, defpackage.afgg
    public final boolean J(afgf afgfVar) {
        afgf a = afgfVar.a(new afeo(this, afgfVar.b.a()));
        if (this.C != null || !super.J(a)) {
            return false;
        }
        this.g = afgfVar.b.a();
        this.C = a;
        return true;
    }

    @Override // defpackage.afcs, defpackage.afgg
    public final afte K(aetw aetwVar) {
        A();
        this.f = aetwVar.a();
        aetw aetwVar2 = new aetw(aetwVar);
        aetwVar2.g = new afeo(this, aetwVar.a());
        this.h = aetwVar2;
        return this.a.K(this.h);
    }

    public final void L(final PlayerConfigModel playerConfigModel, final afkn afknVar, final aetw aetwVar, final afnh afnhVar) {
        this.E++;
        E(new Runnable() { // from class: afej
            @Override // java.lang.Runnable
            public final void run() {
                afep afepVar = afep.this;
                PlayerConfigModel playerConfigModel2 = playerConfigModel;
                afkn afknVar2 = afknVar;
                afnh afnhVar2 = afnhVar;
                aetw aetwVar2 = aetwVar;
                afepVar.u(playerConfigModel2, afknVar2, "newsurface");
                afnhVar2.o();
                aetwVar2.e = playerConfigModel2;
                aetwVar2.c = new aess(afknVar2.a());
                aetwVar2.r(2);
                afepVar.a.y();
                afepVar.a.K(aetwVar2);
            }
        }, this.f, afknVar);
    }

    @Override // defpackage.afcs, defpackage.affb
    public final void M() {
        A();
        super.M();
    }

    public final boolean O(PlayerConfigModel playerConfigModel, afkn afknVar) {
        Set p;
        if (!this.D.U() || !U(afknVar)) {
            if (afknVar.c().equals(afkl.LIBVPX)) {
                return false;
            }
            if (playerConfigModel.d == null) {
                aunv aunvVar = playerConfigModel.c.D;
                if (aunvVar == null) {
                    aunvVar = aunv.a;
                }
                if (aunvVar.c.size() == 0) {
                    p = amyg.a;
                } else {
                    aunv aunvVar2 = playerConfigModel.c.D;
                    if (aunvVar2 == null) {
                        aunvVar2 = aunv.a;
                    }
                    p = amvn.p(aunvVar2.c);
                }
                playerConfigModel.d = p;
            }
            return playerConfigModel.d.contains(afknVar.i());
        }
        return true;
    }

    public final boolean P() {
        aetw aetwVar = this.h;
        if (aetwVar == null) {
            return false;
        }
        return (this.a.c(aetwVar.b, this.h.e) & 4) != 0;
    }

    public final boolean Q() {
        return !this.w;
    }

    public final boolean R(PlayerConfigModel playerConfigModel, afkn afknVar) {
        atzv atzvVar = playerConfigModel.c;
        if ((atzvVar.c & 2048) != 0) {
            aunv aunvVar = atzvVar.D;
            if (aunvVar == null) {
                aunvVar = aunv.a;
            }
            return aunvVar.o && !this.r && !this.j && "fmt.decode".equals(afknVar.i()) && (afknVar.h() instanceof afju) && ((afju) afknVar.h()).a != null;
        }
        return false;
    }

    public final boolean S(PlayerConfigModel playerConfigModel, afnh afnhVar, afkn afknVar) {
        if (afnhVar == null || this.j) {
            return false;
        }
        int i = this.E;
        aunv aunvVar = playerConfigModel.c.D;
        if (aunvVar == null) {
            aunvVar = aunv.a;
        }
        return i < aunvVar.g && O(playerConfigModel, afknVar);
    }

    @Override // defpackage.afcs, defpackage.afgg
    public final void p(afnh afnhVar) {
        aetw aetwVar = this.h;
        if (aetwVar != null) {
            aetwVar.f = afnhVar;
        }
        super.p(afnhVar);
    }

    @Override // defpackage.afcs, defpackage.affb
    public final void q() {
        this.C = null;
        this.g = aetv.c;
        super.q();
    }

    @Override // defpackage.afcs, defpackage.affb
    public final void s() {
        aetw aetwVar = this.h;
        if (aetwVar != null) {
            aetwVar.f = null;
        }
        super.s();
    }

    public final void u(PlayerConfigModel playerConfigModel, afkn afknVar, String str) {
        this.w = true;
        aetv aetvVar = this.f;
        afkn afknVar2 = new afkn(afknVar.c(), afknVar.j(), afknVar.a(), afknVar.k());
        afknVar2.g();
        aetvVar.g(afknVar2);
        this.f.g(T(afknVar, str));
        if (playerConfigModel.aM()) {
            this.a.F(false);
            return;
        }
        this.x = false;
        this.a.M();
    }

    @Override // defpackage.afcs, defpackage.affb
    public final void w() {
        this.f.i("tntnxt", new afem(this.e.d()));
        this.g.i("tntprv", new aest("1"));
        super.w();
    }
}

package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import j$.util.function.Function;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aewx  reason: default package */
/* loaded from: classes.dex */
public final class aewx implements Observer, afdx, aevz, afbh, aexo, afgb, pkg {
    final afgz A;
    public final afig B;
    public final afau C;
    aflf[] D;
    public pqb E;
    public float F;
    public int G;
    protected boolean H;
    final affj I;

    /* renamed from: J  reason: collision with root package name */
    public final boolean f37J;
    public final boolean K;
    public boolean L;
    public final boolean M;
    public int N;
    final axdi O;
    private final aesh P;
    private final snc Q;
    private boolean R;
    private final aewa S;
    private aexu T;
    private aexs U;
    private atu V;
    private atu W;
    private att X;
    private pkd[] Y;
    private final pks Z;
    public final afnr a;
    private final afje aa;
    private final pwx ab;
    private final aezz ac;
    private final afaf ad;
    private final afaa ae;
    private float af;
    private boolean ag;
    private aggw ah;
    private final aggw ai;
    auy b;
    public final aewc c;
    public final aepf d;
    public final pvq e;
    final afle f;
    public pht g;
    final aexl h;
    final aevy i;
    final afex j;
    public final Handler k;
    Handler l;
    public aexv m;
    final aexm n;
    public final afkd o;
    public final aeln p;
    final aejc q;
    final azqb r;
    final aeyf s;
    public final adzz t;
    public String u;
    public final azqb v;
    public final aexp w;
    public final aevv x;
    public final aevx y;
    final avw z;

    public aewx(aepf aepfVar, snc sncVar, pvq pvqVar, afle afleVar, aexi aexiVar, axnm axnmVar, afjz afjzVar, yrj yrjVar, Context context, pwx pwxVar, aeha aehaVar, aeju aejuVar, afmw afmwVar, aesh aeshVar, affj affjVar, amqo amqoVar, amqo amqoVar2, adzz adzzVar, azqb azqbVar, axdi axdiVar, afkd afkdVar, aeln aelnVar, afex afexVar, azqb azqbVar2, afaa afaaVar, afgz afgzVar, yrd yrdVar, afig afigVar, afje afjeVar) {
        Boolean bool;
        avw avwVar;
        Handler handler;
        aevy aevyVar;
        pha phaVar;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.k = handler2;
        aggw aggwVar = new aggw();
        this.ai = aggwVar;
        this.Z = new pks();
        this.N = 1;
        this.ah = aggwVar;
        this.af = 1.0f;
        this.F = 1.0f;
        this.aa = afjeVar;
        this.Q = sncVar;
        this.e = pvqVar;
        this.b = aexi.d(pvqVar);
        this.d = aepfVar;
        this.f = afleVar;
        this.p = aelnVar;
        this.q = new aejc(context, sncVar, afjzVar, handler2, yrjVar);
        this.t = adzzVar;
        this.P = aeshVar;
        this.r = azqbVar2;
        this.A = afgzVar;
        final aevy aevyVar2 = new aevy(aexiVar, aexiVar.g(this, aeshVar, new aewp(this), afjzVar), new affx(affjVar, handler2, this, afte.ANDROID_EXOPLAYER_V2, afjzVar), afjzVar, yrjVar, aehaVar, afmwVar, aejuVar, aepfVar, amqoVar, amqoVar2, afexVar);
        this.i = aevyVar2;
        aeyf aeyfVar = new aeyf(aevyVar2, handler2);
        this.s = aeyfVar;
        this.n = new aexm(aevyVar2);
        this.I = affjVar;
        this.O = axdiVar;
        this.ae = afaaVar;
        this.j = afexVar;
        this.B = afigVar;
        aewc aewcVar = new aewc(adzzVar, afjzVar, handler2, aevyVar2, new aewm(this));
        this.c = aewcVar;
        aqxe aqxeVar = afjzVar.b.b.b().C;
        aqxeVar = aqxeVar == null ? aqxe.a : aqxeVar;
        if (aqxeVar.a(45352483L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45352483L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45352483L);
            bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        boolean booleanValue = bool.booleanValue();
        if (booleanValue) {
            avwVar = new pha(aexiVar.b, context, aewcVar, afjzVar, new aewm(this, 2));
        } else {
            avwVar = avw.a;
        }
        this.z = avwVar;
        aexl aexlVar = new aexl(aevyVar2, afjzVar, yrdVar, afexVar);
        this.h = aexlVar;
        afaf afafVar = new afaf(aexlVar);
        this.ad = afafVar;
        this.ab = pwxVar;
        this.g = aexiVar.a(this, afafVar, pwxVar);
        afms.a(this.T);
        afms.a(this.m);
        afms.a(this.U);
        afms.a(this.V);
        afms.a(this.W);
        afms.a(this.X);
        afms.a(this.Y);
        aewa aewaVar = new aewa(this, aevyVar2, afgzVar);
        this.S = aewaVar;
        this.b.b(aewaVar);
        aevyVar2.s.addObserver(this);
        aevyVar2.f.addObserver(this);
        this.l = new Handler(this.g.c());
        this.ac = new aezz(new amqo() { // from class: aewl
            @Override // defpackage.amqo
            public final Object get() {
                return aevy.this.a();
            }
        });
        this.C = new afau(this.g, aevyVar2.b.k(), handler2, this.l, new aewy(this), afexVar, afleVar, aexiVar.b, aexiVar.e, aexiVar.f, aevyVar2.f, afgzVar, aevyVar2.s, new aexc(this, 2), new Function() { // from class: aexd
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                aewx aewxVar = aewx.this;
                String str = (String) obj;
                aevy aevyVar3 = aewxVar.i;
                long g = aewxVar.g();
                aeje aejeVar = (aeje) aevyVar3.o.get(str);
                if (aejeVar == null) {
                    afkj.e(afki.QOE, "Cannot find PlaybackMappedData for cpn %s", str);
                    aeub c = aevyVar3.c();
                    afkk afkkVar = new afkk("invalid.parameter", g);
                    String valueOf = String.valueOf(str);
                    afkkVar.b = valueOf.length() != 0 ? "No PlaybackMappedData ".concat(valueOf) : new String("No PlaybackMappedData ");
                    c.d(afkkVar.a());
                    return aeje.a(aeub.a, PlayerConfigModel.b, aflm.a);
                }
                return aejeVar;
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        });
        this.f37J = afjzVar.Z(aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_RESET_EXOV2_ON_STOP_VIDEO);
        this.K = afjzVar.Z(aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_RESET_EXOV2_ON_BLOCKING_STOP_VIDEO);
        this.M = afjzVar.T();
        this.H = false;
        this.v = azqbVar;
        if (booleanValue) {
            phaVar = (pha) avwVar;
            handler = handler2;
            aevyVar = aevyVar2;
        } else {
            handler = handler2;
            aevyVar = aevyVar2;
            phaVar = null;
        }
        aevx aevxVar = new aevx(aevyVar, handler, phaVar);
        this.y = aevxVar;
        final aevy aevyVar3 = aevyVar;
        Handler handler3 = handler;
        this.w = new aexp(this.g, aevyVar, aexiVar.b, affjVar, aeyfVar, this.m, this.U, this.X, this, aevxVar, booleanValue ? (pha) avwVar : null);
        if (afjzVar.N()) {
            ((pkl) this.g).c.t(new aewo(this));
        }
        this.o = afkdVar;
        if (afjzVar.o().an && Build.VERSION.SDK_INT >= 24) {
            this.a = new afnr(aexiVar.b, axnmVar, afjzVar, new aewk(this), new zgz() { // from class: aewi
                @Override // defpackage.zgz
                public final Object a() {
                    afbi afbiVar = aewx.this.i.n;
                    return Boolean.valueOf(afbiVar == null ? false : afbiVar.c.f);
                }
            }, new zgz() { // from class: aewd
                @Override // defpackage.zgz
                public final Object a() {
                    return aevy.this.m;
                }
            });
        } else {
            this.a = null;
        }
        this.x = new aevv(handler3, aevyVar3, new aewm(this, 1), new aewm(this));
    }

    private final boolean aA(long j) {
        afbi afbiVar = this.i.n;
        if (afbiVar == null) {
            return false;
        }
        if (afbiVar.b().G() || j == 0) {
            afbiVar.g = 0;
            afbiVar.f = j;
            this.h.m();
            return true;
        }
        if (this.i.s.w()) {
            afbiVar.K.e("ivsk", afjt.c());
        }
        return false;
    }

    private static boolean aB(afjz afjzVar, VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, amqo amqoVar, boolean z) {
        if (z || playerConfigModel.aQ()) {
            for (Integer num : aank.b()) {
                if (videoStreamingData.u(num.intValue())) {
                    return true;
                }
            }
        }
        if (videoStreamingData.y()) {
            return false;
        }
        return afll.a(playerConfigModel, videoStreamingData, afll.c) || afll.g(videoStreamingData, playerConfigModel, afjzVar) || afll.j(videoStreamingData, playerConfigModel, afjzVar, amqoVar) || afll.k(videoStreamingData, playerConfigModel, afjzVar, amqoVar);
    }

    private final synchronized long as() {
        long j;
        afgf S = S();
        j = -1;
        if (S != null) {
            long j2 = S.a;
            if (j2 == -1) {
                j2 = i();
            }
            long g = g();
            if (j2 != -1 && g != -1) {
                j = j2 - g;
            }
        }
        return j;
    }

    private final pks at() {
        pkt s = this.g.s();
        if (s.z()) {
            return null;
        }
        s.y(this.g.l(), this.Z);
        pks pksVar = this.Z;
        Object obj = pksVar.c;
        return obj instanceof aexy ? ((aexy) obj).c.y(0, pksVar) : pksVar;
    }

    private final aegu au(VideoStreamingData videoStreamingData, String str, PlayerConfigModel playerConfigModel, aetv aetvVar, aflk aflkVar, aflj afljVar, aeub aeubVar) {
        amvn amvnVar = aeha.a;
        aeha aehaVar = this.i.e;
        List list = videoStreamingData.p;
        Set set = aflkVar.a;
        Set set2 = afljVar.a;
        boolean z = true;
        int l = agpr.l(aflkVar.c == 3, 16) | 4;
        if (!this.i.b.o() || !playerConfigModel.Y()) {
            z = false;
        }
        aegu c = aehaVar.c(playerConfigModel, list, null, set, set2, l, afca.c(videoStreamingData, z), str, aeubVar);
        if (c.h) {
            afbz.a(aetvVar, this.i.s.ao());
        }
        return c;
    }

    private final synchronized void av(final aeww aewwVar) {
        this.N = 2;
        this.ah = aewwVar;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            aewx aewxVar = aewwVar.c;
            if (!aewxVar.f37J && !aewxVar.K) {
                if (aewwVar.a.compareAndSet(false, true)) {
                    aewwVar.e();
                }
                aewwVar.c.k.post(new Runnable() { // from class: aewv
                    @Override // java.lang.Runnable
                    public final void run() {
                        aeww.this.b();
                    }
                });
                return;
            }
            aewxVar.k.post(new Runnable() { // from class: aewv
                @Override // java.lang.Runnable
                public final void run() {
                    aeww.this.b();
                }
            });
            return;
        }
        aewwVar.b();
    }

    private final synchronized boolean ax() {
        boolean z;
        afgf S = S();
        if (S != null) {
            if (g() >= S.a) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    private final synchronized boolean ay(afbi afbiVar) {
        boolean z = true;
        if (afbiVar.z != null && this.N == 3) {
            if (g() == -1) {
                return z;
            }
            if (ax()) {
                return true;
            }
        }
        z = false;
        return z;
    }

    private final synchronized boolean az(afbi afbiVar, afbi afbiVar2) {
        boolean z;
        afbi afbiVar3;
        if (this.N == 3 && !afbiVar.equals(afbiVar2) && (afbiVar3 = afbiVar.z) != null) {
            if (akzj.f(afbiVar3, afbiVar2)) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @Override // defpackage.aevz
    public final void A(aetv aetvVar, afkl afklVar, String str, String str2) {
        u(aetvVar, new afkn(afklVar, str, g(), str2));
    }

    @Override // defpackage.affb
    public final synchronized void B(long j, auqn auqnVar) {
        if (this.N != 3) {
            return;
        }
        if (aA(j)) {
            aw(false, auqnVar);
        }
        aevy aevyVar = this.i;
        if (aevyVar.j) {
            al(true, false);
        } else if (!aevyVar.i) {
        } else {
            this.w.k(true);
        }
    }

    @Override // defpackage.affb
    public final synchronized void C(float f) {
        am(f, false);
    }

    @Override // defpackage.affb
    public final synchronized void D(float f) {
        float f2;
        FormatStreamModel formatStreamModel;
        afbi afbiVar = this.i.n;
        if (afbiVar == null || !afbiVar.a().ag()) {
            f2 = f;
        } else {
            FormatStreamModel[] formatStreamModelArr = afbiVar.c().b;
            float c = afbiVar.a().c();
            float m = (formatStreamModelArr.length <= 0 || (formatStreamModel = formatStreamModelArr[0]) == null || !formatStreamModel.x()) ? c : agel.m(formatStreamModelArr[0].b());
            if (Math.abs(m - c) > 0.001f) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("afmt.");
                sb.append(m);
                sb.append(";acfg.");
                sb.append(c);
                afbiVar.b.w("vmdiff", sb.toString());
            }
            f2 = agel.o(f, m);
        }
        if (f2 != this.af) {
            afki afkiVar = afki.ABR;
            pht phtVar = this.g;
            ((pkl) phtVar).M();
            float a = pxi.a(f2, 0.0f, 1.0f);
            if (((pkl) phtVar).m != a) {
                ((pkl) phtVar).m = a;
                ((pkl) phtVar).E();
                ((pkl) phtVar).f.ar();
                Iterator it = ((pkl) phtVar).e.iterator();
                while (it.hasNext()) {
                    ((pjx) it.next()).ar();
                }
            }
            this.af = f2;
        }
        this.F = f;
    }

    @Override // defpackage.aevz
    public final synchronized void E(aetv aetvVar, afkn afknVar, afbi afbiVar, phr phrVar) {
        afbi afbiVar2 = afbiVar.z;
        afbi afbiVar3 = this.i.n;
        boolean z = this.H;
        if (this.i.s.ac()) {
            z = afbiVar3 != null && afbiVar3.s;
        }
        if (afknVar.i().equals("fmt.decode") && !z && az(afbiVar, afbiVar3)) {
            afbiVar.b.g(afknVar.d());
            afbiVar3.b.g(afknVar);
            return;
        }
        if (afbiVar2 == null || !afknVar.i().equals("fmt.decode") || !afbiVar.equals(afbiVar3) || (!z && !ay(afbiVar))) {
            if (afknVar.i().equals("offline.partial.nocontent")) {
                aetvVar.g(afknVar);
                return;
            } else if (afknVar.i().equals("player.timeout")) {
                if (!akzj.f(afbiVar, afbiVar3)) {
                    afbiVar.b.g(afknVar.d());
                    return;
                } else {
                    aetvVar.g(afknVar);
                    return;
                }
            } else {
                if (!afknVar.i().equals("staleconfig")) {
                    afknVar.f();
                }
                if (afknVar.i().equals("fmt.decode")) {
                    this.I.p(affi.DECODER_ERROR, afte.ANDROID_EXOPLAYER_V2, 0, afnk.NONE, phrVar, null);
                    this.I.a(aetvVar);
                }
                aetvVar.g(afknVar);
                if (!aetvVar.equals(this.i.b())) {
                    return;
                }
                an(false, false);
                return;
            }
        }
        afbiVar.b.g(afknVar.d());
        long j = afbiVar.k;
        if (j != -1) {
            afbiVar.b.y(j);
        } else {
            afbiVar.b.y(afbiVar.b().d);
        }
        aetw aetwVar = new aetw();
        aetwVar.b = afbiVar2.b();
        aetwVar.c = new aess(0L);
        aetwVar.d = afbiVar2.a;
        aetwVar.e = afbiVar2.a();
        aetwVar.f = null;
        aetwVar.g = afbiVar2.b;
        aetwVar.h = afbiVar2.d();
        aetwVar.u(Float.valueOf(this.F));
        aetwVar.t(Float.valueOf(a()));
        aetwVar.s(2);
        aetwVar.l = afbiVar2.b.a();
        aetwVar.a = afbiVar2.K;
        afmg.ba(aetwVar, true, -1L);
        K(aetwVar);
    }

    @Override // defpackage.afgg
    public final void F(boolean z) {
        amqi b = amqi.b(amok.a);
        this.I.j(afte.ANDROID_EXOPLAYER_V2);
        aetv b2 = this.i.b();
        if (z) {
            b2.v();
        }
        this.y.c(5, 24);
        this.S.c.clear();
        V();
        an(false, false);
        b2.i("lsv", new aest(Long.toString(b.a(TimeUnit.MILLISECONDS))));
    }

    @Override // defpackage.affb
    public final boolean G() {
        return this.g.m() == 2;
    }

    @Override // defpackage.afdx
    public final boolean H(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z) {
        afjz afjzVar = this.i.s;
        boolean D = videoStreamingData.D();
        if (!afjzVar.V(afjzVar.b.a.a.V(axxk.e).B()) || !D) {
            aqwu aqwuVar = playerConfigModel.c.e;
            if (aqwuVar == null) {
                aqwuVar = aqwu.b;
            }
            if (!aqwuVar.g) {
                return false;
            }
        }
        return aB(afjzVar, videoStreamingData, playerConfigModel, this.i.h, z);
    }

    @Override // defpackage.affb
    public final boolean I() {
        if (!this.g.D()) {
            return false;
        }
        int m = this.g.m();
        return m == 2 || m == 3;
    }

    @Override // defpackage.afgg
    public final synchronized boolean J(afgf afgfVar) {
        boolean aB;
        afgf afgfVar2;
        Double d;
        afgn.d(afgfVar.b);
        boolean bb = afmg.bb(afgfVar.b, 8);
        if (!this.i.s.D()) {
            aetw aetwVar = afgfVar.b;
            aB = H(aetwVar.b, aetwVar.e, bb);
        } else {
            aevy aevyVar = this.i;
            afjz afjzVar = aevyVar.s;
            aetw aetwVar2 = afgfVar.b;
            aB = aB(afjzVar, aetwVar2.b, aetwVar2.e, aevyVar.h, bb);
        }
        afbi afbiVar = this.i.n;
        boolean z = false;
        if (aB && afbiVar != null && afbiVar.j == null && ((afgfVar.b.e.ae() || this.i.s.D()) && (this.E instanceof aeyc) && (afbiVar.b().v == afgfVar.b.b.v || this.i.s.al()))) {
            try {
                aetw aetwVar3 = afgfVar.b;
                aewq R = R(aetwVar3.d, aetwVar3.b, aetwVar3.e, aetwVar3.a(), afgn.c(afbiVar.l, 16), afgfVar.b.a);
                aetw aetwVar4 = afgfVar.b;
                String str = aetwVar4.d;
                PlayerConfigModel playerConfigModel = aetwVar4.e;
                aetv a = aetwVar4.a();
                aetw aetwVar5 = afgfVar.b;
                VideoStreamingData videoStreamingData = aetwVar5.b;
                aewj aewjVar = new aewj(aetwVar5);
                aexi aexiVar = this.i.a;
                aetw aetwVar6 = afgfVar.b;
                afhh e = aexi.e(this, aetwVar6.e, aetwVar6.b);
                aflk aflkVar = R.c;
                aflj afljVar = R.b;
                aegu aeguVar = R.a;
                afjz afjzVar2 = this.i.s;
                aetw aetwVar7 = afgfVar.b;
                afbi afbiVar2 = new afbi(this, str, playerConfigModel, a, videoStreamingData, aewjVar, e, aflkVar, afljVar, aeguVar, afjzVar2, aetwVar7.a, aetwVar7.m);
                if (afbiVar2.F) {
                    afgfVar2 = afgfVar;
                    afbiVar2.f = afgfVar2.b.c.a;
                    afau afauVar = this.C;
                    long j = afgfVar2.a;
                    synchronized (afauVar.d) {
                        afauVar.k(afbiVar2);
                        if (!afauVar.c.isEmpty()) {
                            String b = afau.b(((afao) arey.s(afauVar.c)).c);
                            if (j != -1) {
                                double d2 = j;
                                Double.isNaN(d2);
                                d = Double.valueOf(d2 / 1000.0d);
                            } else {
                                d = null;
                            }
                            try {
                                afhl afhlVar = afauVar.e;
                                if (afhlVar.e == 3) {
                                    z = true;
                                }
                                afms.d(z);
                                aopa createBuilder = adzk.a.createBuilder();
                                createBuilder.copyOnWrite();
                                adzk adzkVar = (adzk) createBuilder.instance;
                                b.getClass();
                                adzkVar.b |= 1;
                                adzkVar.c = b;
                                if (d != null) {
                                    double doubleValue = d.doubleValue();
                                    createBuilder.copyOnWrite();
                                    adzk adzkVar2 = (adzk) createBuilder.instance;
                                    adzkVar2.b |= 2;
                                    adzkVar2.d = doubleValue;
                                }
                                try {
                                    try {
                                        adzl adzlVar = (adzl) aopi.parseFrom(adzl.a, afhlVar.d.a.a("setClipEndTime", ((adzk) createBuilder.mo39build()).toByteArray()), aoos.b());
                                    } catch (aopx e2) {
                                        throw new RuntimeException("Unexpected protobuf error", e2);
                                    }
                                } catch (RuntimeException e3) {
                                    throw new afgy(5, "Unexpected error calling into JS.", e3);
                                }
                            } catch (afgy e4) {
                                afauVar.g(e4, afbiVar2);
                            }
                        }
                        afauVar.l(afbiVar2);
                    }
                } else {
                    afgfVar2 = afgfVar;
                }
                afbiVar.i = P(afbiVar2);
                afbiVar.j = afgfVar2;
                afbiVar.z = afbiVar2;
                ap(afbiVar);
                return true;
            } catch (aegw e5) {
                u(afgfVar.b.a(), afgz.d(afkl.DEFAULT, e5, afgfVar.b.b, g()));
            }
        }
        return false;
    }

    @Override // defpackage.afgg
    public final synchronized afte K(aetw aetwVar) {
        afte i;
        aetv aetvVar;
        aewu aewuVar;
        boolean z;
        aetw aetwVar2 = aetwVar;
        synchronized (this) {
            afgn.d(aetwVar);
            VideoStreamingData videoStreamingData = aetwVar2.b;
            String str = aetwVar2.d;
            PlayerConfigModel playerConfigModel = aetwVar2.e;
            aetv a = aetwVar.a();
            int i2 = aetwVar2.k;
            this.i.g.b(a, str);
            this.I.a = this.i.s.O();
            this.I.e(afte.ANDROID_EXOPLAYER_V2);
            pht phtVar = this.g;
            if (phtVar != null) {
                a.c(((pkl) phtVar).k);
            }
            afbi a2 = this.ah.a(str, playerConfigModel, a, videoStreamingData, i2);
            afte afteVar = afte.ANDROID_EXOPLAYER_V2;
            if (a2 == null) {
                try {
                    aewq R = R(str, videoStreamingData, playerConfigModel, a, afgn.c(i2, 16), aetwVar2.a);
                    aetwVar.getClass();
                    aewj aewjVar = new aewj(aetwVar2);
                    aexi aexiVar = this.i.a;
                    afbi afbiVar = new afbi(this, str, playerConfigModel, a, videoStreamingData, aewjVar, aexi.e(this, playerConfigModel, videoStreamingData), R.c, R.b, R.a, this.i.s, aetwVar2.a, aetwVar2.m);
                    i = afbiVar.i();
                    aetvVar = a;
                    aetvVar.j(i);
                    if (R.a.f()) {
                        ((phi) this.g).I();
                    }
                    aetwVar2 = aetwVar;
                    z = false;
                    aewuVar = new aewu(this, aetwVar2, afbiVar, false);
                } catch (aegw e) {
                    a.j(afteVar);
                    u(a, afgz.d(afkl.DEFAULT, e, videoStreamingData, g()));
                    return afteVar;
                }
            } else {
                i = a2.i();
                a.j(i);
                a2.K = aetwVar2.a;
                a2.G = aetwVar2.m;
                this.i.k = true;
                aewuVar = new aewu(this, aetwVar2, a2, true);
                aetvVar = a;
                z = false;
            }
            this.g.h(z);
            this.i.i = afgn.c(aetwVar2.k, 2);
            U(aewuVar);
            this.q.b(aetvVar);
        }
        return i;
    }

    @Override // defpackage.aevz
    public final synchronized void L(afbi afbiVar, int i) {
        boolean z = true;
        if (1 != i) {
            z = false;
        }
        this.ag = z;
        if (i != 0 && afbiVar != null && afbiVar.equals(this.i.n)) {
            pks at = at();
            if (at != null && at.n != -9223372036854775807L) {
                long c = at.c();
                afbiVar.b.k(c, phk.d(at.n) + c);
            }
            ak(false);
        }
    }

    @Override // defpackage.affb
    public final void M() {
        this.I.c(afte.ANDROID_EXOPLAYER_V2);
        this.y.c(5, 24);
        this.i.b().v();
        if (this.K) {
            ai();
        }
        an(true, false);
    }

    @Override // defpackage.afgg
    public final void N(boolean z, int i) {
        if (i == 19) {
            if (z) {
                this.y.a();
            } else {
                this.y.c(6, 19);
            }
        } else if (z) {
            this.y.d(3);
        } else {
            this.y.c(3, i);
        }
        if (this.i.s.N()) {
            this.g.e(!z);
        }
    }

    @Override // defpackage.aevz
    public final synchronized void O(auz auzVar) {
        this.ah.d(auzVar);
    }

    public final pqb P(afbi afbiVar) {
        PlayerConfigModel a;
        VideoStreamingData b;
        aeun d;
        afhh g;
        aexi aexiVar = this.i.a;
        if (afbiVar.b().C()) {
            synchronized (afbiVar) {
                a = afbiVar.a();
                b = afbiVar.b();
                d = afbiVar.d();
                g = afbiVar.g();
            }
            afjm a2 = aflf.a(this.f, new aexa(afbiVar), new aexa(afbiVar, 2), false, 5);
            pnp k = this.i.b.k();
            Handler handler = this.k;
            Handler handler2 = this.l;
            aeyq i = aexi.i(this, afbiVar.b);
            String str = afbiVar.a;
            afbq afbqVar = aexiVar.g;
            aexg[] aexgVarArr = {aexiVar.f(this.h)};
            aevy aevyVar = this.i;
            aezm aezmVar = new aezm(a2, k, handler, handler2, a, b, d, g, i, str, afbiVar, afbqVar, aexgVarArr, aevyVar.d, aevyVar.s);
            aezmVar.pY(this.k, this.i.b);
            return aezmVar;
        } else if (afbiVar.b().w) {
            return new aezw(afbiVar, aflf.a(this.f, new aexa(afbiVar), new aexa(afbiVar, 2), false, 5), aexiVar.b(this, afbiVar), this.i.b.k(), this.k, this.l, aexi.i(this, afbiVar.b), aexiVar.g);
        } else {
            if (!afbiVar.F) {
                afcq afcqVar = new afcq(aexiVar.b, this.i.b.k(), aexiVar.b(this, afbiVar), this.l, afbiVar, afbiVar.b.a(), aexiVar.g);
                afcqVar.pY(this.k, this.i.b);
                return afcqVar;
            }
            pqb a3 = this.C.a(afbiVar);
            afms.a(a3);
            return a3;
        }
    }

    public final aegu Q(afbi afbiVar) {
        try {
            aegu au = au(afbiVar.b(), afbiVar.a, afbiVar.a(), afbiVar.b, afbiVar.h(), afbiVar.o, afbiVar.K);
            afbiVar.t(au);
            return au;
        } catch (aegw e) {
            u(afbiVar.b, afgz.d(afkl.DEFAULT, e, afbiVar.b(), g()));
            return null;
        }
    }

    public final aewq R(String str, VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, aetv aetvVar, boolean z, aeub aeubVar) {
        VideoStreamingData videoStreamingData2;
        VideoStreamingData videoStreamingData3;
        aflj b;
        Set<Integer> set;
        if (!this.i.s.p().r || (this.i.s.Z(aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_CLIENT_FORMAT_SELECTION_FOR_OFFLINE) && videoStreamingData.D())) {
            videoStreamingData2 = videoStreamingData;
            videoStreamingData3 = videoStreamingData2;
        } else {
            String str2 = videoStreamingData.c;
            aelc b2 = this.p.b(str2);
            if (b2 == null) {
                set = amyg.a;
            } else {
                set = b2.e(str2);
            }
            Integer num = null;
            Integer num2 = null;
            for (Integer num3 : set) {
                if (num3 != null) {
                    if (num == null && aank.c().contains(num3)) {
                        num = num3;
                    } else if (num2 == null && aank.b().contains(num3)) {
                        num2 = num3;
                    }
                }
            }
            videoStreamingData2 = (num == null || videoStreamingData.g(num.intValue()) == null) ? videoStreamingData : aanz.c(num.intValue());
            videoStreamingData3 = (num2 == null || videoStreamingData.g(num2.intValue()) == null) ? videoStreamingData : aanz.c(num2.intValue());
        }
        aevy aevyVar = this.i;
        aflk c = afll.c(videoStreamingData2, playerConfigModel, aevyVar.s, aevyVar.h);
        if (!z || !this.i.s.ai() || videoStreamingData.C()) {
            aevy aevyVar2 = this.i;
            b = afll.b(videoStreamingData3, playerConfigModel, aevyVar2.s, aevyVar2.d(playerConfigModel));
        } else {
            b = afll.f;
        }
        aflj afljVar = b;
        return new aewq(au(videoStreamingData, str, playerConfigModel, aetvVar, c, afljVar, aeubVar), afljVar, c);
    }

    final afgf S() {
        if (this.i.n != null) {
            return this.i.n.j;
        }
        return null;
    }

    @Override // defpackage.afgb
    public final afnh T() {
        return this.i.m;
    }

    public final synchronized void U(aewu aewuVar) {
        this.N = 3;
        this.ah = aewuVar;
        aewuVar.b();
    }

    public final void V() {
        this.ad.a = this.h;
        this.C.e();
    }

    public final void W() {
        this.ad.a = this.ac;
        this.C.f();
    }

    @Override // defpackage.afbh
    public final synchronized void X(afbi afbiVar) {
        if (afbiVar.equals(this.i.n)) {
            B(0L, auqn.SEEK_SOURCE_UNKNOWN);
        }
    }

    public final void Y(afbi afbiVar, boolean z) {
        int b = b();
        if (afbiVar.y != b) {
            afbiVar.y = b;
        }
        afbiVar.K.c(b, z);
    }

    @Override // defpackage.afbh
    public final synchronized void Z(afbi afbiVar, boolean z) {
        this.w.k(false);
        if (z) {
            aevy aevyVar = this.i;
            aevyVar.i = false;
            aevyVar.j = true;
            return;
        }
        ab(afbiVar);
    }

    @Override // defpackage.affb
    public final float a() {
        pkl pklVar = (pkl) this.g;
        pklVar.M();
        return pklVar.c.u.l.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void aa() {
        if (this.N == 2) {
            aggw aggwVar = this.ah;
            if (aggwVar instanceof aeww) {
                aeww aewwVar = (aeww) aggwVar;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    aewwVar.b();
                } else {
                    this.k.post(new aexc(this, 1));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ab(afbi afbiVar) {
        afnr afnrVar;
        if (Build.VERSION.SDK_INT >= 24 && (afnrVar = this.a) != null) {
            String a = afnrVar.a();
            if (!a.isEmpty()) {
                afbiVar.b.i("scd", new aest(a));
            }
        }
        if (this.I.b) {
            this.I.a(afbiVar.b);
        }
        Y(afbiVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void ac(int i) {
        afbi afbiVar = this.i.n;
        if (afbiVar == null) {
            return;
        }
        long g = g();
        StringBuilder sb = new StringBuilder(30);
        sb.append("pixelCopyErrorCode.");
        sb.append(i);
        u(afbiVar.b, new afkn("player.exception", g, sb.toString()));
    }

    public final void ad(afbi afbiVar) {
        Object obj = this.i.f.get();
        this.s.d(this.g, obj, 10001);
        afmv afmvVar = (afmv) obj;
        if (afmvVar.d > 0 || afmvVar.c > 0) {
            aevy aevyVar = this.i;
            afbiVar.y(aevyVar.s, aevyVar.d, afmvVar, 10001, aevyVar.g());
        }
    }

    public final synchronized void ae(pqb pqbVar, long j, aflm aflmVar) {
        this.E = pqbVar;
        atu atuVar = this.V;
        if (atuVar instanceof aexq) {
            pkc d = this.g.d(atuVar);
            d.f(10001);
            d.e(new aevl(aflmVar, 1, 0L));
            d.d();
        }
        atu atuVar2 = this.W;
        if (atuVar2 instanceof aexq) {
            pkc d2 = this.g.d(atuVar2);
            d2.f(10001);
            d2.e(new aevl(aflmVar, 1, 0L));
            d2.d();
        }
        pkc d3 = this.g.d(this.T);
        d3.f(10001);
        d3.e(new aevl(aflmVar, 1, 0L));
        d3.d();
        pkc d4 = this.g.d(this.U);
        d4.f(10001);
        d4.e(new aevl(aflmVar, 2, 0L));
        d4.d();
        pkc d5 = this.g.d(this.m);
        d5.f(10001);
        d5.e(new aevl(aflmVar, 2, 0L));
        d5.d();
        if (j > 0) {
            pht phtVar = this.g;
            ((pkl) phtVar).M();
            ((pkl) phtVar).c.y(Collections.singletonList(pqbVar), 0, j, false);
        } else {
            this.g.f(pqbVar);
        }
        aflmVar.A();
        this.g.v();
        this.R = true;
    }

    public final void af(afbi afbiVar, int i) {
        this.s.f(this.g, afbiVar.c().f);
        aevy aevyVar = this.i;
        afbiVar.y(aevyVar.s, aevyVar.d, (afmv) aevyVar.f.get(), i, this.i.g());
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0115 A[Catch: all -> 0x011c, TryCatch #5 {, blocks: (B:20:0x004b, B:21:0x0054, B:23:0x005a, B:25:0x0062, B:30:0x006c, B:31:0x0080, B:32:0x0088, B:36:0x0091, B:38:0x00ac, B:40:0x00bd, B:41:0x00c3, B:42:0x00de, B:43:0x00e0, B:57:0x0115, B:58:0x011a, B:46:0x00fa, B:47:0x0101, B:49:0x0103, B:50:0x010a, B:55:0x0110), top: B:104:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ag(boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aewx.ag(boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ah() {
        aeyi aeyiVar;
        pob pobVar;
        if (this.i.s.o().Z && this.i.b != null && (pobVar = (aeyiVar = this.i.b).b) != null) {
            aeyiVar.m(pobVar);
        }
        aevy aevyVar = this.i;
        aevyVar.b = aevyVar.a.g(this, this.P, new aewp(this), this.i.s);
    }

    public final void ai() {
        aj(null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aj(defpackage.afbi r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aewx.aj(afbi, boolean):void");
    }

    public final void ak(boolean z) {
        aw(z, auqn.SEEK_SOURCE_UNKNOWN);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void al(boolean z, boolean z2) {
        aevy aevyVar = this.i;
        if (aevyVar.i != z || z2) {
            aevyVar.i = z;
            if (z) {
                aevyVar.j = false;
                aevyVar.b().a().F();
            }
            this.g.z(z);
            this.w.k(z);
            if (this.i.s.Z(aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_PLAYER_DEBUG_LOGGING)) {
                aeub c = this.i.c();
                String str = true != z ? "pauseVideo." : "playVideo.";
                String valueOf = String.valueOf(afjt.c());
                c.i("pdl", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
    }

    public final void am(float f, boolean z) {
        afbi afbiVar = this.i.n;
        if (afbiVar == null) {
            return;
        }
        if (f != a()) {
            this.g.A(new pjt(f));
            this.s.e(this.g, f);
        } else if (!z) {
        } else {
            afbiVar.b.p(f);
            if (f == 1.0d) {
                return;
            }
            this.s.e(this.g, f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[Catch: all -> 0x007e, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000b, B:16:0x0038, B:18:0x0044, B:20:0x0048, B:22:0x004d, B:23:0x0050, B:25:0x0057, B:28:0x005f, B:30:0x0067, B:31:0x006a, B:8:0x0015, B:10:0x001e, B:12:0x0022, B:13:0x0031, B:15:0x0035), top: B:37:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[Catch: all -> 0x007e, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000b, B:16:0x0038, B:18:0x0044, B:20:0x0048, B:22:0x004d, B:23:0x0050, B:25:0x0057, B:28:0x005f, B:30:0x0067, B:31:0x006a, B:8:0x0015, B:10:0x001e, B:12:0x0022, B:13:0x0031, B:15:0x0035), top: B:37:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f A[Catch: all -> 0x007e, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000b, B:16:0x0038, B:18:0x0044, B:20:0x0048, B:22:0x004d, B:23:0x0050, B:25:0x0057, B:28:0x005f, B:30:0x0067, B:31:0x006a, B:8:0x0015, B:10:0x001e, B:12:0x0022, B:13:0x0031, B:15:0x0035), top: B:37:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067 A[Catch: all -> 0x007e, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000b, B:16:0x0038, B:18:0x0044, B:20:0x0048, B:22:0x004d, B:23:0x0050, B:25:0x0057, B:28:0x005f, B:30:0x0067, B:31:0x006a, B:8:0x0015, B:10:0x001e, B:12:0x0022, B:13:0x0031, B:15:0x0035), top: B:37:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void an(boolean r6, boolean r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            aevy r0 = r5.i     // Catch: java.lang.Throwable -> L7e
            afbi r0 = r0.n     // Catch: java.lang.Throwable -> L7e
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L13
            if (r7 != 0) goto L38
            aexp r6 = r5.w     // Catch: java.lang.Throwable -> L7e
            boolean r6 = r6.m()     // Catch: java.lang.Throwable -> L7e
            r7 = r6 ^ 1
        L13:
            if (r7 != 0) goto L38
            pht r6 = r5.g     // Catch: java.lang.Throwable -> L7e
            phi r6 = (defpackage.phi) r6     // Catch: java.lang.Throwable -> L7e
            r6.I()     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L31
            boolean r6 = r0.F     // Catch: java.lang.Throwable -> L7e
            if (r6 == 0) goto L31
            afau r6 = r5.C     // Catch: java.lang.Throwable -> L7e
            pht r7 = r6.a     // Catch: java.lang.Throwable -> L7e
            r3 = 0
            r7.b(r3)     // Catch: java.lang.Throwable -> L7e
            r6.k(r2)     // Catch: java.lang.Throwable -> L7e
            r6.n(r2)     // Catch: java.lang.Throwable -> L7e
        L31:
            boolean r6 = r5.f37J     // Catch: java.lang.Throwable -> L7e
            if (r6 == 0) goto L38
            r5.ai()     // Catch: java.lang.Throwable -> L7e
        L38:
            r5.u = r2     // Catch: java.lang.Throwable -> L7e
            aexp r6 = r5.w     // Catch: java.lang.Throwable -> L7e
            r7 = 0
            r6.k(r7)     // Catch: java.lang.Throwable -> L7e
            r5.E = r2     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L4b
            aenf r6 = r0.d     // Catch: java.lang.Throwable -> L7e
            if (r6 == 0) goto L4b
            r6.d()     // Catch: java.lang.Throwable -> L7e
        L4b:
            if (r0 == 0) goto L50
            r5.ab(r0)     // Catch: java.lang.Throwable -> L7e
        L50:
            aevy r6 = r5.i     // Catch: java.lang.Throwable -> L7e
            r6.f(r2)     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L5c
            java.lang.String r6 = r0.l()     // Catch: java.lang.Throwable -> L7e
            goto L5d
        L5c:
            r6 = r2
        L5d:
            if (r6 == 0) goto L65
            aeln r7 = r5.p     // Catch: java.lang.Throwable -> L7e
            aelc r2 = r7.b(r6)     // Catch: java.lang.Throwable -> L7e
        L65:
            if (r2 == 0) goto L6a
            r2.f()     // Catch: java.lang.Throwable -> L7e
        L6a:
            aevy r6 = r5.i     // Catch: java.lang.Throwable -> L7e
            affx r6 = r6.c     // Catch: java.lang.Throwable -> L7e
            r6.c()     // Catch: java.lang.Throwable -> L7e
            afig r6 = r5.B     // Catch: java.lang.Throwable -> L7e
            r6.c()     // Catch: java.lang.Throwable -> L7e
            r5.N = r1     // Catch: java.lang.Throwable -> L7e
            aggw r6 = r5.ai     // Catch: java.lang.Throwable -> L7e
            r5.ah = r6     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r5)
            return
        L7e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aewx.an(boolean, boolean):void");
    }

    @Override // defpackage.afgb
    public final void ao() {
        this.i.p = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void ap(afbi afbiVar) {
        pqb pqbVar = this.E;
        if (pqbVar instanceof aeyc) {
            aeyc aeycVar = (aeyc) pqbVar;
            if (this.i.l) {
                aeycVar.C();
                this.i.l = false;
            } else if (afbiVar.i == null) {
                aeycVar.B();
            } else {
                afgf afgfVar = afbiVar.j;
                afms.a(afgfVar);
                aeycVar.D(afbiVar.i, afgfVar.a, afgfVar.b.c.a);
                boolean bb = afmg.bb(afgfVar.b, 4);
                this.g.h(bb);
                afbiVar.c.i = bb;
            }
        }
    }

    @Override // defpackage.afgb
    public final /* synthetic */ boolean aq() {
        return false;
    }

    @Override // defpackage.aexo
    public final synchronized void ar() {
        afbi afbiVar = this.i.n;
        if (afbiVar != null) {
            u(afbiVar.b, new afkn("gl", g()));
        }
    }

    @Override // defpackage.affb
    public final int b() {
        return this.S.ar();
    }

    @Override // defpackage.afgg
    public final int c(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        afjz afjzVar = this.i.s;
        int i = true != afeu.d(videoStreamingData, playerConfigModel.g) ? 4 : 5;
        if (afjzVar.C()) {
            i |= 16;
        }
        if (playerConfigModel.aE()) {
            i |= 2;
        }
        return (!playerConfigModel.av() || !videoStreamingData.r()) ? i : i | 8;
    }

    @Override // defpackage.afgg
    public final int d() {
        afbi afbiVar = this.i.n;
        return (afbiVar != null ? afbiVar.g() : afhh.a).a(h(), this.Q.c());
    }

    @Override // defpackage.affb
    public final int e() {
        aewa aewaVar = this.S;
        pms pmsVar = aewaVar.b;
        int i = aewaVar.a;
        return pmsVar != null ? i + pmsVar.e : i;
    }

    @Override // defpackage.afgg
    public final long f() {
        long d;
        pks at = at();
        if (at == null) {
            return -1L;
        }
        long c = at.c();
        pkl pklVar = (pkl) this.g;
        pklVar.M();
        pig pigVar = pklVar.c;
        if (pigVar.F()) {
            pjs pjsVar = pigVar.u;
            d = pjsVar.t.equals(pjsVar.s) ? phk.d(pigVar.u.o) : pigVar.r();
        } else if (pigVar.u.a.z()) {
            d = pigVar.w;
        } else {
            pjs pjsVar2 = pigVar.u;
            if (pjsVar2.t.d != pjsVar2.s.d) {
                d = pjsVar2.a.y(pigVar.l(), pigVar.a).b();
            } else {
                long j = pjsVar2.o;
                if (pigVar.u.t.a()) {
                    pjs pjsVar3 = pigVar.u;
                    pjsVar3.a.f(pjsVar3.t.a, pigVar.g).e(pigVar.u.t.b);
                    j = 0;
                }
                pjs pjsVar4 = pigVar.u;
                d = phk.d(pigVar.G(pjsVar4.a, pjsVar4.t, j));
            }
        }
        return c + d;
    }

    @Override // defpackage.afgg
    public final long g() {
        pks at = at();
        if (at == null) {
            return -1L;
        }
        return at.c() + this.g.q();
    }

    @Override // defpackage.afgg
    public final long h() {
        pks at = at();
        if (at != null) {
            long j = at.f;
            if (j != -9223372036854775807L) {
                return j + this.g.q();
            }
            return -1L;
        }
        return -1L;
    }

    @Override // defpackage.afgg
    public final long i() {
        pks at = at();
        if (at == null || at.n == -9223372036854775807L) {
            return -1L;
        }
        return at.c() + (at.n / 1000);
    }

    @Override // defpackage.affb
    public final long j(long j) {
        pqb pqbVar = this.E;
        if (pqbVar instanceof aeys) {
            return ((aeys) pqbVar).A(phk.c(j));
        }
        return -1L;
    }

    @Override // defpackage.affb
    public final FormatStreamModel k() {
        afbi afbiVar = this.i.n;
        if (afbiVar != null) {
            return afbiVar.m;
        }
        return null;
    }

    @Override // defpackage.affb
    public final FormatStreamModel l() {
        afbi afbiVar = this.i.n;
        if (afbiVar != null) {
            return afbiVar.x;
        }
        return null;
    }

    @Override // defpackage.afgg
    public final aegu m(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, aegs aegsVar, int i) {
        aevy aevyVar = this.i;
        aflk c = afll.c(videoStreamingData, playerConfigModel, aevyVar.s, aevyVar.h);
        HashSet hashSet = new HashSet(c.a);
        aevy aevyVar2 = this.i;
        HashSet hashSet2 = new HashSet(afll.b(videoStreamingData, playerConfigModel, aevyVar2.s, aevyVar2.d(playerConfigModel)).a);
        if (this.i.s.o().W) {
            hashSet.removeAll(aank.w());
            hashSet2.removeAll((Set) aank.br.get());
        }
        return this.i.e.c(playerConfigModel, videoStreamingData.p, aegsVar, hashSet, hashSet2, agpr.k(z, 2) | 5 | agpr.l(c.c == 3, 16), i, null, aeub.a);
    }

    @Override // defpackage.affb
    public final synchronized aequ n() {
        aevy aevyVar;
        boolean z;
        boolean z2 = S() != null;
        long as = as();
        aevyVar = this.i;
        if (aevyVar.p == null) {
            afbi afbiVar = aevyVar.n;
            aevyVar.p = new aequ(afbiVar != null ? afbiVar.i() : afte.ANDROID_EXOPLAYER_V2);
            aevyVar.r = true;
        }
        if (aevyVar.b != null) {
            aeyi aeyiVar = aevyVar.b;
            aequ aequVar = aevyVar.p;
            if (aeyiVar.c != 0) {
                boolean z3 = aeyiVar.e;
                int j = aeyiVar.j();
                int i = aeyiVar.c;
                aequVar.a(z3, j, i != 1, i == 2, aeyiVar.d, false);
            }
        }
        if (!aevyVar.r) {
            if (z2) {
                z = true;
            }
        } else {
            z = z2;
        }
        aequ aequVar2 = aevyVar.p;
        VideoStreamingData b = aevyVar.n != null ? aevyVar.n.b() : null;
        affx affxVar = aevyVar.c;
        aequVar2.b(b, z, as, affxVar.b, affxVar.c, aevyVar.q, aevyVar.a().aS());
        aevyVar.r = false;
        return aevyVar.p;
    }

    @Override // defpackage.affb
    public final String o() {
        if (this.i.s.o().P) {
            return this.u;
        }
        afbi afbiVar = this.i.n;
        if (afbiVar == null) {
            return null;
        }
        return afbiVar.a;
    }

    @Override // defpackage.afgg
    public final synchronized void p(afnh afnhVar) {
        afnr afnrVar;
        this.h.e = true;
        this.y.d(4);
        this.I.b(afte.ANDROID_EXOPLAYER_V2);
        if (this.w.o(afnhVar, this.i.n, this.i.i && this.N == 3)) {
            this.ah.c(afnhVar);
            this.C.p(true);
            if (Build.VERSION.SDK_INT < 24 || (afnrVar = this.a) == null) {
                return;
            }
            afnrVar.d();
            return;
        }
        an(false, true);
    }

    @Override // defpackage.affb
    public final synchronized void q() {
        if (this.N != 3) {
            return;
        }
        this.i.s.aF();
        afbi afbiVar = this.i.n;
        if (afbiVar == null || afbiVar.j == null) {
            return;
        }
        afbiVar.i = null;
        afbiVar.z = null;
        afbiVar.j = null;
        ap(afbiVar);
    }

    @Override // defpackage.affb
    public final void r() {
        afnh afnhVar = this.i.m;
        if (afnhVar != null) {
            afnhVar.k();
        }
    }

    @Override // defpackage.pkg
    public final pkd[] ru(Handler handler, pyk pykVar, pli pliVar, psp pspVar, pom pomVar) {
        pmf pmfVar;
        aevy aevyVar = this.i;
        aexi aexiVar = aevyVar.a;
        boolean N = aevyVar.s.N();
        boolean T = this.i.s.T();
        if (N) {
            pmfVar = new pmf(null, new ply(new pky[0]), true != T ? 1 : 2);
        } else {
            pmfVar = new pmf(null, aexi.a);
        }
        aexu aexuVar = new aexu(aexiVar.e, pliVar, this.i, handler, this.n, pmfVar);
        aexi.c(aexuVar, this);
        this.T = aexuVar;
        aevy aevyVar2 = this.i;
        aexv aexvVar = new aexv(aexiVar.e, pykVar, aevyVar2, handler, this.n, this.I, aevyVar2.s.e(), this.z);
        aexi.c(aexvVar, this);
        this.m = aexvVar;
        afjz afjzVar = this.i.s;
        this.U = new aexs(handler, pykVar, afjzVar.ap(), afjzVar.c(), afjzVar.d(), this.i.c, afjzVar.e());
        this.V = new aexq(pliVar, handler, new pky[0]);
        this.W = new aexq(pliVar, handler, new aevt(this.O, this.i));
        att attVar = new att(5000L, handler, pykVar, 50);
        this.X = attVar;
        pkd[] pkdVarArr = {this.T, this.m, this.U, this.V, this.W, attVar};
        this.Y = pkdVarArr;
        return pkdVarArr;
    }

    @Override // defpackage.affb
    public final synchronized void s() {
        amqi b = amqi.b(amok.a);
        this.h.e = false;
        this.y.c(4, 17);
        this.I.d(afte.ANDROID_EXOPLAYER_V2);
        this.w.o(null, this.i.n, false);
        this.ah.c(null);
        this.C.p(false);
        this.i.b().i("ldm", new aest(Long.toString(b.a(TimeUnit.MILLISECONDS))));
    }

    @Override // defpackage.afgg
    public final void t(aanr aanrVar, aetv aetvVar) {
        aeub b = aetz.b(this.k, this.aa.c(aanrVar.b), aetvVar);
        aewc aewcVar = this.c;
        String str = aanrVar.b;
        PlayerConfigModel playerConfigModel = aanrVar.f;
        aewcVar.d = b;
        if (aewcVar.e.Z(aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_PLAYER_DEBUG_LOGGING)) {
            String valueOf = String.valueOf(str);
            b.i("pdl", valueOf.length() != 0 ? "loadOnesieVideo.".concat(valueOf) : new String("loadOnesieVideo."));
        }
        if (aewcVar.e.Z(aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_AV1_DEBUG_LOGGING)) {
            b.e("swpres", true != playerConfigModel.W().contains("c2.android.av1.decoder") ? "abs" : "pres");
        }
        this.i.e(aanrVar.b, b, aanrVar.f, ((aeot) aetvVar).a);
        this.i.g.b(aetvVar, aanrVar.b);
        if (!this.i.s.aF() || !this.i.s.ag()) {
            this.ae.a = null;
        } else {
            this.ae.a = this.C;
        }
        if (this.i.s.ag()) {
            synchronized (this) {
                av(new aeww(this, aanrVar, this.i.s.p().f, aetvVar, b));
            }
        }
    }

    @Override // defpackage.aevz
    public final void u(aetv aetvVar, afkn afknVar) {
        aetvVar.g(afknVar);
        if (!aetvVar.equals(this.i.b()) || !afknVar.n()) {
            return;
        }
        an(false, false);
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        afbi afbiVar;
        if (observable instanceof afjz) {
            if (!(obj instanceof Integer) || ((Integer) obj).intValue() != 2) {
                return;
            }
            synchronized (this) {
                if (this.N == 3 && this.w.n(this.i.n)) {
                    this.w.o(this.i.m, this.i.n, this.i.i);
                }
            }
            return;
        }
        aevy aevyVar = this.i;
        if (observable != aevyVar.f || (afbiVar = aevyVar.n) == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ad(afbiVar);
        } else {
            this.k.post(new aewf(this, afbiVar));
        }
    }

    @Override // defpackage.affb
    public final synchronized void v() {
        if (this.N != 3) {
            return;
        }
        al(false, false);
    }

    @Override // defpackage.affb
    public final synchronized void w() {
        afbi afbiVar = this.i.n;
        if (afbiVar != null && this.N == 3) {
            afbi afbiVar2 = afbiVar.z;
            boolean ac = this.i.s.ac();
            if (ac && afbiVar2 == null) {
                return;
            }
            try {
                this.H = true;
                if (afbiVar2 != null) {
                    afbiVar2.s = true;
                }
                afbiVar.k = g();
                if (ac) {
                    this.i.f(afbiVar2);
                }
                pht phtVar = this.g;
                phtVar.x(phtVar.a(), 0L);
                this.g.h(false);
                if (this.i.s.w()) {
                    afbiVar.K.e("seek", afjt.c());
                }
            } catch (piu unused) {
                this.H = false;
                if (afbiVar2 != null) {
                    afbiVar2.s = false;
                }
                afbiVar.k = -1L;
                afgf afgfVar = afbiVar.j;
                this.i.b().g(new afkn("gapless.seek.next", g(), afgfVar == null ? "queuedVideo.null" : "queuedVideo.valid"));
                if (afgfVar != null) {
                    aetw aetwVar = new aetw(afgfVar.b);
                    aetwVar.f = this.i.m;
                    aetwVar.r(2);
                    K(aetwVar);
                }
            }
        }
    }

    @Override // defpackage.affb
    public final synchronized void x() {
        if (this.N != 3) {
            return;
        }
        if (this.g.m() == 4) {
            aA(0L);
        }
        al(true, false);
    }

    @Override // defpackage.afgg
    public final void y() {
        this.w.i();
    }

    @Override // defpackage.affb
    public final void z() {
        ag(false, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        if (r8.d < r8.b.get()) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aw(boolean r19, defpackage.auqn r20) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aewx.aw(boolean, auqn):void");
    }
}

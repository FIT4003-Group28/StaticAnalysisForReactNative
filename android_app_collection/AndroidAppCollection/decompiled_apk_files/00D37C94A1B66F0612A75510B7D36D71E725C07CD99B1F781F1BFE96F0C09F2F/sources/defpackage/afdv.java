package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.youtube.libvpx.VpxDecoder;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.media.player.drm.WidevineHelper$Listener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: afdv  reason: default package */
/* loaded from: classes.dex */
public final class afdv implements WidevineHelper$Listener, Observer, afdx, ota, ovt, aeuy, afgb {
    private static final afcz aC = afcz.a;
    int A;
    public volatile Object B;
    public afdz C;
    public long D;
    public oun E;
    public afhh F;
    public aegu G;
    public FormatStreamModel H;
    public FormatStreamModel I;

    /* renamed from: J  reason: collision with root package name */
    public aepk f40J;
    public FormatStreamModel K;
    public aegx L;
    public int M;
    public int N;
    public final afjz O;
    public final pcw P;
    private final Context Q;
    private final adzz R;
    private final afle S;
    private final aeju T;
    private final aejc U;
    private final affy V;
    private afdh W;
    private final aeha X;
    private final afdi Y;
    private final afmw Z;
    public final amqo a;
    private int aA;
    private aevk aB;
    private final afda aD;
    private final axdi aE;
    private affq aF;
    private final AtomicInteger aa;
    private final afjm ab;
    private final afdl ac;
    private final pwx ad;
    private final afkd ae;
    private final aeln af;
    private final snc ag;
    private afgh ah;
    private ouo ai;
    private ouo aj;
    private Surface ak;
    private pgg al;
    private aere am;
    private float an;
    private boolean ao;
    private boolean ap;
    private String aq;
    private aerx ar;
    private boolean as;
    private float at;
    private int au;
    private boolean av;
    private ScheduledFuture aw;
    private afmv ax;
    private boolean ay;
    private aequ az;
    public final yrj b;
    public final ScheduledExecutorService c;
    public final aepf d;
    public final affj e;
    public aetv f;
    public aeub g;
    final afdu h;
    public final afdt i;
    public final Handler j;
    final afdn k;
    public final affu l;
    public final afft m;
    public final afgu n;
    public final affx o;
    afnh p;
    afdo q;
    public otb r;
    public afgj s;
    public VideoStreamingData t;
    public afdp u;
    public int v;
    public int w;
    public PlayerConfigModel x;
    public boolean y;
    public Future z;

    public afdv(Context context, yrj yrjVar, adzz adzzVar, ScheduledExecutorService scheduledExecutorService, afle afleVar, aepf aepfVar, aeju aejuVar, aeha aehaVar, aesh aeshVar, afjz afjzVar, afmw afmwVar, axdi axdiVar, snc sncVar, azqb azqbVar, afjm afjmVar, pwx pwxVar, affj affjVar, afkd afkdVar, aeln aelnVar, affu affuVar) {
        pcw pcwVar = aeat.a;
        afda afdaVar = new afda(context, azqbVar, aeshVar);
        afcz afczVar = aC;
        amqo amqoVar = afll.a;
        Handler handler = new Handler(Looper.getMainLooper());
        this.aa = new AtomicInteger();
        this.ac = new afdl();
        this.m = new afft();
        this.E = new oum(0L, 0L);
        this.L = aegx.a;
        this.M = 0;
        this.aA = 0;
        this.Q = context.getApplicationContext();
        afms.a(yrjVar);
        this.b = yrjVar;
        afms.a(adzzVar);
        this.R = adzzVar;
        afms.a(scheduledExecutorService);
        this.c = scheduledExecutorService;
        afms.a(afleVar);
        this.S = afleVar;
        afms.a(aepfVar);
        this.d = aepfVar;
        afms.a(aejuVar);
        this.T = aejuVar;
        afms.a(aehaVar);
        this.X = aehaVar;
        afms.a(afjzVar);
        this.O = afjzVar;
        afms.a(afmwVar);
        this.Z = afmwVar;
        afms.a(axdiVar);
        this.aE = axdiVar;
        afms.a(pcwVar);
        this.P = pcwVar;
        afms.a(sncVar);
        this.ag = sncVar;
        this.F = afhh.a;
        afms.a(afdaVar);
        this.aD = afdaVar;
        afms.a(afjmVar);
        this.ab = afjmVar;
        afms.a(afczVar);
        afms.a(amqoVar);
        this.a = amqoVar;
        afms.a(pwxVar);
        this.ad = pwxVar;
        this.e = affjVar;
        this.U = new aejc(context, sncVar, afjzVar, handler, yrjVar);
        this.j = handler;
        this.aB = aevk.b;
        this.V = new affy(adzzVar, afjzVar);
        this.k = new afdn(this);
        this.f = aetv.c;
        this.g = aeub.a;
        this.h = new afdu(this);
        this.W = new afdh(new afct(this, 5), this.f);
        this.Y = new afdi(this);
        this.i = new afdt(this);
        this.o = new affx(affjVar, handler, this, afte.ANDROID_EXOPLAYER, afjzVar);
        this.n = new afgu();
        this.at = 1.0f;
        this.av = true;
        this.ae = afkdVar;
        this.af = aelnVar;
        this.l = affuVar;
    }

    public static long A(VideoStreamingData videoStreamingData) {
        Object obj;
        try {
            int i = videoStreamingData.g;
            ovy h = ((owm) ((owc) ((owf) videoStreamingData.k.l).b(((owf) obj).a() - 1).b.get(0)).b.get(0)).h();
            int a = h.a();
            int b = h.b(0L);
            long j = 0;
            for (int max = Math.max(a, (b - i) + 1); max <= b; max++) {
                j += h.d(max, 0L);
            }
            return j / 1000;
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            throw new afdk(e);
        }
    }

    private final void aA() {
        this.r.n();
        aere aereVar = this.am;
        if (aereVar != null) {
            aereVar.l();
        }
    }

    private final void aB(aegu aeguVar) {
        afms.a(this.r);
        afms.a(this.x);
        if (this.x.at() && aeguVar.a.length > 1) {
            this.r.k(this.s, 1, aeguVar.f);
        }
        aD(aeguVar);
    }

    private final void aC() {
        this.au = e();
        this.A = b();
    }

    private final void aD(aegu aeguVar) {
        PlayerConfigModel playerConfigModel;
        if (this.r == null || (playerConfigModel = this.x) == null || aeguVar == null || !this.ap || !playerConfigModel.at() || aeguVar.b.length <= 1) {
            return;
        }
        String c = aeguVar.c();
        int b = this.r.b(0);
        FormatStreamModel[] formatStreamModelArr = aeguVar.b;
        int length = formatStreamModelArr.length;
        String str = null;
        String str2 = null;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            FormatStreamModel formatStreamModel = formatStreamModelArr[i];
            if (c != null && c.equals(formatStreamModel.q())) {
                str = formatStreamModel.e;
                break;
            }
            if (str2 == null && formatStreamModel.E()) {
                str2 = formatStreamModel.e;
            }
            i++;
        }
        if (str != null || str2 == null) {
            str2 = str;
        }
        if (str2 != null) {
            MediaFormat[] mediaFormatArr = ((otd) this.r).c[0];
            int length2 = mediaFormatArr != null ? mediaFormatArr.length : 0;
            for (int i2 = 0; i2 < length2; i2++) {
                if (str2.equals(((otd) this.r).c[0][i2].a)) {
                    if (i2 == b) {
                        return;
                    }
                    this.r.m(0, i2);
                    otb otbVar = this.r;
                    otbVar.j(otbVar.c() + 1);
                    if (!this.O.w()) {
                        return;
                    }
                    this.f.i("seek", new aest(afmk.a(Thread.currentThread().getStackTrace())));
                    return;
                }
            }
        }
        this.r.m(0, 0);
    }

    private final boolean aF() {
        return this.x.X() || Float.compare(this.at, 1.0f) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean aG(int r21) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afdv.aG(int):boolean");
    }

    private final boolean aH(afnk afnkVar, boolean z) {
        if (this.p == null) {
            return false;
        }
        try {
            this.e.g(afnkVar, afte.ANDROID_EXOPLAYER);
            this.p.t(afnkVar);
            if (this.p.C().equals(afnk.GL_GVR)) {
                ((afmx) this.p.h()).F(true != aI() ? 1 : 2);
            }
            return true;
        } catch (IllegalStateException e) {
            ar(e, z);
            return false;
        } catch (UnsupportedOperationException e2) {
            if (afnkVar.equals(afnk.GL_GVR)) {
                this.e.g(afnk.SURFACE, afte.ANDROID_EXOPLAYER);
                return aH(afnk.SURFACE, z);
            }
            ar(e2, z);
            return false;
        }
    }

    private final boolean aI() {
        return this.N == 4;
    }

    private final ouo[] aJ(VideoStreamingData videoStreamingData, FormatStreamModel[] formatStreamModelArr, FormatStreamModel[] formatStreamModelArr2, aegx aegxVar, boolean z, aetv aetvVar) {
        FormatStreamModel[] formatStreamModelArr3;
        int i;
        boolean z2;
        if (videoStreamingData.y()) {
            aanm aanmVar = videoStreamingData.k;
            aflm a = aetvVar.a();
            this.s = am(formatStreamModelArr2[0].f, aegxVar);
            afga aL = aL(aN());
            long A = A(this.t);
            Handler handler = this.j;
            afde afdeVar = new afde(this);
            aanmVar.o = handler;
            aanmVar.p = afdeVar;
            afgh afghVar = new afgh(new aeut(aanmVar, aS(formatStreamModelArr), ak(this.x, aetv.c), this.s, A, this.j, this, u()), aL, this.x.D() * this.x.h() * 1024, this.j, this.i, u(), this.x.y(), this.am, aF());
            this.ah = afghVar;
            return new ouo[]{new aeve(new afgc(new aeut(aanmVar, aR(formatStreamModelArr2), ak(this.x, aetv.c), null, A, this.j, this, u()), aL, this.x.g() * this.x.h() * 1024, this.j, this.Y, u(), this.x.y(), this.am), this.ac, this.am, this.j, this.W, new aevl(a, 1, TimeUnit.MILLISECONDS.toMicros(this.x.t())), this.x.aE()), aj(afghVar, aI(), a)};
        } else if (!videoStreamingData.C()) {
            long j = videoStreamingData.d;
            afga aL2 = aL(aN());
            int length = formatStreamModelArr.length;
            ouo[] ouoVarArr = new ouo[length > 0 ? 2 : 1];
            int i2 = true != this.x.at() ? 1 : Integer.MAX_VALUE;
            if (aQ(this.x, this.t)) {
                formatStreamModelArr3 = formatStreamModelArr2;
                i = (formatStreamModelArr3.length <= 0 || !aank.s().contains(Integer.valueOf(formatStreamModelArr3[0].e())) || !this.x.aB() || !((Boolean) afll.d.get()).booleanValue()) ? 7 : 6;
            } else {
                formatStreamModelArr3 = formatStreamModelArr2;
                i = 2;
            }
            int i3 = i2;
            ouoVarArr[0] = aO(aL2, an(aR(formatStreamModelArr2), null, j, 1, aK(formatStreamModelArr3, this.aq, i2), afgn.a(this.x), null, aetvVar), i, aetvVar.a());
            if (length > 0) {
                this.s = am(formatStreamModelArr2[0].f, aegxVar);
                ouoVarArr[1] = aM(aL2, an(aS(formatStreamModelArr), this.s, j, 0, aK(formatStreamModelArr, this.aq, i3), afgn.b(this.x, this.d), null, aetvVar), this.x.aT(), z, aetvVar.a());
            }
            return ouoVarArr;
        } else {
            boolean G = videoStreamingData.G();
            aflm a2 = aetvVar.a();
            this.s = am(formatStreamModelArr2[0].f, aegxVar);
            afga aL3 = aL(aN());
            Exchanger exchanger = new Exchanger();
            int ag = ag();
            if (!G) {
                aqwu aqwuVar = this.x.c.e;
                if (aqwuVar == null) {
                    aqwuVar = aqwu.b;
                }
                if (!aqwuVar.aP) {
                    z2 = false;
                    PlayerConfigModel playerConfigModel = this.x;
                    Arrays.sort(formatStreamModelArr, new wd(13));
                    afgh afghVar2 = new afgh(new aeva(this.aq, formatStreamModelArr, aflf.a(this.S, new afdc(playerConfigModel, 1), new afct(this, 4), false, 5), this.s, this.F, this.P, z2, ag, exchanger, this.j, null, u(), this.x, this.t.E(), this.b, null), aL3, this.x.D() * this.x.h() * 1024, this.j, this.i, u(), this.x.y(), null, aF());
                    this.ah = afghVar2;
                    return new ouo[]{new aeve(new afgc(new aeva(this.aq, formatStreamModelArr2, aflf.a(this.S, new afdc(playerConfigModel), new afct(this, 4), false, 5), null, this.F, this.P, G, ag, exchanger, this.j, this, u(), this.x, this.t.E(), this.b, null), aL3, this.x.g() * this.x.h() * 1024, this.j, this.Y, u(), this.x.y(), null), this.ac, this.am, this.j, this.W, new aevl(a2, 1, TimeUnit.MILLISECONDS.toMicros(this.x.t())), this.x.aE()), aj(afghVar2, aI(), a2)};
                }
            }
            z2 = true;
            PlayerConfigModel playerConfigModel2 = this.x;
            Arrays.sort(formatStreamModelArr, new wd(13));
            afgh afghVar22 = new afgh(new aeva(this.aq, formatStreamModelArr, aflf.a(this.S, new afdc(playerConfigModel2, 1), new afct(this, 4), false, 5), this.s, this.F, this.P, z2, ag, exchanger, this.j, null, u(), this.x, this.t.E(), this.b, null), aL3, this.x.D() * this.x.h() * 1024, this.j, this.i, u(), this.x.y(), null, aF());
            this.ah = afghVar22;
            return new ouo[]{new aeve(new afgc(new aeva(this.aq, formatStreamModelArr2, aflf.a(this.S, new afdc(playerConfigModel2), new afct(this, 4), false, 5), null, this.F, this.P, G, ag, exchanger, this.j, this, u(), this.x, this.t.E(), this.b, null), aL3, this.x.g() * this.x.h() * 1024, this.j, this.Y, u(), this.x.y(), null), this.ac, this.am, this.j, this.W, new aevl(a2, 1, TimeUnit.MILLISECONDS.toMicros(this.x.t())), this.x.aE()), aj(afghVar22, aI(), a2)};
        }
    }

    private final owl[] aK(FormatStreamModel[] formatStreamModelArr, String str, int i) {
        FormatStreamModel[] formatStreamModelArr2 = formatStreamModelArr;
        int min = Math.min(formatStreamModelArr2.length, i);
        owl[] owlVarArr = new owl[min];
        int i2 = 0;
        while (i2 < min) {
            FormatStreamModel formatStreamModel = formatStreamModelArr2[i2];
            PlayerConfigModel playerConfigModel = this.x;
            aalz n = formatStreamModel.n();
            n.c(str);
            n.e(afmg.d(formatStreamModel, playerConfigModel));
            Uri a = n.a();
            aqzx aqzxVar = formatStreamModel.a;
            String str2 = formatStreamModel.b;
            long k = formatStreamModel.k();
            ovm d = ovm.d(formatStreamModel);
            String uri = a.toString();
            aqzy aqzyVar = aqzxVar.m;
            if (aqzyVar == null) {
                aqzyVar = aqzy.a;
            }
            long j = aqzyVar.c;
            aqzy aqzyVar2 = aqzxVar.m;
            if (aqzyVar2 == null) {
                aqzyVar2 = aqzy.a;
            }
            int i3 = min;
            long j2 = aqzyVar2.d;
            aqzy aqzyVar3 = aqzxVar.n;
            if (aqzyVar3 == null) {
                aqzyVar3 = aqzy.a;
            }
            long j3 = aqzyVar3.c;
            aqzy aqzyVar4 = aqzxVar.n;
            if (aqzyVar4 == null) {
                aqzyVar4 = aqzy.a;
            }
            long j4 = aqzyVar4.d;
            owlVarArr[i2] = new owl(str2, k, d, new owr(new owj("", j, (j2 - j) + 1), 1L, 0L, j3, (j4 - j3) + 1), formatStreamModel.h, formatStreamModel.j(), uri);
            i2++;
            formatStreamModelArr2 = formatStreamModelArr;
            min = i3;
        }
        return owlVarArr;
    }

    private final afga aL(affq affqVar) {
        this.aF = affqVar;
        return new afga(new pbo(this.x.h() * 1024), this.ad, this.t.D(), affqVar);
    }

    private final ouo aM(afga afgaVar, ovk ovkVar, boolean z, boolean z2, aflm aflmVar) {
        afnh afnhVar;
        if (!z2 && (afnhVar = this.p) != null) {
            afnhVar.q();
        }
        afgh afghVar = new afgh(ovkVar, afgaVar, this.x.D() * this.x.h() * 1024, this.j, this.i, u(), this.x.y(), null, aF());
        this.ah = afghVar;
        if (z2) {
            return ai(afghVar);
        }
        return new aevg(this.Q, this.ah, this.ac, this.am, this.j, this.h, new aevl(aflmVar, 2, TimeUnit.MILLISECONDS.toMicros(this.x.t())), z, O().l, this.x.p());
    }

    private final affq aN() {
        afct afctVar;
        VideoStreamingData videoStreamingData = this.t;
        if (videoStreamingData == null || !videoStreamingData.B() || this.t.G() || !this.t.C() || this.x.P() == asuk.LIVE_ONLY_PEG_STRATEGY_DO_NOT_PEG) {
            afctVar = new afct(this, 1);
        } else {
            afctVar = new afct(this, 6);
        }
        return new affq(afctVar, new afct(this), new afct(this, 2), this.O.n().A, pvq.a);
    }

    private final ouo aO(afga afgaVar, ovk ovkVar, int i, aflm aflmVar) {
        ovj ovjVar = new ovj(ovkVar, afgaVar, this.x.g() * this.x.h() * 1024, this.j, this.Y, u(), this.x.y());
        if (i == 7) {
            return new axdo(ovjVar, this.j, this.W, this.aE);
        }
        if (i == 6) {
            Handler handler = this.j;
            afdh afdhVar = this.W;
            axdi axdiVar = this.aE;
            pce.a(axdiVar);
            return new oxk(ovjVar, handler, afdhVar, new axdn(handler, afdhVar, new axdb(axdiVar)));
        }
        return new aeve(ovjVar, this.ac, this.am, this.j, this.W, new aevl(aflmVar, 1, TimeUnit.MILLISECONDS.toMicros(this.x.t())), this.x.aE());
    }

    private final void aP(ouo[] ouoVarArr) {
        aC();
        this.ai = null;
        this.aj = ouoVarArr[0];
        if (ouoVarArr.length > 1) {
            this.ai = ouoVarArr[1];
        }
    }

    private static final boolean aQ(PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData) {
        if (playerConfigModel != null && videoStreamingData != null && playerConfigModel.au()) {
            if (videoStreamingData.v()) {
                return true;
            }
            if (playerConfigModel.aC() && videoStreamingData.r()) {
                return true;
            }
        }
        return false;
    }

    private static final owa aR(FormatStreamModel[] formatStreamModelArr) {
        if (formatStreamModelArr.length != 1) {
            int e = formatStreamModelArr[0].e();
            ArrayList arrayList = new ArrayList();
            arrayList.add(formatStreamModelArr[0]);
            for (int i = 1; i < formatStreamModelArr.length; i++) {
                if (e == formatStreamModelArr[i].e()) {
                    arrayList.add(formatStreamModelArr[i]);
                }
            }
            formatStreamModelArr = (FormatStreamModel[]) arrayList.toArray(new FormatStreamModel[arrayList.size()]);
        }
        return new afcy(formatStreamModelArr, 1);
    }

    private static final owa aS(FormatStreamModel[] formatStreamModelArr) {
        return new afcy(formatStreamModelArr);
    }

    public static final int[] af(FormatStreamModel[] formatStreamModelArr, owc owcVar) {
        ArrayList arrayList = new ArrayList(formatStreamModelArr.length);
        for (FormatStreamModel formatStreamModel : formatStreamModelArr) {
            String str = formatStreamModel.e;
            for (int i = 0; i < owcVar.b.size(); i++) {
                if (str.equals(((owm) owcVar.b.get(i)).e.a)) {
                    if (formatStreamModel.E()) {
                        arrayList.add(0, Integer.valueOf(i));
                    } else {
                        arrayList.add(Integer.valueOf(i));
                    }
                }
            }
        }
        return almu.y(arrayList);
    }

    private final int ag() {
        FormatStreamModel formatStreamModel = this.H;
        if (formatStreamModel != null) {
            return formatStreamModel.h();
        }
        VideoStreamingData videoStreamingData = this.t;
        if (videoStreamingData != null) {
            return videoStreamingData.b();
        }
        return 0;
    }

    private final ost ah() {
        ouo ouoVar = this.ai;
        if (ouoVar instanceof oud) {
            return ((oud) ouoVar).b;
        }
        if (!(ouoVar instanceof pgd)) {
            return null;
        }
        return ((pgd) ouoVar).a;
    }

    private final ouo ai(oui ouiVar) {
        String l = pgd.l();
        String libvpxConfig = VpxDecoder.a ? VpxDecoder.getLibvpxConfig() : null;
        StringBuilder sb = new StringBuilder(String.valueOf(l).length() + 40 + String.valueOf(libvpxConfig).length());
        sb.append("[INFO] Using libvpx ");
        sb.append(l);
        sb.append(" built with config: ");
        sb.append(libvpxConfig);
        zep.l(sb.toString());
        Handler handler = this.j;
        afdu afduVar = this.h;
        aqwu aqwuVar = this.x.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return new pgd(ouiVar, handler, afduVar, aqwuVar.aJ, this.x.aG(), this.O.Z(aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_LIBVPX_ZERO_COPY), this.O.ap(), this.O.c(), this.O.d());
    }

    private final pbl ak(PlayerConfigModel playerConfigModel, aetv aetvVar) {
        afle afleVar = this.S;
        aflc a = afld.a(playerConfigModel);
        a.b = new afct(this, 4);
        a.d = aetvVar.a();
        a.h = this.g;
        a.a = this.aq;
        a.g = ampq.i(this.t.c);
        return new afln(afleVar.a(a.a(), 5).a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r1.y != 3) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.afdj al(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r14, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r15, defpackage.aegs r16, boolean r17, boolean r18, int r19, java.lang.String r20, defpackage.aflk r21) {
        /*
            r13 = this;
            r0 = r13
            r2 = r15
            r1 = r14
            r3 = r21
            boolean r4 = r1.s
            if (r4 == 0) goto Ld
            com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r1 = r14.m()
        Ld:
            if (r3 == 0) goto L36
            java.util.Set r4 = r3.a
            java.util.List r5 = r1.r
            java.util.Iterator r5 = r5.iterator()
        L17:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L36
            java.lang.Object r6 = r5.next()
            com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel r6 = (com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel) r6
            int r6 = r6.e()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r6 = r4.contains(r6)
            if (r6 == 0) goto L17
            int r4 = r1.y
            r5 = 3
            if (r4 == r5) goto L3e
        L36:
            afjz r3 = r0.O
            amqo r4 = r0.a
            aflk r3 = defpackage.afll.c(r1, r15, r3, r4)
        L3e:
            r11 = r3
            afjz r3 = r0.O
            amqo r4 = defpackage.afll.d
            aflj r3 = defpackage.afll.b(r1, r15, r3, r4)
            boolean r4 = r15.at()
            r5 = 4
            int r4 = defpackage.agpr.l(r4, r5)
            boolean r5 = r15.at()
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L5b
            if (r17 == 0) goto L5b
            r7 = 1
        L5b:
            r5 = 8
            int r5 = defpackage.agpr.l(r7, r5)
            r4 = r4 | r5
            r5 = 2
            r7 = r18
            int r5 = defpackage.agpr.k(r7, r5)
            r4 = r4 | r5
            r7 = r4 | 1
            afdj r12 = new afdj
            aeha r4 = r0.X
            java.util.List r5 = r1.p
            java.util.Set r6 = r11.a
            java.util.Set r8 = r3.a
            boolean r3 = r1.v
            r9 = 480(0x1e0, float:6.73E-43)
            if (r3 == 0) goto L91
            boolean r1 = r1.D()
            if (r1 != 0) goto L91
            aerx r1 = r0.ar
            if (r1 == 0) goto L93
            boolean r1 = r1.g
            if (r1 == 0) goto L93
            boolean r1 = r15.Y()
            if (r1 != 0) goto L91
            goto L93
        L91:
            r9 = r19
        L93:
            aeub r10 = defpackage.aeub.a
            r1 = r4
            r2 = r15
            r3 = r5
            r4 = r16
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r20
            aegu r1 = r1.c(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r2 = r11.c
            r12.<init>(r1, r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afdv.al(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, aegs, boolean, boolean, int, java.lang.String, aflk):afdj");
    }

    private final afgj am(int i, aegx aegxVar) {
        afev affpVar;
        final int u = u();
        if (this.O.aJ()) {
            affpVar = new affc(this.O, this.g);
        } else {
            aepf aepfVar = this.d;
            yrj yrjVar = this.b;
            PlayerConfigModel playerConfigModel = this.x;
            affpVar = new affp(aepfVar, yrjVar, playerConfigModel, this.R, playerConfigModel.aL(), this.Z, aegxVar, new avk(i, 3), this.x.e(), this.x.d(), this.t.c, this.aq, this.O, new afct(this, 3), new afkm() { // from class: afdb
                @Override // defpackage.afkm
                public final void a(final afkn afknVar) {
                    final afdv afdvVar = afdv.this;
                    final int i2 = u;
                    final Runnable runnable = new Runnable() { // from class: afcx
                        @Override // java.lang.Runnable
                        public final void run() {
                            afdv afdvVar2 = afdv.this;
                            afkn afknVar2 = afknVar;
                            afdvVar2.F(true);
                            afdvVar2.V(afknVar2);
                        }
                    };
                    afdvVar.j.post(new Runnable() { // from class: afcw
                        @Override // java.lang.Runnable
                        public final void run() {
                            afdv afdvVar2 = afdv.this;
                            int i3 = i2;
                            Runnable runnable2 = runnable;
                            if (afdvVar2.u() == i3) {
                                runnable2.run();
                            }
                        }
                    });
                }
            }, this.g, this.f);
        }
        return new afgj(affpVar, this.m);
    }

    private final afgm an(owa owaVar, ovo ovoVar, long j, int i, owl[] owlVarArr, afgq afgqVar, aflf aflfVar, aetv aetvVar) {
        afln ak;
        if (aflfVar != null) {
            ak = new afln(aflfVar.a);
        } else {
            ak = ak(this.x, aetvVar);
        }
        return new afgm(owaVar, ak, ovoVar, j, i, owlVarArr, afgqVar, i == 0 && this.x.aT(), this.j, new afgd(this.o), this.x.ad(), this.O);
    }

    private final void ap() {
        aelc aelcVar = null;
        this.q = null;
        VideoStreamingData videoStreamingData = this.t;
        String str = videoStreamingData != null ? videoStreamingData.c : null;
        if (str != null) {
            aelcVar = this.af.b(str);
        }
        if (aelcVar != null) {
            aelcVar.f();
        }
    }

    private final void ar(Exception exc, boolean z) {
        if (z) {
            M();
        }
        if (affu.e(exc)) {
            aetv aetvVar = this.f;
            IllegalStateException illegalStateException = (IllegalStateException) exc;
            long g = g();
            afnh afnhVar = this.p;
            aetvVar.g(affu.b(illegalStateException, g, afnhVar == null ? null : afnhVar.A()));
            return;
        }
        this.f.g(new afkn("player.fatalexception", g(), exc));
    }

    private final void as() {
        aegu aeguVar;
        boolean z = true;
        if (!this.O.n && ((aeguVar = this.G) == null || this.x == null || !aeguVar.e() || !this.x.ad())) {
            z = false;
        }
        if (this.as != z) {
            afnk O = O();
            this.as = z;
            if (this.p == null || O == O()) {
                return;
            }
            p(this.p);
        }
    }

    private final void at() {
        if (!this.ap) {
            this.ap = true;
            aD(this.G);
        }
    }

    private final void au(aflm aflmVar) {
        if (this.r != null) {
            P();
            if (!this.av) {
                return;
            }
            aflmVar.F();
            this.r.l(true);
        }
    }

    private final void av(ouo[] ouoVarArr, long j) {
        this.r.j(j);
        if (this.O.w()) {
            this.f.i("seek", new aest(afmk.a(Thread.currentThread().getStackTrace())));
        }
        az(this.an);
        Z(this.aA);
        P();
        this.r.g(ouoVarArr);
        if (!this.y || this.ai == null) {
            return;
        }
        this.r.m(1, -1);
    }

    private final void aw() {
        if (this.r != null) {
            S();
            this.r.h();
            aere aereVar = this.am;
            if (aereVar != null) {
                aereVar.l();
                this.am = null;
            }
            this.r = null;
            this.C = null;
            this.B = null;
        }
    }

    private final void ax() {
        R();
        aC();
        this.d.k();
        this.ai = null;
        this.ah = null;
        this.aj = null;
        this.t = null;
        this.u = null;
        this.aB.a();
        ay();
        this.aa.incrementAndGet();
        this.Z.deleteObserver(this);
        this.O.deleteObserver(this);
        this.D = 0L;
        this.E = new oum(0L, 0L);
        Future future = this.z;
        if (future != null) {
            future.cancel(true);
            this.z = null;
        }
        this.m.c();
        this.ap = false;
        this.aq = null;
        this.o.c();
    }

    private final void ay() {
        this.G = null;
        this.H = null;
        this.I = null;
        this.K = null;
        this.f40J = aepk.a;
        this.L = aegx.a;
        this.M = 0;
    }

    private final void az(float f) {
        ouo ouoVar;
        this.an = f;
        otb otbVar = this.r;
        if (otbVar == null || (ouoVar = this.aj) == null) {
            return;
        }
        otbVar.k(ouoVar, 1, Float.valueOf(f));
        if (!this.O.Z(aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_LOG_VOLUME)) {
            return;
        }
        aetv aetvVar = this.f;
        StringBuilder sb = new StringBuilder(17);
        sb.append("v=");
        sb.append(f);
        aetvVar.w("sv", sb.toString());
    }

    @Override // defpackage.affb
    public final void B(long j, auqn auqnVar) {
        if (this.r != null) {
            VideoStreamingData videoStreamingData = this.t;
            if (videoStreamingData != null && !videoStreamingData.G() && j != 0) {
                return;
            }
            if (((otd) this.r).d) {
                this.f.t(j);
            } else {
                this.f.o(j);
            }
            VideoStreamingData videoStreamingData2 = this.t;
            if (videoStreamingData2 != null && videoStreamingData2.B()) {
                long max = Math.max(0L, Math.max(0L, E() - this.F.j) - ag());
                boolean z = j == 0 || (max > 0 && j >= max);
                this.F.h(z);
                if (z) {
                    aetv aetvVar = this.f;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i = this.F.j;
                    StringBuilder sb = new StringBuilder(14);
                    sb.append("ms.");
                    sb.append(i);
                    aetvVar.i("sklv", new aeue(elapsedRealtime, sb.toString()));
                }
            }
            this.ao = true;
            affx affxVar = this.o;
            int binarySearch = Arrays.binarySearch(affxVar.h.toArray(), Long.valueOf(1000 * j));
            affxVar.j = binarySearch;
            if (binarySearch < 0) {
                if (binarySearch == -1) {
                    affxVar.d();
                }
                affxVar.j = Math.max((-affxVar.j) - 2, 0);
            }
            this.r.j(j);
            affq affqVar = this.aF;
            pvq pvqVar = affqVar.a;
            affqVar.b = SystemClock.elapsedRealtime();
            if (!this.O.w()) {
                return;
            }
            this.f.i("seek", new aest(afmk.a(Thread.currentThread().getStackTrace())));
        }
    }

    @Override // defpackage.affb
    public final void C(float f) {
        otb otbVar = this.r;
        if (otbVar != null) {
            this.at = f;
            ouo ouoVar = this.aj;
            if (ouoVar != null) {
                otbVar.k(ouoVar, 100, Float.valueOf(f));
            }
            ouo ouoVar2 = this.ai;
            if (ouoVar2 != null) {
                this.r.k(ouoVar2, 100, Float.valueOf(f));
            }
            afgj afgjVar = this.s;
            if (afgjVar != null) {
                this.r.k(afgjVar, 4, Float.valueOf(f));
            }
            this.f.p(f);
            afgh afghVar = this.ah;
            if (afghVar == null) {
                return;
            }
            afghVar.d = aF();
        }
    }

    @Override // defpackage.affb
    public final void D(float f) {
        az(agel.n(this.x, f));
    }

    public final long E() {
        return this.E.b()[1];
    }

    @Override // defpackage.afgg
    public final void F(boolean z) {
        this.e.j(afte.ANDROID_EXOPLAYER);
        R();
        this.g.c(b(), false);
        if (this.r != null) {
            aA();
            ap();
            ax();
            if (!z) {
                return;
            }
            this.f.v();
        }
    }

    @Override // defpackage.affb
    public final boolean G() {
        otb otbVar = this.r;
        return otbVar != null && ((otd) otbVar).e == 3;
    }

    @Override // defpackage.afdx
    public final boolean H(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z) {
        afjz afjzVar = this.O;
        if (afjzVar.V(afjzVar.b.a.a.V(axxd.n).B())) {
            return false;
        }
        if (videoStreamingData.x()) {
            return z || playerConfigModel.aQ();
        } else if (videoStreamingData.y() || videoStreamingData.C()) {
            return true;
        } else {
            if (!playerConfigModel.az()) {
                return false;
            }
            boolean aK = this.O.aK(playerConfigModel.V());
            boolean j = afll.j(videoStreamingData, playerConfigModel, this.O, this.a);
            boolean k = afll.k(videoStreamingData, playerConfigModel, this.O, this.a);
            if (!aK && !j && !k) {
                return false;
            }
            Set p = aank.p();
            Set y = aank.y();
            Set z2 = aank.z();
            Set b = aank.b();
            Set v = aank.v();
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            for (FormatStreamModel formatStreamModel : videoStreamingData.n) {
                int e = formatStreamModel.e();
                if (formatStreamModel.P()) {
                    if (!z5) {
                        z5 = (aK && p.contains(Integer.valueOf(e))) || (j && y.contains(Integer.valueOf(e))) || (k && z2.contains(Integer.valueOf(e)));
                    }
                    if (!z4) {
                        z4 = v.contains(Integer.valueOf(e));
                    }
                }
                if (formatStreamModel.C() && !z3) {
                    z3 = b.contains(Integer.valueOf(e));
                }
                if (z3 && z5) {
                    return true;
                }
            }
            return z3 && !z4;
        }
    }

    @Override // defpackage.affb
    public final boolean I() {
        otb otbVar = this.r;
        if (otbVar != null) {
            otd otdVar = (otd) otbVar;
            if (otdVar.d) {
                int i = otdVar.e;
                return i == 3 || i == 4;
            }
        }
        return false;
    }

    @Override // defpackage.afgg
    public final boolean J(afgf afgfVar) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dd, code lost:
        if ((android.os.SystemClock.elapsedRealtime() - r0.n) > r1.d) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0123  */
    @Override // defpackage.afgg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.afte K(defpackage.aetw r17) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afdv.K(aetw):afte");
    }

    public final aekw L(String str, ExecutorService executorService) {
        return new aekw(str, executorService, this.O.L());
    }

    @Override // defpackage.affb
    public final void M() {
        this.e.c(afte.ANDROID_EXOPLAYER);
        R();
        this.g.c(b(), false);
        if (this.r != null) {
            aA();
            aw();
            ap();
            ax();
            this.f.v();
        }
    }

    @Override // defpackage.afgg
    public final /* synthetic */ void N(boolean z, int i) {
    }

    final afnk O() {
        VideoStreamingData videoStreamingData = this.t;
        afnh afnhVar = this.p;
        PlayerConfigModel playerConfigModel = this.x;
        afjz afjzVar = this.O;
        int i = this.N;
        boolean z = this.ay;
        boolean z2 = this.as;
        boolean z3 = false;
        if (videoStreamingData != null && videoStreamingData.equals(VideoStreamingData.a)) {
            z3 = true;
        }
        return afeu.e(videoStreamingData, afnhVar, playerConfigModel, afjzVar, i, z, z2, z3);
    }

    public final void P() {
        Q(false);
    }

    public final void Q(boolean z) {
        afnh afnhVar = this.p;
        pgg pggVar = null;
        Surface A = (afnhVar == null || !afnhVar.E()) ? null : this.p.A();
        afnh afnhVar2 = this.p;
        if (afnhVar2 != null) {
            pggVar = afnhVar2.i();
        }
        String valueOf = String.valueOf(A);
        String valueOf2 = String.valueOf(pggVar);
        String.valueOf(valueOf).length();
        String.valueOf(valueOf2).length();
        if (this.r != null && this.ai != null && ((A != null || pggVar != null) && (this.ak != A || this.al != pggVar))) {
            W();
            if (z) {
                if (A != null) {
                    this.e.i(A, afte.ANDROID_EXOPLAYER);
                    this.r.f(this.ai, 1, A);
                } else {
                    this.r.f(this.ai, 2, pggVar);
                }
            } else if (A != null) {
                this.e.i(A, afte.ANDROID_EXOPLAYER);
                this.r.k(this.ai, 1, A);
            } else {
                this.r.k(this.ai, 2, pggVar);
            }
            this.r.m(1, 0);
            this.ak = A;
            this.al = pggVar;
        }
        aetv aetvVar = this.f;
        afnh afnhVar3 = this.p;
        aetvVar.x((afnhVar3 != null ? afnhVar3.C() : afnk.NONE).m);
        aE();
    }

    public final synchronized void R() {
        ScheduledFuture scheduledFuture = this.aw;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.aw = null;
        }
    }

    public final void S() {
        if (this.r != null && this.ai != null && this.p != null) {
            this.e.i(null, afte.ANDROID_EXOPLAYER);
            this.r.f(this.ai, 1, null);
        }
        this.ak = null;
        this.al = null;
        aE();
        this.f.x(afnk.NONE.m);
    }

    @Override // defpackage.afgb
    public final afnh T() {
        return this.p;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0215 A[Catch: all -> 0x0538, TRY_LEAVE, TryCatch #2 {all -> 0x0538, afdk -> 0x0510, aegw -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:10:0x002a, B:12:0x002f, B:14:0x0035, B:16:0x0039, B:18:0x003f, B:21:0x0065, B:46:0x00db, B:48:0x00fc, B:49:0x0105, B:51:0x010b, B:52:0x0113, B:54:0x013b, B:55:0x013e, B:57:0x0152, B:59:0x0156, B:62:0x015d, B:64:0x0161, B:66:0x0167, B:68:0x016d, B:70:0x0173, B:72:0x0179, B:75:0x017e, B:77:0x0184, B:80:0x018d, B:82:0x0193, B:83:0x01a0, B:85:0x01bc, B:86:0x01ce, B:88:0x01d5, B:89:0x01e5, B:91:0x01ed, B:95:0x01f8, B:101:0x020f, B:103:0x0215, B:108:0x022e, B:214:0x048c, B:216:0x0490, B:217:0x0493, B:219:0x0497, B:220:0x04a8, B:224:0x04b9, B:225:0x04d0, B:226:0x04f0, B:229:0x0510, B:111:0x023f, B:113:0x024f, B:115:0x0255, B:117:0x025d, B:119:0x0265, B:121:0x026d, B:123:0x0273, B:125:0x0279, B:127:0x027f, B:129:0x0282, B:131:0x0286, B:133:0x028a, B:135:0x0298, B:137:0x02a0, B:139:0x02a8, B:141:0x02b0, B:143:0x02be, B:145:0x02cd, B:149:0x02e5, B:151:0x02fd, B:153:0x0305, B:154:0x030b, B:155:0x0326, B:157:0x0340, B:159:0x0345, B:161:0x0380, B:163:0x0386, B:165:0x03a3, B:167:0x03a7, B:168:0x03ad, B:170:0x03b1, B:172:0x03bb, B:173:0x03bd, B:174:0x03c8, B:213:0x047f, B:177:0x03d6, B:179:0x03dc, B:207:0x0446, B:209:0x0453, B:212:0x046f, B:182:0x03e5, B:185:0x03ee, B:187:0x0404, B:189:0x040d, B:191:0x0411, B:197:0x0427, B:199:0x0436, B:233:0x0524, B:24:0x0080, B:27:0x0085, B:30:0x008f, B:33:0x009a, B:36:0x00a4, B:39:0x00ad, B:42:0x00be, B:45:0x00cd), top: B:244:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023f A[Catch: all -> 0x0538, TryCatch #2 {all -> 0x0538, afdk -> 0x0510, aegw -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:10:0x002a, B:12:0x002f, B:14:0x0035, B:16:0x0039, B:18:0x003f, B:21:0x0065, B:46:0x00db, B:48:0x00fc, B:49:0x0105, B:51:0x010b, B:52:0x0113, B:54:0x013b, B:55:0x013e, B:57:0x0152, B:59:0x0156, B:62:0x015d, B:64:0x0161, B:66:0x0167, B:68:0x016d, B:70:0x0173, B:72:0x0179, B:75:0x017e, B:77:0x0184, B:80:0x018d, B:82:0x0193, B:83:0x01a0, B:85:0x01bc, B:86:0x01ce, B:88:0x01d5, B:89:0x01e5, B:91:0x01ed, B:95:0x01f8, B:101:0x020f, B:103:0x0215, B:108:0x022e, B:214:0x048c, B:216:0x0490, B:217:0x0493, B:219:0x0497, B:220:0x04a8, B:224:0x04b9, B:225:0x04d0, B:226:0x04f0, B:229:0x0510, B:111:0x023f, B:113:0x024f, B:115:0x0255, B:117:0x025d, B:119:0x0265, B:121:0x026d, B:123:0x0273, B:125:0x0279, B:127:0x027f, B:129:0x0282, B:131:0x0286, B:133:0x028a, B:135:0x0298, B:137:0x02a0, B:139:0x02a8, B:141:0x02b0, B:143:0x02be, B:145:0x02cd, B:149:0x02e5, B:151:0x02fd, B:153:0x0305, B:154:0x030b, B:155:0x0326, B:157:0x0340, B:159:0x0345, B:161:0x0380, B:163:0x0386, B:165:0x03a3, B:167:0x03a7, B:168:0x03ad, B:170:0x03b1, B:172:0x03bb, B:173:0x03bd, B:174:0x03c8, B:213:0x047f, B:177:0x03d6, B:179:0x03dc, B:207:0x0446, B:209:0x0453, B:212:0x046f, B:182:0x03e5, B:185:0x03ee, B:187:0x0404, B:189:0x040d, B:191:0x0411, B:197:0x0427, B:199:0x0436, B:233:0x0524, B:24:0x0080, B:27:0x0085, B:30:0x008f, B:33:0x009a, B:36:0x00a4, B:39:0x00ad, B:42:0x00be, B:45:0x00cd), top: B:244:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0490 A[Catch: all -> 0x0538, TryCatch #2 {all -> 0x0538, afdk -> 0x0510, aegw -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:10:0x002a, B:12:0x002f, B:14:0x0035, B:16:0x0039, B:18:0x003f, B:21:0x0065, B:46:0x00db, B:48:0x00fc, B:49:0x0105, B:51:0x010b, B:52:0x0113, B:54:0x013b, B:55:0x013e, B:57:0x0152, B:59:0x0156, B:62:0x015d, B:64:0x0161, B:66:0x0167, B:68:0x016d, B:70:0x0173, B:72:0x0179, B:75:0x017e, B:77:0x0184, B:80:0x018d, B:82:0x0193, B:83:0x01a0, B:85:0x01bc, B:86:0x01ce, B:88:0x01d5, B:89:0x01e5, B:91:0x01ed, B:95:0x01f8, B:101:0x020f, B:103:0x0215, B:108:0x022e, B:214:0x048c, B:216:0x0490, B:217:0x0493, B:219:0x0497, B:220:0x04a8, B:224:0x04b9, B:225:0x04d0, B:226:0x04f0, B:229:0x0510, B:111:0x023f, B:113:0x024f, B:115:0x0255, B:117:0x025d, B:119:0x0265, B:121:0x026d, B:123:0x0273, B:125:0x0279, B:127:0x027f, B:129:0x0282, B:131:0x0286, B:133:0x028a, B:135:0x0298, B:137:0x02a0, B:139:0x02a8, B:141:0x02b0, B:143:0x02be, B:145:0x02cd, B:149:0x02e5, B:151:0x02fd, B:153:0x0305, B:154:0x030b, B:155:0x0326, B:157:0x0340, B:159:0x0345, B:161:0x0380, B:163:0x0386, B:165:0x03a3, B:167:0x03a7, B:168:0x03ad, B:170:0x03b1, B:172:0x03bb, B:173:0x03bd, B:174:0x03c8, B:213:0x047f, B:177:0x03d6, B:179:0x03dc, B:207:0x0446, B:209:0x0453, B:212:0x046f, B:182:0x03e5, B:185:0x03ee, B:187:0x0404, B:189:0x040d, B:191:0x0411, B:197:0x0427, B:199:0x0436, B:233:0x0524, B:24:0x0080, B:27:0x0085, B:30:0x008f, B:33:0x009a, B:36:0x00a4, B:39:0x00ad, B:42:0x00be, B:45:0x00cd), top: B:244:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0497 A[Catch: all -> 0x0538, TryCatch #2 {all -> 0x0538, afdk -> 0x0510, aegw -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:10:0x002a, B:12:0x002f, B:14:0x0035, B:16:0x0039, B:18:0x003f, B:21:0x0065, B:46:0x00db, B:48:0x00fc, B:49:0x0105, B:51:0x010b, B:52:0x0113, B:54:0x013b, B:55:0x013e, B:57:0x0152, B:59:0x0156, B:62:0x015d, B:64:0x0161, B:66:0x0167, B:68:0x016d, B:70:0x0173, B:72:0x0179, B:75:0x017e, B:77:0x0184, B:80:0x018d, B:82:0x0193, B:83:0x01a0, B:85:0x01bc, B:86:0x01ce, B:88:0x01d5, B:89:0x01e5, B:91:0x01ed, B:95:0x01f8, B:101:0x020f, B:103:0x0215, B:108:0x022e, B:214:0x048c, B:216:0x0490, B:217:0x0493, B:219:0x0497, B:220:0x04a8, B:224:0x04b9, B:225:0x04d0, B:226:0x04f0, B:229:0x0510, B:111:0x023f, B:113:0x024f, B:115:0x0255, B:117:0x025d, B:119:0x0265, B:121:0x026d, B:123:0x0273, B:125:0x0279, B:127:0x027f, B:129:0x0282, B:131:0x0286, B:133:0x028a, B:135:0x0298, B:137:0x02a0, B:139:0x02a8, B:141:0x02b0, B:143:0x02be, B:145:0x02cd, B:149:0x02e5, B:151:0x02fd, B:153:0x0305, B:154:0x030b, B:155:0x0326, B:157:0x0340, B:159:0x0345, B:161:0x0380, B:163:0x0386, B:165:0x03a3, B:167:0x03a7, B:168:0x03ad, B:170:0x03b1, B:172:0x03bb, B:173:0x03bd, B:174:0x03c8, B:213:0x047f, B:177:0x03d6, B:179:0x03dc, B:207:0x0446, B:209:0x0453, B:212:0x046f, B:182:0x03e5, B:185:0x03ee, B:187:0x0404, B:189:0x040d, B:191:0x0411, B:197:0x0427, B:199:0x0436, B:233:0x0524, B:24:0x0080, B:27:0x0085, B:30:0x008f, B:33:0x009a, B:36:0x00a4, B:39:0x00ad, B:42:0x00be, B:45:0x00cd), top: B:244:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04b4 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a A[Catch: all -> 0x0538, TryCatch #2 {all -> 0x0538, afdk -> 0x0510, aegw -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:10:0x002a, B:12:0x002f, B:14:0x0035, B:16:0x0039, B:18:0x003f, B:21:0x0065, B:46:0x00db, B:48:0x00fc, B:49:0x0105, B:51:0x010b, B:52:0x0113, B:54:0x013b, B:55:0x013e, B:57:0x0152, B:59:0x0156, B:62:0x015d, B:64:0x0161, B:66:0x0167, B:68:0x016d, B:70:0x0173, B:72:0x0179, B:75:0x017e, B:77:0x0184, B:80:0x018d, B:82:0x0193, B:83:0x01a0, B:85:0x01bc, B:86:0x01ce, B:88:0x01d5, B:89:0x01e5, B:91:0x01ed, B:95:0x01f8, B:101:0x020f, B:103:0x0215, B:108:0x022e, B:214:0x048c, B:216:0x0490, B:217:0x0493, B:219:0x0497, B:220:0x04a8, B:224:0x04b9, B:225:0x04d0, B:226:0x04f0, B:229:0x0510, B:111:0x023f, B:113:0x024f, B:115:0x0255, B:117:0x025d, B:119:0x0265, B:121:0x026d, B:123:0x0273, B:125:0x0279, B:127:0x027f, B:129:0x0282, B:131:0x0286, B:133:0x028a, B:135:0x0298, B:137:0x02a0, B:139:0x02a8, B:141:0x02b0, B:143:0x02be, B:145:0x02cd, B:149:0x02e5, B:151:0x02fd, B:153:0x0305, B:154:0x030b, B:155:0x0326, B:157:0x0340, B:159:0x0345, B:161:0x0380, B:163:0x0386, B:165:0x03a3, B:167:0x03a7, B:168:0x03ad, B:170:0x03b1, B:172:0x03bb, B:173:0x03bd, B:174:0x03c8, B:213:0x047f, B:177:0x03d6, B:179:0x03dc, B:207:0x0446, B:209:0x0453, B:212:0x046f, B:182:0x03e5, B:185:0x03ee, B:187:0x0404, B:189:0x040d, B:191:0x0411, B:197:0x0427, B:199:0x0436, B:233:0x0524, B:24:0x0080, B:27:0x0085, B:30:0x008f, B:33:0x009a, B:36:0x00a4, B:39:0x00ad, B:42:0x00be, B:45:0x00cd), top: B:244:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc A[Catch: all -> 0x0538, TryCatch #2 {all -> 0x0538, afdk -> 0x0510, aegw -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:10:0x002a, B:12:0x002f, B:14:0x0035, B:16:0x0039, B:18:0x003f, B:21:0x0065, B:46:0x00db, B:48:0x00fc, B:49:0x0105, B:51:0x010b, B:52:0x0113, B:54:0x013b, B:55:0x013e, B:57:0x0152, B:59:0x0156, B:62:0x015d, B:64:0x0161, B:66:0x0167, B:68:0x016d, B:70:0x0173, B:72:0x0179, B:75:0x017e, B:77:0x0184, B:80:0x018d, B:82:0x0193, B:83:0x01a0, B:85:0x01bc, B:86:0x01ce, B:88:0x01d5, B:89:0x01e5, B:91:0x01ed, B:95:0x01f8, B:101:0x020f, B:103:0x0215, B:108:0x022e, B:214:0x048c, B:216:0x0490, B:217:0x0493, B:219:0x0497, B:220:0x04a8, B:224:0x04b9, B:225:0x04d0, B:226:0x04f0, B:229:0x0510, B:111:0x023f, B:113:0x024f, B:115:0x0255, B:117:0x025d, B:119:0x0265, B:121:0x026d, B:123:0x0273, B:125:0x0279, B:127:0x027f, B:129:0x0282, B:131:0x0286, B:133:0x028a, B:135:0x0298, B:137:0x02a0, B:139:0x02a8, B:141:0x02b0, B:143:0x02be, B:145:0x02cd, B:149:0x02e5, B:151:0x02fd, B:153:0x0305, B:154:0x030b, B:155:0x0326, B:157:0x0340, B:159:0x0345, B:161:0x0380, B:163:0x0386, B:165:0x03a3, B:167:0x03a7, B:168:0x03ad, B:170:0x03b1, B:172:0x03bb, B:173:0x03bd, B:174:0x03c8, B:213:0x047f, B:177:0x03d6, B:179:0x03dc, B:207:0x0446, B:209:0x0453, B:212:0x046f, B:182:0x03e5, B:185:0x03ee, B:187:0x0404, B:189:0x040d, B:191:0x0411, B:197:0x0427, B:199:0x0436, B:233:0x0524, B:24:0x0080, B:27:0x0085, B:30:0x008f, B:33:0x009a, B:36:0x00a4, B:39:0x00ad, B:42:0x00be, B:45:0x00cd), top: B:244:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b A[Catch: all -> 0x0538, TryCatch #2 {all -> 0x0538, afdk -> 0x0510, aegw -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:10:0x002a, B:12:0x002f, B:14:0x0035, B:16:0x0039, B:18:0x003f, B:21:0x0065, B:46:0x00db, B:48:0x00fc, B:49:0x0105, B:51:0x010b, B:52:0x0113, B:54:0x013b, B:55:0x013e, B:57:0x0152, B:59:0x0156, B:62:0x015d, B:64:0x0161, B:66:0x0167, B:68:0x016d, B:70:0x0173, B:72:0x0179, B:75:0x017e, B:77:0x0184, B:80:0x018d, B:82:0x0193, B:83:0x01a0, B:85:0x01bc, B:86:0x01ce, B:88:0x01d5, B:89:0x01e5, B:91:0x01ed, B:95:0x01f8, B:101:0x020f, B:103:0x0215, B:108:0x022e, B:214:0x048c, B:216:0x0490, B:217:0x0493, B:219:0x0497, B:220:0x04a8, B:224:0x04b9, B:225:0x04d0, B:226:0x04f0, B:229:0x0510, B:111:0x023f, B:113:0x024f, B:115:0x0255, B:117:0x025d, B:119:0x0265, B:121:0x026d, B:123:0x0273, B:125:0x0279, B:127:0x027f, B:129:0x0282, B:131:0x0286, B:133:0x028a, B:135:0x0298, B:137:0x02a0, B:139:0x02a8, B:141:0x02b0, B:143:0x02be, B:145:0x02cd, B:149:0x02e5, B:151:0x02fd, B:153:0x0305, B:154:0x030b, B:155:0x0326, B:157:0x0340, B:159:0x0345, B:161:0x0380, B:163:0x0386, B:165:0x03a3, B:167:0x03a7, B:168:0x03ad, B:170:0x03b1, B:172:0x03bb, B:173:0x03bd, B:174:0x03c8, B:213:0x047f, B:177:0x03d6, B:179:0x03dc, B:207:0x0446, B:209:0x0453, B:212:0x046f, B:182:0x03e5, B:185:0x03ee, B:187:0x0404, B:189:0x040d, B:191:0x0411, B:197:0x0427, B:199:0x0436, B:233:0x0524, B:24:0x0080, B:27:0x0085, B:30:0x008f, B:33:0x009a, B:36:0x00a4, B:39:0x00ad, B:42:0x00be, B:45:0x00cd), top: B:244:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013b A[Catch: all -> 0x0538, TRY_LEAVE, TryCatch #2 {all -> 0x0538, afdk -> 0x0510, aegw -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:10:0x002a, B:12:0x002f, B:14:0x0035, B:16:0x0039, B:18:0x003f, B:21:0x0065, B:46:0x00db, B:48:0x00fc, B:49:0x0105, B:51:0x010b, B:52:0x0113, B:54:0x013b, B:55:0x013e, B:57:0x0152, B:59:0x0156, B:62:0x015d, B:64:0x0161, B:66:0x0167, B:68:0x016d, B:70:0x0173, B:72:0x0179, B:75:0x017e, B:77:0x0184, B:80:0x018d, B:82:0x0193, B:83:0x01a0, B:85:0x01bc, B:86:0x01ce, B:88:0x01d5, B:89:0x01e5, B:91:0x01ed, B:95:0x01f8, B:101:0x020f, B:103:0x0215, B:108:0x022e, B:214:0x048c, B:216:0x0490, B:217:0x0493, B:219:0x0497, B:220:0x04a8, B:224:0x04b9, B:225:0x04d0, B:226:0x04f0, B:229:0x0510, B:111:0x023f, B:113:0x024f, B:115:0x0255, B:117:0x025d, B:119:0x0265, B:121:0x026d, B:123:0x0273, B:125:0x0279, B:127:0x027f, B:129:0x0282, B:131:0x0286, B:133:0x028a, B:135:0x0298, B:137:0x02a0, B:139:0x02a8, B:141:0x02b0, B:143:0x02be, B:145:0x02cd, B:149:0x02e5, B:151:0x02fd, B:153:0x0305, B:154:0x030b, B:155:0x0326, B:157:0x0340, B:159:0x0345, B:161:0x0380, B:163:0x0386, B:165:0x03a3, B:167:0x03a7, B:168:0x03ad, B:170:0x03b1, B:172:0x03bb, B:173:0x03bd, B:174:0x03c8, B:213:0x047f, B:177:0x03d6, B:179:0x03dc, B:207:0x0446, B:209:0x0453, B:212:0x046f, B:182:0x03e5, B:185:0x03ee, B:187:0x0404, B:189:0x040d, B:191:0x0411, B:197:0x0427, B:199:0x0436, B:233:0x0524, B:24:0x0080, B:27:0x0085, B:30:0x008f, B:33:0x009a, B:36:0x00a4, B:39:0x00ad, B:42:0x00be, B:45:0x00cd), top: B:244:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152 A[Catch: aegw -> 0x0523, all -> 0x0538, Merged into TryCatch #2 {all -> 0x0538, afdk -> 0x0510, aegw -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:10:0x002a, B:12:0x002f, B:14:0x0035, B:16:0x0039, B:18:0x003f, B:21:0x0065, B:46:0x00db, B:48:0x00fc, B:49:0x0105, B:51:0x010b, B:52:0x0113, B:54:0x013b, B:55:0x013e, B:57:0x0152, B:59:0x0156, B:62:0x015d, B:64:0x0161, B:66:0x0167, B:68:0x016d, B:70:0x0173, B:72:0x0179, B:75:0x017e, B:77:0x0184, B:80:0x018d, B:82:0x0193, B:83:0x01a0, B:85:0x01bc, B:86:0x01ce, B:88:0x01d5, B:89:0x01e5, B:91:0x01ed, B:95:0x01f8, B:101:0x020f, B:103:0x0215, B:108:0x022e, B:214:0x048c, B:216:0x0490, B:217:0x0493, B:219:0x0497, B:220:0x04a8, B:224:0x04b9, B:225:0x04d0, B:226:0x04f0, B:229:0x0510, B:111:0x023f, B:113:0x024f, B:115:0x0255, B:117:0x025d, B:119:0x0265, B:121:0x026d, B:123:0x0273, B:125:0x0279, B:127:0x027f, B:129:0x0282, B:131:0x0286, B:133:0x028a, B:135:0x0298, B:137:0x02a0, B:139:0x02a8, B:141:0x02b0, B:143:0x02be, B:145:0x02cd, B:149:0x02e5, B:151:0x02fd, B:153:0x0305, B:154:0x030b, B:155:0x0326, B:157:0x0340, B:159:0x0345, B:161:0x0380, B:163:0x0386, B:165:0x03a3, B:167:0x03a7, B:168:0x03ad, B:170:0x03b1, B:172:0x03bb, B:173:0x03bd, B:174:0x03c8, B:213:0x047f, B:177:0x03d6, B:179:0x03dc, B:207:0x0446, B:209:0x0453, B:212:0x046f, B:182:0x03e5, B:185:0x03ee, B:187:0x0404, B:189:0x040d, B:191:0x0411, B:197:0x0427, B:199:0x0436, B:233:0x0524, B:24:0x0080, B:27:0x0085, B:30:0x008f, B:33:0x009a, B:36:0x00a4, B:39:0x00ad, B:42:0x00be, B:45:0x00cd), top: B:244:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bc A[Catch: all -> 0x0538, TryCatch #2 {all -> 0x0538, afdk -> 0x0510, aegw -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:10:0x002a, B:12:0x002f, B:14:0x0035, B:16:0x0039, B:18:0x003f, B:21:0x0065, B:46:0x00db, B:48:0x00fc, B:49:0x0105, B:51:0x010b, B:52:0x0113, B:54:0x013b, B:55:0x013e, B:57:0x0152, B:59:0x0156, B:62:0x015d, B:64:0x0161, B:66:0x0167, B:68:0x016d, B:70:0x0173, B:72:0x0179, B:75:0x017e, B:77:0x0184, B:80:0x018d, B:82:0x0193, B:83:0x01a0, B:85:0x01bc, B:86:0x01ce, B:88:0x01d5, B:89:0x01e5, B:91:0x01ed, B:95:0x01f8, B:101:0x020f, B:103:0x0215, B:108:0x022e, B:214:0x048c, B:216:0x0490, B:217:0x0493, B:219:0x0497, B:220:0x04a8, B:224:0x04b9, B:225:0x04d0, B:226:0x04f0, B:229:0x0510, B:111:0x023f, B:113:0x024f, B:115:0x0255, B:117:0x025d, B:119:0x0265, B:121:0x026d, B:123:0x0273, B:125:0x0279, B:127:0x027f, B:129:0x0282, B:131:0x0286, B:133:0x028a, B:135:0x0298, B:137:0x02a0, B:139:0x02a8, B:141:0x02b0, B:143:0x02be, B:145:0x02cd, B:149:0x02e5, B:151:0x02fd, B:153:0x0305, B:154:0x030b, B:155:0x0326, B:157:0x0340, B:159:0x0345, B:161:0x0380, B:163:0x0386, B:165:0x03a3, B:167:0x03a7, B:168:0x03ad, B:170:0x03b1, B:172:0x03bb, B:173:0x03bd, B:174:0x03c8, B:213:0x047f, B:177:0x03d6, B:179:0x03dc, B:207:0x0446, B:209:0x0453, B:212:0x046f, B:182:0x03e5, B:185:0x03ee, B:187:0x0404, B:189:0x040d, B:191:0x0411, B:197:0x0427, B:199:0x0436, B:233:0x0524, B:24:0x0080, B:27:0x0085, B:30:0x008f, B:33:0x009a, B:36:0x00a4, B:39:0x00ad, B:42:0x00be, B:45:0x00cd), top: B:244:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d5 A[Catch: all -> 0x0538, TryCatch #2 {all -> 0x0538, afdk -> 0x0510, aegw -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:10:0x002a, B:12:0x002f, B:14:0x0035, B:16:0x0039, B:18:0x003f, B:21:0x0065, B:46:0x00db, B:48:0x00fc, B:49:0x0105, B:51:0x010b, B:52:0x0113, B:54:0x013b, B:55:0x013e, B:57:0x0152, B:59:0x0156, B:62:0x015d, B:64:0x0161, B:66:0x0167, B:68:0x016d, B:70:0x0173, B:72:0x0179, B:75:0x017e, B:77:0x0184, B:80:0x018d, B:82:0x0193, B:83:0x01a0, B:85:0x01bc, B:86:0x01ce, B:88:0x01d5, B:89:0x01e5, B:91:0x01ed, B:95:0x01f8, B:101:0x020f, B:103:0x0215, B:108:0x022e, B:214:0x048c, B:216:0x0490, B:217:0x0493, B:219:0x0497, B:220:0x04a8, B:224:0x04b9, B:225:0x04d0, B:226:0x04f0, B:229:0x0510, B:111:0x023f, B:113:0x024f, B:115:0x0255, B:117:0x025d, B:119:0x0265, B:121:0x026d, B:123:0x0273, B:125:0x0279, B:127:0x027f, B:129:0x0282, B:131:0x0286, B:133:0x028a, B:135:0x0298, B:137:0x02a0, B:139:0x02a8, B:141:0x02b0, B:143:0x02be, B:145:0x02cd, B:149:0x02e5, B:151:0x02fd, B:153:0x0305, B:154:0x030b, B:155:0x0326, B:157:0x0340, B:159:0x0345, B:161:0x0380, B:163:0x0386, B:165:0x03a3, B:167:0x03a7, B:168:0x03ad, B:170:0x03b1, B:172:0x03bb, B:173:0x03bd, B:174:0x03c8, B:213:0x047f, B:177:0x03d6, B:179:0x03dc, B:207:0x0446, B:209:0x0453, B:212:0x046f, B:182:0x03e5, B:185:0x03ee, B:187:0x0404, B:189:0x040d, B:191:0x0411, B:197:0x0427, B:199:0x0436, B:233:0x0524, B:24:0x0080, B:27:0x0085, B:30:0x008f, B:33:0x009a, B:36:0x00a4, B:39:0x00ad, B:42:0x00be, B:45:0x00cd), top: B:244:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ed A[Catch: all -> 0x0538, TryCatch #2 {all -> 0x0538, afdk -> 0x0510, aegw -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:10:0x002a, B:12:0x002f, B:14:0x0035, B:16:0x0039, B:18:0x003f, B:21:0x0065, B:46:0x00db, B:48:0x00fc, B:49:0x0105, B:51:0x010b, B:52:0x0113, B:54:0x013b, B:55:0x013e, B:57:0x0152, B:59:0x0156, B:62:0x015d, B:64:0x0161, B:66:0x0167, B:68:0x016d, B:70:0x0173, B:72:0x0179, B:75:0x017e, B:77:0x0184, B:80:0x018d, B:82:0x0193, B:83:0x01a0, B:85:0x01bc, B:86:0x01ce, B:88:0x01d5, B:89:0x01e5, B:91:0x01ed, B:95:0x01f8, B:101:0x020f, B:103:0x0215, B:108:0x022e, B:214:0x048c, B:216:0x0490, B:217:0x0493, B:219:0x0497, B:220:0x04a8, B:224:0x04b9, B:225:0x04d0, B:226:0x04f0, B:229:0x0510, B:111:0x023f, B:113:0x024f, B:115:0x0255, B:117:0x025d, B:119:0x0265, B:121:0x026d, B:123:0x0273, B:125:0x0279, B:127:0x027f, B:129:0x0282, B:131:0x0286, B:133:0x028a, B:135:0x0298, B:137:0x02a0, B:139:0x02a8, B:141:0x02b0, B:143:0x02be, B:145:0x02cd, B:149:0x02e5, B:151:0x02fd, B:153:0x0305, B:154:0x030b, B:155:0x0326, B:157:0x0340, B:159:0x0345, B:161:0x0380, B:163:0x0386, B:165:0x03a3, B:167:0x03a7, B:168:0x03ad, B:170:0x03b1, B:172:0x03bb, B:173:0x03bd, B:174:0x03c8, B:213:0x047f, B:177:0x03d6, B:179:0x03dc, B:207:0x0446, B:209:0x0453, B:212:0x046f, B:182:0x03e5, B:185:0x03ee, B:187:0x0404, B:189:0x040d, B:191:0x0411, B:197:0x0427, B:199:0x0436, B:233:0x0524, B:24:0x0080, B:27:0x0085, B:30:0x008f, B:33:0x009a, B:36:0x00a4, B:39:0x00ad, B:42:0x00be, B:45:0x00cd), top: B:244:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0209 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r29, defpackage.aess r30, java.lang.String r31, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r32, defpackage.aflm r33) {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afdv.U(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, aess, java.lang.String, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, aflm):void");
    }

    public final void V(afkn afknVar) {
        afknVar.l();
        this.f.g(afknVar);
        VideoStreamingData videoStreamingData = this.t;
        aelc aelcVar = null;
        String str = videoStreamingData != null ? videoStreamingData.c : null;
        if (str != null) {
            aelcVar = this.af.b(str);
        }
        if (aelcVar != null) {
            aelcVar.f();
        }
        ax();
    }

    public final void W() {
        if (this.p == null || this.s == null || this.r == null) {
            return;
        }
        Object obj = this.Z.get();
        afmv afmvVar = (afmv) obj;
        if (afmvVar.equals(this.ax)) {
            return;
        }
        this.ax = afmvVar;
        this.r.k(this.s, 0, obj);
        if (this.t == null || this.x == null || this.G == null) {
            return;
        }
        int a = this.b.a();
        List asList = Arrays.asList(this.G.a);
        aegu aeguVar = this.G;
        aegx aegxVar = aeguVar.f;
        yrj yrjVar = this.b;
        PlayerConfigModel playerConfigModel = this.x;
        FormatStreamModel j = aeha.j(asList, aegxVar, yrjVar, playerConfigModel, this.O, aeguVar.b[0].f, afmvVar.c, afmvVar.d, playerConfigModel.e(), this.x.d(), a, this.O.i.b(this.aq));
        if (this.K != null && j != null && j.e() != this.K.e()) {
            aetv aetvVar = this.f;
            FormatStreamModel formatStreamModel = this.H;
            FormatStreamModel formatStreamModel2 = this.I;
            aegu aeguVar2 = this.G;
            aetvVar.h(new aesr(formatStreamModel, formatStreamModel2, j, aeguVar2.d, aeguVar2.e, aeguVar2.f, 10001, -1L, 0, aesq.a(f(), g(), b())));
        }
        this.K = j;
    }

    public final void X() {
        afnh afnhVar = this.p;
        if (afnhVar != null) {
            afnhVar.k();
            this.p.s(null);
            this.e.f(null, afte.ANDROID_EXOPLAYER);
            S();
            this.p = null;
        }
    }

    public final synchronized void Y(long j, String str) {
        R();
        this.aw = this.c.schedule(new afdg(this, str), j, TimeUnit.MILLISECONDS);
    }

    public final void Z(int i) {
        ouo ouoVar;
        this.aA = i;
        otb otbVar = this.r;
        if (otbVar == null || (ouoVar = this.aj) == null) {
            return;
        }
        otbVar.k(ouoVar, 3, Integer.valueOf(1 != (i & 1) ? 3 : 4));
    }

    @Override // defpackage.affb
    public final float a() {
        return this.at;
    }

    public final boolean aa() {
        return this.C != null;
    }

    public final boolean ab() {
        return (this.ak == null && this.al == null) ? false : true;
    }

    public final void ac(aanr aanrVar, afdo afdoVar, VideoStreamingData videoStreamingData, int i, int i2, aflm aflmVar) {
        ylr.c();
        ax();
        this.x = aanrVar.f;
        this.t = videoStreamingData;
        if (!aG(i2)) {
            return;
        }
        this.N = i;
        this.ac.b(i, this.x.W(), this.x.V(), false, aegv.NONE);
        aH(O(), false);
        this.q = afdoVar;
        afga aL = aL(aN());
        ouo[] ouoVarArr = new ouo[2];
        ouoVarArr[1] = aM(aL, afdoVar.a, this.x.aT(), i == 4, aflmVar);
        ouoVarArr[0] = aO(aL, afdoVar.b, 2, aflmVar);
        aP(ouoVarArr);
        av(ouoVarArr, 0L);
        afle afleVar = this.S;
        aflc a = afld.a(this.x);
        a.b = new afct(this, 4);
        a.a = this.aq;
        a.g = ampq.i(aanrVar.g);
        afle afleVar2 = this.S;
        aflc a2 = afld.a(this.x);
        a2.b = new afct(this, 4);
        a2.a = this.aq;
        a2.g = ampq.i(aanrVar.g);
        this.C = new afdz(aanrVar.g, ouoVarArr, new aflf[]{afleVar.a(a.a(), 5), afleVar2.a(a2.a(), 5)});
    }

    @Override // defpackage.afgb
    public final void ao() {
        this.az = null;
    }

    @Override // defpackage.afgb
    public final boolean aq() {
        return this.ao;
    }

    @Override // defpackage.affb
    public final int b() {
        afgh afghVar;
        ost ah = ah();
        return (ah == null || (afghVar = this.ah) == null) ? this.A : ((int) afghVar.e) + this.A + ah.h;
    }

    @Override // defpackage.afgg
    public final int c(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        int i = true != afeu.d(videoStreamingData, this.ay || playerConfigModel.g) ? 4 : 5;
        boolean aQ = aQ(playerConfigModel, videoStreamingData);
        if (aQ) {
            i |= 8;
        }
        if (playerConfigModel.aE() && !aQ && !videoStreamingData.B()) {
            avwb avwbVar = playerConfigModel.c.t;
            if (avwbVar == null) {
                avwbVar = avwb.a;
            }
            if (avwbVar.e || !videoStreamingData.y()) {
                i |= 2;
            }
        }
        return this.O.C() ? i | 16 : i;
    }

    @Override // defpackage.afgg
    public final int d() {
        return this.F.a(h(), this.ag.c());
    }

    @Override // defpackage.affb
    public final int e() {
        ost ah = ah();
        return ah != null ? this.au + ah.f : this.au;
    }

    @Override // defpackage.afgg
    public final long f() {
        otb otbVar = this.r;
        if (otbVar != null) {
            ote oteVar = ((otd) otbVar).a;
            if (oteVar.h != -1) {
                return oteVar.h / 1000;
            }
            return -1L;
        }
        return 0L;
    }

    @Override // defpackage.afgg
    public final long g() {
        otb otbVar = this.r;
        if (otbVar != null) {
            return otbVar.c();
        }
        return 0L;
    }

    @Override // defpackage.afgg
    public final long h() {
        long g = g();
        if (g >= 0) {
            long j = this.D;
            if (j == 0) {
                return -1L;
            }
            return g + j;
        }
        return -1L;
    }

    @Override // defpackage.afgg
    public final long i() {
        otb otbVar = this.r;
        if (otbVar != null) {
            return otbVar.d();
        }
        return 0L;
    }

    @Override // defpackage.affb
    public final long j(long j) {
        return -1L;
    }

    @Override // defpackage.affb
    public final FormatStreamModel k() {
        return this.I;
    }

    @Override // defpackage.affb
    public final FormatStreamModel l() {
        return this.H;
    }

    @Override // defpackage.afgg
    public final aegu m(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, aegs aegsVar, int i) {
        return al(videoStreamingData, playerConfigModel, aegsVar, false, z, i, null, null).a;
    }

    @Override // defpackage.affb
    public final aequ n() {
        if (this.az == null) {
            aequ aequVar = new aequ(afte.ANDROID_EXOPLAYER);
            this.az = aequVar;
            VideoStreamingData videoStreamingData = this.t;
            boolean z = this.o.b;
            PlayerConfigModel playerConfigModel = this.x;
            aequVar.b(videoStreamingData, false, -1L, z, false, false, playerConfigModel != null && playerConfigModel.aS());
        }
        aerx aerxVar = this.ar;
        if (aerxVar != null) {
            aere aereVar = this.am;
            aequ aequVar2 = this.az;
            if (aereVar != null) {
                aequVar2.a(aerxVar.c.aW(), aerxVar.a(), aerxVar.h, aerxVar.g, aerxVar.j, aereVar instanceof aerd);
            }
        }
        return this.az;
    }

    @Override // defpackage.affb
    public final String o() {
        return this.aq;
    }

    @Override // com.google.android.libraries.youtube.media.player.drm.WidevineHelper$Listener
    public final void onDrmError(int i, Exception exc) {
        ylr.c();
        if (i != u()) {
            return;
        }
        F(true);
        V(afgz.a(exc, g(), afkl.DRM, "keyerror", null, false));
    }

    @Override // com.google.android.libraries.youtube.media.player.drm.WidevineHelper$Listener
    public final void onHdDrmPlayable(int i) {
        VideoStreamingData videoStreamingData;
        ylr.c();
        boolean z = true;
        if (i == u() && ((videoStreamingData = this.t) == null || !videoStreamingData.v)) {
            z = false;
        }
        afms.d(z);
        if (i != u()) {
            return;
        }
        z();
        this.M = 0;
        this.i.g();
    }

    @Override // com.google.android.libraries.youtube.media.player.drm.WidevineHelper$Listener
    public final void onHdDrmUnavailable(int i, String str) {
        VideoStreamingData videoStreamingData;
        ylr.c();
        boolean z = false;
        if (i != u() || ((videoStreamingData = this.t) != null && videoStreamingData.v)) {
            z = true;
        }
        afms.d(z);
        if (i != u()) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
                return;
            }
            "Stale HdDrmUnavailable notification received - ignored ".concat(valueOf);
            return;
        }
        this.f.g(new afkn(afkl.DRM, "hdunavailable", g(), str));
    }

    @Override // defpackage.afgg
    public final void p(afnh afnhVar) {
        this.e.b(afte.ANDROID_EXOPLAYER);
        this.y = false;
        X();
        this.p = afnhVar;
        afnhVar.s(this.k);
        this.e.f(this.k, afte.ANDROID_EXOPLAYER);
        afnhVar.z();
        this.o.f(this.x, this.t);
        if (!aH(O(), true)) {
            return;
        }
        P();
    }

    @Override // defpackage.affb
    public final void q() {
    }

    @Override // defpackage.affb
    public final void r() {
        afnh afnhVar = this.p;
        if (afnhVar != null) {
            afnhVar.k();
        }
    }

    @Override // defpackage.ota
    public final void rL() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [aelc] */
    @Override // defpackage.ota
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rM(defpackage.osx r18) {
        /*
            Method dump skipped, instructions count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afdv.rM(osx):void");
    }

    @Override // defpackage.ota
    public final void rN(boolean z, int i) {
        ylr.c();
        if (this.t == null) {
            return;
        }
        this.ao = false;
        if (i == 2) {
            this.f.r();
        } else if (i == 3) {
            at();
            if (z) {
                this.f.d();
            } else {
                this.f.n();
            }
            FormatStreamModel formatStreamModel = this.H;
            long j = formatStreamModel != null ? formatStreamModel.f : 0L;
            FormatStreamModel formatStreamModel2 = this.I;
            if (formatStreamModel2 != null) {
                j += formatStreamModel2.f;
            }
            if (this.F.l(g(), this.d.e(), j)) {
                B(0L, auqn.SEEK_SOURCE_UNKNOWN);
            }
        } else if (i == 4) {
            at();
            if (z) {
                if (this.F.m()) {
                    B(0L, auqn.SEEK_SOURCE_UNKNOWN);
                } else {
                    this.f.q();
                    this.f.s(-1L);
                }
            } else {
                this.f.m();
                this.F.g();
            }
        } else if (i == 5) {
            this.f.f();
        }
        if (i != 4 || !z || this.F.m()) {
            this.aB.d();
        } else {
            this.aB.c();
        }
        aE();
    }

    @Override // defpackage.affb
    public final void s() {
        this.e.d(afte.ANDROID_EXOPLAYER);
        this.y = true;
        R();
        this.u = null;
        otb otbVar = this.r;
        if (otbVar != null && this.ai != null) {
            otbVar.m(1, -1);
            afdt afdtVar = this.i;
            afdv afdvVar = afdtVar.b;
            afdvVar.H = null;
            afdvVar.M = 10002;
            afdtVar.g();
        }
        X();
    }

    @Override // defpackage.afgg
    public final void t(final aanr aanrVar, final aetv aetvVar) {
        aeot aeotVar = (aeot) aetvVar;
        this.W.c = aeotVar.a;
        this.h.a = aeotVar.a;
        this.T.b(aetvVar, aanrVar.b);
        if (!aanrVar.j) {
            this.f = aetv.c;
            this.g = aeub.a;
        }
        String str = aanrVar.g;
        aelc b = str != null ? this.af.b(str) : null;
        if (b == null) {
            return;
        }
        final int incrementAndGet = this.aa.incrementAndGet();
        final VideoStreamingData videoStreamingData = aanrVar.g() ? aanrVar.h : VideoStreamingData.a;
        final afdo afdoVar = new afdo(L("video/x-unknown", this.c), L("audio/x-unknown", this.c));
        final Object obj = new Object();
        this.B = obj;
        aemh afdsVar = new afds(this, aanrVar, afdoVar, videoStreamingData, this.B, aetvVar);
        final int k = b.k();
        if (k == 0) {
            return;
        }
        if (true != this.O.o().i) {
            afdsVar = afdoVar;
        }
        b.h(afdsVar);
        this.j.post(new Runnable() { // from class: afcv
            @Override // java.lang.Runnable
            public final void run() {
                afdv afdvVar = afdv.this;
                int i = incrementAndGet;
                aanr aanrVar2 = aanrVar;
                afdo afdoVar2 = afdoVar;
                VideoStreamingData videoStreamingData2 = videoStreamingData;
                int i2 = k;
                aetv aetvVar2 = aetvVar;
                Object obj2 = obj;
                if (afdvVar.u() != i) {
                    return;
                }
                afdvVar.ac(aanrVar2, afdoVar2, videoStreamingData2, i2, aanrVar2.f.t(), ((aeot) aetvVar2).a);
                afdvVar.B = obj2;
            }
        });
    }

    public final int u() {
        return this.aa.get();
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        otb otbVar;
        if (observable == this.Z) {
            W();
        } else if (observable != this.O || !(obj instanceof Integer)) {
        } else {
            int intValue = ((Integer) obj).intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    return;
                }
                as();
                return;
            }
            afgj afgjVar = this.s;
            if (afgjVar != null && (otbVar = this.r) != null) {
                otbVar.k(afgjVar, 3, false);
            }
            z();
        }
    }

    @Override // defpackage.affb
    public final void v() {
        otb otbVar = this.r;
        if (otbVar != null) {
            otbVar.l(false);
        }
    }

    @Override // defpackage.affb
    public final void w() {
    }

    @Override // defpackage.affb
    public final void x() {
        otb otbVar = this.r;
        if (otbVar != null && ((otd) otbVar).e == 5 && !this.ao) {
            otbVar.j(0L);
            if (this.O.w()) {
                this.f.i("seek", new aest(afmk.a(Thread.currentThread().getStackTrace())));
            }
        }
        this.av = true;
        au(this.f.a());
    }

    @Override // defpackage.afgg
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.affb
    public final void z() {
        VideoStreamingData videoStreamingData;
        if (this.r != null && (videoStreamingData = this.t) != null && this.ai != null) {
            try {
                PlayerConfigModel playerConfigModel = this.x;
                amvn amvnVar = aeha.a;
                afdj al = al(videoStreamingData, playerConfigModel, null, true, this.y, Integer.MAX_VALUE, this.aq, null);
                aegu aeguVar = al.a;
                if (aeguVar.f.d()) {
                    aetv aetvVar = this.f;
                    FormatStreamModel formatStreamModel = this.H;
                    String valueOf = String.valueOf(formatStreamModel != null ? Integer.valueOf(formatStreamModel.f()) : "none");
                    int a = aeguVar.a();
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    sb.append("curr.");
                    sb.append(valueOf);
                    sb.append(";new.");
                    sb.append(a);
                    aetvVar.i("mqs", new aest(sb.toString()));
                }
                this.G = aeguVar;
                this.K = aeguVar.c;
                if (!this.x.at()) {
                    FormatStreamModel formatStreamModel2 = aeguVar.a[0];
                    FormatStreamModel formatStreamModel3 = aeguVar.b[0];
                    if ((formatStreamModel2.equals(this.H) && formatStreamModel3.equals(this.I)) || !aG(this.x.t())) {
                        return;
                    }
                    FormatStreamModel[] formatStreamModelArr = {formatStreamModel2};
                    this.N = al.b;
                    try {
                        ouo[] aJ = aJ(this.t, formatStreamModelArr, aeguVar.b, aeguVar.f, aI(), this.f);
                        aP(aJ);
                        av(aJ, g());
                        C(this.at);
                        au(this.f.a());
                        return;
                    } catch (afdk unused) {
                        V(new afkn("manifest.unparseable", g()));
                        return;
                    }
                }
                aB(aeguVar);
            } catch (aegw unused2) {
            }
        }
    }

    private final void aE() {
        if (this.p != null) {
            if (!ab() || !I()) {
                this.p.rO(1);
            } else {
                this.p.g(1);
            }
        }
    }

    private final ouo aj(ovj ovjVar, boolean z, aflm aflmVar) {
        if (!z) {
            afnh afnhVar = this.p;
            if (afnhVar != null) {
                afnhVar.q();
            }
            aqwu aqwuVar = this.x.c.e;
            if (aqwuVar == null) {
                aqwuVar = aqwu.b;
            }
            if (aqwuVar.aK) {
                return new aevg(this.Q, ovjVar, this.ac, this.am, this.j, this.h, new aevl(aflmVar, 2, TimeUnit.MILLISECONDS.toMicros(this.x.t())), this.x.aT(), O().l, this.x.p());
            }
            return new oud(this.Q, ovjVar, this.ac, 5000L, this.am, true, this.j, this.h, 10);
        }
        return ai(ovjVar);
    }
}

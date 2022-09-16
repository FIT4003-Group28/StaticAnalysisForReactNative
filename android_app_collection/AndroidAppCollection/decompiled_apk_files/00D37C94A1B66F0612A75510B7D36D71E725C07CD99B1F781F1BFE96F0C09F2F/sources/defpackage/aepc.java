package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: aepc */
/* loaded from: classes.dex */
public final class aepc implements Observer, afgg, afdx {
    public static final /* synthetic */ int n = 0;
    private static final aequ o = new aequ(afte.NATIVE_MEDIA_PLAYER);
    private afmv A;
    private FormatStreamModel B;
    private boolean C;
    private final afjz D;
    public final yrj a;
    public final String b;
    public final affj c;
    final aepb d;
    aepa e;
    public final Handler f;
    public boolean g;
    public volatile boolean h;
    public afnh i;
    public int j;
    public int k;
    public int l = 0;
    public final AtomicInteger m;
    private final Context p;
    private final aeoc q;
    private final aeha r;
    private final afmw s;
    private final afkd t;
    private final affy u;
    private aetv v;
    private VideoStreamingData w;
    private PlayerConfigModel x;
    private FormatStreamModel y;
    private String z;

    public aepc(Context context, yrj yrjVar, aeha aehaVar, String str, afjz afjzVar, afmw afmwVar, aeoc aeocVar, affj affjVar, adzz adzzVar, afkd afkdVar) {
        this.p = context;
        this.q = aeocVar;
        afms.a(yrjVar);
        this.a = yrjVar;
        afms.a(aehaVar);
        this.r = aehaVar;
        afms.a(str);
        this.b = str;
        afms.a(afjzVar);
        this.D = afjzVar;
        afms.a(afmwVar);
        this.s = afmwVar;
        this.c = affjVar;
        this.t = afkdVar;
        this.u = new affy(adzzVar, afjzVar);
        this.d = new aepb(this);
        this.e = new aepa(this, context, affjVar, aeocVar, afjzVar);
        this.m = new AtomicInteger();
        this.f = new Handler(context.getMainLooper());
        this.v = aetv.c;
        this.e.start();
    }

    public static /* bridge */ /* synthetic */ void L(aepc aepcVar, FormatStreamModel formatStreamModel, long j) {
        aepcVar.V(formatStreamModel, j, null, null);
    }

    public static afkn O(int i, int i2, boolean z, boolean z2, long j, FormatStreamModel formatStreamModel, afjz afjzVar) {
        String S;
        String T;
        boolean z3 = true;
        if (i != 1) {
            if (i == 261) {
                i = 261;
            } else {
                z3 = false;
            }
        }
        boolean J2 = z2 | formatStreamModel.J();
        String str = "fmt.unplayable";
        String str2 = null;
        if (z3) {
            if (i2 != Integer.MIN_VALUE) {
                if (i2 == -1010) {
                    str2 = R(formatStreamModel);
                } else if (i2 != -1007) {
                    switch (i2) {
                        case -1005:
                            S = S(J2, "net.closed");
                            T = T(formatStreamModel);
                            str = S;
                            str2 = T;
                            break;
                        case -1004:
                            break;
                        case -1003:
                            S = S(J2, "net.connect");
                            T = T(formatStreamModel);
                            str = S;
                            str2 = T;
                            break;
                        case -1002:
                            S = S(J2, "net.dns");
                            T = T(formatStreamModel);
                            str = S;
                            str2 = T;
                            break;
                        default:
                            str = null;
                            break;
                    }
                } else {
                    str2 = R(formatStreamModel);
                    str = "fmt.decode";
                }
                if (afjzVar.V(afjzVar.b.a.a.V(axxd.p).B()) && str != null && str.startsWith("net.") && formatStreamModel.J()) {
                    StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
                    sb.append("w.");
                    sb.append(str);
                    sb.append(";");
                    sb.append(str2);
                    str2 = sb.toString();
                    str = "staleconfig";
                }
            }
            S = S(J2, "net.timeout");
            T = T(formatStreamModel);
            str = S;
            str2 = T;
            if (afjzVar.V(afjzVar.b.a.a.V(axxd.p).B())) {
                StringBuilder sb2 = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
                sb2.append("w.");
                sb2.append(str);
                sb2.append(";");
                sb2.append(str2);
                str2 = sb2.toString();
                str = "staleconfig";
            }
        } else if (i == 200) {
            int e = formatStreamModel.e();
            StringBuilder sb3 = new StringBuilder(16);
            sb3.append("itag.");
            sb3.append(e);
            str2 = sb3.toString();
            i = 200;
        } else {
            str = null;
        }
        if (str == null) {
            StringBuilder sb4 = new StringBuilder(27);
            sb4.append("w.");
            sb4.append(i);
            sb4.append(";e.");
            sb4.append(i2);
            str2 = sb4.toString();
            str = "android.fw";
        }
        afkn afknVar = new afkn(str, j, str2);
        if (!z) {
            afknVar.f();
        }
        return afknVar;
    }

    private final FormatStreamModel P(aegu aeguVar, String str) {
        FormatStreamModel[] formatStreamModelArr = aeguVar.a;
        if (this.D.i.b(str) != awan.VIDEO_QUALITY_SETTING_HIGHER_QUALITY) {
            if (aeguVar.f.d == 0) {
                for (FormatStreamModel formatStreamModel : formatStreamModelArr) {
                    if (formatStreamModel.f() <= 360) {
                        return formatStreamModel;
                    }
                }
            }
            return formatStreamModelArr[0];
        }
        return aeguVar.c;
    }

    private final aegu Q(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, aegs aegsVar, int i, String str) {
        Set f;
        aeha aehaVar = this.r;
        List list = videoStreamingData.o;
        if (this.D.aK(playerConfigModel.V())) {
            f = aank.v();
        } else {
            apfm apfmVar = playerConfigModel.c.j;
            if (apfmVar == null) {
                apfmVar = apfm.a;
            }
            f = aank.f(apfmVar.d);
        }
        return aehaVar.c(playerConfigModel, list, aegsVar, f, aeha.b, 2, i, str, aeub.a);
    }

    private static String R(FormatStreamModel formatStreamModel) {
        if (formatStreamModel != null) {
            int e = formatStreamModel.e();
            StringBuilder sb = new StringBuilder(16);
            sb.append("itag.");
            sb.append(e);
            return sb.toString();
        }
        return "";
    }

    private static String S(boolean z, String str) {
        return z ? str : "net.unavailable";
    }

    private static String T(FormatStreamModel formatStreamModel) {
        if (formatStreamModel != null) {
            String valueOf = String.valueOf(formatStreamModel.d.getHost());
            return valueOf.length() != 0 ? "shost.".concat(valueOf) : new String("shost.");
        }
        return "";
    }

    private final void U(boolean z, boolean z2) {
        if (!this.g) {
            return;
        }
        if (z2) {
            this.e.h();
        } else {
            this.e.g();
        }
        E(false);
        this.w = null;
        this.z = null;
        if (z && !this.e.p) {
            this.v.v();
        }
        this.g = false;
    }

    public final void V(FormatStreamModel formatStreamModel, long j, Boolean bool, Float f) {
        float f2;
        aepa aepaVar = this.e;
        int i = aepa.r;
        boolean z = false;
        if (aepaVar.l && formatStreamModel.equals(this.y)) {
            z = true;
        }
        aepaVar.l = z;
        this.y = formatStreamModel;
        this.e.g();
        int i2 = (int) formatStreamModel.c;
        this.j = i2;
        this.v.k(0L, i2);
        afnh afnhVar = this.i;
        if (afnhVar != null) {
            afnhVar.k();
        }
        this.v.a().F();
        E(true);
        this.g = true;
        aeow aeowVar = new aeow();
        aeowVar.a = this.z;
        aeowVar.b = formatStreamModel;
        aeowVar.c = this.v;
        aeowVar.d = this.i;
        aeowVar.e = this.x;
        aeowVar.f = j;
        aeowVar.h = bool;
        if (f != null) {
            f2 = f.floatValue();
        } else {
            f2 = this.e.f;
        }
        aeowVar.g = f2;
        aepa aepaVar2 = this.e;
        aepaVar2.g = aeowVar.f;
        Handler handler = aepaVar2.d;
        handler.sendMessage(Message.obtain(handler, 1, aeowVar));
    }

    private final void W(aegu aeguVar) {
        FormatStreamModel formatStreamModel = aeguVar.c;
        if (this.B != null && formatStreamModel.e() != this.B.e()) {
            aetv aetvVar = this.v;
            FormatStreamModel formatStreamModel2 = this.y;
            aetvVar.h(new aesr(formatStreamModel2, formatStreamModel2, formatStreamModel, aeguVar.d, aeguVar.e, aeguVar.f, 10001, -1L, 0, aesq.a(f(), g(), -1)));
        }
        this.B = formatStreamModel;
    }

    private final void X(aegu aeguVar, int i) {
        FormatStreamModel P = P(aeguVar, this.z);
        this.v.h(new aesr(P, P, aeguVar.c, aeguVar.d, aeguVar.e, aeguVar.f, i, -1L, 0, aesq.a(f(), g(), -1)));
        this.B = aeguVar.c;
        V(P, g(), null, null);
    }

    public final void A() {
        this.e.quit();
        afnh afnhVar = this.i;
        if (afnhVar != null) {
            afnhVar.o();
        }
        aepa aepaVar = new aepa(this, this.p, this.c, this.q, this.D);
        this.e = aepaVar;
        aepaVar.start();
    }

    @Override // defpackage.affb
    public final void B(long j, auqn auqnVar) {
        if (this.e.g != j) {
            this.h = true;
            aepa aepaVar = this.e;
            long max = Math.max(0L, Math.min(j, this.j));
            aepaVar.g = max;
            Handler handler = aepaVar.d;
            handler.sendMessage(Message.obtain(handler, 4, Long.valueOf(max)));
            if (auqnVar == auqn.SEEK_SOURCE_UNKNOWN) {
                return;
            }
            this.u.d.g(auqnVar);
        }
    }

    @Override // defpackage.affb
    public final void C(float f) {
        if (this.C) {
            Handler handler = this.e.d;
            handler.sendMessage(Message.obtain(handler, 10, Float.valueOf(f)));
        }
    }

    @Override // defpackage.affb
    public final void D(float f) {
        this.e.f(f);
    }

    public final void E(boolean z) {
        afnh afnhVar = this.i;
        if (afnhVar != null) {
            if (z) {
                afnhVar.g(1);
            } else {
                afnhVar.rO(1);
            }
        }
    }

    @Override // defpackage.afgg
    public final void F(boolean z) {
        this.c.j(afte.NATIVE_MEDIA_PLAYER);
        U(z, false);
    }

    @Override // defpackage.affb
    public final boolean G() {
        aepa aepaVar = this.e;
        int i = aepa.r;
        return aepaVar.o;
    }

    @Override // defpackage.afdx
    public final boolean H(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z) {
        return videoStreamingData.t() && !videoStreamingData.F();
    }

    @Override // defpackage.affb
    public final boolean I() {
        aepa aepaVar = this.e;
        int i = aepa.r;
        return aepaVar.n;
    }

    @Override // defpackage.afgg
    public final boolean J(afgf afgfVar) {
        return false;
    }

    @Override // defpackage.afgg
    public final afte K(aetw aetwVar) {
        awan b;
        boolean z = false;
        this.m.set(0);
        this.c.e(afte.NATIVE_MEDIA_PLAYER);
        this.t.a(aetwVar.b);
        this.i = aetwVar.b();
        this.w = aetwVar.b;
        this.x = aetwVar.e;
        this.z = aetwVar.d;
        this.v = new aett(aetwVar.a());
        this.l = aetwVar.k;
        this.v.j(afte.NATIVE_MEDIA_PLAYER);
        if (Build.VERSION.SDK_INT >= 23 && this.D.n().C) {
            z = true;
        }
        this.C = z;
        this.u.c(aetwVar.a, this.w);
        this.s.deleteObserver(this);
        try {
            VideoStreamingData videoStreamingData = this.w;
            PlayerConfigModel playerConfigModel = this.x;
            amvn amvnVar = aeha.a;
            aegu Q = Q(videoStreamingData, playerConfigModel, null, Integer.MAX_VALUE, this.z);
            if (this.D.i.f() && (b = this.D.i.b(this.z)) != null) {
                this.v.z(b);
            }
            aegx aegxVar = Q.f;
            if (aegxVar.e()) {
                this.v.i("sc", new aest(Integer.toString(aegxVar.b)));
            }
            int i = Q.g;
            if (i != Integer.MAX_VALUE) {
                this.v.i("lmdu", new aest(Integer.toString(i)));
            }
            if (Q.f.d()) {
                this.v.i("pmqs", new aest(Q.d()));
            }
            FormatStreamModel P = P(Q, this.z);
            FormatStreamModel formatStreamModel = Q.c;
            this.B = formatStreamModel;
            this.v.h(new aesr(P, P, formatStreamModel, Q.d, Q.e, Q.f, 1, -1L, 0, aesq.a(f(), g(), -1)));
            afnh afnhVar = this.i;
            if (afnhVar instanceof afmy) {
                this.c.g(afnk.SURFACE, afte.NATIVE_MEDIA_PLAYER);
                this.i.t(afnk.SURFACE);
            } else if (afnhVar != null) {
                this.c.o(affi.RESET_MEDIA_VIEW_TYPE, afte.NATIVE_MEDIA_PLAYER);
                this.i.p();
            }
            V(P, aetwVar.c.a, Boolean.valueOf(afgn.c(this.l, 2)), Float.valueOf(aetwVar.i));
            this.s.addObserver(this);
            return afte.NATIVE_MEDIA_PLAYER;
        } catch (aegw e) {
            this.v.g(afgz.d(afkl.PROGRESSIVE, e, this.w, 0L));
            return null;
        }
    }

    @Override // defpackage.affb
    public final void M() {
        this.c.c(afte.NATIVE_MEDIA_PLAYER);
        U(true, true);
    }

    @Override // defpackage.afgg
    public final /* synthetic */ void N(boolean z, int i) {
    }

    @Override // defpackage.affb
    public final float a() {
        return this.e.e;
    }

    @Override // defpackage.affb
    public final int b() {
        return -1;
    }

    @Override // defpackage.afgg
    public final int c(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        int i = true != this.C ? 0 : 2;
        return this.D.C() ? i | 16 : i;
    }

    @Override // defpackage.afgg
    public final int d() {
        return -1;
    }

    @Override // defpackage.affb
    public final int e() {
        return -1;
    }

    @Override // defpackage.afgg
    public final long f() {
        return (this.k / 100.0f) * this.j;
    }

    @Override // defpackage.afgg
    public final long g() {
        return this.e.g;
    }

    @Override // defpackage.afgg
    public final long h() {
        return -1L;
    }

    @Override // defpackage.afgg
    public final long i() {
        return this.j;
    }

    @Override // defpackage.affb
    public final long j(long j) {
        return -1L;
    }

    @Override // defpackage.affb
    public final FormatStreamModel k() {
        return this.y;
    }

    @Override // defpackage.affb
    public final FormatStreamModel l() {
        return this.y;
    }

    @Override // defpackage.afgg
    public final aegu m(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, aegs aegsVar, int i) {
        return Q(videoStreamingData, playerConfigModel, (!z || aegsVar == null || aegsVar.d.b != 0) ? aegsVar : new aegs(new aegx(360, 360), aegsVar.e, aegsVar.f, aegsVar.g, aegsVar.h, aegsVar.i, aegsVar.j, aegsVar.k, aegsVar.l), i, null);
    }

    @Override // defpackage.affb
    public final aequ n() {
        aequ aequVar = o;
        aequVar.b(this.w, false, -1L, false, false, false, false);
        return aequVar;
    }

    @Override // defpackage.affb
    public final String o() {
        return this.z;
    }

    @Override // defpackage.afgg
    public final void p(afnh afnhVar) {
        this.c.b(afte.NATIVE_MEDIA_PLAYER);
        this.i = afnhVar;
        afnhVar.s(this.d);
        this.c.f(this.d, afte.NATIVE_MEDIA_PLAYER);
        this.e.e(afnhVar);
        if (this.e.n) {
            afnhVar.n(500);
        }
        E(this.e.n);
    }

    @Override // defpackage.affb
    public final void q() {
    }

    @Override // defpackage.affb
    public final void r() {
        afnh afnhVar = this.i;
        if (afnhVar != null) {
            afnhVar.k();
        }
    }

    @Override // defpackage.affb
    public final void s() {
        this.c.d(afte.NATIVE_MEDIA_PLAYER);
        if (this.i != null) {
            E(false);
            this.i.k();
            this.i.s(null);
            this.i = null;
            this.e.a();
        }
    }

    @Override // defpackage.afgg
    public final void t(aanr aanrVar, aetv aetvVar) {
    }

    public final void u() {
        Object obj = this.s.get();
        if (this.i == null || this.w == null || this.x == null) {
            return;
        }
        afmv afmvVar = (afmv) obj;
        if (afmvVar.equals(this.A)) {
            return;
        }
        this.A = afmvVar;
        try {
            VideoStreamingData videoStreamingData = this.w;
            PlayerConfigModel playerConfigModel = this.x;
            amvn amvnVar = aeha.a;
            aegu Q = Q(videoStreamingData, playerConfigModel, null, Integer.MAX_VALUE, this.z);
            W(Q);
            apfm apfmVar = this.x.c.j;
            if (apfmVar == null) {
                apfmVar = apfm.a;
            }
            if (!apfmVar.j || P(Q, this.z).equals(this.y)) {
                return;
            }
            X(Q, 10001);
        } catch (aegw unused) {
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable == this.s) {
            u();
        }
    }

    @Override // defpackage.affb
    public final void v() {
        this.e.d.sendEmptyMessage(3);
        E(false);
    }

    @Override // defpackage.affb
    public final void w() {
    }

    @Override // defpackage.affb
    public final void x() {
        this.e.b();
        E(true);
    }

    @Override // defpackage.afgg
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.affb
    public final void z() {
        VideoStreamingData videoStreamingData;
        if (this.g && (videoStreamingData = this.w) != null) {
            try {
                PlayerConfigModel playerConfigModel = this.x;
                amvn amvnVar = aeha.a;
                aegu Q = Q(videoStreamingData, playerConfigModel, null, Integer.MAX_VALUE, this.z);
                if (P(Q, this.z).equals(this.y)) {
                    W(Q);
                    return;
                }
                X(Q, 2);
            } catch (aegw unused) {
            }
        }
    }
}

package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: afbi  reason: default package */
/* loaded from: classes.dex */
public final class afbi {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final boolean F;
    public afhz G;
    public boolean H;
    public volatile boolean I;

    /* renamed from: J  reason: collision with root package name */
    public volatile boolean f39J;
    public aeub K;
    public final afjz L;
    private FormatStreamModel M;
    private boolean N;
    private afhh O;
    private Integer P;
    private Integer Q;
    private boolean R;
    private aeun S;
    private aegu T;
    private afae U;
    public final String a;
    public aetv b;
    public final afbj c;
    public final aenf d;
    public final afbh e;
    public long f;
    public int g;
    public int h;
    public pqb i;
    public afgf j;
    public long k;
    public int l;
    public FormatStreamModel m;
    public aflk n;
    public aflj o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public PlayerConfigModel t;
    public boolean u;
    public VideoStreamingData v;
    public afbl w;
    public FormatStreamModel x;
    public int y;
    public afbi z;

    public afbi(afbh afbhVar, String str, PlayerConfigModel playerConfigModel, aetv aetvVar, VideoStreamingData videoStreamingData, aeun aeunVar, afhh afhhVar, aflk aflkVar, aflj afljVar, aegu aeguVar, afjz afjzVar, aeub aeubVar, afhz afhzVar) {
        this(afbhVar, str, playerConfigModel, aetvVar, videoStreamingData, aeunVar, afhhVar, aflkVar, afljVar, aeguVar, null, afjzVar, aeubVar, afhzVar);
    }

    private final void z(aegx aegxVar, int i, aepk aepkVar) {
        aetv aetvVar = this.b;
        FormatStreamModel formatStreamModel = this.x;
        FormatStreamModel formatStreamModel2 = this.m;
        FormatStreamModel formatStreamModel3 = this.M;
        aegu aeguVar = this.T;
        aetvVar.h(new aesr(formatStreamModel, formatStreamModel2, formatStreamModel3, aeguVar.d, aeguVar.e, aegxVar, i, aepkVar.b, aepkVar.c, aesq.a(this.e.f(), this.e.g(), this.e.b())));
    }

    public final synchronized PlayerConfigModel a() {
        return this.t;
    }

    public final synchronized VideoStreamingData b() {
        return this.v;
    }

    public final synchronized aegu c() {
        return this.T;
    }

    public final synchronized aeun d() {
        return this.S;
    }

    public final synchronized afae e() {
        return this.U;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final synchronized afbl f() {
        return this.w;
    }

    public final synchronized afhh g() {
        return this.O;
    }

    public final synchronized aflk h() {
        return this.n;
    }

    public final afte i() {
        if (this.F) {
            return afte.ANDROID_EXO2_SCRIPTED_MEDIA_FETCH;
        }
        return afte.ANDROID_EXOPLAYER_V2;
    }

    public final synchronized Integer j() {
        return this.Q;
    }

    public final synchronized Integer k() {
        return this.P;
    }

    public final synchronized String l() {
        return this.v.c;
    }

    public final void m(String str, boolean z, afbl afblVar, int i) {
        FormatStreamModel formatStreamModel = (FormatStreamModel) this.v.q().get(str);
        if (formatStreamModel == null) {
            return;
        }
        if (formatStreamModel.P()) {
            FormatStreamModel formatStreamModel2 = this.x;
            if (formatStreamModel2 != null && formatStreamModel2.equals(formatStreamModel)) {
                return;
            }
            this.x = formatStreamModel;
        } else if (formatStreamModel.C()) {
            FormatStreamModel formatStreamModel3 = this.m;
            if (formatStreamModel3 != null && formatStreamModel3.equals(formatStreamModel)) {
                return;
            }
            this.m = formatStreamModel;
        }
        if (!this.p) {
            return;
        }
        boolean z2 = !z || this.T.a.length <= 0;
        if (this.M == null && !z2) {
            this.M = this.T.c;
        }
        synchronized (this) {
            this.w = afblVar;
        }
        if (this.m == null) {
            return;
        }
        if (this.x == null && !z2) {
            return;
        }
        this.N = true;
        z(this.T.f, i, afblVar.c);
    }

    public final synchronized void n(afae afaeVar) {
        this.U = afaeVar;
    }

    public final synchronized void o(boolean z) {
        this.R = z;
    }

    public final synchronized void p(Integer num) {
        this.Q = num;
    }

    public final synchronized void q(Integer num) {
        this.P = num;
    }

    public final synchronized void r(aflj afljVar) {
        this.o = afljVar;
    }

    public final synchronized void s(aflk aflkVar) {
        this.n = aflkVar;
    }

    public final synchronized void t(aegu aeguVar) {
        this.T = aeguVar;
    }

    public final synchronized void u(PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData, aeun aeunVar, afhh afhhVar, aegu aeguVar) {
        this.t = playerConfigModel;
        this.v = videoStreamingData;
        this.S = aeunVar;
        this.O = afhhVar;
        this.T = aeguVar;
    }

    public final synchronized boolean v() {
        return this.R;
    }

    public final synchronized boolean w() {
        return this.T.f.e();
    }

    public final boolean x() {
        if (this.L.n().D && this.v.D()) {
            FormatStreamModel formatStreamModel = this.x;
            if (formatStreamModel == null && this.v.r.size() == 1) {
                formatStreamModel = (FormatStreamModel) this.v.r.get(0);
            }
            if (formatStreamModel != null && !((aewx) this.e).t.f(formatStreamModel)) {
                return true;
            }
        }
        return false;
    }

    public afbi(afbh afbhVar, String str, PlayerConfigModel playerConfigModel, aetv aetvVar, VideoStreamingData videoStreamingData, aeun aeunVar, afhh afhhVar, aflk aflkVar, aflj afljVar, aegu aeguVar, aenf aenfVar, afjz afjzVar, aeub aeubVar, afhz afhzVar) {
        boolean z = false;
        this.g = 0;
        this.k = -1L;
        this.l = 0;
        this.a = str;
        this.t = playerConfigModel;
        this.b = new aeud(aetvVar);
        this.v = videoStreamingData;
        this.S = aeunVar;
        this.O = afhhVar;
        this.n = aflkVar;
        this.o = afljVar;
        this.T = aeguVar;
        this.d = aenfVar;
        this.e = afbhVar;
        this.z = null;
        afms.a(afjzVar);
        this.L = afjzVar;
        afms.a(aeubVar);
        this.K = aeubVar;
        this.G = afhzVar;
        this.c = new afbj(this);
        if (aenfVar != null) {
            z = afjzVar.aF();
        } else if (afjzVar.aF() && playerConfigModel.aq()) {
            z = true;
        }
        this.F = z;
        if (!afjzVar.o().ai || afjzVar.aF()) {
            return;
        }
        aeubVar.e("smfc", "p");
    }

    public final void y(afjz afjzVar, yrj yrjVar, afmv afmvVar, int i, boolean z) {
        afbl afblVar = this.w;
        if (afblVar == null || !this.p) {
            return;
        }
        aepk aepkVar = afblVar.c;
        if (i == 0) {
            z(this.T.f, i, aepkVar);
            return;
        }
        FormatStreamModel formatStreamModel = null;
        boolean z2 = true;
        boolean z3 = false;
        if (i == 1) {
            if (!z || this.T.a.length <= 0) {
                z3 = true;
            }
            if (this.m == null) {
                return;
            }
            FormatStreamModel formatStreamModel2 = this.x;
            if (formatStreamModel2 != null) {
                z2 = z3;
            } else if (!z3) {
                return;
            }
            if (this.N) {
                return;
            }
            if (formatStreamModel2 != null) {
                this.x = (FormatStreamModel) this.v.q().get(formatStreamModel2.e);
            }
            if (!z2) {
                formatStreamModel = this.T.c;
            }
            this.M = formatStreamModel;
            z(this.T.f, i, aepkVar);
        } else if (i != 10001) {
            if (i != 10002) {
                return;
            }
            this.M = null;
            this.x = null;
            if (this.m == null) {
                return;
            }
            z(null, i, aepkVar);
        } else if (this.x == null || this.m == null) {
        } else {
            FormatStreamModel[] formatStreamModelArr = this.T.b;
            int a = yrjVar.a();
            List asList = Arrays.asList(this.T.a);
            aegx aegxVar = this.T.f;
            PlayerConfigModel playerConfigModel = this.t;
            FormatStreamModel j = aeha.j(asList, aegxVar, yrjVar, playerConfigModel, afjzVar, formatStreamModelArr.length != 0 ? formatStreamModelArr[0].f : 0, afmvVar.c, afmvVar.d, playerConfigModel.e(), this.t.d(), a, afjzVar.i.b(this.a));
            boolean z4 = j == null;
            FormatStreamModel formatStreamModel3 = this.M;
            boolean z5 = z4 ^ (formatStreamModel3 == null);
            if (j == null || formatStreamModel3 == null || formatStreamModel3.e() == j.e()) {
                z2 = false;
            }
            if (!z5 && !z2) {
                return;
            }
            this.M = j;
            z(this.T.f, i, aepkVar);
        }
    }
}

package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahkv  reason: default package */
/* loaded from: classes.dex */
public final class ahkv implements ahjq, ahop, airt, ynl {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    private final yni E;
    private final Handler F;
    private volatile boolean G;
    private String H;
    private String I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f47J;
    private boolean K;
    private volatile int L;
    private volatile boolean M;
    private volatile boolean N;
    private volatile float O;
    private volatile float P;
    public final Context a;
    public final aijf b;
    public final afio c;
    public final afiy d;
    public final azqb e;
    public final axdi f;
    public final List g;
    public final ahrz h;
    public final ahla i;
    public ahmq j;
    public ahkl k;
    public ahjr l;
    public ahlf m;
    public ahof n;
    public ahmt o;
    public ahob p;
    public ahnm q;
    public Runnable r;
    public afnn s;
    public Handler t;
    public ahop u;
    public boolean v;
    public volatile boolean w;
    public volatile int x;
    public volatile int y;
    public aanv z;

    public ahkv(Context context, yni yniVar, aijf aijfVar, afio afioVar, afiy afiyVar, azqb azqbVar, axdi axdiVar) {
        Handler handler = new Handler(context.getMainLooper());
        this.g = new ArrayList();
        this.C = 3;
        this.z = aanv.NOOP;
        this.D = 1;
        this.H = "";
        context.getClass();
        this.a = context;
        yniVar.getClass();
        this.E = yniVar;
        this.F = handler;
        aijfVar.getClass();
        this.b = aijfVar;
        afioVar.getClass();
        this.c = afioVar;
        afiyVar.getClass();
        this.d = afiyVar;
        azqbVar.getClass();
        this.e = azqbVar;
        axdiVar.getClass();
        this.f = axdiVar;
        this.h = new ahrz(context);
        this.i = new ahla(context);
    }

    private final void t(PlayerResponseModel playerResponseModel) {
        ahob ahobVar;
        this.H = playerResponseModel.A();
        this.I = playerResponseModel.z();
        if (!u() || (ahobVar = this.p) == null) {
            return;
        }
        ahobVar.p(this.H, this.I);
    }

    private final boolean u() {
        return (this.l == null || this.k == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ahot a() {
        ahos ahosVar = ahos.DISABLED;
        if (((this.M && !this.w) || (this.N && this.w)) && Math.min(this.x, this.y) <= this.L && this.O > 0.0f) {
            ahosVar = this.G ? ahos.PAUSED : ahos.ENABLED;
        }
        return new ahot(ahosVar, this.O, this.P);
    }

    public final void b(final ahku ahkuVar) {
        ahkuVar.getClass();
        this.g.add(ahkuVar);
        n(new Runnable() { // from class: ahkt
            @Override // java.lang.Runnable
            public final void run() {
                ahob ahobVar;
                ahkv ahkvVar = ahkv.this;
                ahku ahkuVar2 = ahkuVar;
                ahof ahofVar = ahkvVar.n;
                if (ahofVar == null || (ahobVar = ahkvVar.p) == null) {
                    return;
                }
                ahkuVar2.qT(ahofVar, ahobVar);
            }
        });
    }

    public final void c() {
        ahof ahofVar = this.n;
        if (ahofVar == null) {
            return;
        }
        if (this.q == null) {
            try {
                ahnm ahnmVar = new ahnm(this.a, ahofVar);
                this.q = ahnmVar;
                this.n.r(0, ahnmVar);
            } catch (ahok e) {
                i(e);
                return;
            }
        }
        if (this.p != null) {
            return;
        }
        try {
            ahob ahobVar = new ahob(this.a, this.k.a(), this.n);
            this.p = ahobVar;
            ahobVar.t(this.f47J, this.K);
            this.p.k(this.w);
            this.n.q(this.p);
            if (this.n != null && this.p != null) {
                for (ahku ahkuVar : this.g) {
                    ahkuVar.qT(this.n, this.p);
                }
            }
            this.p.p(this.H, this.I);
        } catch (ahok e2) {
            i(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.ahhw r7) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahkv.d(ahhw):void");
    }

    public final void e(ahhx ahhxVar) {
        ahmq ahmqVar = this.j;
        if (ahmqVar != null) {
            long e = ahhxVar.e();
            if (!ahmqVar.f) {
                return;
            }
            ahmp ahmpVar = ahmqVar.c;
            ahmpVar.j = e;
            ahmpVar.k = System.currentTimeMillis();
        }
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 32L)).h(aiwv.l(1)).aa(new ahko(this, 1), aaga.o), airwVar.G().d.h(aiwv.n(airwVar.aB(), 32L)).h(aiwv.l(1)).aa(new ahko(this), aaga.o), airwVar.G().i.h(aiwv.n(airwVar.aB(), 32L)).h(aiwv.l(1)).aa(new ahko(this, 2), aaga.o)};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(ahia ahiaVar) {
        long j;
        ahmq ahmqVar = this.j;
        if (ahmqVar != null && ahmqVar.f) {
            ahmp ahmpVar = ahmqVar.c;
            if (ahiaVar.a() == 2 && ahmpVar.g) {
                ahmpVar.g = false;
                j = 30000;
            } else if (ahiaVar.a() != 2 && !ahmpVar.g) {
                ahmpVar.g = true;
                Handler handler = ahmpVar.a;
                if (handler != null) {
                    handler.removeCallbacks(ahmpVar.h);
                }
                j = 0;
            }
            ahmpVar.c(j);
        }
        this.G = ahiaVar.e();
        r(a());
    }

    public final void i(ahok ahokVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(ahokVar.getMessage());
        sb.append("\n");
        for (StackTraceElement stackTraceElement : ahokVar.getStackTrace()) {
            sb.append(stackTraceElement);
            sb.append("\n");
        }
        zep.b(sb.toString());
        this.F.post(new ahkq(this, 1));
    }

    public final void j() {
        if (u()) {
            ahlb ahlbVar = this.l.g;
            if (ahlbVar != null) {
                ahlbVar.d = true;
            }
            this.E.d(new ahhy());
        }
    }

    public final void k() {
        if (u()) {
            this.k.d();
            this.l.a();
        }
        this.v = false;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                d((ahhw) obj);
                return null;
            } else if (i == 1) {
                e((ahhx) obj);
                return null;
            } else if (i == 2) {
                h((ahia) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhw.class, ahhx.class, ahia.class};
    }

    public final void l() {
        p();
        this.v = true;
    }

    public final void m() {
        if (!u()) {
            return;
        }
        this.l.c(this.w);
        this.l.h = this.m;
        this.b.p(this.w);
        boolean z = this.w;
        if (u()) {
            if (z) {
                this.k.g(new ahkq(this, 2));
                this.k.a().setClickable(true);
            } else {
                this.k.g(null);
                this.k.a().setClickable(false);
            }
        }
        n(new ahkq(this));
        r(a());
        this.t.obtainMessage(2, this.w ? 1 : 0, 0).sendToTarget();
    }

    public final void n(Runnable runnable) {
        ahjr ahjrVar = this.l;
        if (ahjrVar != null) {
            ahjrVar.c.add(runnable);
        }
    }

    public final void o(final aanv aanvVar, final boolean z) {
        if (!u() || this.n == null) {
            return;
        }
        String.valueOf(String.valueOf(aanvVar)).length();
        n(new Runnable() { // from class: ahks
            @Override // java.lang.Runnable
            public final void run() {
                ahof ahofVar;
                ahkv ahkvVar = ahkv.this;
                aanv aanvVar2 = aanvVar;
                boolean z2 = z;
                if (aanvVar2 == null || ahkvVar.l == null || (ahofVar = ahkvVar.n) == null) {
                    String valueOf = String.valueOf(aanvVar2);
                    String valueOf2 = String.valueOf(ahkvVar.l);
                    String valueOf3 = String.valueOf(ahkvVar.n);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
                    sb.append("Null rendering mode. RM: ");
                    sb.append(valueOf);
                    sb.append(", CR: ");
                    sb.append(valueOf2);
                    sb.append(", SG: ");
                    sb.append(valueOf3);
                    zep.b(sb.toString());
                    return;
                }
                try {
                    int i = aanvVar2.a() ? z2 ? 2 : 3 : 1;
                    ahofVar.b.l(aanvVar2, i);
                    ahofVar.k = i;
                    for (ahod ahodVar : ahofVar.e) {
                        ahodVar.z(i);
                    }
                    ahjr ahjrVar = ahkvVar.l;
                    int i2 = ahkvVar.n.k;
                    if (i2 == 0) {
                        throw null;
                    }
                    ahjrVar.l = i2;
                    ahjrVar.d();
                    if (ahkvVar.n.k == 1) {
                        ahmq ahmqVar = ahkvVar.j;
                        if (ahmqVar != null) {
                            ahmqVar.a();
                        }
                        ahkvVar.j = null;
                        ahkvVar.n.m = null;
                    } else if (ahkvVar.j == null) {
                        ahkvVar.j = new ahmq(ahkvVar.c, ahkvVar.d, ahkvVar.B);
                        ahmq ahmqVar2 = ahkvVar.j;
                        if (ahmqVar2.f) {
                            ahmqVar2.c.start();
                        }
                        ahkvVar.n.m = ahkvVar.j;
                    }
                } catch (ahok e) {
                    ahkvVar.i(e);
                }
            }
        });
    }

    public final void p() {
        if (u()) {
            this.k.e();
            m();
        }
    }

    public final void q(ahlf ahlfVar, boolean z) {
        this.m = ahlfVar;
        this.w = z;
        m();
        if (!z || !this.v) {
            return;
        }
        this.E.d(new ahhy());
    }

    public final void r(final ahot ahotVar) {
        n(new Runnable() { // from class: ahkm
            @Override // java.lang.Runnable
            public final void run() {
                ahkv ahkvVar = ahkv.this;
                ahot ahotVar2 = ahotVar;
                ahof ahofVar = ahkvVar.n;
                if (ahofVar != null) {
                    try {
                        ahofVar.b.a(ahotVar2);
                        ahrs ahrsVar = ahofVar.a;
                        ahot ahotVar3 = ahrsVar.a;
                        ahrsVar.a = ahotVar2;
                        if (ahotVar3.a() == ahotVar2.a()) {
                            return;
                        }
                        ahrsVar.e();
                        ahrsVar.d();
                    } catch (ahok e) {
                        ahkvVar.i(e);
                    }
                }
            }
        });
    }

    public final boolean s() {
        return !this.w && !this.z.a();
    }
}

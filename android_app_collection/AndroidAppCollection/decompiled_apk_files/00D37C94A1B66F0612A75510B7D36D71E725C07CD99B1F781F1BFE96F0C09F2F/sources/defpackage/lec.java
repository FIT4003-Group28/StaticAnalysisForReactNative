package defpackage;

import android.content.Context;
import android.media.AudioRecord;
import android.media.SoundPool;
import android.os.Handler;
import com.google.android.apps.youtube.app.search.voice.ConnectivitySlimStatusBarController;
import com.google.android.youtube.R;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: lec  reason: default package */
/* loaded from: classes3.dex */
public final class lec implements SoundPool.OnLoadCompleteListener, leu, ynl {
    public static final /* synthetic */ int y = 0;
    private final akjb A;
    private final ScheduledExecutorService B;
    private final akis C;
    private final axxo D;
    private final int E;
    private final int F;
    private final int G;
    private boolean K;
    private final aacz L;
    private final apwt M;
    public final aadd a;
    public final leb b;
    public final lev c;
    public final ConnectivitySlimStatusBarController d;
    public final Handler e;
    public final yrj f;
    public final aaqp g;
    public final acti h;
    public final acvh i;
    public akiq j;
    public final Runnable k;
    SoundPool l;
    final int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean s;
    public boolean t;
    public boolean u;
    AudioRecord v;
    protected akip w;
    public final acgf x;
    private final Context z;
    private int H = 2;
    private int I = 16;

    /* renamed from: J  reason: collision with root package name */
    private int f223J = 16000;
    public List r = amuk.q();

    public lec(Context context, aadd aaddVar, aacz aaczVar, akis akisVar, apwt apwtVar, acgf acgfVar, akjb akjbVar, ScheduledExecutorService scheduledExecutorService, yrj yrjVar, aaqp aaqpVar, leb lebVar, lev levVar, ConnectivitySlimStatusBarController connectivitySlimStatusBarController, Handler handler, acti actiVar, acvh acvhVar, axxo axxoVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.z = context;
        this.a = aaddVar;
        this.L = aaczVar;
        this.C = akisVar;
        this.M = apwtVar;
        this.x = acgfVar;
        this.A = akjbVar;
        this.B = scheduledExecutorService;
        this.f = yrjVar;
        this.g = aaqpVar;
        this.b = lebVar;
        this.c = levVar;
        this.d = connectivitySlimStatusBarController;
        this.e = handler;
        this.h = actiVar;
        this.i = acvhVar;
        this.D = axxoVar;
        SoundPool soundPool = new SoundPool(5, 3, 0);
        this.l = soundPool;
        soundPool.setOnLoadCompleteListener(this);
        this.m = this.l.load(context, R.raw.open, 0);
        this.E = this.l.load(context, R.raw.success, 0);
        this.F = this.l.load(context, R.raw.no_input, 0);
        this.G = this.l.load(context, R.raw.failure, 0);
        levVar.d(this);
        this.o = yrjVar.p();
        this.k = new Runnable() { // from class: ldx
            @Override // java.lang.Runnable
            public final void run() {
                lec lecVar = lec.this;
                lecVar.i();
                lecVar.d();
            }
        };
    }

    private final String q() {
        String x = apwt.x();
        String a = this.M.a();
        if (x.isEmpty() || a.isEmpty()) {
            return "en-US";
        }
        StringBuilder sb = new StringBuilder(x.length() + 1 + String.valueOf(a).length());
        sb.append(x);
        sb.append("-");
        sb.append(a);
        return sb.toString();
    }

    private final void r(int i) {
        SoundPool soundPool = this.l;
        if (soundPool != null && soundPool.play(i, 1.0f, 1.0f, 0, 0, 1.0f) == 0 && i == this.m) {
            this.K = true;
        }
    }

    public final abq a() {
        return new ldy(this);
    }

    public final ankt b() {
        return anlz.x(this.x.d(), 300L, TimeUnit.MILLISECONDS, this.B);
    }

    public final void c() {
        if (!this.c.q() || this.r.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder(this.z.getResources().getString(R.string.try_saying_text));
        sb.append(this.c.b());
        sb.append("''");
        int i = 0;
        sb.append((String) this.r.get(0));
        sb.append("''");
        this.c.e(sb);
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.r) {
            i++;
            sb2.append("''");
            sb2.append(str);
            sb2.append("''");
            if (i >= this.c.a()) {
                break;
            }
            sb2.append("\n\n");
        }
        this.c.c(sb2);
    }

    public final void d() {
        l();
        this.c.k();
    }

    public final void e() {
        this.h.H(3, new acte(actj.VOICE_SEARCH_CANCEL_BUTTON), null);
        this.b.f();
    }

    public final void g(String str, byte[] bArr, String str2) {
        String str3;
        boolean z;
        if (this.w == null) {
            this.w = new lea(this);
        }
        ldz ldzVar = new ldz(this);
        boolean z2 = true;
        if (str.isEmpty()) {
            str3 = q();
            z = false;
        } else {
            str3 = str;
            z = true;
        }
        if (this.j == null) {
            akir a = this.C.a(this.w, ldzVar, this.f223J, str3, bArr, eog.bi(this.a), this.H, this.I, str2, q());
            a.D = eog.bj(this.a);
            a.x = eog.h(this.a);
            a.c(eog.i(this.a));
            a.z = eog.q(this.a);
            a.u = eog.T(this.a);
            if (!eog.au(this.L) || !z) {
                z2 = false;
            }
            a.w = z2;
            a.b(ampq.j(eog.s(this.a)));
            a.B = eog.o(this.a);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ayqi.c((AtomicReference) this.D.a().an(false).S(new ldk(atomicBoolean, 3)));
            a.v = atomicBoolean.get();
            this.j = a.a();
        }
    }

    @Override // defpackage.leu
    public final void h() {
        if (this.n) {
            this.h.H(3, new acte(actj.VOICE_SEARCH_MIC_BUTTON), null);
            r(this.F);
            this.p = true;
            m();
            return;
        }
        n();
    }

    public final void i() {
        if (this.n || !this.c.r()) {
            r(this.G);
        }
    }

    public final void j() {
        r(this.E);
    }

    public final void k() {
        akiq akiqVar = this.j;
        if (akiqVar != null) {
            akiqVar.a();
            this.j = null;
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                boolean a = ((ypy) obj).a();
                this.o = a;
                ConnectivitySlimStatusBarController connectivitySlimStatusBarController = this.d;
                if (connectivitySlimStatusBarController != null) {
                    connectivitySlimStatusBarController.m(!a);
                }
                if (this.o) {
                    this.e.removeCallbacks(this.k);
                    this.c.g();
                    return null;
                } else if (this.n) {
                    this.e.postDelayed(this.k, 3000L);
                    return null;
                } else {
                    d();
                    return null;
                }
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ypy.class};
    }

    public final void l() {
        this.n = false;
        this.t = false;
        this.u = false;
        akiq akiqVar = this.j;
        if (akiqVar != null) {
            akiqVar.c();
        }
    }

    public final void m() {
        l();
        this.c.o(this.o, this.p);
    }

    public final void n() {
        this.n = true;
        this.p = false;
        this.q = false;
        this.c.i();
        akiq akiqVar = this.j;
        if (akiqVar == null || !akiqVar.f()) {
            this.b.h();
        } else {
            r(this.m);
        }
    }

    public final void o() {
        this.n = false;
        this.w = null;
        SoundPool soundPool = this.l;
        if (soundPool != null) {
            soundPool.release();
            this.l = null;
        }
        k();
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        int i3 = this.m;
        if (i != i3 || !this.K) {
            return;
        }
        r(i3);
        this.K = false;
    }

    public final boolean p() {
        AudioRecord a = this.A.a();
        this.v = a;
        if (a != null) {
            this.H = a.getAudioFormat();
            this.I = this.v.getChannelConfiguration();
            this.f223J = this.v.getSampleRate();
            return true;
        }
        return false;
    }
}

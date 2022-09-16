package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LogStreamEventsCommandOuterClass$LogStreamEventsCommand;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: abyk  reason: default package */
/* loaded from: classes.dex */
public final class abyk implements abyo, abyq {
    private static final long Y = TimeUnit.SECONDS.toMillis(1);
    public static final long a = TimeUnit.SECONDS.toMillis(5);
    public boolean A;
    public final boolean B;
    public Integer C;
    public Integer D;
    public long E;
    public String F;
    public String G;
    public arag H;
    public String I;

    /* renamed from: J  reason: collision with root package name */
    public abyi f25J;
    public long K;
    public long L;
    public int M;
    public boolean N;
    public boolean T;
    public boolean U;
    public long V;
    public long W;
    public athj X;
    private final boolean Z;
    private final boolean aa;
    private abxl ab;
    public final abux b;
    public final abyg c;
    public final abyd d;
    public final abyf e;
    public final abzc f;
    public final abtt g;
    public final abvj h;
    public final snc i;
    public final abyp j;
    public final abtx k;
    public final abzn l;
    public final acbh m;
    public final akzg n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final int r;
    public final boolean s;
    public final Handler t;
    public final Context u;
    public accg x;
    public abyj y;
    public final String z;
    public final Runnable v = new abxm(this);
    public final Runnable w = new abxm(this, 2);
    public int O = -1;
    public int P = -1;
    public int Q = -1;
    public int R = -1;
    public final int S = -1;

    public abyk(Context context, Handler handler, abux abuxVar, abyg abygVar, abyd abydVar, abyf abyfVar, abzc abzcVar, abtt abttVar, abvk abvkVar, snc sncVar, abtx abtxVar, abzn abznVar, acbh acbhVar, abss abssVar, akzg akzgVar, abut abutVar, String str, boolean z, boolean z2, boolean z3, Integer num, Integer num2, String str2, String str3, long j, long j2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i) {
        this.b = abuxVar;
        this.c = abygVar;
        this.d = abydVar;
        this.e = abyfVar;
        this.f = abzcVar;
        this.g = abttVar;
        Context context2 = (Context) abvkVar.a.get();
        context2.getClass();
        aayl aaylVar = (aayl) abvkVar.b.get();
        aaylVar.getClass();
        this.h = new abvj(context2, aaylVar, str);
        this.i = sncVar;
        this.j = new abyp(handler, this);
        this.k = abtxVar;
        this.l = abznVar;
        this.m = acbhVar;
        this.t = handler;
        this.u = context;
        this.A = z4;
        this.n = akzgVar;
        this.z = str;
        this.M = -1;
        this.B = z;
        this.C = num;
        this.D = num2;
        this.F = str2;
        this.G = str3;
        this.K = j;
        this.L = j2;
        this.o = z5;
        this.p = z6;
        this.Z = z7;
        this.aa = z8;
        this.q = z9;
        this.r = i;
        this.s = z3;
        this.N = z2;
        c();
        if (abzcVar.l()) {
            abssVar.l(abtxVar.m());
        }
        abtxVar.h(abutVar);
    }

    private final void A() {
        abxl abxlVar = this.ab;
        if (abxlVar != null) {
            this.g.b.remove(abxlVar);
            this.ab = null;
        }
        this.g.c();
    }

    private final boolean B(int i, long j, int i2) {
        if (!this.m.i(i)) {
            return false;
        }
        acbh.b(this.m.g(i, this.B));
        return j >= ((long) i2);
    }

    public final void a() {
        l(0);
    }

    public final void b(boolean z) {
        abxa.b().k(astk.class);
        this.k.o(new abxj(this, z));
    }

    public final void c() {
        A();
        this.g.c();
        this.P = this.g.a();
        this.R = this.g.a();
        this.Q = this.g.a();
        this.O = this.g.a();
        abxl abxlVar = new abxl(this);
        this.ab = abxlVar;
        abtt abttVar = this.g;
        abttVar.b.put(abxlVar, new abtq(abttVar, abxlVar));
    }

    public final void d(int i, String str) {
        u(true, true);
        this.c.u(i, this.X, str, this.H, this.N);
    }

    public final void e(final int i) {
        if (!this.U || !x()) {
            return;
        }
        String str = this.F;
        String str2 = this.G;
        String.valueOf(str).length();
        String.valueOf(str2).length();
        MediaFormat g = this.m.g(this.M, this.B);
        if (g == null) {
            zep.b("Could not find any supported encoders");
            h(7);
            return;
        }
        Bundle bundle = new Bundle();
        achc.e(bundle);
        bundle.putBoolean("KEY_ENABLE_THROUGHPUT_MEASUREMENT", true);
        final int integer = g.getInteger("bitrate");
        abtp.a(bundle, 2);
        this.k.q(this.A, this.B, this.C, this.D, g, this.m.f(), this.F, this.G, this.x, bundle, new abtv() { // from class: abxe
            @Override // defpackage.abtv
            public final void a(int i2) {
                abyk abykVar = abyk.this;
                int i3 = i;
                int i4 = integer;
                if (!abykVar.d.d()) {
                    return;
                }
                if (i2 == 0) {
                    if (!abykVar.U) {
                        return;
                    }
                    abto b = abykVar.k.b();
                    if (b == null) {
                        zep.b("No ABR controller for SpeedTest");
                        abykVar.a();
                        return;
                    }
                    b.d(false);
                    abxd abxdVar = new abxd(abykVar, i3, b);
                    double d = i4;
                    Double.isNaN(d);
                    b.c(i4 + ((int) (d * 0.5d)), abxdVar);
                } else if (i2 == 7 || i2 == 8 || i2 == 11 || i2 == 12) {
                    StringBuilder sb = new StringBuilder(70);
                    sb.append("Communication or timeout error while preparing SpeedTest - ");
                    sb.append(i2);
                    zep.l(sb.toString());
                    abykVar.l(i3);
                } else {
                    StringBuilder sb2 = new StringBuilder(38);
                    sb2.append("Error preparing SpeedTest: ");
                    sb2.append(i2);
                    zep.b(sb2.toString());
                    abykVar.a();
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
        if (r1 == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyk.f():void");
    }

    public final void g(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                apzg apzgVar = (apzg) it.next();
                if (apzgVar.qn(LogStreamEventsCommandOuterClass$LogStreamEventsCommand.logStreamEventsCommand)) {
                    this.k.c((LogStreamEventsCommandOuterClass$LogStreamEventsCommand) apzgVar.qm(LogStreamEventsCommandOuterClass$LogStreamEventsCommand.logStreamEventsCommand));
                    return;
                }
            }
        }
    }

    public final void h(int i) {
        i(i, null, false);
    }

    public final void i(int i, String str, boolean z) {
        if (i != 26 && i != 0) {
            StringBuilder sb = new StringBuilder(72);
            sb.append("Error during live stream: status=");
            sb.append(i);
            sb.append(", attemptStopBroadcast=");
            sb.append(z);
            zep.b(sb.toString());
        }
        if (z) {
            this.l.e(this.z, new abxu(this, i, str));
            return;
        }
        d(i, str);
    }

    public final void j(final int i, final boolean z, final boolean z2, final int i2) {
        if (!this.U) {
            return;
        }
        String str = this.F;
        String str2 = this.G;
        String.valueOf(str).length();
        String.valueOf(str2).length();
        Bundle bundle = new Bundle();
        MediaFormat f = this.m.f();
        MediaFormat g = this.m.g(this.M, this.B);
        if (!this.q) {
            if (f == null || g == null) {
                zep.b("Could not find supported encoders");
                h(7);
                return;
            }
            if (z) {
                achc.e(bundle);
            }
            int i3 = 1;
            if (z2) {
                bundle.putBoolean("extras-key-enable-bitrate-bounce", true);
            }
            aqxo.p(i2 >= 0);
            bundle.putInt("extras-key-send-buffer-chunk-count", i2);
            if (this.f.c() != null) {
                asuw c = this.f.c();
                int i4 = this.M;
                if (i4 == 0 || i4 == 1 || i4 == 2) {
                    int i5 = c.e;
                    if (i5 > 0) {
                        achc.c(bundle, i5 * 1000);
                    }
                } else {
                    int i6 = c.d;
                    if (i6 > 0) {
                        achc.c(bundle, i6 * 1000);
                    }
                }
                int v = akzj.v(c.g);
                if (v != 0 && v != 1) {
                    int v2 = akzj.v(c.g);
                    if (v2 != 0) {
                        i3 = v2;
                    }
                    abtp.a(bundle, i3);
                    bundle.putLong("KEY_SPEED_TEST_BITRATE", this.E);
                }
            }
            i3 = 3;
            abtp.a(bundle, i3);
            bundle.putLong("KEY_SPEED_TEST_BITRATE", this.E);
        }
        this.k.q(this.A, this.B, this.C, this.D, g, f, this.F, this.G, this.x, bundle, new abtv() { // from class: abxf
            @Override // defpackage.abtv
            public final void a(int i7) {
                final abyk abykVar = abyk.this;
                final int i8 = i;
                final boolean z3 = z;
                final boolean z4 = z2;
                final int i9 = i2;
                if (i7 != 0) {
                    if (i7 != 7) {
                        if (i7 == 8) {
                            if (i8 > 0) {
                                abykVar.t.postDelayed(new Runnable() { // from class: abxo
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        abyk abykVar2 = abyk.this;
                                        int i10 = i8;
                                        boolean z5 = z3;
                                        boolean z6 = z4;
                                        int i11 = i9;
                                        if (abykVar2.U) {
                                            abykVar2.j(i10 - 1, z5, z6, i11);
                                        }
                                    }
                                }, 500L);
                                return;
                            } else {
                                abykVar.j.m();
                                return;
                            }
                        } else if (i7 != 11 && i7 != 12) {
                            StringBuilder sb = new StringBuilder(36);
                            sb.append("Error preparing capture: ");
                            sb.append(i7);
                            zep.b(sb.toString());
                            abykVar.h(i7);
                            return;
                        }
                    }
                    StringBuilder sb2 = new StringBuilder(68);
                    sb2.append("Communication or timeout error while preparing capture - ");
                    sb2.append(i7);
                    zep.l(sb2.toString());
                    abykVar.j.m();
                    return;
                }
                abykVar.o();
            }
        });
    }

    public final void k(int i) {
        if (!this.U) {
            return;
        }
        abyp abypVar = this.j;
        abypVar.h = true;
        abypVar.h();
        this.l.i(this.z, new abxw(this, i));
    }

    public final void l(final int i) {
        this.k.f(new abtv() { // from class: abxs
            @Override // defpackage.abtv
            public final void a(int i2) {
                final abyk abykVar = abyk.this;
                final int i3 = i;
                if (i3 > 0) {
                    abykVar.t.postDelayed(new Runnable() { // from class: abxn
                        @Override // java.lang.Runnable
                        public final void run() {
                            abyk abykVar2 = abyk.this;
                            int i4 = i3;
                            if (abykVar2.U) {
                                abykVar2.e(i4 - 1);
                            }
                        }
                    }, 500L);
                    return;
                }
                abykVar.c.A();
                abykVar.j.b();
            }
        });
    }

    public final void m(abyi abyiVar, String str) {
        if (abyiVar == this.f25J) {
            return;
        }
        this.f25J = abyiVar;
        abxa.b().i(asto.class);
        this.e.l(abyiVar, str);
    }

    public final void n(boolean z, abyh abyhVar) {
        String str = true != z ? "DISABLED" : "ENABLED";
        if (str.length() != 0) {
            "Setting mic for live capture to ".concat(str);
        }
        if (!this.U || !this.j.k()) {
            this.A = z;
            abyhVar.a(z);
            return;
        }
        this.k.n(z, new abxq(this, abyhVar));
    }

    public final void o() {
        if (!this.U) {
            return;
        }
        abyj abyjVar = this.y;
        if (abyjVar != null && !this.T) {
            long a2 = ((znf) ((acdu) abyjVar).a.i.get()).a();
            if (a2 > 0) {
                this.T = true;
                this.t.postDelayed(new abxm(this, 3), a2);
                return;
            }
        }
        this.k.i(new abxp(this, 1), new abxr(this, 2));
    }

    public final void p() {
        boolean z = true;
        this.U = true;
        if (TextUtils.isEmpty(this.F) || TextUtils.isEmpty(this.G)) {
            if (this.s) {
                zep.b("Can't start a co-stream without stream url and key");
                return;
            }
            this.j.i(false);
        } else if (!this.q && !x()) {
            return;
        } else {
            if (this.s) {
                this.j.i(true);
            } else {
                abyp abypVar = this.j;
                boolean z2 = this.N;
                int a2 = abypVar.a(abypVar.a);
                abypVar.a = a2;
                abypVar.l = true;
                abypVar.m = z2;
                if (!abypVar.h && !z2) {
                    z = false;
                }
                abypVar.h = z;
                abypVar.g(a2);
            }
        }
        abye abyeVar = new abye(this);
        abxa.b().f(astk.class, abye.class, abyeVar);
        abxa.b().f(asto.class, abye.class, abyeVar);
    }

    @Override // defpackage.abyo
    public final void q(boolean z) {
        if (!this.d.d()) {
            return;
        }
        this.c.y(z);
    }

    public final void r(boolean z) {
        this.U = false;
        this.L = this.i.d() - this.K;
        t();
        if (z) {
            u(false, true);
            return;
        }
        this.t.removeCallbacks(this.w);
        abyp abypVar = this.j;
        if (abypVar.a == 13) {
            i(26, this.u.getString(R.string.lc_error_generic), this.N);
        } else if (this.N) {
            abypVar.c(0);
        } else {
            abypVar.c(26);
        }
    }

    public final void s() {
        abux abuxVar = this.b;
        abuxVar.o = null;
        if (!abuxVar.d) {
            Log.w("CaptureRsrcMonitor", "Resource monitor already stopped.");
        } else {
            abuxVar.b.unregisterReceiver(abuxVar.m);
            abuxVar.b.unregisterReceiver(abuxVar.n);
            abuxVar.c.removeCallbacks(abuxVar.i);
            abuxVar.c.removeCallbacks(abuxVar.l);
            abxa.b().f(asto.class, abux.class, null);
            abuxVar.d = false;
        }
        abvj abvjVar = this.h;
        abvjVar.A = null;
        if (abvjVar.v) {
            abvjVar.v = false;
            abvjVar.e.post(new abvc(abvjVar));
            synchronized (abvjVar) {
                abvjVar.g.removeCallbacksAndMessages(abvjVar);
                abvjVar.t++;
                abvjVar.e.removeCallbacks(abvjVar.h);
            }
        }
        A();
    }

    public final void t() {
        this.t.removeCallbacks(this.v);
    }

    public final void u(boolean z, boolean z2) {
        abxr abxrVar = null;
        if (z2) {
            this.t.removeCallbacksAndMessages(null);
        }
        abxa.b().k(astk.class);
        s();
        if (z) {
            abxrVar = new abxr(this, 3);
            abyp abypVar = this.j;
            abypVar.k = true;
            abypVar.h();
        }
        this.k.f(abxrVar);
    }

    public final boolean v() {
        abtt abttVar = this.g;
        return abttVar != null && abttVar.a.size() > 0;
    }

    public final boolean w() {
        if (!this.U || !this.j.k()) {
            return this.A;
        }
        return this.k.j();
    }

    public final boolean x() {
        if (this.M == -1) {
            int i = 2;
            if (!this.m.i(2)) {
                if (this.m.i(3)) {
                    i = 3;
                } else if (!this.aa || !this.m.i(4)) {
                    i = (!this.Z || !this.m.i(5)) ? -1 : 5;
                } else {
                    i = 4;
                }
            }
            this.M = i;
            if (i != -1) {
                return true;
            }
            abxa.b().n(15, 1, null);
            abyp abypVar = this.j;
            abypVar.g = true;
            abypVar.d = 3;
            abypVar.h();
            return false;
        }
        return true;
    }

    public final void z(abyc abycVar) {
        if (!this.U) {
            zep.b("Cannot pause capture stream not active");
        } else {
            this.k.p(new abxh(this, abycVar, 1));
        }
    }
}

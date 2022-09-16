package defpackage;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aeva  reason: default package */
/* loaded from: classes.dex */
public final class aeva implements ovk, afjp {
    static final long a = TimeUnit.HOURS.toMicros(4);
    private Long A;
    private final long B;
    private long C;
    private final long D;
    private boolean E = false;
    private int F;
    private final int G;
    private final pcw H;
    public final boolean b;
    public final Handler c;
    public final aeuy d;
    public final int e;
    public final Exchanger f;
    public Long g;
    public boolean h;
    public Long i;
    public boolean j;
    public Long k;
    public aevc l;
    private final String n;
    private final FormatStreamModel[] o;
    private final pbl p;
    private final ovo q;
    private final boolean r;
    private final int s;
    private final afhh t;
    private final ovn u;
    private final ovd[] v;
    private final ovm[] w;
    private final PlayerConfigModel x;
    private final yrj y;
    private oun z;

    public aeva(String str, FormatStreamModel[] formatStreamModelArr, afjm afjmVar, ovo ovoVar, afhh afhhVar, pcw pcwVar, boolean z, int i, Exchanger exchanger, Handler handler, aeuy aeuyVar, int i2, PlayerConfigModel playerConfigModel, boolean z2, yrj yrjVar, byte[] bArr) {
        ampq ampqVar;
        int c;
        int length;
        this.n = str;
        this.o = formatStreamModelArr;
        int length2 = formatStreamModelArr.length;
        if (length2 > 0) {
            ampqVar = ampq.i(formatStreamModelArr[0].b);
        } else {
            ampqVar = amon.a;
        }
        this.p = new afln(afjmVar.c(this, str, ampqVar));
        this.q = ovoVar;
        this.r = z;
        this.s = i;
        this.t = afhhVar;
        this.H = pcwVar;
        this.f = exchanger;
        this.c = handler;
        this.d = aeuyVar;
        this.e = i2;
        this.u = new ovn();
        int i3 = 1;
        this.j = true;
        this.x = playerConfigModel;
        aqwu aqwuVar = playerConfigModel.c.e;
        if ((aphq.c((aqwuVar == null ? aqwu.b : aqwuVar).aM) == 0 ? 1 : c) - 1 > 0) {
            aqwu aqwuVar2 = playerConfigModel.c.e;
            int c2 = aphq.c((aqwuVar2 == null ? aqwu.b : aqwuVar2).aM);
            if (c2 != 0) {
                i3 = c2;
            }
        } else {
            i3 = 2;
        }
        this.G = i3;
        this.b = z2;
        this.v = new ovd[length2];
        this.w = new ovm[length2];
        this.y = yrjVar;
        aqwu aqwuVar3 = playerConfigModel.c.e;
        double d = (aqwuVar3 == null ? aqwu.b : aqwuVar3).ba;
        Double.isNaN(d);
        this.D = (long) (d * 1000000.0d);
        int i4 = 0;
        while (true) {
            length = formatStreamModelArr.length;
            if (i4 >= length) {
                break;
            }
            this.w[i4] = ovm.d(formatStreamModelArr[i4]);
            this.v[i4] = new aeux(this, new aevd(this));
            i4++;
        }
        double a2 = length > 0 ? formatStreamModelArr[0].a() : 0.0d;
        this.B = a2 > 0.0d ? (long) (a2 * 1000000.0d) : a;
        this.z = new oum(0L, 0L);
        s();
    }

    private final int m(ovm ovmVar) {
        int i = 0;
        while (true) {
            ovm[] ovmVarArr = this.w;
            if (i < ovmVarArr.length) {
                if (ovmVarArr[i].a.equals(ovmVar.a)) {
                    return i;
                }
                i++;
            } else {
                return 0;
            }
        }
    }

    private final synchronized long n() {
        return this.z.a(null)[1];
    }

    private final Uri o(int i, Long l) {
        FormatStreamModel formatStreamModel = this.o[i];
        aalz n = formatStreamModel.n();
        n.c(this.n);
        n.e(afmg.e(formatStreamModel, this.x, this.u.b, this.y.a()));
        if (l != null) {
            n.f(l.longValue());
        } else {
            n.d(this.t.b());
        }
        return n.a();
    }

    private static MediaFormat p(ovm ovmVar) {
        if (!aanp.d(ovmVar.b)) {
            return MediaFormat.b(ovmVar.a, "audio/mp4a-latm", ovmVar.c, -1, -1L, ovmVar.g, ovmVar.h, null, ovmVar.j);
        }
        return MediaFormat.j(ovmVar.a, "video/avc", ovmVar.c, -1L, ovmVar.d, ovmVar.e);
    }

    private final synchronized oun q() {
        long max;
        oun aevoVar;
        long n = n();
        if (n > 0) {
            boolean z = true;
            if (!this.b && !this.h && !this.E) {
                z = false;
            }
            long max2 = Math.max(n - this.t.d(), 0L);
            if (this.b) {
                long longValue = this.A.longValue();
                long longValue2 = this.k.longValue();
                long micros = TimeUnit.MILLISECONDS.toMicros(this.s);
                Long.signum(longValue2);
                max = Math.max(0L, longValue - (longValue2 * micros));
            } else {
                max = Math.max(0L, n - this.B);
            }
            long j = max;
            if (z) {
                aevoVar = new oum(j, n);
            } else {
                aevoVar = new aevo(j, max2, this.H, true, null);
            }
            return aevoVar;
        }
        return new oum(0L, 0L);
    }

    private final synchronized Long r(long j) {
        Long l;
        Long l2;
        if (this.r && this.s > 0 && (l = this.k) != null && l.longValue() > 0 && (l2 = this.A) != null && l2.longValue() > 0 && j > 0) {
            long micros = TimeUnit.MILLISECONDS.toMicros(this.s);
            double longValue = this.A.longValue() - j;
            double d = micros;
            Double.isNaN(longValue);
            Double.isNaN(d);
            return Long.valueOf(this.k.longValue() - ((long) Math.ceil(longValue / d)));
        }
        return null;
    }

    private final synchronized void s() {
        if (this.c == null || this.d == null) {
            return;
        }
        this.C = n();
        final oun ounVar = this.z;
        final oun q = q();
        this.c.post(new Runnable() { // from class: aeuv
            @Override // java.lang.Runnable
            public final void run() {
                aeva aevaVar = aeva.this;
                oun ounVar2 = ounVar;
                oun ounVar3 = q;
                afdv afdvVar = (afdv) aevaVar.d;
                if (aevaVar.e != afdvVar.u()) {
                    return;
                }
                afdvVar.E = ounVar2;
                long[] b = ounVar3.b();
                afdvVar.f.k(b[0], b[1]);
            }
        });
    }

    private final boolean t() {
        return this.q != null;
    }

    @Override // defpackage.afjp
    public final void D(int i, Map map) {
        aflw aflwVar = new aflw(map);
        Long a2 = aflwVar.a();
        Long b = aflwVar.b();
        if (b != null) {
            synchronized (this) {
                if (a2 != null) {
                    if (!b.equals(this.A)) {
                        if (this.b && this.B < b.longValue()) {
                            long micros = TimeUnit.MILLISECONDS.toMicros(this.s);
                            long longValue = b.longValue();
                            long longValue2 = a2.longValue();
                            Long.signum(longValue2);
                            long max = (Math.max(0L, longValue - (longValue2 * micros)) + this.B) - micros;
                            this.k = Long.valueOf(max / micros);
                            this.A = Long.valueOf(max);
                        } else {
                            this.k = a2;
                            this.A = b;
                        }
                        this.t.j(b.longValue());
                    }
                }
                l(this.A.longValue());
            }
        }
        aevc aevcVar = this.l;
        if (aevcVar != null) {
            try {
                if (aevcVar.r != 3) {
                    return;
                }
                Long d = new aflw(map).d();
                long longValue3 = d != null ? d.longValue() : -1L;
                long j = aevcVar.n;
                if (j != -1 && j != longValue3) {
                    aevcVar.n = Math.max(j, longValue3);
                    aevcVar.o = 0;
                    throw new afkc(aevcVar.d);
                }
                aevcVar.n = longValue3;
            } catch (afkc e) {
                if ("x-segment-lmt".equals(e.e)) {
                    afkl afklVar = afkl.DEFAULT;
                    long o = this.l.o();
                    int i2 = this.l.i;
                    StringBuilder sb = new StringBuilder(14);
                    sb.append("sq.");
                    sb.append(i2);
                    k(afklVar, "manifestless.lmt", o, sb.toString());
                }
                throw e;
            }
        }
    }

    @Override // defpackage.ovk
    public final int a() {
        if (t()) {
            return 1;
        }
        return this.w.length;
    }

    @Override // defpackage.ovk
    public final MediaFormat b(int i) {
        return p(this.w[i]);
    }

    @Override // defpackage.ovk
    public final void c(long j) {
    }

    @Override // defpackage.ovk
    public final void d(List list) {
        this.u.c = null;
    }

    @Override // defpackage.ovk
    public final void e(int i) {
        this.F = i;
    }

    @Override // defpackage.ovk
    public final void f(List list, long j, ove oveVar) {
        long j2;
        long j3;
        int i;
        ovb ovbVar;
        Long l = null;
        if (list.isEmpty()) {
            Long r = r(j);
            this.g = r;
            if (r != null) {
                this.g = Long.valueOf(r.longValue() - 1);
            }
            this.i = null;
            this.j = true;
            this.h = false;
        }
        if (this.h) {
            this.t.i(n());
            oveVar.c = true;
            return;
        }
        this.u.a = list.size();
        if (t()) {
            this.q.a(list, j, this.w, this.u);
        } else {
            ovn ovnVar = this.u;
            ovnVar.c = this.w[this.F];
            ovnVar.b = 2;
        }
        ovn ovnVar2 = this.u;
        ovm ovmVar = ovnVar2.c;
        int i2 = ovnVar2.a;
        oveVar.a = i2;
        if (ovmVar == null) {
            oveVar.b = null;
        } else if (i2 == list.size() && (ovbVar = oveVar.b) != null && ovbVar.c.equals(ovmVar)) {
        } else {
            ovq ovqVar = list.isEmpty() ? null : (ovq) list.get(oveVar.a - 1);
            Long valueOf = (ovqVar == null || (i = ovqVar.i) < 0) ? this.g : Long.valueOf(i);
            if (valueOf != null) {
                l = Long.valueOf(valueOf.longValue() + 1);
            }
            this.g = l;
            long j4 = 0;
            if (this.b) {
                Long r2 = r(j);
                Long l2 = this.g;
                if (l2 != null) {
                    if (r2 == null || l2.longValue() >= r2.longValue()) {
                        r2 = this.g;
                    }
                    j3 = r2.longValue();
                } else {
                    j3 = 0;
                }
                this.g = Long.valueOf(j3);
            }
            if (this.g == null || !(ovqVar instanceof aevc)) {
                j2 = 0;
            } else {
                aevc aevcVar = (aevc) ovqVar;
                j4 = aevcVar.n();
                j2 = (aevcVar.n() - aevcVar.o()) + j4;
            }
            oum oumVar = new oum(j4, j2);
            int i3 = this.u.b;
            int m = m(ovmVar);
            long[] jArr = new long[2];
            oumVar.a(jArr);
            pbl pblVar = this.p;
            pbn pbnVar = new pbn(o(m, this.g));
            ovm ovmVar2 = this.w[m];
            long j5 = jArr[0];
            long j6 = jArr[1];
            Long l3 = this.g;
            aevc aevcVar2 = new aevc(pblVar, pbnVar, i3, ovmVar2, j5, j6, l3 == null ? -1 : l3.intValue(), this.v[m], p(this.w[m]), this.G);
            this.l = aevcVar2;
            oveVar.b = aevcVar2;
        }
    }

    @Override // defpackage.ovk
    public final void g() {
    }

    @Override // defpackage.ovk
    public final void h(ovb ovbVar) {
    }

    @Override // defpackage.ovk
    public final void i(ovb ovbVar, Exception exc) {
        if (!(exc instanceof aevb)) {
            if (!(exc.getCause() instanceof aeuz)) {
                if (!(exc instanceof ate)) {
                    return;
                }
                if (!(exc instanceof atg) || ((atg) exc).d != 416) {
                    if (((ate) exc).c != 2 || !(ovbVar instanceof aevc)) {
                        return;
                    }
                    aevc aevcVar = (aevc) ovbVar;
                    if (aevcVar.i >= 0 || this.g == null || !aevcVar.d.a.toString().contains("headm")) {
                        return;
                    }
                }
            }
            aevc aevcVar2 = (aevc) ovbVar;
            aevcVar2.m = new pbn(o(m(this.u.c), this.g));
            aevcVar2.o = 0;
            return;
        }
        afkl afklVar = afkl.DEFAULT;
        long o = this.l.o();
        int i = this.l.i;
        StringBuilder sb = new StringBuilder(14);
        sb.append("sq.");
        sb.append(i);
        k(afklVar, "net.nocontent", o, sb.toString());
    }

    @Override // defpackage.ovk
    public final boolean j() {
        return true;
    }

    public final void k(afkl afklVar, String str, long j, String str2) {
        if (this.c == null || this.d == null) {
            return;
        }
        final afkn afknVar = new afkn(afklVar, str, TimeUnit.MICROSECONDS.toMillis(j), str2);
        this.c.post(new Runnable() { // from class: aeuw
            @Override // java.lang.Runnable
            public final void run() {
                aeva aevaVar = aeva.this;
                afkn afknVar2 = afknVar;
                aeuy aeuyVar = aevaVar.d;
                if (!afknVar2.n()) {
                    afknVar2.l();
                    ((afdv) aeuyVar).f.g(afknVar2);
                    return;
                }
                ((afdv) aeuyVar).V(afknVar2);
            }
        });
    }

    public final synchronized void l(long j) {
        oun oumVar;
        long n = n();
        long j2 = this.D;
        boolean z = false;
        if (j2 > 0 && j2 + j < n) {
            z = true;
        }
        this.E = z;
        if (j >= n) {
            if (!this.b && !this.h) {
                if (j > 0) {
                    oumVar = new aevo(0L, j, this.H, false, null);
                } else {
                    oumVar = new oum(0L, 0L);
                }
                this.z = oumVar;
            }
            this.z = new oum(0L, TimeUnit.MILLISECONDS.toMicros(this.s) + j);
        } else if (z) {
            this.z = new oum(0L, j);
        }
        if (n() - this.C > 300000) {
            s();
        }
    }
}

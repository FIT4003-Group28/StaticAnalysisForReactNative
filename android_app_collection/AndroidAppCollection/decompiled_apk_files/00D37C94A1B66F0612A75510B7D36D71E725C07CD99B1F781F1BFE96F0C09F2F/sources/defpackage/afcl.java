package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afcl  reason: default package */
/* loaded from: classes.dex */
public class afcl implements pry, afbg {
    protected final afck[] a;
    private final ave b;
    private final boolean c;
    private final boolean d;
    private final int[] e;
    private final pvf f;
    private final int g;
    private final asv h;
    private final int i;
    private final PlayerConfigModel j;
    private final yrj k;
    private boolean l;
    private final afcj m;
    private final aexg[] n;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0090 A[LOOP:0: B:11:0x008e->B:12:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public afcl(defpackage.ave r16, com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel[] r17, defpackage.afjz r18, int[] r19, defpackage.pvf r20, int r21, defpackage.asv r22, int r23, defpackage.aflm r24, int r25, defpackage.aexg[] r26, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r27, defpackage.yrj r28) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afcl.<init>(ave, com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel[], afjz, int[], pvf, int, asv, int, aflm, int, aexg[], com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, yrj):void");
    }

    private final psd k(int i, long j, psb psbVar) {
        afck afckVar = this.a[i];
        if (afckVar.c == null) {
            return psd.b;
        }
        afckVar.g();
        long f = afckVar.f();
        long l = l(afckVar, psbVar, j, f);
        return l < 0 ? psd.b : new prq(afckVar, l, f);
    }

    private static final long l(afck afckVar, psb psbVar, long j, long j2) {
        if (psbVar != null) {
            long f = psbVar.f();
            if (f != -1) {
                return f;
            }
        }
        return pxi.j(afckVar.c(j), 0L, j2);
    }

    private static final void m() {
        System.currentTimeMillis();
    }

    @Override // defpackage.pry
    public final int a(long j, List list) {
        if (this.f.m() < 2) {
            return list.size();
        }
        return this.f.a(j, list);
    }

    @Override // defpackage.pry
    public final long b(long j, pkh pkhVar) {
        afck[] afckVarArr;
        for (afck afckVar : this.a) {
            if (afckVar.c != null) {
                long c = afckVar.c(j);
                long d = afckVar.d(c);
                return pkhVar.a(j, d, (d >= j || c >= afckVar.a() + (-1)) ? d : afckVar.d(c + 1));
            }
        }
        return j;
    }

    @Override // defpackage.pry
    public void c(long j, long j2, List list, prw prwVar) {
        afcl afclVar;
        long j3;
        int i;
        Format format;
        pru przVar;
        avf b;
        long j4 = j2 - j;
        m();
        psb psbVar = list.isEmpty() ? null : (psb) list.get(list.size() - 1);
        int m = this.f.m();
        psd[] psdVarArr = new psd[m];
        for (int i2 = 0; i2 < m; i2++) {
            psdVarArr[i2] = k(i2, j2, psbVar);
        }
        psb psbVar2 = psbVar;
        this.f.i(j, j4, -9223372036854775807L, list, psdVarArr);
        afck afckVar = this.a[this.f.b()];
        prt prtVar = afckVar.e;
        if (prtVar != null) {
            avg avgVar = afckVar.a;
            avf avfVar = prtVar.b == null ? avgVar.d : null;
            avf avfVar2 = afckVar.c == null ? avgVar.g : null;
            if (avfVar != null || avfVar2 != null) {
                prwVar.a = j(afckVar, this.h, this.f.o(), this.f.c(), this.f.d(), avfVar, avfVar2, j);
                return;
            }
        }
        if (afckVar.a() == 0) {
            boolean z = this.b.b;
            prwVar.b = true;
            return;
        }
        afckVar.g();
        long f = afckVar.f();
        long l = l(afckVar, psbVar2, j2, f);
        if (l <= f && (!this.l || l < f)) {
            long j5 = afckVar.d;
            if (j5 == -9223372036854775807L || afckVar.d(l) < j5) {
                int min = (int) Math.min(this.i, (f - l) + 1);
                if (j5 != -9223372036854775807L) {
                    while (min > 1 && afckVar.d((min + l) - 1) >= j5) {
                        min--;
                    }
                }
                if (true != list.isEmpty()) {
                    j3 = -9223372036854775807L;
                    afclVar = this;
                } else {
                    afclVar = this;
                    j3 = j2;
                }
                asv asvVar = afclVar.h;
                int i3 = afclVar.g;
                Format o = afclVar.f.o();
                int c = afclVar.f.c();
                Object d = afclVar.f.d();
                avg avgVar2 = afckVar.a;
                long d2 = afckVar.d(l);
                avf e = afckVar.e(l);
                String str = ((avd) avgVar2.b.get(0)).a;
                if (afckVar.e != null) {
                    int i4 = 1;
                    int i5 = 1;
                    while (true) {
                        i = i3;
                        format = o;
                        if (i4 >= min || (b = e.b(afckVar.e(i4 + l), str)) == null) {
                            break;
                        }
                        i5++;
                        i4++;
                        o = format;
                        e = b;
                        i3 = i;
                    }
                    long b2 = afckVar.b((i5 + l) - 1);
                    long j6 = afckVar.d;
                    long j7 = (j6 == -9223372036854775807L || j6 > b2) ? -9223372036854775807L : j6;
                    aalz b3 = aalz.b(e.a(str));
                    b3.e(afmg.e(afckVar.b, afclVar.j, c, afclVar.k.a()));
                    Uri a = b3.a();
                    asx asxVar = new asx();
                    asxVar.a = a;
                    asxVar.f = e.a;
                    asxVar.g = e.b;
                    asxVar.h = avgVar2.f;
                    aejy a2 = aejz.a();
                    a2.i(afclVar.n);
                    a2.h(TimeUnit.MICROSECONDS.toMillis(j));
                    a2.g(d2 / 1000);
                    a2.f((b2 - d2) / 1000);
                    a2.e(afckVar.b.f);
                    asxVar.j = a2.a();
                    asy a3 = asxVar.a();
                    long j8 = -avgVar2.c;
                    if (afclVar.d) {
                        przVar = new afcg(asvVar, a3, format, c, d, d2, b2, j3, j7, l, i5, j8, afckVar.e, afclVar.m, i);
                    } else {
                        przVar = new prz(asvVar, a3, format, c, d, d2, b2, j3, j7, l, i5, j8, afckVar.e);
                    }
                } else {
                    long b4 = afckVar.b(l);
                    aalz b5 = aalz.b(e.a(str));
                    b5.e(afmg.e(afckVar.b, afclVar.j, c, afclVar.k.a()));
                    Uri a4 = b5.a();
                    asx asxVar2 = new asx();
                    asxVar2.a = a4;
                    asxVar2.f = e.a;
                    asxVar2.g = e.b;
                    asxVar2.h = avgVar2.f;
                    aejy a5 = aejz.a();
                    a5.i(afclVar.n);
                    a5.h(TimeUnit.MICROSECONDS.toMillis(j));
                    a5.g(d2 / 1000);
                    a5.f((b4 - d2) / 1000);
                    a5.e(afckVar.b.f);
                    asxVar2.j = a5.a();
                    przVar = new pse(asvVar, asxVar2.a(), o, c, d, d2, b4, l, i3, o);
                }
                prwVar.a = przVar;
                return;
            }
            prwVar.b = true;
            return;
        }
        boolean z2 = this.b.b;
        prwVar.b = true;
    }

    @Override // defpackage.pry
    public final void d() {
    }

    @Override // defpackage.pry
    public final void e(pru pruVar) {
        int l;
        ayy d;
        if (pruVar instanceof afce) {
            l = this.f.l(((afce) pruVar).h);
        } else {
            l = pruVar instanceof psa ? this.f.l(((psa) pruVar).h) : -1;
        }
        if (l >= 0) {
            afck afckVar = this.a[l];
            if (afckVar.c != null || (d = afckVar.e.d()) == null) {
                return;
            }
            this.a[l] = new afck(afckVar.d, afckVar.a, afckVar.b, afckVar.e, new avc(d, afckVar.a.c));
        }
    }

    @Override // defpackage.pry
    public final void f() {
        for (afck afckVar : this.a) {
            prt prtVar = afckVar.e;
            if (prtVar != null) {
                prtVar.f();
            }
        }
    }

    @Override // defpackage.pry
    public final boolean g(pru pruVar, boolean z, axr axrVar, axs axsVar) {
        if (!z) {
            return false;
        }
        boolean z2 = this.b.b;
        if (pruVar instanceof psb) {
            IOException iOException = axrVar.b;
            if ((iOException instanceof atg) && ((atg) iOException).d == 404) {
                afck afckVar = this.a[this.f.l(pruVar.h)];
                long a = afckVar.a();
                if (a != 0) {
                    afckVar.h();
                    if (((psb) pruVar).f() > a - 1) {
                        this.l = true;
                        return true;
                    }
                }
            }
        }
        axq b = axsVar.b(afbx.d(this.f), axrVar);
        if (b != null) {
            pvf pvfVar = this.f;
            if (pvfVar.q(pvfVar.l(pruVar.h), b.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pry
    public final void h() {
        this.f.s();
    }

    @Override // defpackage.afbg
    public final psd i(pvj pvjVar, int i, long j, psb psbVar) {
        if (pvjVar != this.f) {
            return psd.b;
        }
        m();
        return k(i, j, psbVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public pru j(afck afckVar, asv asvVar, Format format, int i, Object obj, avf avfVar, avf avfVar2, long j) {
        avf avfVar3;
        String str = ((avd) afckVar.a.b.get(0)).a;
        if (avfVar != null) {
            avfVar3 = avfVar.b(avfVar2, str);
            if (avfVar3 == null) {
                avfVar3 = avfVar;
            }
        } else {
            avfVar3 = avfVar2;
        }
        aalz b = aalz.b(avfVar3.a(str));
        b.e(afmg.e(afckVar.b, this.j, i, this.k.a()));
        Uri a = b.a();
        asx asxVar = new asx();
        asxVar.a = a;
        asxVar.f = avfVar3.a;
        asxVar.g = avfVar3.b;
        asxVar.h = afckVar.a.f;
        aejy a2 = aejz.a();
        a2.i(this.n);
        a2.h(TimeUnit.MICROSECONDS.toMillis(j));
        a2.e(afckVar.b.f);
        asxVar.j = a2.a();
        asy a3 = asxVar.a();
        if (this.c) {
            return new afce(asvVar, a3, format, i, obj, afckVar.e);
        }
        return new psa(asvVar, a3, format, i, obj, afckVar.e);
    }
}

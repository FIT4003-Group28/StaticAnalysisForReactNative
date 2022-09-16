package defpackage;

import android.app.Activity;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahbb  reason: default package */
/* loaded from: classes.dex */
public class ahbb implements ahce {
    public final yzj a;
    public final yrj b;
    public final yzv c;
    public final agvw d;
    public final ahdf e;
    private final Activity f;
    private final afvn g;
    private final afwc h;
    private final agvq i;
    private final ahcz j;
    private final ahcf k;
    private final ahcd l;
    private final aghg m;
    private final agrf n;

    public ahbb(Activity activity, afvn afvnVar, agrf agrfVar, afwc afwcVar, yzj yzjVar, yrj yrjVar, agvq agvqVar, ahcz ahczVar, ahcf ahcfVar, ahcd ahcdVar, yzv yzvVar, agvw agvwVar, aghg aghgVar, ahdf ahdfVar) {
        this.f = activity;
        this.g = afvnVar;
        this.n = agrfVar;
        this.h = afwcVar;
        this.a = yzjVar;
        this.b = yrjVar;
        this.i = agvqVar;
        this.j = ahczVar;
        this.k = ahcfVar;
        this.l = ahcdVar;
        this.c = yzvVar;
        this.d = agvwVar;
        this.m = aghgVar;
        this.e = ahdfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(final String str, final attp attpVar, final acti actiVar, atpy atpyVar) {
        byte[] bArr;
        atpx atpxVar;
        if ((attpVar.b & 128) != 0) {
            bArr = attpVar.i.I();
        } else {
            bArr = aadi.b;
        }
        final byte[] bArr2 = bArr;
        if (this.i.m(attpVar, atpyVar)) {
            this.k.d(attpVar, actiVar, new ahdc() { // from class: ahav
                @Override // defpackage.ahdc
                public final void a(attl attlVar, atpx atpxVar2) {
                    ahbb ahbbVar = ahbb.this;
                    attp attpVar2 = attpVar;
                    acti actiVar2 = actiVar;
                    String str2 = str;
                    byte[] bArr3 = bArr2;
                    ahdq.f(attpVar2, actiVar2, null, str2, attlVar, false, agqn.OFFLINE_IMMEDIATELY, atpxVar2);
                    ahbbVar.k(str2, attlVar, agqn.OFFLINE_IMMEDIATELY, bArr3);
                }
            }, str);
            return;
        }
        attl u = this.i.u();
        agqn agqnVar = agqn.OFFLINE_IMMEDIATELY;
        if (atpyVar == null || (atpyVar.b & 2) == 0) {
            atpxVar = null;
        } else {
            atpx b = atpx.b(atpyVar.d);
            if (b == null) {
                b = atpx.DOWNLOAD_QUALITY_SETTINGS_ACTION_UNKNOWN;
            }
            atpxVar = b;
        }
        ahdq.f(attpVar, actiVar, null, str, u, true, agqnVar, atpxVar);
        k(str, u, agqn.OFFLINE_IMMEDIATELY, bArr2);
    }

    public void c(int i) {
        zag.q(this.f, i, 1);
    }

    public final agvv d() {
        return e().i();
    }

    public final agvx e() {
        return this.n.a();
    }

    @Override // defpackage.ahce
    public final void g(String str) {
        this.k.s(new ahay(this, str));
    }

    public final void h(String str) {
        this.e.p();
        d().w(str);
    }

    @Override // defpackage.ahce
    public final void i(final String str, final String str2) {
        zgh.m(str2);
        zgh.m(str);
        agqv e = e().m().e(str2);
        if (e == null || (e.u() && e.y())) {
            this.j.m(new ahdb() { // from class: ahau
                @Override // defpackage.ahdb
                public final void a() {
                    ahbb ahbbVar = ahbb.this;
                    String str3 = str;
                    String str4 = str2;
                    if (!ahbbVar.b.o()) {
                        ahbbVar.c.b();
                        return;
                    }
                    int b = ahbbVar.e().i().b(str3, str4);
                    agqn agqnVar = agqn.OFFLINE_IMMEDIATELY;
                    ahbbVar.l(b);
                }
            });
        }
    }

    @Override // defpackage.ahce
    public final void j(String str, attp attpVar, acti actiVar, atpy atpyVar) {
        Object obj;
        zgh.m(str);
        if (!this.b.o()) {
            this.c.b();
        } else if (d().d(str) != null) {
            l(1);
        } else if (attpVar == null) {
            l(2);
        } else if (!attpVar.c) {
            atto attoVar = attpVar.d;
            if (attoVar == null) {
                attoVar = atto.a;
            }
            if ((attoVar.b & 2) != 0) {
                atto attoVar2 = attpVar.d;
                if (attoVar2 == null) {
                    attoVar2 = atto.a;
                }
                obj = attoVar2.d;
                if (obj == null) {
                    obj = avvh.a;
                }
            } else {
                atto attoVar3 = attpVar.d;
                if (attoVar3 == null) {
                    attoVar3 = atto.a;
                }
                if ((attoVar3.b & 1) != 0) {
                    atto attoVar4 = attpVar.d;
                    if (attoVar4 == null) {
                        attoVar4 = atto.a;
                    }
                    obj = attoVar4.c;
                    if (obj == null) {
                        obj = aqmu.a;
                    }
                } else {
                    obj = null;
                }
            }
            this.l.a(obj, actiVar, null, null);
        } else if (!this.g.t()) {
            this.h.c(this.f, null, new ahaw(this, str, attpVar, actiVar, atpyVar));
        } else {
            b(str, attpVar, actiVar, atpyVar);
        }
    }

    public final void k(String str, attl attlVar, agqn agqnVar, byte[] bArr) {
        this.k.h(new ahax(this, str, attlVar, agqnVar, bArr));
    }

    @Override // defpackage.ahce
    public void a(String str, ahbt ahbtVar) {
        if (!ahbtVar.a) {
            zgh.m(str);
            if (d().d(str) == null) {
                return;
            }
            h(str);
            return;
        }
        zgh.m(str);
        agqg d = d().d(str);
        if (d == null) {
            return;
        }
        ahba ahbaVar = new ahba(this, str);
        if (d.e()) {
            this.k.i(ahbaVar, ahbtVar);
        } else {
            this.k.p(ahbaVar, ahbtVar);
        }
    }

    @Override // defpackage.ahce
    public final void f(String str, ahbt ahbtVar) {
        if (!ahbtVar.a) {
            zgh.m(str);
            d().o(str);
            c(R.string.sync_playlist_start);
            return;
        }
        zgh.m(str);
        this.k.r(new ahaz(this, str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (r3.b.r() == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r4) {
        /*
            r3 = this;
            r0 = 2132017434(0x7f14011a, float:1.9673146E38)
            r1 = 2132017438(0x7f14011e, float:1.9673154E38)
            if (r4 == 0) goto L13
            r0 = 1
            if (r4 == r0) goto Lf
            r0 = 2132017433(0x7f140119, float:1.9673144E38)
            goto L58
        Lf:
            r0 = 2132018868(0x7f1406b4, float:1.9676055E38)
            goto L58
        L13:
            agvq r4 = r3.i
            awuy r4 = r4.w()
            awuy r2 = defpackage.awuy.UNMETERED_WIFI_OR_UNMETERED_MOBILE
            if (r4 != r2) goto L49
            yrj r2 = r3.b
            boolean r2 = r2.r()
            if (r2 != 0) goto L49
            ahdf r2 = r3.e
            boolean r2 = r2.c()
            if (r2 == 0) goto L35
            yrj r2 = r3.b
            boolean r2 = r2.q()
            if (r2 != 0) goto L49
        L35:
            ahdf r4 = r3.e
            boolean r4 = r4.c()
            if (r4 == 0) goto L55
            aghg r4 = r3.m
            boolean r4 = r4.a()
            if (r4 == 0) goto L55
            r0 = 2132017439(0x7f14011f, float:1.9673156E38)
            goto L58
        L49:
            awuy r2 = defpackage.awuy.UNMETERED_WIFI
            if (r4 != r2) goto L58
            yrj r4 = r3.b
            boolean r4 = r4.r()
            if (r4 != 0) goto L58
        L55:
            r0 = 2132017438(0x7f14011e, float:1.9673154E38)
        L58:
            r3.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahbb.l(int):void");
    }
}

package defpackage;

import android.app.Activity;
import j$.util.Optional;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: jpo  reason: default package */
/* loaded from: classes3.dex */
public final class jpo extends ahbm {
    public final jpv a;
    private final yrj j;
    private final jnn k;
    private final ahcz l;
    private final jpu m;
    private final Integer n;
    private final fcl o;
    private final ahdf p;
    private final axxa q;

    public jpo(Activity activity, afvn afvnVar, agrf agrfVar, aguv aguvVar, afwc afwcVar, yzj yzjVar, yrj yrjVar, jnn jnnVar, ahcz ahczVar, ahcd ahcdVar, yzv yzvVar, jpu jpuVar, jpv jpvVar, agsd agsdVar, Integer num, aghg aghgVar, fcl fclVar, ahdf ahdfVar, agnd agndVar, Executor executor, axxa axxaVar) {
        super(activity, afvnVar, agrfVar, aguvVar, afwcVar, yzjVar, yrjVar, jnnVar, ahczVar, ahcdVar, yzvVar, agsdVar, aghgVar, ahdfVar, agndVar, executor);
        this.j = yrjVar;
        this.k = jnnVar;
        this.l = ahczVar;
        this.m = jpuVar;
        this.a = jpvVar;
        this.n = num;
        this.o = fclVar;
        this.p = ahdfVar;
        this.q = axxaVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahbm
    public final int a() {
        return this.n.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahbm
    public final atrc b(String str, attl attlVar, String str2, byte[] bArr) {
        awkx b;
        aopa createBuilder = awjo.a.createBuilder();
        createBuilder.copyOnWrite();
        awjo awjoVar = (awjo) createBuilder.instance;
        awjoVar.e = attlVar.k;
        awjoVar.c |= 2;
        aoob x = aoob.x(bArr);
        createBuilder.copyOnWrite();
        awjo awjoVar2 = (awjo) createBuilder.instance;
        awjoVar2.c |= 1;
        awjoVar2.d = x;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            awjo awjoVar3 = (awjo) createBuilder.instance;
            awjoVar3.c |= 32;
            awjoVar3.h = str2;
        }
        fcl fclVar = this.o;
        String v = emn.v(str);
        asyq asyqVar = !fclVar.g(v) ? null : (asyq) fclVar.c.a(fclVar.b.c()).f(v).g(asyq.class).W();
        if (asyqVar != null && (b = asyqVar.b()) != null) {
            awky awkyVar = b.c;
            createBuilder.copyOnWrite();
            awjo awjoVar4 = (awjo) createBuilder.instance;
            awkyVar.getClass();
            awjoVar4.f = awkyVar;
            awjoVar4.c |= 8;
            awji b2 = b.b();
            if (b2 != null) {
                awjj awjjVar = b2.b;
                createBuilder.copyOnWrite();
                awjo awjoVar5 = (awjo) createBuilder.instance;
                awjjVar.getClass();
                awjoVar5.g = awjjVar;
                awjoVar5.c |= 16;
            }
        }
        aopc aopcVar = (aopc) atrc.b.createBuilder();
        aopcVar.e(awjo.b, (awjo) createBuilder.mo39build());
        return (atrc) aopcVar.mo39build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahbm
    public final void c(final String str, final attp attpVar, final ahcx ahcxVar, final acti actiVar, atpy atpyVar, final int i) {
        byte[] bArr;
        attl u;
        atpx atpxVar;
        attl attlVar;
        if ((attpVar.b & 128) != 0) {
            bArr = attpVar.i.I();
        } else {
            bArr = aadi.b;
        }
        final byte[] bArr2 = bArr;
        this.k.k(atpyVar);
        if (this.k.m(attpVar, atpyVar)) {
            this.l.g(str, attpVar, actiVar, new ahdc() { // from class: jpm
                @Override // defpackage.ahdc
                public final void a(attl attlVar2, atpx atpxVar2) {
                    jpo jpoVar = jpo.this;
                    attp attpVar2 = attpVar;
                    acti actiVar2 = actiVar;
                    String str2 = str;
                    byte[] bArr3 = bArr2;
                    ahcx ahcxVar2 = ahcxVar;
                    int i2 = i;
                    ahdq.f(attpVar2, actiVar2, str2, null, attlVar2, false, agqn.OFFLINE_IMMEDIATELY, atpxVar2);
                    jpoVar.j(str2, attlVar2, null, agqn.OFFLINE_IMMEDIATELY, bArr3, ahcxVar2, i2);
                }
            });
            return;
        }
        if (this.q.b().booleanValue()) {
            attl attlVar2 = (attl) Optional.ofNullable(atpyVar).filter(gka.p).map(ioc.u).orElse(this.k.v(attl.UNKNOWN_FORMAT_TYPE));
            pku.m(Optional.ofNullable(atpyVar), attlVar2, attpVar, actiVar, Optional.of(str), Optional.empty());
            attlVar = attlVar2;
        } else {
            if (atpyVar == null || (atpyVar.b & 1) == 0) {
                u = this.k.u();
            } else {
                u = attl.b(atpyVar.c);
                if (u == null) {
                    u = attl.UNKNOWN_FORMAT_TYPE;
                }
            }
            attl attlVar3 = u;
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
            ahdq.f(attpVar, actiVar, str, null, attlVar3, true, agqnVar, atpxVar);
            attlVar = attlVar3;
        }
        j(str, attlVar, atpyVar != null ? atpyVar.e : null, agqn.OFFLINE_IMMEDIATELY, bArr2, ahcxVar, i);
    }

    @Override // defpackage.ahbm, defpackage.ahcy
    public final void d(String str, boolean z) {
        if (!z) {
            this.m.c(str);
        } else {
            super.d(str, true);
        }
    }

    @Override // defpackage.ahbm, defpackage.ahcy
    public final void e(String str, boolean z) {
        if (!z) {
            this.m.c(aakj.g(str));
        } else {
            super.e(str, true);
        }
    }

    @Override // defpackage.ahbm, defpackage.ahcy
    public final void f(agqu agquVar, boolean z) {
        if (z) {
            this.a.a(ampq.i(agquVar.c()), Long.valueOf(agquVar.a()), new jpn(this, 1));
            return;
        }
        m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r4.j.q() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r4.j.r() == false) goto L11;
     */
    @Override // defpackage.ahbm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void g(int r5) {
        /*
            r4 = this;
            ahdf r0 = r4.p
            boolean r0 = r0.c()
            if (r0 == 0) goto L27
            jnn r0 = r4.k
            awuy r0 = r0.w()
            yrj r1 = r4.j
            boolean r1 = r1.r()
            if (r1 != 0) goto L5d
            awuy r1 = defpackage.awuy.UNMETERED_WIFI
            if (r0 == r1) goto L37
            awuy r1 = defpackage.awuy.UNMETERED_WIFI_OR_UNMETERED_MOBILE
            if (r0 != r1) goto L5d
            yrj r0 = r4.j
            boolean r0 = r0.q()
            if (r0 != 0) goto L5d
            goto L37
        L27:
            jnn r0 = r4.k
            boolean r0 = r0.l()
            if (r0 == 0) goto L5d
            yrj r0 = r4.j
            boolean r0 = r0.r()
            if (r0 != 0) goto L5d
        L37:
            jpu r0 = r4.m
            akfg r1 = r0.b
            android.view.View$OnClickListener r2 = r0.f
            akfh r5 = r0.a(r5)
            dt r0 = r0.a
            android.content.Context r0 = r0.getApplicationContext()
            r3 = 2132017627(0x7f1401db, float:1.9673538E38)
            java.lang.String r0 = r0.getString(r3)
            r5.m(r0, r2)
            r0 = 0
            r5.j(r0)
            akfi r5 = r5.b()
            r1.n(r5)
            return
        L5d:
            jpu r0 = r4.m
            r0.e(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpo.g(int):void");
    }

    @Override // defpackage.ahbm
    public final void h(String str, Object obj, acti actiVar) {
        if (!(obj instanceof aqmu)) {
            r(str, obj, actiVar);
            return;
        }
        jpu jpuVar = this.m;
        jpuVar.b.n(jpuVar.b(((aqmu) obj).e).b());
    }

    @Override // defpackage.ahbm
    protected final boolean i(String str, agqv agqvVar) {
        return (agqvVar != null && agqvVar.s()) || this.o.g(emn.v(str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahbm
    public final void j(String str, attl attlVar, String str2, agqn agqnVar, byte[] bArr, ahcx ahcxVar, int i) {
        if (!this.o.g(emn.v(str)) || this.p.m()) {
            super.j(str, attlVar, str2, agqnVar, bArr, ahcxVar, i);
        } else {
            y(str, attlVar, str2, bArr, ahcxVar, i);
        }
    }
}

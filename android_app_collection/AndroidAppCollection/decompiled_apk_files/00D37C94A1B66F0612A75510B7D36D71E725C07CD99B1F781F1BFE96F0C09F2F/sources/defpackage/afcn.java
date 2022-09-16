package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afcn  reason: default package */
/* loaded from: classes.dex */
public final class afcn implements ppy, prj {
    public final VideoStreamingData a;
    public List b;
    private final String c;
    private final pnp d;
    private final pnj e;
    private final afci f;
    private final pqh g;
    private final amqo h;
    private final aflm i;
    private final long j;
    private final TrackGroupArray k;
    private final afbq l;
    private final afbk[] m;
    private final atk n;
    private ppx o;
    private prk p;
    private boolean q;
    private final axf u;
    private int s = 1;
    private int t = 1;
    private long r = 0;

    public afcn(axf axfVar, afbi afbiVar, pnp pnpVar, pnj pnjVar, afci afciVar, pqh pqhVar, aflm aflmVar, atk atkVar, afbq afbqVar) {
        this.u = axfVar;
        this.c = afbiVar.a;
        this.d = pnpVar;
        this.e = pnjVar;
        this.f = afciVar;
        this.g = pqhVar;
        this.h = new aexa(afbiVar, 5);
        VideoStreamingData b = afbiVar.b();
        this.a = b;
        this.i = aflmVar;
        this.j = phk.c(afbiVar.a().t());
        this.n = atkVar;
        this.l = afbqVar;
        this.b = amuk.q();
        this.p = pns.b(q());
        aflmVar.aC();
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (FormatStreamModel formatStreamModel : b.p) {
            if (!formatStreamModel.L()) {
                if (formatStreamModel.C()) {
                    arrayList3.add(formatStreamModel);
                } else if (formatStreamModel.P()) {
                    arrayList4.add(formatStreamModel);
                }
            }
        }
        int size = arrayList3.size();
        Format[] formatArr = new Format[size];
        int size2 = arrayList4.size();
        Format[] formatArr2 = new Format[size2];
        for (int i = 0; i < arrayList3.size(); i++) {
            formatArr[i] = ((FormatStreamModel) arrayList3.get(i)).m();
        }
        for (int i2 = 0; i2 < arrayList4.size(); i2++) {
            formatArr2[i2] = ((FormatStreamModel) arrayList4.get(i2)).m();
        }
        if (size > 0) {
            arrayList.add(n(formatArr));
            arrayList2.add(new afbk(1, (FormatStreamModel[]) arrayList3.toArray(new FormatStreamModel[0])));
        }
        if (size2 > 0) {
            arrayList.add(n(formatArr2));
            arrayList2.add(new afbk(2, (FormatStreamModel[]) arrayList4.toArray(new FormatStreamModel[0])));
        }
        this.i.aB();
        Pair pair = new Pair(new TrackGroupArray((TrackGroup[]) arrayList.toArray(new TrackGroup[0])), (afbk[]) arrayList2.toArray(new afbk[0]));
        this.k = (TrackGroupArray) pair.first;
        this.m = (afbk[]) pair.second;
    }

    private final TrackGroup n(Format[] formatArr) {
        int length = formatArr.length;
        Format[] formatArr2 = new Format[length];
        for (int i = 0; i < length; i++) {
            Format format = formatArr[i];
            formatArr2[i] = format.c(this.d.c(format));
        }
        return new TrackGroup(formatArr2);
    }

    private final prk[] q() {
        List list = this.b;
        return (prk[]) list.toArray(new prk[list.size()]);
    }

    @Override // defpackage.ppy
    public final long a(long j, pkh pkhVar) {
        for (prx prxVar : this.b) {
            if (prxVar.a == 2) {
                return prxVar.b.b(j, pkhVar);
            }
        }
        return j;
    }

    @Override // defpackage.prj
    public final /* bridge */ /* synthetic */ void b(prk prkVar) {
        c();
    }

    public final void c() {
        this.o.b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        if (r0 == 2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
        if (r0 == 2) goto L44;
     */
    @Override // defpackage.ppy, defpackage.prk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d() {
        /*
            r14 = this;
            int r0 = r14.s
            r1 = 3
            if (r0 != r1) goto L9
            int r0 = r14.t
            if (r0 == r1) goto L8c
        L9:
            java.util.List r0 = r14.b
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = r2
        L11:
            boolean r4 = r0.hasNext()
            r5 = 1
            if (r4 == 0) goto L27
            java.lang.Object r4 = r0.next()
            prx r4 = (defpackage.prx) r4
            int r6 = r4.a
            if (r6 == r5) goto L23
            r3 = r4
        L23:
            if (r6 != r5) goto L11
            r2 = r4
            goto L11
        L27:
            int r0 = r14.s
            r6 = 2
            r8 = 0
            r4 = 2
            if (r0 == r1) goto L5d
            if (r2 == 0) goto L37
            long r10 = r2.d()
            goto L38
        L37:
            r10 = r8
        L38:
            long r12 = r14.r
            long r10 = r10 - r12
            int r0 = r14.s
            if (r0 != r5) goto L4e
            long r12 = r14.j
            long r12 = r12 / r6
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto L5d
            aflm r0 = r14.i
            r0.d()
            r14.s = r4
            goto L50
        L4e:
            if (r0 != r4) goto L5d
        L50:
            long r12 = r14.j
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto L5d
            aflm r0 = r14.i
            r0.c()
            r14.s = r1
        L5d:
            int r0 = r14.t
            if (r0 == r1) goto L8c
            if (r3 == 0) goto L67
            long r8 = r3.d()
        L67:
            long r2 = r14.r
            long r8 = r8 - r2
            int r0 = r14.t
            if (r0 != r5) goto L7d
            long r2 = r14.j
            long r2 = r2 / r6
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 < 0) goto L8c
            aflm r0 = r14.i
            r0.au()
            r14.t = r4
            goto L7f
        L7d:
            if (r0 != r4) goto L8c
        L7f:
            long r2 = r14.j
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 < 0) goto L8c
            aflm r0 = r14.i
            r0.at()
            r14.t = r1
        L8c:
            prk r0 = r14.p
            long r0 = r0.d()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afcn.d():long");
    }

    @Override // defpackage.ppy, defpackage.prk
    public final long e() {
        return this.p.e();
    }

    @Override // defpackage.ppy
    public final long f() {
        return -9223372036854775807L;
    }

    @Override // defpackage.ppy
    public final long g(long j) {
        this.r = j;
        for (prx prxVar : this.b) {
            prxVar.g(j);
        }
        return j;
    }

    @Override // defpackage.ppy
    public final long h(pvf[] pvfVarArr, boolean[] zArr, pri[] priVarArr, boolean[] zArr2, long j) {
        int i;
        pvf pvfVar;
        this.i.aI();
        this.r = j;
        int i2 = 0;
        while (i2 < pvfVarArr.length) {
            if (pvfVarArr[i2] == null || !zArr[i2]) {
                pri priVar = priVarArr[i2];
                if (priVar instanceof prx) {
                    ((prx) priVar).i();
                }
                priVarArr[i2] = null;
            }
            if (priVarArr[i2] != null || (pvfVar = pvfVarArr[i2]) == null) {
                i = i2;
            } else {
                afbk afbkVar = this.m[this.k.a(pvfVar.p())];
                zArr2[i2] = true;
                this.i.aE();
                ave f = this.a.f(this.c);
                this.i.aD();
                i = i2;
                priVarArr[i] = new prx(afbkVar.a, this.f.d(f, afbkVar.b, aggw.p(f, afbkVar), pvfVarArr[i2], afbkVar.a, this.n, (PlayerConfigModel) this.h.get()), this, this.u, j, this.d, this.e, this.l.a(this.h, new amqo() { // from class: afcm
                    @Override // defpackage.amqo
                    public final Object get() {
                        return afcn.this.a;
                    }
                }), this.g);
            }
            i2 = i + 1;
        }
        this.b = new ArrayList();
        for (pri priVar2 : priVarArr) {
            if (priVar2 instanceof prx) {
                this.b.add((prx) priVar2);
            }
        }
        this.p = pns.b(q());
        this.i.aH();
        return j;
    }

    @Override // defpackage.ppy
    public final TrackGroupArray i() {
        return this.k;
    }

    @Override // defpackage.ppy
    public final void j(long j, boolean z) {
        if (!this.q) {
            this.i.aG();
        }
        for (prx prxVar : this.b) {
            prxVar.f(j, z);
        }
        if (!this.q) {
            this.i.aF();
        }
        this.q = true;
    }

    @Override // defpackage.ppy
    public final void k() {
    }

    @Override // defpackage.ppy
    public final synchronized void l(ppx ppxVar, long j) {
        this.o = ppxVar;
        ppxVar.c(this);
    }

    @Override // defpackage.ppy, defpackage.prk
    public final void m(long j) {
        this.p.m(j);
    }

    @Override // defpackage.ppy, defpackage.prk
    public final boolean o(long j) {
        return this.p.o(j);
    }

    @Override // defpackage.ppy, defpackage.prk
    public final boolean p() {
        return this.p.p();
    }
}

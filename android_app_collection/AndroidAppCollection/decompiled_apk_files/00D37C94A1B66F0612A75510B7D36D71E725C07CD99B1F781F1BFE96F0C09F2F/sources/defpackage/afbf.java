package defpackage;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: afbf  reason: default package */
/* loaded from: classes.dex */
public final class afbf extends ppa implements ppy {
    public final afal d;
    public final afbd e;
    public volatile long f;
    private final Handler i;
    private volatile ppx l;
    private final Map j = new EnumMap(orl.class);
    public volatile pkt g = null;
    private boolean m = false;
    private volatile pjc k = pjc.a(Uri.EMPTY);
    public afae h = afae.a;

    public afbf(afbd afbdVar, afal afalVar, Handler handler, long j) {
        this.e = afbdVar;
        this.d = afalVar;
        this.i = handler;
        this.f = j;
    }

    private final void x() {
        if (this.m || this.l == null || this.h == null) {
            return;
        }
        this.l.c(this);
        this.m = true;
    }

    @Override // defpackage.ppy
    public final long a(long j, pkh pkhVar) {
        return j;
    }

    @Override // defpackage.ppy, defpackage.prk
    public final synchronized long d() {
        afae afaeVar = this.h;
        if (afaeVar == null) {
            return 0L;
        }
        return this.d.a(afaeVar.d);
    }

    @Override // defpackage.ppy, defpackage.prk
    public final long e() {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.ppy
    public final long f() {
        return -9223372036854775807L;
    }

    @Override // defpackage.ppy
    public final synchronized long g(long j) {
        this.f = j;
        afbd afbdVar = this.e;
        afan afanVar = ((afao) afbdVar).e;
        synchronized (((afau) afanVar).d) {
            ((afau) afanVar).k(((afao) afbdVar).c);
            try {
                afhl afhlVar = ((afau) afanVar).e;
                long j2 = ((afao) afbdVar).c.f;
                afms.d(afhlVar.e == 3);
                try {
                    afhn afhnVar = afhlVar.d;
                    aopa createBuilder = adze.a.createBuilder();
                    double a = afag.a(j2);
                    createBuilder.copyOnWrite();
                    adze adzeVar = (adze) createBuilder.instance;
                    adzeVar.b = 1 | adzeVar.b;
                    adzeVar.c = a;
                    try {
                        adzf adzfVar = (adzf) aopi.parseFrom(adzf.a, afhnVar.a.a("seekTo", ((adze) createBuilder.mo39build()).toByteArray()), aoos.b());
                    } catch (aopx e) {
                        throw new RuntimeException("Unexpected protobuf error", e);
                    }
                } catch (RuntimeException e2) {
                    throw new afgy(5, "Unexpected error calling into JS.", e2);
                }
            } catch (afgy e3) {
                ((afau) afanVar).g(e3, ((afao) afbdVar).c);
            }
        }
        return j;
    }

    @Override // defpackage.ppy
    public final synchronized long h(pvf[] pvfVarArr, boolean[] zArr, pri[] priVarArr, boolean[] zArr2, long j) {
        orl d;
        for (int i = 0; i < pvfVarArr.length; i++) {
            pvf pvfVar = pvfVarArr[i];
            if (pvfVar == null || !zArr[i]) {
                priVarArr[i] = null;
            }
            if (priVarArr[i] == null && pvfVar != null && (d = afag.d(i)) != null) {
                afbe afbeVar = new afbe(this, d, pvfVar);
                this.j.put(d, afbeVar);
                priVarArr[i] = afbeVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // defpackage.ppy
    public final synchronized TrackGroupArray i() {
        ArrayList arrayList;
        afae afaeVar = this.h;
        afms.a(afaeVar);
        arrayList = new ArrayList();
        afad afadVar = afaeVar.b;
        if (afadVar != null) {
            arrayList.add(afadVar.e());
        }
        afad afadVar2 = afaeVar.c;
        if (afadVar2 != null) {
            arrayList.add(afadVar2.e());
        }
        return new TrackGroupArray((TrackGroup[]) arrayList.toArray(new TrackGroup[0]));
    }

    @Override // defpackage.ppy
    public final synchronized void j(long j, boolean z) {
        this.f = j;
        afal afalVar = this.d;
        afalVar.a.d(j);
        afalVar.b.d(j);
    }

    @Override // defpackage.ppy
    public final void k() {
    }

    @Override // defpackage.ppy
    public final synchronized void l(ppx ppxVar, long j) {
        this.m = false;
        this.l = ppxVar;
        x();
    }

    @Override // defpackage.ppy, defpackage.prk
    public final void m(long j) {
    }

    @Override // defpackage.ppy, defpackage.prk
    public final boolean o(long j) {
        return false;
    }

    @Override // defpackage.ppy, defpackage.prk
    public final synchronized boolean p() {
        boolean z;
        afae afaeVar = this.h;
        if (afaeVar != null) {
            if (this.d.a(afaeVar.d) == Long.MIN_VALUE) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    @Override // defpackage.pqb
    public final pjc r() {
        return this.k;
    }

    @Override // defpackage.ppa
    protected final void rA() {
    }

    @Override // defpackage.ppa
    protected final void rz(atk atkVar) {
        if (this.g != null) {
            rF(this.g);
        }
    }

    @Override // defpackage.pqb
    public final void s() {
    }

    public final synchronized void t(afae afaeVar) {
        if (afaeVar != this.h) {
            amuk amukVar = afag.a;
            int i = ((amxx) amukVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                orl orlVar = (orl) amukVar.get(i2);
                afbe afbeVar = (afbe) this.j.get(orlVar);
                if (afbeVar != null) {
                    afbeVar.a = afaeVar.a(orlVar);
                }
            }
            this.h = afaeVar;
            x();
        }
    }

    @Override // defpackage.pqb
    public final void u(ppy ppyVar) {
    }

    @Override // defpackage.pqb
    public final ppy v(ppz ppzVar, axf axfVar, long j) {
        return this;
    }

    public final synchronized void w(long j, afbi afbiVar) {
        pix pixVar = new pix(this.k);
        afms.a(afbiVar);
        pixVar.b = afbiVar;
        this.k = pixVar.a();
        this.g = new prm(j, true, false, this.k);
        this.i.post(new Runnable() { // from class: afbc
            @Override // java.lang.Runnable
            public final void run() {
                afbf afbfVar = afbf.this;
                pkt pktVar = afbfVar.g;
                afms.a(pktVar);
                afbfVar.rF(pktVar);
            }
        });
        x();
    }
}

package defpackage;

import android.content.res.Resources;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ambz  reason: default package */
/* loaded from: classes.dex */
public final class ambz {
    public final Map<akrw, amco> a;
    public final alzy b;
    public final btmv c;
    private final Map<akrw, Object> d;
    private final AtomicInteger e;
    private final Map<akry, dxio<akpg>> f;
    private final akrz g;
    private final amcf h;
    private final Resources i;
    private final dxio<btzo<dmxh, dmxv>> j;
    private final dxio<bttf> k;
    private final ckcw l;
    private final dzsj<akwu> m;
    private final Runnable n;
    private final cqat o;
    private final dehq p;
    private final dehq q;
    private final dbty<Boolean> r;
    private final dbty<Integer> s;
    private final dkiy t;
    private final duxu u;
    private final dwwr v;
    private final btwd w;
    private final dkks x;
    private final aluh y;

    static {
        new TreeMap();
    }

    public ambz(Resources resources, akrz akrzVar, amcf amcfVar, Map map, dxio dxioVar, btmv btmvVar, ckcw ckcwVar, dzsj dzsjVar, Runnable runnable, cqat cqatVar, dehq dehqVar, dehq dehqVar2, dbty dbtyVar, dbty dbtyVar2, dxio dxioVar2, aluh aluhVar, dkiy dkiyVar, duxu duxuVar, dwwr dwwrVar, btwd btwdVar, dkks dkksVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(akry.values().length);
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(akry.values().length);
        this.e = new AtomicInteger(0);
        this.b = new alzy();
        this.i = resources;
        this.g = akrzVar;
        this.h = amcfVar;
        this.j = dxioVar;
        this.c = btmvVar;
        this.l = ckcwVar;
        this.m = dzsjVar;
        this.n = runnable;
        this.o = cqatVar;
        this.p = dehqVar;
        this.q = dehqVar2;
        this.k = dxioVar2;
        this.y = aluhVar;
        this.t = dkiyVar;
        this.u = duxuVar;
        this.v = dwwrVar;
        this.r = dbtyVar;
        this.s = dbtyVar2;
        this.a = concurrentHashMap;
        this.d = concurrentHashMap2;
        this.w = btwdVar;
        this.x = dkksVar;
        for (akry akryVar : akry.values()) {
            this.d.put(akrw.a(akryVar), new Object());
        }
        this.f = map;
    }

    private final void h(int i, akrw akrwVar) {
        synchronized (a(akrwVar)) {
            amco amcoVar = this.a.get(akrwVar);
            if (amcoVar instanceof amaw) {
                ((amaw) amcoVar).o = i;
            }
        }
    }

    private final amco i(akrw akrwVar, alyl alylVar, boolean z) {
        amco j;
        amco amcoVar = this.a.get(akrwVar);
        if (amcoVar != null) {
            if (!z || alylVar.equals(amcoVar.n())) {
                return amcoVar;
            }
            z = true;
        }
        synchronized (a(akrwVar)) {
            amco amcoVar2 = this.a.get(akrwVar);
            if (amcoVar2 != null && (!z || alylVar.equals(amcoVar2.n()))) {
                j = amcoVar2;
            }
            j = j(akrwVar, alylVar);
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03cc A[Catch: all -> 0x059c, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x059c, blocks: (B:49:0x02b9, B:52:0x02c8, B:54:0x02ce, B:60:0x0319, B:101:0x03cc, B:64:0x0327, B:68:0x0335, B:72:0x0343, B:76:0x0350, B:80:0x035d, B:82:0x0361, B:85:0x0366, B:87:0x036a, B:88:0x0373, B:90:0x0377, B:91:0x037d, B:93:0x0381, B:94:0x038a, B:96:0x038e, B:109:0x0417, B:111:0x044a, B:114:0x0455, B:116:0x045b, B:120:0x0481, B:122:0x0497, B:124:0x049b, B:127:0x04a7, B:129:0x04be, B:130:0x04c6, B:126:0x049f), top: B:177:0x0281 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04be A[Catch: all -> 0x059c, TryCatch #6 {all -> 0x059c, blocks: (B:49:0x02b9, B:52:0x02c8, B:54:0x02ce, B:60:0x0319, B:101:0x03cc, B:64:0x0327, B:68:0x0335, B:72:0x0343, B:76:0x0350, B:80:0x035d, B:82:0x0361, B:85:0x0366, B:87:0x036a, B:88:0x0373, B:90:0x0377, B:91:0x037d, B:93:0x0381, B:94:0x038a, B:96:0x038e, B:109:0x0417, B:111:0x044a, B:114:0x0455, B:116:0x045b, B:120:0x0481, B:122:0x0497, B:124:0x049b, B:127:0x04a7, B:129:0x04be, B:130:0x04c6, B:126:0x049f), top: B:177:0x0281 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0319 A[Catch: all -> 0x059c, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x059c, blocks: (B:49:0x02b9, B:52:0x02c8, B:54:0x02ce, B:60:0x0319, B:101:0x03cc, B:64:0x0327, B:68:0x0335, B:72:0x0343, B:76:0x0350, B:80:0x035d, B:82:0x0361, B:85:0x0366, B:87:0x036a, B:88:0x0373, B:90:0x0377, B:91:0x037d, B:93:0x0381, B:94:0x038a, B:96:0x038e, B:109:0x0417, B:111:0x044a, B:114:0x0455, B:116:0x045b, B:120:0x0481, B:122:0x0497, B:124:0x049b, B:127:0x04a7, B:129:0x04be, B:130:0x04c6, B:126:0x049f), top: B:177:0x0281 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0323 A[Catch: all -> 0x05b2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x05b2, blocks: (B:34:0x020b, B:36:0x0216, B:40:0x0269, B:42:0x0273, B:45:0x027d, B:47:0x0283, B:58:0x02f4, B:99:0x03a5, B:104:0x03d8, B:62:0x0323, B:66:0x0331, B:70:0x033f, B:74:0x034c, B:78:0x0359, B:98:0x039b, B:132:0x0513), top: B:168:0x0127 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.amco j(defpackage.akrw r38, defpackage.alyl r39) {
        /*
            Method dump skipped, instructions count: 1503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ambz.j(akrw, alyl):amco");
    }

    private final alzn k(akry akryVar, alyl alylVar, dcdc<alzp> dcdcVar) {
        alzb alzbVar;
        dmxp dmxpVar = this.m.a().e().b;
        if (dmxpVar == null) {
            dmxpVar = dmxp.c;
        }
        Iterator<dmxj> it = dmxpVar.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                alzbVar = null;
                break;
            }
            dmxj next = it.next();
            if ((next.a & 4) != 0) {
                dmxl dmxlVar = akryVar.H;
                dmxl b = dmxl.b(next.b);
                if (b == null) {
                    b = dmxl.UNKNOWN;
                }
                if (dmxlVar == b) {
                    alzbVar = new alzb(next.d);
                    break;
                }
            }
        }
        if (alzbVar == null) {
            alzbVar = alzb.a();
        }
        return new alzn(this.p, this.j.a(), new alzj(alzbVar, new alzq(this.m, alylVar), dcdcVar, this.k), btys.f, this.l);
    }

    private static amcl l(akry akryVar, btmv btmvVar, dbty<Integer> dbtyVar, boolean z, btwd btwdVar) {
        int h;
        dvek dvekVar = btwdVar.a;
        if (dvekVar.aO) {
            h = dvekVar.aN;
        } else {
            h = (!z || !akry.BASE.equals(akryVar)) ? decl.h((dbtyVar.a().intValue() >> 3) * 32, 64, 256) : 0;
        }
        if (akry.PERSONALIZED_SMARTMAPS.equals(akryVar)) {
            return new amcs(btmvVar, akryVar, Math.min(1024, h * 4));
        }
        return new amcu(btmvVar, akryVar, h);
    }

    public final synchronized Object a(akrw akrwVar) {
        Object obj = this.d.get(akrwVar);
        if (obj == null) {
            Object obj2 = new Object();
            this.d.put(akrwVar, obj2);
            return obj2;
        }
        return obj;
    }

    public final synchronized void b(int i) {
        akry[] values;
        this.e.set(i);
        for (akry akryVar : akry.values()) {
            if (akryVar.e()) {
                h(i, akrw.a(akryVar));
            }
        }
        for (akrw akrwVar : this.a.keySet()) {
            akry akryVar2 = akrwVar.b;
            if (akryVar2 == null || (akryVar2.e() && !dbsd.a(akrwVar, akrw.a(akryVar2)))) {
                h(i, akrwVar);
            }
        }
    }

    public final amco c(akry akryVar) {
        return i(akrw.a(akryVar), alyl.o, false);
    }

    public final amco d(akrw akrwVar, alyl alylVar) {
        return i(akrwVar, alylVar, true);
    }

    public final amco e(akrw akrwVar, alyl alylVar) {
        amco j;
        synchronized (a(akrwVar)) {
            j = j(akrwVar, alylVar);
        }
        return j;
    }

    public final void f(akrw akrwVar) {
        synchronized (a(akrwVar)) {
            amco amcoVar = this.a.get(akrwVar);
            if (amcoVar != null) {
                amcoVar.g();
            }
        }
    }

    public final void g(akrw akrwVar) {
        synchronized (a(akrwVar)) {
            amco amcoVar = this.a.get(akrwVar);
            if (amcoVar != null) {
                amcoVar.g();
            }
        }
    }
}

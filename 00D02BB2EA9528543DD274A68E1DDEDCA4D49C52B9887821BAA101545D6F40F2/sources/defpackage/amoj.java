package defpackage;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amoj  reason: default package */
/* loaded from: classes.dex */
public final class amoj {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public alvb f;
    public akra g;
    private final amoi j;
    private long m;
    private boolean o;
    private amoo s;
    public final LinkedHashSet<alyh> e = dcnm.h();
    private dcep<alyh> h = dcmr.a;
    private final LinkedHashSet<alyh> i = dcnm.h();
    private final LinkedList<dbsi<alyh, Boolean>> k = dchl.h();
    private long l = 0;
    private byte n = 3;
    private int p = 8;
    private final Map<alyh, amoo> q = dcjz.d();
    private final Set<alyh> r = dcnm.c();

    public amoj(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.c = z2;
        this.j = new amoi(this, z2);
        this.b = z;
        this.d = i2;
    }

    private final synchronized void i() {
        this.q.clear();
        this.r.clear();
        if (!this.b || this.o) {
            this.h = dcmr.a;
        } else {
            this.h = dcep.K(this.e);
        }
    }

    public final long a() {
        long j = this.l + 1;
        this.l = j;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(alvb alvbVar, akra akraVar, List<alyh> list, @dzsi Set<alyh> set, int i, boolean z) {
        this.n = (byte) 0;
        this.m = a();
        this.f = alvbVar;
        this.g = akraVar;
        this.s = new amoo(amox.a, a(), Boolean.TRUE.booleanValue(), Boolean.FALSE.booleanValue());
        this.e.clear();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.e.add(list.get(i2));
        }
        this.k.clear();
        if (set != null) {
            for (alyh alyhVar : set) {
                this.k.add(dbsi.a(alyhVar, Boolean.TRUE));
            }
        }
        this.p = i;
        this.o = z;
    }

    public final synchronized void c() {
        if (!this.o) {
            this.n = (byte) 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        this.m = a();
        this.n = (byte) 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final synchronized amoo e() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0228, code lost:
        if (r6 >= 6) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0225, code lost:
        if (r6 >= 4) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026c A[Catch: all -> 0x0392, TryCatch #0 {, blocks: (B:5:0x0008, B:7:0x000f, B:161:0x0363, B:163:0x036f, B:165:0x0373, B:168:0x037c, B:170:0x0387, B:10:0x0018, B:12:0x001f, B:15:0x0028, B:17:0x0051, B:19:0x0055, B:20:0x0063, B:22:0x006e, B:23:0x0071, B:25:0x0076, B:27:0x007e, B:29:0x0086, B:32:0x0093, B:34:0x009b, B:36:0x00a5, B:37:0x00aa, B:39:0x00b2, B:41:0x00ba, B:42:0x00d4, B:45:0x00de, B:49:0x00ef, B:54:0x0102, B:55:0x0109, B:57:0x0116, B:59:0x011a, B:83:0x01ee, B:84:0x01fa, B:90:0x0207, B:93:0x0219, B:102:0x022a, B:103:0x022f, B:105:0x0235, B:108:0x023e, B:110:0x0246, B:114:0x024f, B:118:0x0257, B:122:0x0261, B:123:0x0265, B:125:0x026c, B:126:0x0274, B:128:0x027a, B:132:0x028f, B:135:0x0296, B:137:0x02b8, B:138:0x02c4, B:142:0x02e2, B:143:0x02e7, B:144:0x02f5, B:146:0x0305, B:62:0x013c, B:63:0x0154, B:65:0x015a, B:66:0x016a, B:67:0x016e, B:69:0x0174, B:74:0x0186, B:75:0x0193, B:77:0x0199, B:80:0x01ab, B:81:0x01ad, B:82:0x01c6, B:149:0x031e, B:151:0x0323, B:154:0x032a, B:156:0x0332, B:157:0x035a), top: B:180:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e2 A[Catch: all -> 0x0392, TryCatch #0 {, blocks: (B:5:0x0008, B:7:0x000f, B:161:0x0363, B:163:0x036f, B:165:0x0373, B:168:0x037c, B:170:0x0387, B:10:0x0018, B:12:0x001f, B:15:0x0028, B:17:0x0051, B:19:0x0055, B:20:0x0063, B:22:0x006e, B:23:0x0071, B:25:0x0076, B:27:0x007e, B:29:0x0086, B:32:0x0093, B:34:0x009b, B:36:0x00a5, B:37:0x00aa, B:39:0x00b2, B:41:0x00ba, B:42:0x00d4, B:45:0x00de, B:49:0x00ef, B:54:0x0102, B:55:0x0109, B:57:0x0116, B:59:0x011a, B:83:0x01ee, B:84:0x01fa, B:90:0x0207, B:93:0x0219, B:102:0x022a, B:103:0x022f, B:105:0x0235, B:108:0x023e, B:110:0x0246, B:114:0x024f, B:118:0x0257, B:122:0x0261, B:123:0x0265, B:125:0x026c, B:126:0x0274, B:128:0x027a, B:132:0x028f, B:135:0x0296, B:137:0x02b8, B:138:0x02c4, B:142:0x02e2, B:143:0x02e7, B:144:0x02f5, B:146:0x0305, B:62:0x013c, B:63:0x0154, B:65:0x015a, B:66:0x016a, B:67:0x016e, B:69:0x0174, B:74:0x0186, B:75:0x0193, B:77:0x0199, B:80:0x01ab, B:81:0x01ad, B:82:0x01c6, B:149:0x031e, B:151:0x0323, B:154:0x032a, B:156:0x0332, B:157:0x035a), top: B:180:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0363 A[Catch: all -> 0x0392, TryCatch #0 {, blocks: (B:5:0x0008, B:7:0x000f, B:161:0x0363, B:163:0x036f, B:165:0x0373, B:168:0x037c, B:170:0x0387, B:10:0x0018, B:12:0x001f, B:15:0x0028, B:17:0x0051, B:19:0x0055, B:20:0x0063, B:22:0x006e, B:23:0x0071, B:25:0x0076, B:27:0x007e, B:29:0x0086, B:32:0x0093, B:34:0x009b, B:36:0x00a5, B:37:0x00aa, B:39:0x00b2, B:41:0x00ba, B:42:0x00d4, B:45:0x00de, B:49:0x00ef, B:54:0x0102, B:55:0x0109, B:57:0x0116, B:59:0x011a, B:83:0x01ee, B:84:0x01fa, B:90:0x0207, B:93:0x0219, B:102:0x022a, B:103:0x022f, B:105:0x0235, B:108:0x023e, B:110:0x0246, B:114:0x024f, B:118:0x0257, B:122:0x0261, B:123:0x0265, B:125:0x026c, B:126:0x0274, B:128:0x027a, B:132:0x028f, B:135:0x0296, B:137:0x02b8, B:138:0x02c4, B:142:0x02e2, B:143:0x02e7, B:144:0x02f5, B:146:0x0305, B:62:0x013c, B:63:0x0154, B:65:0x015a, B:66:0x016a, B:67:0x016e, B:69:0x0174, B:74:0x0186, B:75:0x0193, B:77:0x0199, B:80:0x01ab, B:81:0x01ad, B:82:0x01c6, B:149:0x031e, B:151:0x0323, B:154:0x032a, B:156:0x0332, B:157:0x035a), top: B:180:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0390 A[EDGE_INSN: B:182:0x0390->B:173:0x0390 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e7 A[SYNTHETIC] */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.amoo f(@defpackage.dzsi defpackage.amoo r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amoj.f(amoo, boolean):amoo");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean g() {
        return this.n == 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean h(@dzsi amoo amooVar) {
        boolean z;
        if (amooVar != null) {
            if (amooVar.d >= this.m) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.f("maxLookupLevel", this.a);
        b.h("prefetchLightweightAncestorTiles", this.b);
        b.h("fetchAncestorsOfMissingTilesFromNetwork", this.j.a);
        b.f("maxTilesToFetch", this.d);
        return b.toString();
    }
}

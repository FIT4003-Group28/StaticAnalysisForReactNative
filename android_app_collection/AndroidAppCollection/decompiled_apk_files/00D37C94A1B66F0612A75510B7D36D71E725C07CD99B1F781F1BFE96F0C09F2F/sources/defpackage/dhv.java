package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: dhv  reason: default package */
/* loaded from: classes3.dex */
public final class dhv {
    private static volatile Looper f;
    public volatile boolean a;
    public final dby b;
    public dhj c;
    public dhj d;
    public dgz e;
    private final dhk g;
    private final dha h;
    private final dhg i;
    private final String j;
    private final boolean l;
    private final dhr m;
    private final dhr n;
    private boolean o;
    private int p;
    private final dht q;
    private final List r;
    private final AtomicBoolean s;
    private final tmt v;
    private final Map k = new HashMap();
    private final zib u = new zib();
    private final dat t = new dat();

    public dhv(dhq dhqVar) {
        dbx dbxVar = new dbx(Looper.getMainLooper());
        czu.e(dbxVar);
        this.b = dbxVar;
        tmt tmtVar = new tmt();
        this.v = tmtVar;
        this.a = false;
        String str = dhqVar.c;
        this.j = str;
        dha dhaVar = new dha(dhqVar.b, tmtVar, str, null);
        this.h = dhaVar;
        this.l = ((din) dhaVar.b).b;
        this.i = new dhg();
        dhk dhkVar = new dhk(dhqVar.a);
        dhkVar.n = this;
        dhkVar.p = new dhw(this);
        this.g = dhkVar;
        this.r = new ArrayList();
        this.q = dhx.a();
        dbx dbxVar2 = new dbx(a());
        czu.e(dbxVar2);
        this.n = new dhr(this, dbxVar2);
        this.m = new dhr(this, dbxVar);
        this.s = new AtomicBoolean(false);
    }

    public static synchronized Looper a() {
        Looper looper;
        synchronized (dhv.class) {
            if (f == null) {
                HandlerThread handlerThread = new HandlerThread("SectionChangeSetThread", 0);
                handlerThread.start();
                f = handlerThread.getLooper();
            }
            looper = f;
        }
        return looper;
    }

    public static dhj b(dhj dhjVar, boolean z) {
        if (dhjVar != null) {
            return dhjVar.a(z);
        }
        return null;
    }

    public static String c(dhv dhvVar) {
        String sb;
        synchronized (dhvVar) {
            boolean z = dhvVar.a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("tag: ");
            sb2.append(dhvVar.j);
            sb2.append(", currentSection.size: ");
            dhj dhjVar = dhvVar.c;
            String str = null;
            sb2.append(dhjVar != null ? Integer.valueOf(dhjVar.g) : null);
            sb2.append(", currentSection.name: ");
            dhj dhjVar2 = dhvVar.c;
            sb2.append(dhjVar2 != null ? dhjVar2.e : null);
            sb2.append(", nextSection.size: ");
            dhj dhjVar3 = dhvVar.d;
            sb2.append(dhjVar3 != null ? Integer.valueOf(dhjVar3.g) : null);
            sb2.append(", nextSection.name: ");
            dhj dhjVar4 = dhvVar.d;
            if (dhjVar4 != null) {
                str = dhjVar4.e;
            }
            sb2.append(str);
            sb2.append(", pendingChangeSets.size: ");
            sb2.append(dhvVar.r.size());
            sb2.append(", pendingStateUpdates.size: ");
            sb2.append(dhvVar.q.a.size());
            sb2.append(", pendingNonLazyStateUpdates.size: ");
            sb2.append(dhvVar.q.b.size());
            sb2.append("\n");
            sb = sb2.toString();
        }
        return sb;
    }

    private final void n(dhj dhjVar) {
        this.u.a(dhjVar.c, dhjVar, dhjVar.i);
        if (!dhjVar.h()) {
            List list = dhjVar.h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                n((dhj) list.get(i));
            }
        }
    }

    private final synchronized void o(dhj dhjVar) {
        List list = dhjVar.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                o((dhj) list.get(i));
            }
        }
    }

    private final void p() {
        this.o = false;
        this.p = 0;
    }

    private final void q(dhj dhjVar) {
        dhk dhkVar = dhjVar.c;
        if (!dhjVar.h()) {
            List list = dhjVar.h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                q((dhj) list.get(i));
            }
        }
    }

    private final synchronized boolean r(dht dhtVar) {
        return dhtVar.b.equals(this.q.b);
    }

    private final void t(dhj dhjVar, List list) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        boolean z = false;
        for (int i8 = 0; i8 < size; i8++) {
            dhd dhdVar = (dhd) list.get(i8);
            if (dhdVar.a() > 0) {
                int a = dhdVar.a();
                int i9 = 0;
                while (i9 < a) {
                    dhb b = dhdVar.b(i9);
                    int i10 = b.a;
                    if (i10 == 0) {
                        dha dhaVar = this.h;
                        int i11 = b.b;
                        int i12 = b.c;
                        dhaVar.a();
                        dhu dhuVar = dhaVar.b;
                        if (((din) dhuVar).b) {
                            dlc dlcVar = ((din) dhuVar).a;
                            dlcVar.u();
                            if (dlm.a) {
                                dlcVar.hashCode();
                            }
                            dkq dkqVar = new dkq(i11, i12);
                            synchronized (dlcVar) {
                                dlcVar.z = true;
                                List list2 = dlcVar.c;
                                list2.add(i12, (diz) list2.remove(i11));
                                dlcVar.r(dkqVar);
                            }
                        } else {
                            ((din) dhuVar).a.D(i11, i12);
                        }
                        if (dha.a) {
                            dhaVar.h.g(dhaVar.d, i11, i12, Thread.currentThread().getName());
                        }
                    } else if (i10 == 1) {
                        dha dhaVar2 = this.h;
                        int i13 = b.b;
                        dlj dljVar = b.e;
                        if (dhaVar2.e != 1 || i13 < (i = dhaVar2.f) || i13 > (i3 = i + (i2 = dhaVar2.g)) || i13 < i3) {
                            dhaVar2.a();
                            dhaVar2.f = i13;
                            dhaVar2.g = 1;
                            dhaVar2.e = 1;
                            dhaVar2.c.put(i13, dljVar);
                        } else {
                            dhaVar2.g = i2 + 1;
                            dhaVar2.f = Math.min(i13, i);
                            dhaVar2.c.put(i13, dljVar);
                        }
                    } else if (i10 != 2) {
                        dha dhaVar3 = this.h;
                        int i14 = b.b;
                        if (dhaVar3.e != 3 || (i7 = dhaVar3.f) < i14 || i7 > i14 + 1) {
                            dhaVar3.a();
                            dhaVar3.f = i14;
                            dhaVar3.g = 1;
                            dhaVar3.e = 3;
                        } else {
                            dhaVar3.g++;
                            dhaVar3.f = i14;
                        }
                    } else {
                        dha dhaVar4 = this.h;
                        int i15 = b.b;
                        dlj dljVar2 = b.e;
                        if (dhaVar4.e != 2 || i15 > (i5 = dhaVar4.g + (i4 = dhaVar4.f)) || (i6 = i15 + 1) < i4) {
                            dhaVar4.a();
                            dhaVar4.f = i15;
                            dhaVar4.g = 1;
                            dhaVar4.e = 2;
                            dhaVar4.c.put(i15, dljVar2);
                        } else {
                            dhaVar4.f = Math.min(i15, i4);
                            dhaVar4.g = Math.max(i5, i6) - dhaVar4.f;
                            dhaVar4.c.put(i15, dljVar2);
                        }
                    }
                    i9++;
                    z = true;
                }
                this.h.a();
            }
            arrayList.addAll(dhdVar.a);
        }
        czu czuVar = new czu(arrayList);
        dha dhaVar5 = this.h;
        dhp dhpVar = new dhp(this, czuVar, z, dhjVar, null, null, null, null);
        dhu dhuVar2 = dhaVar5.b;
        if (((din) dhuVar2).b) {
            dlc dlcVar2 = ((din) dhuVar2).a;
            if (dlm.a) {
                dlcVar2.hashCode();
            }
            dlcVar2.z = true;
            dlcVar2.u();
            dlcVar2.O(z, dhpVar);
            if (czu.y()) {
                dlcVar2.s();
                if (z) {
                    if (dce.b(null)) {
                        throw null;
                    }
                    dlcVar2.B();
                }
            } else if (dlcVar2.i.get()) {
                dfy.a.a(dlcVar2.p);
            }
            if (!dfz.a && !dfz.e) {
                return;
            }
            dlcVar2.l.set(-1L);
            return;
        }
        ((din) dhuVar2).a.P(z, dhpVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[Catch: all -> 0x0185, TryCatch #0 {, blocks: (B:4:0x0008, B:6:0x0010, B:7:0x0014, B:9:0x001a, B:11:0x001e, B:12:0x0029, B:14:0x0037, B:16:0x003d, B:18:0x004d, B:19:0x0051, B:20:0x0057, B:23:0x005c, B:26:0x0063, B:28:0x006a, B:30:0x007c, B:32:0x0084, B:35:0x008a, B:36:0x008d, B:38:0x0096, B:40:0x00a7, B:42:0x00b3, B:44:0x00bd, B:46:0x00c9, B:48:0x00d5, B:50:0x00db, B:51:0x00e2, B:53:0x00ea, B:55:0x00f8, B:56:0x011c, B:61:0x0139, B:63:0x0140, B:59:0x012f, B:43:0x00b8, B:64:0x0150, B:65:0x017d, B:66:0x017e, B:68:0x0182, B:31:0x0082), top: B:75:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[Catch: all -> 0x0185, TryCatch #0 {, blocks: (B:4:0x0008, B:6:0x0010, B:7:0x0014, B:9:0x001a, B:11:0x001e, B:12:0x0029, B:14:0x0037, B:16:0x003d, B:18:0x004d, B:19:0x0051, B:20:0x0057, B:23:0x005c, B:26:0x0063, B:28:0x006a, B:30:0x007c, B:32:0x0084, B:35:0x008a, B:36:0x008d, B:38:0x0096, B:40:0x00a7, B:42:0x00b3, B:44:0x00bd, B:46:0x00c9, B:48:0x00d5, B:50:0x00db, B:51:0x00e2, B:53:0x00ea, B:55:0x00f8, B:56:0x011c, B:61:0x0139, B:63:0x0140, B:59:0x012f, B:43:0x00b8, B:64:0x0150, B:65:0x017d, B:66:0x017e, B:68:0x0182, B:31:0x0082), top: B:75:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[Catch: all -> 0x0185, TryCatch #0 {, blocks: (B:4:0x0008, B:6:0x0010, B:7:0x0014, B:9:0x001a, B:11:0x001e, B:12:0x0029, B:14:0x0037, B:16:0x003d, B:18:0x004d, B:19:0x0051, B:20:0x0057, B:23:0x005c, B:26:0x0063, B:28:0x006a, B:30:0x007c, B:32:0x0084, B:35:0x008a, B:36:0x008d, B:38:0x0096, B:40:0x00a7, B:42:0x00b3, B:44:0x00bd, B:46:0x00c9, B:48:0x00d5, B:50:0x00db, B:51:0x00e2, B:53:0x00ea, B:55:0x00f8, B:56:0x011c, B:61:0x0139, B:63:0x0140, B:59:0x012f, B:43:0x00b8, B:64:0x0150, B:65:0x017d, B:66:0x017e, B:68:0x0182, B:31:0x0082), top: B:75:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0182 A[Catch: all -> 0x0185, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0008, B:6:0x0010, B:7:0x0014, B:9:0x001a, B:11:0x001e, B:12:0x0029, B:14:0x0037, B:16:0x003d, B:18:0x004d, B:19:0x0051, B:20:0x0057, B:23:0x005c, B:26:0x0063, B:28:0x006a, B:30:0x007c, B:32:0x0084, B:35:0x008a, B:36:0x008d, B:38:0x0096, B:40:0x00a7, B:42:0x00b3, B:44:0x00bd, B:46:0x00c9, B:48:0x00d5, B:50:0x00db, B:51:0x00e2, B:53:0x00ea, B:55:0x00f8, B:56:0x011c, B:61:0x0139, B:63:0x0140, B:59:0x012f, B:43:0x00b8, B:64:0x0150, B:65:0x017d, B:66:0x017e, B:68:0x0182, B:31:0x0082), top: B:75:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void v(defpackage.dhk r17, defpackage.dhj r18, defpackage.dhj r19, java.util.Map r20, defpackage.tmt r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhv.v(dhk, dhj, dhj, java.util.Map, tmt, java.lang.String):void");
    }

    public final void d(dhj dhjVar) {
        dhk dhkVar = dhjVar.c;
        if (!dhjVar.h()) {
            List list = dhjVar.h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                d((dhj) list.get(i));
            }
        }
    }

    public final void e() {
        if (this.i.a != null) {
            dhh dhhVar = dhh.INITIAL_LOAD;
        }
    }

    public final void f(dhj dhjVar) {
        dhk dhkVar = dhjVar.c;
        if (!dhjVar.h()) {
            List list = dhjVar.h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                f((dhj) list.get(i));
            }
        }
    }

    public final void g(dhh dhhVar) {
        dhh dhhVar2 = dhh.INITIAL_LOAD;
        this.i.a = dhhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void h(String str, ddk ddkVar, String str2) {
        this.m.b();
        s(str, ddkVar);
        this.m.c(2, str2);
        dio.h.addAndGet(1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void i(String str, ddk ddkVar, String str2) {
        this.n.b();
        s(str, ddkVar);
        this.n.c(3, str2);
        dio.i.addAndGet(1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.dhj r18, int r19, int r20, int r21, int r22, int r23) {
        /*
            r17 = this;
            r7 = r17
            r0 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            java.util.Map r1 = r7.k
            java.lang.String r2 = r0.i
            java.lang.Object r1 = r1.get(r2)
            dhs r1 = (defpackage.dhs) r1
            int r2 = r0.g
            if (r1 != 0) goto L29
            dhs r1 = new dhs
            r1.<init>()
            java.util.Map r3 = r7.k
            java.lang.String r4 = r0.i
            r3.put(r4, r1)
        L26:
            r12 = r23
            goto L43
        L29:
            int r3 = r1.a
            if (r3 != r8) goto L26
            int r3 = r1.b
            if (r3 != r9) goto L26
            int r3 = r1.c
            if (r3 != r10) goto L26
            int r3 = r1.d
            if (r3 != r11) goto L26
            int r3 = r1.e
            if (r3 != r2) goto L26
            r3 = 1
            r12 = r23
            if (r12 == r3) goto L43
            return
        L43:
            r1.b = r9
            r1.a = r8
            r1.c = r10
            r1.d = r11
            r1.e = r2
            dhk r1 = r0.c
            boolean r1 = r18.h()
            if (r1 != 0) goto Lad
            java.util.List r13 = r0.h
            int r14 = r13.size()
            r0 = 0
            r6 = 0
        L5d:
            if (r6 >= r14) goto Lad
            java.lang.Object r1 = r13.get(r6)
            dhj r1 = (defpackage.dhj) r1
            int r2 = r8 - r0
            int r3 = r9 - r0
            int r4 = r10 - r0
            int r5 = r11 - r0
            int r15 = r1.g
            r16 = -1
            if (r2 >= r15) goto L84
            if (r3 >= 0) goto L76
            goto L84
        L76:
            r15 = 0
            int r2 = java.lang.Math.max(r2, r15)
            int r15 = r1.g
            int r15 = r15 + (-1)
            int r3 = java.lang.Math.min(r3, r15)
            goto L86
        L84:
            r2 = -1
            r3 = -1
        L86:
            int r15 = r1.g
            if (r4 >= r15) goto L9b
            if (r5 >= 0) goto L8d
            goto L9b
        L8d:
            r15 = 0
            int r4 = java.lang.Math.max(r4, r15)
            int r15 = r1.g
            int r15 = r15 + (-1)
            int r5 = java.lang.Math.min(r5, r15)
            goto L9d
        L9b:
            r4 = -1
            r5 = -1
        L9d:
            int r15 = r1.g
            int r15 = r15 + r0
            r0 = r17
            r16 = r6
            r6 = r23
            r0.j(r1, r2, r3, r4, r5, r6)
            int r6 = r16 + 1
            r0 = r15
            goto L5d
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhv.j(dhj, int, int, int, int, int):void");
    }

    public final void k() {
        ArrayList arrayList;
        dhj dhjVar;
        if (!this.l) {
            synchronized (this) {
                arrayList = new ArrayList(this.r);
                this.r.clear();
                dhjVar = this.c;
            }
            t(dhjVar, arrayList);
            e();
            return;
        }
        throw new IllegalStateException("Cannot use UIThread-only variant when background change sets are enabled.");
    }

    public final void l(int i, String str, ddq ddqVar) {
        dhj b;
        dhj b2;
        tha thaVar;
        dht a;
        tha thaVar2;
        dhe dheVar;
        boolean z;
        dhj b3;
        String str2;
        String str3 = str == null ? this.j : str;
        if (dlm.a) {
            synchronized (this) {
                dhj dhjVar = this.d;
                str2 = dhjVar != null ? dhjVar.e : "<null>";
            }
            hashCode();
            czu.O(i).length();
            str2.length();
        }
        try {
            synchronized (this) {
                b = b(this.c, true);
                b2 = b(this.d, false);
                thaVar = this.g.l;
                a = this.q.a();
                this.o = true;
            }
            ddb N = czu.N(this.g, 15, b, b2);
            boolean z2 = (thaVar == null || N == null || !tha.c(N)) ? false : true;
            if (N != null) {
                N.a("attribution", str3);
                N.a("section_set_root_source", czu.O(i));
                czu.y();
            }
            this.t.a();
            while (b2 != null) {
                dhk dhkVar = this.g;
                Map map = a.a;
                tmt tmtVar = this.v;
                String str4 = this.j;
                b2.i = b2.j;
                tha thaVar3 = dhkVar.l;
                ddb N2 = czu.N(dhkVar, 11, b, b2);
                v(dhkVar, b, b2, map, tmtVar, str4);
                if (thaVar3 != null && N2 != null) {
                    tha.d(N2);
                }
                dhe dheVar2 = new dhe();
                tha thaVar4 = dhkVar.l;
                ddb N3 = czu.N(dhkVar, 13, b, b2);
                if (b != null && !b.e.equals(b2.e)) {
                    thaVar2 = thaVar4;
                    dheVar = dheVar2;
                    dheVar.a = dhd.e(dhe.a(dhkVar, b, null, dheVar2.b, tmtVar, str4, "", "", Thread.currentThread().getName(), z2), dhe.a(dhkVar, null, b2, dheVar.b, tmtVar, str4, "", "", Thread.currentThread().getName(), z2));
                } else {
                    thaVar2 = thaVar4;
                    dheVar = dheVar2;
                    dheVar.a = dhe.a(dhkVar, b, b2, dheVar.b, tmtVar, str4, "", "", Thread.currentThread().getName(), z2);
                }
                if (thaVar2 != null && N3 != null) {
                    dheVar.a.a();
                    dhd dhdVar = dheVar.a;
                    int i2 = dhdVar.d;
                    dhc dhcVar = dhdVar.c;
                    tha.d(N3);
                }
                if ((b != null && b.g < 0) || b2.g < 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Changet count is below 0! Current section: ");
                    if (b == null) {
                        sb.append("null; ");
                    } else {
                        String str5 = b.e;
                        String str6 = b.i;
                        int i3 = b.g;
                        int size = b.h.size();
                        StringBuilder sb2 = new StringBuilder(str5.length() + 54 + String.valueOf(str6).length());
                        sb2.append(str5);
                        sb2.append(" , key=");
                        sb2.append(str6);
                        sb2.append(", count=");
                        sb2.append(i3);
                        sb2.append(", childrenSize=");
                        sb2.append(size);
                        sb2.append("; ");
                        sb.append(sb2.toString());
                    }
                    sb.append("Next section: ");
                    String str7 = b2.e;
                    String str8 = b2.i;
                    int i4 = b2.g;
                    int size2 = b2.h.size();
                    StringBuilder sb3 = new StringBuilder(str7.length() + 54 + String.valueOf(str8).length());
                    sb3.append(str7);
                    sb3.append(" , key=");
                    sb3.append(str8);
                    sb3.append(", count=");
                    sb3.append(i4);
                    sb3.append(", childrenSize=");
                    sb3.append(size2);
                    sb3.append("; ");
                    sb.append(sb3.toString());
                    sb.append("Changes: [");
                    dhd dhdVar2 = dheVar.a;
                    for (int i5 = 0; i5 < dhdVar2.d; i5++) {
                        dhb b4 = dhdVar2.b(i5);
                        int i6 = b4.a;
                        int i7 = b4.b;
                        int i8 = b4.c;
                        StringBuilder sb4 = new StringBuilder(35);
                        sb4.append(i6);
                        sb4.append(" ");
                        sb4.append(i7);
                        sb4.append(" ");
                        sb4.append(i8);
                        sb.append(sb4.toString());
                        sb.append(", ");
                    }
                    sb.append("]");
                    throw new IllegalStateException(sb.toString());
                }
                synchronized (this) {
                    dhj dhjVar2 = this.c;
                    boolean z3 = !(b == null || dhjVar2 == null || b.f != dhjVar2.f) || (b == null && dhjVar2 == null);
                    dhj dhjVar3 = this.d;
                    z = z3 && (dhjVar3 != null && b2.f == dhjVar3.f) && r(a);
                    if (z) {
                        dhj dhjVar4 = this.c;
                        this.c = b2;
                        this.d = null;
                        p();
                        dht dhtVar = this.q;
                        if (!a.a.isEmpty()) {
                            for (String str9 : a.a.keySet()) {
                                if (!dhtVar.a.containsKey(str9)) {
                                    break;
                                }
                                dht.c(dhtVar.a, a.a, str9);
                                dht.c(dhtVar.b, a.b, str9);
                            }
                        }
                        this.r.add(dheVar.a);
                        if (dhjVar4 != null) {
                            q(dhjVar4);
                        }
                        o(b2);
                    } else {
                        b2 = null;
                    }
                }
                if (z) {
                    n(b2);
                    List list = dheVar.b;
                    int size3 = list.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        dhs dhsVar = (dhs) this.k.remove(((dhj) list.get(i9)).i);
                    }
                    this.u.b();
                    u(ddqVar);
                }
                synchronized (this) {
                    dhx.b(a);
                    b = b(this.c, true);
                    b3 = b(this.d, false);
                    if (b3 != null) {
                        dht a2 = this.q.a();
                        this.o = true;
                        a = a2;
                    } else {
                        p();
                    }
                }
                b2 = b3;
            }
            aflw aflwVar = this.g.m;
            if (dce.b(aflwVar == null ? null : (dce) aflwVar.f(dce.class))) {
                throw null;
            }
            if (thaVar != null && N != null) {
                tha.d(N);
            }
        } finally {
            dio.a();
            if (czu.y()) {
                dio.b();
            }
        }
    }

    public final void m(dhj dhjVar, boolean z, boolean z2, long j, czu czuVar, int i) {
        if (dhjVar.h()) {
            return;
        }
        dhs dhsVar = (dhs) this.k.get(dhjVar.i);
        dhk dhkVar = dhjVar.c;
        List list = dhjVar.h;
        int size = list.size();
        int i2 = i;
        for (int i3 = 0; i3 < size; i3++) {
            dhj dhjVar2 = (dhj) list.get(i3);
            m(dhjVar2, z, z2, j, czuVar, i2);
            i2 += dhjVar2.g;
        }
    }

    private final synchronized void s(String str, ddk ddkVar) {
        if (this.c == null && this.d == null) {
            throw new IllegalStateException("State set with no attached Section");
        }
        dht dhtVar = this.q;
        dht.b(str, ddkVar, dhtVar.a);
        dht.b(str, ddkVar, dhtVar.b);
        if (this.o) {
            int i = this.p + 1;
            this.p = i;
            if (i == 50) {
                czq.a(3, "SectionTree:StateUpdatesFromInsideChangeSetCalculateExceedsThreshold", "Large number of state updates detected which indicates an infinite loop leading to unresponsive apps");
            }
        }
        dhj dhjVar = this.d;
        if (dhjVar == null) {
            this.d = b(this.c, false);
        } else {
            this.d = b(dhjVar, false);
        }
    }

    private final void u(ddq ddqVar) {
        if (this.l) {
            synchronized (this) {
                t(this.c, this.r);
                this.r.clear();
            }
            if (!czu.y()) {
                ((dbx) this.b).post(new dho(this, ddqVar));
                return;
            }
            e();
        } else if (czu.y()) {
            try {
                k();
            } catch (IndexOutOfBoundsException e) {
                String c = c(this);
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 169 + String.valueOf(message).length());
                sb.append("Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://bit.ly/39Oq0Hs for more information. Debug info: ");
                sb.append(c);
                sb.append(message);
                throw new RuntimeException(sb.toString(), e);
            }
        } else {
            dhn dhnVar = new dhn(this, ddqVar);
            if (this.s.compareAndSet(true, false)) {
                ((dbx) this.b).postAtFrontOfQueue(dhnVar);
            } else {
                ((dbx) this.b).post(dhnVar);
            }
        }
    }
}

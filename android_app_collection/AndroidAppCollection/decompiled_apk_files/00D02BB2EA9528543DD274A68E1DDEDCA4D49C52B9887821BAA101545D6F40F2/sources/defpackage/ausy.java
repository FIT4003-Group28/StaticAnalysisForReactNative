package defpackage;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ausy  reason: default package */
/* loaded from: classes2.dex */
public class ausy {
    public final autu a;
    private final ausz b;
    private final auti c;
    private final ckcw d;
    private final btvo e;

    public ausy(ausz auszVar, autu autuVar, auti autiVar, ckcw ckcwVar, btvo btvoVar) {
        this.b = auszVar;
        this.a = autuVar;
        this.c = autiVar;
        this.d = ckcwVar;
        this.e = btvoVar;
    }

    private final dcdn<Integer, aujb> j(boolean z) {
        dcdn<Integer, aujb> c;
        aujb aujbVar;
        HashMap hashMap = new HashMap();
        dcpd<Integer> it = this.c.a().iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            aujb e = e(next.intValue());
            if (e != null && (!z || e.b() != null)) {
                hashMap.put(next, e);
            }
        }
        if (z) {
            c = this.b.a.b();
        } else {
            c = this.b.a.c();
        }
        dcpd<Integer> it2 = c.keySet().iterator();
        while (it2.hasNext()) {
            Integer next2 = it2.next();
            if (!hashMap.containsKey(next2) && (aujbVar = c.get(next2)) != null) {
                hashMap.put(next2, aujbVar);
            }
        }
        return dcdn.r(hashMap);
    }

    private final void k(ckgz ckgzVar, Integer num, String str) {
        ((ckco) this.d.a(ckgzVar)).a(num.intValue());
        dcqe.b.u(TimeUnit.MINUTES);
    }

    public final boolean a(final int i) {
        return ((Boolean) i(new dbty(i) { // from class: ausq
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(autc.a.contains(Integer.valueOf(this.a)));
            }
        }, new dbty(this, i) { // from class: ausr
            private final ausy a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // defpackage.dbty
            public final Object a() {
                ausy ausyVar = this.a;
                return Boolean.valueOf(((Boolean) autu.b(ausyVar.a.a, this.b).h(autl.a).c(false)).booleanValue());
            }
        }, Integer.valueOf(i), ckhu.c, "isEnabledForInbox")).booleanValue();
    }

    public final boolean b(final int i) {
        return ((Boolean) i(new dbty(i) { // from class: ausu
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(!aute.a.contains(Integer.valueOf(this.a)));
            }
        }, new dbty(this, i) { // from class: ausv
            private final ausy a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // defpackage.dbty
            public final Object a() {
                ausy ausyVar = this.a;
                return Boolean.valueOf(((Boolean) autu.b(ausyVar.a.a, this.b).h(autn.a).c(true)).booleanValue());
            }
        }, Integer.valueOf(i), ckhu.b, "isEnabledForForegroundLocationOnly")).booleanValue();
    }

    public final int c(dlfv dlfvVar) {
        Integer d = d(dlfvVar);
        return d == null ? dpyv.GENERIC_UNKNOWN.dm : d.intValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(4:3|(1:5)|6|(6:8|9|10|(3:12|(1:14)|15)|(1:19)|(1:26)(1:24)))|29|9|10|(0)|(2:17|19)|(1:22)|26) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        defpackage.dcqe.b.u(java.util.concurrent.TimeUnit.MINUTES);
        r5.getMessage();
        r2 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[Catch: RuntimeException -> 0x0071, TryCatch #0 {RuntimeException -> 0x0071, blocks: (B:11:0x0031, B:13:0x0039, B:15:0x003d, B:16:0x003f, B:18:0x0063, B:20:0x0069), top: B:29:0x0031 }] */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer d(defpackage.dlfv r5) {
        /*
            r4 = this;
            ausz r0 = r4.b
            dxio<autb> r0 = r0.b
            java.lang.Object r0 = r0.a()
            autb r0 = (defpackage.autb) r0
            int r1 = r5.a
            r1 = r1 & 32
            r2 = 0
            if (r1 == 0) goto L30
            dlft r1 = r5.b
            if (r1 != 0) goto L17
            dlft r1 = defpackage.dlft.c
        L17:
            int r1 = r1.b
            dcdn<java.lang.Integer, auta> r0 = r0.ar
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            auta r0 = (defpackage.auta) r0
            if (r0 == 0) goto L30
            dpyv r0 = r0.a
            int r0 = r0.dm
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L31
        L30:
            r0 = r2
        L31:
            autu r1 = r4.a     // Catch: java.lang.RuntimeException -> L71
            int r3 = r5.a     // Catch: java.lang.RuntimeException -> L71
            r3 = r3 & 1
            if (r3 == 0) goto L61
            dlft r5 = r5.b     // Catch: java.lang.RuntimeException -> L71
            if (r5 != 0) goto L3f
            dlft r5 = defpackage.dlft.c     // Catch: java.lang.RuntimeException -> L71
        L3f:
            int r5 = r5.b     // Catch: java.lang.RuntimeException -> L71
            btvo r1 = r1.a     // Catch: java.lang.RuntimeException -> L71
            dcdc r1 = defpackage.autu.c(r1)     // Catch: java.lang.RuntimeException -> L71
            dcbg r1 = defpackage.dcbg.b(r1)     // Catch: java.lang.RuntimeException -> L71
            auto r2 = new auto     // Catch: java.lang.RuntimeException -> L71
            r2.<init>(r5)     // Catch: java.lang.RuntimeException -> L71
            dbsg r5 = r1.r(r2)     // Catch: java.lang.RuntimeException -> L71
            dbrn r1 = defpackage.autk.a     // Catch: java.lang.RuntimeException -> L71
            dbsg r5 = r5.h(r1)     // Catch: java.lang.RuntimeException -> L71
            java.lang.Object r5 = r5.f()     // Catch: java.lang.RuntimeException -> L71
            r2 = r5
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.RuntimeException -> L71
        L61:
            if (r0 == 0) goto L7d
            boolean r5 = r0.equals(r2)     // Catch: java.lang.RuntimeException -> L71
            if (r5 != 0) goto L7d
            ckgz r5 = defpackage.ckhu.a     // Catch: java.lang.RuntimeException -> L71
            java.lang.String r1 = "extensionId"
            r4.k(r5, r0, r1)     // Catch: java.lang.RuntimeException -> L71
            goto L7d
        L71:
            r5 = move-exception
            dcqd r1 = defpackage.dcqe.b
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            r1.u(r2)
            r5.getMessage()
            r2 = r0
        L7d:
            if (r2 == 0) goto L8c
            auti r5 = r4.c
            int r1 = r2.intValue()
            boolean r5 = r5.b(r1)
            if (r5 == 0) goto L8c
            return r2
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ausy.d(dlfv):java.lang.Integer");
    }

    @dzsi
    public final aujb e(int i) {
        Integer valueOf = Integer.valueOf(i);
        aujb a = this.b.a(valueOf.intValue());
        aujb a2 = this.a.a(valueOf.intValue(), a);
        if (a2 == null || a == null) {
            dcqe.b.u(TimeUnit.MINUTES);
        } else if (a2.a != a.a) {
            k(ckhu.k, valueOf, "getNotificationIdEnum");
        } else {
            if (a2.f() != a.f()) {
                k(ckhu.m, valueOf, "isNotificationGenerallyEnabledInSystem");
            }
            if (a2.a() != a.a()) {
                k(ckhu.h, valueOf, "getNotificationChannelConfig");
            }
            auix b = a2.b();
            auix b2 = a.b();
            if ((b != null || b2 != null) && (b == null || b2 == null || !b.equals(b2))) {
                k(ckhu.i, valueOf, "getNotificationOptingInfo");
            }
            if (a2.d() != a.d()) {
                k(ckhu.n, valueOf, "isUserPreferenceSyncedToServer");
            }
            auiw h = a2.h();
            auiw h2 = a.h();
            if ((h != null || h2 != null) && (h == null || h2 == null || !h.equals(h2))) {
                k(ckhu.j, valueOf, "getNotificationOptOutUiInfo");
            }
            if (a2.t() != a.t()) {
                k(ckhu.f, valueOf, "shouldDisplayAccountNameIfMultipleAccountsOnDevice");
            }
            dbsg<dkmm> u = a2.u(this.e);
            dbsg<dkmm> u2 = a.u(this.e);
            if ((u != null || u2 != null) && (u == null || u2 == null || !u.equals(u2))) {
                k(ckhu.g, valueOf, "getInlineFeedbackType");
            }
            if (a2.e(this.e) != a.e(this.e)) {
                k(ckhu.l, valueOf, "isNotificationEnabled");
            }
            ddos l = a2.l(this.e);
            ddos l2 = a.l(this.e);
            if ((l != null || l2 != null) && (l == null || l2 == null || !l.equals(l2))) {
                k(ckhu.p, valueOf, "getBackoffType");
            }
            auik k = a2.k(this.e);
            auik k2 = a.k(this.e);
            if ((k != null || k2 != null) && (k == null || k2 == null || !k.equals(k2))) {
                k(ckhu.o, valueOf, "getBackoffInfo");
            }
            if (a2.m(this.e) != a.m(this.e)) {
                k(ckhu.q, valueOf, "shouldSuppressNotificationForCounterFactual");
            }
            if (a2.e(this.e) != a.e(this.e) && a2.f() == a.f()) {
                k(ckhu.e, valueOf, "isNotificationEnabledForUserWithParameters");
            }
        }
        if (this.c.b(i)) {
            return this.a.a(i, this.b.a(i));
        }
        return this.b.a(i);
    }

    public final dcdn<Integer, aujb> f() {
        return j(true);
    }

    public final dcdn<Integer, aujb> g() {
        return j(false);
    }

    public final dcep<Integer> h(dbsl<Integer> dbslVar) {
        dcen N = dcep.N();
        dced<Integer, Integer> dcedVar = this.b.c;
        autu autuVar = this.a;
        HashMap hashMap = new HashMap();
        dcdc<diyf> c = autu.c(autuVar.a);
        int size = c.size();
        for (int i = 0; i < size; i++) {
            diyf diyfVar = c.get(i);
            Integer valueOf = Integer.valueOf(diyfVar.b);
            if (!hashMap.containsKey(valueOf)) {
                hashMap.put(valueOf, Integer.valueOf(diyfVar.g));
            }
        }
        dcep<Integer> a = this.c.a();
        dcen N2 = dcep.N();
        N2.i(dcedVar.J());
        N2.i(hashMap.keySet());
        dcpd it = N2.f().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (dbslVar.a(num)) {
                dccr<Integer> h = dcedVar.h(num);
                Integer num2 = (Integer) hashMap.get(num);
                if (h.size() != 1 || !h.iterator().next().equals(num2)) {
                    k(ckhu.a, num, "extensionId");
                }
                if (!a.contains(num) || num2 == null) {
                    N.i(h);
                } else {
                    N.b(num2);
                }
            }
        }
        N.i(dcbg.c(auiy.values()).o(ausw.a).s(ausx.a).B());
        return N.f();
    }

    public final <F> F i(dbty<F> dbtyVar, dbty<F> dbtyVar2, Integer num, ckgz ckgzVar, String str) {
        F f;
        F a = dbtyVar.a();
        try {
            f = dbtyVar2.a();
            if (a != f) {
                k(ckgzVar, num, str);
            }
        } catch (RuntimeException e) {
            dcqe.b.u(TimeUnit.MINUTES);
            e.getMessage();
            f = a;
        }
        return this.c.b(num.intValue()) ? f : a;
    }
}

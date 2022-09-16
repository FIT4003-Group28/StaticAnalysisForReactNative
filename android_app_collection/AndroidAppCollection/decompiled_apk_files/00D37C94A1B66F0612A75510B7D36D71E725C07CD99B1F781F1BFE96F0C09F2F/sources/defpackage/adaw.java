package defpackage;
/* compiled from: PG */
/* renamed from: adaw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adaw implements Runnable {
    public final /* synthetic */ adbe a;
    private final /* synthetic */ int b;

    public /* synthetic */ adaw(adbe adbeVar) {
        this.a = adbeVar;
    }

    public /* synthetic */ adaw(adbe adbeVar, int i) {
        this.b = i;
        this.a = adbeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        if (r5 == null) goto L42;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1b
            if (r0 == r1) goto L16
            adbe r0 = r12.a
            java.util.Set r0 = r0.i
            j$.util.stream.Stream r0 = j$.util.Collection.EL.stream(r0)
            khv r1 = defpackage.khv.l
            r0.forEach(r1)
            return
        L16:
            adbe r0 = r12.a
            r0.l = r2
            return
        L1b:
            adbe r0 = r12.a
            adwc r3 = r0.n
            android.content.SharedPreferences r4 = r3.d
            java.lang.String r5 = "UsbCastDiscovery"
            boolean r4 = r4.getBoolean(r5, r2)
            if (r4 == 0) goto L6f
            azqb r4 = r3.b
            java.lang.Object r4 = r4.get()
            yrj r4 = (defpackage.yrj) r4
            java.util.List r4 = r4.h()
            java.util.Iterator r4 = r4.iterator()
        L39:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6c
            java.lang.Object r5 = r4.next()
            yrf r5 = (defpackage.yrf) r5
            java.lang.String r6 = r5.b()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r7 = r6.length()
            if (r7 == 0) goto L58
            java.lang.String r7 = "interface name: "
            r7.concat(r6)
        L58:
            java.lang.String r6 = r5.b()
            java.lang.String r7 = "rndis0"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L39
            java.lang.String r4 = defpackage.adwc.a
            java.lang.String r6 = "found usb tethering"
            defpackage.zep.h(r4, r6)
            goto L6d
        L6c:
            r5 = 0
        L6d:
            if (r5 != 0) goto L73
        L6f:
            yrf r5 = r3.a()
        L73:
            if (r5 != 0) goto L78
            r0.l = r2
            return
        L78:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.a()
            adbq r4 = r0.m
            r6 = 262144(0x40000, float:3.67342E-40)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            adbp r4 = (defpackage.adbp) r4
            java.net.MulticastSocket r4 = r4.a(r5, r6)
            r5 = 2
            if (r4 == 0) goto Le6
            r6 = 0
        L92:
            r7 = 3
            if (r6 >= r7) goto La7
            java.util.concurrent.ScheduledExecutorService r7 = r0.f
            adbd r8 = new adbd
            r8.<init>(r4)
            int r9 = r6 * 300
            long r9 = (long) r9
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            r7.schedule(r8, r9, r11)
            int r6 = r6 + 1
            goto L92
        La7:
            adba r6 = new adba
            r6.<init>(r0, r4)
            java.util.concurrent.ScheduledExecutorService r7 = r0.f
            ankt r6 = defpackage.anlz.t(r6, r7)
            r3.add(r6)
            ankg r6 = defpackage.anlz.j(r3)
            adaw r7 = new adaw
            r7.<init>(r0, r5)
            java.util.concurrent.ScheduledExecutorService r5 = r0.f
            ankt r5 = r6.c(r7, r5)
            adaw r6 = new adaw
            r6.<init>(r0, r1)
            java.util.concurrent.ScheduledExecutorService r1 = r0.f
            r5.qY(r6, r1)
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto Le3
            java.util.concurrent.ScheduledExecutorService r1 = r0.f
            adbc r2 = new adbc
            r2.<init>(r0, r3, r4)
            r3 = 2
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1.schedule(r2, r3, r0)
            return
        Le3:
            r0.l = r2
            return
        Le6:
            r0 = 21
            java.lang.String r1 = "failed to create a multicast socket, not discovering DIAL devices"
            defpackage.afus.b(r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adaw.run():void");
    }
}

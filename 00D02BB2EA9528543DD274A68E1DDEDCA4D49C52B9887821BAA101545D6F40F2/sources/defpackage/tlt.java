package defpackage;
/* compiled from: PG */
/* renamed from: tlt  reason: default package */
/* loaded from: classes7.dex */
public final class tlt extends tlo {
    private volatile transient boolean b;
    private volatile transient boolean c;
    private volatile transient amvh d;
    private volatile transient dbsg<dosz> e;

    public tlt(boolean z, boolean z2, eapd eapdVar, dwaw dwawVar, amsy amsyVar, eapd eapdVar2, dcdc<amvh> dcdcVar) {
        super(z, z2, eapdVar, dwawVar, amsyVar, eapdVar2, dcdcVar);
    }

    @Override // defpackage.tme
    public final boolean h() {
        if (!this.c) {
            synchronized (this) {
                if (!this.c) {
                    this.b = this.a.size() > 2;
                    this.c = true;
                }
            }
        }
        return this.b;
    }

    @Override // defpackage.tme
    public final amvh i() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = this.a.get(1);
                    if (this.d == null) {
                        throw new NullPointerException("nextDestination() cannot return null");
                    }
                }
            }
        }
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004e A[Catch: all -> 0x0058, TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x0011, B:10:0x0013, B:12:0x001a, B:14:0x0022, B:15:0x0024, B:17:0x0028, B:18:0x002a, B:20:0x0030, B:22:0x0038, B:23:0x003a, B:25:0x003e, B:26:0x0040, B:28:0x0047, B:31:0x004e, B:32:0x0055, B:27:0x0045, B:33:0x0056), top: B:40:0x0005 }] */
    @Override // defpackage.tme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dbsg<defpackage.dosz> j() {
        /*
            r2 = this;
            dbsg<dosz> r0 = r2.e
            if (r0 != 0) goto L5b
            monitor-enter(r2)
            dbsg<dosz> r0 = r2.e     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L56
            dvzy r0 = r2.k()     // Catch: java.lang.Throwable -> L58
            dwao r0 = r0.g     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L13
            dwao r0 = defpackage.dwao.R     // Catch: java.lang.Throwable -> L58
        L13:
            int r0 = r0.a     // Catch: java.lang.Throwable -> L58
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = r0 & r1
            if (r0 == 0) goto L45
            dvzy r0 = r2.k()     // Catch: java.lang.Throwable -> L58
            dwao r0 = r0.g     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L24
            dwao r0 = defpackage.dwao.R     // Catch: java.lang.Throwable -> L58
        L24:
            dosz r0 = r0.B     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L2a
            dosz r0 = defpackage.dosz.e     // Catch: java.lang.Throwable -> L58
        L2a:
            int r0 = r0.a     // Catch: java.lang.Throwable -> L58
            r0 = r0 & 4
            if (r0 == 0) goto L45
            dvzy r0 = r2.k()     // Catch: java.lang.Throwable -> L58
            dwao r0 = r0.g     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L3a
            dwao r0 = defpackage.dwao.R     // Catch: java.lang.Throwable -> L58
        L3a:
            dosz r0 = r0.B     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L40
            dosz r0 = defpackage.dosz.e     // Catch: java.lang.Throwable -> L58
        L40:
            dbsg r0 = defpackage.dbsg.i(r0)     // Catch: java.lang.Throwable -> L58
            goto L47
        L45:
            dbpy<java.lang.Object> r0 = defpackage.dbpy.a     // Catch: java.lang.Throwable -> L58
        L47:
            r2.e = r0     // Catch: java.lang.Throwable -> L58
            dbsg<dosz> r0 = r2.e     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L4e
            goto L56
        L4e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = "anchoredTime() cannot return null"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L56:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L58
            goto L5b
        L58:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L58
            throw r0
        L5b:
            dbsg<dosz> r0 = r2.e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tlt.j():dbsg");
    }
}

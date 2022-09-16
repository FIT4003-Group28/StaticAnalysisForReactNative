package com.google.android.libraries.youtube.player.features.prefetch;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class WillAutonavInformer implements f, ynl {
    public final yve a;
    public final afvn b;
    public final ayoi c;
    public final azpq d;
    public final boolean e;
    public final boolean f;
    public boolean g = true;
    public boolean h;
    public final vzc i;
    private final yni j;

    public final boolean g(awvc awvcVar) {
        return (awvcVar.b & 4) != 0 ? awvcVar.e : this.g;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                if (!this.h && !this.e && !this.f) {
                    return null;
                }
                this.d.c(true);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{afwb.class};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.j.m(this);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.j.g(this);
    }

    public WillAutonavInformer(yve yveVar, yni yniVar, vzc vzcVar, afvn afvnVar, ampq ampqVar, axxu axxuVar) {
        Boolean bool;
        boolean z = false;
        Boolean bool2 = false;
        this.h = false;
        this.a = yveVar;
        this.j = yniVar;
        this.i = vzcVar;
        this.b = afvnVar;
        azpq e = azpq.e();
        this.d = e;
        this.h = ((Boolean) ampqVar.e(bool2)).booleanValue();
        aqxe aqxeVar = axxuVar.b.b().C;
        aqxeVar = aqxeVar == null ? aqxe.a : aqxeVar;
        if (aqxeVar.a(45355556L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45355556L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45355556L);
            bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : false);
        } else {
            bool = bool2;
        }
        boolean booleanValue = bool.booleanValue();
        this.e = booleanValue;
        aqxe aqxeVar2 = axxuVar.b.b().C;
        aqxeVar2 = aqxeVar2 == null ? aqxe.a : aqxeVar2;
        if (aqxeVar2.a(45355557L)) {
            aoqp aoqpVar2 = aqxeVar2.b;
            if (!aoqpVar2.containsKey(45355557L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar2 = (aqxf) aoqpVar2.get(45355557L);
            bool2 = Boolean.valueOf(aqxfVar2.b == 1 ? ((Boolean) aqxfVar2.c).booleanValue() : z);
        }
        boolean booleanValue2 = bool2.booleanValue();
        this.f = booleanValue2;
        ayoi aa = e.X(azpj.a()).V(new ayqe() { // from class: aief
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
                if (r3.a.g(r5) == false) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x007b, code lost:
                if (r0 == false) goto L43;
             */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0041 A[Catch: IOException | SecurityException | qhr -> 0x007e, qhr -> 0x0080, IOException -> 0x0082, TryCatch #2 {IOException | SecurityException | qhr -> 0x007e, blocks: (B:3:0x0006, B:5:0x0010, B:13:0x0027, B:16:0x002c, B:19:0x0033, B:23:0x003d, B:25:0x0041, B:28:0x0048, B:31:0x004f, B:35:0x005a, B:37:0x005e, B:40:0x0065, B:43:0x006c, B:8:0x0017, B:10:0x001d), top: B:60:0x0006 }] */
            /* JADX WARN: Removed duplicated region for block: B:37:0x005e A[Catch: IOException | SecurityException | qhr -> 0x007e, qhr -> 0x0080, IOException -> 0x0082, TryCatch #2 {IOException | SecurityException | qhr -> 0x007e, blocks: (B:3:0x0006, B:5:0x0010, B:13:0x0027, B:16:0x002c, B:19:0x0033, B:23:0x003d, B:25:0x0041, B:28:0x0048, B:31:0x004f, B:35:0x005a, B:37:0x005e, B:40:0x0065, B:43:0x006c, B:8:0x0017, B:10:0x001d), top: B:60:0x0006 }] */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
            @Override // defpackage.ayqe
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(java.lang.Object r7) {
                /*
                    r6 = this;
                    com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer r0 = com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer.this
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    r7 = 1
                    r1 = 0
                    afvn r2 = r0.b     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    afvm r2 = r2.c()     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    boolean r3 = r0.h     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    if (r3 == 0) goto L3c
                    vzc r3 = r0.i     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    boolean r4 = r2 instanceof com.google.android.libraries.youtube.account.identity.AccountIdentity     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    if (r4 != 0) goto L17
                    goto L27
                L17:
                    android.accounts.Account r5 = r3.b(r2)     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    if (r5 == 0) goto L27
                    whp r3 = r3.a     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    boolean r3 = r3.g(r5)     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    if (r3 == 0) goto L27
                L25:
                    r3 = 1
                    goto L3d
                L27:
                    vzc r3 = r0.i     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    if (r4 != 0) goto L2c
                    goto L3c
                L2c:
                    android.accounts.Account r4 = r3.b(r2)     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    if (r4 != 0) goto L33
                    goto L3c
                L33:
                    whp r3 = r3.a     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    boolean r3 = r3.f(r4)     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    if (r3 == 0) goto L3c
                    goto L25
                L3c:
                    r3 = 0
                L3d:
                    boolean r4 = r0.e     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    if (r4 == 0) goto L59
                    vzc r4 = r0.i     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    boolean r5 = r2 instanceof com.google.android.libraries.youtube.account.identity.AccountIdentity     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    if (r5 != 0) goto L48
                    goto L59
                L48:
                    android.accounts.Account r5 = r4.b(r2)     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    if (r5 != 0) goto L4f
                    goto L59
                L4f:
                    whp r4 = r4.a     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    boolean r4 = r4.e(r5)     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    if (r4 == 0) goto L59
                    r4 = 1
                    goto L5a
                L59:
                    r4 = 0
                L5a:
                    boolean r5 = r0.f     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    if (r5 == 0) goto L76
                    vzc r0 = r0.i     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    boolean r5 = r2 instanceof com.google.android.libraries.youtube.account.identity.AccountIdentity     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    if (r5 != 0) goto L65
                    goto L76
                L65:
                    android.accounts.Account r2 = r0.b(r2)     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    if (r2 != 0) goto L6c
                    goto L76
                L6c:
                    whp r0 = r0.a     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    boolean r0 = r0.d(r2)     // Catch: java.lang.SecurityException -> L7e defpackage.qhr -> L80 java.io.IOException -> L82
                    if (r0 == 0) goto L76
                    r0 = 1
                    goto L77
                L76:
                    r0 = 0
                L77:
                    if (r3 != 0) goto L88
                    if (r4 != 0) goto L88
                    if (r0 == 0) goto L89
                    goto L88
                L7e:
                    r0 = move-exception
                    goto L83
                L80:
                    r0 = move-exception
                    goto L83
                L82:
                    r0 = move-exception
                L83:
                    java.lang.String r1 = "WillAutonavInformer"
                    defpackage.zep.d(r1, r0)
                L88:
                    r1 = 1
                L89:
                    r7 = r7 ^ r1
                    java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aief.a(java.lang.Object):java.lang.Object");
            }
        }).aG(ayrb.d, new aiee(this), ayrb.c).X(aypa.a()).F(new aiee(this, 1)).aa();
        this.c = aa;
        aa.ar();
        if (this.h || booleanValue || booleanValue2) {
            e.c(true);
        }
    }
}

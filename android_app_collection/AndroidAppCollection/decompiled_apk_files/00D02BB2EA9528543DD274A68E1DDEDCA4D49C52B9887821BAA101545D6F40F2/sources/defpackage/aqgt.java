package defpackage;

import android.content.Context;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: aqgt  reason: default package */
/* loaded from: classes2.dex */
public final class aqgt implements aqgv {
    public final ckcw a;
    private final Context b;
    private final btvo c;
    private final bvjj d;
    private final aqav e;
    private final aqgq f;
    private final aqgr g;

    public aqgt(Context context, ckcw ckcwVar, btvo btvoVar, bvjj bvjjVar, aqav aqavVar, aqgq aqgqVar, aqgr aqgrVar) {
        this.b = context;
        this.a = ckcwVar;
        this.c = btvoVar;
        this.d = bvjjVar;
        this.e = aqavVar;
        this.f = aqgqVar;
        this.g = aqgrVar;
    }

    private final void d(Throwable th) {
        ckco ckcoVar = (ckco) this.a.a(ckgs.e);
        if (th == null) {
            ckcoVar.a(ckgr.a(2));
        } else if (th instanceof IOException) {
            ckcoVar.a(ckgr.a(3));
        } else {
            ckcoVar.a(ckgr.a(1));
        }
    }

    @Override // defpackage.aqgv
    public final void a() {
        long w = this.d.w(bvjk.iA, Long.MIN_VALUE);
        long c = bvoc.c(this.b);
        if (w != c || c == 0) {
            b();
        }
    }

    @Override // defpackage.aqgv
    public final void b() {
        this.g.c();
        dkhl dkhlVar = this.c.getBusinessMessagingParameters().G;
        if (dkhlVar == null) {
            dkhlVar = dkhl.e;
        }
        if (!dkhlVar.d) {
            return;
        }
        final csuu b = this.e.b();
        deew.h(b.c(), new dbrn(this, b) { // from class: aqgs
            private final aqgt a;
            private final csuu b;

            {
                this.a = this;
                this.b = b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
                r4 = r9;
             */
            @Override // defpackage.dbrn
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(java.lang.Object r15) {
                /*
                    r14 = this;
                    aqgt r0 = r14.a
                    csuu r1 = r14.b
                    dcdc r15 = (defpackage.dcdc) r15
                    int r2 = r15.size()
                    r3 = 0
                    r4 = 0
                Lc:
                    r5 = 0
                    if (r4 >= r2) goto L90
                    java.lang.Object r6 = r15.get(r4)
                    ctyy r6 = (defpackage.ctyy) r6
                    ctzb r6 = r6.b()
                    dcdc r6 = r6.f()
                    int r7 = r6.size()
                    r8 = 0
                L22:
                    int r9 = r4 + 1
                    if (r8 >= r7) goto L8d
                    java.lang.Object r9 = r6.get(r8)
                    com.google.android.libraries.messaging.lighter.model.ContactId r9 = (com.google.android.libraries.messaging.lighter.model.ContactId) r9
                    r10 = r1
                    ctdr r10 = (defpackage.ctdr) r10
                    cusx r11 = r10.b
                    dbsg r9 = r11.b(r9)
                    boolean r11 = r9.a()
                    r12 = 3
                    r13 = 1
                    if (r11 != 0) goto L4d
                    csuq r9 = defpackage.csur.b()
                    r9.b(r12)
                    csur r9 = r9.a()
                    dehn r9 = defpackage.deha.a(r9)
                    goto L5f
                L4d:
                    java.lang.Object r9 = r9.b()
                    ctyy r9 = (defpackage.ctyy) r9
                    dehn r9 = r10.d(r9, r13)
                    dbrn r10 = defpackage.ctdj.a
                    dege r11 = defpackage.dege.a
                    dehn r9 = defpackage.deew.h(r9, r10, r11)
                L5f:
                    r10 = 2
                    java.lang.Object r9 = r9.get()     // Catch: java.lang.Throwable -> L7a
                    csur r9 = (defpackage.csur) r9     // Catch: java.lang.Throwable -> L7a
                    int r9 = r9.a()     // Catch: java.lang.Throwable -> L7a
                    int r11 = r9 + (-1)
                    if (r9 == 0) goto L79
                    if (r11 == r13) goto L77
                    if (r11 == r10) goto L7b
                    if (r11 == r12) goto L75
                    goto L7a
                L75:
                    r12 = 4
                    goto L7b
                L77:
                    r12 = 2
                    goto L7b
                L79:
                    throw r5     // Catch: java.lang.Throwable -> L7a
                L7a:
                    r12 = 1
                L7b:
                    ckcw r9 = r0.a
                    ckgz r10 = defpackage.ckgs.h
                    java.lang.Object r9 = r9.a(r10)
                    ckco r9 = (defpackage.ckco) r9
                    int r12 = r12 + (-1)
                    r9.a(r12)
                    int r8 = r8 + 1
                    goto L22
                L8d:
                    r4 = r9
                    goto Lc
                L90:
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aqgs.a(java.lang.Object):java.lang.Object");
            }
        }, dege.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e A[Catch: all -> 0x0060, TryCatch #1 {all -> 0x0060, blocks: (B:12:0x0024, B:14:0x0030, B:15:0x0032, B:18:0x0038, B:19:0x0043, B:21:0x004b, B:22:0x0050, B:27:0x0058, B:29:0x005e, B:30:0x005f), top: B:34:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #1 {all -> 0x0060, blocks: (B:12:0x0024, B:14:0x0030, B:15:0x0032, B:18:0x0038, B:19:0x0043, B:21:0x004b, B:22:0x0050, B:27:0x0058, B:29:0x005e, B:30:0x005f), top: B:34:0x0024 }] */
    @Override // defpackage.aqgv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c() {
        /*
            r5 = this;
            btvo r0 = r5.c
            dkht r0 = r0.getBusinessMessagingParameters()
            dkhl r0 = r0.G
            if (r0 != 0) goto Lc
            dkhl r0 = defpackage.dkhl.e
        Lc:
            boolean r0 = r0.a
            if (r0 == 0) goto L24
            aqgr r1 = r5.g
            dbsg r1 = r1.a()
            boolean r2 = r1.a()
            if (r2 != 0) goto L1d
            goto L24
        L1d:
            java.lang.Object r0 = r1.b()
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L24:
            aqgq r1 = r5.f     // Catch: java.lang.Throwable -> L60
            btvo r2 = r1.a     // Catch: java.lang.Throwable -> L60
            dkht r2 = r2.getBusinessMessagingParameters()     // Catch: java.lang.Throwable -> L60
            dkhl r2 = r2.G     // Catch: java.lang.Throwable -> L60
            if (r2 != 0) goto L32
            dkhl r2 = defpackage.dkhl.e     // Catch: java.lang.Throwable -> L60
        L32:
            int r2 = r2.b     // Catch: java.lang.Throwable -> L60
            if (r2 >= 0) goto L38
            r2 = 12
        L38:
            deig r3 = defpackage.deig.d()     // Catch: java.lang.Throwable -> L60
            bvny r4 = defpackage.aqgq.a()     // Catch: java.lang.Throwable -> L60
            r1.b(r3, r4, r2)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r1 = r3.get()     // Catch: java.util.concurrent.ExecutionException -> L55 java.lang.InterruptedException -> L57 java.lang.Throwable -> L60
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.util.concurrent.ExecutionException -> L55 java.lang.InterruptedException -> L57 java.lang.Throwable -> L60
            if (r0 == 0) goto L50
            aqgr r0 = r5.g     // Catch: java.lang.Throwable -> L60
            r0.b(r1)     // Catch: java.lang.Throwable -> L60
        L50:
            r0 = 0
            r5.d(r0)     // Catch: java.lang.Throwable -> L60
            return r1
        L55:
            r0 = move-exception
            goto L58
        L57:
            r0 = move-exception
        L58:
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L5f
            throw r1     // Catch: java.lang.Throwable -> L60
        L5f:
            throw r0     // Catch: java.lang.Throwable -> L60
        L60:
            r0 = move-exception
            r5.d(r0)
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqgt.c():java.lang.String");
    }
}

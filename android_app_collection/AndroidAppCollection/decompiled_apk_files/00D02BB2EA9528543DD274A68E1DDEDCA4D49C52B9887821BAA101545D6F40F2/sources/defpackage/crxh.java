package defpackage;

import android.app.Service;
import android.content.Intent;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crxh  reason: default package */
/* loaded from: classes5.dex */
public abstract class crxh<OptionT> implements crxl<OptionT> {
    protected final crxb a;
    protected final Service b;
    protected final dtbh c;
    protected final crvc d;
    protected final crvv e;
    protected final crxk f;
    public final crvs g;
    protected final crxq h;
    protected int j = 1;
    @dzsi
    protected String i = null;

    /* JADX INFO: Access modifiers changed from: protected */
    public crxh(dtbh dtbhVar, crxg crxgVar) {
        this.c = dtbhVar;
        this.b = crxgVar.a();
        this.e = crxgVar.b();
        this.d = crxgVar.c();
        this.a = crxgVar.e();
        this.f = crxgVar.d();
        this.g = crxgVar.f().b(crxgVar.e(), dtbhVar);
        this.h = new crxq(crxgVar.a());
    }

    public final crua Su(crtx crtxVar) {
        crtt a = a();
        if (a.c) {
            a.bF();
            a.c = false;
        }
        crua cruaVar = (crua) a.b;
        crua cruaVar2 = crua.o;
        cruaVar.e = crtxVar.l;
        cruaVar.a |= 8;
        return a.bK();
    }

    public final void Sv(crua cruaVar) {
        dsqp dsqpVar = (dsqp) cruaVar.cu(5);
        dsqpVar.bC(cruaVar);
        crtt crttVar = (crtt) dsqpVar;
        String a = this.a.a();
        if (crttVar.c) {
            crttVar.bF();
            crttVar.c = false;
        }
        crua cruaVar2 = (crua) crttVar.b;
        crua cruaVar3 = crua.o;
        a.getClass();
        cruaVar2.a |= 1;
        cruaVar2.b = a;
        crua bK = crttVar.bK();
        Intent intent = new Intent("geo.uploader.upload_progress_broadcast_action");
        intent.putExtra("geo.uploader.upload_state_key", bK.bS());
        int i = bK.e;
        crtx crtxVar = crtx.UNKNOWN;
        e();
        double d = bK.h;
        apt.a(this.b).d(intent);
        this.f.c(bK);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public crtt a() {
        crtt bZ = crua.o.bZ();
        String e = e();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        crua cruaVar = (crua) bZ.b;
        e.getClass();
        cruaVar.a |= 1;
        cruaVar.b = e;
        return bZ;
    }

    @Override // defpackage.crxl
    public abstract OptionT b();

    @Override // defpackage.crxl
    public final synchronized void c(ExecutorService executorService) {
        if (this.j != 1) {
            return;
        }
        this.j = 2;
        executorService.execute(this);
    }

    @Override // defpackage.crxl
    public final String e() {
        return this.a.a();
    }

    @Override // defpackage.crxl
    public final dtbh f() {
        return this.c;
    }

    @Override // defpackage.crxl
    public final crxb g() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071 A[Catch: OperationCanceledException -> 0x00ba, crxr -> 0x00be, TRY_LEAVE, TryCatch #4 {OperationCanceledException -> 0x00ba, crxr -> 0x00be, blocks: (B:3:0x0002, B:5:0x0014, B:6:0x001b, B:8:0x0025, B:11:0x0038, B:15:0x0065, B:17:0x0071, B:12:0x003b, B:14:0x0051, B:19:0x0077, B:20:0x007e, B:22:0x0080, B:24:0x008c, B:25:0x0091, B:26:0x0092, B:27:0x0099, B:29:0x009b, B:30:0x00a5, B:32:0x00a7, B:33:0x00b1, B:34:0x00b2, B:35:0x00b9), top: B:44:0x0002, inners: #3 }] */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String i() {
        /*
            r11 = this;
            java.lang.String r0 = "ac2dm"
            crvc r1 = r11.d     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            crxb r2 = r11.a     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            crti r2 = r2.b()     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            java.lang.String r2 = r2.b     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r2)     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            if (r3 != 0) goto Lb2
            android.accounts.Account r3 = new android.accounts.Account     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            java.lang.String r4 = "com.google"
            r3.<init>(r2, r4)     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            java.util.Map<java.lang.String, crvb> r4 = r1.e     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            java.lang.Object r4 = r4.get(r2)     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            crvb r4 = (defpackage.crvb) r4     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            if (r4 == 0) goto L3b
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            java.lang.Long r7 = r4.b     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            long r7 = r7.longValue()     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            r9 = 300000(0x493e0, double:1.482197E-318)
            long r7 = r7 + r9
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L38
            goto L3b
        L38:
            java.lang.String r0 = r4.a     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            goto L65
        L3b:
            crvd r4 = r1.c     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            android.content.Context r4 = r1.b     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            java.lang.String r5 = defpackage.crvd.a(r4, r3, r0)     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            defpackage.cmrb.c(r4, r5)     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            defpackage.crvd.a(r4, r3, r0)     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            android.accounts.AccountManager r0 = r1.d     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            boolean r0 = defpackage.crvc.a(r0, r2)     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            if (r0 != 0) goto L77
            crvd r0 = r1.c     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            android.content.Context r0 = r1.b     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            java.lang.String r4 = "oauth2:https://www.googleapis.com/auth/dragonfly"
            java.lang.String r0 = defpackage.crvd.a(r0, r3, r4)     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            java.util.Map<java.lang.String, crvb> r1 = r1.e     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            crvb r3 = new crvb     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            r3.<init>(r0)     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            r1.put(r2, r3)     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
        L65:
            java.lang.String r1 = "Token retrieved: "
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            int r2 = r2.length()     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            if (r2 != 0) goto L76
            java.lang.String r2 = new java.lang.String     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            r2.<init>(r1)     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
        L76:
            return r0
        L77:
            crxr r0 = new crxr     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            dgpm r1 = defpackage.dgpm.AUTHENTICATION_GOOGLE_AUTH_EXCEPTION     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            r0.<init>(r1)     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            throw r0     // Catch: defpackage.cmra -> L7f java.io.IOException -> L9a defpackage.cmrl -> La6 android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
        L7f:
            r0 = move-exception
            java.lang.String r1 = "Interrupted"
            java.lang.String r0 = r0.getMessage()     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            boolean r0 = r1.equals(r0)     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            if (r0 == 0) goto L92
            android.accounts.OperationCanceledException r0 = new android.accounts.OperationCanceledException     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            r0.<init>()     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            throw r0     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
        L92:
            crxr r0 = new crxr     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            dgpm r1 = defpackage.dgpm.AUTHENTICATION_GOOGLE_AUTH_EXCEPTION     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            r0.<init>(r1)     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            throw r0     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
        L9a:
            r0 = move-exception
            r0.getMessage()     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            crxr r0 = new crxr     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            dgpm r1 = defpackage.dgpm.AUTHENTICATION_IO_EXCEPTION     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            r0.<init>(r1)     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            throw r0     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
        La6:
            r0 = move-exception
            r0.getMessage()     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            crxr r0 = new crxr     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            dgpm r1 = defpackage.dgpm.AUTHENTICATION_USER_RECOVERABLE_NOTIFIED_EXCEPTION     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            r0.<init>(r1)     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            throw r0     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
        Lb2:
            crxr r0 = new crxr     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            dgpm r1 = defpackage.dgpm.AUTHENTICATION_FAILURE     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            r0.<init>(r1)     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
            throw r0     // Catch: android.accounts.OperationCanceledException -> Lba defpackage.crxr -> Lbe
        Lba:
            r11.n()
            goto Lc9
        Lbe:
            r0 = move-exception
            dgpm r1 = r0.b
            if (r1 == 0) goto Lc6
            r11.k(r1, r0)
        Lc6:
            r11.o(r0)
        Lc9:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crxh.i():java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dbsb j() {
        dbsb b = dbsc.b(this);
        b.b("RequestInfo", this.a);
        b.b("Operation", this.c);
        b.b("Option", b());
        return b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(dgpm dgpmVar, @dzsi Exception exc) {
        dbsb j = j();
        j.b("ClientException", dgpmVar);
        j.b("Exception details", exc);
        j.toString();
        this.g.k(dgpmVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int l(int i) {
        return this.f.b().m << i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int m() {
        return Math.max(0, Math.min(this.f.b().k ? this.f.b().l : 0, 20));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n() {
        this.g.m(true);
        Sv(Su(crtx.CANCELLED));
        this.f.a(this, crtx.CANCELLED);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(crxr crxrVar) {
        this.c.toString();
        this.g.j();
        crtx crtxVar = crxrVar.a;
        crtt a = a();
        if (a.c) {
            a.bF();
            a.c = false;
        }
        crua cruaVar = (crua) a.b;
        crua cruaVar2 = crua.o;
        cruaVar.e = crtxVar.l;
        cruaVar.a |= 8;
        cruc a2 = crxrVar.a();
        if (a.c) {
            a.bF();
            a.c = false;
        }
        crua cruaVar3 = (crua) a.b;
        cruaVar3.n = a2.q;
        cruaVar3.a |= 2048;
        Sv(a.bK());
        this.f.a(this, crtxVar);
    }
}

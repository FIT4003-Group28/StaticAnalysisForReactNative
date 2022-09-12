package defpackage;

import android.net.Uri;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: ccfx  reason: default package */
/* loaded from: classes.dex */
public final class ccfx extends afhs<drry> {
    public static final Pattern b = Pattern.compile("/maps/contrib/[0-9]*/(contribute|todolist)/?.*");
    public static final Pattern c = Pattern.compile("/maps/contrib/?$");
    public static final dbsl<afga> j = ccfv.a;
    public final eeu d;
    public final akfa e;
    public final akfc i;
    private final cfrt k;
    private final chnm l;
    private final gga m;
    private final bvjj n;
    private final auhi o;
    private final bvrb p;
    @dzsi
    private final Integer q;
    @dzsi
    private final dpyv r;
    private final dwyd s;
    private final ccem t;
    private final Uri u;
    @dzsi
    private final String v;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ccfx(defpackage.cfrt r2, defpackage.chnm r3, defpackage.gga r4, defpackage.eeu r5, defpackage.akfa r6, defpackage.akfc r7, defpackage.bvjj r8, defpackage.auhi r9, defpackage.bvrb r10, defpackage.ccem r11, android.content.Intent r12, @defpackage.dzsi java.lang.String r13) {
        /*
            r1 = this;
            afid r0 = defpackage.afid.TODO_LIST
            r1.<init>(r12, r13, r0)
            r1.m = r4
            r1.d = r5
            r1.k = r2
            r1.l = r3
            r1.e = r6
            r1.i = r7
            r1.n = r8
            r1.o = r9
            r1.p = r10
            android.net.Uri r2 = defpackage.afhg.b(r12)
            r1.u = r2
            java.lang.String r3 = r2.getPath()
            r1.v = r3
            java.lang.String r3 = "entry"
            java.lang.String r2 = r2.getQueryParameter(r3)
            boolean r3 = defpackage.dbsj.d(r2)
            if (r3 != 0) goto L9c
            int r3 = r2.hashCode()
            r4 = 100793(0x189b9, float:1.41241E-40)
            r5 = 1
            r6 = 0
            if (r3 == r4) goto L4a
            r4 = 102912752(0x62252f0, float:3.0529746E-35)
            if (r3 == r4) goto L40
            goto L54
        L40:
            java.lang.String r3 = "lgiac"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L54
            r2 = 1
            goto L55
        L4a:
            java.lang.String r3 = "eui"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L54
            r2 = 0
            goto L55
        L54:
            r2 = -1
        L55:
            if (r2 == 0) goto L5f
            if (r2 == r5) goto L5c
            ddcu r2 = defpackage.ddcu.s
            goto L61
        L5c:
            ddcu r2 = defpackage.ddcu.r
            goto L61
        L5f:
            ddcu r2 = defpackage.ddcu.q
        L61:
            ddxx r3 = defpackage.ddxx.j
            dsqp r3 = r3.bZ()
            ddxw r3 = (defpackage.ddxw) r3
            boolean r4 = r3.c
            if (r4 == 0) goto L72
            r3.bF()
            r3.c = r6
        L72:
            MessageType extends dsqw<MessageType, BuilderType> r4 = r3.b
            ddxx r4 = (defpackage.ddxx) r4
            int r7 = r4.a
            r7 = r7 | 128(0x80, float:1.794E-43)
            r4.a = r7
            r4.h = r6
            r5 = r5 | r7
            r4.a = r5
            r4.b = r6
            r5 = r5 | 32
            r4.a = r5
            r4.f = r6
            int r2 = r2.a
            r5 = r5 | 8
            r4.a = r5
            r4.d = r2
            dsqw r2 = r3.bK()
            ddxx r2 = (defpackage.ddxx) r2
            java.lang.String r2 = defpackage.cjrx.b(r2)
            goto L9e
        L9c:
            java.lang.String r2 = ""
        L9e:
            boolean r3 = defpackage.dbsj.d(r2)
            r4 = 0
            if (r3 != 0) goto Lae
            ddho r3 = defpackage.dtxo.cP
            dtxi r3 = (defpackage.dtxi) r3
            int r3 = r3.a
            defpackage.cjqg.i(r12, r3, r2, r4, r4)
        Lae:
            java.lang.Integer r2 = r9.l(r12)
            r1.q = r2
            if (r2 != 0) goto Lb7
            goto Lbf
        Lb7:
            int r2 = r2.intValue()
            dpyv r4 = defpackage.dpyv.b(r2)
        Lbf:
            r1.r = r4
            dwyd r2 = defpackage.dwyd.UNKNOWN_ENTRY_POINT
            int r2 = r2.Z
            java.lang.String r3 = "upload_entry_point"
            int r2 = r12.getIntExtra(r3, r2)
            dwyd r2 = defpackage.dwyd.b(r2)
            r1.s = r2
            r1.t = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccfx.<init>(cfrt, chnm, gga, eeu, akfa, akfc, bvjj, auhi, bvrb, ccem, android.content.Intent, java.lang.String):void");
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        if (this.r != null) {
            return durz.EIT_CONTRIBUTION_NOTIFICATION;
        }
        return durz.EIT_CREATOR_ZONE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afhs
    public final /* bridge */ /* synthetic */ void d(drry drryVar) {
        drry drryVar2 = drryVar;
        if (this.u == null || !this.l.n()) {
            return;
        }
        if (this.k.b()) {
            this.k.a();
        }
        this.l.j(drryVar2, null, this.r, this.s);
        if (this.r == null) {
            return;
        }
        avac.bp(this.m, this.q, this.n, this.p, this.o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afhs
    public final void e(ExecutionException executionException) {
        bvoo.k(executionException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
        if (r2.d.equals(r0) == false) goto L24;
     */
    @Override // defpackage.afhs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void i(defpackage.deig<defpackage.drry> r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.v
            if (r0 != 0) goto L5
            return
        L5:
            chnm r0 = r5.l
            boolean r0 = r0.n()
            if (r0 != 0) goto L1b
            ccem r6 = r5.t
            android.content.Intent r0 = r5.f
            java.lang.String r1 = r5.g
            ccel r6 = r6.a(r0, r1)
            r6.a()
            return
        L1b:
            java.lang.String r0 = r5.v
            java.lang.String r1 = "/maps/contrib/([0-9]*)(/.*)?"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.matches()
            java.lang.String r2 = ""
            if (r1 != 0) goto L31
            r0 = r2
            goto L36
        L31:
            r1 = 1
            java.lang.String r0 = r0.group(r1)
        L36:
            java.lang.String r1 = r5.v
        */
        //  java.lang.String r3 = "/maps/contrib/[0-9]*/(contribute|todolist).*/data=([^/?]*)([/?].*)?"
        /*
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r1 = r3.matcher(r1)
            boolean r3 = r1.matches()
            if (r3 != 0) goto L49
            goto L4e
        L49:
            r2 = 2
            java.lang.String r2 = r1.group(r2)
        L4e:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L57
            drry r1 = defpackage.drry.d
            goto L75
        L57:
            drsp r1 = new drsp
            r1.<init>()
            drrp r3 = defpackage.drrp.d     // Catch: java.lang.Exception -> L73
            dssj r1 = r1.a(r2, r3)     // Catch: java.lang.Exception -> L73
            drrp r1 = (defpackage.drrp) r1     // Catch: java.lang.Exception -> L73
            if (r1 == 0) goto L73
            drrr r1 = r1.c     // Catch: java.lang.Exception -> L73
            if (r1 != 0) goto L6c
            drrr r1 = defpackage.drrr.j     // Catch: java.lang.Exception -> L73
        L6c:
            drry r1 = r1.i     // Catch: java.lang.Exception -> L73
            if (r1 != 0) goto L75
            drry r1 = defpackage.drry.d     // Catch: java.lang.Exception -> L73
            goto L75
        L73:
            drry r1 = defpackage.drry.d
        L75:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L9f
            akfa r2 = r5.e
            btlu r2 = r2.j()
            btlt r3 = defpackage.btlu.i(r2)
            btlt r4 = defpackage.btlt.GOOGLE
            if (r3 != r4) goto L94
            defpackage.dbsk.s(r2)
            java.lang.String r2 = r2.d
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L9f
        L94:
            akfc r2 = r5.i
            ccfw r3 = new ccfw
            r3.<init>(r5, r1, r6)
            r2.f(r0, r3)
            return
        L9f:
            eeu r0 = r5.d
            android.content.Intent r2 = r5.f
            r3 = 0
            java.lang.String r4 = "GMM_ENABLE_ONE_BACK_TAP"
            boolean r2 = r2.getBooleanExtra(r4, r3)
            r0.d(r2)
            r5.l(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccfx.i(deig):void");
    }

    public final void l(drry drryVar, deig<drry> deigVar) {
        this.l.C(drryVar, this.r);
        deigVar.j(drryVar);
    }
}

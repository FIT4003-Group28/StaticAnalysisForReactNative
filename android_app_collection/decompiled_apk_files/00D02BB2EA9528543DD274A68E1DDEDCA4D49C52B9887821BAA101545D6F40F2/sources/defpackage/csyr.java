package defpackage;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: csyr  reason: default package */
/* loaded from: classes5.dex */
public final class csyr implements csui {
    public final Context a;
    private final dehp b = cstu.b().a;
    private final ctgc c;

    public csyr(Context context, ctgc ctgcVar) {
        this.a = context;
        this.c = ctgcVar;
    }

    @Override // defpackage.csui
    public final dehn<Boolean> a(ctyy ctyyVar, int i) {
        return b(ctyyVar, null, i);
    }

    @Override // defpackage.csui
    public final dehn<Boolean> b(ctyy ctyyVar, ConversationId conversationId, int i) {
        switch (i) {
            case 1:
                return cswe.b(cswe.a(this.a).A, this.b);
            case 2:
                dehp dehpVar = this.b;
                final csvo a = csvo.a(this.a);
                a.getClass();
                return dehpVar.c(new Callable(a) { // from class: csyd
                    private final csvo a;

                    {
                        this.a = a;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(this.a.n());
                    }
                });
            case 3:
                dehp dehpVar2 = this.b;
                final csvo a2 = csvo.a(this.a);
                a2.getClass();
                return dehpVar2.c(new Callable(a2) { // from class: csyi
                    private final csvo a;

                    {
                        this.a = a2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(this.a.f());
                    }
                });
            case 4:
                dehp dehpVar3 = this.b;
                final csvo a3 = csvo.a(this.a);
                a3.getClass();
                return dehpVar3.c(new Callable(a3) { // from class: csyj
                    private final csvo a;

                    {
                        this.a = a3;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(this.a.o());
                    }
                });
            case 5:
                dehp dehpVar4 = this.b;
                final csvo a4 = csvo.a(this.a);
                a4.getClass();
                return dehpVar4.c(new Callable(a4) { // from class: csyk
                    private final csvo a;

                    {
                        this.a = a4;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(this.a.p());
                    }
                });
            case 6:
                return cswe.b(cswe.a(this.a).aw, this.b);
            case 7:
                dehp dehpVar5 = this.b;
                final csvo a5 = csvo.a(this.a);
                a5.getClass();
                return dehpVar5.c(new Callable(a5) { // from class: csyl
                    private final csvo a;

                    {
                        this.a = a5;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(csvo.v(dxzy.a.a().j()));
                    }
                });
            case 8:
                dehp dehpVar6 = this.b;
                final csvo a6 = csvo.a(this.a);
                a6.getClass();
                return dehpVar6.c(new Callable(a6) { // from class: csym
                    private final csvo a;

                    {
                        this.a = a6;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(this.a.q());
                    }
                });
            case 9:
                dehp dehpVar7 = this.b;
                final csvo a7 = csvo.a(this.a);
                a7.getClass();
                return dehpVar7.c(new Callable(a7) { // from class: csyn
                    private final csvo a;

                    {
                        this.a = a7;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(this.a.l());
                    }
                });
            case 10:
                final boolean g = dxzy.g();
                if (conversationId == null) {
                    return deha.a(Boolean.valueOf(g));
                }
                final deig d = deig.d();
                this.c.a(ctyyVar).r(conversationId).k(new cusr(this, d, g) { // from class: csyh
                    private final csyr a;
                    private final deig b;
                    private final boolean c;

                    {
                        this.a = this;
                        this.b = d;
                        this.c = g;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
                        if (((defpackage.cufp) r6.b()).k().contains(200) == false) goto L10;
                     */
                    @Override // defpackage.cusr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void a(java.lang.Object r6) {
                        /*
                            r5 = this;
                            csyr r0 = r5.a
                            deig r1 = r5.b
                            boolean r2 = r5.c
                            dbsg r6 = (defpackage.dbsg) r6
                            boolean r3 = r6.a()
                            r4 = 0
                            if (r3 != 0) goto L27
                            android.content.Context r6 = r0.a
                            cswe r6 = defpackage.cswe.a(r6)
                            cxju<java.lang.Boolean> r6 = r6.S
                            java.lang.Object r6 = r6.f()
                            java.lang.Boolean r6 = (java.lang.Boolean) r6
                            boolean r6 = r6.booleanValue()
                            if (r6 != 0) goto L3d
                            if (r2 == 0) goto L3d
                            r2 = 1
                            goto L3e
                        L27:
                            java.lang.Object r6 = r6.b()
                            cufp r6 = (defpackage.cufp) r6
                            dcdc r6 = r6.k()
                            r0 = 200(0xc8, float:2.8E-43)
                            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                            boolean r6 = r6.contains(r0)
                            if (r6 != 0) goto L3e
                        L3d:
                            r2 = 0
                        L3e:
                            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
                            r1.j(r6)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.csyh.a(java.lang.Object):void");
                    }
                });
                return d;
            case 11:
                return cswe.b(cswe.a(this.a).aA, this.b);
            case 12:
                dehp dehpVar8 = this.b;
                final csvo a8 = csvo.a(this.a);
                a8.getClass();
                return dehpVar8.c(new Callable(a8) { // from class: csyo
                    private final csvo a;

                    {
                        this.a = a8;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(csvo.u(this.a.a.aC));
                    }
                });
            case 13:
                dehp dehpVar9 = this.b;
                final csvo a9 = csvo.a(this.a);
                a9.getClass();
                return dehpVar9.c(new Callable(a9) { // from class: csyp
                    private final csvo a;

                    {
                        this.a = a9;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(csvo.u(this.a.a.ax));
                    }
                });
            case 14:
                dehp dehpVar10 = this.b;
                final csvo a10 = csvo.a(this.a);
                a10.getClass();
                return dehpVar10.c(new Callable(a10) { // from class: csyq
                    private final csvo a;

                    {
                        this.a = a10;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(this.a.i());
                    }
                });
            case 15:
                dehp dehpVar11 = this.b;
                final csvo a11 = csvo.a(this.a);
                a11.getClass();
                return dehpVar11.c(new Callable(a11) { // from class: csye
                    private final csvo a;

                    {
                        this.a = a11;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(this.a.d());
                    }
                });
            case 16:
                dehp dehpVar12 = this.b;
                final csvo a12 = csvo.a(this.a);
                a12.getClass();
                return dehpVar12.c(new Callable(a12) { // from class: csyf
                    private final csvo a;

                    {
                        this.a = a12;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(csvo.u(this.a.a.Q));
                    }
                });
            default:
                dehp dehpVar13 = this.b;
                final csvo a13 = csvo.a(this.a);
                a13.getClass();
                return dehpVar13.c(new Callable(a13) { // from class: csyg
                    private final csvo a;

                    {
                        this.a = a13;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(this.a.b());
                    }
                });
        }
    }
}

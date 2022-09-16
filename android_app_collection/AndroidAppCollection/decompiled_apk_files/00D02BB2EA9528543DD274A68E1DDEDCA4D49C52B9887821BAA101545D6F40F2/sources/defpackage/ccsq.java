package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ccsq  reason: default package */
/* loaded from: classes4.dex */
public final class ccsq {
    public final ccst a;
    public final ccrh b;
    private final Executor c;
    private final ccrf d;
    private final chhr e;
    private final chhs f;

    public ccsq(Executor executor, ccst ccstVar, ccrf ccrfVar, ccrh ccrhVar, chhr chhrVar, chht chhtVar) {
        this.c = executor;
        this.a = ccstVar;
        this.d = ccrfVar;
        this.b = ccrhVar;
        this.e = chhrVar;
        this.f = chhtVar.a(dhpj.UNKNOWN_CONTRIBUTION_SOURCE);
    }

    public final void a(final ccln cclnVar, final String str, @dzsi final String str2, @dzsi final dgfg dgfgVar) {
        if (dbsd.a(cclnVar.f, str2)) {
            c();
            return;
        }
        ccrh ccrhVar = this.b;
        dgfb b = dgfb.b(cclnVar.e);
        if (b == null) {
            b = dgfb.UNKNOWN_OFFERING_TYPE;
        }
        ccrhVar.a(b);
        b(new dbty(this, cclnVar, str, str2, dgfgVar) { // from class: ccsm
            private final ccsq a;
            private final ccln b;
            private final String c;
            private final String d;
            private final dgfg e;

            {
                this.a = this;
                this.b = cclnVar;
                this.c = str;
                this.d = str2;
                this.e = dgfgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                ccsq ccsqVar = this.a;
                return ccsqVar.a.a(this.b, this.c, this.d, this.e);
            }
        });
    }

    public final <T> void b(dbty<dehn<T>> dbtyVar) {
        deha.q(this.d.a(dbtyVar), bvqj.b(new bvqg(this) { // from class: ccsp
            private final ccsq a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.c();
            }
        }), this.c);
    }

    public final void c() {
        this.e.a(this.f.c(), dtxx.ai, dtxx.aj);
    }
}

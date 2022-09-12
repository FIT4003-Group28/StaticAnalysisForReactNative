package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bvwq  reason: default package */
/* loaded from: classes4.dex */
public final class bvwq {
    private final ckcw a;
    private final dszg b;

    public bvwq(ckcw ckcwVar, dszg dszgVar) {
        this.a = ckcwVar;
        this.b = dszgVar;
    }

    public final void a(ckgu ckguVar, ddyq ddyqVar) {
        d(ddyqVar);
        ((ckcn) this.a.a(ckguVar)).a();
    }

    public final void b(ckha ckhaVar, dqjt dqjtVar, long j, ddyq ddyqVar) {
        d(ddyqVar);
        ((ckcp) this.a.a(ckhaVar)).a(j - (TimeUnit.SECONDS.toMillis(dqjtVar.b) + TimeUnit.NANOSECONDS.toMillis(dqjtVar.c)));
    }

    public final bvwp c(ckhg ckhgVar) {
        return new bvwp(this, ((ckcr) this.a.a(ckhgVar)).a());
    }

    public final void d(ddyq ddyqVar) {
        dsqp dsqpVar = (dsqp) ddyqVar.cu(5);
        dsqpVar.bC(ddyqVar);
        ddyf ddyfVar = (ddyf) dsqpVar;
        ddyfVar.bC(this.a.d());
        dszg dszgVar = this.b;
        if (ddyfVar.c) {
            ddyfVar.bF();
            ddyfVar.c = false;
        }
        ddyq ddyqVar2 = (ddyq) ddyfVar.b;
        ddyq ddyqVar3 = ddyq.K;
        ddyqVar2.z = dszgVar.a();
        ddyqVar2.b |= 4;
        final ddyq bK = ddyfVar.bK();
        if (this.a.c(ckgy.WEBVIEW_APIS).equals(bK)) {
            return;
        }
        this.a.b(ckgx.WEBVIEW_APIS, new ckcx(bK) { // from class: bvwo
            private final ddyq a;

            {
                this.a = bK;
            }

            @Override // defpackage.ckcx
            public final void a(ddyf ddyfVar2) {
                ddyq ddyqVar4 = this.a;
                ddyfVar2.b = (MessageType) ddyfVar2.b.cu(4);
                ddyfVar2.bC(ddyqVar4);
            }
        });
    }
}

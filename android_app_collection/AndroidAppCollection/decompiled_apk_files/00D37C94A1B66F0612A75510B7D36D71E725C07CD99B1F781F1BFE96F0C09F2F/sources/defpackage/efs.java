package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: efs  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class efs implements Runnable {
    public final /* synthetic */ eft a;
    private final /* synthetic */ int b;

    public /* synthetic */ efs(eft eftVar, int i) {
        this.b = i;
        this.a = eftVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                eft eftVar = this.a;
                afvm c = ((afvn) eftVar.m.get()).c();
                if (!(c instanceof AccountIdentity)) {
                    return;
                }
                ((vzm) eftVar.n.get()).j((Executor) eftVar.a.get(), (AccountIdentity) c);
                return;
            case 1:
                aacu aacuVar = (aacu) this.a.p.get();
                aacuVar.c();
                aacuVar.d(null);
                return;
            case 2:
                ((aksv) this.a.f.get()).e();
                return;
            case 3:
                eft eftVar2 = this.a;
                aaqd aaqdVar = (aaqd) eftVar2.q.get();
                aaqdVar.b.e().U(eftVar2.e);
                aaqdVar.h(eftVar2.b, eftVar2.p, eftVar2.l);
                return;
            case 4:
                ((zej) this.a.i.get()).a();
                return;
            case 5:
                eft eftVar3 = this.a;
                afvm c2 = ((afvn) eftVar3.m.get()).c();
                if (!(c2 instanceof AccountIdentity)) {
                    return;
                }
                ((vzm) eftVar3.n.get()).d((AccountIdentity) c2);
                return;
            case 6:
                final eft eftVar4 = this.a;
                aacu aacuVar2 = (aacu) eftVar4.p.get();
                aacuVar2.d(eftVar4.c);
                ((aaqd) eftVar4.q.get()).h(eftVar4.b, eftVar4.p, eftVar4.l);
                if (!eftVar4.t) {
                    eftVar4.b();
                } else {
                    eftVar4.s.B(azpj.b(eftVar4.b)).R(new aypv() { // from class: efr
                        @Override // defpackage.aypv
                        public final void a() {
                            eft.this.b();
                        }
                    });
                }
                ((zen) eftVar4.h.get()).c(eftVar4.c, aacuVar2.a());
                eftVar4.d.c(2);
                return;
            case 7:
                eft eftVar5 = this.a;
                long d = ((snc) eftVar5.j.get()).d();
                ((wwl) eftVar5.k.get()).f();
                eftVar5.d.d();
                yni yniVar = (yni) eftVar5.l.get();
                yniVar.d(new wyd(d));
                yniVar.d(new wyc());
                return;
            case 8:
                eft eftVar6 = this.a;
                ((jvk) eftVar6.r.get()).b();
                eftVar6.s.sm();
                return;
            default:
                eft eftVar7 = this.a;
                atfw atfwVar = ((aacz) eftVar7.g.get()).b().k;
                if (atfwVar == null) {
                    atfwVar = atfw.a;
                }
                apfn apfnVar = atfwVar.p;
                if (apfnVar == null) {
                    apfnVar = apfn.a;
                }
                if (!apfnVar.d || apfnVar.e.size() == 0) {
                    return;
                }
                yqg yqgVar = (yqg) eftVar7.o.get();
                for (String str : apfnVar.e) {
                    yqgVar.a(str);
                }
                return;
        }
    }
}

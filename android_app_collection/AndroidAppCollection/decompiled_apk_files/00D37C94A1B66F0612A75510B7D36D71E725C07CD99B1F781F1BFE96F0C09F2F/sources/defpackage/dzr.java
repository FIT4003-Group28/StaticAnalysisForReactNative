package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: dzr  reason: default package */
/* loaded from: classes3.dex */
final class dzr implements Runnable {
    final /* synthetic */ evt a;
    final /* synthetic */ dzs b;

    public dzr(dzs dzsVar, evt evtVar) {
        this.b = dzsVar;
        this.a = evtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c((aiji) this.b.aA.get(), (afkf) this.b.G.get(), this.b.bd);
        dzs dzsVar = this.b;
        yni yniVar = (yni) dzsVar.h.get();
        acvp acvpVar = (acvp) dzsVar.E.get();
        for (exn exnVar : (Set) dzsVar.D.get()) {
            if (exnVar.c()) {
                exnVar.b(acvpVar);
                ymg a = exnVar.a();
                if (a != null) {
                    yniVar.d(a);
                }
            }
        }
        aaqd b = ((aaau) dzsVar.aR.get()).b();
        yniVar.d(new evu(b.k));
        yniVar.d(new ewm(b.l));
        yniVar.d(new ewq(b.m));
        this.b.c();
    }
}

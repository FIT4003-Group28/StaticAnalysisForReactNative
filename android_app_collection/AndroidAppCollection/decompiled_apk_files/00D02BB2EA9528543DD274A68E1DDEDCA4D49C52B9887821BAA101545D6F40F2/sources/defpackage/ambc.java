package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: ambc  reason: default package */
/* loaded from: classes2.dex */
final class ambc implements amfq {
    @dzsi
    ckcv a;
    final Set<amfu> b;
    @dzsi
    ckcv c;
    final /* synthetic */ Set d;
    final /* synthetic */ ambe e;

    public ambc(ambe ambeVar, Set set) {
        this.e = ambeVar;
        this.d = set;
        this.a = ambeVar.a.a().e();
        this.b = dcnm.e(set);
        this.c = ambeVar.a.a().e();
    }

    @Override // defpackage.amfq
    public final synchronized void a(amfu amfuVar) {
        if (amfuVar.a()) {
            this.b.remove(amfuVar);
            if (this.a == null && this.c != null && this.b.isEmpty()) {
                this.c.a((ckcr) this.e.a.a().a(ckgh.aE));
                this.c = null;
            }
            ckcv ckcvVar = this.a;
            if (ckcvVar != null) {
                ckcvVar.a((ckcr) this.e.a.a().a(ckgh.aC));
                this.a = null;
            }
        }
    }
}

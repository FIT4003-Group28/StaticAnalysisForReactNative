package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: amci  reason: default package */
/* loaded from: classes.dex */
final class amci implements ankb {
    final /* synthetic */ amcj a;

    public amci(amcj amcjVar) {
        this.a = amcjVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
    }

    @Override // defpackage.ankb
    public final void b(Object obj) {
        for (amcq amcqVar : (Set) this.a.d.get()) {
            amgk amgkVar = amcqVar.a;
            ankt q = anlz.q(null);
            amgkVar.a(q);
            amee.b(q, "AvailableAccountsInvalidatedObserver failed", new Object[0]);
        }
    }
}

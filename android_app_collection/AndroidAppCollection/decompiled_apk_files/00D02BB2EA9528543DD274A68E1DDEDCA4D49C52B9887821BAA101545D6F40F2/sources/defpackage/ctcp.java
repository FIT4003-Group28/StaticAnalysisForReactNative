package defpackage;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctcp  reason: default package */
/* loaded from: classes5.dex */
public final class ctcp implements cswc<Boolean> {
    final /* synthetic */ ctct a;

    public ctcp(ctct ctctVar) {
        this.a = ctctVar;
    }

    @Override // defpackage.cswc
    public final /* bridge */ /* synthetic */ void a(Boolean bool) {
        final Boolean bool2 = bool;
        final dehn b = cswe.b(cswe.a(this.a.a).v, this.a.d);
        final dehn b2 = cswe.b(cswe.a(this.a.a).u, this.a.d);
        deha.k(b, b2).b(new Callable(this, bool2, b2, b) { // from class: ctco
            private final ctcp a;
            private final Boolean b;
            private final dehn c;
            private final dehn d;

            {
                this.a = this;
                this.b = bool2;
                this.c = b2;
                this.d = b;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctcp ctcpVar = this.a;
                Boolean bool3 = this.b;
                dehn dehnVar = this.c;
                dehn dehnVar2 = this.d;
                if (bool3.booleanValue()) {
                    ctcpVar.a.J(((Long) dehnVar.get()).longValue());
                    ctct ctctVar = ctcpVar.a;
                    ctctVar.o.postDelayed(ctctVar.y, ((Long) dehnVar2.get()).longValue());
                    return null;
                }
                return null;
            }
        }, this.a.d);
    }
}

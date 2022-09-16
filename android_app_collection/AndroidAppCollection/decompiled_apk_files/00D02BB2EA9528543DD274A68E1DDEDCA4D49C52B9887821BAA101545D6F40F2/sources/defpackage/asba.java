package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: asba  reason: default package */
/* loaded from: classes2.dex */
final class asba implements arpl {
    final /* synthetic */ asbb a;

    public asba(asbb asbbVar) {
        this.a = asbbVar;
    }

    @Override // defpackage.arpl
    public final void a(final dwbq dwbqVar, final dwbs dwbsVar, final long j, @dzsi final bttq bttqVar) {
        this.a.b.b(new Runnable(this, bttqVar, dwbqVar, dwbsVar, j) { // from class: asaz
            private final asba a;
            private final bttq b;
            private final dwbq c;
            private final dwbs d;
            private final long e;

            {
                this.a = this;
                this.b = bttqVar;
                this.c = dwbqVar;
                this.d = dwbsVar;
                this.e = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                amtq<asau> amtqVar;
                asba asbaVar = this.a;
                bttq bttqVar2 = this.b;
                dwbq dwbqVar2 = this.c;
                dwbs dwbsVar2 = this.d;
                long j2 = this.e;
                if (bttqVar2 != null) {
                    asbaVar.a.f();
                    return;
                }
                asbb asbbVar = asbaVar.a;
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (true) {
                    amtqVar = null;
                    if (i < dwbsVar2.b.size()) {
                        amuh a = asbbVar.c.a(dwbqVar2, dwbsVar2.b.get(i), j2);
                        if (a == null || !a.j()) {
                            break;
                        }
                        arrayList.add(new asau(a.k().k().r(asbbVar.a.getResources(), true), (int) a.k().B.d()));
                        i++;
                    } else {
                        amtqVar = amtq.c((dwbsVar2.a & 1) != 0 ? dwbsVar2.c : -1, arrayList);
                    }
                }
                if (amtqVar == null || amtqVar.isEmpty()) {
                    asbaVar.a.f();
                } else {
                    asbaVar.a.g(amtqVar);
                }
            }
        }, bvrj.UI_THREAD);
    }
}

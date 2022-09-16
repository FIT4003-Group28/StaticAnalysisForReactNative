package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahay  reason: default package */
/* loaded from: classes2.dex */
public final class ahay implements jmo {
    final /* synthetic */ ahbb a;

    public ahay(ahbb ahbbVar) {
        this.a = ahbbVar;
    }

    @Override // defpackage.jmo
    public final void c() {
        ahbb ahbbVar = this.a;
        if (ahbbVar.d || ahbbVar.e == null) {
            return;
        }
        ahbbVar.d = true;
        cqkx.p(ahbbVar);
        final ahff ahffVar = this.a.e.a;
        deha.q(deew.h(ahffVar.g.b(ahffVar.i), new dbrn(ahffVar) { // from class: ahfc
            private final ahff a;

            {
                this.a = ahffVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.s((List) obj);
            }
        }, ahffVar.e), new ahax(this), this.a.c);
    }
}

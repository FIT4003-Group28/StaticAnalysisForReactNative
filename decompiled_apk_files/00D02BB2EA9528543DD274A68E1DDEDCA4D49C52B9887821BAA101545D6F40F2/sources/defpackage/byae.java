package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: byae  reason: default package */
/* loaded from: classes4.dex */
public class byae {
    private final vtn a;
    private final Set<byad> b = new aih();

    public byae(vtn vtnVar) {
        this.a = vtnVar;
    }

    @dzsi
    public final cqtd a(String str, bvlw bvlwVar, final cqkp cqkpVar) {
        byab byabVar = new byab(str, cqkpVar);
        if (this.b.contains(byabVar)) {
            return this.a.e(str, bvlwVar);
        }
        this.b.add(byabVar);
        return this.a.f(str, bvlwVar, new vtk(cqkpVar) { // from class: byac
            private final cqkp a;

            {
                this.a = cqkpVar;
            }

            @Override // defpackage.vtk
            public final void a(cqtd cqtdVar) {
                cqkx.p(this.a);
            }
        });
    }
}

package defpackage;

import android.content.res.Resources;
import android.view.View;
/* compiled from: PG */
/* renamed from: cdvv  reason: default package */
/* loaded from: classes4.dex */
public final class cdvv {
    public final fd a;
    private final cebd b;

    private cdvv(fd fdVar, cebd cebdVar) {
        this.a = fdVar;
        this.b = cebdVar;
    }

    public static cdvv a(fd fdVar, cebd cebdVar) {
        return new cdvv(fdVar, cebdVar);
    }

    public final cdwi b(int i) {
        fd fdVar = this.a;
        cebd cebdVar = this.b;
        m x = fdVar.x();
        Resources Rn = fdVar.Rn();
        View view = fdVar.P;
        dbsk.s(view);
        View findViewById = view.findViewById(i);
        dbsk.s(findViewById);
        return new cdwi(x, cebdVar, Rn, findViewById);
    }

    public final <OutT, InT extends OutT> void c(v<InT> vVar, final z<OutT> zVar) {
        zVar.getClass();
        e(vVar, new aa(zVar) { // from class: cdvu
            private final z a;

            {
                this.a = zVar;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.g(obj);
            }
        });
    }

    public final <InT, OutT> void d(v<InT> vVar, z<OutT> zVar, ahp<InT, OutT> ahpVar) {
        c(am.a(vVar, ahpVar), zVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void e(v<T> vVar, aa<T> aaVar) {
        vVar.b(this.a, aaVar);
    }
}

package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: caar  reason: default package */
/* loaded from: classes4.dex */
public final class caar implements cavf<dwvy> {
    final /* synthetic */ caaw a;

    public caar(caaw caawVar) {
        this.a = caawVar;
    }

    @Override // defpackage.cavf
    public final String a() {
        caew caewVar = (caew) this.a.b.get(dkcp.REVIEW);
        return caewVar != null ? caewVar.g : "";
    }

    @Override // defpackage.cavf
    public final void b(String str) {
        caaw caawVar = this.a;
        caawVar.aQ.f(caawVar.e, caawVar.Rq(R.string.CONTRIBUTIONS_REVIEW_SORTED_ACCESSIBILITY_ANNOUNCEMENT, str));
    }

    @Override // defpackage.cavf
    public final /* bridge */ /* synthetic */ void c(dwvy dwvyVar) {
        cabd cabdVar;
        dwvy dwvyVar2 = dwvyVar;
        caaw caawVar = this.a;
        if (!caawVar.aD || (cabdVar = caawVar.ae) == null || !cabdVar.e().booleanValue()) {
            return;
        }
        cabh x = this.a.ae.x();
        caew caewVar = (caew) this.a.b.get(dkcp.REVIEW);
        if (x == null || caewVar == null) {
            return;
        }
        x.l();
        Q q = caewVar.e;
        if (q != 0) {
            caewVar.a = dwvyVar2;
            dwvz dwvzVar = (dwvz) q;
            dsqp dsqpVar = (dsqp) dwvzVar.cu(5);
            dsqpVar.bC(dwvzVar);
            dwvu dwvuVar = (dwvu) dsqpVar;
            if (dwvuVar.c) {
                dwvuVar.bF();
                dwvuVar.c = false;
            }
            dwvz dwvzVar2 = (dwvz) dwvuVar.b;
            dwvzVar2.e = dwvyVar2.f;
            dwvzVar2.a |= 16;
            caewVar.e = dwvuVar.bK();
            caewVar.j();
        }
        cqkx.p(this.a.ae);
    }
}

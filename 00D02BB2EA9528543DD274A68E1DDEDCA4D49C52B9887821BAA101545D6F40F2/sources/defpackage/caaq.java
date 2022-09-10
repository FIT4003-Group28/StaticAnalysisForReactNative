package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: caaq  reason: default package */
/* loaded from: classes4.dex */
public final class caaq implements cavf<dkde> {
    final /* synthetic */ caaw a;

    public caaq(caaw caawVar) {
        this.a = caawVar;
    }

    @Override // defpackage.cavf
    public final String a() {
        caeu caeuVar = (caeu) this.a.b.get(dkcp.PHOTO);
        return caeuVar != null ? caeuVar.g : "";
    }

    @Override // defpackage.cavf
    public final void b(String str) {
        caaw caawVar = this.a;
        caawVar.aQ.f(caawVar.e, caawVar.Rq(R.string.CONTRIBUTIONS_PHOTO_SORTED_ACCESSIBILITY_ANNOUNCEMENT, str));
    }

    @Override // defpackage.cavf
    public final /* bridge */ /* synthetic */ void c(dkde dkdeVar) {
        cabd cabdVar;
        dkde dkdeVar2 = dkdeVar;
        caaw caawVar = this.a;
        if (!caawVar.aD || (cabdVar = caawVar.ae) == null || !cabdVar.f().booleanValue()) {
            return;
        }
        cabh w = this.a.ae.w();
        caeu caeuVar = (caeu) this.a.b.get(dkcp.PHOTO);
        if (w == null || caeuVar == null) {
            return;
        }
        w.l();
        Q q = caeuVar.e;
        if (q != 0) {
            caeuVar.a = dkdeVar2;
            dkdg dkdgVar = (dkdg) q;
            dsqp dsqpVar = (dsqp) dkdgVar.cu(5);
            dsqpVar.bC(dkdgVar);
            dkcz dkczVar = (dkcz) dsqpVar;
            dkdc bZ = dkdf.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dkdf dkdfVar = (dkdf) bZ.b;
            dkdfVar.b = dkdeVar2.d;
            dkdfVar.a |= 1;
            if (dkczVar.c) {
                dkczVar.bF();
                dkczVar.c = false;
            }
            dkdg dkdgVar2 = (dkdg) dkczVar.b;
            dkdf bK = bZ.bK();
            bK.getClass();
            dkdgVar2.e = bK;
            dkdgVar2.a |= 16;
            caeuVar.e = dkczVar.bK();
            caeuVar.j();
        }
        cqkx.p(this.a.ae);
    }
}

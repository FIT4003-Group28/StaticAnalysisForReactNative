package defpackage;

import android.view.ViewGroup;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvbm  reason: default package */
/* loaded from: classes5.dex */
public final class cvbm extends cuwl<cvah, cvbl> {
    public final cvav g;
    private final cvar h;

    public cvbm(cvav cvavVar, cvar cvarVar) {
        super(new cvbk());
        this.g = cvavVar;
        this.h = cvarVar;
    }

    @Override // defpackage.cuwl
    protected final int A(int i) {
        cvar cvarVar = this.h;
        cvah b = b(i);
        for (int i2 = 0; i2 < cvarVar.a.size(); i2++) {
            if (cvarVar.a.get(i2).b(b)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.cuwl
    public final /* bridge */ /* synthetic */ cvbl y(ViewGroup viewGroup, int i) {
        cvaf cvafVar = new cvaf(viewGroup.getContext());
        cvafVar.setLayoutParams(new abt(-1, -2));
        cvac cvacVar = new cvac(cvafVar);
        cvar cvarVar = this.h;
        return new cvbl(cvafVar, (i < 0 || i >= cvarVar.a.size()) ? cvar.b : cvarVar.a.get(i).c(), cvacVar);
    }

    @Override // defpackage.cuwl
    public final /* bridge */ /* synthetic */ void z(cvbl cvblVar, int i) {
        cvbl cvblVar2 = cvblVar;
        cvah b = b(i);
        cvaa cvaaVar = cvblVar2.u;
        List<cufj> d = b.d();
        cvac cvacVar = (cvac) cvaaVar;
        cvacVar.c = new cuvh(((cvaf) cvacVar.a).a, b.a(), (cufj[]) d.toArray(new cufj[b.d().size()]));
        cvacVar.b = b;
        cvas cvasVar = cvblVar2.t;
        for (cvat cvatVar : this.h.a) {
            if (cvatVar.b(b)) {
                cvatVar.a(cvasVar, b);
            }
        }
        if (cvasVar.b.a()) {
            cvblVar2.s.setDescription(cvasVar.b.b());
        }
        if (cvasVar.c.a()) {
            cvblVar2.s.setBoundPreviewView(cvasVar.c.b());
        }
        ((cvac) cvblVar2.u).d = new cvbj(this, b);
        cvblVar2.u.z();
    }
}

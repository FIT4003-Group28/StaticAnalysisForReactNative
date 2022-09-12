package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: oya  reason: default package */
/* loaded from: classes7.dex */
public class oya implements oxg {
    @dzsi
    private cjyo a;
    private boolean b = false;
    @dzsi
    private cqkp c;

    @Override // defpackage.cqrh
    public void Rz(cqiw<?> cqiwVar, cqkp cqkpVar) {
    }

    @Override // defpackage.oxg
    @dzsi
    public cjyo a() {
        return this.a;
    }

    @Override // defpackage.oxg
    public Boolean b() {
        cjyo cjyoVar = this.a;
        boolean z = true;
        if (cjyoVar != null && !cjyoVar.b().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.oxg
    public Boolean c() {
        List<cjyw> a = this.a.a();
        boolean z = true;
        if (a.size() != 1 || a.get(0).c() != dtic.VERTICAL_LIST_NO_MARGIN) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.oxg
    public Boolean d() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.oxg
    public cqkp e() {
        oxz oxzVar = new oxz();
        this.c = oxzVar;
        return oxzVar;
    }

    public void g(cjyo cjyoVar) {
        this.a = cjyoVar;
    }

    public void h(boolean z) {
        this.b = z;
    }

    public void i(oxf oxfVar) {
    }
}

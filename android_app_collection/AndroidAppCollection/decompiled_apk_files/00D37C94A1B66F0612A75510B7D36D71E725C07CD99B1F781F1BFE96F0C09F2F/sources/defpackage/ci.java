package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ci  reason: default package */
/* loaded from: classes2.dex */
public class ci extends cd {
    public final ArrayList al = new ArrayList();

    public void D() {
        r();
        ArrayList arrayList = this.al;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cd cdVar = (cd) this.al.get(i);
            if (cdVar instanceof ci) {
                ((ci) cdVar).D();
            }
        }
    }

    public final void F(cd cdVar) {
        this.al.remove(cdVar);
        cdVar.r = null;
    }

    @Override // defpackage.cd
    public void i() {
        this.al.clear();
        super.i();
    }

    @Override // defpackage.cd
    public final void j(bx bxVar) {
        super.j(bxVar);
        int size = this.al.size();
        for (int i = 0; i < size; i++) {
            ((cd) this.al.get(i)).j(bxVar);
        }
    }

    @Override // defpackage.cd
    public final void o(int i, int i2) {
        super.o(i, i2);
        int size = this.al.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((cd) this.al.get(i3)).o(this.w + this.A, this.x + this.B);
        }
    }

    @Override // defpackage.cd
    public final void r() {
        super.r();
        ArrayList arrayList = this.al;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cd cdVar = (cd) this.al.get(i);
            cdVar.o(b(), c());
            if (!(cdVar instanceof ce)) {
                cdVar.r();
            }
        }
    }
}

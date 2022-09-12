package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ei  reason: default package */
/* loaded from: classes6.dex */
public class ei extends ed {
    public final ArrayList<ed> al = new ArrayList<>();

    public void A() {
        n();
        ArrayList<ed> arrayList = this.al;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ed edVar = this.al.get(i);
            if (edVar instanceof ei) {
                ((ei) edVar).A();
            }
        }
    }

    public final void F(ed edVar) {
        this.al.remove(edVar);
        edVar.r = null;
    }

    @Override // defpackage.ed
    public void a() {
        this.al.clear();
        super.a();
    }

    @Override // defpackage.ed
    public final void b(dw dwVar) {
        super.b(dwVar);
        int size = this.al.size();
        for (int i = 0; i < size; i++) {
            this.al.get(i).b(dwVar);
        }
    }

    @Override // defpackage.ed
    public final void m(int i, int i2) {
        super.m(i, i2);
        int size = this.al.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.al.get(i3).m(this.w + this.A, this.x + this.B);
        }
    }

    @Override // defpackage.ed
    public final void n() {
        super.n();
        ArrayList<ed> arrayList = this.al;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ed edVar = this.al.get(i);
            edVar.m(h(), i());
            if (!(edVar instanceof ee)) {
                edVar.n();
            }
        }
    }
}

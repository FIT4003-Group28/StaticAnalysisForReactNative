package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ssa  reason: default package */
/* loaded from: classes7.dex */
final class ssa implements btzi<djxc, djxk> {
    final /* synthetic */ degu a;

    public ssa(degu deguVar) {
        this.a = deguVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djxc> btzrVar, btzy btzyVar) {
        if (btzyVar.equals(btzy.d)) {
            return;
        }
        this.a.a(new qbx());
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djxc> btzrVar, djxk djxkVar) {
        Throwable qcbVar;
        djxk djxkVar2 = djxkVar;
        int i = djxkVar2.a;
        if (i != 2) {
            this.a.b(i == 1 ? (drih) djxkVar2.b : drih.b);
            return;
        }
        Iterator<djxh> it = ((djxj) djxkVar2.b).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                qcbVar = new qcb();
                break;
            }
            int a = djxg.a(it.next().a);
            if (a != 0 && a == 2) {
                qcbVar = new qby();
                break;
            }
        }
        this.a.a(qcbVar);
    }
}

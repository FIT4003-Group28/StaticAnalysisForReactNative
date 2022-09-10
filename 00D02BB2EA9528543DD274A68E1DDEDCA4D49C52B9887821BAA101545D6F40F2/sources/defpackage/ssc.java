package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ssc  reason: default package */
/* loaded from: classes7.dex */
final class ssc implements btzi<djya, djyi> {
    final /* synthetic */ degu a;

    public ssc(degu deguVar) {
        this.a = deguVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djya> btzrVar, btzy btzyVar) {
        if (btzyVar.equals(btzy.d)) {
            return;
        }
        btzyVar.toString();
        this.a.a(new qdj());
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djya> btzrVar, djyi djyiVar) {
        Throwable qdnVar;
        djyi djyiVar2 = djyiVar;
        int i = djyiVar2.a;
        if (i != 2) {
            this.a.b(i == 1 ? (dspd) djyiVar2.b : dspd.b);
            return;
        }
        Iterator<djyf> it = ((djyh) djyiVar2.b).a.iterator();
        while (true) {
            if (it.hasNext()) {
                int a = djye.a(it.next().a);
                if (a == 0) {
                    a = 1;
                }
                switch (a - 1) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        qdnVar = new qdk();
                        break;
                }
            } else {
                qdnVar = new qdn();
            }
        }
        this.a.a(qdnVar);
    }
}

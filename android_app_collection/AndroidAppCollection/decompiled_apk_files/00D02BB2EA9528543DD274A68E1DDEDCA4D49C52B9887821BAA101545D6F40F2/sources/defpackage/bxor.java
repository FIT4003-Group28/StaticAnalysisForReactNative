package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bxor  reason: default package */
/* loaded from: classes4.dex */
public class bxor implements bxnx {
    private final bxoq a;
    private boolean b;
    private final bxpo c;
    private final List<bxoi> d = dchl.a();

    public bxor(bxoq bxoqVar, bxpp bxppVar) {
        this.a = bxoqVar;
        dxio a = ((dxjh) bxppVar.a).a();
        bxpp.a(a);
        this.c = new bxpo(a);
    }

    @Override // defpackage.bxnx
    public Boolean a() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.bxnx
    @dzsi
    public bxoa b() {
        return this.c;
    }

    @Override // defpackage.bxnx
    public List<bxoi> c() {
        return this.d;
    }

    public void d() {
        this.b = false;
        this.c.G(null);
        this.d.clear();
    }

    public void e(@dzsi brln brlnVar) {
        boolean z;
        if (brlnVar == null) {
            d();
            return;
        }
        brlu brluVar = brlnVar.e;
        this.c.G(brlnVar);
        this.d.clear();
        Iterator<broc> it = brluVar.Q().iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            broc next = it.next();
            List<bxoi> list = this.d;
            bxoq bxoqVar = this.a;
            bxoq.a(next, 1);
            dzsj<begg> dzsjVar = bxoqVar.a;
            dzsj<brba> dzsjVar2 = bxoqVar.b;
            cklq a = bxoqVar.c.a();
            bxoq.a(a, 4);
            list.add(new bxop(next, dzsjVar, dzsjVar2, a));
        }
        if (!this.c.F().booleanValue() && this.d.isEmpty()) {
            z = false;
        }
        this.b = z;
    }
}

package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bptd  reason: default package */
/* loaded from: classes4.dex */
public final class bptd implements ioa {
    private final List<akqi> a = new ArrayList();
    private final akox b;
    private final ges c;

    public bptd(akox akoxVar, ges gesVar) {
        this.b = akoxVar;
        this.c = gesVar;
    }

    private final void h(akqi akqiVar) {
        this.b.Q(i(akqiVar));
    }

    private static String i(akqi akqiVar) {
        String valueOf = String.valueOf(akqiVar.o());
        return valueOf.length() != 0 ? "hl_rap_".concat(valueOf) : new String("hl_rap_");
    }

    @Override // defpackage.ioa
    public final void a() {
    }

    @Override // defpackage.ioa
    public final void b() {
    }

    @Override // defpackage.ioa
    public final void c() {
        g();
    }

    @Override // defpackage.ioa
    public final void d(inx inxVar, dcdc<ilo> dcdcVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        dcdc<Integer> dcdcVar2 = ((inh) inxVar).a;
        int size = dcdcVar2.size();
        for (int i = 0; i < size; i++) {
            ilo iloVar = dcdcVar.get(dcdcVar2.get(i).intValue());
            if (doay.TYPE_ROAD.equals(iloVar.ce())) {
                arrayList.add(iloVar.ai());
            }
        }
        Iterator<akqi> it = this.a.iterator();
        while (it.hasNext()) {
            akqi next = it.next();
            if (!arrayList.contains(next)) {
                it.remove();
                h(next);
            }
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            e((akqi) arrayList.get(i2));
        }
    }

    public final void e(akqi akqiVar) {
        if (!this.a.contains(akqiVar)) {
            if (this.c.S()) {
                akox akoxVar = this.b;
                Resources Rn = this.c.Rn();
                akrw e = akrw.e(akqiVar);
                alyk q = alyl.q();
                ((alvg) q).b = akqiVar;
                this.b.O(i(akqiVar), akoxVar.M(Rn, e, q.b()));
            }
            this.a.add(akqiVar);
        }
    }

    public final void f(akqi akqiVar) {
        if (this.a.contains(akqiVar)) {
            h(akqiVar);
            this.a.remove(akqiVar);
        }
    }

    public final void g() {
        if (this.a.isEmpty()) {
            return;
        }
        for (akqi akqiVar : this.a) {
            h(akqiVar);
        }
        this.a.clear();
    }
}

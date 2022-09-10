package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayyo  reason: default package */
/* loaded from: classes3.dex */
final class ayyo implements Runnable {
    final /* synthetic */ ayyp b;
    private final List<bwrs<ilo>> c;
    private final bvqg<List<ilo>> d;
    public final List<ilo> a = new ArrayList();
    private int e = 0;

    public ayyo(ayyp ayypVar, List<bwrs<ilo>> list, bvqg<List<ilo>> bvqgVar) {
        this.b = ayypVar;
        this.c = list;
        this.d = bvqgVar;
    }

    public final void a() {
        int i = this.e + 1;
        this.e = i;
        if (i == this.c.size()) {
            this.d.NU(this.a);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.isEmpty()) {
            this.d.NU(this.a);
            return;
        }
        this.e = 0;
        for (bwrs<ilo> bwrsVar : this.c) {
            ilo c = bwrsVar.c();
            dbsk.s(c);
            if (c.f) {
                a();
            } else {
                this.b.d.f(bwrsVar, new bwrr(this) { // from class: ayyn
                    private final ayyo a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.bwrr
                    public final void PV(Object obj) {
                        ayyo ayyoVar = this.a;
                        ilo iloVar = (ilo) obj;
                        if (iloVar != null && !iloVar.f) {
                            ayyoVar.a.add(iloVar);
                        }
                        ayyoVar.a();
                    }
                }, false);
                befw befwVar = this.b.c;
                befu p = befv.p();
                p.j(bwrsVar);
                ((befp) p).a = null;
                p.l(false);
                p.k(false);
                befwVar.d(p.m());
            }
        }
    }
}

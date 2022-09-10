package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: bdoc  reason: default package */
/* loaded from: classes3.dex */
public final class bdoc {
    static final bdom k = new bdob();
    public dcde<bdoj, bdok> a;
    public dcdd<bdoj, bdok> b;
    public TreeMap<bcam, bdpa> c;
    public TreeMap<bcam, bdpa> d;
    public final HashMap<String, bdpd> e;
    public final bcpd f;
    public final bwrs<bcan> g;
    public final bdol h;
    public final bdph i;
    public final bcan j;
    private final dxio<apni> l;
    private final bdrt m;
    private final dcdc<bdok> n;
    private final bdkl o;

    public bdoc(bcpd bcpdVar, bwrs bwrsVar, bdol bdolVar, List list, bdph bdphVar, dxio dxioVar, bdkl bdklVar, bdrt bdrtVar) {
        this.f = bcpdVar;
        this.g = bwrsVar;
        bcan bcanVar = (bcan) bwrsVar.c();
        dbsk.s(bcanVar);
        this.j = bcanVar;
        this.h = bdolVar;
        this.n = dcdc.r(list);
        this.i = bdphVar;
        this.l = dxioVar;
        this.o = bdklVar;
        this.m = bdrtVar;
        this.a = dcax.a;
        this.b = dcde.a();
        this.c = daus.a();
        this.d = daus.a();
        this.e = new HashMap<>();
    }

    @dzsi
    public static bdpa d(bbtj bbtjVar, Map<bcam, bdpa> map) {
        bvrj.UI_THREAD.c();
        return map.get(bcam.c(bbtjVar));
    }

    public final void a(bdoj bdojVar) {
        dcdc<bdok> dcdcVar = this.n;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            this.b.b(bdojVar, dcdcVar.get(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.a = this.b.a();
        this.b = dcde.a();
        this.c = this.d;
        this.d = daus.a();
        if (!this.l.a().b()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (bdpa bdpaVar : this.c.values()) {
            bbtj q = bdpaVar.q();
            if (bdkl.c(q)) {
                arrayList.add(q);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        dcdn r = dcdn.r(this.c);
        bdrs a = this.m.a(arrayList.size(), new Runnable(this) { // from class: bdny
            private final bdoc a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.h.e();
            }
        });
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.o.b((bbtj) arrayList.get(i), new bdnz(this, a, r));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final bdpa c(bbtj bbtjVar) {
        return d(bbtjVar, this.c);
    }
}

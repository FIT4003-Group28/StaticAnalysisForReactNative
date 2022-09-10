package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bpef  reason: default package */
/* loaded from: classes3.dex */
public class bpef implements bpwb {
    public final boxg a;
    public final dcdc<bpwa> b;
    public boxf c;
    private final cqkn<bpwa> d = new bpee(this);

    public bpef(boxg boxgVar, List<boxf> list, cqhn cqhnVar, bped bpedVar) {
        this.c = boxf.UNKNOWN;
        this.a = boxgVar;
        if (list.contains(boxgVar.b)) {
            this.c = boxgVar.b;
        }
        dccx F = dcdc.F();
        for (boxf boxfVar : list) {
            boolean equals = this.c.equals(boxfVar);
            cqkn<bpwa> cqknVar = this.d;
            bpeb a = bpedVar.a.a();
            bped.a(a, 1);
            bped.a(boxfVar, 2);
            bped.a(cqknVar, 4);
            F.g(new bpec(a, boxfVar, equals, cqknVar));
        }
        this.b = F.f();
    }

    @Override // defpackage.bpwb
    public List<bpwa> a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        dcdc<bpwa> dcdcVar = this.b;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            bpwa bpwaVar = dcdcVar.get(i);
            bpwaVar.c(bpwaVar.a().e().equals(this.a.b));
        }
        cqkx.p(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.a.a();
    }
}

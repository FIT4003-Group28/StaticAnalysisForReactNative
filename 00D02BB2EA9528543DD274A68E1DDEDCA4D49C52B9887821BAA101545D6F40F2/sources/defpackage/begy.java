package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: begy  reason: default package */
/* loaded from: classes3.dex */
public class begy implements jbn {
    private final bvjj a;
    private final beha b;
    private final behc c;
    private List<jbm> d = dcdc.e();

    public begy(bvjj bvjjVar, beha behaVar, behc behcVar) {
        this.a = bvjjVar;
        this.b = behaVar;
        this.c = behcVar;
    }

    @Override // defpackage.jbn
    public List<jbm> a() {
        return this.d;
    }

    @Override // defpackage.jbn
    public Boolean b() {
        return Boolean.valueOf(this.d.isEmpty());
    }

    @Override // defpackage.jbn
    public Integer c() {
        return 0;
    }

    @Override // defpackage.jbn
    public Boolean d() {
        boolean z = true;
        if (this.d.size() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void e(@dzsi ilo iloVar) {
        if (iloVar != null && !iloVar.cV().a.isEmpty()) {
            int i = 0;
            if (!iloVar.cV().a.get(0).f.isEmpty()) {
                dsrj<dqfo> dsrjVar = iloVar.cV().a.get(0).f;
                cjtd bZ = iloVar.bZ();
                dccx F = dcdc.F();
                for (dqfo dqfoVar : dsrjVar) {
                    abfl a = this.c.a.a();
                    behc.a(a, 1);
                    behc.a(dqfoVar, 2);
                    behc.a(bZ, 4);
                    F.g(new behb(a, dqfoVar, i, bZ));
                    i++;
                }
                this.d = F.f();
                this.a.W(bvjk.kx, this.d.size());
                cqkx.p(this);
            }
        }
        if (iloVar == null || iloVar.at() == null || iloVar.bg()) {
            this.d = dcdc.e();
        } else {
            beha behaVar = this.b;
            dxio a2 = ((dxjh) behaVar.a).a();
            beha.a(a2, 1);
            cklq a3 = behaVar.b.a();
            beha.a(a3, 2);
            beha.a(iloVar, 3);
            this.d = dcdc.f(new begz(a2, a3, iloVar));
        }
        this.a.W(bvjk.kx, this.d.size());
        cqkx.p(this);
    }
}

package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bago  reason: default package */
/* loaded from: classes3.dex */
public class bago implements baep {
    public final gga a;
    public final bbai b;
    public boolean c;
    public dcdc<bayj> d = dcdc.e();
    private final btpc e;
    private final Executor f;
    private boolean g;
    private final bvbi h;

    public bago(btpc btpcVar, Executor executor, gga ggaVar, bbai bbaiVar, bvbi bvbiVar) {
        this.e = btpcVar;
        this.f = executor;
        this.a = ggaVar;
        this.b = bbaiVar;
        this.h = bvbiVar;
    }

    @Override // defpackage.baep
    public Boolean a() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.baep
    public baye b() {
        if (this.c) {
            return new bagl(this);
        }
        return new bagm(this);
    }

    @Override // defpackage.baep
    public List<bayj> c() {
        return this.d;
    }

    public void d() {
        if (this.e.i() || !this.d.isEmpty()) {
            this.c = false;
            this.g = true;
            bvbi bvbiVar = this.h;
            dwxm bZ = dwxn.e.bZ();
            dusl bZ2 = dusm.a.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dusm.c((dusm) bZ2.b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwxn dwxnVar = (dwxn) bZ.b;
            dusm bK = bZ2.bK();
            bK.getClass();
            dwxnVar.c = bK;
            dwxnVar.a |= 16;
            bvbiVar.b(bZ.bK(), new bagn(this), this.f);
            return;
        }
        this.g = false;
        this.c = true;
        cqkx.p(this);
    }
}

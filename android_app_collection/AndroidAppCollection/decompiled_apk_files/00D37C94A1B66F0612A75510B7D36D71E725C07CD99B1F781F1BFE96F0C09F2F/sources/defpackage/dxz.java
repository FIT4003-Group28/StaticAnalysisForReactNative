package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxz  reason: default package */
/* loaded from: classes3.dex */
public final class dxz implements azqb {
    private final dya a;
    private final int b;

    public dxz(dya dyaVar, int i) {
        this.a = dyaVar;
        this.b = i;
    }

    @Override // defpackage.azqb
    public final Object get() {
        switch (this.b) {
            case 0:
                dya dyaVar = this.a;
                return new hra(dyaVar.c.a(), (Executor) dyaVar.b.h.get());
            case 1:
                dya dyaVar2 = this.a;
                return new hrd(dyaVar2.c.a(), dyaVar2.a, (hra) dyaVar2.d.get(), new aakr(), (htu) dyaVar2.e.get(), (acth) dyaVar2.c.L.get(), (hwq) dyaVar2.b.a.aG.get(), null, null);
            case 2:
                dya dyaVar3 = this.a;
                return new htu(dyaVar3.c.a(), (Handler) dyaVar3.b.an.get());
            case 3:
                dya dyaVar4 = this.a;
                return new hsq(dyaVar4.c.hQ(), dyaVar4.c.a(), dyaVar4.a, (aadd) dyaVar4.b.K.get(), dyaVar4.a(), new aakr(), (htu) dyaVar4.e.get(), (hwq) dyaVar4.b.a.aG.get(), (akdr) dyaVar4.b.yY.get(), null, null);
            case 4:
                dya dyaVar5 = this.a;
                dwq dwqVar = dyaVar5.c;
                return new hub(new iie(dwqVar.f, dwqVar.lU), (dt) dyaVar5.c.s.get(), (ajmy) dyaVar5.b.kC.get(), dyaVar5.a, dyaVar5.a(), new aakr(), (htu) dyaVar5.e.get(), (acth) dyaVar5.c.L.get(), (hwq) dyaVar5.b.a.aG.get(), null, null);
            case 5:
                dya dyaVar6 = this.a;
                return new hun((dt) dyaVar6.c.s.get(), dyaVar6.a, dyaVar6.a(), new aakr(), (ajmy) dyaVar6.b.kC.get(), (Handler) dyaVar6.b.an.get(), dyaVar6.c.ch(), (aafo) dyaVar6.c.H.get(), null, null);
            case 6:
                dya dyaVar7 = this.a;
                return new hut((hux) dyaVar7.k.get(), dyaVar7.a, (Executor) dyaVar7.b.h.get(), (hwq) dyaVar7.b.a.aG.get(), (htu) dyaVar7.e.get(), (acth) dyaVar7.c.L.get());
            case 7:
                dya dyaVar8 = this.a;
                return new hux(dyaVar8.c.a(), (ajmy) dyaVar8.b.kC.get(), (Executor) dyaVar8.b.h.get(), (hvk) dyaVar8.j.get());
            case 8:
                dya dyaVar9 = this.a;
                return new hvk(dyaVar9.c.a(), (snc) dyaVar9.b.v.get(), (Executor) dyaVar9.b.h.get());
            case 9:
                dya dyaVar10 = this.a;
                return new hvl(dyaVar10.c.a(), new aakr(), dyaVar10.a, (hwq) dyaVar10.b.a.aG.get(), 1, null, null);
            case 10:
                dya dyaVar11 = this.a;
                return new hvd(dyaVar11.c.a(), (hux) dyaVar11.k.get(), new aakr(), (Executor) dyaVar11.b.h.get(), dyaVar11.a, (acth) dyaVar11.c.L.get(), (htu) dyaVar11.e.get(), null, null);
            case 11:
                dya dyaVar12 = this.a;
                return new hvh((dt) dyaVar12.c.s.get(), dyaVar12.a, new aakr(), (ajmy) dyaVar12.b.kC.get(), dyaVar12.c.ch(), null, null);
            default:
                dya dyaVar13 = this.a;
                return new hvl(dyaVar13.c.a(), new aakr(), dyaVar13.a, (hwq) dyaVar13.b.a.aG.get(), null, null);
        }
    }
}

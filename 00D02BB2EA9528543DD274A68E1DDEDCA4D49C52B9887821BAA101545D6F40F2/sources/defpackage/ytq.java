package defpackage;

import java.util.HashSet;
import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: ytq  reason: default package */
/* loaded from: classes7.dex */
final class ytq implements btzi<digz, dihh> {
    final /* synthetic */ int a;
    final /* synthetic */ degu b;
    final /* synthetic */ ytr c;

    public ytq(ytr ytrVar, int i, degu deguVar) {
        this.c = ytrVar;
        this.a = i;
        this.b = deguVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<digz> btzrVar, btzy btzyVar) {
        this.c.b(this.a);
        if (btzyVar.equals(btzy.d)) {
            this.b.a(new CancellationException());
        } else {
            this.b.a(new yve());
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<digz> btzrVar, dihh dihhVar) {
        final dihh dihhVar2 = dihhVar;
        this.c.b(this.a);
        dccx F = dcdc.F();
        F.i(dcft.o(dihhVar2.b, new dbrn(dihhVar2) { // from class: ytp
            private final dihh a;

            {
                this.a = dihhVar2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dihh dihhVar3 = this.a;
                dihg dihgVar = (dihg) obj;
                yvj e = yvk.e();
                e.d(dihgVar.a);
                e.b(dcdc.q(dcft.o(dihgVar.b, new dbrn(dihhVar3) { // from class: yto
                    private final dihh a;

                    {
                        this.a = dihhVar3;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        dihh dihhVar4 = this.a;
                        return dihhVar4.a.get(((dihd) obj2).a);
                    }
                })));
                int a = dihf.a(dihgVar.c);
                if (a == 0) {
                    a = 1;
                }
                e.e(a);
                e.c(dcdc.r(dihgVar.d));
                return e.a();
            }
        }));
        HashSet hashSet = new HashSet();
        dcft.h(hashSet, dcft.o(btzrVar.a.b, ytl.a));
        hashSet.removeAll(dcep.L(dcft.o(dihhVar2.b, ytm.a)));
        F.i(dcdc.q(dcbg.b(hashSet).s(ytn.a)));
        degu deguVar = this.b;
        yva yvaVar = new yva();
        dcdc<yvk> f = F.f();
        if (f != null) {
            yvaVar.a = f;
            String str = yvaVar.a == null ? " vehicles" : "";
            if (!str.isEmpty()) {
                throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
            }
            deguVar.b(new yvb(yvaVar.a));
            return;
        }
        throw new NullPointerException("Null vehicles");
    }
}

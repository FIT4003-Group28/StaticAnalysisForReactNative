package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: voc  reason: default package */
/* loaded from: classes7.dex */
final class voc implements degu<Collection<dlzr>> {
    final /* synthetic */ voe a;
    final /* synthetic */ List b;
    final /* synthetic */ vog c;

    public voc(vog vogVar, voe voeVar, List list) {
        this.c = vogVar;
        this.a = voeVar;
        this.b = list;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        voe voeVar = this.a;
        voeVar.a = false;
        vog.c(voeVar, this.b, 4);
        this.c.d(5);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Collection<dlzr> collection) {
        vog vogVar = this.c;
        voe voeVar = this.a;
        for (dlzr dlzrVar : collection) {
            wuv d = voeVar.d(wut.b(dlzrVar.b));
            if (d != null && d.v() == 3) {
                int i = dlzrVar.a;
                if ((i & 1) == 0 || (i & 4) == 0 || (i & 2) == 0) {
                    bvoo.h("received malformed TripEstimate", new Object[0]);
                } else {
                    wuu r = d.r();
                    if (r == null || !r.a().equals(dlzrVar.b)) {
                        bvoo.h("TripEstimate does not match this product", new Object[0]);
                    } else {
                        wuq u = d.u();
                        u.i(5);
                        dquj dqujVar = dlzrVar.d;
                        if (dqujVar == null) {
                            dqujVar = dquj.f;
                        }
                        u.d(dqujVar);
                        dgas dgasVar = dlzrVar.c;
                        if (dgasVar == null) {
                            dgasVar = dgas.e;
                        }
                        u.j(dgasVar);
                        d = u.a();
                    }
                }
                voeVar.a(d);
            }
        }
        vogVar.d(4);
    }
}

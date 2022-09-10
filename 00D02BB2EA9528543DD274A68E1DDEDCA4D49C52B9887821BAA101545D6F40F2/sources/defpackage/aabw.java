package defpackage;

import java.io.Serializable;
import java.util.List;
/* compiled from: PG */
/* renamed from: aabw  reason: default package */
/* loaded from: classes2.dex */
final class aabw implements Serializable {
    final dcdc<bvrt<dhxz>> a;

    public aabw(List<dhxz> list) {
        dccx G = dcdc.G(list.size());
        for (dhxz dhxzVar : list) {
            G.g(bvrt.b(dhxzVar));
        }
        this.a = G.f();
    }
}

package defpackage;

import java.io.Serializable;
import java.util.List;
/* compiled from: PG */
/* renamed from: aabx  reason: default package */
/* loaded from: classes2.dex */
final class aabx implements Serializable {
    final dcdc<aabw> a;

    public aabx(aaby aabyVar) {
        dccx G = dcdc.G(aabyVar.f.size());
        for (List<dhxz> list : aabyVar.f) {
            G.g(new aabw(list));
        }
        this.a = G.f();
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: dfaq  reason: default package */
/* loaded from: classes6.dex */
public final class dfaq extends dewl {
    public final dewj a;
    public final dzsj<? extends Collection<? extends dfbd>> b;
    private final ConcurrentHashMap<dewu, dyeu> c;

    public dfaq(dewj dewjVar, dzsj<? extends Collection<? extends dfbd>> dzsjVar) {
        super(dewt.a);
        this.c = new ConcurrentHashMap<>();
        this.a = dewjVar;
        this.b = dzsjVar;
    }

    @Override // defpackage.dewl
    public final dyeu a(final dewu dewuVar) {
        dyeu dyeuVar = this.c.get(dewuVar);
        if (dyeuVar != null) {
            return dyeuVar;
        }
        dccx F = dcdc.F();
        F.g(dfbg.a(new dzsj(this, dewuVar) { // from class: dfam
            private final dfaq a;
            private final dewu b;

            {
                this.a = this;
                this.b = dewuVar;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return dcdc.i(new dfax(this.b), new dezy(this.a.a), new dezm(), new dfco());
            }
        }));
        F.g(dfbg.a(new dzsj(this) { // from class: dfan
            private final dfaq a;

            {
                this.a = this;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return dcdc.r((Collection) ((dxjd) this.a.b).a);
            }
        }));
        if (this.a.i() != null) {
            F.g(new dfat());
        }
        if (this.a.h() == null) {
            F.g(new dfau());
        } else {
            F.g(new dezv());
            F.g(dfbg.a(dfao.a));
        }
        F.g(new dfaa());
        F.g(dfbg.a(dfap.a));
        dfaw dfawVar = new dfaw(dewuVar, this.a);
        ArrayList arrayList = new ArrayList(F.f());
        Collections.reverse(arrayList);
        dyeu b = dyfa.b(dfawVar, arrayList);
        dyeu putIfAbsent = this.c.putIfAbsent(dewuVar, b);
        return putIfAbsent != null ? putIfAbsent : b;
    }
}

package defpackage;

import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amlt  reason: default package */
/* loaded from: classes.dex */
public class amlt {
    private final amlt a;
    public final agd b;
    public boolean c = false;

    public amlt(amlt amltVar, agd agdVar) {
        if (amltVar != null) {
            aqxo.p(amltVar.c);
        }
        this.a = amltVar;
        this.b = agdVar;
    }

    public static amlr b() {
        return new amls(amls.a, new agd());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amlt c(Set set) {
        if (set.isEmpty()) {
            return amls.a;
        }
        if (set.size() == 1) {
            return (amlt) set.iterator().next();
        }
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            amlt amltVar = (amlt) it.next();
            do {
                i += amltVar.b.j;
                amltVar = amltVar.a;
            } while (amltVar != null);
        }
        if (i == 0) {
            return amls.a;
        }
        agd agdVar = new agd(i);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            amlt amltVar2 = (amlt) it2.next();
            do {
                int i2 = 0;
                while (true) {
                    agd agdVar2 = amltVar2.b;
                    if (i2 >= agdVar2.j) {
                        break;
                    }
                    aqxo.u(agdVar.put((antz) agdVar2.f(i2), amltVar2.b.i(i2)) == null, "Duplicate bindings: %s", amltVar2.b.f(i2));
                    i2++;
                }
                amltVar2 = amltVar2.a;
            } while (amltVar2 != null);
        }
        return new amls(null, agdVar).e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amlt d(amlt amltVar, amlt amltVar2) {
        return amltVar.f() ? amltVar2 : amltVar2.f() ? amltVar : c(amvn.s(amltVar, amltVar2));
    }

    public final amlt e() {
        if (!this.c) {
            this.c = true;
            return (this.a == null || !this.b.isEmpty()) ? this : this.a;
        }
        throw new IllegalStateException("Already frozen");
    }

    final boolean f() {
        return this == amls.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object g(antz antzVar) {
        amlt amltVar;
        aqxo.y(this.c);
        Object obj = this.b.get(antzVar);
        return (obj != null || (amltVar = this.a) == null) ? obj : amltVar.g(antzVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(antz antzVar) {
        amlt amltVar;
        return this.b.containsKey(antzVar) || ((amltVar = this.a) != null && amltVar.h(antzVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (amlt amltVar = this; amltVar != null; amltVar = amltVar.a) {
            for (int i = 0; i < amltVar.b.j; i++) {
                sb.append(this.b.i(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}

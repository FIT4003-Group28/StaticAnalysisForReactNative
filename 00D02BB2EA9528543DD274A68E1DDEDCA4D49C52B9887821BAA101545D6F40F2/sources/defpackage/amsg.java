package defpackage;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amsg  reason: default package */
/* loaded from: classes2.dex */
public final class amsg implements amrl {
    private final Map<aktc, ? extends amrl> a;
    private final int b;
    private final Set<aktc> c = new HashSet();

    public amsg(Map<aktc, ? extends amrl> map, int i) {
        this.a = map;
        this.b = i;
    }

    @Override // defpackage.amrl
    public final boolean a(aktc aktcVar, amrk amrkVar, amrj amrjVar) {
        amrl amrlVar = this.a.get(aktcVar);
        if (amrlVar == null) {
            return false;
        }
        if (this.c.contains(aktcVar)) {
            if (amrlVar.a(aktcVar, amrkVar, amrjVar)) {
                return true;
            }
            this.c.remove(aktcVar);
            return false;
        } else if (this.c.size() >= this.b || !amrlVar.a(aktcVar, amrkVar, amrjVar)) {
            return false;
        } else {
            this.c.add(aktcVar);
            return true;
        }
    }
}

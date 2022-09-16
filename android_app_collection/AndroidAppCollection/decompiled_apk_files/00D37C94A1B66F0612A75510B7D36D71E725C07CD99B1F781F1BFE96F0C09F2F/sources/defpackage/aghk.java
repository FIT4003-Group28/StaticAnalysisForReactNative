package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: aghk  reason: default package */
/* loaded from: classes.dex */
public final class aghk {
    private final azqb a;

    public aghk(azqb azqbVar) {
        this.a = azqbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(agqa agqaVar) {
        ylr.b();
        aglj agljVar = (aglj) this.a.get();
        if (agljVar.b(agqaVar.a) == null) {
            agljVar.O(agqaVar);
        } else {
            agljVar.S(agqaVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(agqo agqoVar) {
        agqa agqaVar = agqoVar.a;
        if (agqaVar != null) {
            a(agqaVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((agqo) it.next());
        }
    }
}

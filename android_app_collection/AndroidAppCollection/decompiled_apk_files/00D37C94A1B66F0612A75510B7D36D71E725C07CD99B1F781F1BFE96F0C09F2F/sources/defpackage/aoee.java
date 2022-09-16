package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: aoee  reason: default package */
/* loaded from: classes.dex */
public final class aoee implements anci {
    private static final anbf a = new aoed("", amuk.q());
    private final azqb b;

    public aoee(azqb azqbVar) {
        this.b = azqbVar;
    }

    @Override // defpackage.anci
    public final anbf a(String str) {
        Set<anci> set = (Set) ((axov) this.b).a;
        int size = set.size();
        if (size != 0) {
            if (size == 1) {
                return ((anci) set.iterator().next()).a(str);
            }
            amuf h = amuk.h(size);
            for (anci anciVar : set) {
                h.h(anciVar.a(str));
            }
            return new aoed(str, h.g());
        }
        return a;
    }
}

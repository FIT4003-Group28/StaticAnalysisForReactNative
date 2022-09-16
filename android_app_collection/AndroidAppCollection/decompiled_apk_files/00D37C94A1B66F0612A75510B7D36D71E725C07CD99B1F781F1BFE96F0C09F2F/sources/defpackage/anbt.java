package defpackage;

import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: anbt  reason: default package */
/* loaded from: classes.dex */
public final class anbt {
    private static final anbp a = new anbr();
    private static final anbo b = new anbs();

    public static anbq a(Set set) {
        anbm anbmVar = new anbm(a);
        anbmVar.f = b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            anas anasVar = (anas) it.next();
            anha.c(anasVar, "key");
            if (anasVar.b) {
                anbo anboVar = anbm.b;
                anha.c(anasVar, "key");
                anha.d(anasVar.b, "key must be repeating");
                anbmVar.c.remove(anasVar);
                anbmVar.d.put(anasVar, anboVar);
            } else {
                anbp anbpVar = anbm.a;
                anha.c(anasVar, "key");
                anbmVar.d.remove(anasVar);
                anbmVar.c.put(anasVar, anbpVar);
            }
        }
        return new anbn(anbmVar);
    }
}

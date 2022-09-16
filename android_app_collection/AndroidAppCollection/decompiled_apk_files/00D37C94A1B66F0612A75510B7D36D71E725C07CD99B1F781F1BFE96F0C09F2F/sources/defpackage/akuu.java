package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akuu  reason: default package */
/* loaded from: classes.dex */
public final class akuu {
    public final Object a = new Object();
    public final Map b = new HashMap();
    private final azqb c;

    public akuu(azqb azqbVar) {
        this.c = azqbVar;
    }

    public final void a(aven avenVar, boolean z) {
        synchronized (this.a) {
            aktp aktpVar = (aktp) this.c.get();
            aopa mo52toBuilder = avenVar.mo52toBuilder();
            aktpVar.d(mo52toBuilder);
            aktpVar.c(mo52toBuilder);
            aven avenVar2 = (aven) mo52toBuilder.mo39build();
            for (akwl akwlVar : this.b.values()) {
                if (akwlVar.b()) {
                    if (z) {
                        akwlVar.d(avenVar2);
                    } else {
                        akwlVar.c(avenVar2);
                    }
                }
            }
        }
    }
}

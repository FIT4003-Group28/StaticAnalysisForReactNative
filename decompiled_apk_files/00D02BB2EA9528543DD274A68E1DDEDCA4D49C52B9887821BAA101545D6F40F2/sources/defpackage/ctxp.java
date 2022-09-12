package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: ctxp  reason: default package */
/* loaded from: classes5.dex */
public final class ctxp {
    private static ctxp a;
    private final Set<ctxp> b = Collections.newSetFromMap(new WeakHashMap());

    private ctxp() {
    }

    public static synchronized ctxp a() {
        ctxp ctxpVar;
        synchronized (ctxp.class) {
            ctxpVar = a;
            if (ctxpVar == null) {
                ctxpVar = new ctxp();
                a = ctxpVar;
            }
        }
        return ctxpVar;
    }

    public final void b(String str, UUID uuid) {
        for (ctxp ctxpVar : this.b) {
            ctxpVar.b(str, uuid);
        }
    }

    public final void c(String str, UUID uuid) {
        for (ctxp ctxpVar : this.b) {
            ctxpVar.c(str, uuid);
        }
    }
}

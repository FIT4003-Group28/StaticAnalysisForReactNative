package defpackage;

import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: axyx  reason: default package */
/* loaded from: classes2.dex */
public final class axyx {
    static final Logger a = Logger.getLogger(axyx.class.getName());
    public static final axyx b = new axyx();

    private axyx() {
    }

    public static axyx b() {
        axyx a2 = axyv.a.a();
        return a2 == null ? b : a2;
    }

    public static void d(Object obj, Object obj2) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException((String) obj2);
    }

    public final axyx a() {
        axyx b2 = axyv.a.b(this);
        return b2 == null ? b : b2;
    }

    public final void c(axyx axyxVar) {
        d(axyxVar, "toAttach");
        axyv.a.c(this, axyxVar);
    }
}

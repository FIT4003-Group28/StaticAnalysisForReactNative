package defpackage;

import java.util.TreeMap;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: aez  reason: default package */
/* loaded from: classes.dex */
public final class aez {
    public final afh a;

    public aez() {
        afh afhVar = new afh(new TreeMap(afh.a));
        this.a = afhVar;
        Class cls = (Class) afhVar.a(afl.e);
        if (cls == null || cls.equals(aey.class)) {
            afhVar.b(afl.e, aey.class);
            if (afhVar.a(afl.d) != null) {
                return;
            }
            afhVar.b(afl.d, aey.class.getCanonicalName() + "-" + UUID.randomUUID());
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}

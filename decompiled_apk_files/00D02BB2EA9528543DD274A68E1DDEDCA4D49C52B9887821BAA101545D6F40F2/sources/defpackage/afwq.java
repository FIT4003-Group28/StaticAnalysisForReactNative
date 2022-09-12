package defpackage;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;
/* compiled from: PG */
@btsb
/* renamed from: afwq  reason: default package */
/* loaded from: classes.dex */
public final class afwq {
    private final EnumSet<afwm> a;

    public afwq(Set<afwm> set) {
        this.a = EnumSet.copyOf((Collection) set);
    }

    public final boolean a(afwm afwmVar) {
        return this.a.contains(afwmVar);
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("enabledLayers", this.a);
        return b.toString();
    }
}

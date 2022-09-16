package defpackage;

import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: las  reason: default package */
/* loaded from: classes3.dex */
public final class las {
    public aupl b;
    public int c = -1;
    public final Map a = new WeakHashMap();

    public final lar a(aupl auplVar) {
        if ((auplVar.b & 2) != 0) {
            return (lar) this.a.get(pns.h(auplVar));
        }
        return null;
    }
}

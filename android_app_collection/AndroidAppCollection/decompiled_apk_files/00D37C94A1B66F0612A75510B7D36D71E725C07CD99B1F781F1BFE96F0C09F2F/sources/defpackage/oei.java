package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: oei  reason: default package */
/* loaded from: classes3.dex */
public final class oei {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());

    public final void a(oeh oehVar) {
        oehVar.getClass();
        this.a.add(oehVar);
    }

    public final void b() {
        for (oeh oehVar : this.a) {
            oehVar.k();
        }
    }
}

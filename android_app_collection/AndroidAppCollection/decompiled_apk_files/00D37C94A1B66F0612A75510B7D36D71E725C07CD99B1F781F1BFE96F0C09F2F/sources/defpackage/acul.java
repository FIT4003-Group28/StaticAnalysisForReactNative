package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: acul  reason: default package */
/* loaded from: classes.dex */
public abstract class acul {
    public static final acul b = new acuj();
    private final Set a = Collections.newSetFromMap(new WeakHashMap());

    public abstract boolean a();

    public final void b(acuk acukVar) {
        this.a.add(acukVar);
    }

    public final void c() {
        for (acuk acukVar : this.a) {
            acukVar.a();
        }
    }
}

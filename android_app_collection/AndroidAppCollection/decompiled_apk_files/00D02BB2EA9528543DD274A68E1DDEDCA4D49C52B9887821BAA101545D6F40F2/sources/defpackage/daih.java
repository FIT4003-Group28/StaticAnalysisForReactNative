package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: daih  reason: default package */
/* loaded from: classes5.dex */
public final class daih<StateT> {
    protected final Set<btbl> a = new HashSet();

    public final synchronized void a(StateT statet) {
        for (btbl btblVar : this.a) {
            btblVar.a(statet);
        }
    }

    public final synchronized void b(btbl btblVar) {
        this.a.add(btblVar);
    }
}

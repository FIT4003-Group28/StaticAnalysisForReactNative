package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: oek  reason: default package */
/* loaded from: classes3.dex */
public final class oek {
    public boolean a;
    private final Set b = Collections.newSetFromMap(new WeakHashMap());

    public final void a(oej oejVar) {
        oejVar.getClass();
        this.b.add(oejVar);
    }

    public final void b() {
        c(false);
    }

    public final void c(boolean z) {
        if (this.a == z) {
            return;
        }
        this.a = z;
        for (oej oejVar : this.b) {
            oejVar.a(z);
        }
    }
}

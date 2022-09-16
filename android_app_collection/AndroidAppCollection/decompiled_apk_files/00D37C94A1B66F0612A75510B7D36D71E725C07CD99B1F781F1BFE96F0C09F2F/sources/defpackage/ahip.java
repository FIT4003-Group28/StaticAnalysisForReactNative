package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: ahip  reason: default package */
/* loaded from: classes.dex */
public final class ahip {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        for (ahin ahinVar : this.a) {
            ahinVar.a(this.b);
        }
    }
}

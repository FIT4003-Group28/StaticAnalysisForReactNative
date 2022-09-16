package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: csm  reason: default package */
/* loaded from: classes3.dex */
public final class csm {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final Set b = new HashSet();
    public boolean c;

    public final boolean a(cth cthVar) {
        boolean z = true;
        if (cthVar == null) {
            return true;
        }
        boolean remove = this.a.remove(cthVar);
        if (!this.b.remove(cthVar) && !remove) {
            z = false;
        }
        if (z) {
            cthVar.c();
        }
        return z;
    }

    public final String toString() {
        String obj = super.toString();
        int size = this.a.size();
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 41);
        sb.append(obj);
        sb.append("{numRequests=");
        sb.append(size);
        sb.append(", isPaused=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

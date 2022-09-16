package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: cgw  reason: default package */
/* loaded from: classes.dex */
public final class cgw {
    public final Set<chs> a = Collections.newSetFromMap(new WeakHashMap());
    public final List<chs> b = new ArrayList();
    public boolean c;

    public final boolean a(chs chsVar) {
        boolean z = true;
        if (chsVar == null) {
            return true;
        }
        boolean remove = this.a.remove(chsVar);
        if (!this.b.remove(chsVar) && !remove) {
            z = false;
        }
        if (z) {
            chsVar.b();
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

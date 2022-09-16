package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xei  reason: default package */
/* loaded from: classes4.dex */
public final class xei {
    private final Map a = new HashMap();

    public final xeh a(String str) {
        return (xeh) this.a.get(str);
    }

    public final xeh b(String str) {
        return (xeh) this.a.remove(str);
    }

    public final List c() {
        try {
            Collection values = this.a.values();
            ArrayList arrayList = new ArrayList(values.size());
            arrayList.addAll(values);
            return arrayList;
        } catch (RuntimeException e) {
            boolean z = Looper.myLooper() == Looper.getMainLooper();
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 81);
            sb.append("[Control flow] failed to grab registered triggers. Is main thread? ");
            sb.append(z);
            sb.append(", error: ");
            sb.append(message);
            afus.b(2, 1, sb.toString());
            return new ArrayList();
        }
    }

    public final void d(String str, xeh xehVar) {
        this.a.put(str, xehVar);
    }

    public final boolean e(String str) {
        return this.a.containsKey(str);
    }
}

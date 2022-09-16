package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afix  reason: default package */
/* loaded from: classes.dex */
public final class afix {
    public final Map a = new HashMap();

    public final Set a() {
        return this.a.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, String str2) {
        List list = (List) this.a.get(str);
        if (list == null) {
            this.a.put(str, amxp.r(str2));
            return;
        }
        list.clear();
        list.add(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(String str, String str2) {
        List list = (List) this.a.get(str);
        if (list == null) {
            this.a.put(str, amxp.r(str2));
        } else {
            list.add(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str, String str2) {
        if (!this.a.containsKey(str)) {
            c(str, str2);
        }
    }
}

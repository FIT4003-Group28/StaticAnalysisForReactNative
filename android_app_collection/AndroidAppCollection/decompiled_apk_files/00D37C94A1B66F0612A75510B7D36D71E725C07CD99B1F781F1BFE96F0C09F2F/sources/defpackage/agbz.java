package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: agbz  reason: default package */
/* loaded from: classes.dex */
public final class agbz {
    public static final /* synthetic */ int c = 0;
    private static final amvn d = amvn.s("FEnotifications_inbox", "FEshared");
    public final Set b;
    public final Map a = new HashMap();
    private final Map e = new HashMap();

    public agbz(azqb azqbVar) {
        Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        this.b = newSetFromMap;
        newSetFromMap.addAll((Collection) azqbVar.get());
    }

    private final agbx h(String str) {
        for (agbx agbxVar : this.a.keySet()) {
            if (TextUtils.equals(agbxVar.a, str)) {
                return agbxVar;
            }
        }
        return null;
    }

    private final void i(agbx agbxVar) {
        this.a.put(agbxVar, false);
        f(agbxVar.a, agcf.a(agbxVar.b, agbxVar.d, false));
        for (agby agbyVar : this.b) {
            agbyVar.o(agbxVar.a, agbxVar.b, agbxVar.d);
        }
    }

    public final int a(String str) {
        ylr.c();
        int i = 0;
        if (str.equals("FEactivity")) {
            ArrayList arrayList = new ArrayList(Arrays.asList("FEshared", "FEnotifications_inbox"));
            for (agbx agbxVar : this.a.keySet()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals(agbxVar.a, (String) it.next())) {
                        if (!((Boolean) this.a.get(agbxVar)).booleanValue()) {
                            i += agbxVar.d;
                        }
                        it.remove();
                    }
                }
            }
            return i;
        }
        agbx h = h(str);
        if (h == null || ((Boolean) this.a.get(h)).booleanValue()) {
            return 0;
        }
        return h.d;
    }

    public final azpb b(String str) {
        if (!this.e.containsKey(str)) {
            this.e.put(str, azpa.as(agcf.b()).ax());
        }
        return (azpb) this.e.get(str);
    }

    public final void c(agby agbyVar, long j) {
        ylr.c();
        this.b.add(agbyVar);
        ArrayList arrayList = new ArrayList(this.a.keySet());
        Collections.sort(arrayList, utr.l);
        for (int i = 0; i < arrayList.size(); i++) {
            agbx agbxVar = (agbx) arrayList.get(i);
            if (!((Boolean) this.a.get(agbxVar)).booleanValue() || agbxVar.c > j) {
                String str = agbxVar.a;
                boolean z = agbxVar.b;
                int i2 = agbxVar.d;
                int i3 = agbxVar.c;
                if (i == arrayList.size() - 1) {
                    d.contains(agbxVar.a);
                }
                agbyVar.o(str, z, i2);
            }
        }
    }

    public final void d(String str) {
        ylr.c();
        agbx h = h(str);
        if (h != null) {
            this.a.put(h, true);
        }
        b(str).c(new agcf(false, 0, true));
        for (agby agbyVar : this.b) {
            agbyVar.l(str);
        }
    }

    public final void e(agbx agbxVar) {
        ylr.c();
        String str = agbxVar.a;
        if (str != null) {
            agbx h = h(str);
            if (h == null) {
                i(agbxVar);
            } else if (agbxVar.c < h.c) {
            } else {
                if (h.b != agbxVar.b) {
                    this.a.remove(h);
                    i(agbxVar);
                } else if (!((Boolean) this.a.get(h)).booleanValue()) {
                    this.a.remove(h);
                    i(agbxVar);
                } else if (agbxVar.c <= h.c) {
                } else {
                    this.a.remove(h);
                    i(agbxVar);
                }
            }
        }
    }

    public final void f(String str, agcf agcfVar) {
        b(str).c(agcfVar);
    }

    public final boolean g(String str) {
        ylr.c();
        if (str.equals("FEactivity")) {
            return g("FEshared") || g("FEnotifications_inbox");
        }
        agbx h = h(str);
        if (h == null) {
            return false;
        }
        return h.b && !((Boolean) this.a.get(h)).booleanValue();
    }
}

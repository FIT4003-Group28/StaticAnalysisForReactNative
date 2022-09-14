package defpackage;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ckgj  reason: default package */
/* loaded from: classes4.dex */
public enum ckgj {
    SEARCH_FOR_A_PLACE(0),
    ADD_A_MISSING_PLACE(1),
    ERROR_CARD(2),
    FIRST_AROUND_ME_PLACE(1000);
    
    private static final Map<Integer, ckgj> f = new HashMap();
    public final int e;

    static {
        Iterator it = EnumSet.allOf(ckgj.class).iterator();
        while (it.hasNext()) {
            ckgj ckgjVar = (ckgj) it.next();
            f.put(Integer.valueOf(ckgjVar.e), ckgjVar);
        }
    }

    ckgj(int i) {
        this.e = i;
    }
}

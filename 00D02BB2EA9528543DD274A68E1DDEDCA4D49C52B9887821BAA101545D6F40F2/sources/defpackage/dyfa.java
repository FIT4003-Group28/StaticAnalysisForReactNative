package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: dyfa  reason: default package */
/* loaded from: classes6.dex */
public final class dyfa {
    public static dyeu a(dyeu dyeuVar, dyey... dyeyVarArr) {
        return b(dyeuVar, Arrays.asList(dyeyVarArr));
    }

    public static dyeu b(dyeu dyeuVar, List<? extends dyey> list) {
        dbsk.t(dyeuVar, "channel");
        for (dyey dyeyVar : list) {
            dyeuVar = new dyez(dyeuVar, dyeyVar);
        }
        return dyeuVar;
    }
}

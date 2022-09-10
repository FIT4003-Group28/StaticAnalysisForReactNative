package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cbdi  reason: default package */
/* loaded from: classes4.dex */
public class cbdi {
    public static final cbdh a(@dzsi dpvi dpviVar, cayp caypVar, cbdw cbdwVar, boolean z, Context context, cbbc cbbcVar, Runnable runnable, cayn caynVar) {
        b(caypVar, 2);
        b(cbdwVar, 3);
        b(context, 5);
        b(cbbcVar, 6);
        b(runnable, 7);
        b(caynVar, 8);
        return new cbdh(dpviVar, caypVar, cbdwVar, z, context, cbbcVar, runnable, caynVar);
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}

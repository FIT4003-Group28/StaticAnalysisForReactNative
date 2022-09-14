package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: zbc  reason: default package */
/* loaded from: classes7.dex */
public final class zbc {
    public static String a(Context context, eapr eaprVar) {
        if (eaprVar instanceof eaol) {
            return bvtb.k(context, b(eaprVar), eaprVar.v().s());
        }
        return bvtb.i(context, b(eaprVar));
    }

    private static long b(eapr eaprVar) {
        return bvtb.a(TimeUnit.MILLISECONDS.toSeconds(eaprVar.Tf()));
    }
}

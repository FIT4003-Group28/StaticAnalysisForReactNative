package defpackage;

import android.content.Context;
import java.text.DateFormat;
import java.util.Date;
/* compiled from: PG */
/* renamed from: apka  reason: default package */
/* loaded from: classes2.dex */
public final class apka {
    public static String a(Context context, dwyn dwynVar) {
        return b(context, aogc.a(dwynVar));
    }

    public static String b(Context context, eaol eaolVar) {
        DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(context);
        timeFormat.setTimeZone(eaolVar.v().s());
        return timeFormat.format(new Date(eaolVar.a));
    }

    public static CharSequence c(Context context, dwyn dwynVar, dwyn dwynVar2) {
        return bvtb.e(context.getResources(), eapv.b(d(aogc.a(dwynVar)), d(aogc.a(dwynVar2))).p, bvsz.ABBREVIATED);
    }

    private static eaol d(eaol eaolVar) {
        return eaolVar.u().t();
    }
}

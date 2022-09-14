package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
/* compiled from: PG */
/* renamed from: bslk  reason: default package */
/* loaded from: classes4.dex */
public final class bslk {
    public static dbsg<djnm> a(dspd dspdVar) {
        try {
            djmv djmvVar = (djmv) dsqw.cp(djmv.c, dspdVar);
            return djmvVar.a == 21 ? dbsg.i((djnm) djmvVar.b) : dbpy.a;
        } catch (dsrm unused) {
            return dbpy.a;
        }
    }

    public static String b(eaol eaolVar, Context context) {
        return DateUtils.formatDateTime(context, eaolVar.a, 257);
    }

    public static String c(eaol eaolVar, Context context) {
        return DateUtils.formatDateTime(context, eaolVar.a, 98330);
    }
}

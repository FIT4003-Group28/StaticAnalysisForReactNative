package defpackage;

import android.os.Trace;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: zgl  reason: default package */
/* loaded from: classes4.dex */
final class zgl implements zgn {
    private static Method a;
    private static Method b;
    private static Method c;

    static {
        try {
            Class[] clsArr = {Long.TYPE, String.class, Integer.TYPE};
            a = Trace.class.getDeclaredMethod("asyncTraceBegin", clsArr);
            b = Trace.class.getDeclaredMethod("asyncTraceEnd", clsArr);
            a.setAccessible(true);
            b.setAccessible(true);
            Method declaredMethod = Trace.class.getDeclaredMethod("traceCounter", clsArr);
            c = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.zgn
    public final void a(String str) {
        if (str.length() >= 127) {
            str.substring(127);
        }
    }
}

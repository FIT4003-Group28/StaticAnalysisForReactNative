package defpackage;

import android.os.Build;
import android.os.Trace;
/* compiled from: PG */
@Deprecated
/* renamed from: aky  reason: default package */
/* loaded from: classes2.dex */
public final class aky {
    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Trace.class.getMethod("isTagEnabled", Long.TYPE);
                Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}

package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: czhb  reason: default package */
/* loaded from: classes5.dex */
public final class czhb {
    public static void a(Throwable th, StringBuilder sb, Set<Throwable> set, String str) {
        StackTraceElement[] stackTrace;
        if (th == null || set.contains(th)) {
            return;
        }
        set.add(th);
        if (str != null) {
            sb.append(str);
        }
        sb.append(th.getClass().getName());
        sb.append(':');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\n\tat ");
            sb.append(stackTraceElement);
        }
        for (Throwable th2 : deki.a.b(th)) {
            a(th2, sb, set, "\nSuppressed: ");
        }
        if (th.getCause() == null) {
            return;
        }
        a(th.getCause(), sb, set, "\nCaused by: ");
    }
}

package defpackage;

import android.util.Log;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
/* compiled from: PG */
/* renamed from: afus  reason: default package */
/* loaded from: classes.dex */
public final class afus {
    private static afuw a;
    private static Queue b = new ArrayBlockingQueue(10);

    public static void a(afuw afuwVar) {
        afuwVar.getClass();
        a = afuwVar;
        Queue queue = b;
        if (queue != null) {
            for (afur afurVar = (afur) queue.poll(); afurVar != null; afurVar = (afur) b.poll()) {
                Throwable th = afurVar.b;
                if (th != null) {
                    c(afurVar.c, afurVar.d, afurVar.a, th);
                } else {
                    final int i = afurVar.c;
                    final int i2 = afurVar.d;
                    final String str = afurVar.a;
                    final afuw afuwVar2 = a;
                    if (afuwVar2 == null) {
                        Queue queue2 = b;
                        if (queue2 != null && !queue2.offer(new afur(i, i2, str))) {
                            zep.l(String.format("ECatcher log not initialized: level: %s, category: %s, message: %s", ahfc.f(i), ahdq.h(i2), str));
                        }
                    } else if (!afuwVar2.e) {
                        zep.l(String.format("ECatcher disabled: level: %s, category: %s, message: %s", ahfc.f(i), ahdq.h(i2), str));
                    } else {
                        afuwVar2.a.execute(new Runnable() { // from class: afut
                            @Override // java.lang.Runnable
                            public final void run() {
                                afuw afuwVar3 = afuw.this;
                                int i3 = i;
                                int i4 = i2;
                                String str2 = str;
                                if (afuwVar3.d.h()) {
                                    ((acrm) afuwVar3.d.c()).a(afuwVar3.j(i3, i4, str2, null));
                                }
                                Map e = afuwVar3.e(str2);
                                zgp i5 = afuwVar3.i(i3, i4, null);
                                e.put("stacktrace.c++", null);
                                e.put("stacktrace.java", "");
                                afuwVar3.h(i5, e);
                            }
                        });
                    }
                }
            }
        }
        b = null;
    }

    public static void b(int i, int i2, String str) {
        c(i, i2, str, new Exception());
    }

    public static void c(final int i, final int i2, final String str, final Throwable th) {
        final afuw afuwVar = a;
        if (afuwVar != null) {
            if (!afuwVar.e) {
                zep.n(String.format("ECatcher disabled: level: %s, category: %s, message: %s", ahfc.f(i), ahdq.h(i2), str), th);
                return;
            } else {
                afuwVar.a.execute(new Runnable() { // from class: afuu
                    @Override // java.lang.Runnable
                    public final void run() {
                        afuw afuwVar2 = afuw.this;
                        int i3 = i;
                        int i4 = i2;
                        String str2 = str;
                        Throwable th2 = th;
                        if (afuwVar2.d.h()) {
                            ((acrm) afuwVar2.d.c()).a(afuwVar2.j(i3, i4, str2, th2));
                        }
                        if (afuwVar2.f) {
                            ((acrm) afuwVar2.c.get()).a(afuwVar2.j(i3, i4, str2, th2));
                            return;
                        }
                        String stackTraceString = Log.getStackTraceString(th2);
                        Map e = afuwVar2.e(str2);
                        zgp i5 = afuwVar2.i(i3, i4, th2.getClass().getCanonicalName());
                        e.put("stacktrace.java", stackTraceString);
                        afuwVar2.h(i5, e);
                    }
                });
                return;
            }
        }
        Queue queue = b;
        if (queue == null || queue.offer(new afur(i, i2, str, th))) {
            return;
        }
        zep.n(String.format("ECatcher log not initialized: level: %s, category: %s, message: %s", ahfc.f(i), ahdq.h(i2), str), th);
    }

    public static boolean d(int i, int i2, String str, Exception exc, double d) {
        if (Math.random() < d) {
            c(i, i2, str, exc);
            return true;
        }
        return false;
    }

    public static void e(int i, int i2, String str, double d) {
        if (Math.random() < d) {
            b(i, i2, str);
        }
    }

    public static void f(String str, Map map) {
        afuw afuwVar = a;
        if (afuwVar != null) {
            afuwVar.b = map;
        }
        b(2, 12, str);
    }
}

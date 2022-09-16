package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ammu  reason: default package */
/* loaded from: classes.dex */
public final class ammu extends RuntimeException {
    public ammu(Throwable th, StackTraceElement[] stackTraceElementArr) {
        super("", th);
        setStackTrace(stackTraceElementArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0278, code lost:
        if (r5 == r8.d()) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x027a, code lost:
        r5 = new defpackage.sop(r3);
        r5.initCause(new defpackage.ammu(null, f(r4, r8.a)));
        r3 = new java.util.ArrayList();
        r3.add(new java.lang.StackTraceElement(r5.getMessage(), "", null, 0));
        java.util.Collections.addAll(r3, r5.getStackTrace());
        r3 = (java.lang.StackTraceElement[]) r3.toArray(new java.lang.StackTraceElement[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0123, code lost:
        r17 = r0;
        r7 = r1;
        r18 = r9;
        r13 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.RuntimeException a(java.lang.Throwable r20) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ammu.a(java.lang.Throwable):java.lang.RuntimeException");
    }

    public static RuntimeException b(Thread thread) {
        ammz ammzVar;
        synchronized (amna.a) {
            ammzVar = (ammz) amna.a.get(thread);
        }
        return new ammu(null, f(ammzVar == null ? null : ammzVar.d, null));
    }

    public static RuntimeException c() {
        return new ammu(null, f(amna.a(), null));
    }

    public static void d(Throwable th) {
        throw new ammu(th, f(amna.a(), null));
    }

    public static void e(StackTraceElement[] stackTraceElementArr) {
        new ammt(stackTraceElementArr);
    }

    private static StackTraceElement[] f(amlv amlvVar, amlv amlvVar2) {
        ArrayList arrayList = new ArrayList();
        for (amlv amlvVar3 = amlvVar; amlvVar3 != amlvVar2; amlvVar3 = amlvVar3.a()) {
            arrayList.add(new StackTraceElement("tk_trace", amlvVar3.b(), null, 0));
        }
        if (amlvVar instanceof amkx) {
            arrayList.add(new StackTraceElement("tk_trace", "Missing root trace", null, 0));
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}

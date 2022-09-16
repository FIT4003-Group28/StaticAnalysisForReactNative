package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: anhq  reason: default package */
/* loaded from: classes.dex */
public abstract class anhq extends anjv implements Runnable {
    ankt a;
    Class b;
    Object c;

    public anhq(ankt anktVar, Class cls, Object obj) {
        anktVar.getClass();
        this.a = anktVar;
        this.b = cls;
        obj.getClass();
        this.c = obj;
    }

    public static ankt h(ankt anktVar, Class cls, ampg ampgVar, Executor executor) {
        anhp anhpVar = new anhp(anktVar, cls, ampgVar);
        anktVar.qY(anhpVar, anlz.h(executor, anhpVar));
        return anhpVar;
    }

    public static ankt i(ankt anktVar, Class cls, anir anirVar, Executor executor) {
        anho anhoVar = new anho(anktVar, cls, anirVar);
        anktVar.qY(anhoVar, anlz.h(executor, anhoVar));
        return anhoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anie
    public final String c() {
        String str;
        ankt anktVar = this.a;
        Class cls = this.b;
        Object obj = this.c;
        String c = super.c();
        if (anktVar != null) {
            String valueOf = String.valueOf(anktVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (c == null) {
                return null;
            }
            String valueOf2 = String.valueOf(str);
            return c.length() != 0 ? valueOf2.concat(c) : new String(valueOf2);
        }
        String valueOf3 = String.valueOf(cls);
        String valueOf4 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb2.append(str);
        sb2.append("exceptionType=[");
        sb2.append(valueOf3);
        sb2.append("], fallback=[");
        sb2.append(valueOf4);
        sb2.append("]");
        return sb2.toString();
    }

    public abstract Object f(Object obj, Throwable th);

    public abstract void g(Object obj);

    @Override // defpackage.anie
    protected final void qu() {
        n(this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            ankt r0 = r10.a
            java.lang.Class r1 = r10.b
            java.lang.Object r2 = r10.c
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Lc
            r5 = 1
            goto Ld
        Lc:
            r5 = 0
        Ld:
            if (r1 != 0) goto L11
            r6 = 1
            goto L12
        L11:
            r6 = 0
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            goto L17
        L16:
            r3 = 0
        L17:
            r3 = r3 | r5
            if (r3 != 0) goto Lb5
            boolean r3 = r10.isCancelled()
            if (r3 == 0) goto L22
            goto Lb5
        L22:
            r3 = 0
            r10.a = r3
            boolean r4 = r0 instanceof defpackage.anls     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            if (r4 == 0) goto L31
            r4 = r0
            anls r4 = (defpackage.anls) r4     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            java.lang.Throwable r4 = r4.k()     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            goto L32
        L31:
            r4 = r3
        L32:
            if (r4 != 0) goto L3a
            java.lang.Object r5 = defpackage.anlz.y(r0)     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            goto L8b
        L39:
            r4 = move-exception
        L3a:
            r5 = r3
            goto L8b
        L3c:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L89
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + 35
            int r7 = r7 + r8
            r9.<init>(r7)
            java.lang.String r7 = "Future type "
            r9.append(r7)
            r9.append(r6)
            java.lang.String r6 = " threw "
            r9.append(r6)
            r9.append(r4)
            java.lang.String r4 = " without a cause"
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r5.<init>(r4)
        L89:
            r4 = r5
            goto L3a
        L8b:
            if (r4 != 0) goto L91
            r10.o(r5)
            return
        L91:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto Lb2
            java.lang.Object r0 = r10.f(r2, r4)     // Catch: java.lang.Throwable -> La3
            r10.b = r3
            r10.c = r3
            r10.g(r0)
            return
        La3:
            r0 = move-exception
            r10.e(r0)     // Catch: java.lang.Throwable -> Lac
            r10.b = r3
            r10.c = r3
            return
        Lac:
            r0 = move-exception
            r10.b = r3
            r10.c = r3
            throw r0
        Lb2:
            r10.lV(r0)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anhq.run():void");
    }
}

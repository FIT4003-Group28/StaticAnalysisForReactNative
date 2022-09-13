package defpackage;

import java.lang.Throwable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: deee  reason: default package */
/* loaded from: classes6.dex */
public abstract class deee<V, X extends Throwable, F, T> extends dego<V> implements Runnable {
    dehn<? extends V> a;
    Class<X> b;
    F c;

    public deee(dehn<? extends V> dehnVar, Class<X> cls, F f) {
        dbsk.s(dehnVar);
        this.a = dehnVar;
        this.b = cls;
        dbsk.s(f);
        this.c = f;
    }

    public static <V, X extends Throwable> dehn<V> g(dehn<? extends V> dehnVar, Class<X> cls, dbrn<? super X, ? extends V> dbrnVar, Executor executor) {
        deed deedVar = new deed(dehnVar, cls, dbrnVar);
        dehnVar.Pk(deedVar, dehx.e(executor, deedVar));
        return deedVar;
    }

    public static <X extends Throwable, V> dehn<V> h(dehn<? extends V> dehnVar, Class<X> cls, defg<? super X, ? extends V> defgVar, Executor executor) {
        deec deecVar = new deec(dehnVar, cls, defgVar);
        dehnVar.Pk(deecVar, dehx.e(executor, deecVar));
        return deecVar;
    }

    @Override // defpackage.dees
    protected final void OO() {
        o(this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dees
    public final String OP() {
        String str;
        dehn<? extends V> dehnVar = this.a;
        Class<X> cls = this.b;
        F f = this.c;
        String OP = super.OP();
        if (dehnVar != null) {
            String valueOf = String.valueOf(dehnVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (cls == null || f == null) {
            if (OP == null) {
                return null;
            }
            String valueOf2 = String.valueOf(str);
            return OP.length() != 0 ? valueOf2.concat(OP) : new String(valueOf2);
        }
        String valueOf3 = String.valueOf(cls);
        String valueOf4 = String.valueOf(f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb2.append(str);
        sb2.append("exceptionType=[");
        sb2.append(valueOf3);
        sb2.append("], fallback=[");
        sb2.append(valueOf4);
        sb2.append("]");
        return sb2.toString();
    }

    public abstract void d(T t);

    public abstract T f(F f, X x);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Class<X extends java.lang.Throwable>, F] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            dehn<? extends V> r0 = r10.a
            java.lang.Class<X extends java.lang.Throwable> r1 = r10.b
            F r2 = r10.c
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
            boolean r4 = r0 instanceof defpackage.deiy     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            if (r4 == 0) goto L31
            r4 = r0
            deiy r4 = (defpackage.deiy) r4     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            java.lang.Throwable r4 = r4.n()     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            goto L32
        L31:
            r4 = r3
        L32:
            if (r4 != 0) goto L3a
            java.lang.Object r5 = defpackage.deha.r(r0)     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
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
            r10.j(r5)
            return
        L91:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto Lb2
            java.lang.Object r0 = r10.f(r2, r4)     // Catch: java.lang.Throwable -> La3
            r10.b = r3
            r10.c = r3
            r10.d(r0)
            return
        La3:
            r0 = move-exception
            r10.k(r0)     // Catch: java.lang.Throwable -> Lac
            r10.b = r3
            r10.c = r3
            return
        Lac:
            r0 = move-exception
            r10.b = r3
            r10.c = r3
            throw r0
        Lb2:
            r10.p(r0)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deee.run():void");
    }
}
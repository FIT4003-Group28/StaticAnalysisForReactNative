package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: vpt  reason: default package */
/* loaded from: classes4.dex */
public final class vpt implements vpr {
    public final vpz a;

    public vpt(final vpz vpzVar) {
        this.a = vpzVar;
        if (vpzVar.e) {
            return;
        }
        final ankt qp = vpzVar.c.qp(new Callable() { // from class: vpx
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
            /* JADX WARN: Type inference failed for: r0v0, types: [vpz] */
            /* JADX WARN: Type inference failed for: r0v16 */
            /* JADX WARN: Type inference failed for: r0v17 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.io.InputStream] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    r11 = this;
                    vpz r0 = defpackage.vpz.this
                    r1 = 0
                    android.content.Context r0 = r0.b     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L25
                    android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L25
                    r2 = 2131951683(0x7f130043, float:1.9539787E38)
                    java.io.InputStream r0 = r0.openRawResource(r2)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L25
                    aous r2 = defpackage.aous.a     // Catch: java.io.IOException -> L20 java.lang.Throwable -> Lb4
                    aorb r2 = r2.getParserForType()     // Catch: java.io.IOException -> L20 java.lang.Throwable -> Lb4
                    java.lang.Object r2 = r2.i(r0)     // Catch: java.io.IOException -> L20 java.lang.Throwable -> Lb4
                    aous r2 = (defpackage.aous) r2     // Catch: java.io.IOException -> L20 java.lang.Throwable -> Lb4
                L1c:
                    defpackage.anel.a(r0)
                    goto L3f
                L20:
                    r2 = move-exception
                    goto L28
                L22:
                    r0 = move-exception
                    goto Lb8
                L25:
                    r0 = move-exception
                    r2 = r0
                    r0 = r1
                L28:
                    r8 = r2
                    amzy r2 = defpackage.vpz.a     // Catch: java.lang.Throwable -> Lb4
                    anap r2 = r2.f()     // Catch: java.lang.Throwable -> Lb4
                    java.lang.String r3 = "Error reading config, using defaults."
                    java.lang.String r4 = "com/google/android/libraries/toolkit/monogram/impl/MonogramData"
                    java.lang.String r5 = "lambda$createPrefixToMonogramMap$1"
                    r6 = 98
                    java.lang.String r7 = "MonogramData.java"
                    defpackage.s.m(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lb4
                    aous r2 = defpackage.aous.a     // Catch: java.lang.Throwable -> Lb4
                    goto L1c
                L3f:
                    aoqp r0 = r2.b
                    java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
                    agd r2 = new agd
                    int r3 = r0.size()
                    r2.<init>(r3)
                    java.util.Set r0 = r0.entrySet()
                    java.util.Iterator r0 = r0.iterator()
                L56:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto Lb3
                    java.lang.Object r3 = r0.next()
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.Object r4 = r3.getKey()
                    java.lang.String r4 = (java.lang.String) r4
                    java.lang.Object r5 = r3.getValue()
                    java.lang.String r5 = (java.lang.String) r5
                    boolean r5 = r5.isEmpty()
                    if (r5 == 0) goto L76
                    r3 = r4
                    goto L7c
                L76:
                    java.lang.Object r3 = r3.getValue()
                    java.lang.String r3 = (java.lang.String) r3
                L7c:
                    char[] r4 = r4.toCharArray()
                    int r5 = r4.length
                    r6 = 0
                    r7 = r1
                L83:
                    if (r6 >= r5) goto Lb0
                    char r8 = r4[r6]
                    if (r7 != 0) goto L8b
                    r7 = r2
                    goto L98
                L8b:
                    agd r9 = r7.b
                    if (r9 != 0) goto L96
                    agd r9 = new agd
                    r9.<init>()
                    r7.b = r9
                L96:
                    agd r7 = r7.b
                L98:
                    java.lang.Character r8 = java.lang.Character.valueOf(r8)
                    java.lang.Object r9 = r7.get(r8)
                    vpy r9 = (defpackage.vpy) r9
                    if (r9 != 0) goto Lac
                    vpy r9 = new vpy
                    r9.<init>()
                    r7.put(r8, r9)
                Lac:
                    r7 = r9
                    int r6 = r6 + 1
                    goto L83
                Lb0:
                    r7.a = r3
                    goto L56
                Lb3:
                    return r2
                Lb4:
                    r1 = move-exception
                    r10 = r1
                    r1 = r0
                    r0 = r10
                Lb8:
                    defpackage.anel.a(r1)
                    goto Lbd
                Lbc:
                    throw r0
                Lbd:
                    goto Lbc
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.vpx.call():java.lang.Object");
            }
        });
        qp.qY(new Runnable() { // from class: vpw
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    vpz.this.d.set((agd) anlz.y(qp));
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
        }, anjk.a);
        vpzVar.e = true;
    }
}

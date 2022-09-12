package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: czte  reason: default package */
/* loaded from: classes5.dex */
public final class czte implements czsw {
    public final cztm a;

    public czte(final cztm cztmVar) {
        this.a = cztmVar;
        if (cztmVar.d) {
            return;
        }
        final dehn c = cztmVar.b.c(new Callable(cztmVar) { // from class: cztj
            private final cztm a;

            {
                this.a = cztmVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    r11 = this;
                    cztm r0 = r11.a
                    r1 = 0
                    android.content.Context r0 = r0.a     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
                    android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
                    r2 = 2131886773(0x7f1202b5, float:1.9408134E38)
                    java.io.InputStream r0 = r0.openRawResource(r2)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
                    dtgn r2 = defpackage.dtgn.b     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L9e
                    r3 = 7
                    java.lang.Object r2 = r2.cu(r3)     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L9e
                    dssr r2 = (defpackage.dssr) r2     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L9e
                    java.lang.Object r2 = r2.h(r0)     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L9e
                    dtgn r2 = (defpackage.dtgn) r2     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L9e
                    goto L26
                L20:
                    r0 = move-exception
                    goto La2
                L23:
                    r0 = r1
                L24:
                    dtgn r2 = defpackage.dtgn.b     // Catch: java.lang.Throwable -> L9e
                L26:
                    defpackage.ddam.a(r0)
                    dssd<java.lang.String, java.lang.String> r0 = r2.a
                    java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
                    cztl r2 = new cztl
                    int r3 = r0.size()
                    r2.<init>(r3)
                    java.util.Set r0 = r0.entrySet()
                    java.util.Iterator r0 = r0.iterator()
                L40:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L9d
                    java.lang.Object r3 = r0.next()
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.Object r4 = r3.getKey()
                    java.lang.String r4 = (java.lang.String) r4
                    java.lang.Object r5 = r3.getValue()
                    java.lang.String r5 = (java.lang.String) r5
                    boolean r5 = r5.isEmpty()
                    if (r5 == 0) goto L60
                    r3 = r4
                    goto L66
                L60:
                    java.lang.Object r3 = r3.getValue()
                    java.lang.String r3 = (java.lang.String) r3
                L66:
                    char[] r4 = r4.toCharArray()
                    int r5 = r4.length
                    r6 = 0
                    r7 = r1
                L6d:
                    if (r6 >= r5) goto L9a
                    char r8 = r4[r6]
                    if (r7 != 0) goto L75
                    r7 = r2
                    goto L82
                L75:
                    cztl r9 = r7.a
                    if (r9 != 0) goto L80
                    cztl r9 = new cztl
                    r9.<init>()
                    r7.a = r9
                L80:
                    cztl r7 = r7.a
                L82:
                    java.lang.Character r8 = java.lang.Character.valueOf(r8)
                    java.lang.Object r9 = r7.get(r8)
                    cztk r9 = (defpackage.cztk) r9
                    if (r9 != 0) goto L96
                    cztk r9 = new cztk
                    r9.<init>()
                    r7.put(r8, r9)
                L96:
                    r7 = r9
                    int r6 = r6 + 1
                    goto L6d
                L9a:
                    r7.b = r3
                    goto L40
                L9d:
                    return r2
                L9e:
                    r1 = move-exception
                    r10 = r1
                    r1 = r0
                    r0 = r10
                La2:
                    defpackage.ddam.a(r1)
                    goto La7
                La6:
                    throw r0
                La7:
                    goto La6
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cztj.call():java.lang.Object");
            }
        });
        c.Pk(new Runnable(cztmVar, c) { // from class: czti
            private final cztm a;
            private final dehn b;

            {
                this.a = cztmVar;
                this.b = c;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.a.c.set((cztl) deha.r(this.b));
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
        }, dege.a);
        cztmVar.d = true;
    }
}

package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dall  reason: default package */
/* loaded from: classes5.dex */
final class dall implements dali {
    public final dalh a;
    private final damc b;
    private final dalc c;
    private final damf d;
    private final Handler e = new Handler(Looper.getMainLooper());

    public dall(damc damcVar, dalh dalhVar, dalc dalcVar, damf damfVar) {
        this.b = damcVar;
        this.a = dalhVar;
        this.c = dalcVar;
        this.d = damfVar;
    }

    public static List<String> f(List<Locale> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Locale locale : list) {
            arrayList.add(locale.toLanguageTag());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r1.containsAll(r3) != false) goto L17;
     */
    @Override // defpackage.dali
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.danb<java.lang.Integer> a(defpackage.dalt r9) {
        /*
            r8 = this;
            java.util.List<java.util.Locale> r0 = r9.b
            r0.isEmpty()
            java.util.List<java.util.Locale> r0 = r9.b
            dalc r1 = r8.c
            java.util.Set r1 = r1.b()
            r2 = 0
            if (r1 != 0) goto L11
            goto L34
        L11:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L2e
            java.lang.Object r4 = r0.next()
            java.util.Locale r4 = (java.util.Locale) r4
            java.lang.String r4 = r4.getLanguage()
            r3.add(r4)
            goto L1a
        L2e:
            boolean r0 = r1.containsAll(r3)
            if (r0 == 0) goto L64
        L34:
            java.util.List<java.lang.String> r0 = r9.a
            dalc r1 = r8.c
            java.util.Set r1 = r1.a()
            boolean r0 = r1.containsAll(r0)
            if (r0 == 0) goto L64
            java.util.List<java.lang.String> r0 = r9.a
            damf r1 = r8.d
            java.util.Set r1 = r1.a()
            boolean r0 = java.util.Collections.disjoint(r0, r1)
            if (r0 != 0) goto L51
            goto L64
        L51:
            android.os.Handler r0 = r8.e
            dalk r1 = new dalk
            r1.<init>(r8, r9)
            r0.post(r1)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            danb r9 = defpackage.danj.a(r9)
            return r9
        L64:
            damc r1 = r8.b
            java.util.List<java.lang.String> r3 = r9.a
            java.util.List<java.util.Locale> r9 = r9.b
            java.util.List r4 = f(r9)
            dair<damj> r9 = r1.c
            if (r9 != 0) goto L77
            danb r9 = defpackage.damc.c()
            goto L9a
        L77:
            daii r9 = defpackage.damc.a
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r3
            r2 = 1
            r0[r2] = r4
            java.lang.String r2 = "startInstall(%s,%s)"
            r9.c(r2, r0)
            dane r9 = new dane
            r9.<init>()
            dair<damj> r6 = r1.c
            dalv r7 = new dalv
            r0 = r7
            r2 = r9
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
            dani<ResultT> r9 = r9.a
        L9a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dall.a(dalt):danb");
    }

    @Override // defpackage.dali
    public final danb<Void> b(List<Locale> list) {
        damc damcVar = this.b;
        List<String> f = f(list);
        if (damcVar.c == null) {
            return damc.c();
        }
        damc.a.c("deferredLanguageInstall(%s)", f);
        dane daneVar = new dane();
        damcVar.c.a(new dalw(damcVar, daneVar, f, daneVar));
        return daneVar.a;
    }

    @Override // defpackage.dali
    public final danb<Void> c(List<Locale> list) {
        damc damcVar = this.b;
        List<String> f = f(list);
        if (damcVar.c == null) {
            return damc.c();
        }
        damc.a.c("deferredLanguageUninstall(%s)", f);
        dane daneVar = new dane();
        damcVar.c.a(new dalx(damcVar, daneVar, f, daneVar));
        return daneVar.a;
    }

    @Override // defpackage.dali
    public final Set<String> d() {
        Set<String> b = this.c.b();
        return b == null ? Collections.emptySet() : b;
    }

    @Override // defpackage.dali
    public final synchronized void e(btbl btblVar) {
        this.a.c(btblVar);
    }
}

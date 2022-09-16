package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: altq  reason: default package */
/* loaded from: classes.dex */
public final class altq implements alto {
    public final altn a;
    private final alty b;
    private final altm c;
    private final alua d;
    private final Handler e = new Handler(Looper.getMainLooper());

    public altq(alty altyVar, altn altnVar, altm altmVar, alua aluaVar) {
        this.b = altyVar;
        this.a = altnVar;
        this.c = altmVar;
        this.d = aluaVar;
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
        if (r1.containsAll(r3) != false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    @Override // defpackage.alto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.alvd a(defpackage.altv r9) {
        /*
            r8 = this;
            java.util.List r0 = r9.b
            r0.isEmpty()
            java.util.List r0 = r9.b
            altm r1 = r8.c
            altf r2 = r1.a()
            if (r2 != 0) goto L11
            r1 = 0
            goto L55
        L11:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Set r4 = r1.c()
            java.lang.String r5 = ""
            r4.add(r5)
            java.util.Set r1 = r1.b()
            r1.add(r5)
            java.util.Map r1 = r2.a(r1)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L32:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r5 = r2.getValue()
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r4.containsAll(r5)
            if (r5 == 0) goto L32
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r3.add(r2)
            goto L32
        L54:
            r1 = r3
        L55:
            r2 = 0
            if (r1 != 0) goto L59
            goto L7c
        L59:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L62:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L76
            java.lang.Object r4 = r0.next()
            java.util.Locale r4 = (java.util.Locale) r4
            java.lang.String r4 = r4.getLanguage()
            r3.add(r4)
            goto L62
        L76:
            boolean r0 = r1.containsAll(r3)
            if (r0 == 0) goto Laa
        L7c:
            java.util.List r0 = r9.a
            java.util.Set r1 = r8.b()
            boolean r0 = r1.containsAll(r0)
            if (r0 == 0) goto Laa
            java.util.List r0 = r9.a
            alua r1 = r8.d
            java.util.Set r1 = r1.a()
            boolean r0 = java.util.Collections.disjoint(r0, r1)
            if (r0 != 0) goto L97
            goto Laa
        L97:
            android.os.Handler r0 = r8.e
            altp r1 = new altp
            r1.<init>(r8, r9)
            r0.post(r1)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            alvd r9 = defpackage.anqx.j(r9)
            return r9
        Laa:
            alty r1 = r8.b
            java.util.List r3 = r9.a
            java.util.List r9 = r9.b
            java.util.List r4 = c(r9)
            alsy r9 = r1.c
            if (r9 != 0) goto Ld4
            alrz r9 = defpackage.alty.a
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = -14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r0[r2] = r3
            java.lang.String r2 = "onError(%d)"
            r9.a(r2, r0)
            altl r9 = new altl
            r9.<init>(r1)
            alvd r9 = defpackage.anqx.i(r9)
            goto Le8
        Ld4:
            alvg r9 = new alvg
            r9.<init>()
            alsy r6 = r1.c
            altw r7 = new altw
            r0 = r7
            r2 = r9
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.b(r7, r9)
            alvd r9 = r9.a
        Le8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.altq.a(altv):alvd");
    }

    @Override // defpackage.alto
    public final Set b() {
        return this.c.b();
    }
}

package defpackage;

import android.os.Handler;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adlz  reason: default package */
/* loaded from: classes.dex */
public final class adlz {
    public static final String a = zep.a("MDX.promotion");
    public final admi b;
    public final Set d;
    public final Set e;
    public final adeo f;
    public final adoa g;
    public final aypg h;
    public adlt j;
    public adik l;
    public final Handler m;
    public Runnable n;
    public final Object k = new Object();
    public final Comparator o = new adly(this);
    public final Set i = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Map c = new HashMap();

    public adlz(Handler handler, admi admiVar, Set set, Set set2, Set set3, adeo adeoVar, adoa adoaVar, ayoi ayoiVar) {
        this.m = handler;
        this.b = admiVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            adls adlsVar = (adls) it.next();
            this.c.put(adlsVar.a, adlsVar);
        }
        aqxo.p(set.size() == this.c.size());
        this.d = set2;
        this.e = set3;
        HashSet hashSet = new HashSet();
        Iterator it2 = set3.iterator();
        while (it2.hasNext()) {
            hashSet.add(((adlt) it2.next()).b());
        }
        aqxo.p(hashSet.containsAll(this.c.keySet()));
        this.f = adeoVar;
        adoaVar.getClass();
        this.g = adoaVar;
        this.h = ayoiVar.as(new ayqb() { // from class: adlv
            /* JADX WARN: Code restructure failed: missing block: B:148:0x027f, code lost:
                if (((r4.c.c() - r6) / 1000) <= r8.c) goto L117;
             */
            @Override // defpackage.ayqb
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r17) {
                /*
                    Method dump skipped, instructions count: 955
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.adlv.a(java.lang.Object):void");
            }
        });
    }

    public final void a() {
        Runnable runnable = this.n;
        if (runnable != null) {
            this.m.removeCallbacks(runnable);
            this.n = null;
        }
    }

    public final void b(kbe kbeVar) {
        this.i.add(kbeVar);
    }
}

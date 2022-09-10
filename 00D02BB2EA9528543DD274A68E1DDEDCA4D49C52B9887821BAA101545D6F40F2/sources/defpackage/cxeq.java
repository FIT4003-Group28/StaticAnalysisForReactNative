package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: cxeq  reason: default package */
/* loaded from: classes5.dex */
public final class cxeq {
    public static final AtomicReference<cxei> a = new AtomicReference<>();
    private static int b = 10;
    private static int c;

    public static void a(cxdy cxdyVar) {
        if (cxdyVar == null || cxdyVar.equals(cxdy.a)) {
            return;
        }
        if (cxdyVar.d < 0) {
            cxdyVar.d = SystemClock.elapsedRealtime();
        }
        cxei cxeiVar = a.get();
        if (cxeiVar == null || cxdyVar != cxeiVar.a().poll() || cxdyVar.c() < b) {
            return;
        }
        if (cxeiVar.b() < c) {
            cxdy peek = cxeiVar.a().peek();
            if (peek == null) {
                return;
            }
            if (peek.f == Collections.EMPTY_LIST) {
                peek.f = new ArrayList();
            }
            if (peek.f == null) {
                return;
            }
            peek.f.add(cxdyVar);
            return;
        }
        cxeiVar.c();
        b();
    }

    public static void b() {
        a.set(null);
    }

    public static List<eaam> c(cxei cxeiVar) {
        czhz.c();
        if (cxeiVar.c() != 0) {
            Comparator comparator = cxeg.a;
            synchronized (cxeiVar.d) {
                Collections.sort(cxeiVar.d, comparator);
                cxeiVar.b.a(cxeiVar.d);
            }
            ArrayList arrayList = new ArrayList(cxeiVar.c.keySet());
            Collections.sort(arrayList, comparator);
            cxeiVar.b.a(arrayList);
            cxdz cxdzVar = new cxdz(cxeiVar.b);
            ArrayList<eaam> arrayList2 = new ArrayList<>();
            cxdzVar.a(cxdzVar.a, 0L, arrayList2);
            if (arrayList2.size() != 1) {
                return Collections.unmodifiableList(arrayList2);
            }
            return null;
        }
        return null;
    }

    public static boolean d(String str) {
        dbsk.s(str);
        AtomicReference<cxei> atomicReference = a;
        if (atomicReference.get() != null || !atomicReference.compareAndSet(null, new cxei(str))) {
            return false;
        }
        b = 5;
        c = 1000;
        return true;
    }

    public static cxei e(String str) {
        dbsk.l(!TextUtils.isEmpty(str));
        cxei andSet = a.getAndSet(null);
        if (andSet != null) {
            andSet.b.b = str;
        }
        return andSet;
    }
}

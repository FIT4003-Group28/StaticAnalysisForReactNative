package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: alao  reason: default package */
/* loaded from: classes.dex */
public final class alao {
    private static final akqs a;

    static {
        akqr a2 = akqs.a();
        a2.d(akqq.c(0, 0));
        a = a2.b();
    }

    @dzsi
    public static akqs a(akpm akpmVar) {
        amyn.b.a();
        return k(akpmVar);
    }

    @dzsi
    public static akqs b(akpm akpmVar) {
        amyn.b.a();
        if (!akpmVar.i()) {
            return null;
        }
        return k(akpmVar);
    }

    public static void c(akpm akpmVar, akqq akqqVar, float f) {
        akpmVar.p(akyt.i(akqqVar, f));
    }

    public static void d(akpm akpmVar, @dzsi alad aladVar) {
        if (aladVar == null) {
            return;
        }
        c(akpmVar, aladVar.i, aladVar.k);
    }

    public static void e(akpm akpmVar, akzh akzhVar, akqq akqqVar, @dzsi Rect rect, Rect rect2, Point point, float f, int i, @dzsi akzt akztVar) {
        if (f(akpmVar, akzhVar, akqqVar, rect, rect2, f, i, akztVar) || rect == null) {
            return;
        }
        akyc j = akyt.j(akqqVar, f, new Rect(point.x - (rect.width() / 2), point.y - (rect.height() / 2), point.x + (rect.width() / 2), point.y + (rect.height() / 2)));
        j.b = i;
        akpmVar.q(j, akztVar);
    }

    public static boolean f(akpm akpmVar, akzh akzhVar, akqq akqqVar, @dzsi Rect rect, Rect rect2, float f, int i, @dzsi akzt akztVar) {
        akzh h = h(akpmVar, akzhVar);
        if (rect == null || rect.width() > rect2.width() || rect.height() > rect2.height()) {
            akyc j = akyt.j(akqqVar, f, rect2);
            j.b = i;
            akpmVar.q(j, akztVar);
            return true;
        }
        int[] n = akyx.n(h, akqg.a(akqqVar));
        if (n == null) {
            akyc j2 = akyt.j(akqqVar, f, rect2);
            j2.b = i;
            akpmVar.q(j2, akztVar);
            return true;
        }
        Rect rect3 = new Rect(rect);
        rect3.offset(n[0], n[1]);
        if (rect2.contains(rect3)) {
            if (!akpmVar.n().equals(h.p())) {
                akyc e = akyt.e(h.p());
                e.b = i;
                akpmVar.q(e, akztVar);
            }
            return true;
        }
        return g(akpmVar, h, rect3, rect2, i, akztVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean g(defpackage.akpm r4, defpackage.akzh r5, android.graphics.Rect r6, android.graphics.Rect r7, int r8, @defpackage.dzsi defpackage.akzt r9) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r5.y()
            int r2 = r5.z()
            r3 = 0
            r0.<init>(r3, r3, r1, r2)
            boolean r0 = android.graphics.Rect.intersects(r6, r0)
            if (r0 == 0) goto L5b
            int r0 = r6.left
            int r1 = r7.left
            if (r0 >= r1) goto L20
            int r0 = r7.left
            int r1 = r6.left
        L1e:
            int r0 = r0 - r1
            goto L2c
        L20:
            int r0 = r6.right
            int r1 = r7.right
            if (r0 <= r1) goto L2b
            int r0 = r7.right
            int r1 = r6.right
            goto L1e
        L2b:
            r0 = 0
        L2c:
            int r1 = r6.top
            int r2 = r7.top
            if (r1 >= r2) goto L39
            int r7 = r7.top
            int r6 = r6.top
        L36:
            int r3 = r7 - r6
            goto L44
        L39:
            int r1 = r6.bottom
            int r2 = r7.bottom
            if (r1 <= r2) goto L44
            int r7 = r7.bottom
            int r6 = r6.bottom
            goto L36
        L44:
            alad r6 = r5.p()
            int r7 = -r0
            float r7 = (float) r7
            int r0 = -r3
            float r0 = (float) r0
            alad r5 = defpackage.akyx.g(r5, r6, r7, r0)
            akyc r5 = defpackage.akyt.e(r5)
            r5.b = r8
            r4.q(r5, r9)
            r4 = 1
            return r4
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alao.g(akpm, akzh, android.graphics.Rect, android.graphics.Rect, int, akzt):boolean");
    }

    public static akzh h(akpm akpmVar, akzh akzhVar) {
        alaa b = alad.b(akzhVar.p());
        if (akpmVar.o(b)) {
            akzh b2 = akzhVar.b();
            b2.o(b.a());
            return b2;
        }
        return akzhVar;
    }

    public static boolean i(akzh akzhVar, akqq akqqVar, Rect rect, Rect rect2) {
        int[] n = akyx.n(akzhVar, akqg.a(akqqVar));
        if (n == null) {
            return false;
        }
        Rect rect3 = new Rect(rect);
        rect3.offset(n[0], n[1]);
        return rect2.contains(rect3);
    }

    public static boolean j(akpm akpmVar, akzh akzhVar, @dzsi Rect rect, Rect rect2, dhjx dhjxVar, akqq akqqVar, int i) {
        akyc e = akyt.e(alad.c(akyx.v(dhjxVar, akzhVar.B(), akzhVar.z())));
        e.b = i;
        akpmVar.p(e);
        akzh h = h(akpmVar, akzhVar);
        int[] n = akyx.n(h, akqg.a(akqqVar));
        if (n != null) {
            Rect rect3 = new Rect(rect);
            rect3.offset(n[0], n[1]);
            if (!rect2.contains(rect3)) {
                return g(akpmVar, h, rect3, rect2, i, null);
            }
        }
        return true;
    }

    @dzsi
    private static akqs k(akpm akpmVar) {
        alrh ak = akpmVar.ak();
        if (ak == null) {
            return null;
        }
        akqs akqsVar = ak.c().e;
        if (!a.equals(akqsVar)) {
            return akqsVar;
        }
        return null;
    }
}

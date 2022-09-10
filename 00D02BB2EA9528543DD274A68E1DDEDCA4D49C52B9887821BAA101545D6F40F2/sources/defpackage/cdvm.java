package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cdvm  reason: default package */
/* loaded from: classes4.dex */
public final class cdvm extends aai {
    private final int h(abs absVar, dztx<? extends View> dztxVar) {
        int aJ = absVar.aJ() - 1;
        int i = dztxVar.a;
        if (i <= 0 || aJ <= i) {
            return Integer.MIN_VALUE;
        }
        int[] a = a(absVar, (View) dztxVar.b);
        if (a != null) {
            return a[0];
        }
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.aai, defpackage.adz
    public final View c(abs absVar) {
        Object next;
        if (absVar != null) {
            if (absVar.E() && !absVar.D()) {
                absVar = null;
            }
            if (absVar == null) {
                return null;
            }
            dzwt dzwtVar = new dzwt(new dzwu(new dzww(new cduv(absVar)), new cdvl(absVar)));
            if (!dzwtVar.hasNext()) {
                next = null;
            } else {
                next = dzwtVar.next();
                if (dzwtVar.hasNext()) {
                    int h = h(absVar, (dztx) next);
                    while (true) {
                        Object next2 = dzwtVar.next();
                        int h2 = h(absVar, (dztx) next2);
                        int i = h > h2 ? h2 : h;
                        if (h > h2) {
                            next = next2;
                        }
                        if (!dzwtVar.hasNext()) {
                            break;
                        }
                        h = i;
                    }
                }
            }
            dztx dztxVar = (dztx) next;
            if (dztxVar == null) {
                return null;
            }
            return (View) dztxVar.b;
        }
        return null;
    }
}

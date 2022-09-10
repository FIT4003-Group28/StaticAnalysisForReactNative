package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
@Deprecated
/* renamed from: iub  reason: default package */
/* loaded from: classes.dex */
public final class iub extends cqfb {
    public static final cqis<Number> b;
    private static final View.OnLayoutChangeListener f;
    public final cjqy a;
    public final Handler c = new iua(Looper.getMainLooper());
    private final itg e;

    static {
        cqjh.a = false;
        f = new itx();
        b = cqis.a();
    }

    public iub(cjqy cjqyVar, itg itgVar) {
        this.a = cjqyVar;
        dbsk.s(itgVar);
        this.e = itgVar;
    }

    private static boolean c(Object obj, View view) {
        if (!(view instanceof jgf) || !(obj instanceof Integer)) {
            if ((view instanceof RecyclerView) && (obj instanceof Integer)) {
                abs absVar = ((RecyclerView) view).l;
                if (absVar instanceof jfu) {
                    jfu jfuVar = (jfu) absVar;
                    int intValue = ((Integer) obj).intValue();
                    if (jfuVar.a != intValue) {
                        jfuVar.c = 0;
                        jfuVar.a = intValue;
                        jfuVar.b = aax.q(jfuVar, intValue);
                        jfuVar.as();
                    }
                    return true;
                }
            }
            return false;
        }
        ((jgf) view).setOrientation((Integer) obj);
        return true;
    }

    private final boolean d(Object obj, View view) {
        if ((obj instanceof cjtd) || obj == null) {
            cjqg.h(view, obj == cjtd.b ? null : (cjtd) obj);
            this.e.a(view);
            return true;
        }
        return false;
    }

    private final void e(Object obj, View view, cqjz<?> cqjzVar) {
        cqkc a = cqkc.a(view);
        if (obj != null) {
            a.c(itt.a, new itz(this, obj, cqjzVar));
        } else {
            a.c(itt.a, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
        if (r12 == null) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cqfb, defpackage.cqkv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.cqku r12, java.lang.Object r13, defpackage.cqjz<?> r14) {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iub.a(cqku, java.lang.Object, cqjz):boolean");
    }

    @Override // defpackage.cqfb, defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof cqfe) {
            cqqi cqqiVar = cqqi.AUTO_SIZE_CONFIG;
            cqfe cqfeVar = cqfe.ACCESSIBILITY_DELEGATE;
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            if (((cqfe) cqkuVar).ordinal() != 147) {
                return false;
            }
            e(null, view, cqjzVar);
            return true;
        } else if (!(cqkuVar instanceof iug)) {
            return false;
        } else {
            cqqi cqqiVar2 = cqqi.AUTO_SIZE_CONFIG;
            cqfe cqfeVar2 = cqfe.ACCESSIBILITY_DELEGATE;
            iug iugVar2 = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            int ordinal = ((iug) cqkuVar).ordinal();
            if (ordinal != 103 && ordinal != 104) {
                return false;
            }
            this.e.b(view);
            cjqg.h(view, null);
            return true;
        }
    }
}

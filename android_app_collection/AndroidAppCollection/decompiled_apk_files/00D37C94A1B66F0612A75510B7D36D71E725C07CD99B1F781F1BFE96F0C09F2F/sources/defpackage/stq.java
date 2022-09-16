package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
/* compiled from: PG */
/* renamed from: stq  reason: default package */
/* loaded from: classes4.dex */
final class stq {
    public static final cdk a = new cdk(-1.0f, 1.0f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static LottieAnimationView a(Context context) {
        return new LottieAnimationView(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(cyv cyvVar, axmm axmmVar, dcz dczVar) {
        if (axmmVar.aI() == null) {
            return;
        }
        if (axmmVar.aI().l() != null) {
            dczVar.a = bxe.e(axmmVar.aI().l(), axmmVar.aI().l());
        } else if (axmmVar.aI().m() == null) {
        } else {
            bxe.l(cyvVar.a(), axmmVar.aI().m());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(dad dadVar, dad dadVar2) {
        boolean equals;
        boolean c = tfy.c((aodt) dadVar.a, (aodt) dadVar.b);
        Object obj = dadVar2.a;
        Object obj2 = dadVar2.b;
        if (obj == null && obj2 == null) {
            equals = true;
        } else {
            equals = (obj == null || obj2 == null) ? false : obj.equals(obj2);
        }
        return !c || !equals;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(defpackage.cyv r7, final com.airbnb.lottie.LottieAnimationView r8, defpackage.bxt r9, defpackage.tcu r10, defpackage.tda r11, defpackage.suc r12, defpackage.axmm r13, defpackage.tfw r14, defpackage.tfw r15) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stq.d(cyv, com.airbnb.lottie.LottieAnimationView, bxt, tcu, tda, suc, axmm, tfw, tfw):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(LottieAnimationView lottieAnimationView, suc sucVar) {
        lottieAnimationView.clearAnimation();
        lottieAnimationView.k(0.0f);
        lottieAnimationView.d();
        lottieAnimationView.d.b.removeAllListeners();
        if (sucVar != null) {
            sucVar.c(lottieAnimationView);
        }
    }
}

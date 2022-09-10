package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acy  reason: default package */
/* loaded from: classes.dex */
public final class acy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(aci aciVar, aax aaxVar, View view, View view2, abs absVar, boolean z, boolean z2) {
        int max;
        if (absVar.aJ() == 0 || aciVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(abs.bm(view), abs.bm(view2));
        int max2 = Math.max(abs.bm(view), abs.bm(view2));
        if (z2) {
            max = Math.max(0, (aciVar.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        return !z ? max : Math.round((max * (Math.abs(aaxVar.g(view2) - aaxVar.h(view)) / (Math.abs(abs.bm(view) - abs.bm(view2)) + 1))) + (aaxVar.d() - aaxVar.h(view)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(aci aciVar, aax aaxVar, View view, View view2, abs absVar, boolean z) {
        if (absVar.aJ() == 0 || aciVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abs.bm(view) - abs.bm(view2)) + 1;
        }
        return Math.min(aaxVar.k(), aaxVar.g(view2) - aaxVar.h(view));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(aci aciVar, aax aaxVar, View view, View view2, abs absVar, boolean z) {
        if (absVar.aJ() == 0 || aciVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return aciVar.b();
        }
        return (int) (((aaxVar.g(view2) - aaxVar.h(view)) / (Math.abs(abs.bm(view) - abs.bm(view2)) + 1)) * aciVar.b());
    }
}

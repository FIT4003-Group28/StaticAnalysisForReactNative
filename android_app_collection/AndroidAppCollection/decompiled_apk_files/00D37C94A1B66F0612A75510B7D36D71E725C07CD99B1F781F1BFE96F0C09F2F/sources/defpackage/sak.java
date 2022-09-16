package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;
/* compiled from: PG */
/* renamed from: sak  reason: default package */
/* loaded from: classes4.dex */
final class sak extends AccessibilityNodeProvider {
    final /* synthetic */ saq a;

    public sak(saq saqVar) {
        this.a = saqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r8 != 2) goto L7;
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r17) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sak.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        if (i == -1) {
            return this.a.b.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 64) {
            saq saqVar = this.a;
            if (saqVar.k == i) {
                return false;
            }
            if (i != -1) {
                saqVar.b.removeCallbacks(saqVar.a);
            }
            saq saqVar2 = this.a;
            saqVar2.k = i;
            saqVar2.a(32768, i);
            return true;
        } else if (i2 != 128) {
            return false;
        } else {
            saq saqVar3 = this.a;
            if (saqVar3.k != i) {
                return false;
            }
            if (i == -3 || i == -2) {
                saqVar3.b.postDelayed(saqVar3.a, 0L);
            }
            saq saqVar4 = this.a;
            saqVar4.k = -1;
            saqVar4.a(65536, i);
            return true;
        }
    }
}

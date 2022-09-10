package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: cpol  reason: default package */
/* loaded from: classes5.dex */
final class cpol extends AccessibilityNodeProvider {
    final /* synthetic */ cpor a;

    public cpol(cpor cporVar) {
        this.a = cporVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r5 != 2) goto L8;
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r8) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpol.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        if (i == -1) {
            return this.a.b.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 64) {
            cpor cporVar = this.a;
            if (cporVar.l == i) {
                return false;
            }
            if (i != -1) {
                cporVar.b.removeCallbacks(cporVar.a);
            }
            cpor cporVar2 = this.a;
            cporVar2.l = i;
            cporVar2.c(32768, i);
            return true;
        } else if (i2 != 128) {
            return false;
        } else {
            cpor cporVar3 = this.a;
            if (cporVar3.l != i) {
                return false;
            }
            if (i == -3 || i == -2) {
                cporVar3.b.postDelayed(cporVar3.a, 0L);
            }
            cpor cporVar4 = this.a;
            cporVar4.l = -1;
            cporVar4.c(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, i);
            return true;
        }
    }
}

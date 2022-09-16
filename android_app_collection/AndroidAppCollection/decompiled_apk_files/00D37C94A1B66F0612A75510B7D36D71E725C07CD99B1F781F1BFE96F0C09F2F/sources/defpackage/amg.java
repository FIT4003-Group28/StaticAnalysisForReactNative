package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amg  reason: default package */
/* loaded from: classes.dex */
public final class amg extends ml {
    final /* synthetic */ amh b;

    public amg(amh amhVar) {
        this.b = amhVar;
    }

    @Override // defpackage.ml
    public final mh a(int i) {
        return mh.c(AccessibilityNodeInfo.obtain(this.b.l(i).b));
    }

    @Override // defpackage.ml
    public final mh b(int i) {
        int i2 = i == 2 ? this.b.d : this.b.e;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    @Override // defpackage.ml
    public final boolean c(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        amh amhVar = this.b;
        if (i != -1) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return amhVar.s(i);
                }
                if (i2 != 64) {
                    if (i2 == 128) {
                        return amhVar.r(i);
                    }
                    return amhVar.u(i, i2);
                } else if (amhVar.b.isEnabled() && amhVar.b.isTouchExplorationEnabled() && (i4 = amhVar.d) != i) {
                    if (i4 != Integer.MIN_VALUE) {
                        amhVar.r(i4);
                    }
                    amhVar.d = i;
                    amhVar.c.invalidate();
                    amhVar.v(i, 32768);
                    return true;
                }
            } else if ((amhVar.c.isFocused() || amhVar.c.requestFocus()) && (i3 = amhVar.e) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    amhVar.s(i3);
                }
                if (i != Integer.MIN_VALUE) {
                    amhVar.e = i;
                    amhVar.v(i, 8);
                    return true;
                }
            }
            return false;
        }
        return lj.aq(amhVar.c, i2, bundle);
    }
}

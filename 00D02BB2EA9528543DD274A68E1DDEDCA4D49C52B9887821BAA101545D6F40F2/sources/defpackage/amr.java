package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: PG */
/* renamed from: amr  reason: default package */
/* loaded from: classes2.dex */
final class amr extends pg {
    final /* synthetic */ ams b;

    public amr(ams amsVar) {
        this.b = amsVar;
    }

    @Override // defpackage.pg
    public final pc a(int i) {
        return pc.a(AccessibilityNodeInfo.obtain(this.b.q(i).a));
    }

    @Override // defpackage.pg
    public final pc c(int i) {
        int i2 = i == 2 ? this.b.d : this.b.e;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    @Override // defpackage.pg
    public final boolean b(int i, int i2, Bundle bundle) {
        int i3;
        ams amsVar = this.b;
        if (i != -1) {
            if (i2 == 1) {
                return amsVar.s(i);
            }
            if (i2 == 2) {
                return amsVar.t(i);
            }
            if (i2 != 64) {
                if (i2 == 128) {
                    return amsVar.r(i);
                }
                return amsVar.z(i, i2);
            } else if (!amsVar.b.isEnabled() || !amsVar.b.isTouchExplorationEnabled() || (i3 = amsVar.d) == i) {
                return false;
            } else {
                if (i3 != Integer.MIN_VALUE) {
                    amsVar.r(i3);
                }
                amsVar.d = i;
                amsVar.c.invalidate();
                amsVar.A(i, 32768);
                return true;
            }
        }
        return od.n(amsVar.c, i2, bundle);
    }
}

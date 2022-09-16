package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cutt  reason: default package */
/* loaded from: classes5.dex */
public final class cutt extends abs {
    private final int a;
    private final boolean b;

    public cutt(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.abs
    public final boolean E() {
        return false;
    }

    @Override // defpackage.abs
    public final boolean RY() {
        return true;
    }

    @Override // defpackage.abs
    public final void d(aca acaVar, aci aciVar) {
        aQ(acaVar);
        int i = this.D;
        int i2 = 0;
        for (int i3 = 0; i3 < aN(); i3++) {
            View d = acaVar.d(i3);
            aB(d);
            bt(d);
            int bk = bk(d);
            int bj = bj(d);
            int i4 = this.a;
            int i5 = (i - bk) - i4;
            if (this.b) {
                br(d, i4, i2, bk + i4, i2 + bj);
            } else {
                br(d, i5, i2, bk + i5, i2 + bj);
            }
            i2 += bj;
        }
    }

    @Override // defpackage.abs
    public final abt f() {
        return new abt(-2, -2);
    }
}

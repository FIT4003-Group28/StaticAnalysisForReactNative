package defpackage;

import android.support.v7.widget.LinearLayoutManager;
/* compiled from: PG */
/* renamed from: djm  reason: default package */
/* loaded from: classes3.dex */
final class djm extends LinearLayoutManager {
    public djm(int i) {
        super(i);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.xw
    public final xx f() {
        if (this.i == 1) {
            return new xx(-1, -2);
        }
        return new xx(-2, -1);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.xw
    public final boolean qh() {
        if (this.i == 0) {
            return false;
        }
        return super.qh();
    }
}

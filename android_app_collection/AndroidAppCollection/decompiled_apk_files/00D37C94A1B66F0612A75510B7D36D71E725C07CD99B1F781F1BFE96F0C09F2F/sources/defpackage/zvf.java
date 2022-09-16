package defpackage;

import android.support.v7.widget.GridLayoutManager;
/* compiled from: PG */
/* renamed from: zvf  reason: default package */
/* loaded from: classes4.dex */
final class zvf extends wj {
    final /* synthetic */ GridLayoutManager c;
    final /* synthetic */ zvh d;

    public zvf(zvh zvhVar, GridLayoutManager gridLayoutManager) {
        this.d = zvhVar;
        this.c = gridLayoutManager;
    }

    @Override // defpackage.wj
    public final int b(int i) {
        if (this.d.e.C(i)) {
            return this.c.b;
        }
        return 1;
    }
}

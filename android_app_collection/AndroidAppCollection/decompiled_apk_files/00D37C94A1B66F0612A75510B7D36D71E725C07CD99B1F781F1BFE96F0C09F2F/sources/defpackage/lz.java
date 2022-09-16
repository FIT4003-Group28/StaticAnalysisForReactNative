package defpackage;

import android.view.View;
import android.view.WindowInsets;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lz  reason: default package */
/* loaded from: classes3.dex */
public final class lz extends ly {
    static final mb c = mb.q(WindowInsets.CONSUMED);

    public lz(mb mbVar, WindowInsets windowInsets) {
        super(mbVar, windowInsets);
    }

    @Override // defpackage.lv, defpackage.ma
    public final void c(View view) {
    }

    @Override // defpackage.lv, defpackage.ma
    public final boolean g() {
        return this.a.isVisible(jb.c(8));
    }

    @Override // defpackage.lv, defpackage.ma
    public final gz i() {
        return gz.e(this.a.getInsets(jb.c(7)));
    }
}

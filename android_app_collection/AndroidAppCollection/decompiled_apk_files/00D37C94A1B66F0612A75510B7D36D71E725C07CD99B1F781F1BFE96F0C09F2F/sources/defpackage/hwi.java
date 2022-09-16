package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: hwi  reason: default package */
/* loaded from: classes3.dex */
public final class hwi extends xf {
    @Override // defpackage.xf, defpackage.xz
    public final int[] c(xw xwVar, View view) {
        if (xwVar.ae()) {
            return super.c(xwVar, view);
        }
        int[] iArr = new int[2];
        iArr[1] = 0;
        if (xwVar.ad()) {
            xd p = xd.p(xwVar);
            iArr[0] = p.d(view) - p.j();
        } else {
            iArr[0] = 0;
        }
        return iArr;
    }
}

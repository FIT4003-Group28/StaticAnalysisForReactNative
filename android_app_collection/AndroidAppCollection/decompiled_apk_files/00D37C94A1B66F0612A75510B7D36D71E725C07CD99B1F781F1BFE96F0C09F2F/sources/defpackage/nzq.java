package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: PG */
/* renamed from: nzq  reason: default package */
/* loaded from: classes3.dex */
public final class nzq extends nzt {
    public nzq(nzy nzyVar, View view) {
        super(nzyVar, view);
    }

    @Override // defpackage.nzt
    public final Rect h(nxe nxeVar) {
        Rect r = nxeVar.r();
        return new Rect(r.left, nxeVar.t().top, r.right, r.bottom);
    }
}

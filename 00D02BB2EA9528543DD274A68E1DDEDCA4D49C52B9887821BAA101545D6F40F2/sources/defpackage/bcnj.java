package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bcnj  reason: default package */
/* loaded from: classes3.dex */
final class bcnj implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cqkp i = cqkx.i(view);
        if (!(i instanceof bcnk)) {
            return;
        }
        bcnk bcnkVar = (bcnk) i;
        bwuj bwujVar = bcnkVar.a.i;
        bcnkVar.c.e(bcnkVar.k, bwujVar == null ? null : bwujVar.c(), bcnkVar.h);
    }
}

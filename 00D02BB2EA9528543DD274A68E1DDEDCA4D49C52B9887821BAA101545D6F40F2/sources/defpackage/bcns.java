package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bcns  reason: default package */
/* loaded from: classes3.dex */
final class bcns implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bcle bcleVar;
        cqkp i = cqkx.i(view);
        if (!(i instanceof bcnv)) {
            return;
        }
        bcnv bcnvVar = (bcnv) i;
        if (cknv.f(bcnvVar.k)) {
            bcnvVar.c.e(bcnvVar.k, null, bcnvVar.h);
        } else if (!cknv.c(bcnvVar.k) || (bcleVar = bcnvVar.e) == null) {
            bvoo.h("Invalid photo type on clicking gallery thumbnail.", new Object[0]);
        } else {
            bcleVar.a(view, bcnvVar.l);
        }
    }
}

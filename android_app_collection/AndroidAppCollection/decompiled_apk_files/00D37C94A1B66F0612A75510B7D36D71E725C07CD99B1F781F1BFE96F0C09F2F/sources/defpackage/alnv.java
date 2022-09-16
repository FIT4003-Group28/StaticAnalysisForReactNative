package defpackage;

import android.os.Bundle;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alnv  reason: default package */
/* loaded from: classes.dex */
public final class alnv extends jo {
    final /* synthetic */ aloe b;

    public alnv(aloe aloeVar) {
        this.b = aloeVar;
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        super.d(view, mhVar);
        mhVar.h(1048576);
        mhVar.w(true);
    }

    @Override // defpackage.jo
    public final boolean j(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            this.b.d();
            return true;
        }
        return super.j(view, i, bundle);
    }
}

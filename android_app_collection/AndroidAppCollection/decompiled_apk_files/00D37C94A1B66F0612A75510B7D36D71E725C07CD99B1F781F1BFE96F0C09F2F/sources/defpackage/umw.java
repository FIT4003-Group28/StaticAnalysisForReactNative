package defpackage;

import android.os.Bundle;
import android.view.View;
/* compiled from: PG */
/* renamed from: umw  reason: default package */
/* loaded from: classes4.dex */
final class umw extends jo {
    final /* synthetic */ umx b;

    public umw(umx umxVar) {
        this.b = umxVar;
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
            this.b.aE();
            return true;
        }
        return super.j(view, i, bundle);
    }
}

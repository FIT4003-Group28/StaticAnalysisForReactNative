package defpackage;

import android.os.Bundle;
import android.view.View;
/* compiled from: PG */
/* renamed from: aljl  reason: default package */
/* loaded from: classes.dex */
final class aljl extends jo {
    final /* synthetic */ aljo b;

    public aljl(aljo aljoVar) {
        this.b = aljoVar;
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        super.d(view, mhVar);
        if (this.b.d) {
            mhVar.h(1048576);
            mhVar.w(true);
            return;
        }
        mhVar.w(false);
    }

    @Override // defpackage.jo
    public final boolean j(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            aljo aljoVar = this.b;
            if (aljoVar.d) {
                aljoVar.cancel();
                return true;
            }
            i = 1048576;
        }
        return super.j(view, i, bundle);
    }
}

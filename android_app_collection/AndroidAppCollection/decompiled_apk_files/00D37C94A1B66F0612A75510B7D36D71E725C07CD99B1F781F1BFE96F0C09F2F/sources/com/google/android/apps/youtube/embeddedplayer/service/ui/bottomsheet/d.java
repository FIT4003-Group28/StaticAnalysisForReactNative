package com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet;

import android.os.Bundle;
import android.view.View;
/* compiled from: PG */
/* loaded from: classes2.dex */
final class d extends jo {
    final /* synthetic */ e b;

    public d(e eVar) {
        this.b = eVar;
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
            this.b.cancel();
            return true;
        }
        return super.j(view, i, bundle);
    }
}

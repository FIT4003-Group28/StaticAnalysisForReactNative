package defpackage;

import android.os.Bundle;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bkc  reason: default package */
/* loaded from: classes2.dex */
public final class bkc extends jo {
    final /* synthetic */ bkd b;

    public bkc(bkd bkdVar) {
        this.b = bkdVar;
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        this.b.e.d(view, mhVar);
        int c = this.b.d.c(view);
        xo xoVar = this.b.d.m;
        if (!(xoVar instanceof bjw)) {
            return;
        }
        ((bjw) xoVar).w(c);
    }

    @Override // defpackage.jo
    public final boolean j(View view, int i, Bundle bundle) {
        return this.b.e.j(view, i, bundle);
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: to  reason: default package */
/* loaded from: classes4.dex */
public final class to extends sr {
    final /* synthetic */ tq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to(tq tqVar, Context context, sf sfVar, View view) {
        super(context, sfVar, view, true);
        this.d = tqVar;
        this.b = 8388613;
        e(tqVar.n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.sr
    public final void c() {
        sf sfVar = this.d.c;
        if (sfVar != null) {
            sfVar.close();
        }
        this.d.k = null;
        super.c();
    }
}

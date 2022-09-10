package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqzi  reason: default package */
/* loaded from: classes4.dex */
public final class bqzi implements View.OnClickListener {
    final /* synthetic */ bqzm a;

    public bqzi(bqzm bqzmVar) {
        this.a = bqzmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bqzm bqzmVar = this.a;
        if (!bqzmVar.aD || !bqzmVar.bd) {
            return;
        }
        bqzmVar.ah.i(bqzmVar.bc);
    }
}

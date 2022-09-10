package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnez  reason: default package */
/* loaded from: classes3.dex */
public final class bnez implements View.OnClickListener {
    final /* synthetic */ apup a;
    final /* synthetic */ bwrs b;

    public bnez(apup apupVar, bwrs bwrsVar) {
        this.a = apupVar;
        this.b = bwrsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dboe dboeVar;
        apup apupVar = this.a;
        bwrs<ilo> bwrsVar = this.b;
        int i = bnfa.a;
        dboeVar = bnfa.e;
        apupVar.e(bwrsVar, dboeVar);
    }
}

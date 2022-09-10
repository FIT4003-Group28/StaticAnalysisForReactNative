package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: apck  reason: default package */
/* loaded from: classes2.dex */
public final class apck implements View.OnClickListener {
    final /* synthetic */ bwrs a;
    final /* synthetic */ apcl b;

    public apck(apcl apclVar, bwrs bwrsVar) {
        this.b = apclVar;
        this.a = bwrsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.a.c(this.a);
    }
}

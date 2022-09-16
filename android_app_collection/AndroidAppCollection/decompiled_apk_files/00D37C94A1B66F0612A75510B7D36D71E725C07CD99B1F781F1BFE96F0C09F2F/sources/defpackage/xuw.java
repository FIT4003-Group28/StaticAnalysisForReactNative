package defpackage;

import android.app.Dialog;
import android.content.Context;
/* compiled from: PG */
/* renamed from: xuw  reason: default package */
/* loaded from: classes4.dex */
final class xuw extends Dialog {
    final /* synthetic */ xuz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuw(xuz xuzVar, Context context, int i) {
        super(context, i);
        this.a = xuzVar;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.a.aK();
    }
}

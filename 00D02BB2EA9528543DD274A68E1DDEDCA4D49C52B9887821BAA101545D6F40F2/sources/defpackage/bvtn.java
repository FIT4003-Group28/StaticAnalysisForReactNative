package defpackage;

import android.app.Dialog;
import android.content.Context;
/* compiled from: PG */
/* renamed from: bvtn  reason: default package */
/* loaded from: classes4.dex */
final class bvtn extends Dialog {
    final /* synthetic */ bvtp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvtn(bvtp bvtpVar, Context context) {
        super(context, 16973840);
        this.a = bvtpVar;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (!this.a.e()) {
            super.onBackPressed();
        }
    }
}

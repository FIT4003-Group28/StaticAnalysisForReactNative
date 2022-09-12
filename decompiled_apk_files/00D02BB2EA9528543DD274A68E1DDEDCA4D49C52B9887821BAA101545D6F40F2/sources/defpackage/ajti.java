package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ajti  reason: default package */
/* loaded from: classes2.dex */
final class ajti extends czwe {
    final /* synthetic */ ajtj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajti(ajtj ajtjVar, Context context) {
        super(context);
        this.a = ajtjVar;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ajtr ajtrVar = this.a.an;
        dbsk.s(ajtrVar);
        if (ajtrVar.a().booleanValue()) {
            return;
        }
        super.onBackPressed();
    }
}

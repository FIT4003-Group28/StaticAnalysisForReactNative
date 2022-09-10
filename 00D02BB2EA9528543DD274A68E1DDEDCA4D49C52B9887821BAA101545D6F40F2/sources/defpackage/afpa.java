package defpackage;

import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: afpa  reason: default package */
/* loaded from: classes2.dex */
final class afpa implements afrl {
    final /* synthetic */ afpb a;

    public afpa(afpb afpbVar) {
        this.a = afpbVar;
    }

    @Override // defpackage.afrl
    public final void a() {
        afpb afpbVar = this.a;
        PopupWindow popupWindow = afpbVar.e;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        afpbVar.e.dismiss();
        cqkx.p(afpbVar);
    }
}

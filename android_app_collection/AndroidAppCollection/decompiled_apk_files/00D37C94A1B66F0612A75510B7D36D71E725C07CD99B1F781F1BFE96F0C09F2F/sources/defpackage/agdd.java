package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.notification.push.optoutdialog.NotificationOptOutDialogActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agdd  reason: default package */
/* loaded from: classes.dex */
public final class agdd implements abv {
    final /* synthetic */ agde a;

    public agdd(agde agdeVar) {
        this.a = agdeVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        agde agdeVar = this.a;
        if (!agdeVar.a) {
            agdeVar.a = true;
            Object lI = agdeVar.lI();
            NotificationOptOutDialogActivity notificationOptOutDialogActivity = (NotificationOptOutDialogActivity) agdeVar;
            dwq dwqVar = (dwq) lI;
            notificationOptOutDialogActivity.b = dwqVar.kP;
            notificationOptOutDialogActivity.c = ampq.j(dwqVar.a.cg());
        }
    }
}

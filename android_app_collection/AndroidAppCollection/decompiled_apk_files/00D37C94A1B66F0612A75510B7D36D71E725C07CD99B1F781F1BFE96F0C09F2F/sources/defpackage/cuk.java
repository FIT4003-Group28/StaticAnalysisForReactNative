package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cuk  reason: default package */
/* loaded from: classes3.dex */
public final class cuk implements cug {
    private final ajnx a;

    public cuk(ajnx ajnxVar) {
        this.a = ajnxVar;
    }

    @Override // defpackage.cug
    public final void a(cuf cufVar) {
        ajnx ajnxVar = this.a;
        View n = cufVar.n();
        int integer = ajnxVar.a.getResources().getInteger(17694720);
        n.setAlpha(0.0f);
        n.animate().setDuration(integer).alpha(1.0f).start();
    }
}

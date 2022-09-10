package defpackage;

import android.app.Dialog;
import android.view.View;
/* compiled from: PG */
/* renamed from: xdn  reason: default package */
/* loaded from: classes7.dex */
public final class xdn implements cqkn<zcv> {
    @dzsi
    private Dialog a;
    @dzsi
    private zcu b;

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(zcv zcvVar, View view) {
        b();
        cqkf c = cqjz.g(view).g.g().c(new xdv(), null);
        View c2 = c.c();
        zrq c3 = zrq.c(zcvVar, new xdl(this));
        this.b = c3;
        c.e(c3);
        Dialog dialog = new Dialog(view.getContext(), 16973942);
        this.a = dialog;
        dialog.requestWindowFeature(1);
        this.a.setContentView(c2);
        this.a.setOnDismissListener(new xdm(c));
        this.a.show();
    }

    public final void b() {
        Dialog dialog = this.a;
        if (dialog != null) {
            dialog.dismiss();
            this.a = null;
            this.b = null;
        }
    }
}

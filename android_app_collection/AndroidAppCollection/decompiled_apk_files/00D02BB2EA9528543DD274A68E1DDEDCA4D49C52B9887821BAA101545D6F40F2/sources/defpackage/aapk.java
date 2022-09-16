package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.graphics.drawable.ColorDrawable;
/* compiled from: PG */
/* renamed from: aapk  reason: default package */
/* loaded from: classes2.dex */
public final class aapk {
    public final gga a;
    public final dijz b;
    @dzsi
    public ProgressDialog c = null;
    public final busw d;
    private final aaph e;
    private final cqkj f;

    public aapk(dijz dijzVar, gga ggaVar, cqkj cqkjVar, aaph aaphVar, busw buswVar) {
        this.b = dijzVar;
        this.a = ggaVar;
        this.e = aaphVar;
        this.f = cqkjVar;
        this.d = buswVar;
    }

    public final void a(boolean z) {
        ProgressDialog progressDialog = this.c;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.c = null;
        cqkf c = this.f.c(new aaoo(), null);
        AlertDialog create = new AlertDialog.Builder(this.a).create();
        aaph aaphVar = this.e;
        aaph.a(create, 1);
        Activity activity = (Activity) ((dxjd) aaphVar.a).a;
        aaph.a(activity, 3);
        c.e(new aapg(create, z, activity));
        create.setView(c.c());
        create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        create.show();
    }
}

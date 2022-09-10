package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.format.DateFormat;
import android.view.View;
import android.view.Window;
import java.util.TimeZone;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ucg  reason: default package */
/* loaded from: classes7.dex */
public class ucg implements ubr, zrz {
    public final Activity a;
    public final suv b;
    public final cqkj c;
    public final cqat d;
    public final cqhu e;
    @dzsi
    public yph f;
    @dzsi
    public Dialog g;
    private final tgn h;
    private final Executor n;
    @dzsi
    private crzp<dwao> o;
    private String i = "";
    private dbsg<eapd> m = dbpy.a;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;

    public ucg(Activity activity, suv suvVar, tgn tgnVar, cqhn cqhnVar, cqat cqatVar, cqkj cqkjVar, cqhu cqhuVar, Executor executor) {
        this.a = activity;
        this.b = suvVar;
        this.h = tgnVar;
        this.d = cqatVar;
        this.c = cqkjVar;
        this.e = cqhuVar;
        this.n = executor;
    }

    @Override // defpackage.ubr
    public String a() {
        return this.i;
    }

    @Override // defpackage.ubr
    public Boolean b() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.ubr
    public Boolean c() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.ubr
    public Boolean d() {
        return Boolean.valueOf(this.l);
    }

    @Override // defpackage.ubr
    public View.OnClickListener e() {
        return new View.OnClickListener(this) { // from class: ucc
            private final ucg a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final ucg ucgVar = this.a;
                if (ucgVar.g != null) {
                    return;
                }
                yph r = yph.r(ucgVar.m(), vxb.f(ucgVar.m(), TimeZone.getDefault(), ucgVar.l(ucgVar.d)), DateFormat.is24HourFormat(ucgVar.a), vxi.b(ucgVar.m()), dqvj.DRIVE, ucgVar.d, ucgVar.c, ucgVar.e, ucgVar);
                ucgVar.f = r;
                r.y(true);
                final cqkf c = ucgVar.c.c(new ylp(), null);
                c.e(r);
                ucgVar.g = new Dialog(ucgVar.a, 16974129);
                Dialog dialog = ucgVar.g;
                dbsk.s(dialog);
                dialog.requestWindowFeature(1);
                dialog.setContentView(c.c());
                dialog.setOnCancelListener(new DialogInterface.OnCancelListener(ucgVar) { // from class: ucd
                    private final ucg a;

                    {
                        this.a = ucgVar;
                    }

                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        this.a.j();
                    }
                });
                dialog.setOnDismissListener(new DialogInterface.OnDismissListener(c) { // from class: uce
                    private final cqkf a;

                    {
                        this.a = c;
                    }

                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.a.e(null);
                    }
                });
                if (dialog.getWindow() != null) {
                    Window window = dialog.getWindow();
                    dbsk.s(window);
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                dialog.show();
                r.y(false);
            }
        };
    }

    @Override // defpackage.ubr
    public View.OnClickListener f() {
        return new View.OnClickListener(this) { // from class: ucf
            private final ucg a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.i(false);
            }
        };
    }

    public void g() {
        this.o = new crzp(this) { // from class: ucb
            private final ucg a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                this.a.i();
            }
        };
        crzm<dwao> a = this.h.a();
        crzp<dwao> crzpVar = this.o;
        dbsk.s(crzpVar);
        a.d(crzpVar, this.n);
    }

    public void h() {
        if (this.o != null) {
            crzm<dwao> a = this.h.a();
            crzp<dwao> crzpVar = this.o;
            dbsk.s(crzpVar);
            a.c(crzpVar);
            this.o = null;
        }
    }

    public final void i() {
        this.j = this.h.c();
        this.k = this.h.d();
        this.l = this.h.e();
        this.i = vmu.getTransitDateTimeOptionsMenuItemText(this.a, l(this.d), this.d, m());
        cqkx.p(this);
    }

    public void j() {
        Dialog dialog = this.g;
        if (dialog != null && dialog.isShowing()) {
            yph yphVar = this.f;
            if (yphVar != null) {
                yphVar.w();
            }
            dialog.dismiss();
        }
        this.g = null;
        this.f = null;
    }

    public void k(dbsg<eapd> dbsgVar) {
        this.m = dbsgVar;
        i();
    }

    public final long l(cqat cqatVar) {
        return this.m.a() ? this.m.b().a : cqatVar.b();
    }

    public final dwao m() {
        dwao l = this.h.a().l();
        dbsk.s(l);
        return l;
    }

    @Override // defpackage.zrz
    public void w(dwao dwaoVar) {
        tgn tgnVar = this.h;
        dosz doszVar = dwaoVar.B;
        if (doszVar == null) {
            doszVar = dosz.e;
        }
        tgnVar.b(doszVar);
        j();
    }

    @Override // defpackage.zrz
    public void x() {
        j();
    }
}

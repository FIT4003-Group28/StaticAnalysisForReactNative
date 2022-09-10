package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import java.util.List;
/* compiled from: PG */
/* renamed from: zgb  reason: default package */
/* loaded from: classes7.dex */
public class zgb implements zbf {
    public final bxzt a;
    public boolean b = false;
    @dzsi
    public cqtd c;
    public final zga d;
    private final ff e;
    private final cqkj f;
    @dzsi
    private Dialog g;

    public zgb(ff ffVar, afha afhaVar, wto wtoVar, cqkj cqkjVar, bsvm bsvmVar, vtn vtnVar, bxzt bxztVar, boolean z, @dzsi zga zgaVar) {
        this.e = ffVar;
        this.f = cqkjVar;
        this.a = bxztVar;
        this.d = zgaVar;
        String a = byaf.a(bxztVar.e());
        if (a != null) {
            this.c = vtnVar.f(a, bvlw.a, new vtk(this) { // from class: zfy
                private final zgb a;

                {
                    this.a = this;
                }

                @Override // defpackage.vtk
                public final void a(cqtd cqtdVar) {
                    zgb zgbVar = this.a;
                    zgbVar.c = cqtdVar;
                    cqkx.p(zgbVar);
                }
            });
        }
    }

    private final void i() {
        Dialog dialog = this.g;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // defpackage.zbf
    @dzsi
    public cqtd a() {
        return this.c;
    }

    @Override // defpackage.zbf
    public CharSequence b() {
        return "";
    }

    @Override // defpackage.zbf
    public List<CharSequence> c() {
        return dcdc.e();
    }

    @Override // defpackage.zbf
    public CharSequence d() {
        return "";
    }

    @Override // defpackage.zbf
    public cqkl e() {
        this.b = true;
        i();
        return cqkl.a;
    }

    @Override // defpackage.zbf
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.zbf
    public cqkl g() {
        i();
        return cqkl.a;
    }

    public void h() {
        if (this.g != null) {
            return;
        }
        cqkf e = this.f.e(new unx());
        Dialog dialog = new Dialog(this.e, 16974129);
        e.e(this);
        dialog.setContentView(e.c());
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: zfz
            private final zgb a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                zgb zgbVar = this.a;
                zgbVar.d.a(zgbVar.a, zgbVar.b);
            }
        });
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
        this.g = dialog;
    }
}

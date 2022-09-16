package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: ajye  reason: default package */
/* loaded from: classes2.dex */
public final class ajye extends ex implements ajyl {
    public static final String ad;
    @dzsi
    public czwe ae;
    public cqkj af;
    public ajyj ag;
    @dzsi
    private cqkf<ajyg> ah;
    @dzsi
    private ajyg ai;
    private ajyk aj;
    private boolean ak;
    private fd al;

    static {
        String canonicalName = ajye.class.getCanonicalName();
        dbsk.s(canonicalName);
        ad = canonicalName;
    }

    public static ajye aJ(fd fdVar, ajyk ajykVar, boolean z) {
        ajye ajyeVar = new ajye();
        ajyeVar.aj = ajykVar;
        ajyeVar.ak = z;
        ajyeVar.al = fdVar;
        return ajyeVar;
    }

    @Override // defpackage.ex, defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.ajyl
    public final void aK() {
        e(this.al.R(), ad);
    }

    @Override // defpackage.ex, defpackage.ajyl
    public final void f() {
        czwe czweVar = this.ae;
        if (czweVar != null) {
            czweVar.dismiss();
            this.ae = null;
        }
    }

    @Override // defpackage.ex, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        ajyj ajyjVar = this.ag;
        ajyk ajykVar = this.aj;
        boolean z = this.ak;
        Resources a = ajyjVar.a.a();
        ajyj.a(a, 1);
        ajyj.a(ajykVar, 2);
        this.ai = new ajyi(a, ajykVar, z);
    }

    @Override // defpackage.ex
    public final Dialog q(@dzsi Bundle bundle) {
        czwe czweVar = new czwe(H(), R.style.bottom_sheet_link_warning_dialog_theme);
        this.ae = czweVar;
        czweVar.setOnShowListener(new DialogInterface.OnShowListener(this) { // from class: ajyd
            private final ajye a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                czwe czweVar2 = this.a.ae;
                dbsk.s(czweVar2);
                View findViewById = czweVar2.findViewById(R.id.design_bottom_sheet);
                if (findViewById != null) {
                    BottomSheetBehavior F = BottomSheetBehavior.F(findViewById);
                    F.s(-1);
                    F.y(3);
                    F.m = true;
                    F.v(false);
                }
            }
        });
        this.ah = this.af.c(new ajyh(), null);
        czwe czweVar2 = this.ae;
        dbsk.s(czweVar2);
        czweVar2.setContentView(this.ah.c());
        czwe czweVar3 = this.ae;
        dbsk.s(czweVar3);
        return czweVar3;
    }

    @Override // defpackage.ex, defpackage.fd
    public final void s() {
        super.s();
        cqkf<ajyg> cqkfVar = this.ah;
        dbsk.s(cqkfVar);
        ajyg ajygVar = this.ai;
        dbsk.s(ajygVar);
        cqkfVar.e(ajygVar);
    }

    @Override // defpackage.ex, defpackage.fd
    public final void u() {
        super.u();
        cqkf<ajyg> cqkfVar = this.ah;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
    }
}

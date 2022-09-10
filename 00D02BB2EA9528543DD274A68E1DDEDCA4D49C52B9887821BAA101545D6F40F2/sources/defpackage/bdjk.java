package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.apps.gmm.streetview.model.UserOrientation;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bdjk  reason: default package */
/* loaded from: classes3.dex */
public final class bdjk extends gen implements cqhm, bdjv {
    private static final dcqe ah = dcqe.c("bdjk");
    @dzsi
    public dwfl a;
    public btvo ad;
    public cqkj ae;
    public cqhn af;
    public buyk ag;
    @dzsi
    private bbvn ai;
    @dzsi
    private AlertDialog aj;
    @dzsi
    private View ak;
    @dzsi
    public ilo b;
    @dzsi
    bdjz c;
    public bwqv d;
    public cjqy e;
    public dxio<afha> g;

    public static void bn(ff ffVar, dwfl dwflVar, @dzsi ilo iloVar, bwqv bwqvVar, btvo btvoVar, dxio<afha> dxioVar, @dzsi bbvn bbvnVar) {
        Uri uri = null;
        if (cknv.g(dwflVar)) {
            if (dwflVar != null) {
                dnpq dnpqVar = dwflVar.n;
                if (dnpqVar == null) {
                    dnpqVar = dnpq.g;
                }
                if ((dnpqVar.a & 2) != 0) {
                    dnpq dnpqVar2 = dwflVar.n;
                    if (dnpqVar2 == null) {
                        dnpqVar2 = dnpq.g;
                    }
                    Uri.Builder buildUpon = Uri.parse(dnpqVar2.c).buildUpon();
                    buildUpon.appendQueryParameter("hl", Locale.getDefault().toString());
                    if (cknv.g(dwflVar)) {
                        dhjx dhjxVar = dwflVar.m;
                        if (dhjxVar == null) {
                            dhjxVar = dhjx.f;
                        }
                        buildUpon.appendQueryParameter("cbp", new UserOrientation(dhjxVar).e());
                    }
                    uri = buildUpon.build();
                }
            }
            if (uri == null) {
                dizh dizhVar = dwflVar.p;
                if (dizhVar == null) {
                    dizhVar = dizh.j;
                }
                dggg dgggVar = dizhVar.b;
                if (dgggVar == null) {
                    dgggVar = dggg.d;
                }
                uri = cknu.a(btvoVar, dgggVar.c, new UserOrientation(), false);
            }
            dxioVar.a().l(ffVar, uri, 4);
            return;
        }
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "rapPhoto", bvrt.b(dwflVar));
        bwqvVar.c(bundle, "rapPlacemark", iloVar);
        if (bbvnVar != null) {
            bvrs.k(bundle, "photoReportAProblem", bbvnVar);
        }
        bdjk bdjkVar = new bdjk();
        bdjkVar.B(bundle);
        bdjkVar.Nz(null);
        bdjkVar.aJ(ffVar);
    }

    public static bbug q() {
        return new bdjj();
    }

    public static void w(ff ffVar, dwfl dwflVar, @dzsi ilo iloVar, bwqv bwqvVar, btvo btvoVar, dxio<afha> dxioVar) {
        bn(ffVar, dwflVar, iloVar, bwqvVar, btvoVar, dxioVar, bbvn.d);
    }

    @Override // defpackage.cqhm
    public final void a() {
        bdjz bdjzVar = this.c;
        if (bdjzVar == null || this.aj == null || !this.aD) {
            return;
        }
        dwgq g = bdjzVar.g();
        bdjz bdjzVar2 = this.c;
        dbsk.s(bdjzVar2);
        String charSequence = bdjzVar2.f().toString();
        AlertDialog alertDialog = this.aj;
        dbsk.s(alertDialog);
        Button button = alertDialog.getButton(-1);
        boolean z = true;
        if (g == dwgq.UGC_OTHER && dbsj.d(charSequence)) {
            z = false;
        }
        button.setEnabled(z);
    }

    @Override // defpackage.bdjv
    public final void g() {
        View view;
        View a;
        if (!this.aD || (view = this.ak) == null || (a = cqhu.a(view, bdjs.a)) == null) {
            return;
        }
        a.requestFocus();
        a.post(new bdji(this));
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        bvrt bvrtVar;
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        try {
            bvrtVar = (bvrt) this.d.d(bvrt.class, bundle, "rapPhoto");
        } catch (IOException e) {
            bvoo.h("Failed to read TactilePhotoDescriptionProto from GmmStorage: %s", e);
            bvrtVar = null;
        }
        this.a = (dwfl) bvrt.f(bvrtVar, (dssr) dwfl.w.cu(7), dwfl.w);
        try {
            this.b = (ilo) this.d.d(ilo.class, bundle, "rapPlacemark");
        } catch (IOException e2) {
            bvoo.h("Failed to read Placemark from GmmStorage: %s", e2);
        }
        bbvn bbvnVar = (bbvn) bvrs.f(bundle, "photoReportAProblem", (dssr) bbvn.d.cu(7));
        if (bbvnVar != null) {
            this.ai = bbvnVar;
        }
        cqhn cqhnVar = this.af;
        bbvn bbvnVar2 = this.ai;
        if (bbvnVar2 == null) {
            bbvnVar2 = bbvn.d;
        }
        bdjz bdjzVar = new bdjz(cqhnVar, this, bbvnVar2);
        this.c = bdjzVar;
        cqkx.j(bdjzVar, this);
        cqkf e3 = this.ae.e(new bdjs());
        e3.e(this.c);
        this.ak = e3.c();
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(J(), true != iva.a().booleanValue() ? 5 : 4).setTitle(R.string.IMAGERY_RAP_DIALOG_TITLE).setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: bdje
            private final bdjk a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.a.Ra(bdjk.q());
            }
        }).setNegativeButton(R.string.CANCEL_BUTTON, new DialogInterface.OnClickListener(this) { // from class: bdjf
            private final bdjk a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                bdjk bdjkVar = this.a;
                if (!bdjkVar.aD) {
                    return;
                }
                if (i == -2) {
                    ilo iloVar = bdjkVar.b;
                    decs n = iloVar != null ? iloVar.ai().n() : null;
                    cjqy cjqyVar = bdjkVar.e;
                    cjta b = cjtd.b();
                    b.d = dtxy.fi;
                    b.g = n;
                    cjqyVar.i(b.a());
                }
                bdjkVar.Ra(bdjk.q());
            }
        }).setPositiveButton(R.string.IMAGERY_RAP_REPORT, new DialogInterface.OnClickListener(this) { // from class: bdjg
            private final bdjk a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                bdjk bdjkVar = this.a;
                if (!bdjkVar.aD || i != -1 || bdjkVar.c == null) {
                    return;
                }
                ilo iloVar = bdjkVar.b;
                String str = null;
                decs n = iloVar != null ? iloVar.ai().n() : null;
                cjqy cjqyVar = bdjkVar.e;
                cjta b = cjtd.b();
                b.d = dtxy.fj;
                b.g = n;
                cjqyVar.i(b.a());
                bdjz bdjzVar2 = bdjkVar.c;
                dbsk.s(bdjzVar2);
                dwgq g = bdjzVar2.g();
                bdjz bdjzVar3 = bdjkVar.c;
                dbsk.s(bdjzVar3);
                String charSequence = bdjzVar3.f().toString();
                if (g == dwgq.UGC_COPYRIGHT) {
                    bdjkVar.g.a().H(bdjkVar.J(), bdjkVar.ad.getServerSettingParameters().c, 4);
                    bdjkVar.Ra(bdjk.q());
                    return;
                }
                dwfl dwflVar = bdjkVar.a;
                ilo iloVar2 = bdjkVar.b;
                akqi ai = iloVar2 == null ? null : iloVar2.ai();
                ilo iloVar3 = bdjkVar.b;
                if (iloVar3 != null) {
                    str = iloVar3.cG();
                }
                buyk buykVar = bdjkVar.ag;
                bdjh bdjhVar = new bdjh();
                if (dwflVar != null) {
                    dizh dizhVar = dwflVar.p;
                    if (dizhVar == null) {
                        dizhVar = dizh.j;
                    }
                    if ((dizhVar.a & 1) == 0) {
                        bvoo.f(new IllegalStateException("Can't report a problem for photos because the image_key is missing."));
                    }
                    dwgo bZ = dwgr.g.bZ();
                    dizh dizhVar2 = dwflVar.p;
                    if (dizhVar2 == null) {
                        dizhVar2 = dizh.j;
                    }
                    dggg dgggVar = dizhVar2.b;
                    if (dgggVar == null) {
                        dgggVar = dggg.d;
                    }
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dwgr dwgrVar = (dwgr) bZ.b;
                    dgggVar.getClass();
                    dwgrVar.c = dgggVar;
                    int i2 = dwgrVar.a | 4;
                    dwgrVar.a = i2;
                    dwgrVar.b = g.q;
                    dwgrVar.a = i2 | 2;
                    if (ai != null && akqi.d(ai)) {
                        String o = ai.o();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dwgr dwgrVar2 = (dwgr) bZ.b;
                        o.getClass();
                        dwgrVar2.a |= 8;
                        dwgrVar2.d = o;
                    } else if (str != null) {
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dwgr dwgrVar3 = (dwgr) bZ.b;
                        str.getClass();
                        dwgrVar3.a |= 16;
                        dwgrVar3.e = str;
                    }
                    if (g == dwgq.UGC_OTHER) {
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dwgr dwgrVar4 = (dwgr) bZ.b;
                        charSequence.getClass();
                        dwgrVar4.a |= 128;
                        dwgrVar4.f = charSequence;
                    }
                    bZ.bK();
                    buykVar.a(bZ.bK(), bdjhVar, bvrj.BACKGROUND_THREADPOOL);
                }
                Toast.makeText(bdjkVar.J(), (int) R.string.PHOTO_RAP_THANKS, 0).show();
                bdjkVar.Ra(bdjk.q());
            }
        });
        View view = this.ak;
        dbsk.s(view);
        AlertDialog create = positiveButton.setView(view).create();
        this.aj = create;
        create.show();
        this.aj.getButton(-1).setEnabled(false);
        AlertDialog alertDialog = this.aj;
        dbsk.s(alertDialog);
        return alertDialog;
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.fh;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        this.d.c(bundle, "rapPhoto", bvrt.a(this.a));
        this.d.c(bundle, "rapPlacemark", this.b);
        bbvn bbvnVar = this.ai;
        if (bbvnVar != null) {
            bvrs.k(bundle, "photoReportAProblem", bbvnVar);
        }
        super.t(bundle);
    }
}

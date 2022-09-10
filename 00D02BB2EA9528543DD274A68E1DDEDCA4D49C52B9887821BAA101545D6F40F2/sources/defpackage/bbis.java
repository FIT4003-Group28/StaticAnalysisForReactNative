package defpackage;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bbis  reason: default package */
/* loaded from: classes.dex */
public final class bbis extends afhx {
    public static final dcqe a = dcqe.c("bbis");
    public static final dbsl<afga> b;
    private static final dpvg q;
    private static final dnqh r;
    private static final dnqh s;
    public final gga c;
    public final dxio<bbdv> d;
    public final dxio<brba> e;
    public final Executor i;
    public final cjqy j;
    public final dxio<bvjj> k;
    public final bbek l;
    public final ProgressDialog m;
    public final bbej n;
    @dzsi
    public brln o;
    public boolean p;
    private final btvo t;
    private final brlm u;

    static {
        dpvd bZ = dpvg.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpvg dpvgVar = (dpvg) bZ.b;
        dpvgVar.a |= 2;
        dpvgVar.c = "Restaurants";
        dpvf dpvfVar = dpvf.RESTAURANTS;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpvg dpvgVar2 = (dpvg) bZ.b;
        dpvgVar2.b = dpvfVar.an;
        dpvgVar2.a |= 1;
        q = bZ.bK();
        dnqg bZ2 = dnqh.p.bZ();
        int i = ddda.eE.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ2.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        r = bZ2.bK();
        dnqg bZ3 = dnqh.p.bZ();
        int i2 = ddda.eD.b;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnqh dnqhVar2 = (dnqh) bZ3.b;
        dnqhVar2.a |= 64;
        dnqhVar2.g = i2;
        s = bZ3.bK();
        b = bbip.a;
    }

    public bbis(gga ggaVar, dxio<bbdv> dxioVar, dxio<brba> dxioVar2, Executor executor, cjqy cjqyVar, dxio<bvjj> dxioVar3, bbek bbekVar, btvo btvoVar, Intent intent, @dzsi String str) {
        super(intent, str, afid.PERSONAL_SCORE_MARKETING);
        this.u = new bbir(this);
        this.c = ggaVar;
        this.d = dxioVar;
        this.e = dxioVar2;
        this.i = executor;
        this.j = cjqyVar;
        this.k = dxioVar3;
        this.t = btvoVar;
        this.l = bbekVar;
        this.n = new bbiq(this);
        ProgressDialog progressDialog = new ProgressDialog(ggaVar);
        this.m = progressDialog;
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(ggaVar.getString(R.string.LOADING));
        progressDialog.setTitle("");
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(true);
        progressDialog.setOnShowListener(new DialogInterface.OnShowListener(this) { // from class: bbim
            private final bbis a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.a.p = false;
            }
        });
        progressDialog.setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: bbin
            private final bbis a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.a.p = true;
            }
        });
    }

    @Override // defpackage.afhx
    public final void a() {
        if (this.t.getEnableFeatureParameters().aX && this.c.aZ) {
            this.l.a();
            d(1);
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_PERSONAL_SCORE_MARKETING;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(int i) {
        this.o = null;
        this.m.show();
        brba a2 = this.e.a();
        int i2 = i - 1;
        dpvg dpvgVar = q;
        dnqh dnqhVar = i2 != 0 ? s : r;
        brlm brlmVar = this.u;
        iqy iqyVar = new iqy();
        iqyVar.b();
        iqyVar.e();
        if (i2 != 0) {
            iqyVar.q = 10;
        } else {
            iqyVar.q = 9;
        }
        a2.Q(dpvgVar, dnqhVar, brlmVar, iqyVar, null);
    }
}

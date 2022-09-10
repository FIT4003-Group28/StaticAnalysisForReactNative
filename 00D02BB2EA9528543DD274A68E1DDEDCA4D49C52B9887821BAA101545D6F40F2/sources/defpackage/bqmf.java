package defpackage;

import android.app.Application;
import android.app.ProgressDialog;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bqmf  reason: default package */
/* loaded from: classes4.dex */
public final class bqmf implements bqlc {
    private static final dcqe g = dcqe.c("bqmf");
    public final Application a;
    public final btrm b;
    public final chht c;
    public final dxio<cchz> d;
    public final dxio<akfa> e;
    public final bqkt f;
    private final bvba h;
    private final bumh i;
    private final bzux j;
    private final beyi k;

    public bqmf(Application application, btrm btrmVar, chht chhtVar, bvba bvbaVar, bumh bumhVar, dxio<cchz> dxioVar, dxio<akfa> dxioVar2, bzux bzuxVar, bqkt bqktVar, beyi beyiVar) {
        dbsk.s(application);
        this.a = application;
        dbsk.s(btrmVar);
        this.b = btrmVar;
        this.c = chhtVar;
        this.h = bvbaVar;
        this.i = bumhVar;
        this.d = dxioVar;
        this.e = dxioVar2;
        this.j = bzuxVar;
        this.f = bqktVar;
        this.k = beyiVar;
    }

    private static boolean e(bqla bqlaVar) {
        return !dbra.b.s(bqlaVar.a().c()).isEmpty();
    }

    @Override // defpackage.bqlc
    public final void a(gga ggaVar, bqla bqlaVar, bwrs<ilo> bwrsVar, @dzsi bqlb bqlbVar) {
        ProgressDialog progressDialog = new ProgressDialog(ggaVar, 0);
        progressDialog.setMessage(ggaVar.getString(R.string.SUBMIT_RATING_IN_PROGRESS));
        progressDialog.show();
        b(bqlaVar, bwrsVar, new bqmc(this, ggaVar, progressDialog, bqlbVar, bqlaVar, bwrsVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015a  */
    @Override // defpackage.bqlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.bqla r9, defpackage.bwrs<defpackage.ilo> r10, @defpackage.dzsi defpackage.bqlb r11) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqmf.b(bqla, bwrs, bqlb):void");
    }

    @Override // defpackage.bqlc
    public final void c(String str, dqgr dqgrVar, dnqh dnqhVar, bwrs<ilo> bwrsVar, bqlb bqlbVar) {
        dvpz bZ = dvqa.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvqa dvqaVar = (dvqa) bZ.b;
        str.getClass();
        int i = dvqaVar.a | 1;
        dvqaVar.a = i;
        dvqaVar.b = str;
        dnqhVar.getClass();
        dvqaVar.e = dnqhVar;
        dvqaVar.a = i | 32;
        bqmd bqmdVar = new bqmd(this, bwrsVar, dqgrVar, bqlbVar);
        bumj c = this.i.c();
        String str2 = ((dvqa) bZ.b).b;
        c.a(bZ.bK(), bqmdVar, bvrj.UI_THREAD);
    }

    @Override // defpackage.bqlc
    public final void d(akqi akqiVar, dqgr dqgrVar, dnqh dnqhVar, bwrs<ilo> bwrsVar, bqlb bqlbVar) {
        dvpz bZ = dvqa.f.bZ();
        String o = akqiVar.o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvqa dvqaVar = (dvqa) bZ.b;
        o.getClass();
        int i = dvqaVar.a | 4;
        dvqaVar.a = i;
        dvqaVar.c = o;
        dvqaVar.d = dqgrVar.d;
        int i2 = i | 8;
        dvqaVar.a = i2;
        dnqhVar.getClass();
        dvqaVar.e = dnqhVar;
        dvqaVar.a = i2 | 32;
        bqmd bqmdVar = new bqmd(this, bwrsVar, dqgrVar, bqlbVar);
        bumj c = this.i.c();
        String str = ((dvqa) bZ.b).c;
        c.a(bZ.bK(), bqmdVar, bvrj.UI_THREAD);
    }
}

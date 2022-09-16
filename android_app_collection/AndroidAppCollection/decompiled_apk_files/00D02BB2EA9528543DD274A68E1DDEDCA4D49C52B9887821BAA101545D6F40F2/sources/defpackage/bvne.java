package defpackage;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bvne  reason: default package */
/* loaded from: classes4.dex */
class bvne implements bvno {
    final /* synthetic */ bvmy a;
    final /* synthetic */ String b;
    final /* synthetic */ AlertDialog c;
    final /* synthetic */ deig d;
    final /* synthetic */ btlu e;
    final /* synthetic */ String f;
    final /* synthetic */ ddho g;
    final /* synthetic */ bvnf h;

    public bvne(bvnf bvnfVar, bvmy bvmyVar, String str, AlertDialog alertDialog, deig deigVar, btlu btluVar, String str2, ddho ddhoVar) {
        this.h = bvnfVar;
        this.a = bvmyVar;
        this.b = str;
        this.c = alertDialog;
        this.d = deigVar;
        this.e = btluVar;
        this.f = str2;
        this.g = ddhoVar;
    }

    @Override // defpackage.bvno
    public bvmy a() {
        return this.a;
    }

    @Override // defpackage.bvno
    public CharSequence b() {
        bvnf bvnfVar = this.h;
        return bvnfVar.d.getString(R.string.BLOCK_PERSON_CONFIRM_TITLE, new Object[]{bvnfVar.a.b(this.b)});
    }

    @Override // defpackage.bvno
    public CharSequence c() {
        return this.h.d.getString(R.string.CANCEL_BUTTON);
    }

    @Override // defpackage.bvno
    public cqkl d() {
        this.c.dismiss();
        this.d.j(bvns.BLOCK_ACTION_CANCELLED);
        return cqkl.a;
    }

    @Override // defpackage.bvno
    public cjtd e() {
        return cjtd.a(dtxu.dk);
    }

    @Override // defpackage.bvno
    public CharSequence f() {
        return this.h.d.getString(R.string.BLOCK_PERSON_ACTION);
    }

    @Override // defpackage.bvno
    public cqkl g() {
        this.c.dismiss();
        deig deigVar = this.d;
        final bvnf bvnfVar = this.h;
        btlu btluVar = this.e;
        String str = this.f;
        final String str2 = this.b;
        final deig d = deig.d();
        bvnb bvnbVar = bvnfVar.c;
        dkdv bZ = dkdw.b.bZ();
        dqld bZ2 = dqle.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dqle dqleVar = (dqle) bZ2.b;
        str.getClass();
        int i = dqleVar.a | 1;
        dqleVar.a = i;
        dqleVar.b = str;
        str2.getClass();
        dqleVar.a = i | 2;
        dqleVar.c = str2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkdw dkdwVar = (dkdw) bZ.b;
        dqle bK = bZ2.bK();
        bK.getClass();
        dsrj<dqle> dsrjVar = dkdwVar.a;
        if (!dsrjVar.a()) {
            dkdwVar.a = dsqw.cl(dsrjVar);
        }
        dkdwVar.a.add(bK);
        ProgressDialog show = ProgressDialog.show(bvnbVar.c, "", bvnbVar.c.getResources().getString(R.string.BLOCK_PERSON_PROGRESS_MESSAGE, bvnbVar.b.b(str2)), true, false);
        final deig d2 = deig.d();
        bvnbVar.a.a().e = btluVar;
        bvnbVar.a.c().a(bZ.bK(), new bvna(bvnbVar, show, d2), bvrj.UI_THREAD);
        d2.Pk(new Runnable(bvnfVar, d2, str2, d) { // from class: bvnd
            private final bvnf a;
            private final dehn b;
            private final String c;
            private final deig d;

            {
                this.a = bvnfVar;
                this.b = d2;
                this.c = str2;
                this.d = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvnf bvnfVar2 = this.a;
                dehn dehnVar = this.b;
                String str3 = this.c;
                deig deigVar2 = this.d;
                if (((Boolean) deha.s(dehnVar)).booleanValue()) {
                    bvnfVar2.e.a().j(awwm.USER_BLOCKING);
                    gga ggaVar = bvnfVar2.d;
                    Toast.makeText(ggaVar, ggaVar.getResources().getString(R.string.BLOCKED_PERSON_TOAST, bvnfVar2.a.b(str3)), 0).show();
                    deigVar2.j(bvns.BLOCK_ACTION_SUCCESS);
                    return;
                }
                deigVar2.j(bvns.BLOCK_ACTION_FAILURE);
            }
        }, bvnfVar.b);
        deigVar.p(d);
        return cqkl.a;
    }

    @Override // defpackage.bvno
    public cjtd h() {
        return cjtd.a(this.g);
    }
}

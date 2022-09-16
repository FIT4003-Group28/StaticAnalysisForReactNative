package defpackage;

import android.app.ProgressDialog;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cbdb  reason: default package */
/* loaded from: classes4.dex */
public final class cbdb implements bxeq {
    public final ges a;
    @dzsi
    ProgressDialog b;
    private final Executor c;
    private final cbqf d;

    public cbdb(ges gesVar, Executor executor, cbqf cbqfVar) {
        this.a = gesVar;
        this.c = executor;
        this.d = cbqfVar;
    }

    @Override // defpackage.bxeq
    public final void Pf(dwjb dwjbVar, dnqh dnqhVar) {
    }

    public final void a() {
        gn gnVar = this.a.A;
        if (gnVar != null) {
            gnVar.f();
        }
    }

    @Override // defpackage.bxeq
    public final void aK() {
    }

    @Override // defpackage.bxeq
    public final void aL(String str) {
    }

    @Override // defpackage.bxeq
    public final void aM(bxmh bxmhVar, List list) {
    }

    @Override // defpackage.bxeq
    public final boolean aN() {
        return false;
    }

    @Override // defpackage.bxeq
    public final void h(bxmh bxmhVar, @dzsi bxmh bxmhVar2, dnqh dnqhVar, @dzsi bxkv bxkvVar, cjqm cjqmVar) {
        ff J = this.a.J();
        ProgressDialog progressDialog = new ProgressDialog(J, 0);
        this.b = progressDialog;
        progressDialog.setMessage(J.getResources().getString(R.string.UGC_EVENTS_LOCATION_PICKER_LOADING_MESSAGE));
        this.b.show();
        dwjj dwjjVar = bxmhVar.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dvzj dvzjVar = dwjjVar.g;
        if (dvzjVar == null) {
            dvzjVar = dvzj.y;
        }
        String str = dvzjVar.b;
        dwjj dwjjVar2 = bxmhVar.b;
        if (dwjjVar2 == null) {
            dwjjVar2 = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar2.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        String str2 = dxbpVar.b;
        ily ilyVar = new ily();
        ilyVar.k(str);
        ilyVar.t = str2;
        dwjj dwjjVar3 = bxmhVar.b;
        if (dwjjVar3 == null) {
            dwjjVar3 = dwjj.k;
        }
        dvzj dvzjVar2 = dwjjVar3.g;
        if (dvzjVar2 == null) {
            dvzjVar2 = dvzj.y;
        }
        dhjz dhjzVar = dvzjVar2.d;
        if (dhjzVar == null) {
            dhjzVar = dhjz.e;
        }
        ilyVar.q(new akqq(dhjzVar.c, dhjzVar.b));
        deha.q(this.d.a(ilyVar.d()), new cbda(this, ilyVar), this.c);
    }

    @Override // defpackage.bxeq
    public final void i(String str, dnqh dnqhVar) {
    }
}

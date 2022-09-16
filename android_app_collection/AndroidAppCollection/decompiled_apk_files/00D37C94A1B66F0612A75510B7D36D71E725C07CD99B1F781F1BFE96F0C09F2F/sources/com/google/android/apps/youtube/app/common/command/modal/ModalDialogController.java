package com.google.android.apps.youtube.app.common.command.modal;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ModalDialogController implements f {
    public final Context a;
    public final ajgf b;
    public final acth c;
    public final akbn d;
    public final airr e;
    public AlertDialog f;
    public View g;
    public TextView h;
    public akbj i;
    public akbj j;
    public boolean k;

    public ModalDialogController(Context context, ajve ajveVar, acth acthVar, akbn akbnVar, airr airrVar) {
        this.a = context;
        this.b = ajveVar;
        this.c = acthVar;
        this.d = akbnVar;
        this.e = airrVar;
    }

    public final void g() {
        AlertDialog alertDialog = this.f;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        g();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}

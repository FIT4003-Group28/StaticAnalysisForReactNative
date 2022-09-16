package defpackage;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbep  reason: default package */
/* loaded from: classes4.dex */
final class cbep {
    public static final dcqe a = dcqe.c("cbep");
    public final dijr b;
    public final String c;
    public final gga d;
    public final cqkj e;
    public final cztz f;
    public final dxio<aagc> g;
    public final dxio<cafi> h;
    public final AlertDialog i;
    @dzsi
    public final cbeo j;
    @dzsi
    public btzc k = null;
    @dzsi
    public ProgressDialog l = null;
    @dzsi
    public dafk m = null;
    public final buni n;

    public cbep(dijr dijrVar, String str, cbeo cbeoVar, buni buniVar, gga ggaVar, cqkj cqkjVar, cztz cztzVar, dxio dxioVar, dxio dxioVar2) {
        this.b = dijrVar;
        this.c = str;
        this.j = cbeoVar;
        this.n = buniVar;
        this.d = ggaVar;
        this.e = cqkjVar;
        this.f = cztzVar;
        this.g = dxioVar;
        this.h = dxioVar2;
        this.i = new AlertDialog.Builder(ggaVar).setTitle(ggaVar.getString(R.string.UGC_EVENTS_ERROR_DIALOG_TITLE)).setMessage(ggaVar.getString(R.string.UGC_EVENTS_ERROR_DIALOG_TEXT)).setPositiveButton(ggaVar.getString(R.string.OK_BUTTON), cbej.a).create();
    }

    public final void a() {
        ProgressDialog progressDialog = this.l;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.l = null;
    }
}

package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
/* compiled from: PG */
/* renamed from: cnpk  reason: default package */
/* loaded from: classes5.dex */
final class cnpk implements Runnable {
    final /* synthetic */ cnpl a;
    private final cnpi b;

    public cnpk(cnpl cnplVar, cnpi cnpiVar) {
        this.a = cnplVar;
        this.b = cnpiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.b) {
            return;
        }
        ConnectionResult connectionResult = this.b.b;
        if (connectionResult.b()) {
            cnpl cnplVar = this.a;
            cnrx cnrxVar = cnplVar.e;
            Activity n = cnplVar.n();
            PendingIntent pendingIntent = connectionResult.d;
            cnwc.a(pendingIntent);
            cnrxVar.startActivityForResult(GoogleApiActivity.a(n, pendingIntent, this.b.a, false), 1);
            return;
        }
        cnpl cnplVar2 = this.a;
        if (cnplVar2.d.k(cnplVar2.n(), connectionResult.c, null) != null) {
            cnpl cnplVar3 = this.a;
            cnmq cnmqVar = cnplVar3.d;
            Activity n2 = cnplVar3.n();
            cnpl cnplVar4 = this.a;
            cnrx cnrxVar2 = cnplVar4.e;
            int i = connectionResult.c;
            Dialog d = cnmqVar.d(n2, i, new cnur(cnmqVar.k(n2, i, "d"), cnrxVar2), cnplVar4);
            if (d == null) {
                return;
            }
            cnmqVar.e(n2, d, "GooglePlayServicesErrorDialog", cnplVar4);
        } else if (connectionResult.c == 18) {
            cnpl cnplVar5 = this.a;
            cnmq cnmqVar2 = cnplVar5.d;
            Activity n3 = cnplVar5.n();
            cnpl cnplVar6 = this.a;
            ProgressBar progressBar = new ProgressBar(n3, null, 16842874);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(n3);
            builder.setView(progressBar);
            builder.setMessage(cnun.c(n3, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            cnmqVar2.e(n3, create, "GooglePlayServicesUpdatingDialog", cnplVar6);
            cnpl cnplVar7 = this.a;
            cnplVar7.d.c(cnplVar7.n().getApplicationContext(), new cnpj(this, create));
        } else {
            this.a.f(connectionResult, this.b.a);
        }
    }
}

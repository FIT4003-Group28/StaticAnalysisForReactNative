package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qtw  reason: default package */
/* loaded from: classes4.dex */
public final class qtw implements Runnable {
    final /* synthetic */ qtx a;
    private final qtv b;

    public qtw(qtx qtxVar, qtv qtvVar) {
        this.a = qtxVar;
        this.b = qtvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.a) {
            return;
        }
        ConnectionResult connectionResult = this.b.b;
        if (connectionResult.b()) {
            qtx qtxVar = this.a;
            qux quxVar = qtxVar.e;
            Activity l = qtxVar.l();
            PendingIntent pendingIntent = connectionResult.d;
            qnm.b(pendingIntent);
            quxVar.startActivityForResult(GoogleApiActivity.a(l, pendingIntent, this.b.a, false), 1);
            return;
        }
        qtx qtxVar2 = this.a;
        if (qtxVar2.c.i(qtxVar2.l(), connectionResult.c, null) != null) {
            qtx qtxVar3 = this.a;
            qrq qrqVar = qtxVar3.c;
            Activity l2 = qtxVar3.l();
            qtx qtxVar4 = this.a;
            qux quxVar2 = qtxVar4.e;
            int i = connectionResult.c;
            Dialog b = qrqVar.b(l2, i, new qwx(qrqVar.i(l2, i, "d"), quxVar2), qtxVar4);
            if (b == null) {
                return;
            }
            qrqVar.c(l2, b, "GooglePlayServicesErrorDialog", qtxVar4);
        } else if (connectionResult.c == 18) {
            qtx qtxVar5 = this.a;
            qrq qrqVar2 = qtxVar5.c;
            Activity l3 = qtxVar5.l();
            qtx qtxVar6 = this.a;
            ProgressBar progressBar = new ProgressBar(l3, null, 16842874);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(l3);
            builder.setView(progressBar);
            builder.setMessage(qwv.d(l3, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            qrqVar2.c(l3, create, "GooglePlayServicesUpdatingDialog", qtxVar6);
            Context applicationContext = this.a.l().getApplicationContext();
            qus qusVar = new qus(this, create);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            qut qutVar = new qut(qusVar);
            applicationContext.registerReceiver(qutVar, intentFilter);
            qutVar.a = applicationContext;
            if (qse.i(applicationContext)) {
                return;
            }
            qusVar.a();
            qutVar.a();
        } else {
            this.a.b(connectionResult, this.b.a);
        }
    }
}

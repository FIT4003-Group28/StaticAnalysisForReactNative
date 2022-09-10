package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: codt  reason: default package */
/* loaded from: classes5.dex */
public final class codt {
    public final Activity a;

    public codt(Activity activity) {
        this.a = activity;
    }

    public final void a(Intent intent) {
        if (!intent.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        }
        int c = cnnl.c(this.a, 11925000);
        if (c == 0) {
            coej a = codv.a(this.a);
            cnwc.a(a.a);
            coei coeiVar = coej.k;
            GoogleApiClient googleApiClient = a.i;
            coec coecVar = new coec(coeiVar, googleApiClient, intent, new WeakReference(a.a));
            googleApiClient.enqueue(coecVar);
            cnwb.c(coecVar);
            return;
        }
        Intent data = new Intent("android.intent.action.VIEW").setData(((GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP")).q);
        if (c == 7) {
            c = 7;
        } else if (this.a.getPackageManager().queryIntentActivities(data, 0).size() > 0) {
            this.a.startActivity(data);
            return;
        }
        Activity activity = this.a;
        if (true == cnnl.j(activity, c)) {
            c = 18;
        }
        cnmq.a.h(activity, c, 0, null);
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czpf  reason: default package */
/* loaded from: classes5.dex */
public final class czpf extends ClickableSpan {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;

    public czpf(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        czpb a = czpb.a();
        Context context = this.a;
        int i = czph.a;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            Toast.makeText(context, context.getString(R.string.survey_network_request_failed), 0).show();
        } else {
            Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse("https://www.google.com/policies/terms/"));
            if (data.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(data);
            }
        }
        Context context2 = this.a;
        String str = this.b;
        if (!czov.a(dydo.b(czov.a))) {
            return;
        }
        czoz a2 = czoz.a();
        dtws bZ = dtwv.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dtwv) bZ.b).a = dtwt.a(2);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dtwv) bZ.b).b = dtwu.a(5);
        a2.c(bZ.bK(), a.b(), a.c(), context2, str);
    }
}

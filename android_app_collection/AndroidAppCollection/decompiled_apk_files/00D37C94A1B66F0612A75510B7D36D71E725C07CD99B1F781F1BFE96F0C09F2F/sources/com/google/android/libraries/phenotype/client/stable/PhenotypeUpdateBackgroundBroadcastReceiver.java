package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final ankt i;
        final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            vbk a = vbk.a(context);
            Map f = vdq.f(context);
            if (f.isEmpty()) {
                return;
            }
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            vcp vcpVar = (vcp) f.get(stringExtra);
            if (vcpVar == null) {
                i = anlz.j(amuk.s(vcr.a(a).b(new fct(stringExtra, 19), a.c()), a.c().qo(new vda(a, stringExtra)))).a(gbb.n, a.c());
            } else {
                i = anii.i(anko.q(anii.h(anko.q(vcr.a(a).a()), new fct(stringExtra, 16), a.c())), new vcx(vcpVar, stringExtra, a), a.c());
            }
            i.qY(new Runnable() { // from class: vdb
                @Override // java.lang.Runnable
                public final void run() {
                    ankt anktVar = ankt.this;
                    String str = stringExtra;
                    BroadcastReceiver.PendingResult pendingResult = goAsync;
                    try {
                        anlz.y(anktVar);
                        if (str.length() != 0) {
                            "Successfully stored update snapshot for ".concat(str);
                        }
                    } catch (ExecutionException e) {
                        Log.w("PhenotypeBackgroundRecv", str.length() != 0 ? "Failed to update local snapshot for ".concat(str) : new String("Failed to update local snapshot for "), e);
                    } finally {
                        pendingResult.finish();
                    }
                }
            }, a.c());
        }
    }
}

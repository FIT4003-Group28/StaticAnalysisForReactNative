package com.google.android.apps.gmm.plugins.serverrecovery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PhenotypeServerRecoveryHandlerImpl extends BroadcastReceiver {
    private static final Executor a = Executors.newSingleThreadExecutor();
    private final Executor b = a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        Locale.getDefault();
        bvow.c(context);
        intent.getAction();
        intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        intent.getIntExtra("com.google.android.gms.phenotype.UPDATE_REASON", -1);
        intent.getBooleanExtra("com.google.android.gms.phenotype.URGENT", false);
        String valueOf = String.valueOf(context.getPackageName());
        if (!(valueOf.length() != 0 ? "com.google.android.apps.gmm.recovery#".concat(valueOf) : new String("com.google.android.apps.gmm.recovery#")).equals(stringExtra)) {
            Locale.getDefault();
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        try {
            cxji.a(applicationContext);
        } catch (IllegalStateException unused) {
        }
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        this.b.execute(new Runnable(applicationContext, goAsync) { // from class: bnld
            private final Context a;
            private final BroadcastReceiver.PendingResult b;

            {
                this.a = applicationContext;
                this.b = goAsync;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(20:2|3|4|(3:44|45|46)|6|(3:33|34|(4:36|(1:38)|39|(3:41|24|25)))|8|(1:(1:11)(1:31))(1:32)|12|13|14|15|16|17|(1:19)|20|(1:22)|23|24|25) */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00f1, code lost:
                r0 = r2.a;
                r0 = r2.b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00f6, code lost:
                r0 = java.lang.String.valueOf(r8);
                r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 17);
                r3.append("Creating ");
                r3.append(r0);
                r3.append(" failed.");
                r3.toString();
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 290
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bnld.run():void");
            }
        });
    }
}

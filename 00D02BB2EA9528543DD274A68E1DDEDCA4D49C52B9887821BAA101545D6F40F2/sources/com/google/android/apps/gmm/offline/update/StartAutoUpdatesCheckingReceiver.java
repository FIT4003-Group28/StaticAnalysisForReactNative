package com.google.android.apps.gmm.offline.update;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.apps.gmm.offline.update.StartAutoUpdatesCheckingReceiver;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class StartAutoUpdatesCheckingReceiver extends BroadcastReceiver {
    public Executor a;
    public awfh b;
    public avjo c;

    public static final /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (IncompatibleClassChangeError e) {
            bvoo.j(e);
        } catch (NullPointerException e2) {
            bvoo.j(e2);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dxiq.c(this, context);
        final String action = intent.getAction();
        Executor executor = this.a;
        final Runnable runnable = new Runnable(this, action) { // from class: awlo
            private final StartAutoUpdatesCheckingReceiver a;
            private final String b;

            {
                this.a = this;
                this.b = action;
            }

            @Override // java.lang.Runnable
            public final void run() {
                StartAutoUpdatesCheckingReceiver startAutoUpdatesCheckingReceiver = this.a;
                String str = this.b;
                if ("android.intent.action.MY_PACKAGE_REPLACED".equals(str)) {
                    startAutoUpdatesCheckingReceiver.c.a();
                }
                if (("android.intent.action.BOOT_COMPLETED".equals(str) || "android.intent.action.MY_PACKAGE_REPLACED".equals(str)) && startAutoUpdatesCheckingReceiver.b.d()) {
                    startAutoUpdatesCheckingReceiver.c.c(startAutoUpdatesCheckingReceiver.b.f());
                }
            }
        };
        if (Build.VERSION.SDK_INT == 22) {
            runnable = new Runnable(runnable) { // from class: awlp
                private final Runnable a;

                {
                    this.a = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    StartAutoUpdatesCheckingReceiver.a(this.a);
                }
            };
        }
        executor.execute(runnable);
    }
}

package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends a.m.a.a {

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f9204c = h.b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void a(boolean z, BroadcastReceiver.PendingResult pendingResult, c.e.a.b.g.h hVar) {
        if (z) {
            pendingResult.setResultCode(hVar.e() ? ((Integer) hVar.b()).intValue() : 500);
        }
        pendingResult.finish();
    }

    private static Intent c(Context context, Intent intent) {
        Intent a2 = q0.a(intent);
        if (a2 != null) {
            intent = a2;
        }
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (Build.VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        return intent;
    }

    private final void d(Context context, Intent intent) {
        a vVar = "google.com/iid".equals(intent.getStringExtra("from")) ? new v(this.f9204c) : new f(context, this.f9204c);
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        vVar.a(intent).a(this.f9204c, new c.e.a.b.g.c(isOrderedBroadcast, goAsync) { // from class: com.google.firebase.iid.q

            /* renamed from: a  reason: collision with root package name */
            private final boolean f9270a;

            /* renamed from: b  reason: collision with root package name */
            private final BroadcastReceiver.PendingResult f9271b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9270a = isOrderedBroadcast;
                this.f9271b = goAsync;
            }

            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                FirebaseInstanceIdReceiver.a(this.f9270a, this.f9271b, hVar);
            }
        });
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        d(context, c(context, intent));
    }
}

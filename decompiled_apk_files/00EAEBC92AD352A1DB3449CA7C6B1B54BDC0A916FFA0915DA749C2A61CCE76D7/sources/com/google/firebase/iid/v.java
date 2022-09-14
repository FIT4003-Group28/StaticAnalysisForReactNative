package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
class v implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f9301a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(ExecutorService executorService) {
        this.f9301a = executorService;
    }

    private static int c(Intent intent) {
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(valueOf).length());
                sb.append("Received command: ");
                sb.append(stringExtra);
                sb.append(" - ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.n().l();
                return -1;
            } else if (!"SYNC".equals(stringExtra)) {
                return -1;
            } else {
                FirebaseInstanceId.n().c();
                return -1;
            }
        }
        return -1;
    }

    @Override // com.google.firebase.iid.a
    public c.e.a.b.g.h<Integer> a(final Intent intent) {
        return c.e.a.b.g.k.a(this.f9301a, new Callable(intent) { // from class: com.google.firebase.iid.u

            /* renamed from: a  reason: collision with root package name */
            private final Intent f9299a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9299a = intent;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(v.c(this.f9299a));
                return valueOf;
            }
        });
    }
}

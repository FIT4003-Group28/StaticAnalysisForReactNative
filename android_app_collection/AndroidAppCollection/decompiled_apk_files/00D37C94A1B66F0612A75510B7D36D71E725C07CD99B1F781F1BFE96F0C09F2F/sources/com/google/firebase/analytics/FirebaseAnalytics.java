package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics b;
    public final rir a;

    public FirebaseAnalytics(rir rirVar) {
        qnm.b(rirVar);
        this.a = rirVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (b == null) {
                    b = new FirebaseAnalytics(rir.d(context, null));
                }
            }
        }
        return b;
    }

    public static rnh getScionFrontendApiImplementation(Context context, Bundle bundle) {
        rir d = rir.d(context, bundle);
        if (d == null) {
            return null;
        }
        return new anwl(d);
    }

    public final void a(boolean z) {
        rir rirVar = this.a;
        rirVar.c(new rhs(rirVar, Boolean.valueOf(z)));
    }

    public String getFirebaseInstanceId() {
        try {
            return (String) rwd.e(aoak.b().a(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        rir rirVar = this.a;
        rirVar.c(new rhr(rirVar, activity, str, str2));
    }
}

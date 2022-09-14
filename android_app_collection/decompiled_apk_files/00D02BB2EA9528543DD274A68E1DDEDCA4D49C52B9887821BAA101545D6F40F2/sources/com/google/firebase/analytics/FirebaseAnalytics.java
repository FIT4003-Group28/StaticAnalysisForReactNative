package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics b;
    public final cosu a;

    public FirebaseAnalytics(cosu cosuVar) {
        cnwc.a(cosuVar);
        this.a = cosuVar;
    }

    public static cosz getApiImplementation(cosu cosuVar) {
        return new delf();
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (b == null) {
                    b = new FirebaseAnalytics(cosu.c(context, null));
                }
            }
        }
        return b;
    }

    public static cosz getScionFrontendApiImplementation(Context context, Bundle bundle) {
        cosu c = cosu.c(context, bundle);
        if (c == null) {
            return null;
        }
        return getApiImplementation(c);
    }

    public String getFirebaseInstanceId() {
        try {
            return (String) cpda.e(desy.getInstance().d(), 30000L, TimeUnit.MILLISECONDS);
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
        cosu cosuVar = this.a;
        cosuVar.a(new cosf(cosuVar, activity, str, str2));
    }
}

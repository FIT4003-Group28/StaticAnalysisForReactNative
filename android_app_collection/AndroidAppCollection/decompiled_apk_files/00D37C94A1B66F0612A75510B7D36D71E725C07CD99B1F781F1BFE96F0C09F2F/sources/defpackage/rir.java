package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: rir  reason: default package */
/* loaded from: classes4.dex */
public final class rir {
    private static volatile rir g;
    public final String a = "FA";
    protected final ExecutorService b;
    public final rhd c;
    public int d;
    public boolean e;
    public volatile rhg f;

    protected rir(Context context, Bundle bundle) {
        rqt rqtVar = rfl.a;
        this.b = rqt.d(new rid());
        this.c = new rhd(this);
        new ArrayList();
        try {
            if (rgf.p(context, rgf.n(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                    this.e = true;
                    Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        c(new rht(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new riq(this));
        }
    }

    public static rir d(Context context, Bundle bundle) {
        qnm.b(context);
        if (g == null) {
            synchronized (rir.class) {
                if (g == null) {
                    g = new rir(context, bundle);
                }
            }
        }
        return g;
    }

    public final void a(Exception exc, boolean z, boolean z2) {
        this.e |= z;
        if (z) {
            Log.w(this.a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            c(new ric(this, exc));
        }
        Log.w(this.a, "Error with data collection. Data lost.", exc);
    }

    public final void b(String str, String str2, Bundle bundle) {
        e(str, str2, bundle, true);
    }

    public final void c(rii riiVar) {
        this.b.execute(riiVar);
    }

    public final void e(String str, String str2, Bundle bundle, boolean z) {
        c(new rig(this, str, str2, bundle, z));
    }
}

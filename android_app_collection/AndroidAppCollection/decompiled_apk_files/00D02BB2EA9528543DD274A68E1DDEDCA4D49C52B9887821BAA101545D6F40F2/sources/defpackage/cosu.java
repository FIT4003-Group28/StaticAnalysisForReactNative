package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: cosu  reason: default package */
/* loaded from: classes5.dex */
public final class cosu {
    public static Boolean c;
    private static volatile cosu g;
    protected final ExecutorService a;
    public final corz b;
    public boolean d;
    protected final cnxn e = cnxn.a;
    public volatile cosb f;

    protected cosu(Context context, Bundle bundle) {
        coiz coizVar = coja.a;
        this.a = coiz.b(new cosi());
        this.b = new corz(this);
        new ArrayList();
        try {
            String a = cosv.a(context);
            cnwc.a(context);
            if (cosv.b(context.getResources(), TextUtils.isEmpty(a) ? cosv.a(context) : a) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                    this.d = true;
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        a(new cosg(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new cost(this));
    }

    public static cosu c(Context context, Bundle bundle) {
        cnwc.a(context);
        if (g == null) {
            synchronized (cosu.class) {
                if (g == null) {
                    g = new cosu(context, bundle);
                }
            }
        }
        return g;
    }

    public final void a(cosl coslVar) {
        this.a.execute(coslVar);
    }

    public final void b(Exception exc, boolean z, boolean z2) {
        this.d |= z;
        if (!z && z2) {
            a(new cosh(this, exc));
        }
    }

    public final void d(String str, String str2, Bundle bundle, boolean z) {
        a(new cosj(this, str, str2, bundle, z));
    }
}

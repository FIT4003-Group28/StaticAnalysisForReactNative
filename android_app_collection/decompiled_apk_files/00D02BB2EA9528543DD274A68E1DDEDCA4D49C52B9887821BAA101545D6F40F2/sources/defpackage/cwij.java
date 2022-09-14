package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
/* compiled from: PG */
/* renamed from: cwij  reason: default package */
/* loaded from: classes5.dex */
public final class cwij {
    public static Activity a(Context context) {
        dbsk.t(context, "context cannot be null");
        Activity activity = null;
        if (!(context instanceof Service) && !(context instanceof Application)) {
            int i = 0;
            while (true) {
                if (i < 1000) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                        i++;
                    } else {
                        activity = (Activity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (activity != null) {
            return activity;
        }
        throw new IllegalArgumentException("Could not extract activity from context");
    }
}

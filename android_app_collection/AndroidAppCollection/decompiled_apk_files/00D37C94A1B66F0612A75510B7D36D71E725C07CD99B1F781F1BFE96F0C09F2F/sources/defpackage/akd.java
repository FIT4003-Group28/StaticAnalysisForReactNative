package defpackage;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: akd  reason: default package */
/* loaded from: classes.dex */
public class akd {
    public static void b(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, null);
    }

    public static void c(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static akd d(Context context, int i, int i2) {
        return new ajo(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    public Bundle a() {
        throw null;
    }
}

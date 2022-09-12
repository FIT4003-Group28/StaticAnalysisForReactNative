package defpackage;

import android.content.Context;
import android.os.Build;
/* compiled from: PG */
/* renamed from: axrg  reason: default package */
/* loaded from: classes.dex */
public final class axrg implements axru {
    private final Context a;

    public axrg(Context context) {
        this.a = context;
    }

    @Override // defpackage.axru
    public final boolean a(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        return (Build.VERSION.SDK_INT < 29 && (str.equals("android.permission.ACCESS_BACKGROUND_LOCATION") || str.equals("android.permission.ACTIVITY_RECOGNITION"))) || akm.d(this.a, str) == 0;
    }
}

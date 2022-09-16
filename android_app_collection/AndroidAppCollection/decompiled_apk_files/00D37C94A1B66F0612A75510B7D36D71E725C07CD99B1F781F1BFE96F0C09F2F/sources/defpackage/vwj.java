package defpackage;

import android.app.Activity;
import android.content.Context;
/* compiled from: PG */
/* renamed from: vwj  reason: default package */
/* loaded from: classes4.dex */
public final class vwj {
    public final Context a;

    public vwj(Context context) {
        this.a = context;
    }

    public static final void a(Activity activity) {
        vwl.c(activity, 42, vwl.b(vwh.a, new vwh[0]), "com.google.android.apps.wellbeing.action.REQUEST_ACCESS");
    }

    public static final void b(Activity activity) {
        vwl.c(activity, 43, vwl.b(vwh.a, new vwh[0]), "com.google.android.apps.wellbeing.action.WITHDRAW_ACCESS");
    }
}

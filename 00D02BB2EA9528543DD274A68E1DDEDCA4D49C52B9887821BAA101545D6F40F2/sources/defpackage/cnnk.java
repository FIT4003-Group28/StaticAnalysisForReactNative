package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: cnnk  reason: default package */
/* loaded from: classes5.dex */
public final class cnnk extends cnnl {
    public static final /* synthetic */ int a = 0;

    @Deprecated
    public static Dialog a(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (true == cnnl.j(activity, i)) {
            i = 18;
        }
        return cnmq.a.a(activity, i, i2, onCancelListener);
    }

    @Deprecated
    public static void b(int i, Context context) {
        cnmq cnmqVar = cnmq.a;
        if (!cnnl.j(context, i) && (i != 9 || !cnnl.k(context, "com.android.vending"))) {
            cnmqVar.b(context, i);
        } else {
            cnmqVar.f(context);
        }
    }
}

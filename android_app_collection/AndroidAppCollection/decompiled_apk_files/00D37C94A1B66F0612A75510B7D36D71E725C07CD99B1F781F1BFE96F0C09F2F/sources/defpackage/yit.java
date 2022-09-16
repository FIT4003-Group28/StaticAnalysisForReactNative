package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: yit  reason: default package */
/* loaded from: classes4.dex */
public final class yit extends yjj {
    private final Activity b;

    private yit(Activity activity, yiw yiwVar) {
        super(yiwVar);
        activity.getClass();
        this.b = activity;
    }

    public static yit c(Activity activity, yiw yiwVar) {
        return new yit(activity, yiwVar);
    }

    @Override // defpackage.yjj
    protected final void d(Runnable runnable) {
        this.b.runOnUiThread(runnable);
    }
}

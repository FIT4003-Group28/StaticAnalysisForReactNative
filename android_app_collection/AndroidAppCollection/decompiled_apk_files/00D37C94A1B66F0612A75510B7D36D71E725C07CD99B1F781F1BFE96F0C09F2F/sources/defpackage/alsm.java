package defpackage;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: alsm  reason: default package */
/* loaded from: classes.dex */
public final class alsm {
    public static final alrz a = new alrz("ReviewService");
    public alsy b;
    public final String c;

    public alsm(Context context) {
        this.c = context.getPackageName();
        if (alvk.a(context)) {
            this.b = new alsy(context, a, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), alsd.c);
        }
    }
}

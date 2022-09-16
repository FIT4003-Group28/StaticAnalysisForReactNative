package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: qyr  reason: default package */
/* loaded from: classes4.dex */
public final class qyr {
    private static final qyr a = new qyr();
    private qyq b = null;

    public static qyq b(Context context) {
        return a.a(context);
    }

    public final synchronized qyq a(Context context) {
        if (this.b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.b = new qyq(context);
        }
        return this.b;
    }
}

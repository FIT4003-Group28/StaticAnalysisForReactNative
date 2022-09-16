package defpackage;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: vji  reason: default package */
/* loaded from: classes4.dex */
public final class vji {
    public static final amqf a = amqf.c(".");

    public static vjh a(Context context) {
        return new vjh(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return TextUtils.equals(str, "*.lease");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(String str) {
        return str.endsWith(".lease");
    }
}

package defpackage;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: zdy  reason: default package */
/* loaded from: classes4.dex */
public final class zdy {
    public final String a;
    public final String b;
    public final int c;

    public zdy(String str, String str2) {
        this(str, str2, 0);
    }

    public zdy(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public static zdy a(Context context, int i, Object... objArr) {
        return b(context, 0, i, objArr);
    }

    public static zdy b(Context context, int i, int i2, Object... objArr) {
        return new zdy(context.getString(i2, objArr), c(context, i2, objArr), i);
    }

    public static String c(Context context, int i, Object... objArr) {
        String str;
        if (objArr.length > 0) {
            String valueOf = String.valueOf(TextUtils.join("_", objArr));
            str = valueOf.length() != 0 ? "_".concat(valueOf) : new String("_");
        } else {
            str = "";
        }
        String valueOf2 = String.valueOf(context.getResources().getResourceEntryName(i));
        String valueOf3 = String.valueOf(str);
        return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
    }
}

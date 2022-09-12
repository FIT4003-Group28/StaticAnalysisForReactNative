package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
/* compiled from: PG */
/* renamed from: deon  reason: default package */
/* loaded from: classes6.dex */
public abstract class deon {
    public static deon getInstance(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new deom(context);
        }
        return new deol(context);
    }

    public abstract void a(String str, Uri uri);
}

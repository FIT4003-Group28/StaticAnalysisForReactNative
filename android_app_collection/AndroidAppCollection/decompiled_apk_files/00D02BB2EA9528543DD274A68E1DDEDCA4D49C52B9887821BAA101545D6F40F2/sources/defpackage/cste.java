package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cste  reason: default package */
/* loaded from: classes5.dex */
public final class cste {
    public static boolean a(Context context) {
        return b(context) && context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static boolean b(Context context) {
        return (context.getApplicationInfo().flags & 4194304) == 4194304;
    }
}

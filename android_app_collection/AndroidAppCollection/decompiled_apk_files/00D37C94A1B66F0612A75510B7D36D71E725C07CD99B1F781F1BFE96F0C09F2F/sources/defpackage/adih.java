package defpackage;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: adih  reason: default package */
/* loaded from: classes.dex */
public class adih {
    public static boolean b(String str) {
        return !str.equals("cl");
    }

    public static /* synthetic */ String c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "DISABLED" : "ENABLED" : "UNSUPPORTED";
    }

    public static Intent d(Context context, boolean z) {
        Intent className = new Intent().setClassName(context, "com.google.android.libraries.youtube.mdx.manualpairing.PairWithTvActivity");
        className.putExtra("com.google.android.libraries.youtube.mdx.manualpairing.darkTheme", z);
        return className;
    }

    public boolean a() {
        return true;
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.libraries.onegoogle.accountmanagement.AddAccountActivity;
/* compiled from: PG */
/* renamed from: umr  reason: default package */
/* loaded from: classes4.dex */
public final class umr {
    public static /* synthetic */ void a(View view) {
        Context context = view.getContext();
        aqxo.q(uuo.h(context) != null, "An Activity Context is required to starts a new Add Account Activity");
        context.startActivity(new Intent(context, AddAccountActivity.class));
    }

    public static void b(Runnable runnable) {
        if (uwp.j()) {
            runnable.run();
        } else {
            uwp.h(runnable);
        }
    }

    public static int c(String str, String str2, int i) {
        if (str2 == null) {
            str2 = "NO_ACTION";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17 + str2.length());
        sb.append(str);
        sb.append(":e:");
        sb.append(i);
        sb.append(":a:");
        sb.append(str2);
        return sb.toString().hashCode();
    }

    public static String d(String str, String str2) {
        if (str == null) {
            str = "Anonymous";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("::");
        sb.append(str2);
        return sb.toString();
    }

    public static String e(String str, String str2) {
        if (str == null) {
            str = "Anonymous";
        }
        StringBuilder sb = new StringBuilder(str.length() + 11 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("::SUMMARY::");
        sb.append(str2);
        return sb.toString();
    }
}

package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.view.accessibility.AccessibilityManager;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: umn  reason: default package */
/* loaded from: classes4.dex */
public final class umn {
    public static boolean a(Context context) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return (accessibilityManager == null || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || enabledAccessibilityServiceList.isEmpty()) ? false : true;
    }

    public static float b(DisplayMetrics displayMetrics, int i) {
        return i * displayMetrics.density;
    }

    public static int c(DisplayMetrics displayMetrics, int i) {
        return (int) b(displayMetrics, i);
    }

    public static boolean d(Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.isMaterialTheme, R.attr.colorPrimaryGoogle});
        boolean z = false;
        try {
            if (obtainStyledAttributes.getBoolean(0, false)) {
                if (obtainStyledAttributes.hasValue(1)) {
                    z = true;
                }
            }
            return z;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static aojl e(Intent intent) {
        return aojl.a(intent.getIntExtra("com.google.android.libraries.notifications.INTENT_EXTRA_REMOVE_REASON", 0));
    }

    public static aomr f(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE");
        if (byteArrayExtra != null) {
            try {
                return (aomr) aopi.parseFrom(aomr.a, byteArrayExtra, aoos.b());
            } catch (aopx e) {
                uev.c("IntentExtrasHelper", e, "Unable to parse ThreadStateUpdate message", new Object[0]);
            }
        }
        return aomr.a;
    }

    public static String g(Intent intent) {
        return intent.getStringExtra("com.google.android.libraries.notifications.ACCOUNT_NAME");
    }

    public static String h(Intent intent) {
        return intent.getStringExtra("com.google.android.libraries.notifications.ACTION_ID");
    }

    public static String i(Intent intent) {
        return intent.getStringExtra("com.google.android.libraries.notifications.GROUP_ID");
    }

    public static String j(Intent intent) {
        return intent.getStringExtra("com.google.android.libraries.notifications.THREAD_ID");
    }

    public static void k(Intent intent, ucp ucpVar) {
        String str;
        if (ucpVar == null || (str = ucpVar.b) == null) {
            return;
        }
        intent.putExtra("com.google.android.libraries.notifications.ACCOUNT_NAME", str);
    }

    public static void l(Intent intent, String str) {
        if (str != null) {
            intent.putExtra("com.google.android.libraries.notifications.ACTION_ID", str);
        }
    }

    public static void m(Intent intent, int i) {
        intent.putExtra("com.google.android.libraries.notifications.EVENT_TYPE", i);
    }

    public static void n(Intent intent, ucw ucwVar) {
        String str;
        if (ucwVar == null || (str = ucwVar.j) == null) {
            return;
        }
        intent.putExtra("com.google.android.libraries.notifications.GROUP_ID", str);
    }

    public static void o(Intent intent, uip uipVar) {
        if (uipVar != null) {
            intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_LOCAL_THREAD_STATE", uipVar.toByteArray());
        }
    }

    public static void p(Intent intent, aojl aojlVar) {
        intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_REMOVE_REASON", aojlVar.l);
    }

    public static void q(Intent intent, ucw ucwVar) {
        String str;
        if (ucwVar == null || (str = ucwVar.a) == null) {
            return;
        }
        intent.putExtra("com.google.android.libraries.notifications.THREAD_ID", str);
    }

    public static void r(Intent intent, aomr aomrVar) {
        if (aomrVar != null) {
            intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE", aomrVar.toByteArray());
        }
    }

    public static int s(Intent intent) {
        return intent.getIntExtra("com.google.android.libraries.notifications.EVENT_TYPE", 0);
    }
}

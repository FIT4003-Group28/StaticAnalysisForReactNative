package g.a.a.d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class a {
    public static List<ResolveInfo> a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null ? queryBroadcastReceivers : Collections.emptyList();
    }

    public static void b(Context context, Intent intent) {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent2 = new Intent(intent);
            intent2.setAction("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE");
            try {
                c(context, intent2);
                z = true;
            } catch (g.a.a.b unused) {
            }
        }
        if (z) {
            return;
        }
        c(context, intent);
    }

    public static void c(Context context, Intent intent) {
        List<ResolveInfo> a2 = a(context, intent);
        if (a2.size() == 0) {
            throw new g.a.a.b("unable to resolve intent: " + intent.toString());
        }
        for (ResolveInfo resolveInfo : a2) {
            Intent intent2 = new Intent(intent);
            if (resolveInfo != null) {
                intent2.setPackage(resolveInfo.resolvePackageName);
                context.sendBroadcast(intent2);
            }
        }
    }
}

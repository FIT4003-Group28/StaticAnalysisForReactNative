package g.a.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;
import me.leolin.shortcutbadger.impl.d;
import me.leolin.shortcutbadger.impl.e;
import me.leolin.shortcutbadger.impl.f;
import me.leolin.shortcutbadger.impl.g;
import me.leolin.shortcutbadger.impl.h;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final List<Class<? extends a>> f10124a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    private static a f10125b;

    /* renamed from: c  reason: collision with root package name */
    private static ComponentName f10126c;

    static {
        f10124a.add(AdwHomeBadger.class);
        f10124a.add(ApexHomeBadger.class);
        f10124a.add(DefaultBadger.class);
        f10124a.add(NewHtcHomeBadger.class);
        f10124a.add(NovaHomeBadger.class);
        f10124a.add(SonyHomeBadger.class);
        f10124a.add(me.leolin.shortcutbadger.impl.a.class);
        f10124a.add(me.leolin.shortcutbadger.impl.c.class);
        f10124a.add(d.class);
        f10124a.add(e.class);
        f10124a.add(h.class);
        f10124a.add(f.class);
        f10124a.add(g.class);
        f10124a.add(me.leolin.shortcutbadger.impl.b.class);
    }

    private static boolean a(Context context) {
        a aVar;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        f10126c = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
            String str = resolveInfo.activityInfo.packageName;
            Iterator<Class<? extends a>> it = f10124a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    aVar = it.next().newInstance();
                } catch (Exception unused) {
                    aVar = null;
                }
                if (aVar != null && aVar.a().contains(str)) {
                    f10125b = aVar;
                    break;
                }
            }
            if (f10125b != null) {
                break;
            }
        }
        if (f10125b != null) {
            return true;
        }
        f10125b = Build.MANUFACTURER.equalsIgnoreCase("ZUK") ? new h() : Build.MANUFACTURER.equalsIgnoreCase("OPPO") ? new d() : Build.MANUFACTURER.equalsIgnoreCase("VIVO") ? new f() : Build.MANUFACTURER.equalsIgnoreCase("ZTE") ? new g() : new DefaultBadger();
        return true;
    }

    public static boolean a(Context context, int i) {
        try {
            b(context, i);
            return true;
        } catch (b e2) {
            if (!Log.isLoggable("ShortcutBadger", 3)) {
                return false;
            }
            Log.d("ShortcutBadger", "Unable to execute badge", e2);
            return false;
        }
    }

    public static void b(Context context, int i) {
        if (f10125b != null || a(context)) {
            try {
                f10125b.a(context, f10126c, i);
                return;
            } catch (Exception e2) {
                throw new b("Unable to execute badge", e2);
            }
        }
        throw new b("No default launcher available");
    }
}

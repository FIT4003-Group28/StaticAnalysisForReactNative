package defpackage;

import android.content.ComponentName;
import android.content.Context;
/* compiled from: PG */
/* renamed from: bhe  reason: default package */
/* loaded from: classes3.dex */
public final class bhe {
    static {
        bbz.f("PackageManagerHelper");
    }

    public static void a(Context context, Class<?> cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), true != z ? 2 : 1, 1);
            bbz.e().a(new Throwable[0]);
        } catch (Exception e) {
            bbz.e().a(e);
        }
    }
}

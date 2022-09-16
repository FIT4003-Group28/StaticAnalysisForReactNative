package defpackage;

import android.content.ComponentName;
import android.content.Context;
/* compiled from: PG */
/* renamed from: bvi  reason: default package */
/* loaded from: classes2.dex */
public final class bvi {
    static {
        bqf.b("PackageManagerHelper");
    }

    public static void a(Context context, Class cls, boolean z) {
        String str = "disabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), true != z ? 2 : 1, 1);
            bqf a = bqf.a();
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = true != z ? str : "enabled";
            String.format("%s %s", objArr);
            a.d(new Throwable[0]);
        } catch (Exception e) {
            bqf a2 = bqf.a();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (true == z) {
                str = "enabled";
            }
            objArr2[1] = str;
            String.format("%s could not be %s", objArr2);
            a2.d(e);
        }
    }
}

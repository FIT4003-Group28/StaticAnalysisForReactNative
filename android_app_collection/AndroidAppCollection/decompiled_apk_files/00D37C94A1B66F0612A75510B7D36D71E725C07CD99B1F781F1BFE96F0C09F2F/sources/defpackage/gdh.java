package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
/* compiled from: PG */
/* renamed from: gdh  reason: default package */
/* loaded from: classes3.dex */
public final class gdh {
    private final Context a;
    private final aadd b;
    private final azqb c;

    public gdh(Context context, aadd aaddVar, azqb azqbVar) {
        this.a = context;
        this.b = aaddVar;
        this.c = azqbVar;
    }

    public final ankt a() {
        if (((AppOpsManager) this.a.getSystemService("appops")).checkOpNoThrow("android:picture_in_picture", Process.myUid(), this.a.getPackageName()) == 2) {
            return anlz.q(gdg.SYSTEM_DISABLED);
        }
        return anii.h(((fnn) this.c.get()).a(), fuj.m, anjk.a);
    }

    public final int b() {
        if (Build.VERSION.SDK_INT < 26 || !this.a.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
            return 1;
        }
        arhd a = this.b.a();
        if (a == null) {
            return 2;
        }
        asxp asxpVar = a.e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        return asxpVar.m ? 3 : 2;
    }
}

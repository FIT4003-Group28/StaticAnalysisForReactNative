package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: alri  reason: default package */
/* loaded from: classes.dex */
public final class alri {
    public static final alrz a = new alrz("AppUpdateService");
    private static final Intent f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    public alsy b;
    public final String c;
    public final Context d;
    public final alrj e;

    public alri(Context context, alrj alrjVar) {
        this.c = context.getPackageName();
        this.d = context;
        this.e = alrjVar;
        if (alvk.a(context)) {
            this.b = new alsy(akpq.m(context), a, "AppUpdateService", f, alsd.b);
        }
    }

    public static int a(Bundle bundle) {
        return bundle.getInt("error.code", -2);
    }

    public static Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putAll(alro.a("app_update"));
        bundle.putInt("playcore.version.code", 11001);
        return bundle;
    }

    public static alvd c() {
        a.a("onError(%d)", -9);
        return anqx.i(new alrs(-9));
    }
}

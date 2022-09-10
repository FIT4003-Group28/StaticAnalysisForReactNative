package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: damc  reason: default package */
/* loaded from: classes5.dex */
public final class damc {
    public static final daii a = new daii("SplitInstallService");
    private static final Intent d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    public final String b;
    dair<damj> c;

    public damc(Context context) {
        this.b = context.getPackageName();
        if (dann.a(context)) {
            this.c = new dair<>(dank.a(context), a, d, dalu.a);
        }
    }

    public static ArrayList<Bundle> a(Collection<String> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        for (String str : collection) {
            Bundle bundle = new Bundle();
            bundle.putString("language", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10804);
        return bundle;
    }

    public static <T> danb<T> c() {
        a.b("onError(%d)", -14);
        return danj.b(new dalb(-14));
    }
}

package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: bwbc  reason: default package */
/* loaded from: classes4.dex */
public final class bwbc extends aht {
    private final Map<UUID, bvvp> a = new HashMap();

    public bwbc(bwbd bwbdVar) {
        int i = deig.a;
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("com.android.chrome");
        PackageManager packageManager = bwbdVar.a.getPackageManager();
        new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str : arrayList) {
            intent.setPackage(str);
            if (packageManager.resolveService(intent, 0) != null) {
                return;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = deig.a;
        Iterator<bvvp> it = this.a.values().iterator();
        if (!it.hasNext()) {
            return;
        }
        it.next();
        throw null;
    }
}

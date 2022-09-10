package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: PG */
/* renamed from: bdqc  reason: default package */
/* loaded from: classes3.dex */
public final class bdqc implements bdqb {
    private static final LinkedHashMap<String, Integer> b;
    private final bcpe a;

    static {
        LinkedHashMap<String, Integer> h = dcjz.h();
        b = h;
        h.put("com.google.android.apps.photos", 2131232843);
        h.put("com.google.android.gallery3d", 2131232842);
    }

    public bdqc(bcpe bcpeVar) {
        this.a = bcpeVar;
    }

    static final ComponentName c(Intent intent, PackageManager packageManager) {
        ResolveInfo resolveInfo;
        HashMap d = dcjz.d();
        for (ResolveInfo resolveInfo2 : packageManager.queryIntentActivities(intent, 0)) {
            d.put(resolveInfo2.activityInfo.packageName, resolveInfo2);
        }
        Iterator<String> it = b.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                resolveInfo = null;
                break;
            }
            String next = it.next();
            if (d.containsKey(next)) {
                resolveInfo = (ResolveInfo) d.get(next);
                break;
            }
        }
        if (resolveInfo == null) {
            return null;
        }
        return new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
    }

    private static Intent d() {
        Intent intent = new Intent("android.intent.action.EDIT");
        intent.setFlags(1);
        intent.setType("image/*");
        return intent;
    }

    @Override // defpackage.bdqb
    public final boolean a(PackageManager packageManager) {
        return c(d(), packageManager) != null;
    }

    @Override // defpackage.bdqb
    public final Intent b(Context context, Uri uri, bduq bduqVar) {
        bvrj.UI_THREAD.d();
        Intent d = d();
        ComponentName c = c(d, context.getPackageManager());
        d.setComponent(c);
        if (c == null) {
            return null;
        }
        if (c.getPackageName().contains("com.google.android.apps.photos")) {
            Uri c2 = bduqVar.c(uri);
            if (c2 == null) {
                c2 = uri;
            }
            d.putExtra("output", c2);
        } else if (c.getPackageName().contains("com.google.android.gallery3d")) {
            Uri b2 = this.a.b(uri);
            if (b2 != null) {
                uri = b2;
            }
        } else {
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        d.setDataAndType(uri, "image/*");
        return d;
    }
}

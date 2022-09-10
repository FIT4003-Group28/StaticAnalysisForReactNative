package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.sdk.android.authentication.AuthCallbackActivity;
import com.spotify.sdk.android.authentication.AuthenticationRequest;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dxia  reason: default package */
/* loaded from: classes6.dex */
public final class dxia implements dxhu {
    private static final Set<String> a = new HashSet(Arrays.asList("com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.google.android.apps.chrome"));
    private static final int b = Color.rgb(30, 215, 96);

    @Override // defpackage.dxhu
    public final boolean a(Activity activity, AuthenticationRequest authenticationRequest) {
        List<ResolveInfo> queryIntentServices = activity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        String str = null;
        if (queryIntentServices != null) {
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                if (a.contains(next.serviceInfo.packageName)) {
                    str = next.serviceInfo.packageName;
                    break;
                }
            }
        }
        if (str == null) {
            return false;
        }
        String str2 = authenticationRequest.c;
        PackageManager packageManager = activity.getPackageManager();
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(Uri.parse(str2));
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        if (queryIntentActivities != null && queryIntentActivities.size() == 1) {
            if (AuthCallbackActivity.class.getName().equals(queryIntentActivities.get(0).activityInfo.name)) {
                IntentFilter intentFilter = queryIntentActivities.get(0).filter;
                String dataScheme = intentFilter.getDataScheme(0);
                String host = intentFilter.getDataAuthority(0).getHost();
                if (!TextUtils.isEmpty(dataScheme) || !TextUtils.isEmpty(host)) {
                    ahr ahrVar = new ahr();
                    ahrVar.c(b);
                    ahs a2 = ahrVar.a();
                    a2.a.setPackage(str);
                    a2.a(activity, authenticationRequest.a());
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dxhu
    public final void b() {
    }

    @Override // defpackage.dxhu
    public final void c(dxhs dxhsVar) {
    }
}

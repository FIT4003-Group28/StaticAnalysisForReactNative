package com.google.android.libraries.social.peoplekit.thirdparty.viewcontrollers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.HashSet;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ThirdPartyReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"android.intent.action.PACKAGE_FULLY_REMOVED".equals(intent.getAction()) && (!"android.intent.action.PACKAGE_REMOVED".equals(intent.getAction()) || intent.getBooleanExtra("android.intent.extra.REPLACING", false))) {
            for (String str : intent.getExtras().keySet()) {
                if (intent.getExtras().get(str) instanceof ComponentName) {
                    ComponentName componentName = (ComponentName) intent.getExtras().get(str);
                    String className = componentName.getClassName();
                    String packageName = componentName.getPackageName();
                    StringBuilder sb = new StringBuilder(String.valueOf(className).length() + 1 + String.valueOf(packageName).length());
                    sb.append(className);
                    sb.append(" ");
                    sb.append(packageName);
                    String sb2 = sb.toString();
                    new cxwr(context).a(sb2);
                    new cxww(context).a(sb2);
                }
            }
            return;
        }
        String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
        cxwr cxwrVar = new cxwr(context);
        SharedPreferences.Editor edit = cxwrVar.a.edit();
        for (String str2 : cxwrVar.a.getStringSet(schemeSpecificPart, new HashSet())) {
            edit.remove(str2);
        }
        edit.remove(schemeSpecificPart);
        edit.commit();
        cxww cxwwVar = new cxww(context);
        SharedPreferences.Editor edit2 = cxwwVar.a.edit();
        for (String str3 : cxwwVar.a.getStringSet(schemeSpecificPart, new HashSet())) {
            edit2.remove(str3);
        }
        edit2.remove(schemeSpecificPart);
        edit2.commit();
    }
}

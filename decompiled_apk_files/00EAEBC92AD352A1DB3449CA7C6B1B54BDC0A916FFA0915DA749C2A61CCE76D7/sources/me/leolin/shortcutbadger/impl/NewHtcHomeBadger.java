package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class NewHtcHomeBadger implements g.a.a.a {
    @Override // g.a.a.a
    public List<String> a() {
        return Collections.singletonList("com.htc.launcher");
    }

    @Override // g.a.a.a
    public void a(Context context, ComponentName componentName, int i) {
        boolean z;
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i);
        boolean z2 = false;
        try {
            g.a.a.d.a.c(context, intent);
            z = true;
        } catch (g.a.a.b unused) {
            z = false;
        }
        try {
            g.a.a.d.a.c(context, intent2);
            z2 = true;
        } catch (g.a.a.b unused2) {
        }
        if (z || z2) {
            return;
        }
        throw new g.a.a.b("unable to resolve intent: " + intent2.toString());
    }
}

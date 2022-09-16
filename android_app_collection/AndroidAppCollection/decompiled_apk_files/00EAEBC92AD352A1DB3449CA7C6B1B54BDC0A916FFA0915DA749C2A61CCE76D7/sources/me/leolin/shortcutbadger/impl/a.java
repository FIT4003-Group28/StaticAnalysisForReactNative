package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class a implements g.a.a.a {
    @Override // g.a.a.a
    public List<String> a() {
        return Arrays.asList("com.asus.launcher");
    }

    @Override // g.a.a.a
    public void a(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        intent.putExtra("badge_vip_count", 0);
        g.a.a.d.a.b(context, intent);
    }
}

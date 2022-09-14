package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class ApexHomeBadger implements g.a.a.a {
    @Override // g.a.a.a
    public List<String> a() {
        return Arrays.asList("com.anddoes.launcher");
    }

    @Override // g.a.a.a
    public void a(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("class", componentName.getClassName());
        g.a.a.d.a.c(context, intent);
    }
}

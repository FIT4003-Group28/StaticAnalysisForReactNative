package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class g implements g.a.a.a {
    @Override // g.a.a.a
    public List<String> a() {
        return new ArrayList(0);
    }

    @Override // g.a.a.a
    public void a(Context context, ComponentName componentName, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        bundle.putString("app_badge_component_name", componentName.flattenToString());
        if (Build.VERSION.SDK_INT >= 11) {
            context.getContentResolver().call(Uri.parse("content://com.android.launcher3.cornermark.unreadbadge"), "setAppUnreadCount", (String) null, bundle);
        }
    }
}

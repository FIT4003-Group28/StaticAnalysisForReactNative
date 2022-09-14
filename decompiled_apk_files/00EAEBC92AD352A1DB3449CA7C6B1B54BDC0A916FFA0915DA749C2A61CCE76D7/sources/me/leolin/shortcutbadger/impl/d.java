package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class d implements g.a.a.a {

    /* renamed from: a  reason: collision with root package name */
    private int f10360a = -1;

    @TargetApi(11)
    private void a(Context context, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
    }

    private void b(Context context, ComponentName componentName, int i) {
        if (i == 0) {
            i = -1;
        }
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("pakeageName", componentName.getPackageName());
        intent.putExtra("number", i);
        intent.putExtra("upgradeNumber", i);
        g.a.a.d.a.c(context, intent);
    }

    @Override // g.a.a.a
    public List<String> a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // g.a.a.a
    public void a(Context context, ComponentName componentName, int i) {
        if (this.f10360a == i) {
            return;
        }
        this.f10360a = i;
        if (Build.VERSION.SDK_INT >= 11) {
            a(context, i);
        } else {
            b(context, componentName, i);
        }
    }
}

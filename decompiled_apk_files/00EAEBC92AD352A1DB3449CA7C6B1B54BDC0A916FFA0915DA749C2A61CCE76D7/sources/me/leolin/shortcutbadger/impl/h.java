package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class h implements g.a.a.a {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f10363a = Uri.parse("content://com.android.badge/badge");

    @Override // g.a.a.a
    public List<String> a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // g.a.a.a
    @TargetApi(11)
    public void a(Context context, ComponentName componentName, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.f10363a, "setAppBadgeCount", (String) null, bundle);
    }
}

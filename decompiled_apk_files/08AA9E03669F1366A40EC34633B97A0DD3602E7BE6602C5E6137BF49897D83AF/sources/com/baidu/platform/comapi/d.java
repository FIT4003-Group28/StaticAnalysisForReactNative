package com.baidu.platform.comapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.baidu.platform.comapi.util.f;
/* loaded from: classes.dex */
public class d extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1997a = "d";

    public void a(Context context) {
        String c2 = com.baidu.platform.comapi.util.c.c(context);
        if (!f.d().equals(c2)) {
            f.a(c2);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context);
        com.baidu.platform.comapi.util.c.a(context);
    }
}

package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* loaded from: classes.dex */
public final class c0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private Context f6847a;

    /* renamed from: b  reason: collision with root package name */
    private final b0 f6848b;

    public c0(b0 b0Var) {
        this.f6848b = b0Var;
    }

    public final synchronized void a() {
        if (this.f6847a != null) {
            this.f6847a.unregisterReceiver(this);
        }
        this.f6847a = null;
    }

    public final void a(Context context) {
        this.f6847a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f6848b.a();
            a();
        }
    }
}

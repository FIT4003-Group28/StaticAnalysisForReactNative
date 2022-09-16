package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k4 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final r9 f7417a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f7418b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7419c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k4(r9 r9Var) {
        com.google.android.gms.common.internal.s.a(r9Var);
        this.f7417a = r9Var;
    }

    public final void a() {
        this.f7417a.o();
        this.f7417a.a().g();
        if (this.f7418b) {
            return;
        }
        this.f7417a.d().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f7419c = this.f7417a.h().t();
        this.f7417a.c().B().a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f7419c));
        this.f7418b = true;
    }

    public final void b() {
        this.f7417a.o();
        this.f7417a.a().g();
        this.f7417a.a().g();
        if (!this.f7418b) {
            return;
        }
        this.f7417a.c().B().a("Unregistering connectivity change receiver");
        this.f7418b = false;
        this.f7419c = false;
        try {
            this.f7417a.d().unregisterReceiver(this);
        } catch (IllegalArgumentException e2) {
            this.f7417a.c().s().a("Failed to unregister the network broadcast receiver", e2);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f7417a.o();
        String action = intent.getAction();
        this.f7417a.c().B().a("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f7417a.c().v().a("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean t = this.f7417a.h().t();
        if (this.f7419c == t) {
            return;
        }
        this.f7419c = t;
        this.f7417a.a().a(new n4(this, t));
    }
}

package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4994a;

    /* renamed from: b  reason: collision with root package name */
    private final b f4995b;

    /* loaded from: classes.dex */
    private class b extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private final n f4996a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f4997b;

        private b(n nVar) {
            this.f4996a = nVar;
        }

        public void a(Context context) {
            if (!this.f4997b) {
                c.b.a.a.a.c("BillingBroadcastManager", "Receiver is not registered.");
                return;
            }
            context.unregisterReceiver(c.this.f4995b);
            this.f4997b = false;
        }

        public void a(Context context, IntentFilter intentFilter) {
            if (!this.f4997b) {
                context.registerReceiver(c.this.f4995b, intentFilter);
                this.f4997b = true;
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            this.f4996a.onPurchasesUpdated(c.b.a.a.a.a(intent, "BillingBroadcastManager"), c.b.a.a.a.a(intent.getExtras()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, n nVar) {
        this.f4994a = context;
        this.f4995b = new b(nVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f4995b.a(this.f4994a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n b() {
        return this.f4995b.f4996a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f4995b.a(this.f4994a, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
    }
}

package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.Purchase;
/* loaded from: classes.dex */
public abstract class d {

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f4999a;

        /* renamed from: b  reason: collision with root package name */
        private int f5000b;

        /* renamed from: c  reason: collision with root package name */
        private int f5001c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f5002d;

        /* renamed from: e  reason: collision with root package name */
        private n f5003e;

        private b(Context context) {
            this.f5000b = 0;
            this.f5001c = 0;
            this.f4999a = context;
        }

        public b a(n nVar) {
            this.f5003e = nVar;
            return this;
        }

        public d a() {
            Context context = this.f4999a;
            if (context != null) {
                n nVar = this.f5003e;
                if (nVar == null) {
                    throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
                }
                boolean z = this.f5002d;
                if (!z) {
                    throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
                }
                return new e(context, this.f5000b, this.f5001c, z, nVar);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        public b b() {
            this.f5002d = true;
            return this;
        }
    }

    public static b a(Context context) {
        return new b(context);
    }

    public abstract Purchase.a a(String str);

    public abstract h a(Activity activity, g gVar);

    public abstract void a();

    public abstract void a(com.android.billingclient.api.a aVar, com.android.billingclient.api.b bVar);

    public abstract void a(f fVar);

    public abstract void a(j jVar, k kVar);

    public abstract void a(o oVar, p pVar);

    public abstract void a(String str, m mVar);

    public abstract boolean b();
}

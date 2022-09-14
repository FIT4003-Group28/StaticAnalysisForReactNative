package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f7029a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static j f7030b;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f7031a;

        /* renamed from: b  reason: collision with root package name */
        private final String f7032b;

        /* renamed from: c  reason: collision with root package name */
        private final ComponentName f7033c;

        /* renamed from: d  reason: collision with root package name */
        private final int f7034d;

        public a(String str, String str2, int i) {
            s.b(str);
            this.f7031a = str;
            s.b(str2);
            this.f7032b = str2;
            this.f7033c = null;
            this.f7034d = i;
        }

        public final ComponentName a() {
            return this.f7033c;
        }

        public final Intent a(Context context) {
            String str = this.f7031a;
            return str != null ? new Intent(str).setPackage(this.f7032b) : new Intent().setComponent(this.f7033c);
        }

        public final String b() {
            return this.f7032b;
        }

        public final int c() {
            return this.f7034d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return r.a(this.f7031a, aVar.f7031a) && r.a(this.f7032b, aVar.f7032b) && r.a(this.f7033c, aVar.f7033c) && this.f7034d == aVar.f7034d;
        }

        public final int hashCode() {
            return r.a(this.f7031a, this.f7032b, this.f7033c, Integer.valueOf(this.f7034d));
        }

        public final String toString() {
            String str = this.f7031a;
            return str == null ? this.f7033c.flattenToString() : str;
        }
    }

    public static j a(Context context) {
        synchronized (f7029a) {
            if (f7030b == null) {
                f7030b = new h0(context.getApplicationContext());
            }
        }
        return f7030b;
    }

    public final void a(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        b(new a(str, str2, i), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean a(a aVar, ServiceConnection serviceConnection, String str);

    protected abstract void b(a aVar, ServiceConnection serviceConnection, String str);
}

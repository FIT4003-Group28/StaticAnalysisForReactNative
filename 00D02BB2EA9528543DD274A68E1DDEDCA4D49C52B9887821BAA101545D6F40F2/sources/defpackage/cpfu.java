package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
/* compiled from: PG */
/* renamed from: cpfu  reason: default package */
/* loaded from: classes5.dex */
public abstract class cpfu<T> {
    private final Context a;
    private final String c;
    private final String d;
    private T g;
    private final Object b = new Object();
    private boolean e = false;
    private boolean f = false;

    public cpfu(Context context, String str) {
        this.a = context;
        this.c = str.length() != 0 ? "com.google.android.gms.vision.dynamite.".concat(str) : new String("com.google.android.gms.vision.dynamite.");
        this.d = str;
    }

    protected abstract void a();

    protected abstract T b(cobp cobpVar, Context context);

    public final boolean c() {
        return e() != null;
    }

    public final void d() {
        synchronized (this.b) {
            if (this.g == null) {
                return;
            }
            try {
                a();
            } catch (RemoteException unused) {
            }
        }
    }

    public final T e() {
        synchronized (this.b) {
            T t = this.g;
            if (t != null) {
                return t;
            }
            cobp cobpVar = null;
            try {
                cobpVar = cobp.a(this.a, cobp.d, this.c);
            } catch (cobl unused) {
                String format = String.format("%s.%s", "com.google.android.gms.vision", this.d);
                try {
                    cobpVar = cobp.a(this.a, cobp.a, format);
                } catch (cobl e) {
                    Object[] objArr = {format};
                    if (Log.isLoggable("Vision", 6)) {
                        String format2 = String.format("Error loading optional module %s", objArr);
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(format2).length() + 2 + String.valueOf(valueOf).length());
                        sb.append(format2);
                        sb.append(": ");
                        sb.append(valueOf);
                        sb.toString();
                    }
                    if (!this.e) {
                        String str = this.d;
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", str);
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.a.sendBroadcast(intent);
                        this.e = true;
                    }
                }
            }
            if (cobpVar != null) {
                try {
                    this.g = b(cobpVar, this.a);
                } catch (RemoteException | cobl unused2) {
                }
            }
            if (!this.f && this.g == null) {
                this.f = true;
            }
            return this.g;
        }
    }
}

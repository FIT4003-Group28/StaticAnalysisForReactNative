package c.e.a.b.d.g;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f2 implements a2 {

    /* renamed from: c  reason: collision with root package name */
    private static f2 f4146c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f4147a;

    /* renamed from: b  reason: collision with root package name */
    private final ContentObserver f4148b;

    private f2() {
        this.f4147a = null;
        this.f4148b = null;
    }

    private f2(Context context) {
        this.f4147a = context;
        this.f4148b = new h2(this, null);
        context.getContentResolver().registerContentObserver(v1.f4466a, true, this.f4148b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f2 a(Context context) {
        f2 f2Var;
        synchronized (f2.class) {
            if (f4146c == null) {
                f4146c = a.g.e.e.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new f2(context) : new f2();
            }
            f2Var = f4146c;
        }
        return f2Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a() {
        synchronized (f2.class) {
            if (f4146c != null && f4146c.f4147a != null && f4146c.f4148b != null) {
                f4146c.f4147a.getContentResolver().unregisterContentObserver(f4146c.f4148b);
            }
            f4146c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // c.e.a.b.d.g.a2
    /* renamed from: c */
    public final String a(final String str) {
        if (this.f4147a == null) {
            return null;
        }
        try {
            return (String) d2.a(new c2(this, str) { // from class: c.e.a.b.d.g.e2

                /* renamed from: a  reason: collision with root package name */
                private final f2 f4118a;

                /* renamed from: b  reason: collision with root package name */
                private final String f4119b;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f4118a = this;
                    this.f4119b = str;
                }

                @Override // c.e.a.b.d.g.c2
                public final Object f() {
                    return this.f4118a.b(this.f4119b);
                }
            });
        } catch (IllegalStateException | SecurityException e2) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String b(String str) {
        return v1.a(this.f4147a.getContentResolver(), str, (String) null);
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: cpxu  reason: default package */
/* loaded from: classes5.dex */
public final class cpxu {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public dbsg<Activity> b = dbpy.a;
    public dbsg<cpxt> c = dbpy.a;
    public final dbsg<cpxt> d = dbpy.a;
    public dbsg<Integer> e = dbpy.a;
    public dbsg<Integer> f = dbpy.a;
    private final Context g;

    public cpxu(Context context) {
        this.g = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int d(boolean z) {
        return z ? 4866 : 768;
    }

    public final void a() {
        this.c.a();
        if (!this.c.a()) {
            return;
        }
        if (c()) {
            this.c.b().f();
            this.c.b().h();
        }
        this.c.b().d();
        this.c.b().g();
    }

    public final void b() {
        a();
        this.f = dbpy.a;
        this.e = dbpy.a;
        this.a.set(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return Build.VERSION.SDK_INT >= 22 && !cpym.a.contains(this.g.getPackageName());
    }
}

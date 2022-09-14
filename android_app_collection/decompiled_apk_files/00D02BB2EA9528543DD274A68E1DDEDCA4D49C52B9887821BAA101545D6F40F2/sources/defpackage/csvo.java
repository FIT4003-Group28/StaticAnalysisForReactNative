package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: csvo  reason: default package */
/* loaded from: classes5.dex */
public final class csvo {
    private static csvo c;
    public final cswe a;
    public final dbsg b = dbpy.a;
    private final Context d;

    private csvo(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.a = cswe.a(applicationContext);
    }

    public static synchronized csvo a(Context context) {
        synchronized (csvo.class) {
            csvo csvoVar = c;
            if (csvoVar != null) {
                return csvoVar;
            }
            csvo csvoVar2 = new csvo(context);
            c = csvoVar2;
            return csvoVar2;
        }
    }

    public static final boolean u(cxju<Boolean> cxjuVar) {
        return cxjuVar.f().booleanValue();
    }

    public static final boolean v(boolean z) {
        return z;
    }

    public final boolean b() {
        return v(dxzy.d());
    }

    public final boolean c() {
        return v(dxzy.c());
    }

    public final boolean d() {
        return v(dxzy.a.a().g());
    }

    public final boolean e() {
        return v(dxzy.o());
    }

    public final boolean f() {
        return v(dxzy.n());
    }

    public final boolean g() {
        return v(dxzp.b());
    }

    public final boolean h() {
        return v(dxzy.a.a().d());
    }

    public final boolean i() {
        return v(dxzy.p());
    }

    public final boolean j() {
        return v(dxzy.q());
    }

    public final boolean k() {
        return v(dxzy.r());
    }

    public final boolean l() {
        return v(dxzy.s());
    }

    public final boolean m() {
        return v(dxzy.k());
    }

    public final boolean n() {
        return v(dxzy.l());
    }

    public final boolean o() {
        return v(dxzy.g());
    }

    public final boolean p() {
        return v(dxzy.i());
    }

    public final boolean q() {
        return v(dxzy.a.a().D());
    }

    public final boolean r() {
        return v(dxzy.t());
    }

    public final boolean s() {
        return v(dxzy.a.a().P());
    }

    public final boolean t() {
        return v(dxzy.a.a().Q());
    }
}

package defpackage;

import com.google.android.apps.maps.R;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajsj  reason: default package */
/* loaded from: classes2.dex */
public final class ajsj {
    public final Executor a;
    public final Executor b;
    private final dxio<akfa> c;
    private final dxio<bwqv> d;
    private final dxio<afei> e;

    public ajsj(dxio<akfa> dxioVar, dxio<bwqv> dxioVar2, Executor executor, Executor executor2, dxio<afei> dxioVar3) {
        this.c = dxioVar;
        this.d = dxioVar2;
        this.a = executor;
        this.b = executor2;
        this.e = dxioVar3;
    }

    public static boolean k(@dzsi btlu btluVar) {
        return btluVar != null && btluVar.f == btlt.GOOGLE;
    }

    public final btlu a() {
        btlu j = this.c.a().j();
        dbsk.t(j, "Account should not be null");
        btlt i = btlu.i(j);
        dbsk.p(i == btlt.GOOGLE, "Account type should be GOOGLE, but it is of type %s", i);
        return j;
    }

    @dzsi
    public final btlu b() {
        btlu j = this.c.a().j();
        if (k(j)) {
            return j;
        }
        return null;
    }

    @dzsi
    public final btlu c() {
        btlu k = this.c.a().k();
        if (k(k)) {
            return k;
        }
        return null;
    }

    public final dbsg<btlu> d() {
        return dbsg.j(b());
    }

    public final boolean e() {
        return this.e.a().a();
    }

    public final boolean f() {
        return e() || this.c.a().d();
    }

    public final Set<btlu> g() {
        if (f()) {
            return dcmr.a;
        }
        return dcep.K(this.c.a().t());
    }

    public final dbsg<btlu> h(String str) {
        return this.c.a().d() ? dbpy.a : dbsg.j(this.c.a().n(str));
    }

    public final boolean i() {
        btlu j = this.c.a().j();
        return j != null && j.f == btlt.GOOGLE;
    }

    public final void j(@dzsi btlu btluVar, gga ggaVar) {
        if (btlu.i(btluVar) == btlt.SIGNED_OUT) {
            ggaVar.D(akef.i(this.d.a(), new ajsi(), R.string.LOCATION_SHARING_LOGIN_PROMPT_TITLE, R.string.LOCATION_SHARING_LOGIN_PROMPT_BODY));
        }
    }
}
